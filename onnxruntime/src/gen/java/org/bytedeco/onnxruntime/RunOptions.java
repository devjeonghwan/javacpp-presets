// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class RunOptions extends BaseRunOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RunOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RunOptions position(long position) {
        return (RunOptions)super.position(position);
    }
    @Override public RunOptions getPointer(long i) {
        return new RunOptions((Pointer)this).offsetAddress(i);
    }

  public RunOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByRef RunOptions SetRunLogVerbosityLevel(int arg0);
  public native int GetRunLogVerbosityLevel();

  public native @ByRef RunOptions SetRunLogSeverityLevel(int arg0);
  

  public native @ByRef RunOptions SetRunTag(@Cast("const char*") BytePointer run_tag);
  public native @ByRef RunOptions SetRunTag(String run_tag);
  public native @Cast("const char*") BytePointer GetRunTag();

  public native @ByRef RunOptions AddConfigEntry(@Cast("const char*") BytePointer config_key, @Cast("const char*") BytePointer config_value);
  public native @ByRef RunOptions AddConfigEntry(String config_key, String config_value);

  // terminate ALL currently executing Session::Run calls that were made using this RunOptions instance
  public native @ByRef RunOptions SetTerminate();
  // unset the terminate flag so this RunOptions instance can be used in a new Session::Run call
  public native @ByRef RunOptions UnsetTerminate();
}
