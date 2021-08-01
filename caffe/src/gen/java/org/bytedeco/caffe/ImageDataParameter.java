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
public class ImageDataParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImageDataParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImageDataParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ImageDataParameter position(long position) {
        return (ImageDataParameter)super.position(position);
    }
    @Override public ImageDataParameter getPointer(long i) {
        return new ImageDataParameter((Pointer)this).offsetAddress(i);
    }

  public ImageDataParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ImageDataParameter(@Const @ByRef ImageDataParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ImageDataParameter from);

  public native @ByRef @Name("operator =") ImageDataParameter put(@Const @ByRef ImageDataParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ImageDataParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ImageDataParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ImageDataParameter other);
  

  // implements Message ----------------------------------------------

  public native final ImageDataParameter New();

  public native final ImageDataParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ImageDataParameter from);
  public native void MergeFrom(@Const @ByRef ImageDataParameter from);
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

  // optional string source = 1;
  public native @Cast("bool") boolean has_source();
  public native void clear_source();
  @MemberGetter public static native int kSourceFieldNumber();
  public static final int kSourceFieldNumber = kSourceFieldNumber();
  public native @StdString BytePointer source();
  public native void set_source(@StdString BytePointer value);
  public native void set_source(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_source(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_source(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_source();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_source();
  public native void set_allocated_source(@StdString @Cast({"char*", "std::string*"}) BytePointer source);

  // optional string mean_file = 3;
  public native @Cast("bool") boolean has_mean_file();
  public native void clear_mean_file();
  @MemberGetter public static native int kMeanFileFieldNumber();
  public static final int kMeanFileFieldNumber = kMeanFileFieldNumber();
  public native @StdString BytePointer mean_file();
  public native void set_mean_file(@StdString BytePointer value);
  public native void set_mean_file(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_mean_file(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_mean_file(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_mean_file();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_mean_file();
  public native void set_allocated_mean_file(@StdString @Cast({"char*", "std::string*"}) BytePointer mean_file);

  // optional string root_folder = 12 [default = ""];
  public native @Cast("bool") boolean has_root_folder();
  public native void clear_root_folder();
  @MemberGetter public static native int kRootFolderFieldNumber();
  public static final int kRootFolderFieldNumber = kRootFolderFieldNumber();
  public native @StdString BytePointer root_folder();
  public native void set_root_folder(@StdString BytePointer value);
  public native void set_root_folder(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_root_folder(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_root_folder(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_root_folder();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_root_folder();
  public native void set_allocated_root_folder(@StdString @Cast({"char*", "std::string*"}) BytePointer root_folder);

  // optional uint32 crop_size = 5 [default = 0];
  public native @Cast("bool") boolean has_crop_size();
  public native void clear_crop_size();
  @MemberGetter public static native int kCropSizeFieldNumber();
  public static final int kCropSizeFieldNumber = kCropSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int crop_size();
  public native void set_crop_size(@Cast("google::protobuf::uint32") int value);

  // optional uint32 rand_skip = 7 [default = 0];
  public native @Cast("bool") boolean has_rand_skip();
  public native void clear_rand_skip();
  @MemberGetter public static native int kRandSkipFieldNumber();
  public static final int kRandSkipFieldNumber = kRandSkipFieldNumber();
  public native @Cast("google::protobuf::uint32") int rand_skip();
  public native void set_rand_skip(@Cast("google::protobuf::uint32") int value);

  // optional bool shuffle = 8 [default = false];
  public native @Cast("bool") boolean has_shuffle();
  public native void clear_shuffle();
  @MemberGetter public static native int kShuffleFieldNumber();
  public static final int kShuffleFieldNumber = kShuffleFieldNumber();
  public native @Cast("bool") boolean shuffle();
  public native void set_shuffle(@Cast("bool") boolean value);

  // optional bool mirror = 6 [default = false];
  public native @Cast("bool") boolean has_mirror();
  public native void clear_mirror();
  @MemberGetter public static native int kMirrorFieldNumber();
  public static final int kMirrorFieldNumber = kMirrorFieldNumber();
  public native @Cast("bool") boolean mirror();
  public native void set_mirror(@Cast("bool") boolean value);

  // optional uint32 new_height = 9 [default = 0];
  public native @Cast("bool") boolean has_new_height();
  public native void clear_new_height();
  @MemberGetter public static native int kNewHeightFieldNumber();
  public static final int kNewHeightFieldNumber = kNewHeightFieldNumber();
  public native @Cast("google::protobuf::uint32") int new_height();
  public native void set_new_height(@Cast("google::protobuf::uint32") int value);

  // optional uint32 new_width = 10 [default = 0];
  public native @Cast("bool") boolean has_new_width();
  public native void clear_new_width();
  @MemberGetter public static native int kNewWidthFieldNumber();
  public static final int kNewWidthFieldNumber = kNewWidthFieldNumber();
  public native @Cast("google::protobuf::uint32") int new_width();
  public native void set_new_width(@Cast("google::protobuf::uint32") int value);

  // optional bool is_color = 11 [default = true];
  public native @Cast("bool") boolean has_is_color();
  public native void clear_is_color();
  @MemberGetter public static native int kIsColorFieldNumber();
  public static final int kIsColorFieldNumber = kIsColorFieldNumber();
  public native @Cast("bool") boolean is_color();
  public native void set_is_color(@Cast("bool") boolean value);

  // optional float scale = 2 [default = 1];
  public native @Cast("bool") boolean has_scale();
  public native void clear_scale();
  @MemberGetter public static native int kScaleFieldNumber();
  public static final int kScaleFieldNumber = kScaleFieldNumber();
  public native float scale();
  public native void set_scale(float value);

  // optional uint32 batch_size = 4 [default = 1];
  public native @Cast("bool") boolean has_batch_size();
  public native void clear_batch_size();
  @MemberGetter public static native int kBatchSizeFieldNumber();
  public static final int kBatchSizeFieldNumber = kBatchSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int batch_size();
  public native void set_batch_size(@Cast("google::protobuf::uint32") int value);
}
