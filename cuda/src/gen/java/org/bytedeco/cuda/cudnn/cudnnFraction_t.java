// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;

import static org.bytedeco.cuda.global.cudnn.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnFraction_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudnnFraction_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudnnFraction_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnFraction_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudnnFraction_t position(long position) {
        return (cudnnFraction_t)super.position(position);
    }
    @Override public cudnnFraction_t getPointer(long i) {
        return new cudnnFraction_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64_t") long numerator(); public native cudnnFraction_t numerator(long setter);
    public native @Cast("int64_t") long denominator(); public native cudnnFraction_t denominator(long setter);
}
