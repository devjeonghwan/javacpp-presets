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
public class RewriterConfig_CustomGraphOptimizer extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RewriterConfig_CustomGraphOptimizer(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RewriterConfig_CustomGraphOptimizer(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RewriterConfig_CustomGraphOptimizer position(long position) {
        return (RewriterConfig_CustomGraphOptimizer)super.position(position);
    }
    @Override public RewriterConfig_CustomGraphOptimizer getPointer(long i) {
        return new RewriterConfig_CustomGraphOptimizer((Pointer)this).offsetAddress(i);
    }

  public RewriterConfig_CustomGraphOptimizer() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RewriterConfig_CustomGraphOptimizer(@Const @ByRef RewriterConfig_CustomGraphOptimizer from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RewriterConfig_CustomGraphOptimizer from);

  public native @ByRef @Name("operator =") RewriterConfig_CustomGraphOptimizer put(@Const @ByRef RewriterConfig_CustomGraphOptimizer from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RewriterConfig_CustomGraphOptimizer default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RewriterConfig_CustomGraphOptimizer internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RewriterConfig_CustomGraphOptimizer other);
  public native void Swap(RewriterConfig_CustomGraphOptimizer other);
  

  // implements Message ----------------------------------------------

  public native RewriterConfig_CustomGraphOptimizer New();

  public native RewriterConfig_CustomGraphOptimizer New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RewriterConfig_CustomGraphOptimizer from);
  public native void MergeFrom(@Const @ByRef RewriterConfig_CustomGraphOptimizer from);
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

  // map<string, .tensorflow.AttrValue> parameter_map = 2;
  public native int parameter_map_size();
  public native void clear_parameter_map();
  @MemberGetter public static native int kParameterMapFieldNumber();
  public static final int kParameterMapFieldNumber = kParameterMapFieldNumber();
  public native @Const @ByRef StringAttrValueMap parameter_map();
  public native StringAttrValueMap mutable_parameter_map();

  // string name = 1;
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
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);
}
