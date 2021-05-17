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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MultiLabelSoftMarginLoss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that optimizes a multi-label one-versus-all
 *  loss based on max-entropy, between input :math:{@code x} and target :math:{@code y} of size
 *  :math:{@code (N, C)}.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.MultiLabelSoftMarginLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MultiLabelSoftMarginLossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiLabelSoftMarginLoss model(MultiLabelSoftMarginLossOptions().reduction(torch::kNone).weight(weight));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiLabelSoftMarginLossImpl extends MultiLabelSoftMarginLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiLabelSoftMarginLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiLabelSoftMarginLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MultiLabelSoftMarginLossImpl position(long position) {
        return (MultiLabelSoftMarginLossImpl)super.position(position);
    }
    @Override public MultiLabelSoftMarginLossImpl getPointer(long i) {
        return new MultiLabelSoftMarginLossImpl((Pointer)this).offsetAddress(i);
    }

  public MultiLabelSoftMarginLossImpl(
      @Const @ByRef(nullValue = "torch::nn::MultiLabelSoftMarginLossOptions{}") MultiLabelSoftMarginLossOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(
      @Const @ByRef(nullValue = "torch::nn::MultiLabelSoftMarginLossOptions{}") MultiLabelSoftMarginLossOptions options_);
  public MultiLabelSoftMarginLossImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  /** Pretty prints the {@code MultiLabelSoftMarginLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native void reset();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef MultiLabelSoftMarginLossOptions options(); public native MultiLabelSoftMarginLossImpl options(MultiLabelSoftMarginLossOptions setter);
}
