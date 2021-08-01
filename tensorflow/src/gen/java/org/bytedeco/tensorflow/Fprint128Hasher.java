// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Fprint128Hasher extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Fprint128Hasher() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Fprint128Hasher(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Fprint128Hasher(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Fprint128Hasher position(long position) {
        return (Fprint128Hasher)super.position(position);
    }
    @Override public Fprint128Hasher getPointer(long i) {
        return new Fprint128Hasher((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") @Name("operator ()") long apply(@Const @ByRef Fprint128 v);
}
