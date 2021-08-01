// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

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

import static org.bytedeco.ffmpeg.global.avformat.*;


/**
 * \addtogroup lavf_encoding
 * \{
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVOutputFormat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOutputFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVOutputFormat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOutputFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVOutputFormat position(long position) {
        return (AVOutputFormat)super.position(position);
    }
    @Override public AVOutputFormat getPointer(long i) {
        return new AVOutputFormat((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native AVOutputFormat name(BytePointer setter);
    /**
     * Descriptive name for the format, meant to be more human-readable
     * than name. You should use the NULL_IF_CONFIG_SMALL() macro
     * to define it.
     */
    public native @Cast("const char*") BytePointer long_name(); public native AVOutputFormat long_name(BytePointer setter);
    public native @Cast("const char*") BytePointer mime_type(); public native AVOutputFormat mime_type(BytePointer setter);
    /** comma-separated filename extensions */
    public native @Cast("const char*") BytePointer extensions(); public native AVOutputFormat extensions(BytePointer setter);
    /* output support */
    /** default audio codec */
    public native @Cast("AVCodecID") int audio_codec(); public native AVOutputFormat audio_codec(int setter);
    /** default video codec */
    public native @Cast("AVCodecID") int video_codec(); public native AVOutputFormat video_codec(int setter);
    /** default subtitle codec */
    public native @Cast("AVCodecID") int subtitle_codec(); public native AVOutputFormat subtitle_codec(int setter);
    /**
     * can use flags: AVFMT_NOFILE, AVFMT_NEEDNUMBER,
     * AVFMT_GLOBALHEADER, AVFMT_NOTIMESTAMPS, AVFMT_VARIABLE_FPS,
     * AVFMT_NODIMENSIONS, AVFMT_NOSTREAMS, AVFMT_ALLOW_FLUSH,
     * AVFMT_TS_NONSTRICT, AVFMT_TS_NEGATIVE
     */
    public native int flags(); public native AVOutputFormat flags(int setter);

    /**
     * List of supported codec_id-codec_tag pairs, ordered by "better
     * choice first". The arrays are all terminated by AV_CODEC_ID_NONE.
     */
    @MemberGetter public native @Const AVCodecTag codec_tag(int i);
    @MemberGetter public native @Cast("const AVCodecTag*const*") PointerPointer codec_tag();


    /** AVClass for the private context */
    public native @Const AVClass priv_class(); public native AVOutputFormat priv_class(AVClass setter);

    /*****************************************************************
     * No fields below this line are part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    /**
     * The ff_const59 define is not part of the public API and will
     * be removed without further warning.
     */
// #if FF_API_AVIOFORMAT
// #define ff_const59
// #else
// #define ff_const59 const
// #endif
// #if FF_API_NEXT
    public native AVOutputFormat next(); public native AVOutputFormat next(AVOutputFormat setter);
// #endif
    /**
     * size of private data so that it can be allocated in the wrapper
     */
    public native int priv_data_size(); public native AVOutputFormat priv_data_size(int setter);

    public static class Write_header_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_header_AVFormatContext(Pointer p) { super(p); }
        protected Write_header_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Write_header_AVFormatContext write_header(); public native AVOutputFormat write_header(Write_header_AVFormatContext setter);
    /**
     * Write a packet. If AVFMT_ALLOW_FLUSH is set in flags,
     * pkt can be NULL in order to flush data buffered in the muxer.
     * When flushing, return 0 if there still is more data to flush,
     * or 1 if everything was flushed and there is no more buffered
     * data.
     */
    public static class Write_packet_AVFormatContext_AVPacket extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_packet_AVFormatContext_AVPacket(Pointer p) { super(p); }
        protected Write_packet_AVFormatContext_AVPacket() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, AVPacket pkt);
    }
    public native Write_packet_AVFormatContext_AVPacket write_packet(); public native AVOutputFormat write_packet(Write_packet_AVFormatContext_AVPacket setter);
    public static class Write_trailer_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_trailer_AVFormatContext(Pointer p) { super(p); }
        protected Write_trailer_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Write_trailer_AVFormatContext write_trailer(); public native AVOutputFormat write_trailer(Write_trailer_AVFormatContext setter);
    /**
     * A format-specific function for interleavement.
     * If unset, packets will be interleaved by dts.
     */
    public static class Interleave_packet_AVFormatContext_AVPacket_AVPacket_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Interleave_packet_AVFormatContext_AVPacket_AVPacket_int(Pointer p) { super(p); }
        protected Interleave_packet_AVFormatContext_AVPacket_AVPacket_int() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, AVPacket out,
                                 AVPacket in, int flush);
    }
    public native Interleave_packet_AVFormatContext_AVPacket_AVPacket_int interleave_packet(); public native AVOutputFormat interleave_packet(Interleave_packet_AVFormatContext_AVPacket_AVPacket_int setter);
    /**
     * Test if the given codec can be stored in this container.
     *
     * @return 1 if the codec is supported, 0 if it is not.
     *         A negative number if unknown.
     *         MKTAG('A', 'P', 'I', 'C') if the codec is only supported as AV_DISPOSITION_ATTACHED_PIC
     */
    public static class Query_codec_int_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Query_codec_int_int(Pointer p) { super(p); }
        protected Query_codec_int_int() { allocate(); }
        private native void allocate();
        public native int call(@Cast("AVCodecID") int id, int std_compliance);
    }
    public native Query_codec_int_int query_codec(); public native AVOutputFormat query_codec(Query_codec_int_int setter);

    public static class Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer(Pointer p) { super(p); }
        protected Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer() { allocate(); }
        private native void allocate();
        public native void call(AVFormatContext s, int stream,
                                     @Cast("int64_t*") LongPointer dts, @Cast("int64_t*") LongPointer wall);
    }
    public native Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer get_output_timestamp(); public native AVOutputFormat get_output_timestamp(Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer setter);
    /**
     * Allows sending messages from application to device.
     */
    public static class Control_message_AVFormatContext_int_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Control_message_AVFormatContext_int_Pointer_long(Pointer p) { super(p); }
        protected Control_message_AVFormatContext_int_Pointer_long() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, int type,
                               Pointer data, @Cast("size_t") long data_size);
    }
    public native Control_message_AVFormatContext_int_Pointer_long control_message(); public native AVOutputFormat control_message(Control_message_AVFormatContext_int_Pointer_long setter);

    /**
     * Write an uncoded AVFrame.
     *
     * See av_write_uncoded_frame() for details.
     *
     * The library will free *frame afterwards, but the muxer can prevent it
     * by setting the pointer to NULL.
     */
    public static class Write_uncoded_frame_AVFormatContext_int_PointerPointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_uncoded_frame_AVFormatContext_int_PointerPointer_int(Pointer p) { super(p); }
        protected Write_uncoded_frame_AVFormatContext_int_PointerPointer_int() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, int stream_index,
                                   @Cast("AVFrame**") PointerPointer frame, @Cast("unsigned") int flags);
    }
    public native Write_uncoded_frame_AVFormatContext_int_PointerPointer_int write_uncoded_frame(); public native AVOutputFormat write_uncoded_frame(Write_uncoded_frame_AVFormatContext_int_PointerPointer_int setter);
    /**
     * Returns device list with it properties.
     * @see avdevice_list_devices() for more details.
     */
    public static class Get_device_list_AVFormatContext_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_device_list_AVFormatContext_Pointer(Pointer p) { super(p); }
        protected Get_device_list_AVFormatContext_Pointer() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, @Cast("AVDeviceInfoList*") Pointer device_list);
    }
    public native Get_device_list_AVFormatContext_Pointer get_device_list(); public native AVOutputFormat get_device_list(Get_device_list_AVFormatContext_Pointer setter);
