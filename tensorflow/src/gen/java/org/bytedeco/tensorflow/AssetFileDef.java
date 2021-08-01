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
public class AssetFileDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AssetFileDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AssetFileDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AssetFileDef position(long position) {
        return (AssetFileDef)super.position(position);
    }
    @Override public AssetFileDef getPointer(long i) {
        return new AssetFileDef((Pointer)this).offsetAddress(i);
    }

  public AssetFileDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public AssetFileDef(@Const @ByRef AssetFileDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef AssetFileDef from);

  public native @ByRef @Name("operator =") AssetFileDef put(@Const @ByRef AssetFileDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef AssetFileDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const AssetFileDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(AssetFileDef other);
  public native void Swap(AssetFileDef other);
  

  // implements Message ----------------------------------------------

  public native AssetFileDef New();

  public native AssetFileDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef AssetFileDef from);
  public native void MergeFrom(@Const @ByRef AssetFileDef from);
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

  // string filename = 2;
  public native void clear_filename();
  @MemberGetter public static native int kFilenameFieldNumber();
  public static final int kFilenameFieldNumber = kFilenameFieldNumber();
  public native @StdString BytePointer filename();
  public native void set_filename(@StdString BytePointer value);
  public native void set_filename(@StdString String value);
  public native void set_filename(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_filename(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_filename();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_filename();
  public native void set_allocated_filename(@StdString @Cast({"char*", "std::string*"}) BytePointer filename);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_filename();
  public native void unsafe_arena_set_allocated_filename(
        @StdString @Cast({"char*", "std::string*"}) BytePointer filename);

  // .tensorflow.TensorInfo tensor_info = 1;
  public native @Cast("bool") boolean has_tensor_info();
  public native void clear_tensor_info();
  @MemberGetter public static native int kTensorInfoFieldNumber();
  public static final int kTensorInfoFieldNumber = kTensorInfoFieldNumber();
  public native @Const @ByRef TensorInfo tensor_info();
  public native TensorInfo release_tensor_info();
  public native TensorInfo mutable_tensor_info();
  public native void set_allocated_tensor_info(TensorInfo tensor_info);
  public native void unsafe_arena_set_allocated_tensor_info(
        TensorInfo tensor_info);
  public native TensorInfo unsafe_arena_release_tensor_info();
}
