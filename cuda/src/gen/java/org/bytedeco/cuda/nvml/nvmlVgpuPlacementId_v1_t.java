// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to store the placement ID of vGPU instance -- version 1
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuPlacementId_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuPlacementId_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuPlacementId_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuPlacementId_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuPlacementId_v1_t position(long position) {
        return (nvmlVgpuPlacementId_v1_t)super.position(position);
    }
    @Override public nvmlVgpuPlacementId_v1_t getPointer(long i) {
        return new nvmlVgpuPlacementId_v1_t((Pointer)this).offsetAddress(i);
    }

    /** The version number of this struct */
    public native @Cast("unsigned int") int version(); public native nvmlVgpuPlacementId_v1_t version(int setter);
    /** Placement ID of the active vGPU instance */
    public native @Cast("unsigned int") int placementId(); public native nvmlVgpuPlacementId_v1_t placementId(int setter);
}
