// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;



/**
 * This struct describes the constraints on hardware frames attached to
 * a given device with a hardware-specific configuration.  This is returned
 * by av_hwdevice_get_hwframe_constraints() and must be freed by
 * av_hwframe_constraints_free() after use.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVHWFramesConstraints extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVHWFramesConstraints() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVHWFramesConstraints(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVHWFramesConstraints(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVHWFramesConstraints position(long position) {
        return (AVHWFramesConstraints)super.position(position);
    }
    @Override public AVHWFramesConstraints getPointer(long i) {
        return new AVHWFramesConstraints((Pointer)this).offsetAddress(i);
    }

    /**
     * A list of possible values for format in the hw_frames_ctx,
     * terminated by AV_PIX_FMT_NONE.  This member will always be filled.
     */
    public native @Cast("AVPixelFormat*") IntPointer valid_hw_formats(); public native AVHWFramesConstraints valid_hw_formats(IntPointer setter);

    /**
     * A list of possible values for sw_format in the hw_frames_ctx,
     * terminated by AV_PIX_FMT_NONE.  Can be NULL if this information is
     * not known.
     */
    public native @Cast("AVPixelFormat*") IntPointer valid_sw_formats(); public native AVHWFramesConstraints valid_sw_formats(IntPointer setter);

    /**
     * The minimum size of frames in this hw_frames_ctx.
     * (Zero if not known.)
     */
    public native int min_width(); public native AVHWFramesConstraints min_width(int setter);
    public native int min_height(); public native AVHWFramesConstraints min_height(int setter);

    /**
     * The maximum size of frames in this hw_frames_ctx.
     * (INT_MAX if not known / no limit.)
     */
    public native int max_width(); public native AVHWFramesConstraints max_width(int setter);
    public native int max_height(); public native AVHWFramesConstraints max_height(int setter);
}
