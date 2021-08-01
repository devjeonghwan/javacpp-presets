// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Base class for all data array builders.
 * 
 *  This class provides a facilities for incrementally building the null bitmap
 *  (see Append methods) and as a side effect the current number of slots and
 *  the null count.
 * 
 *  \note Users are expected to use builders as one of the concrete types below.
 *  For example, ArrayBuilder* pointing to BinaryBuilder should be downcast before use. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ArrayBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrayBuilder(Pointer p) { super(p); }


  /** For nested types. Since the objects are owned by this class instance, we
   *  skip shared pointers and just return a raw pointer */
  public native ArrayBuilder child(int i);

  public native @Const @SharedPtr @ByRef ArrayBuilder child_builder(int i);

  public native int num_children();

  public native @Cast("int64_t") long length();
  public native @Cast("int64_t") long null_count();
  
  ///
  public native @Cast("int64_t") @Name("capacity") long _capacity();

  /** \brief Ensure that enough memory has been allocated to fit the indicated
   *  number of total elements in the builder, including any that have already
   *  been appended. Does not account for reallocations that may be due to
   *  variable size data, like binary values. To make space for incremental
   *  appends, use Reserve instead.
   * 
   *  @param capacity [in] the minimum number of total array values to
   *             accommodate. Must be greater than the current capacity.
   *  @return Status */
  
  ///
  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);

  /** \brief Ensure that there is enough space allocated to append the indicated
   *  number of elements without any further reallocation. Overallocation is
   *  used in order to minimize the impact of incremental Reserve() calls.
   *  Note that additional_capacity is relative to the current number of elements
   *  rather than to the current capacity, so calls to Reserve() which are not
   *  interspersed with addition of new elements may not increase the capacity.
   * 
   *  @param additional_capacity [in] the number of additional array values
   *  @return Status */
  public native @ByVal Status Reserve(@Cast("int64_t") long additional_capacity);

  /** Reset the builder. */
  public native void Reset();

  /** \brief Append a null value to builder */
  public native @ByVal Status AppendNull();
  /** \brief Append a number of null values to builder */
  
  ///
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  /** \brief Append a non-null value to builder
   * 
   *  The appended value is an implementation detail, but the corresponding
   *  memory slot is guaranteed to be initialized.
   *  This method is useful when appending a null value to a parent nested type. */
  
  ///
  public native @ByVal Status AppendEmptyValue();

  /** \brief Append a number of non-null values to builder
   * 
   *  The appended values are an implementation detail, but the corresponding
   *  memory slot is guaranteed to be initialized.
   *  This method is useful when appending null values to a parent nested type. */
  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  /** For cases where raw data was memcpy'd into the internal buffers, allows us
   *  to advance the length of the builder. It is your responsibility to use
   *  this function responsibly. */
  
  ///
  public native @ByVal Status Advance(@Cast("int64_t") long elements);

  /** \brief Return result of builder as an internal generic ArrayData
   *  object. Resets builder except for dictionary builder
   * 
   *  @param out [out] the finalized ArrayData object
   *  @return Status */
  
  ///
  ///
  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \brief Return result of builder as an Array object.
   * 
   *  The builder is reset except for DictionaryBuilder.
   * 
   *  @param out [out] the finalized Array object
   *  @return Status */
  
  ///
  ///
  public native @ByVal Status Finish(@SharedPtr Array out);

  /** \brief Return result of builder as an Array object.
   * 
   *  The builder is reset except for DictionaryBuilder.
   * 
   *  @return The finalized Array object */
  public native @ByVal ArrayResult Finish();

  /** \brief Return the type of the built Array */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
