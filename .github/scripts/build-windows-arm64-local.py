import argparse
import json
import os
from pathlib import Path
import shutil
import subprocess
import sys
import time
import xml.etree.ElementTree as element_tree

sys.stdout.reconfigure(encoding="utf-8", errors="replace")
sys.stderr.reconfigure(encoding="utf-8", errors="replace")

argument_parser = argparse.ArgumentParser()
argument_parser.add_argument('--plan', action='store_true')
argument_parser.add_argument('--scope', choices=['pytorch'], default=os.environ.get('CI_LOCAL_BUILD_SCOPE', 'pytorch'))
arguments = argument_parser.parse_args()
repository = Path(__file__).resolve().parents[2]
namespace = {'maven': 'http://maven.apache.org/POM/4.0.0'}
module_dependencies = {'pytorch': []}
parent_version = element_tree.parse(repository / 'pom.xml').getroot().findtext('maven:version', namespaces=namespace)
module_versions = {
    module_name: element_tree.parse(repository / module_name / 'pom.xml').getroot().findtext('maven:version', namespaces=namespace)
    for module_name in module_dependencies
}
if arguments.plan:
    print(json.dumps({'modules': module_dependencies, 'versions': module_versions, 'extra_variant': 'ffmpeg-gpl' if 'ffmpeg' in module_dependencies else None, 'local_repository': '.ci-maven', 'phase': 'install'}, indent=2))
    sys.exit(0)

if os.environ.get('CI_DEPLOY_PLATFORM') != 'windows-arm64':
    sys.exit('This script requires the Windows ARM64 build environment.')
maven_executable = shutil.which('mvn.cmd')
if not maven_executable:
    sys.exit('mvn.cmd was not found.')
log_directory = repository / '.ci-logs'
log_directory.mkdir(exist_ok=True)
local_repository = repository / '.ci-maven'
summary_path = Path(os.environ.get('GITHUB_STEP_SUMMARY', log_directory / 'summary.md'))
summary_path.write_text('| Build | Result | Seconds |\n| --- | --- | ---: |\n', encoding='utf-8')
results = {}

maven_options = [
    '-B', '-e', '-ntp', '-N', '-U',
    '-Djavacpp.platform=windows-arm64',
    '-Dmaven.repo.local=' + str(local_repository),
    '-Dhttp.keepAlive=false',
    '-Dmaven.wagon.http.pool=false',
    '-Dmaven.wagon.http.retryHandler.count=3',
]


def install_project(project_path, build_name, extra_options=None, expected_artifacts=None):
    command = [maven_executable, *maven_options, *(extra_options or []), '-f', str(project_path), 'install']
    print('::group::' + build_name, flush=True)
    print(subprocess.list2cmdline(command), flush=True)
    started = time.monotonic()
    results[build_name] = 'running'
    (log_directory / 'results.json').write_text(json.dumps(results, indent=2), encoding='utf-8')
    with (log_directory / (build_name + '.log')).open('w', encoding='utf-8') as log_file:
        process = subprocess.Popen(command, cwd=repository, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True, encoding='utf-8', errors='replace')
        for line in process.stdout:
            print(line, end='', flush=True)
            log_file.write(line)
            log_file.flush()
        succeeded = process.wait() == 0
        for artifact in expected_artifacts or []:
            if succeeded and not artifact.is_file():
                message = 'Expected local artifact is missing: ' + str(artifact)
                print(message, flush=True)
                log_file.write(message + '\n')
                succeeded = False
    results[build_name] = 'passed' if succeeded else 'failed'
    elapsed = round(time.monotonic() - started)
    with summary_path.open('a', encoding='utf-8') as summary:
        summary.write(f'| {build_name} | {results[build_name]} | {elapsed} |\n')
    (log_directory / 'results.json').write_text(json.dumps(results, indent=2), encoding='utf-8')
    print('::endgroup::', flush=True)
    return succeeded


(log_directory / 'revision.txt').write_text(os.environ['GITHUB_SHA'], encoding='utf-8')
if not install_project(repository / 'pom.xml', 'parent'):
    sys.exit(1)
for module_name, dependencies in module_dependencies.items():
    unavailable = [dependency for dependency in dependencies if results.get(dependency + '-platform') != 'passed']
    if unavailable:
        results[module_name] = 'blocked by ' + ', '.join(unavailable)
        with summary_path.open('a', encoding='utf-8') as summary:
            summary.write(f'| {module_name} | {results[module_name]} | 0 |\n')
        (log_directory / 'results.json').write_text(json.dumps(results, indent=2), encoding='utf-8')
        continue
    version = module_versions[module_name].replace('${project.parent.version}', parent_version)
    artifact_directory = local_repository / 'org/bytedeco' / module_name / version
    expected_artifacts = [artifact_directory / f'{module_name}-{version}.jar', artifact_directory / f'{module_name}-{version}-windows-arm64.jar']
    if install_project(repository / module_name / 'pom.xml', module_name, expected_artifacts=expected_artifacts):
        install_project(repository / module_name / 'platform/pom.xml', module_name + '-platform')
    if module_name == 'ffmpeg':
        install_project(repository / module_name / 'pom.xml', 'ffmpeg-gpl', ['-Djavacpp.platform.extension=-gpl'], [artifact_directory / f'{module_name}-{version}-windows-arm64-gpl.jar'])

sys.exit(0 if all(result == 'passed' for result in results.values()) else 1)
