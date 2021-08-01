// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* interpolation object type */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_interp_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_interp_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_interp_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_interp_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_interp_type position(long position) {
        return (gsl_interp_type)super.position(position);
    }
    @Override public gsl_interp_type getPointer(long i) {
        return new gsl_interp_type((Pointer)this).offsetAddress(i);
    }

  public native @Cast("const char*") BytePointer name(); public native gsl_interp_type name(BytePointer setter);
  public native @Cast("unsigned int") int min_size(); public native gsl_interp_type min_size(int setter);
  public static class Alloc_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Alloc_long(Pointer p) { super(p); }
      protected Alloc_long() { allocate(); }
      private native void allocate();
      public native Pointer call(@Cast("size_t") long size);
  }
  public native Alloc_long alloc(); public native gsl_interp_type alloc(Alloc_long setter);
  public static class Init_Pointer_DoublePointer_DoublePointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Init_Pointer_DoublePointer_DoublePointer_long(Pointer p) { super(p); }
      protected Init_Pointer_DoublePointer_DoublePointer_long() { allocate(); }
      private native void allocate();
      public native int call(Pointer arg0, @Const DoublePointer xa, @Const DoublePointer ya, @Cast("size_t") long size);
  }
  public native Init_Pointer_DoublePointer_DoublePointer_long init(); public native gsl_interp_type init(Init_Pointer_DoublePointer_DoublePointer_long setter);
  public static class Eval_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Eval_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer(Pointer p) { super(p); }
      protected Eval_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(@Const Pointer arg0, @Const DoublePointer xa, @Const DoublePointer ya, @Cast("size_t") long size, double x, gsl_interp_accel arg5, DoublePointer y);
  }
  public native Eval_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer eval(); public native gsl_interp_type eval(Eval_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer setter);
  public static class Eval_deriv_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Eval_deriv_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer(Pointer p) { super(p); }
      protected Eval_deriv_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(@Const Pointer arg0, @Const DoublePointer xa, @Const DoublePointer ya, @Cast("size_t") long size, double x, gsl_interp_accel arg5, DoublePointer y_p);
  }
  public native Eval_deriv_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer eval_deriv(); public native gsl_interp_type eval_deriv(Eval_deriv_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer setter);
  public static class Eval_deriv2_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Eval_deriv2_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer(Pointer p) { super(p); }
      protected Eval_deriv2_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(@Const Pointer arg0, @Const DoublePointer xa, @Const DoublePointer ya, @Cast("size_t") long size, double x, gsl_interp_accel arg5, DoublePointer y_pp);
  }
  public native Eval_deriv2_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer eval_deriv2(); public native gsl_interp_type eval_deriv2(Eval_deriv2_Pointer_DoublePointer_DoublePointer_long_double_gsl_interp_accel_DoublePointer setter);
  public static class Eval_integ_Pointer_DoublePointer_DoublePointer_long_gsl_interp_accel_double_double_DoublePointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Eval_integ_Pointer_DoublePointer_DoublePointer_long_gsl_interp_accel_double_double_DoublePointer(Pointer p) { super(p); }
      protected Eval_integ_Pointer_DoublePointer_DoublePointer_long_gsl_interp_accel_double_double_DoublePointer() { allocate(); }
      private native void allocate();
      public native int call(@Const Pointer arg0, @Const DoublePointer xa, @Const DoublePointer ya, @Cast("size_t") long size, gsl_interp_accel arg4, double a, double b, DoublePointer result);
  }
  public native Eval_integ_Pointer_DoublePointer_DoublePointer_long_gsl_interp_accel_double_double_DoublePointer eval_integ(); public native gsl_interp_type eval_integ(Eval_integ_Pointer_DoublePointer_DoublePointer_long_gsl_interp_accel_double_double_DoublePointer setter);
  public static class Free_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_Pointer(Pointer p) { super(p); }
      protected Free_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer arg0);
  }
  public native @Name("free") Free_Pointer _free(); public native gsl_interp_type _free(Free_Pointer setter);

}
