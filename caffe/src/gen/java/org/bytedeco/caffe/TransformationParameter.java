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
public class TransformationParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformationParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TransformationParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TransformationParameter position(long position) {
        return (TransformationParameter)super.position(position);
    }
    @Override public TransformationParameter getPointer(long i) {
        return new TransformationParameter((Pointer)this).offsetAddress(i);
    }

  public TransformationParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TransformationParameter(@Const @ByRef TransformationParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TransformationParameter from);

  public native @ByRef @Name("operator =") TransformationParameter put(@Const @ByRef TransformationParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef TransformationParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TransformationParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TransformationParameter other);
  

  // implements Message ----------------------------------------------

  public native final TransformationParameter New();

  public native final TransformationParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef TransformationParameter from);
  public native void MergeFrom(@Const @ByRef TransformationParameter from);
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

  // repeated float mean_value = 5;
  public native int mean_value_size();
  public native void clear_mean_value();
  @MemberGetter public static native int kMeanValueFieldNumber();
  public static final int kMeanValueFieldNumber = kMeanValueFieldNumber();
  public native float mean_value(int index);
  public native void set_mean_value(int index, float value);
  public native void add_mean_value(float value);

  // optional string mean_file = 4;
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

  // optional uint32 crop_size = 3 [default = 0];
  public native @Cast("bool") boolean has_crop_size();
  public native void clear_crop_size();
  @MemberGetter public static native int kCropSizeFieldNumber();
  public static final int kCropSizeFieldNumber = kCropSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int crop_size();
  public native void set_crop_size(@Cast("google::protobuf::uint32") int value);

  // optional bool mirror = 2 [default = false];
  public native @Cast("bool") boolean has_mirror();
  public native void clear_mirror();
  @MemberGetter public static native int kMirrorFieldNumber();
  public static final int kMirrorFieldNumber = kMirrorFieldNumber();
  public native @Cast("bool") boolean mirror();
  public native void set_mirror(@Cast("bool") boolean value);

  // optional bool force_color = 6 [default = false];
  public native @Cast("bool") boolean has_force_color();
  public native void clear_force_color();
  @MemberGetter public static native int kForceColorFieldNumber();
  public static final int kForceColorFieldNumber = kForceColorFieldNumber();
  public native @Cast("bool") boolean force_color();
  public native void set_force_color(@Cast("bool") boolean value);

  // optional bool force_gray = 7 [default = false];
  public native @Cast("bool") boolean has_force_gray();
  public native void clear_force_gray();
  @MemberGetter public static native int kForceGrayFieldNumber();
  public static final int kForceGrayFieldNumber = kForceGrayFieldNumber();
  public native @Cast("bool") boolean force_gray();
  public native void set_force_gray(@Cast("bool") boolean value);

  // optional float scale = 1 [default = 1];
  public native @Cast("bool") boolean has_scale();
  public native void clear_scale();
  @MemberGetter public static native int kScaleFieldNumber();
  public static final int kScaleFieldNumber = kScaleFieldNumber();
  public native float scale();
  public native void set_scale(float value);
}
