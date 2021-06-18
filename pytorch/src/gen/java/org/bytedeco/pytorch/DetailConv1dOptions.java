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


/** Options for a {@code D}-dimensional convolution or convolution transpose module. */
@Name("torch::nn::detail::ConvNdOptions<1>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DetailConv1dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetailConv1dOptions(Pointer p) { super(p); }

  public DetailConv1dOptions(
        @Cast("int64_t") long in_channels,
        @Cast("int64_t") long out_channels,
        @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(in_channels, out_channels, kernel_size); }
  private native void allocate(
        @Cast("int64_t") long in_channels,
        @Cast("int64_t") long out_channels,
        @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
  public native @Cast("int64_t*") @ByRef @NoException LongPointer in_channels();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer out_channels();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException LongPointer kernel_size();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException LongPointer stride();
  public native @Cast("torch::nn::detail::ConvNdOptions<1>::padding_t*") @ByRef @NoException Pointer padding();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException LongPointer dilation();
  public native @Cast("bool*") @ByRef @NoException BoolPointer transposed();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException LongPointer output_padding();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer groups();
  public native @Cast("bool*") @ByRef @NoException BoolPointer bias();
  public native @Cast("torch::nn::detail::conv_padding_mode_t*") @ByRef @NoException Pointer padding_mode();
}