// #if LIBAVFORMAT_VERSION_MAJOR < 59
    /**
     * Initialize device capabilities submodule.
     * @see avdevice_capabilities_create() for more details.
     */
    public static class Create_device_capabilities_AVFormatContext_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Create_device_capabilities_AVFormatContext_Pointer(Pointer p) { super(p); }
        protected Create_device_capabilities_AVFormatContext_Pointer() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, @Cast("AVDeviceCapabilitiesQuery*") Pointer caps);
    }
    public native Create_device_capabilities_AVFormatContext_Pointer create_device_capabilities(); public native AVOutputFormat create_device_capabilities(Create_device_capabilities_AVFormatContext_Pointer setter);
    /**
     * Free device capabilities submodule.
     * @see avdevice_capabilities_free() for more details.
     */
    public static class Free_device_capabilities_AVFormatContext_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_device_capabilities_AVFormatContext_Pointer(Pointer p) { super(p); }
        protected Free_device_capabilities_AVFormatContext_Pointer() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, @Cast("AVDeviceCapabilitiesQuery*") Pointer caps);
    }
    public native Free_device_capabilities_AVFormatContext_Pointer free_device_capabilities(); public native AVOutputFormat free_device_capabilities(Free_device_capabilities_AVFormatContext_Pointer setter);
// #endif
    /** default data codec */
    public native @Cast("AVCodecID") int data_codec(); public native AVOutputFormat data_codec(int setter);
    /**
     * Initialize format. May allocate data here, and set any AVFormatContext or
     * AVStream parameters that need to be set before packets are sent.
     * This method must not write output.
     *
     * Return 0 if streams were fully configured, 1 if not, negative AVERROR on failure
     *
     * Any allocations made here must be freed in deinit().
     */
    public static class Init_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Init_AVFormatContext(Pointer p) { super(p); }
        protected Init_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Init_AVFormatContext init(); public native AVOutputFormat init(Init_AVFormatContext setter);
    /**
     * Deinitialize format. If present, this is called whenever the muxer is being
     * destroyed, regardless of whether or not the header has been written.
     *
     * If a trailer is being written, this is called after write_trailer().
     *
     * This is called if init() fails as well.
     */
    public static class Deinit_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Deinit_AVFormatContext(Pointer p) { super(p); }
        protected Deinit_AVFormatContext() { allocate(); }
        private native void allocate();
        public native void call(AVFormatContext arg0);
    }
    public native Deinit_AVFormatContext deinit(); public native AVOutputFormat deinit(Deinit_AVFormatContext setter);
    /**
     * Set up any necessary bitstream filtering and extract any extra data needed
     * for the global header.
     * Return 0 if more packets from this stream must be checked; 1 if not.
     */
    public static class Check_bitstream_AVFormatContext_AVPacket extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Check_bitstream_AVFormatContext_AVPacket(Pointer p) { super(p); }
        protected Check_bitstream_AVFormatContext_AVPacket() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, @Const AVPacket pkt);
    }
    public native Check_bitstream_AVFormatContext_AVPacket check_bitstream(); public native AVOutputFormat check_bitstream(Check_bitstream_AVFormatContext_AVPacket setter);
}
