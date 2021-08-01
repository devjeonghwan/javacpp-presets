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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SGDParamState extends OptimizerCloneableSGDParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public SGDParamState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SGDParamState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SGDParamState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SGDParamState position(long position) {
        return (SGDParamState)super.position(position);
    }
    @Override public SGDParamState getPointer(long i) {
        return new SGDParamState((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor momentum_buffer();
  
  
  
  // NOLINTNEXTLINE(modernize-use-override)
}
