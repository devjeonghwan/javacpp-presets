// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DummyDataParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DummyDataParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DummyDataParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DummyDataParameter position(long position) {
        return (DummyDataParameter)super.position(position);
    }
    @Override public DummyDataParameter getPointer(long i) {
        return new DummyDataParameter((Pointer)this).offsetAddress(i);
    }

  public DummyDataParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DummyDataParameter(@Const @ByRef DummyDataParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef DummyDataParameter from);

  public native @ByRef @Name("operator =") DummyDataParameter put(@Const @ByRef DummyDataParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef DummyDataParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const DummyDataParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(DummyDataParameter other);
  

  // implements Message ----------------------------------------------

  public native final DummyDataParameter New();

  public native final DummyDataParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef DummyDataParameter from);
  public native void MergeFrom(@Const @ByRef DummyDataParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated .caffe.FillerParameter data_filler = 1;
  public native int data_filler_size();
  public native void clear_data_filler();
  @MemberGetter public static native int kDataFillerFieldNumber();
  public static final int kDataFillerFieldNumber = kDataFillerFieldNumber();
  public native FillerParameter mutable_data_filler(int index);
  public native @Const @ByRef FillerParameter data_filler(int index);
  public native FillerParameter add_data_filler();

  // repeated uint32 num = 2;
  public native int num_size();
  public native void clear_num();
  @MemberGetter public static native int kNumFieldNumber();
  public static final int kNumFieldNumber = kNumFieldNumber();
  public native @Cast("google::protobuf::uint32") int num(int index);
  public native void set_num(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_num(@Cast("google::protobuf::uint32") int value);

  // repeated uint32 channels = 3;
  public native int channels_size();
  public native void clear_channels();
  @MemberGetter public static native int kChannelsFieldNumber();
  public static final int kChannelsFieldNumber = kChannelsFieldNumber();
  public native @Cast("google::protobuf::uint32") int channels(int index);
  public native void set_channels(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_channels(@Cast("google::protobuf::uint32") int value);

  // repeated uint32 height = 4;
  public native int height_size();
  public native void clear_height();
  @MemberGetter public static native int kHeightFieldNumber();
  public static final int kHeightFieldNumber = kHeightFieldNumber();
  public native @Cast("google::protobuf::uint32") int height(int index);
  public native void set_height(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_height(@Cast("google::protobuf::uint32") int value);

  // repeated uint32 width = 5;
  public native int width_size();
  public native void clear_width();
  @MemberGetter public static native int kWidthFieldNumber();
  public static final int kWidthFieldNumber = kWidthFieldNumber();
  public native @Cast("google::protobuf::uint32") int width(int index);
  public native void set_width(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_width(@Cast("google::protobuf::uint32") int value);

  // repeated .caffe.BlobShape shape = 6;
  public native int shape_size();
  public native void clear_shape();
  @MemberGetter public static native int kShapeFieldNumber();
  public static final int kShapeFieldNumber = kShapeFieldNumber();
  public native BlobShape mutable_shape(int index);
  public native @Const @ByRef BlobShape shape(int index);
  public native BlobShape add_shape();
}
