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


/** Options for the {@code PixelUnshuffle} module.
 * 
 *  Example:
 *  <pre>{@code
 *  PixelUnshuffle model(PixelUnshuffleOptions(5));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PixelUnshuffleOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PixelUnshuffleOptions(Pointer p) { super(p); }

  /* implicit */ public PixelUnshuffleOptions(@Cast("int64_t") long downscale_factor) { super((Pointer)null); allocate(downscale_factor); }
private native void allocate(@Cast("int64_t") long downscale_factor);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer downscale_factor();
}
