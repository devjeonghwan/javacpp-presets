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
 // namespace detail

/** Options for the {@code RNN} module.
 * 
 *  Example:
 *  <pre>{@code
 *  RNN model(RNNOptions(128, 64).num_layers(3).dropout(0.2).nonlinearity(torch::kTanh));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RNNOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNOptions(Pointer p) { super(p); }


  public RNNOptions(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer input_size();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer hidden_size();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_layers();
  public native @ByRef @NoException(true) rnn_nonlinearity_t nonlinearity();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer batch_first();
  public native @ByRef @NoException(true) DoublePointer dropout();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bidirectional();
}
