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


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerOptions position(long position) {
        return (OptimizerOptions)super.position(position);
    }
    @Override public OptimizerOptions getPointer(long i) {
        return new OptimizerOptions((Pointer)this).offsetAddress(i);
    }

  public native @UniquePtr OptimizerOptions clone();
  
  
  public native double get_lr();
  public native void set_lr(double lr);
}
