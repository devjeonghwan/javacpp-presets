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
public class gsl_vector_ulong extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_vector_ulong() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_vector_ulong(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_vector_ulong(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_vector_ulong position(long position) {
        return (gsl_vector_ulong)super.position(position);
    }
    @Override public gsl_vector_ulong getPointer(long i) {
        return new gsl_vector_ulong((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_vector_ulong size(long setter);
  public native @Cast("size_t") long stride(); public native gsl_vector_ulong stride(long setter);
  public native @Cast("unsigned long*") CLongPointer data(); public native gsl_vector_ulong data(CLongPointer setter);
  public native gsl_block_ulong block(); public native gsl_vector_ulong block(gsl_block_ulong setter);
  public native int owner(); public native gsl_vector_ulong owner(int setter);
}
