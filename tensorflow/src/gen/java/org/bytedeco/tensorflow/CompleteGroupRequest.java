// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CompleteGroupRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompleteGroupRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CompleteGroupRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CompleteGroupRequest position(long position) {
        return (CompleteGroupRequest)super.position(position);
    }
    @Override public CompleteGroupRequest getPointer(long i) {
        return new CompleteGroupRequest((Pointer)this).offsetAddress(i);
    }

  public CompleteGroupRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CompleteGroupRequest(@Const @ByRef CompleteGroupRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CompleteGroupRequest from);

  public native @ByRef @Name("operator =") CompleteGroupRequest put(@Const @ByRef CompleteGroupRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef CompleteGroupRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CompleteGroupRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CompleteGroupRequest other);
  public native void Swap(CompleteGroupRequest other);
  

  // implements Message ----------------------------------------------

  public native CompleteGroupRequest New();

  public native CompleteGroupRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CompleteGroupRequest from);
  public native void MergeFrom(@Const @ByRef CompleteGroupRequest from);
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

  // repeated string device_name = 4;
  public native int device_name_size();
  public native void clear_device_name();
  @MemberGetter public static native int kDeviceNameFieldNumber();
  public static final int kDeviceNameFieldNumber = kDeviceNameFieldNumber();
  public native @StdString BytePointer device_name(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device_name(int index);
  public native void set_device_name(int index, @StdString BytePointer value);
  public native void set_device_name(int index, @StdString String value);
  public native void set_device_name(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device_name(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_device_name();
  public native void add_device_name(@StdString BytePointer value);
  public native void add_device_name(@StdString String value);
  public native void add_device_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_device_name(String value, @Cast("size_t") long size);

  // string device_type = 3;
  public native void clear_device_type();
  @MemberGetter public static native int kDeviceTypeFieldNumber();
  public static final int kDeviceTypeFieldNumber = kDeviceTypeFieldNumber();
  public native @StdString BytePointer device_type();
  public native void set_device_type(@StdString BytePointer value);
  public native void set_device_type(@StdString String value);
  public native void set_device_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_device_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_device_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_device_type();
  public native void set_allocated_device_type(@StdString @Cast({"char*", "std::string*"}) BytePointer device_type);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_device_type();
  public native void unsafe_arena_set_allocated_device_type(
        @StdString @Cast({"char*", "std::string*"}) BytePointer device_type);

  // int32 group_key = 1;
  public native void clear_group_key();
  @MemberGetter public static native int kGroupKeyFieldNumber();
  public static final int kGroupKeyFieldNumber = kGroupKeyFieldNumber();
  public native @Cast("google::protobuf::int32") int group_key();
  public native void set_group_key(@Cast("google::protobuf::int32") int value);

  // int32 group_size = 2;
  public native void clear_group_size();
  @MemberGetter public static native int kGroupSizeFieldNumber();
  public static final int kGroupSizeFieldNumber = kGroupSizeFieldNumber();
  public native @Cast("google::protobuf::int32") int group_size();
  public native void set_group_size(@Cast("google::protobuf::int32") int value);

  // int32 collective_type = 5;
  public native void clear_collective_type();
  @MemberGetter public static native int kCollectiveTypeFieldNumber();
  public static final int kCollectiveTypeFieldNumber = kCollectiveTypeFieldNumber();
  public native @Cast("google::protobuf::int32") int collective_type();
  public native void set_collective_type(@Cast("google::protobuf::int32") int value);
}
