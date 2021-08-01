// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class double3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public double3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public double3 position(long position) {
        return (double3)super.position(position);
    }
    @Override public double3 getPointer(long i) {
        return new double3((Pointer)this).offsetAddress(i);
    }

    public native double x(); public native double3 x(double setter);
    public native double y(); public native double3 y(double setter);
    public native double z(); public native double3 z(double setter);
}
