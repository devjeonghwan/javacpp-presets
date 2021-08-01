// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BooleanBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BooleanBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BooleanBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BooleanBuilder position(long position) {
        return (BooleanBuilder)super.position(position);
    }
    @Override public BooleanBuilder getPointer(long i) {
        return new BooleanBuilder((Pointer)this).offsetAddress(i);
    }


  public BooleanBuilder(MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool/*=arrow::default_memory_pool()*/);
  public BooleanBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();

  public BooleanBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                   MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(type, pool); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
                   MemoryPool pool/*=arrow::default_memory_pool()*/);
  public BooleanBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  /** Write nulls as uint8_t* (0 value indicates null) into pre-allocated memory */
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status AppendNull();

  public native @ByVal Status AppendEmptyValue();

  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  /** Scalar append */
  public native @ByVal Status Append(@Cast("const bool") boolean val);

  public native @ByVal Status Append(@Cast("const uint8_t") byte val);

  /** Scalar append, without checking for capacity */
  public native void UnsafeAppend(@Cast("const bool") boolean val);

  public native void UnsafeAppendNull();

  public native void UnsafeAppend(@Cast("const uint8_t") byte val);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a contiguous array of bytes (non-zero is 1)
   *  @param length [in] the number of values to append
   *  @param valid_bytes [in] an optional sequence of bytes where non-zero
   *  indicates a valid (non-null) value
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") BytePointer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") BytePointer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") ByteBuffer values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") ByteBuffer values, @Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") byte[] values, @Cast("int64_t") long length,
                        @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") byte[] values, @Cast("int64_t") long length);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a contiguous C array of values
   *  @param length [in] the number of values to append
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") BytePointer values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") ByteBuffer values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("const uint8_t*") byte[] values, @Cast("int64_t") long length,
                        @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a std::vector of bytes
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("uint8_t*") @StdVector BytePointer values,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("uint8_t*") @StdVector ByteBuffer values,
                        @Const @ByRef BoolVector is_valid);
  public native @ByVal Status AppendValues(@Cast("uint8_t*") @StdVector byte[] values,
                        @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] a std::vector of bytes
   *  @return Status */
  public native @ByVal Status AppendValues(@Cast("uint8_t*") @StdVector BytePointer values);
  public native @ByVal Status AppendValues(@Cast("uint8_t*") @StdVector ByteBuffer values);
  public native @ByVal Status AppendValues(@Cast("uint8_t*") @StdVector byte[] values);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] an std::vector<bool> indicating true (1) or false
   *  @param is_valid [in] an std::vector<bool> indicating valid (1) or null
   *  (0). Equal in length to values
   *  @return Status */
  public native @ByVal Status AppendValues(@Const @ByRef BoolVector values, @Const @ByRef BoolVector is_valid);

  /** \brief Append a sequence of elements in one shot
   *  @param values [in] an std::vector<bool> indicating true (1) or false
   *  @return Status */
  public native @ByVal Status AppendValues(@Const @ByRef BoolVector values);

  /** \brief Append a sequence of elements in one shot
   *  @param values_begin [in] InputIterator to the beginning of the values
   *  @param values_end [in] InputIterator pointing to the end of the values
   *   or null(0) values
   *  @return Status */

  /** \brief Append a sequence of elements in one shot, with a specified nullmap
   *  @param values_begin [in] InputIterator to the beginning of the values
   *  @param values_end [in] InputIterator pointing to the end of the values
   *  @param valid_begin [in] InputIterator with elements indication valid(1)
   *   or null(0) values
   *  @return Status */

  // Same as above, for a pointer type ValidIter

  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("bool") boolean value);

  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@SharedPtr BooleanArray out);

  public native void Reset();
  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
