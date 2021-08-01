// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_colorspace_primaries_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_colorspace_primaries_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_colorspace_primaries_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_colorspace_primaries_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_colorspace_primaries_t position(long position) {
        return (sk_colorspace_primaries_t)super.position(position);
    }
    @Override public sk_colorspace_primaries_t getPointer(long i) {
        return new sk_colorspace_primaries_t((Pointer)this).offsetAddress(i);
    }

    public native float fRX(); public native sk_colorspace_primaries_t fRX(float setter);
    public native float fRY(); public native sk_colorspace_primaries_t fRY(float setter);
    public native float fGX(); public native sk_colorspace_primaries_t fGX(float setter);
    public native float fGY(); public native sk_colorspace_primaries_t fGY(float setter);
    public native float fBX(); public native sk_colorspace_primaries_t fBX(float setter);
    public native float fBY(); public native sk_colorspace_primaries_t fBY(float setter);
    public native float fWX(); public native sk_colorspace_primaries_t fWX(float setter);
    public native float fWY(); public native sk_colorspace_primaries_t fWY(float setter);
}
