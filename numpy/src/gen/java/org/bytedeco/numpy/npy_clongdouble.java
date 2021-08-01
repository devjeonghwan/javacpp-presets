// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;

// #endif
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class npy_clongdouble extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public npy_clongdouble() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public npy_clongdouble(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public npy_clongdouble(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public npy_clongdouble position(long position) {
        return (npy_clongdouble)super.position(position);
    }
    @Override public npy_clongdouble getPointer(long i) {
        return new npy_clongdouble((Pointer)this).offsetAddress(i);
    }
 public native @Cast("npy_longdouble") double real(); public native npy_clongdouble real(double setter);
public native @Cast("npy_longdouble") double imag(); public native npy_clongdouble imag(double setter); }
