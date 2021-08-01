// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// Dictionary type (for representing categorical or dictionary-encoded
// in memory)

/** \brief Dictionary-encoded value type with data-dependent
 *  dictionary. Indices are represented by any integer types. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DictionaryType extends FixedWidthType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictionaryType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public DictionaryType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type,
                   @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type, @Cast("bool") boolean ordered/*=false*/) { super((Pointer)null); allocate(index_type, value_type, ordered); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type,
                   @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type, @Cast("bool") boolean ordered/*=false*/);
  public DictionaryType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type,
                   @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type) { super((Pointer)null); allocate(index_type, value_type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type,
                   @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type);

  // A constructor variant that validates its input parameters
  public static native @ByVal DataTypeResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type,
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type, @Cast("bool") boolean ordered/*=false*/);
  public static native @ByVal DataTypeResult Make(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type,
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type);

  public native @StdString String ToString();
  public native @StdString String name();

  public native int bit_width();

  public native @ByVal DataTypeLayout layout();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType index_type();
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type();

  public native @Cast("bool") boolean ordered();
}
