// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Quantized Batch normalization.
 * 
 *  This op is deprecated and will be removed in the future. Prefer
 *  {@code tf.nn.batch_normalization}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * t: A 4D input Tensor.
 *  * t_min: The value represented by the lowest quantized input.
 *  * t_max: The value represented by the highest quantized input.
 *  * m: A 1D mean Tensor with size matching the last dimension of t.
 *  This is the first output from tf.nn.moments,
 *  or a saved moving average thereof.
 *  * m_min: The value represented by the lowest quantized mean.
 *  * m_max: The value represented by the highest quantized mean.
 *  * v: A 1D variance Tensor with size matching the last dimension of t.
 *  This is the second output from tf.nn.moments,
 *  or a saved moving average thereof.
 *  * v_min: The value represented by the lowest quantized variance.
 *  * v_max: The value represented by the highest quantized variance.
 *  * beta: A 1D beta Tensor with size matching the last dimension of t.
 *  An offset to be added to the normalized tensor.
 *  * beta_min: The value represented by the lowest quantized offset.
 *  * beta_max: The value represented by the highest quantized offset.
 *  * gamma: A 1D gamma Tensor with size matching the last dimension of t.
 *  If "scale_after_normalization" is true, this tensor will be multiplied
 *  with the normalized tensor.
 *  * gamma_min: The value represented by the lowest quantized gamma.
 *  * gamma_max: The value represented by the highest quantized gamma.
 *  * variance_epsilon: A small float number to avoid dividing by 0.
 *  * scale_after_normalization: A bool indicating whether the resulted tensor
 *  needs to be multiplied with gamma.
 * 
 *  Returns:
 *  * {@code Output} result
 *  * {@code Output} result_min
 *  * {@code Output} result_max */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedBatchNormWithGlobalNormalization extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedBatchNormWithGlobalNormalization(Pointer p) { super(p); }

  public QuantizedBatchNormWithGlobalNormalization(@Const @ByRef Scope scope,
                                            @ByVal Input t,
                                            @ByVal Input t_min,
                                            @ByVal Input t_max,
                                            @ByVal Input m,
                                            @ByVal Input m_min,
                                            @ByVal Input m_max,
                                            @ByVal Input v,
                                            @ByVal Input v_min,
                                            @ByVal Input v_max,
                                            @ByVal Input beta,
                                            @ByVal Input beta_min,
                                            @ByVal Input beta_max,
                                            @ByVal Input gamma,
                                            @ByVal Input gamma_min,
                                            @ByVal Input gamma_max,
                                            @Cast("tensorflow::DataType") int out_type, float variance_epsilon, @Cast("bool") boolean scale_after_normalization) { super((Pointer)null); allocate(scope, t, t_min, t_max, m, m_min, m_max, v, v_min, v_max, beta, beta_min, beta_max, gamma, gamma_min, gamma_max, out_type, variance_epsilon, scale_after_normalization); }
  private native void allocate(@Const @ByRef Scope scope,
                                            @ByVal Input t,
                                            @ByVal Input t_min,
                                            @ByVal Input t_max,
                                            @ByVal Input m,
                                            @ByVal Input m_min,
                                            @ByVal Input m_max,
                                            @ByVal Input v,
                                            @ByVal Input v_min,
                                            @ByVal Input v_max,
                                            @ByVal Input beta,
                                            @ByVal Input beta_min,
                                            @ByVal Input beta_max,
                                            @ByVal Input gamma,
                                            @ByVal Input gamma_min,
                                            @ByVal Input gamma_max,
                                            @Cast("tensorflow::DataType") int out_type, float variance_epsilon, @Cast("bool") boolean scale_after_normalization);

  public native @ByRef Operation operation(); public native QuantizedBatchNormWithGlobalNormalization operation(Operation setter);
  public native @ByRef Output result(); public native QuantizedBatchNormWithGlobalNormalization result(Output setter);
  public native @ByRef Output result_min(); public native QuantizedBatchNormWithGlobalNormalization result_min(Output setter);
  public native @ByRef Output result_max(); public native QuantizedBatchNormWithGlobalNormalization result_max(Output setter);
}
