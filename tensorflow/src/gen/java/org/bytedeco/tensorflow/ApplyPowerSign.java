// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update '*var' according to the AddSign update.
 * 
 *  m_t <- beta1 * m_{t-1} + (1 - beta1) * g
 *  update <- exp(logbase * sign_decay * sign(g) * sign(m_t)) * g
 *  variable <- variable - lr_t * update
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * var: Should be from a Variable().
 *  * m: Should be from a Variable().
 *  * lr: Scaling factor. Must be a scalar.
 *  * logbase: Must be a scalar.
 *  * sign_decay: Must be a scalar.
 *  * beta: Must be a scalar.
 *  * grad: The gradient.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If {@code True}, updating of the var and m tensors is
 *  protected by a lock; otherwise the behavior is undefined, but may exhibit less
 *  contention.
 * 
 *  Returns:
 *  * {@code Output}: Same as "var". */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApplyPowerSign extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApplyPowerSign(Pointer p) { super(p); }

  /** Optional attribute setters for ApplyPowerSign */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** If {@code True}, updating of the var and m tensors is
     *  protected by a lock; otherwise the behavior is undefined, but may exhibit less
     *  contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ApplyPowerSign(@Const @ByRef Scope scope, @ByVal Input var,
                 @ByVal Input m, @ByVal Input lr,
                 @ByVal Input logbase, @ByVal Input sign_decay,
                 @ByVal Input beta, @ByVal Input grad) { super((Pointer)null); allocate(scope, var, m, lr, logbase, sign_decay, beta, grad); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
                 @ByVal Input m, @ByVal Input lr,
                 @ByVal Input logbase, @ByVal Input sign_decay,
                 @ByVal Input beta, @ByVal Input grad);
  public ApplyPowerSign(@Const @ByRef Scope scope, @ByVal Input var,
                 @ByVal Input m, @ByVal Input lr,
                 @ByVal Input logbase, @ByVal Input sign_decay,
                 @ByVal Input beta, @ByVal Input grad, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, var, m, lr, logbase, sign_decay, beta, grad, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input var,
                 @ByVal Input m, @ByVal Input lr,
                 @ByVal Input logbase, @ByVal Input sign_decay,
                 @ByVal Input beta, @ByVal Input grad, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ApplyPowerSign operation(Operation setter);
  public native @ByRef Output out(); public native ApplyPowerSign out(Output setter);
}
