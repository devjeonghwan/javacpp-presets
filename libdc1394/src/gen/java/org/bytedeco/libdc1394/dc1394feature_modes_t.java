// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * List of feature modes
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394feature_modes_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394feature_modes_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394feature_modes_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394feature_modes_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394feature_modes_t position(long position) {
        return (dc1394feature_modes_t)super.position(position);
    }
    @Override public dc1394feature_modes_t getPointer(long i) {
        return new dc1394feature_modes_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int num(); public native dc1394feature_modes_t num(int setter);
    public native @Cast("dc1394feature_mode_t") int modes(int i); public native dc1394feature_modes_t modes(int i, int setter);
    @MemberGetter public native @Cast("dc1394feature_mode_t*") IntPointer modes();
}
