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


// ============================================================================

/** Options for the {@code EmbeddingBag::from_pretrained} function. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingBagFromPretrainedOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EmbeddingBagFromPretrainedOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EmbeddingBagFromPretrainedOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingBagFromPretrainedOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EmbeddingBagFromPretrainedOptions position(long position) {
        return (EmbeddingBagFromPretrainedOptions)super.position(position);
    }
    @Override public EmbeddingBagFromPretrainedOptions getPointer(long i) {
        return new EmbeddingBagFromPretrainedOptions((Pointer)this).offsetAddress(i);
    }

  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer freeze();
  public native @ByRef @NoException(true) DoubleOptional max_norm();
  public native @ByRef @NoException(true) DoublePointer norm_type();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer scale_grad_by_freq();
  public native @ByRef @NoException(true) EmbeddingBagMode mode();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer sparse();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer include_last_offset();
  public native @ByRef @NoException(true) LongOptional padding_idx();
}
