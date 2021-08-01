// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [hobj_ref_t_snip] -->
 <p>
 *  <!-- [hdset_reg_ref_t_snip] -->
/**
 * Buffer to store heap ID and index
 *
 * This needs to be large enough to store largest #haddr_t in a worst case
 * machine (8 bytes currently) plus an int.
 *
 * @deprecated Dataset region reference type that is used with deprecated
 *             reference APIs.
 *
 * \note This type can only be used with the "native" HDF5 VOL connector.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class hdset_reg_ref_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public hdset_reg_ref_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public hdset_reg_ref_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hdset_reg_ref_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public hdset_reg_ref_t position(long position) {
        return (hdset_reg_ref_t)super.position(position);
    }
    @Override public hdset_reg_ref_t getPointer(long i) {
        return new hdset_reg_ref_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint8_t") byte __data(int i); public native hdset_reg_ref_t __data(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer __data();
}
