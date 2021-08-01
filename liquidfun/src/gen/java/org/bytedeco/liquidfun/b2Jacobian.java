// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Jacobian extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2Jacobian() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Jacobian(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Jacobian(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2Jacobian position(long position) {
        return (b2Jacobian)super.position(position);
    }
    @Override public b2Jacobian getPointer(long i) {
        return new b2Jacobian((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b2Vec2 linear(); public native b2Jacobian linear(b2Vec2 setter);
	public native @Cast("float32") float angularA(); public native b2Jacobian angularA(float setter);
	public native @Cast("float32") float angularB(); public native b2Jacobian angularB(float setter);
}
