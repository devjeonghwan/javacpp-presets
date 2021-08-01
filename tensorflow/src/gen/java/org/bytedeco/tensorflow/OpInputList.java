// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Utility class for representing a list of immutable input tensors
// that are passed to the op as a single named argument.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpInputList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpInputList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpInputList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpInputList position(long position) {
        return (OpInputList)super.position(position);
    }
    @Override public OpInputList getPointer(long i) {
        return new OpInputList((Pointer)this).offsetAddress(i);
    }

  public OpInputList() { super((Pointer)null); allocate(); }
  private native void allocate();
  public OpInputList(OpKernelContext ctx, int start, int stop) { super((Pointer)null); allocate(ctx, start, stop); }
  private native void allocate(OpKernelContext ctx, int start, int stop);
  public native @ByRef @Name("operator =") OpInputList put(@Const @ByRef OpInputList other);
  public native @Const @ByRef @Name("operator []") Tensor get(int i);
  public native int size();
}
