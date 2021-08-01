// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class gr_vk_imageinfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gr_vk_imageinfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gr_vk_imageinfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gr_vk_imageinfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gr_vk_imageinfo_t position(long position) {
        return (gr_vk_imageinfo_t)super.position(position);
    }
    @Override public gr_vk_imageinfo_t getPointer(long i) {
        return new gr_vk_imageinfo_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint64_t") long fImage(); public native gr_vk_imageinfo_t fImage(long setter);
    public native @ByRef gr_vk_alloc_t fAlloc(); public native gr_vk_imageinfo_t fAlloc(gr_vk_alloc_t setter);
    public native @Cast("uint32_t") int fImageTiling(); public native gr_vk_imageinfo_t fImageTiling(int setter);
    public native @Cast("uint32_t") int fImageLayout(); public native gr_vk_imageinfo_t fImageLayout(int setter);
    public native @Cast("uint32_t") int fFormat(); public native gr_vk_imageinfo_t fFormat(int setter);
    public native @Cast("uint32_t") int fLevelCount(); public native gr_vk_imageinfo_t fLevelCount(int setter);
    public native @Cast("uint32_t") int fCurrentQueueFamily(); public native gr_vk_imageinfo_t fCurrentQueueFamily(int setter);
    public native @Cast("bool") boolean fProtected(); public native gr_vk_imageinfo_t fProtected(boolean setter);
    public native @ByRef gr_vk_ycbcrconversioninfo_t fYcbcrConversionInfo(); public native gr_vk_imageinfo_t fYcbcrConversionInfo(gr_vk_ycbcrconversioninfo_t setter);
}
