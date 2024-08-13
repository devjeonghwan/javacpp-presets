// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * 2D Size
 * This struct typically represents the size of a a rectangular region in
 * two space.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiSize extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiSize() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiSize(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiSize(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiSize position(long position) {
        return (NppiSize)super.position(position);
    }
    @Override public NppiSize getPointer(long i) {
        return new NppiSize((Pointer)this).offsetAddress(i);
    }

    /**  Rectangle width. */
    public native int width(); public native NppiSize width(int setter);
    /**  Rectangle height. */
    public native int height(); public native NppiSize height(int setter);
}
