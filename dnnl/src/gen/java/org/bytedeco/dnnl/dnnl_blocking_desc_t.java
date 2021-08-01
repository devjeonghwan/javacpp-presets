// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Generic description of blocked data layout for most memory formats.
 * 
 *  @see \ref dev_guide_understanding_memory_formats */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_blocking_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_blocking_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_blocking_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_blocking_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_blocking_desc_t position(long position) {
        return (dnnl_blocking_desc_t)super.position(position);
    }
    @Override public dnnl_blocking_desc_t getPointer(long i) {
        return new dnnl_blocking_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The strides between the outermost blocks.
     *  In case of plain (non-blocked) formats the strides between dimensions. */
    @MemberGetter public native @Cast("int64_t*") LongPointer strides();
    // Innermost section
    // ASSUMPTION: the innermost blocks are always dense
    /** The number of innermost blocks, e.g. 3 in case of {@code OIhw_4i16o4i_} */
    public native int inner_nblks(); public native dnnl_blocking_desc_t inner_nblks(int setter);
    /** The size of the blocks, e.g. {@code {4, 16, 4}} in case of {@code OIhw_4i16o4i} */
    @MemberGetter public native @Cast("int64_t*") LongPointer inner_blks();
    /** The logical indices of the blocks, e.g. {@code {1, 0, 1}} in case of
     *  {@code 4i16o4i}, because {@code i} is the 1st dim and {@code o} is the 0st dim */
    @MemberGetter public native @Cast("int64_t*") LongPointer inner_idxs();
}
