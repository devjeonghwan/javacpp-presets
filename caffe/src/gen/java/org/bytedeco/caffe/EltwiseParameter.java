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
public class EltwiseParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EltwiseParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EltwiseParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EltwiseParameter position(long position) {
        return (EltwiseParameter)super.position(position);
    }
    @Override public EltwiseParameter getPointer(long i) {
        return new EltwiseParameter((Pointer)this).offsetAddress(i);
    }

  public EltwiseParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public EltwiseParameter(@Const @ByRef EltwiseParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef EltwiseParameter from);

  public native @ByRef @Name("operator =") EltwiseParameter put(@Const @ByRef EltwiseParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef EltwiseParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const EltwiseParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(EltwiseParameter other);
  

  // implements Message ----------------------------------------------

  public native final EltwiseParameter New();

  public native final EltwiseParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef EltwiseParameter from);
  public native void MergeFrom(@Const @ByRef EltwiseParameter from);
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
  @MemberGetter public static native @Cast("const caffe::EltwiseParameter::EltwiseOp") int PROD();
  public static final int PROD = PROD();
  @MemberGetter public static native @Cast("const caffe::EltwiseParameter::EltwiseOp") int SUM();
  public static final int SUM = SUM();
  @MemberGetter public static native @Cast("const caffe::EltwiseParameter::EltwiseOp") int MAX();
  public static final int MAX = MAX();
  public static native @Cast("bool") boolean EltwiseOp_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::EltwiseParameter::EltwiseOp") int EltwiseOp_MIN();
  public static final int EltwiseOp_MIN = EltwiseOp_MIN();
  @MemberGetter public static native @Cast("const caffe::EltwiseParameter::EltwiseOp") int EltwiseOp_MAX();
  public static final int EltwiseOp_MAX = EltwiseOp_MAX();
  @MemberGetter public static native int EltwiseOp_ARRAYSIZE();
  public static final int EltwiseOp_ARRAYSIZE = EltwiseOp_ARRAYSIZE();
  public static native @Const EnumDescriptor EltwiseOp_descriptor();
  public static native @StdString BytePointer EltwiseOp_Name(@Cast("caffe::EltwiseParameter::EltwiseOp") int value);
  public static native @Cast("bool") boolean EltwiseOp_Parse(@StdString BytePointer name,
        @Cast("caffe::EltwiseParameter::EltwiseOp*") IntPointer value);
  public static native @Cast("bool") boolean EltwiseOp_Parse(@StdString String name,
        @Cast("caffe::EltwiseParameter::EltwiseOp*") IntBuffer value);
  public static native @Cast("bool") boolean EltwiseOp_Parse(@StdString BytePointer name,
        @Cast("caffe::EltwiseParameter::EltwiseOp*") int[] value);
  public static native @Cast("bool") boolean EltwiseOp_Parse(@StdString String name,
        @Cast("caffe::EltwiseParameter::EltwiseOp*") IntPointer value);
  public static native @Cast("bool") boolean EltwiseOp_Parse(@StdString BytePointer name,
        @Cast("caffe::EltwiseParameter::EltwiseOp*") IntBuffer value);
  public static native @Cast("bool") boolean EltwiseOp_Parse(@StdString String name,
        @Cast("caffe::EltwiseParameter::EltwiseOp*") int[] value);

  // accessors -------------------------------------------------------

  // repeated float coeff = 2;
  public native int coeff_size();
  public native void clear_coeff();
  @MemberGetter public static native int kCoeffFieldNumber();
  public static final int kCoeffFieldNumber = kCoeffFieldNumber();
  public native float coeff(int index);
  public native void set_coeff(int index, float value);
  public native void add_coeff(float value);

  // optional .caffe.EltwiseParameter.EltwiseOp operation = 1 [default = SUM];
  public native @Cast("bool") boolean has_operation();
  public native void clear_operation();
  @MemberGetter public static native int kOperationFieldNumber();
  public static final int kOperationFieldNumber = kOperationFieldNumber();
  public native @Cast("caffe::EltwiseParameter_EltwiseOp") int operation();
  public native void set_operation(@Cast("caffe::EltwiseParameter_EltwiseOp") int value);

  // optional bool stable_prod_grad = 3 [default = true];
  public native @Cast("bool") boolean has_stable_prod_grad();
  public native void clear_stable_prod_grad();
  @MemberGetter public static native int kStableProdGradFieldNumber();
  public static final int kStableProdGradFieldNumber = kStableProdGradFieldNumber();
  public native @Cast("bool") boolean stable_prod_grad();
  public native void set_stable_prod_grad(@Cast("bool") boolean value);
}
