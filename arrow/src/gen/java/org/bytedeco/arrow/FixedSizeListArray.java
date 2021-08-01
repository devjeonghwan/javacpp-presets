// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// FixedSizeListArray

/** Concrete Array class for fixed size list data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FixedSizeListArray extends Array {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedSizeListArray(Pointer p) { super(p); }


  public FixedSizeListArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data) { super((Pointer)null); allocate(data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::ArrayData>"}) ArrayData data);

  public FixedSizeListArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                       @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values,
                       @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                       @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, values, null_bitmap, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                       @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values,
                       @SharedPtr ArrowBuffer null_bitmap/*=nullptr*/,
                       @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public FixedSizeListArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                       @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values) { super((Pointer)null); allocate(type, length, values); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                       @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values);

  public native @Const FixedSizeListType list_type();

  /** \brief Return array object containing the list's values */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType value_type();

  // The following functions will not perform boundschecking
  public native int value_offset(@Cast("int64_t") long i);
  public native int value_length(@Cast("int64_t") long i/*=0*/);
  public native int value_length();
  
  ///
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array value_slice(@Cast("int64_t") long i);

  /** \brief Construct FixedSizeListArray from child value array and value_length
   * 
   *  @param values [in] Array containing list values
   *  @param list_size [in] The fixed length of each list
   *  @return Will have length equal to values.length() / list_size */
  public static native @ByVal ArrayResult FromArrays(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Array>"}) Array values,
                                                     int list_size);
}
