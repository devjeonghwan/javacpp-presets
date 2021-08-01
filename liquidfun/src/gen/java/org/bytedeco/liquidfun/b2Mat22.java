// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A 2-by-2 matrix. Stored in column-major order. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Mat22 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Mat22(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Mat22(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2Mat22 position(long position) {
        return (b2Mat22)super.position(position);
    }
    @Override public b2Mat22 getPointer(long i) {
        return new b2Mat22((Pointer)this).offsetAddress(i);
    }

	/** The default constructor does nothing (for performance). */
	public b2Mat22() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Construct this matrix using columns. */
	public b2Mat22(@Const @ByRef b2Vec2 c1, @Const @ByRef b2Vec2 c2) { super((Pointer)null); allocate(c1, c2); }
	private native void allocate(@Const @ByRef b2Vec2 c1, @Const @ByRef b2Vec2 c2);

	/** Construct this matrix using scalars. */
	public b2Mat22(@Cast("float32") float a11, @Cast("float32") float a12, @Cast("float32") float a21, @Cast("float32") float a22) { super((Pointer)null); allocate(a11, a12, a21, a22); }
	private native void allocate(@Cast("float32") float a11, @Cast("float32") float a12, @Cast("float32") float a21, @Cast("float32") float a22);

	/** Initialize this matrix using columns. */
	public native void Set(@Const @ByRef b2Vec2 c1, @Const @ByRef b2Vec2 c2);

	/** Set this to the identity matrix. */
	public native void SetIdentity();

	/** Set this matrix to all zeros. */
	public native void SetZero();

	public native @ByVal b2Mat22 GetInverse();

	/** Solve A * x = b, where b is a column vector. This is more efficient
	 *  than computing the inverse in one-shot cases. */
	public native @ByVal b2Vec2 Solve(@Const @ByRef b2Vec2 b);

	public native @ByRef b2Vec2 ex(); public native b2Mat22 ex(b2Vec2 setter);
	public native @ByRef b2Vec2 ey(); public native b2Mat22 ey(b2Vec2 setter);
}
