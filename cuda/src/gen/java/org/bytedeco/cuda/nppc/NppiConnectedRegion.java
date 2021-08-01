// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiConnectedRegion extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiConnectedRegion() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiConnectedRegion(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiConnectedRegion(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiConnectedRegion position(long position) {
        return (NppiConnectedRegion)super.position(position);
    }
    @Override public NppiConnectedRegion getPointer(long i) {
        return new NppiConnectedRegion((Pointer)this).offsetAddress(i);
    }

	/**  x, y, width, height == left, top, right, and bottom pixel coordinates */
	public native @ByRef NppiRect oBoundingBox(); public native NppiConnectedRegion oBoundingBox(NppiRect setter);
	/** total number of pixels in connected region */
	public native @Cast("Npp32u") int nConnectedPixelCount(); public native NppiConnectedRegion nConnectedPixelCount(int setter);
	/** original pixel value of seed pixel, 1 or 3 channel */
	public native @Cast("Npp32u") int aSeedPixelValue(int i); public native NppiConnectedRegion aSeedPixelValue(int i, int setter);
	@MemberGetter public native @Cast("Npp32u*") IntPointer aSeedPixelValue();
}
