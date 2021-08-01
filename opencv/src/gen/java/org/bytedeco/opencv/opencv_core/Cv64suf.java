// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Cv64suf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Cv64suf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Cv64suf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Cv64suf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Cv64suf position(long position) {
        return (Cv64suf)super.position(position);
    }
    @Override public Cv64suf getPointer(long i) {
        return new Cv64suf((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64") long i(); public native Cv64suf i(long setter);
    public native @Cast("uint64") int u(); public native Cv64suf u(int setter);
    public native double f(); public native Cv64suf f(double setter);
}
