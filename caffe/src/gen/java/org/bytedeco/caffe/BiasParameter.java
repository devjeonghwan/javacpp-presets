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
public class BiasParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BiasParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BiasParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BiasParameter position(long position) {
        return (BiasParameter)super.position(position);
    }
    @Override public BiasParameter getPointer(long i) {
        return new BiasParameter((Pointer)this).offsetAddress(i);
    }

  public BiasParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public BiasParameter(@Const @ByRef BiasParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef BiasParameter from);

  public native @ByRef @Name("operator =") BiasParameter put(@Const @ByRef BiasParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef BiasParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const BiasParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(BiasParameter other);
  

  // implements Message ----------------------------------------------

  public native final BiasParameter New();

  public native final BiasParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef BiasParameter from);
  public native void MergeFrom(@Const @ByRef BiasParameter from);
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

  // optional .caffe.FillerParameter filler = 3;
  public native @Cast("bool") boolean has_filler();
  public native void clear_filler();
  @MemberGetter public static native int kFillerFieldNumber();
  public static final int kFillerFieldNumber = kFillerFieldNumber();
  public native @Const @ByRef FillerParameter filler();
  public native FillerParameter release_filler();
  public native FillerParameter mutable_filler();
  public native void set_allocated_filler(FillerParameter filler);

  // optional int32 axis = 1 [default = 1];
  public native @Cast("bool") boolean has_axis();
  public native void clear_axis();
  @MemberGetter public static native int kAxisFieldNumber();
  public static final int kAxisFieldNumber = kAxisFieldNumber();
  public native @Cast("google::protobuf::int32") int axis();
  public native void set_axis(@Cast("google::protobuf::int32") int value);

  // optional int32 num_axes = 2 [default = 1];
  public native @Cast("bool") boolean has_num_axes();
  public native void clear_num_axes();
  @MemberGetter public static native int kNumAxesFieldNumber();
  public static final int kNumAxesFieldNumber = kNumAxesFieldNumber();
  public native @Cast("google::protobuf::int32") int num_axes();
  public native void set_num_axes(@Cast("google::protobuf::int32") int value);
}
