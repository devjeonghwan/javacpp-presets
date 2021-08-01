// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Gradient for batch normalization.
 * 
 *  Note that the size of 4D Tensors are defined by either "NHWC" or "NCHW".
 *  The size of 1D Tensors matches the dimension C of the 4D Tensors.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * y_backprop: A 4D Tensor for the gradient with respect to y.
 *  * x: A 4D Tensor for input data.
 *  * scale: A 1D Tensor for scaling factor, to scale the normalized x.
 *  * reserve_space_1: When is_training is True, a 1D Tensor for the computed batch
 *  mean to be reused in gradient computation. When is_training is
 *  False, a 1D Tensor for the population mean to be reused in both
 *  1st and 2nd order gradient computation.
 *  * reserve_space_2: When is_training is True, a 1D Tensor for the computed batch
 *  variance (inverted variance in the cuDNN case) to be reused in
 *  gradient computation. When is_training is False, a 1D Tensor
 *  for the population variance to be reused in both 1st and 2nd
 *  order gradient computation.
 *  * reserve_space_3: When is_training is True, a 1D Tensor for some intermediate results to be reused
 *  in gradient computation. When is_training is False, a dummy empty Tensor will be
 *  created.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * epsilon: A small float number added to the variance of x.
 *  * data_format: The data format for y_backprop, x, x_backprop.
 *  Either "NHWC" (default) or "NCHW".
 *  * is_training: A bool value to indicate the operation is for training (default)
 *  or inference.
 * 
 *  Returns:
 *  * {@code Output} x_backprop: A 4D Tensor for the gradient with respect to x.
 *  * {@code Output} scale_backprop: A 1D Tensor for the gradient with respect to scale.
 *  * {@code Output} offset_backprop: A 1D Tensor for the gradient with respect to offset.
 *  * {@code Output} reserve_space_4: Unused placeholder to match the mean input in FusedBatchNorm.
 *  * {@code Output} reserve_space_5: Unused placeholder to match the variance input
 *  in FusedBatchNorm. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FusedBatchNormGradV3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FusedBatchNormGradV3(Pointer p) { super(p); }

  /** Optional attribute setters for FusedBatchNormGradV3 */
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
  
    /** A small float number added to the variance of x.
     * 
     *  Defaults to 0.0001 */
    
    ///
    public native @ByVal Attrs Epsilon(float x);

    /** The data format for y_backprop, x, x_backprop.
     *  Either "NHWC" (default) or "NCHW".
     * 
     *  Defaults to "NHWC" */
    
    ///
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    /** A bool value to indicate the operation is for training (default)
     *  or inference.
     * 
     *  Defaults to true */
    public native @ByVal Attrs IsTraining(@Cast("bool") boolean x);

    public native float epsilon_(); public native Attrs epsilon_(float setter);
    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
    public native @Cast("bool") boolean is_training_(); public native Attrs is_training_(boolean setter);
  }
  public FusedBatchNormGradV3(@Const @ByRef Scope scope, @ByVal Input y_backprop, @ByVal Input x, @ByVal Input scale, @ByVal Input reserve_space_1,
                       @ByVal Input reserve_space_2, @ByVal Input reserve_space_3) { super((Pointer)null); allocate(scope, y_backprop, x, scale, reserve_space_1, reserve_space_2, reserve_space_3); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input y_backprop, @ByVal Input x, @ByVal Input scale, @ByVal Input reserve_space_1,
                       @ByVal Input reserve_space_2, @ByVal Input reserve_space_3);
  public FusedBatchNormGradV3(@Const @ByRef Scope scope, @ByVal Input y_backprop, @ByVal Input x, @ByVal Input scale, @ByVal Input reserve_space_1,
                       @ByVal Input reserve_space_2, @ByVal Input reserve_space_3, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, y_backprop, x, scale, reserve_space_1, reserve_space_2, reserve_space_3, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input y_backprop, @ByVal Input x, @ByVal Input scale, @ByVal Input reserve_space_1,
                       @ByVal Input reserve_space_2, @ByVal Input reserve_space_3, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Epsilon(float x);
  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);
  public static native @ByVal Attrs IsTraining(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native FusedBatchNormGradV3 operation(Operation setter);
  public native @ByRef Output x_backprop(); public native FusedBatchNormGradV3 x_backprop(Output setter);
  public native @ByRef Output scale_backprop(); public native FusedBatchNormGradV3 scale_backprop(Output setter);
  public native @ByRef Output offset_backprop(); public native FusedBatchNormGradV3 offset_backprop(Output setter);
  public native @ByRef Output reserve_space_4(); public native FusedBatchNormGradV3 reserve_space_4(Output setter);
  public native @ByRef Output reserve_space_5(); public native FusedBatchNormGradV3 reserve_space_5(Output setter);
}
