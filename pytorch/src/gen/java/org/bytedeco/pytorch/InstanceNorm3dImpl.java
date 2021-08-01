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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ InstanceNorm3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the InstanceNorm3d function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.InstanceNorm3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::InstanceNorm3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  InstanceNorm3d model(InstanceNorm3dOptions(4).eps(0.5).momentum(0.1).affine(false).track_running_stats(true));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InstanceNorm3dImpl extends InstanceNorm3dImplBase {
    static { Loader.load(); }

  
    
      public InstanceNorm3dImpl(@Const @ByRef InstanceNormOptions options_) { super((Pointer)null); allocate(options_); }
      private native void allocate(@Const @ByRef InstanceNormOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstanceNorm3dImpl(Pointer p) { super(p); }

}
