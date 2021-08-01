// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * General image descriptor. Defines the basic parameters of an image,
 * including data pointer, step, and image size.
 * This can be used by both source and destination images.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiImageDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiImageDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiImageDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiImageDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiImageDescriptor position(long position) {
        return (NppiImageDescriptor)super.position(position);
    }
    @Override public NppiImageDescriptor getPointer(long i) {
        return new NppiImageDescriptor((Pointer)this).offsetAddress(i);
    }

    /** device memory pointer to the image */
    public native Pointer pData(); public native NppiImageDescriptor pData(Pointer setter);
    /** step size */
    public native int nStep(); public native NppiImageDescriptor nStep(int setter);
    /** width and height of the image */
    public native @ByRef NppiSize oSize(); public native NppiImageDescriptor oSize(NppiSize setter);
}
