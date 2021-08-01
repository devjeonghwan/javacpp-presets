// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * Data structure to report the collection of read retries for metadata items with checksum as
 * used by H5Fget_metadata_read_retry_info()
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5F_retry_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5F_retry_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5F_retry_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5F_retry_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5F_retry_info_t position(long position) {
        return (H5F_retry_info_t)super.position(position);
    }
    @Override public H5F_retry_info_t getPointer(long i) {
        return new H5F_retry_info_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned") int nbins(); public native H5F_retry_info_t nbins(int setter);
    public native @Cast("uint32_t*") ShortPointer retries(int i); public native H5F_retry_info_t retries(int i, ShortPointer setter);
    @MemberGetter public native @Cast("uint32_t**") PointerPointer retries();
}
