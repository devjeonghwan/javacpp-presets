// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_prelu
 <p>
 *  \addtogroup dnnl_api_lrn
 *  \{
 <p>
 *  A descriptor of a Local Response Normalization (LRN) operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_lrn_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_lrn_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_lrn_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_lrn_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_lrn_desc_t position(long position) {
        return (dnnl_lrn_desc_t)super.position(position);
    }
    @Override public dnnl_lrn_desc_t getPointer(long i) {
        return new dnnl_lrn_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_lrn. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_lrn_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward, and #dnnl_backward_data. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_lrn_desc_t prop_kind(int setter);
    /** LRN algorithm. Possible values: #dnnl_lrn_within_channel and
     *  #dnnl_lrn_across_channels. */
    public native @Cast("dnnl_alg_kind_t") int alg_kind(); public native dnnl_lrn_desc_t alg_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t data_desc(); public native dnnl_lrn_desc_t data_desc(dnnl_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_data_desc(); public native dnnl_lrn_desc_t diff_data_desc(dnnl_memory_desc_t setter);
    /** The number of channels to sum over (for cross-channel LRN) or the side
     *  length of the square region to sum over (for within-channel LRN). */
    public native @Cast("dnnl_dim_t") long local_size(); public native dnnl_lrn_desc_t local_size(long setter);
    /** LRN alpha parameter. */
    public native float lrn_alpha(); public native dnnl_lrn_desc_t lrn_alpha(float setter);
    /** LRN beta parameter. */
    public native float lrn_beta(); public native dnnl_lrn_desc_t lrn_beta(float setter);
    /** LRN k parameter. */
    public native float lrn_k(); public native dnnl_lrn_desc_t lrn_k(float setter);
}
