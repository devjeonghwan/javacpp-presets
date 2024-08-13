// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;

// #endif

/******************************************************************************
 * Batched compression/decompression interface for Snappy
 *****************************************************************************/

/**
 * \brief Snappy compression options for the low-level API
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class nvcompBatchedSnappyOpts_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvcompBatchedSnappyOpts_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvcompBatchedSnappyOpts_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvcompBatchedSnappyOpts_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvcompBatchedSnappyOpts_t position(long position) {
        return (nvcompBatchedSnappyOpts_t)super.position(position);
    }
    @Override public nvcompBatchedSnappyOpts_t getPointer(long i) {
        return new nvcompBatchedSnappyOpts_t((Pointer)this).offsetAddress(i);
    }

  public native int reserved(); public native nvcompBatchedSnappyOpts_t reserved(int setter);
}
