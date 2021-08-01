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
 // namespace functional

// ============================================================================

/** Options for the {@code CTCLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  CTCLoss model(CTCLossOptions().blank(42).zero_infinity(false).reduction(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CTCLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CTCLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CTCLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CTCLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CTCLossOptions position(long position) {
        return (CTCLossOptions)super.position(position);
    }
    @Override public CTCLossOptions getPointer(long i) {
        return new CTCLossOptions((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer blank();
  public native @ByRef @NoException(true) loss_reduction_t reduction();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer zero_infinity();
}
