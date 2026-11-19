import json
import os
from pathlib import Path
import shutil
import subprocess
import sys
import time

sys.stdout.reconfigure(encoding='utf-8', errors='replace')
repository = Path(__file__).resolve().parents[2]
log_directory = repository / '.ci-logs'
log_directory.mkdir(exist_ok=True)
windows = os.name == 'nt'
cache_executable = shutil.which('ccache.exe' if windows else 'ccache')
maven_executable = shutil.which('mvn.cmd' if windows else 'mvn')
platform = os.environ['CI_DEPLOY_PLATFORM']
results = {}


def run_command(name, command):
    print('::group::' + name, flush=True)
    print(subprocess.list2cmdline(command), flush=True)
    started = time.monotonic()
    with (log_directory / (name + '.log')).open('w', encoding='utf-8') as output:
        process = subprocess.Popen(command, cwd=repository, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True, encoding='utf-8', errors='replace')
        for line in process.stdout:
            print(line, end='', flush=True)
            output.write(line)
            output.flush()
        return_code = process.wait()
    results[name] = {'exit_code': return_code, 'seconds': round(time.monotonic() - started, 2)}
    (log_directory / 'results.json').write_text(json.dumps(results, indent=2), encoding='utf-8')
    print('::endgroup::', flush=True)
    return return_code


try:
    run_command('cache-configuration', [cache_executable, '--show-config'])
    run_command('cache-before-probe', [cache_executable, '--show-stats', '--verbose'])
    cuda_directory = Path(os.environ.get('CUDA_PATH', '/usr/local/cuda'))
    cuda_compiler = str(cuda_directory / 'bin' / ('nvcc.exe' if windows else 'nvcc'))
    probe_source = log_directory / 'cache-probe.cu'
    probe_source.write_text('extern "C" __global__ void cache_probe(float* values) { values[threadIdx.x] *= 2.0f; }\n', encoding='utf-8')
    probe_command = [cache_executable, cuda_compiler, '-c', str(probe_source), '-o', str(log_directory / ('cache-probe.obj' if windows else 'cache-probe.o'))]
    if windows:
        probe_command.append('--use-local-env')
    for architecture in ('75', '80', '90', '100', '120'):
        probe_command.extend(['-gencode', 'arch=compute_' + architecture + ',code=sm_' + architecture])
    for name in ('probe-first', 'probe-repeat'):
        if run_command(name, probe_command):
            sys.exit(1)
        run_command(name + '-stats', [cache_executable, '--show-stats', '--verbose'])
    options = ['-B', '-U', '-e', '-ntp', '-N', '-Djavacpp.platform=' + platform, '-Djavacpp.platform.extension=-gpu', '-Dhttp.keepAlive=false', '-Dmaven.wagon.http.pool=false', '-Dmaven.wagon.http.retryHandler.count=3']
    if run_command('parent', [maven_executable, *options, '-f', 'pom.xml', 'install']):
        sys.exit(1)
    if windows:
        options.append('-Djavacpp.parser.skip')
    sys.exit(run_command('pytorch-gpu', [maven_executable, *options, '-f', 'pytorch/pom.xml', 'install']))
finally:
    run_command('cache-after-build', [cache_executable, '--show-stats', '--verbose'])
    build_directory = repository / 'pytorch' / 'cppbuild' / (platform + '-gpu') / 'pytorch' / 'build'
    for name in ('CMakeCache.txt', 'build.ninja'):
        source = build_directory / name
        if source.is_file():
            shutil.copyfile(source, log_directory / name)
    ninja_executable = shutil.which('ninja.exe' if windows else 'ninja')
    if ninja_executable and (build_directory / 'build.ninja').is_file():
        commands = subprocess.run([ninja_executable, '-C', str(build_directory), '-t', 'commands'], capture_output=True, text=True, encoding='utf-8', errors='replace')
        cuda_commands = [line for line in commands.stdout.splitlines() if 'nvcc' in line.lower()]
        (log_directory / 'cuda-commands.txt').write_text('\n'.join(cuda_commands[:10]), encoding='utf-8')
