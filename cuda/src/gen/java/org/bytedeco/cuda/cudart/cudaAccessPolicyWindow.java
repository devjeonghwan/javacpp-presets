// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Specifies an access policy for a window, a contiguous extent of memory
 * beginning at base_ptr and ending at base_ptr + num_bytes.
 * Partition into many segments and assign segments such that.
 * sum of "hit segments" / window == approx. ratio.
 * sum of "miss segments" / window == approx 1-ratio.
 * Segments and ratio specifications are fitted to the capabilities of
 * the architecture.
 * Accesses in a hit segment apply the hitProp access policy.
 * Accesses in a miss segment apply the missProp access policy.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaAccessPolicyWindow extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaAccessPolicyWindow() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaAccessPolicyWindow(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaAccessPolicyWindow(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaAccessPolicyWindow position(long position) {
        return (cudaAccessPolicyWindow)super.position(position);
    }
    @Override public cudaAccessPolicyWindow getPointer(long i) {
        return new cudaAccessPolicyWindow((Pointer)this).offsetAddress(i);
    }

    /** Starting address of the access policy window. CUDA driver may align it. */
    public native Pointer base_ptr(); public native cudaAccessPolicyWindow base_ptr(Pointer setter);
    /** Size in bytes of the window policy. CUDA driver may restrict the maximum size and alignment. */
    public native @Cast("size_t") long num_bytes(); public native cudaAccessPolicyWindow num_bytes(long setter);
    /** hitRatio specifies percentage of lines assigned hitProp, rest are assigned missProp. */
    public native float hitRatio(); public native cudaAccessPolicyWindow hitRatio(float setter);
    /** ::CUaccessProperty set for hit. */
    public native @Cast("cudaAccessProperty") int hitProp(); public native cudaAccessPolicyWindow hitProp(int setter);
    /** ::CUaccessProperty set for miss. Must be either NORMAL or STREAMING. */
    public native @Cast("cudaAccessProperty") int missProp(); public native cudaAccessPolicyWindow missProp(int setter);
}
