// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_codec_frameinfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_codec_frameinfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_codec_frameinfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_codec_frameinfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_codec_frameinfo_t position(long position) {
        return (sk_codec_frameinfo_t)super.position(position);
    }
    @Override public sk_codec_frameinfo_t getPointer(long i) {
        return new sk_codec_frameinfo_t((Pointer)this).offsetAddress(i);
    }

    public native int fRequiredFrame(); public native sk_codec_frameinfo_t fRequiredFrame(int setter);
    public native int fDuration(); public native sk_codec_frameinfo_t fDuration(int setter);
    public native @Cast("bool") boolean fFullyReceived(); public native sk_codec_frameinfo_t fFullyReceived(boolean setter);
    public native @Cast("sk_alphatype_t") int fAlphaType(); public native sk_codec_frameinfo_t fAlphaType(int setter);
    public native @Cast("sk_codecanimation_disposalmethod_t") int fDisposalMethod(); public native sk_codec_frameinfo_t fDisposalMethod(int setter);
}
