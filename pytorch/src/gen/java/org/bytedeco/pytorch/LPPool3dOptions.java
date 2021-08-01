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

@Name("torch::nn::LPPoolOptions<3>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LPPool3dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LPPool3dOptions(Pointer p) { super(p); }

  public LPPool3dOptions(double norm_type, @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(norm_type, kernel_size); }
  private native void allocate(double norm_type, @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
  public native @ByRef @NoException(true) DoublePointer norm_type();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer kernel_size();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer stride();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer ceil_mode();
}
