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
public class FunctionDef_ArgAttrs extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionDef_ArgAttrs(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionDef_ArgAttrs(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FunctionDef_ArgAttrs position(long position) {
        return (FunctionDef_ArgAttrs)super.position(position);
    }
    @Override public FunctionDef_ArgAttrs getPointer(long i) {
        return new FunctionDef_ArgAttrs((Pointer)this).offsetAddress(i);
    }

  public FunctionDef_ArgAttrs() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FunctionDef_ArgAttrs(@Const @ByRef FunctionDef_ArgAttrs from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef FunctionDef_ArgAttrs from);

  public native @ByRef @Name("operator =") FunctionDef_ArgAttrs put(@Const @ByRef FunctionDef_ArgAttrs from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef FunctionDef_ArgAttrs default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const FunctionDef_ArgAttrs internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(FunctionDef_ArgAttrs other);
  public native void Swap(FunctionDef_ArgAttrs other);
  

  // implements Message ----------------------------------------------

  public native FunctionDef_ArgAttrs New();

  public native FunctionDef_ArgAttrs New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef FunctionDef_ArgAttrs from);
  public native void MergeFrom(@Const @ByRef FunctionDef_ArgAttrs from);
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

  // map<string, .tensorflow.AttrValue> attr = 1;
  public native int attr_size();
  public native void clear_attr();
  @MemberGetter public static native int kAttrFieldNumber();
  public static final int kAttrFieldNumber = kAttrFieldNumber();
  public native @Const @ByRef StringAttrValueMap attr();
  public native StringAttrValueMap mutable_attr();
}
