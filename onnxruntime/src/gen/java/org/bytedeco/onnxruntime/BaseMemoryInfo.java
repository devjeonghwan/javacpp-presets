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

@Name("Ort::Base<OrtMemoryInfo>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseMemoryInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseMemoryInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseMemoryInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseMemoryInfo position(long position) {
        return (BaseMemoryInfo)super.position(position);
    }
    @Override public BaseMemoryInfo getPointer(long i) {
        return new BaseMemoryInfo((Pointer)this).offsetAddress(i);
    }


  public BaseMemoryInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseMemoryInfo(OrtMemoryInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtMemoryInfo p);

  public native @Name("operator OrtMemoryInfo*") OrtMemoryInfo asOrtMemoryInfo();

  public native OrtMemoryInfo release();
}
