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


@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class AllocatorWithDefaultOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorWithDefaultOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorWithDefaultOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AllocatorWithDefaultOptions position(long position) {
        return (AllocatorWithDefaultOptions)super.position(position);
    }
    @Override public AllocatorWithDefaultOptions getPointer(long i) {
        return new AllocatorWithDefaultOptions((Pointer)this).offsetAddress(i);
    }

  public AllocatorWithDefaultOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Name("operator OrtAllocator*") OrtAllocator asOrtAllocator();

  public native Pointer Alloc(@Cast("size_t") long size);
  // The return value will own the allocation
  public native @ByVal MemoryAllocation GetAllocation(@Cast("size_t") long size);
  public native void Free(Pointer p);

  public native @Const OrtMemoryInfo GetInfo();
}
