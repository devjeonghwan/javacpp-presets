// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Tracklets message. Carries object tracking information.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Tracklets extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tracklets(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Tracklets(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Tracklets position(long position) {
        return (Tracklets)super.position(position);
    }
    @Override public Tracklets getPointer(long i) {
        return new Tracklets((Pointer)this).offsetAddress(i);
    }

    /**
     * Construct Tracklets message.
     */
    public Tracklets() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Tracklets(@SharedPtr RawTracklets ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawTracklets ptr);

    /**
     * Retrieve data for Tracklets.
     * @return Vector of object tracker data, carrying tracking information.
     */
    public native @StdVector Tracklet tracklets(); public native Tracklets tracklets(Tracklet setter);
}
