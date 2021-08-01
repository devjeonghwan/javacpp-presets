// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief  Custom array allocator
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatAllocator(Pointer p) { super(p); }


    // let's comment it off for now to detect and fix all the uses of allocator
    //virtual void allocate(int dims, const int* sizes, int type, int*& refcount,
    //                      uchar*& datastart, uchar*& data, size_t* step) = 0;
    //virtual void deallocate(int* refcount, uchar* datastart, uchar* data) = 0;
    public native @Name("allocate") UMatData _allocate(int dims, @Const IntPointer sizes, int type,
                                   Pointer data, @Cast("size_t*") SizeTPointer step, @Cast("cv::AccessFlag") int flags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Name("allocate") UMatData _allocate(int dims, @Const IntBuffer sizes, int type,
                                   Pointer data, @Cast("size_t*") SizeTPointer step, @Cast("cv::AccessFlag") int flags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Name("allocate") UMatData _allocate(int dims, @Const int[] sizes, int type,
                                   Pointer data, @Cast("size_t*") SizeTPointer step, @Cast("cv::AccessFlag") int flags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Cast("bool") @Name("allocate") boolean _allocate(UMatData data, @Cast("cv::AccessFlag") int accessflags, @Cast("cv::UMatUsageFlags") int usageFlags);
    public native @Name("deallocate") void _deallocate(UMatData data);
    public native void map(UMatData data, @Cast("cv::AccessFlag") int accessflags);
    public native void unmap(UMatData data);
    public native void download(UMatData data, Pointer dst, int dims, @Cast("const size_t*") SizeTPointer sz,
                              @Cast("const size_t*") SizeTPointer srcofs, @Cast("const size_t*") SizeTPointer srcstep,
                              @Cast("const size_t*") SizeTPointer dststep);
    public native void upload(UMatData data, @Const Pointer src, int dims, @Cast("const size_t*") SizeTPointer sz,
                            @Cast("const size_t*") SizeTPointer dstofs, @Cast("const size_t*") SizeTPointer dststep,
                            @Cast("const size_t*") SizeTPointer srcstep);
    public native void copy(UMatData srcdata, UMatData dstdata, int dims, @Cast("const size_t*") SizeTPointer sz,
                          @Cast("const size_t*") SizeTPointer srcofs, @Cast("const size_t*") SizeTPointer srcstep,
                          @Cast("const size_t*") SizeTPointer dstofs, @Cast("const size_t*") SizeTPointer dststep, @Cast("bool") boolean sync);

    // default implementation returns DummyBufferPoolController
    public native BufferPoolController getBufferPoolController(@Cast("const char*") BytePointer id/*=NULL*/);
    public native BufferPoolController getBufferPoolController();
    public native BufferPoolController getBufferPoolController(String id/*=NULL*/);
}
