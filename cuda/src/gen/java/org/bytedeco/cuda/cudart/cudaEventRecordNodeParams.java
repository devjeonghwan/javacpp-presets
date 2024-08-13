// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Event record node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaEventRecordNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaEventRecordNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaEventRecordNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaEventRecordNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaEventRecordNodeParams position(long position) {
        return (cudaEventRecordNodeParams)super.position(position);
    }
    @Override public cudaEventRecordNodeParams getPointer(long i) {
        return new cudaEventRecordNodeParams((Pointer)this).offsetAddress(i);
    }

    /** The event to record when the node executes */
    public native CUevent_st event(); public native cudaEventRecordNodeParams event(CUevent_st setter);
}
