// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * ReplayGain information (see
 * http://wiki.hydrogenaudio.org/index.php?title=ReplayGain_1.0_specification).
 * The size of this struct is a part of the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVReplayGain extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVReplayGain() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVReplayGain(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVReplayGain(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVReplayGain position(long position) {
        return (AVReplayGain)super.position(position);
    }
    @Override public AVReplayGain getPointer(long i) {
        return new AVReplayGain((Pointer)this).offsetAddress(i);
    }

    /**
     * Track replay gain in microbels (divide by 100000 to get the value in dB).
     * Should be set to INT32_MIN when unknown.
     */
    public native int track_gain(); public native AVReplayGain track_gain(int setter);
    /**
     * Peak track amplitude, with 100000 representing full scale (but values
     * may overflow). 0 when unknown.
     */
    public native @Cast("uint32_t") int track_peak(); public native AVReplayGain track_peak(int setter);
    /**
     * Same as track_gain, but for the whole album.
     */
    public native int album_gain(); public native AVReplayGain album_gain(int setter);
    /**
     * Same as track_peak, but for the whole album,
     */
    public native @Cast("uint32_t") int album_peak(); public native AVReplayGain album_peak(int setter);
}
