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


// This interface contains methods that can be used to dynamically access
// and modify the fields of a protocol message.  Their semantics are
// similar to the accessors the protocol compiler generates.
//
// To get the Reflection for a given Message, call Message::GetReflection().
//
// This interface is separate from Message only for efficiency reasons;
// the vast majority of implementations of Message will share the same
// implementation of Reflection (GeneratedMessageReflection,
// defined in generated_message.h), and all Messages of a particular class
// should share the same Reflection object (though you should not rely on
// the latter fact).
//
// There are several ways that these methods can be used incorrectly.  For
// example, any of the following conditions will lead to undefined
// results (probably assertion failures):
// - The FieldDescriptor is not a field of this message type.
// - The method called is not appropriate for the field's type.  For
//   each field type in FieldDescriptor::TYPE_*, there is only one
//   Get*() method, one Set*() method, and one Add*() method that is
//   valid for that type.  It should be obvious which (except maybe
//   for TYPE_BYTES, which are represented using strings in C++).
// - A Get*() or Set*() method for singular fields is called on a repeated
//   field.
// - GetRepeated*(), SetRepeated*(), or Add*() is called on a non-repeated
//   field.
// - The Message object passed to any method is not of the right type for
//   this Reflection object (i.e. message.GetReflection() != reflection).
//
// You might wonder why there is not any abstract representation for a field
// of arbitrary type.  E.g., why isn't there just a "GetField()" method that
// returns "const Field&", where "Field" is some class with accessors like
// "GetInt32Value()".  The problem is that someone would have to deal with
// allocating these Field objects.  For generated message classes, having to
// allocate space for an additional object to wrap every field would at least
// double the message's memory footprint, probably worse.  Allocating the
// objects on-demand, on the other hand, would be expensive and prone to
// memory leaks.  So, instead we ended up with this flat interface.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class Reflection extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Reflection(Pointer p) { super(p); }


  // Get the UnknownFieldSet for the message.  This contains fields which
  // were seen when the Message was parsed but were not recognized according
  // to the Message's definition.
  public native @Const @ByRef UnknownFieldSet GetUnknownFields(
        @Const @ByRef Message message);
  // Get a mutable pointer to the UnknownFieldSet for the message.  This
  // contains fields which were seen when the Message was parsed but were not
  // recognized according to the Message's definition.
  public native UnknownFieldSet MutableUnknownFields(Message message);

  // Estimate the amount of memory used by the message object.
  public native @Cast("size_t") long SpaceUsedLong(@Const @ByRef Message message);

  public native int SpaceUsed(@Const @ByRef Message message);

  // Check if the given non-repeated field is set.
  public native @Cast("bool") boolean HasField(@Const @ByRef Message message,
                          @Const FieldDescriptor field);

  // Get the number of elements of a repeated field.
  public native int FieldSize(@Const @ByRef Message message,
                          @Const FieldDescriptor field);

  // Clear the value of a field, so that HasField() returns false or
  // FieldSize() returns zero.
  public native void ClearField(Message message,
                            @Const FieldDescriptor field);

  // Check if the oneof is set. Returns true if any field in oneof
  // is set, false otherwise.
  // TODO(jieluo) - make it pure virtual after updating all
  // the subclasses.
  public native @Cast("bool") boolean HasOneof(@Const @ByRef Message arg0,
                          @Const OneofDescriptor arg1);

  public native void ClearOneof(Message arg0,
                            @Const OneofDescriptor arg1);

  // Returns the field descriptor if the oneof is set. NULL otherwise.
  // TODO(jieluo) - make it pure virtual.
  public native @Const FieldDescriptor GetOneofFieldDescriptor(
        @Const @ByRef Message arg0,
        @Const OneofDescriptor arg1);

  // Removes the last element of a repeated field.
  // We don't provide a way to remove any element other than the last
  // because it invites inefficient use, such as O(n^2) filtering loops
  // that should have been O(n).  If you want to remove an element other
  // than the last, the best way to do it is to re-arrange the elements
  // (using Swap()) so that the one you want removed is at the end, then
  // call RemoveLast().
  public native void RemoveLast(Message message,
                            @Const FieldDescriptor field);
  // Removes the last element of a repeated message field, and returns the
  // pointer to the caller.  Caller takes ownership of the returned pointer.
  public native Message ReleaseLast(Message message,
                                 @Const FieldDescriptor field);

  // Swap the complete contents of two messages.
  public native void Swap(Message message1, Message message2);

  // Swap fields listed in fields vector of two messages.
  public native void SwapFields(Message message1,
                            Message message2,
                            @Const @ByRef FieldDescriptorVector fields);

  // Swap two elements of a repeated field.
  public native void SwapElements(Message message,
                              @Const FieldDescriptor field,
                              int index1,
                              int index2);

  // List all fields of the message which are currently set, except for unknown
  // fields, but including extension known to the parser (i.e. compiled in).
  // Singular fields will only be listed if HasField(field) would return true
  // and repeated fields will only be listed if FieldSize(field) would return
  // non-zero.  Fields (both normal fields and extension fields) will be listed
  // ordered by field number.
  // Use Reflection::GetUnknownFields() or message.unknown_fields() to also get
  // access to fields/extensions unknown to the parser.
  public native void ListFields(
        @Const @ByRef Message message,
        FieldDescriptorVector output);

  // Singular field getters ------------------------------------------
  // These get the value of a non-repeated field.  They return the default
  // value for fields that aren't set.

  public native @Cast("google::protobuf::int32") int GetInt32(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native @Cast("google::protobuf::int64") long GetInt64(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native @Cast("google::protobuf::uint32") int GetUInt32(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native @Cast("google::protobuf::uint64") long GetUInt64(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native float GetFloat(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native double GetDouble(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native @Cast("bool") boolean GetBool(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native @StdString BytePointer GetString(@Const @ByRef Message message,
                             @Const FieldDescriptor field);
  public native @Const EnumValueDescriptor GetEnum(
        @Const @ByRef Message message, @Const FieldDescriptor field);

  // GetEnumValue() returns an enum field's value as an integer rather than
  // an EnumValueDescriptor*. If the integer value does not correspond to a
  // known value descriptor, a new value descriptor is created. (Such a value
  // will only be present when the new unknown-enum-value semantics are enabled
  // for a message.)
  public native int GetEnumValue(
        @Const @ByRef Message message, @Const FieldDescriptor field);

  // See MutableMessage() for the meaning of the "factory" parameter.
  public native @Const @ByRef Message GetMessage(@Const @ByRef Message message,
                                      @Const FieldDescriptor field,
                                      MessageFactory factory/*=NULL*/);
  public native @Const @ByRef Message GetMessage(@Const @ByRef Message message,
                                      @Const FieldDescriptor field);

  // Get a string value without copying, if possible.
  //
  // GetString() necessarily returns a copy of the string.  This can be
  // inefficient when the string is already stored in a string object in the
  // underlying message.  GetStringReference() will return a reference to the
  // underlying string in this case.  Otherwise, it will copy the string into
  // *scratch and return that.
  //
  // Note:  It is perfectly reasonable and useful to write code like:
  //     str = reflection->GetStringReference(message, field, &str);
  //   This line would ensure that only one copy of the string is made
  //   regardless of the field's underlying representation.  When initializing
  //   a newly-constructed string, though, it's just as fast and more readable
  //   to use code like:
  //     string str = reflection->GetString(message, field);
  public native @StdString BytePointer GetStringReference(@Const @ByRef Message message,
                                             @Const FieldDescriptor field,
                                             @StdString @Cast({"char*", "std::string*"}) BytePointer scratch);


  // Singular field mutators -----------------------------------------
  // These mutate the value of a non-repeated field.

  public native void SetInt32(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::int32") int value);
  public native void SetInt64(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::int64") long value);
  public native void SetUInt32(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::uint32") int value);
  public native void SetUInt64(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::uint64") long value);
  public native void SetFloat(Message message,
                           @Const FieldDescriptor field, float value);
  public native void SetDouble(Message message,
                           @Const FieldDescriptor field, double value);
  public native void SetBool(Message message,
                           @Const FieldDescriptor field, @Cast("bool") boolean value);
  public native void SetString(Message message,
                           @Const FieldDescriptor field,
                           @StdString BytePointer value);
  public native void SetString(Message message,
                           @Const FieldDescriptor field,
                           @StdString String value);
  public native void SetEnum(Message message,
                           @Const FieldDescriptor field,
                           @Const EnumValueDescriptor value);
  // Set an enum field's value with an integer rather than EnumValueDescriptor.
  // For proto3 this is just setting the enum field to the value specified, for
  // proto2 it's more complicated. If value is a known enum value the field is
  // set as usual. If the value is unknown then it is added to the unknown field
  // set. Note this matches the behavior of parsing unknown enum values.
  // If multiple calls with unknown values happen than they are all added to the
  // unknown field set in order of the calls.
  public native void SetEnumValue(Message message,
                              @Const FieldDescriptor field,
                              int value);

  // Get a mutable pointer to a field with a message type.  If a MessageFactory
  // is provided, it will be used to construct instances of the sub-message;
  // otherwise, the default factory is used.  If the field is an extension that
  // does not live in the same pool as the containing message's descriptor (e.g.
  // it lives in an overlay pool), then a MessageFactory must be provided.
  // If you have no idea what that meant, then you probably don't need to worry
  // about it (don't provide a MessageFactory).  WARNING:  If the
  // FieldDescriptor is for a compiled-in extension, then
  // factory->GetPrototype(field->message_type()) MUST return an instance of
  // the compiled-in class for this type, NOT DynamicMessage.
  public native Message MutableMessage(Message message,
                                    @Const FieldDescriptor field,
                                    MessageFactory factory/*=NULL*/);
  public native Message MutableMessage(Message message,
                                    @Const FieldDescriptor field);
  // Replaces the message specified by 'field' with the already-allocated object
  // sub_message, passing ownership to the message.  If the field contained a
  // message, that message is deleted.  If sub_message is NULL, the field is
  // cleared.
  public native void SetAllocatedMessage(Message message,
                                     Message sub_message,
                                     @Const FieldDescriptor field);
  // Releases the message specified by 'field' and returns the pointer,
  // ReleaseMessage() will return the message the message object if it exists.
  // Otherwise, it may or may not return NULL.  In any case, if the return value
  // is non-NULL, the caller takes ownership of the pointer.
  // If the field existed (HasField() is true), then the returned pointer will
  // be the same as the pointer returned by MutableMessage().
  // This function has the same effect as ClearField().
  public native Message ReleaseMessage(Message message,
                                    @Const FieldDescriptor field,
                                    MessageFactory factory/*=NULL*/);
  public native Message ReleaseMessage(Message message,
                                    @Const FieldDescriptor field);


  // Repeated field getters ------------------------------------------
  // These get the value of one element of a repeated field.

  public native @Cast("google::protobuf::int32") int GetRepeatedInt32(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native @Cast("google::protobuf::int64") long GetRepeatedInt64(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native @Cast("google::protobuf::uint32") int GetRepeatedUInt32(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native @Cast("google::protobuf::uint64") long GetRepeatedUInt64(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native float GetRepeatedFloat(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native double GetRepeatedDouble(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native @Cast("bool") boolean GetRepeatedBool(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native @StdString BytePointer GetRepeatedString(@Const @ByRef Message message,
                                     @Const FieldDescriptor field,
                                     int index);
  public native @Const EnumValueDescriptor GetRepeatedEnum(
        @Const @ByRef Message message,
        @Const FieldDescriptor field, int index);
  // GetRepeatedEnumValue() returns an enum field's value as an integer rather
  // than an EnumValueDescriptor*. If the integer value does not correspond to a
  // known value descriptor, a new value descriptor is created. (Such a value
  // will only be present when the new unknown-enum-value semantics are enabled
  // for a message.)
  public native int GetRepeatedEnumValue(
        @Const @ByRef Message message,
        @Const FieldDescriptor field, int index);
  public native @Const @ByRef Message GetRepeatedMessage(
        @Const @ByRef Message message,
        @Const FieldDescriptor field, int index);

  // See GetStringReference(), above.
  public native @StdString BytePointer GetRepeatedStringReference(
        @Const @ByRef Message message, @Const FieldDescriptor field,
        int index, @StdString @Cast({"char*", "std::string*"}) BytePointer scratch);


  // Repeated field mutators -----------------------------------------
  // These mutate the value of one element of a repeated field.

  public native void SetRepeatedInt32(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @Cast("google::protobuf::int32") int value);
  public native void SetRepeatedInt64(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @Cast("google::protobuf::int64") long value);
  public native void SetRepeatedUInt32(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @Cast("google::protobuf::uint32") int value);
  public native void SetRepeatedUInt64(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @Cast("google::protobuf::uint64") long value);
  public native void SetRepeatedFloat(Message message,
                                   @Const FieldDescriptor field,
                                   int index, float value);
  public native void SetRepeatedDouble(Message message,
                                   @Const FieldDescriptor field,
                                   int index, double value);
  public native void SetRepeatedBool(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @Cast("bool") boolean value);
  public native void SetRepeatedString(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @StdString BytePointer value);
  public native void SetRepeatedString(Message message,
                                   @Const FieldDescriptor field,
                                   int index, @StdString String value);
  public native void SetRepeatedEnum(Message message,
                                 @Const FieldDescriptor field, int index,
                                 @Const EnumValueDescriptor value);
  // Set an enum field's value with an integer rather than EnumValueDescriptor.
  // For proto3 this is just setting the enum field to the value specified, for
  // proto2 it's more complicated. If value is a known enum value the field is
  // set as usual. If the value is unknown then it is added to the unknown field
  // set. Note this matches the behavior of parsing unknown enum values.
  // If multiple calls with unknown values happen than they are all added to the
  // unknown field set in order of the calls.
  public native void SetRepeatedEnumValue(Message message,
                                      @Const FieldDescriptor field, int index,
                                      int value);
  // Get a mutable pointer to an element of a repeated field with a message
  // type.
  public native Message MutableRepeatedMessage(
        Message message, @Const FieldDescriptor field, int index);


  // Repeated field adders -------------------------------------------
  // These add an element to a repeated field.

  public native void AddInt32(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::int32") int value);
  public native void AddInt64(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::int64") long value);
  public native void AddUInt32(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::uint32") int value);
  public native void AddUInt64(Message message,
                           @Const FieldDescriptor field, @Cast("google::protobuf::uint64") long value);
  public native void AddFloat(Message message,
                           @Const FieldDescriptor field, float value);
  public native void AddDouble(Message message,
                           @Const FieldDescriptor field, double value);
  public native void AddBool(Message message,
                           @Const FieldDescriptor field, @Cast("bool") boolean value);
  public native void AddString(Message message,
                           @Const FieldDescriptor field,
                           @StdString BytePointer value);
  public native void AddString(Message message,
                           @Const FieldDescriptor field,
                           @StdString String value);
  public native void AddEnum(Message message,
                           @Const FieldDescriptor field,
                           @Const EnumValueDescriptor value);
  // Add an integer value to a repeated enum field rather than
  // EnumValueDescriptor. For proto3 this is just setting the enum field to the
  // value specified, for proto2 it's more complicated. If value is a known enum
  // value the field is set as usual. If the value is unknown then it is added
  // to the unknown field set. Note this matches the behavior of parsing unknown
  // enum values. If multiple calls with unknown values happen than they are all
  // added to the unknown field set in order of the calls.
  public native void AddEnumValue(Message message,
                              @Const FieldDescriptor field,
                              int value);
  // See MutableMessage() for comments on the "factory" parameter.
  public native Message AddMessage(Message message,
                                @Const FieldDescriptor field,
                                MessageFactory factory/*=NULL*/);
  public native Message AddMessage(Message message,
                                @Const FieldDescriptor field);

  // Appends an already-allocated object 'new_entry' to the repeated field
  // specified by 'field' passing ownership to the message.
  // TODO(tmarek): Make virtual after all subclasses have been
  // updated.
  public native void AddAllocatedMessage(Message message,
                                     @Const FieldDescriptor field,
                                     Message new_entry);


  // Get a RepeatedFieldRef object that can be used to read the underlying
  // repeated field. The type parameter T must be set according to the
  // field's cpp type. The following table shows the mapping from cpp type
  // to acceptable T.
  //
  //   field->cpp_type()      T
  //   CPPTYPE_INT32        int32
  //   CPPTYPE_UINT32       uint32
  //   CPPTYPE_INT64        int64
  //   CPPTYPE_UINT64       uint64
  //   CPPTYPE_DOUBLE       double
  //   CPPTYPE_FLOAT        float
  //   CPPTYPE_BOOL         bool
  //   CPPTYPE_ENUM         generated enum type or int32
  //   CPPTYPE_STRING       string
  //   CPPTYPE_MESSAGE      generated message type or google::protobuf::Message
  //
  // A RepeatedFieldRef object can be copied and the resulted object will point
  // to the same repeated field in the same message. The object can be used as
  // long as the message is not destroyed.
  //
  // Note that to use this method users need to include the header file
  // "net/proto2/public/reflection.h" (which defines the RepeatedFieldRef
  // class templates).

  // Like GetRepeatedFieldRef() but return an object that can also be used
  // manipulate the underlying repeated field.

  // DEPRECATED. Please use Get(Mutable)RepeatedFieldRef() for repeated field
  // access. The following repeated field accesors will be removed in the
  // future.
  //
  // Repeated field accessors  -------------------------------------------------
  // The methods above, e.g. GetRepeatedInt32(msg, fd, index), provide singular
  // access to the data in a RepeatedField.  The methods below provide aggregate
  // access by exposing the RepeatedField object itself with the Message.
  // Applying these templates to inappropriate types will lead to an undefined
  // reference at link time (e.g. GetRepeatedField<***double>), or possibly a
  // template matching error at compile time (e.g. GetRepeatedPtrField<File>).
  //
  // Usage example: my_doubs = refl->GetRepeatedField<double>(msg, fd);

  // DEPRECATED. Please use GetRepeatedFieldRef().
  //
  // for T = Cord and all protobuf scalar types except enums.

  // DEPRECATED. Please use GetMutableRepeatedFieldRef().
  //
  // for T = Cord and all protobuf scalar types except enums.

  // DEPRECATED. Please use GetRepeatedFieldRef().
  //
  // for T = string, google::protobuf::internal::StringPieceField
  //         google::protobuf::Message & descendants.

  // DEPRECATED. Please use GetMutableRepeatedFieldRef().
  //
  // for T = string, google::protobuf::internal::StringPieceField
  //         google::protobuf::Message & descendants.

  // Extensions ----------------------------------------------------------------

  // Try to find an extension of this message type by fully-qualified field
  // name.  Returns NULL if no extension is known for this name or number.
  public native @Const FieldDescriptor FindKnownExtensionByName(
        @StdString BytePointer name);
  public native @Const FieldDescriptor FindKnownExtensionByName(
        @StdString String name);

  // Try to find an extension of this message type by field number.
  // Returns NULL if no extension is known for this name or number.
  public native @Const FieldDescriptor FindKnownExtensionByNumber(
        int number);

  // Feature Flags -------------------------------------------------------------

  // Does this message support storing arbitrary integer values in enum fields?
  // If |true|, GetEnumValue/SetEnumValue and associated repeated-field versions
  // take arbitrary integer values, and the legacy GetEnum() getter will
  // dynamically create an EnumValueDescriptor for any integer value without
  // one. If |false|, setting an unknown enum value via the integer-based
  // setters results in undefined behavior (in practice, GOOGLE_DCHECK-fails).
  //
  // Generic code that uses reflection to handle messages with enum fields
  // should check this flag before using the integer-based setter, and either
  // downgrade to a compatible value or use the UnknownFieldSet if not. For
  // example:
  //
  //   int new_value = GetValueFromApplicationLogic();
  //   if (reflection->SupportsUnknownEnumValues()) {
  //     reflection->SetEnumValue(message, field, new_value);
  //   } else {
  //     if (field_descriptor->enum_type()->
  //             FindValueByNumber(new_value) != NULL) {
  //       reflection->SetEnumValue(message, field, new_value);
  //     } else if (emit_unknown_enum_values) {
  //       reflection->MutableUnknownFields(message)->AddVarint(
  //           field->number(), new_value);
  //     } else {
  //       // convert value to a compatible/default value.
  //       new_value = CompatibleDowngrade(new_value);
  //       reflection->SetEnumValue(message, field, new_value);
  //     }
  //   }
  public native @Cast("bool") boolean SupportsUnknownEnumValues();

  // Returns the MessageFactory associated with this message.  This can be
  // useful for determining if a message is a generated message or not, for
  // example:
  //   if (message->GetReflection()->GetMessageFactory() ==
  //       google::protobuf::MessageFactory::generated_factory()) {
  //     // This is a generated message.
  //   }
  // It can also be used to create more messages of this type, though
  // Message::New() is an easier way to accomplish this.
  public native MessageFactory GetMessageFactory();
}
