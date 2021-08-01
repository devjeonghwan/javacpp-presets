// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Name("tensorflow::eager::Operation") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Eager_Operation extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Eager_Operation(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Eager_Operation(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Eager_Operation position(long position) {
        return (Eager_Operation)super.position(position);
    }
    @Override public Eager_Operation getPointer(long i) {
        return new Eager_Operation((Pointer)this).offsetAddress(i);
    }

  public Eager_Operation() { super((Pointer)null); allocate(); }
  private native void allocate();

  public Eager_Operation(@Const @ByRef Eager_Operation from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef Eager_Operation from);

  public native @ByRef @Name("operator =") Eager_Operation put(@Const @ByRef Eager_Operation from);

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef Eager_Operation default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const Eager_Operation internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(Eager_Operation other);
  

  // implements Message ----------------------------------------------

  public native Eager_Operation New();

  public native Eager_Operation New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef Eager_Operation from);
  public native void MergeFrom(@Const @ByRef Eager_Operation from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------


  // accessors -------------------------------------------------------

  // repeated .tensorflow.eager.RemoteTensorHandle inputs = 3;
  public native int inputs_size();
  public native void clear_inputs();
  @MemberGetter public static native int kInputsFieldNumber();
  public static final int kInputsFieldNumber = kInputsFieldNumber();
  public native RemoteTensorHandle mutable_inputs(int index);
  public native @Const @ByRef RemoteTensorHandle inputs(int index);
  public native RemoteTensorHandle add_inputs();

  // repeated int64 control_op_ids = 4;
  public native int control_op_ids_size();
  public native void clear_control_op_ids();
  @MemberGetter public static native int kControlOpIdsFieldNumber();
  public static final int kControlOpIdsFieldNumber = kControlOpIdsFieldNumber();
  public native @Cast("google::protobuf::int64") long control_op_ids(int index);
  public native void set_control_op_ids(int index, @Cast("google::protobuf::int64") long value);
  public native void add_control_op_ids(@Cast("google::protobuf::int64") long value);

  // map<string, .tensorflow.AttrValue> attrs = 5;
  public native int attrs_size();
  public native void clear_attrs();
  @MemberGetter public static native int kAttrsFieldNumber();
  public static final int kAttrsFieldNumber = kAttrsFieldNumber();
  public native @Const @ByRef StringAttrValueMap attrs();
  public native StringAttrValueMap mutable_attrs();

  // string name = 2;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string device = 6;
  public native void clear_device();
  @MemberGetter public static native int kDeviceFieldNumber();
  public static final int kDeviceFieldNumber = kDeviceFieldNumber();
  public native @StdString BytePointer device();
  public native void set_device(@StdString BytePointer value);
  public native void set_device(@StdString String value);
  public native void set_device(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device();
  public native void set_allocated_device(@StdString @Cast({"char*", "std::string*"}) BytePointer device);

  // int64 id = 1;
  public native void clear_id();
  @MemberGetter public static native int kIdFieldNumber();
  public static final int kIdFieldNumber = kIdFieldNumber();
  public native @Cast("google::protobuf::int64") long id();
  public native void set_id(@Cast("google::protobuf::int64") long value);
}
