// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** This is an internal structure. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2TimeStep extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2TimeStep() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2TimeStep(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2TimeStep(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2TimeStep position(long position) {
        return (b2TimeStep)super.position(position);
    }
    @Override public b2TimeStep getPointer(long i) {
        return new b2TimeStep((Pointer)this).offsetAddress(i);
    }

	public native @Cast("float32") float dt(); public native b2TimeStep dt(float setter);			// time step
	public native @Cast("float32") float inv_dt(); public native b2TimeStep inv_dt(float setter);		// inverse time step (0 if dt == 0).
	public native @Cast("float32") float dtRatio(); public native b2TimeStep dtRatio(float setter);	// dt * inv_dt0
	public native @Cast("int32") int velocityIterations(); public native b2TimeStep velocityIterations(int setter);
	public native @Cast("int32") int positionIterations(); public native b2TimeStep positionIterations(int setter);
	public native @Cast("int32") int particleIterations(); public native b2TimeStep particleIterations(int setter);
	public native @Cast("bool") boolean warmStarting(); public native b2TimeStep warmStarting(boolean setter);
}
