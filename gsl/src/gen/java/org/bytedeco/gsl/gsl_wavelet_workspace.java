// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_wavelet_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_wavelet_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_wavelet_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_wavelet_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_wavelet_workspace position(long position) {
        return (gsl_wavelet_workspace)super.position(position);
    }
    @Override public gsl_wavelet_workspace getPointer(long i) {
        return new gsl_wavelet_workspace((Pointer)this).offsetAddress(i);
    }

  public native DoublePointer scratch(); public native gsl_wavelet_workspace scratch(DoublePointer setter);
  public native @Cast("size_t") long n(); public native gsl_wavelet_workspace n(long setter);
}
