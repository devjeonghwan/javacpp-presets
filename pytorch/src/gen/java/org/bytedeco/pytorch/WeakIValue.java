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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WeakIValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WeakIValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WeakIValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WeakIValue position(long position) {
        return (WeakIValue)super.position(position);
    }
    @Override public WeakIValue getPointer(long i) {
        return new WeakIValue((Pointer)this).offsetAddress(i);
    }

  public WeakIValue() { super((Pointer)null); allocate(); }
  private native void allocate();

  public WeakIValue(@Const @ByRef WeakIValue rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(@Const @ByRef WeakIValue rhs);
  public WeakIValue(@Const @ByRef IValue rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(@Const @ByRef IValue rhs);
  public native @ByRef @Name("operator =") @NoException(true) WeakIValue put(@ByRef(true) WeakIValue rhs);
  public native @NoException(true) void swap(@ByRef WeakIValue rhs);

  public native @Cast("bool") boolean isSameIdentity(@Const @ByRef WeakIValue rhs);

  public native @ByVal IValue lock();

  public native @Cast("size_t") @NoException(true) long use_count();

  public native @Cast("size_t") @NoException(true) long weak_use_count();
  public native @Cast("size_t") long hash();
}
