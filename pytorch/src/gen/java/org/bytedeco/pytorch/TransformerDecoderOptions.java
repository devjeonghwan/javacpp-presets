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


/** Options for the {@code TransformerDecoder} module.
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerDecoderLayer decoder_layer(TransformerDecoderLayerOptions(512, 8).dropout(0.1));
 *  auto options = TransformerDecoderOptions(decoder_layer, 6)norm(LayerNorm(LayerNormOptions({2})));
 *  TransformerDecoder transformer_decoder(options);
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerDecoderOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerDecoderOptions(Pointer p) { super(p); }

  // This constructor will keep the a ref of passed in decoder_layer,
  // so it keeps all the data in decoder_layer.
  public TransformerDecoderOptions(@ByVal TransformerDecoderLayer decoder_layer,
                              @Cast("int64_t") long num_layers) { super((Pointer)null); allocate(decoder_layer, num_layers); }
  private native void allocate(@ByVal TransformerDecoderLayer decoder_layer,
                              @Cast("int64_t") long num_layers);
  // This constructor will create a new TransformerDecoderLayer obj,
  // based on passed in decoder_layer_options.
  public TransformerDecoderOptions(
      @Const @ByRef TransformerDecoderLayerOptions decoder_layer_options,
      @Cast("int64_t") long num_layers) { super((Pointer)null); allocate(decoder_layer_options, num_layers); }
  private native void allocate(
      @Const @ByRef TransformerDecoderLayerOptions decoder_layer_options,
      @Cast("int64_t") long num_layers);
  public native @ByRef @NoException(true) TransformerDecoderLayer decoder_layer();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_layers();
  public native @ByRef @NoException(true) AnyModule norm();
}
