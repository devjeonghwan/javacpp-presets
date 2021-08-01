// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppig;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppig.*;


/**
 * Data structure for variable ROI image resizing.
 * 
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppig.class)
public class NppiResizeBatchROI_Advanced extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiResizeBatchROI_Advanced() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiResizeBatchROI_Advanced(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiResizeBatchROI_Advanced(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiResizeBatchROI_Advanced position(long position) {
        return (NppiResizeBatchROI_Advanced)super.position(position);
    }
    @Override public NppiResizeBatchROI_Advanced getPointer(long i) {
        return new NppiResizeBatchROI_Advanced((Pointer)this).offsetAddress(i);
    }

    public native @ByRef NppiRect oSrcRectROI(); public native NppiResizeBatchROI_Advanced oSrcRectROI(NppiRect setter);    
    public native @ByRef NppiRect oDstRectROI(); public native NppiResizeBatchROI_Advanced oDstRectROI(NppiRect setter);
}
