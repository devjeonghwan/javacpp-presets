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


/** Options for {@code torch::nn::functional::batch_norm}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::batch_norm(input, mean, variance, F::BatchNormFuncOptions().weight(weight).bias(bias).momentum(0.1).eps(1e-05).training(false));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchNormFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BatchNormFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BatchNormFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNormFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BatchNormFuncOptions position(long position) {
        return (BatchNormFuncOptions)super.position(position);
    }
    @Override public BatchNormFuncOptions getPointer(long i) {
        return new BatchNormFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor weight();
  public native @ByRef @NoException(true) Tensor bias();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer training();
  public native @ByRef @NoException(true) DoubleOptional momentum();
  public native @ByRef @NoException(true) DoublePointer eps();
}
