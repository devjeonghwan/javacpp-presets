// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA GPU kernel node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaKernelNodeParamsV2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaKernelNodeParamsV2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaKernelNodeParamsV2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaKernelNodeParamsV2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaKernelNodeParamsV2 position(long position) {
        return (cudaKernelNodeParamsV2)super.position(position);
    }
    @Override public cudaKernelNodeParamsV2 getPointer(long i) {
        return new cudaKernelNodeParamsV2((Pointer)this).offsetAddress(i);
    }

    /** Kernel to launch */
    public native Pointer func(); public native cudaKernelNodeParamsV2 func(Pointer setter);
//     #if !defined(__cplusplus) || __cplusplus >= 201103L
        /** Grid dimensions */
        public native @ByRef dim3 gridDim(); public native cudaKernelNodeParamsV2 gridDim(dim3 setter);
        /** Block dimensions */
        public native @ByRef dim3 blockDim(); public native cudaKernelNodeParamsV2 blockDim(dim3 setter);
//     #else
        /* Union members cannot have nontrivial constructors until C++11. */
//     #endif
    /** Dynamic shared-memory size per thread block in bytes */
    public native @Cast("unsigned int") int sharedMemBytes(); public native cudaKernelNodeParamsV2 sharedMemBytes(int setter);
    /** Array of pointers to individual kernel arguments*/
    public native Pointer kernelParams(int i); public native cudaKernelNodeParamsV2 kernelParams(int i, Pointer setter);
    public native @Cast("void**") PointerPointer kernelParams(); public native cudaKernelNodeParamsV2 kernelParams(PointerPointer setter);
    /** Pointer to kernel arguments in the "extra" format */
    public native Pointer extra(int i); public native cudaKernelNodeParamsV2 extra(int i, Pointer setter);
    public native @Cast("void**") PointerPointer extra(); public native cudaKernelNodeParamsV2 extra(PointerPointer setter);
}
