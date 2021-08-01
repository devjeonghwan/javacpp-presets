// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/**
 * Deprecated and unused struct to use for initializing an abuffersink context.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVABufferSinkParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVABufferSinkParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVABufferSinkParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVABufferSinkParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVABufferSinkParams position(long position) {
        return (AVABufferSinkParams)super.position(position);
    }
    @Override public AVABufferSinkParams getPointer(long i) {
        return new AVABufferSinkParams((Pointer)this).offsetAddress(i);
    }

    /** list of allowed sample formats, terminated by AV_SAMPLE_FMT_NONE */
    public native @Cast("const AVSampleFormat*") IntPointer sample_fmts(); public native AVABufferSinkParams sample_fmts(IntPointer setter);
    /** list of allowed channel layouts, terminated by -1 */
    public native @Cast("const int64_t*") LongPointer channel_layouts(); public native AVABufferSinkParams channel_layouts(LongPointer setter);
    /** list of allowed channel counts, terminated by -1 */
    public native @Const IntPointer channel_counts(); public native AVABufferSinkParams channel_counts(IntPointer setter);
    /** if not 0, accept any channel count or layout */
    public native int all_channel_counts(); public native AVABufferSinkParams all_channel_counts(int setter);
    /** list of allowed sample rates, terminated by -1 */
    public native IntPointer sample_rates(); public native AVABufferSinkParams sample_rates(IntPointer setter);
}
