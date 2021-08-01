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
public class gsl_min_fminimizer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_min_fminimizer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_min_fminimizer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_min_fminimizer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_min_fminimizer position(long position) {
        return (gsl_min_fminimizer)super.position(position);
    }
    @Override public gsl_min_fminimizer getPointer(long i) {
        return new gsl_min_fminimizer((Pointer)this).offsetAddress(i);
    }

    public native @Const gsl_min_fminimizer_type type(); public native gsl_min_fminimizer type(gsl_min_fminimizer_type setter);
    public native gsl_function function(); public native gsl_min_fminimizer function(gsl_function setter);
    public native double x_minimum(); public native gsl_min_fminimizer x_minimum(double setter);
    public native double x_lower(); public native gsl_min_fminimizer x_lower(double setter);
    public native double x_upper(); public native gsl_min_fminimizer x_upper(double setter);
    public native double f_minimum(); public native gsl_min_fminimizer f_minimum(double setter);
    public native double f_lower(); public native gsl_min_fminimizer f_lower(double setter);
    public native double f_upper(); public native gsl_min_fminimizer f_upper(double setter);
    public native Pointer state(); public native gsl_min_fminimizer state(Pointer setter);
  }
