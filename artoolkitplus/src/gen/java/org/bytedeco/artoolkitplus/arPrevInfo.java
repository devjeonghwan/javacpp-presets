// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class arPrevInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public arPrevInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public arPrevInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public arPrevInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public arPrevInfo position(long position) {
        return (arPrevInfo)super.position(position);
    }
    @Override public arPrevInfo getPointer(long i) {
        return new arPrevInfo((Pointer)this).offsetAddress(i);
    }

    public native @ByRef ARMarkerInfo marker(); public native arPrevInfo marker(ARMarkerInfo setter);
    public native int count(); public native arPrevInfo count(int setter);
}
