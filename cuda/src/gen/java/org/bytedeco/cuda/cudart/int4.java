// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class int4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public int4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public int4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public int4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public int4 position(long position) {
        return (int4)super.position(position);
    }
    @Override public int4 getPointer(long i) {
        return new int4((Pointer)this).offsetAddress(i);
    }

    public native int x(); public native int4 x(int setter);
    public native int y(); public native int4 y(int setter);
    public native int z(); public native int4 z(int setter);
    public native int w(); public native int4 w(int setter);
}
