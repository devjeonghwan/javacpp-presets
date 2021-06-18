// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LayerNorm ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies Layer Normalization over a mini-batch of inputs as described in
 *  the paper {@code Layer Normalization}_ .
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.LayerNorm to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LayerNormOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LayerNorm model(LayerNormOptions({2, 2}).elementwise_affine(false).eps(2e-5));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LayerNormImpl extends LayerNormImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerNormImpl(Pointer p) { super(p); }

  public LayerNormImpl(@ByVal @Cast("std::vector<int64_t>*") LongVector normalized_shape) { super((Pointer)null); allocate(normalized_shape); }
  @NoDeallocator private native void allocate(@ByVal @Cast("std::vector<int64_t>*") LongVector normalized_shape);
  public LayerNormImpl(@Const @ByRef LayerNormOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef LayerNormOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code LayerNorm} module into the given {@code stream}. */
  
  ///
  ///
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Applies layer normalization over a mini-batch of inputs as described in
   *  the paper {@code Layer Normalization}_ .
   * 
   *  The mean and standard-deviation are calculated separately over the last
   *  certain number dimensions which have to be of the shape specified by
   *  input {@code normalized_shape}.
   * 
   *  {@code Layer Normalization}: https://arxiv.org/abs/1607.06450 */
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options with which this module was constructed. */
  public native @ByRef LayerNormOptions options(); public native LayerNormImpl options(LayerNormOptions setter);

  /** The learned weight.
   *  Initialized to ones if the {@code elementwise_affine} option is set to {@code true} upon construction. */
  public native @ByRef Tensor weight(); public native LayerNormImpl weight(Tensor setter);

  /** The learned bias.
   *  Initialized to zeros {@code elementwise_affine} option is set to {@code true} upon construction. */
  public native @ByRef Tensor bias(); public native LayerNormImpl bias(Tensor setter);
}
