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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LPPool2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the LPPool2d function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.LPPool2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LPPool2dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LPPool2d model(LPPool2dOptions(1, std::vector<int64_t>({3, 4})).stride({5, 6}).ceil_mode(true));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LPPool2dImpl extends LPPool2dImplBase {
    static { Loader.load(); }

  
    public LPPool2dImpl(double norm_type, @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(norm_type, kernel_size); }
    @NoDeallocator private native void allocate(double norm_type, @ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
    public LPPool2dImpl(@Const @ByRef LPPool2dOptions options_) { super((Pointer)null); allocate(options_); }
    @NoDeallocator private native void allocate(@Const @ByRef LPPool2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LPPool2dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

}
