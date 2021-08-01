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
public class OpDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpDef position(long position) {
        return (OpDef)super.position(position);
    }
    @Override public OpDef getPointer(long i) {
        return new OpDef((Pointer)this).offsetAddress(i);
    }

  public OpDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OpDef(@Const @ByRef OpDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OpDef from);

  public native @ByRef @Name("operator =") OpDef put(@Const @ByRef OpDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef OpDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OpDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(OpDef other);
  public native void Swap(OpDef other);
  

  // implements Message ----------------------------------------------

  public native OpDef New();

  public native OpDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OpDef from);
  public native void MergeFrom(@Const @ByRef OpDef from);
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

  // repeated .tensorflow.OpDef.ArgDef input_arg = 2;
  public native int input_arg_size();
  public native void clear_input_arg();
  @MemberGetter public static native int kInputArgFieldNumber();
  public static final int kInputArgFieldNumber = kInputArgFieldNumber();
  public native OpDef_ArgDef mutable_input_arg(int index);
  public native @Const @ByRef OpDef_ArgDef input_arg(int index);
  public native OpDef_ArgDef add_input_arg();

  // repeated .tensorflow.OpDef.ArgDef output_arg = 3;
  public native int output_arg_size();
  public native void clear_output_arg();
  @MemberGetter public static native int kOutputArgFieldNumber();
  public static final int kOutputArgFieldNumber = kOutputArgFieldNumber();
  public native OpDef_ArgDef mutable_output_arg(int index);
  public native @Const @ByRef OpDef_ArgDef output_arg(int index);
  public native OpDef_ArgDef add_output_arg();

  // repeated .tensorflow.OpDef.AttrDef attr = 4;
  public native int attr_size();
  public native void clear_attr();
  @MemberGetter public static native int kAttrFieldNumber();
  public static final int kAttrFieldNumber = kAttrFieldNumber();
  public native OpDef_AttrDef mutable_attr(int index);
  public native @Const @ByRef OpDef_AttrDef attr(int index);
  public native OpDef_AttrDef add_attr();

  // repeated string control_output = 20;
  public native int control_output_size();
  public native void clear_control_output();
  @MemberGetter public static native int kControlOutputFieldNumber();
  public static final int kControlOutputFieldNumber = kControlOutputFieldNumber();
  public native @StdString BytePointer control_output(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_control_output(int index);
  public native void set_control_output(int index, @StdString BytePointer value);
  public native void set_control_output(int index, @StdString String value);
  public native void set_control_output(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_control_output(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_control_output();
  public native void add_control_output(@StdString BytePointer value);
  public native void add_control_output(@StdString String value);
  public native void add_control_output(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_control_output(String value, @Cast("size_t") long size);

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

  // string summary = 5;
  public native void clear_summary();
  @MemberGetter public static native int kSummaryFieldNumber();
  public static final int kSummaryFieldNumber = kSummaryFieldNumber();
  public native @StdString BytePointer summary();
  public native void set_summary(@StdString BytePointer value);
  public native void set_summary(@StdString String value);
  public native void set_summary(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_summary(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_summary();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_summary();
  public native void set_allocated_summary(@StdString @Cast({"char*", "std::string*"}) BytePointer summary);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_summary();
  public native void unsafe_arena_set_allocated_summary(
        @StdString @Cast({"char*", "std::string*"}) BytePointer summary);

  // string description = 6;
  public native void clear_description();
  @MemberGetter public static native int kDescriptionFieldNumber();
  public static final int kDescriptionFieldNumber = kDescriptionFieldNumber();
  public native @StdString BytePointer description();
  public native void set_description(@StdString BytePointer value);
  public native void set_description(@StdString String value);
  public native void set_description(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description();
  public native void set_allocated_description(@StdString @Cast({"char*", "std::string*"}) BytePointer description);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description();
  public native void unsafe_arena_set_allocated_description(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description);

  // .tensorflow.OpDeprecation deprecation = 8;
  public native @Cast("bool") boolean has_deprecation();
  public native void clear_deprecation();
  @MemberGetter public static native int kDeprecationFieldNumber();
  public static final int kDeprecationFieldNumber = kDeprecationFieldNumber();
  public native @Const @ByRef OpDeprecation deprecation();
  public native OpDeprecation release_deprecation();
  public native OpDeprecation mutable_deprecation();
  public native void set_allocated_deprecation(OpDeprecation deprecation);
  public native void unsafe_arena_set_allocated_deprecation(
        OpDeprecation deprecation);
  public native OpDeprecation unsafe_arena_release_deprecation();

  // bool is_commutative = 18;
  public native void clear_is_commutative();
  @MemberGetter public static native int kIsCommutativeFieldNumber();
  public static final int kIsCommutativeFieldNumber = kIsCommutativeFieldNumber();
  public native @Cast("bool") boolean is_commutative();
  public native void set_is_commutative(@Cast("bool") boolean value);

  // bool is_aggregate = 16;
  public native void clear_is_aggregate();
  @MemberGetter public static native int kIsAggregateFieldNumber();
  public static final int kIsAggregateFieldNumber = kIsAggregateFieldNumber();
  public native @Cast("bool") boolean is_aggregate();
  public native void set_is_aggregate(@Cast("bool") boolean value);

  // bool is_stateful = 17;
  public native void clear_is_stateful();
  @MemberGetter public static native int kIsStatefulFieldNumber();
  public static final int kIsStatefulFieldNumber = kIsStatefulFieldNumber();
  public native @Cast("bool") boolean is_stateful();
  public native void set_is_stateful(@Cast("bool") boolean value);

  // bool allows_uninitialized_input = 19;
  public native void clear_allows_uninitialized_input();
  @MemberGetter public static native int kAllowsUninitializedInputFieldNumber();
  public static final int kAllowsUninitializedInputFieldNumber = kAllowsUninitializedInputFieldNumber();
  public native @Cast("bool") boolean allows_uninitialized_input();
  public native void set_allows_uninitialized_input(@Cast("bool") boolean value);
}
