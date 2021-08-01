// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* Definition of an arbitrary differentiable real-valued function */
/* with gsl_vector input and parameters */
@Name("gsl_multimin_function_fdf_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multimin_function_fdf extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multimin_function_fdf() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multimin_function_fdf(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multimin_function_fdf(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multimin_function_fdf position(long position) {
        return (gsl_multimin_function_fdf)super.position(position);
    }
    @Override public gsl_multimin_function_fdf getPointer(long i) {
        return new gsl_multimin_function_fdf((Pointer)this).offsetAddress(i);
    }

  public static class F_gsl_vector_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    F_gsl_vector_Pointer(Pointer p) { super(p); }
      protected F_gsl_vector_Pointer() { allocate(); }
      private native void allocate();
      public native double call(@Const gsl_vector x, Pointer params);
  }
  public native F_gsl_vector_Pointer f(); public native gsl_multimin_function_fdf f(F_gsl_vector_Pointer setter);
  public static class Df_gsl_vector_Pointer_gsl_vector extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Df_gsl_vector_Pointer_gsl_vector(Pointer p) { super(p); }
      protected Df_gsl_vector_Pointer_gsl_vector() { allocate(); }
      private native void allocate();
      public native void call(@Const gsl_vector x, Pointer params,gsl_vector df);
  }
  public native Df_gsl_vector_Pointer_gsl_vector df(); public native gsl_multimin_function_fdf df(Df_gsl_vector_Pointer_gsl_vector setter);
  public static class Fdf_gsl_vector_Pointer_DoublePointer_gsl_vector extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Fdf_gsl_vector_Pointer_DoublePointer_gsl_vector(Pointer p) { super(p); }
      protected Fdf_gsl_vector_Pointer_DoublePointer_gsl_vector() { allocate(); }
      private native void allocate();
      public native void call(@Const gsl_vector x, Pointer params,DoublePointer f,gsl_vector df);
  }
  public native Fdf_gsl_vector_Pointer_DoublePointer_gsl_vector fdf(); public native gsl_multimin_function_fdf fdf(Fdf_gsl_vector_Pointer_DoublePointer_gsl_vector setter);
  public native @Cast("size_t") long n(); public native gsl_multimin_function_fdf n(long setter);
  public native Pointer params(); public native gsl_multimin_function_fdf params(Pointer setter);
}
