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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Hardshrink ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the hard shrinkage function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Hardshrink to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::HardshrinkOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Hardshrink model(HardshrinkOptions().lambda(42.42));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HardshrinkImpl extends HardshrinkImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HardshrinkImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HardshrinkImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HardshrinkImpl position(long position) {
        return (HardshrinkImpl)super.position(position);
    }
    @Override public HardshrinkImpl getPointer(long i) {
        return new HardshrinkImpl((Pointer)this).offsetAddress(i);
    }

  public HardshrinkImpl(@Const @ByRef(nullValue = "torch::nn::HardshrinkOptions{}") HardshrinkOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::HardshrinkOptions{}") HardshrinkOptions options_);
  public HardshrinkImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Hardshrink} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef HardshrinkOptions options(); public native HardshrinkImpl options(HardshrinkOptions setter);
}
