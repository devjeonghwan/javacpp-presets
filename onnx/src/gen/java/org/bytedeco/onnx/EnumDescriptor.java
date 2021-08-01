// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Describes an enum type defined in a .proto file.  To get the EnumDescriptor
// for a generated enum type, call TypeName_descriptor().  Use DescriptorPool
// to construct your own descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class EnumDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnumDescriptor(Pointer p) { super(p); }


  // The name of this enum type in the containing scope.
  public native @StdString BytePointer name();

  // The fully-qualified name of the enum type, scope delimited by periods.
  public native @StdString BytePointer full_name();

  // Index of this enum within the file or containing message's enum array.
  public native int index();

  // The .proto file in which this enum type was defined.  Never nullptr.
  public native @Const FileDescriptor file();

  // The number of values for this EnumDescriptor.  Guaranteed to be greater
  // than zero.
  public native int value_count();
  // Gets a value by index, where 0 <= index < value_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const EnumValueDescriptor value(int index);

  // Looks up a value by name.  Returns nullptr if no such value exists.
  public native @Const EnumValueDescriptor FindValueByName(@StdString BytePointer name);
  public native @Const EnumValueDescriptor FindValueByName(@StdString String name);
  // Looks up a value by number.  Returns nullptr if no such value exists.  If
  // multiple values have this number, the first one defined is returned.
  public native @Const EnumValueDescriptor FindValueByNumber(int number);

  // If this enum type is nested in a message type, this is that message type.
  // Otherwise, nullptr.
  public native @Cast("const google::protobuf::Descriptor*") Pointer containing_type();

  // Get options for this enum type.  These are specified in the .proto file by
  // placing lines like "option foo = 1234;" in the enum definition.  Allowed
  // options are defined by EnumOptions in descriptor.proto, and any available
  // extensions of that message.
  public native @Const @ByRef EnumOptions options();

  // See Descriptor::CopyTo().
  public native void CopyTo(EnumDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);

  // Returns true if this is a placeholder for an unknown enum. This will
  // only be the case if this descriptor comes from a DescriptorPool
  // with AllowUnknownDependencies() set.
  public native @Cast("bool") boolean is_placeholder();

  // Reserved fields -------------------------------------------------

  // A range of reserved field numbers.
  public static class ReservedRange extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public ReservedRange() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public ReservedRange(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public ReservedRange(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public ReservedRange position(long position) {
          return (ReservedRange)super.position(position);
      }
      @Override public ReservedRange getPointer(long i) {
          return new ReservedRange((Pointer)this).offsetAddress(i);
      }
  
    public native int start(); public native ReservedRange start(int setter);  // inclusive
    public native int end(); public native ReservedRange end(int setter);    // inclusive
  }

  // The number of reserved ranges in this message type.
  public native int reserved_range_count();
  // Gets an reserved range by index, where 0 <= index <
  // reserved_range_count(). These are returned in the order they were defined
  // in the .proto file.
  public native @Const ReservedRange reserved_range(int index);

  // Returns true if the number is in one of the reserved ranges.
  public native @Cast("bool") boolean IsReservedNumber(int number);

  // Returns nullptr if no reserved range contains the given number.
  public native @Const ReservedRange FindReservedRangeContainingNumber(
        int number);

  // The number of reserved field names in this message type.
  public native int reserved_name_count();

  // Gets a reserved name by index, where 0 <= index < reserved_name_count().
  public native @StdString BytePointer reserved_name(int index);

  // Returns true if the field name is reserved.
  public native @Cast("bool") boolean IsReservedName(@StdString BytePointer name);
  public native @Cast("bool") boolean IsReservedName(@StdString String name);

  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this enum declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}
