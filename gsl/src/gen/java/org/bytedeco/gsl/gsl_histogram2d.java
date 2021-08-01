// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

 @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_histogram2d extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_histogram2d() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_histogram2d(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_histogram2d(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_histogram2d position(long position) {
        return (gsl_histogram2d)super.position(position);
    }
    @Override public gsl_histogram2d getPointer(long i) {
        return new gsl_histogram2d((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long nx(); public native gsl_histogram2d nx(long setter);
  public native @Cast("size_t") long ny(); public native gsl_histogram2d ny(long setter);
  public native DoublePointer xrange(); public native gsl_histogram2d xrange(DoublePointer setter);
  public native DoublePointer yrange(); public native gsl_histogram2d yrange(DoublePointer setter);
  public native DoublePointer bin(); public native gsl_histogram2d bin(DoublePointer setter);
} 
