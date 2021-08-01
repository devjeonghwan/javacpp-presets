// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A descriptor of a Local Response Normalization (LRN) operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_lrn_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_lrn_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_lrn_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_lrn_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_lrn_desc_t position(long position) {
        return (mkldnn_lrn_desc_t)super.position(position);
    }
    @Override public mkldnn_lrn_desc_t getPointer(long i) {
        return new mkldnn_lrn_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     * descriptor. Must be #mkldnn_lrn. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_lrn_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #mkldnn_forward_training,
     * #mkldnn_forward_inference, #mkldnn_backward, and #mkldnn_backward_data.
     */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_lrn_desc_t prop_kind(int setter);
    /** LRN algorithm. Possible values: #mkldnn_lrn_within_channel and
     * #mkldnn_lrn_across_channels. */
    public native @Cast("mkldnn_alg_kind_t") int alg_kind(); public native mkldnn_lrn_desc_t alg_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t data_desc(); public native mkldnn_lrn_desc_t data_desc(mkldnn_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_data_desc(); public native mkldnn_lrn_desc_t diff_data_desc(mkldnn_memory_desc_t setter);
    /** The number of channels to sum over (for cross-channel LRN) or the side
     * length of the square region to sum over (for within-channel LRN). */
    public native int local_size(); public native mkldnn_lrn_desc_t local_size(int setter);
    /** LRN alpha parameter. */
    public native float lrn_alpha(); public native mkldnn_lrn_desc_t lrn_alpha(float setter);
    /** LRN beta parameter. */
    public native float lrn_beta(); public native mkldnn_lrn_desc_t lrn_beta(float setter);
    /** LRN k parameter. */
    public native float lrn_k(); public native mkldnn_lrn_desc_t lrn_k(float setter);
}
