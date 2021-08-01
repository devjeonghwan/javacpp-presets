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

/** Options for the {@code ReLU} module.
 * 
 *  Example:
 *  <pre>{@code
 *  ReLU model(ReLUOptions().inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReLUOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReLUOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ReLUOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ReLUOptions position(long position) {
        return (ReLUOptions)super.position(position);
    }
    @Override public ReLUOptions getPointer(long i) {
        return new ReLUOptions((Pointer)this).offsetAddress(i);
    }

  /* implicit */ public ReLUOptions(@Cast("bool") boolean inplace/*=false*/) { super((Pointer)null); allocate(inplace); }
private native void allocate(@Cast("bool") boolean inplace/*=false*/);
public ReLUOptions() { super((Pointer)null); allocate(); }
private native void allocate();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
