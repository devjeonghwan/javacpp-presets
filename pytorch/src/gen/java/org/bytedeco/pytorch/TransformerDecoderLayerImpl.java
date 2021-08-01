// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TransformerDecoderLayer ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** TransformerDecoderLayer is made up of self-attn, multi-head-attn and feedforward network.
 *  This standard decoder layer is based on the paper "Attention Is All You Need".
 *  Ashish Vaswani, Noam Shazeer, Niki Parmar, Jakob Uszkoreit, Llion Jones, Aidan N Gomez,
 *  Lukasz Kaiser, and Illia Polosukhin. 2017. Attention is all you need. In Advances in
 *  Neural Information Processing Systems, pages 6000-6010. Users may modify or implement
 *  in a different way during application.
 *  See https://pytorch.org/docs/master/nn.html#transformer-layers to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::TransformerDecoderLayerOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerDecoderLayer model(TransformerDecoderLayerOptions(512, 8).dropout(0.2));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerDecoderLayerImpl extends TransformerDecoderLayerImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerDecoderLayerImpl(Pointer p) { super(p); }

  public TransformerDecoderLayerImpl(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead) { super((Pointer)null); allocate(d_model, nhead); }
  @NoDeallocator private native void allocate(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead);
  public TransformerDecoderLayerImpl(@Const @ByRef TransformerDecoderLayerOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef TransformerDecoderLayerOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pass the inputs (and mask) through the decoder layer.
   * Args:
   *        tgt: the sequence to the decoder layer (required).
   *        memory: the sequence from the last layer of the encoder (required).
   *        tgt_mask: the mask for the tgt sequence (optional).
   *        memory_mask: the mask for the memory sequence (optional).
   *        tgt_key_padding_mask: the mask for the tgt keys per batch (optional).
   *        memory_key_padding_mask: the mask for the memory keys per batch (optional). */
  public native @ByVal Tensor forward(@ByVal Tensor tgt,
                   @Const @ByRef Tensor memory,
                   @Const @ByRef(nullValue = "at::Tensor{}") Tensor tgt_mask,
                   @Const @ByRef(nullValue = "at::Tensor{}") Tensor memory_mask,
                   @Const @ByRef(nullValue = "at::Tensor{}") Tensor tgt_key_padding_mask,
                   @Const @ByRef(nullValue = "at::Tensor{}") Tensor memory_key_padding_mask);
  public native @ByVal Tensor forward(@ByVal Tensor tgt,
                   @Const @ByRef Tensor memory);

  /** The options used to configure this module. */
  public native @ByRef TransformerDecoderLayerOptions options(); public native TransformerDecoderLayerImpl options(TransformerDecoderLayerOptions setter);

  /**self attention */
  public native @ByRef MultiheadAttention self_attn(); public native TransformerDecoderLayerImpl self_attn(MultiheadAttention setter);

  /**Dropout, post self attention */
  public native @ByRef Dropout dropout1(); public native TransformerDecoderLayerImpl dropout1(Dropout setter);

  /**Normalization, post self attention */
  public native @ByRef LayerNorm norm1(); public native TransformerDecoderLayerImpl norm1(LayerNorm setter);

  /**Multi-headed attention */
  public native @ByRef MultiheadAttention multihead_attn(); public native TransformerDecoderLayerImpl multihead_attn(MultiheadAttention setter);

  /**Dropout, post multi-headed attention */
  public native @ByRef Dropout dropout2(); public native TransformerDecoderLayerImpl dropout2(Dropout setter);

  /**Normalization, post multi-headed attention */
  public native @ByRef LayerNorm norm2(); public native TransformerDecoderLayerImpl norm2(LayerNorm setter);

  /**Feed forward first linear layer */
  public native @ByRef Linear linear1(); public native TransformerDecoderLayerImpl linear1(Linear setter);

  /**Feed forward dropout layer */
  public native @ByRef Dropout dropout(); public native TransformerDecoderLayerImpl dropout(Dropout setter);

  /**Feed forward second linear layer */
  public native @ByRef Linear linear2(); public native TransformerDecoderLayerImpl linear2(Linear setter);

  /**Dropout, post feed forward */
  public native @ByRef Dropout dropout3(); public native TransformerDecoderLayerImpl dropout3(Dropout setter);

  /**Normalization, post feed forward */
  public native @ByRef LayerNorm norm3(); public native TransformerDecoderLayerImpl norm3(LayerNorm setter);

  }
