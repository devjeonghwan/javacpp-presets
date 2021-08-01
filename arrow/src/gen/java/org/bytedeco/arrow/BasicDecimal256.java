// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BasicDecimal256 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BasicDecimal256(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BasicDecimal256(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BasicDecimal256 position(long position) {
        return (BasicDecimal256)super.position(position);
    }
    @Override public BasicDecimal256 getPointer(long i) {
        return new BasicDecimal256((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native int bit_width();
  public static final int bit_width = bit_width();

  /** \brief Create a BasicDecimal256 from the two's complement representation. */
  public BasicDecimal256(@Const @ByRef Long4Array little_endian_array) { super((Pointer)null); allocate(little_endian_array); }
  @NoException(true) private native void allocate(@Const @ByRef Long4Array little_endian_array);

  /** \brief Empty constructor creates a BasicDecimal256 with a value of 0. */
  public BasicDecimal256() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  /** \brief Convert any integer value into a BasicDecimal256. */

  public BasicDecimal256(@Const @ByRef BasicDecimal128 value) { super((Pointer)null); allocate(value); }
  @NoException(true) private native void allocate(@Const @ByRef BasicDecimal128 value);

  /** \brief Create a BasicDecimal256 from an array of bytes. Bytes are assumed to be in
   *  native-endian byte order. */
  public BasicDecimal256(@Cast("const uint8_t*") BytePointer bytes) { super((Pointer)null); allocate(bytes); }
  private native void allocate(@Cast("const uint8_t*") BytePointer bytes);
  public BasicDecimal256(@Cast("const uint8_t*") ByteBuffer bytes) { super((Pointer)null); allocate(bytes); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer bytes);
  public BasicDecimal256(@Cast("const uint8_t*") byte[] bytes) { super((Pointer)null); allocate(bytes); }
  private native void allocate(@Cast("const uint8_t*") byte[] bytes);

  /** \brief Negate the current value (in-place) */
  public native @ByRef BasicDecimal256 Negate();

  /** \brief Absolute value (in-place) */
  public native @ByRef BasicDecimal256 Abs();

  /** \brief Absolute value */
  public static native @ByVal BasicDecimal256 Abs(@Const @ByRef BasicDecimal256 left);

  /** \brief Add a number to this one. The result is truncated to 256 bits. */
  public native @ByRef @Name("operator +=") BasicDecimal256 addPut(@Const @ByRef BasicDecimal256 right);

  /** \brief Subtract a number from this one. The result is truncated to 256 bits. */
  public native @ByRef @Name("operator -=") BasicDecimal256 subtractPut(@Const @ByRef BasicDecimal256 right);

  /** \brief Get the bits of the two's complement representation of the number. The 4
   *  elements are in little endian order. The bits within each uint64_t element are in
   *  native endian order. For example,
   *  BasicDecimal256(123).little_endian_array() = {123, 0, 0, 0};
   *  BasicDecimal256(-2).little_endian_array() = {0xFF...FE, 0xFF...FF, 0xFF...FF,
   *  0xFF...FF}. */
  public native @Const @ByRef Long4Array little_endian_array();

  /** \brief Get the lowest bits of the two's complement representation of the number. */
  public native @Cast("const uint64_t") long low_bits();

  /** \brief Return the raw bytes of the value in native-endian byte order. */
  public native @ByVal Byte32Array ToBytes();
  public native void ToBytes(@Cast("uint8_t*") BytePointer out);
  public native void ToBytes(@Cast("uint8_t*") ByteBuffer out);
  public native void ToBytes(@Cast("uint8_t*") byte[] out);

  /** \brief Scale multiplier for given scale value. */
  public static native @Const @ByRef BasicDecimal256 GetScaleMultiplier(int scale);

  /** \brief Convert BasicDecimal256 from one scale to another */
  public native DecimalStatus Rescale(int original_scale, int new_scale,
                          BasicDecimal256 out);

  /** \brief Scale up. */
  public native @ByVal BasicDecimal256 IncreaseScaleBy(int increase_by);

  /** \brief Scale down.
   *  - If 'round' is true, the right-most digits are dropped and the result value is
   *    rounded up (+1 for positive, -1 for negative) based on the value of the
   *    dropped digits (>= 10^reduce_by / 2).
   *  - If 'round' is false, the right-most digits are simply dropped. */
  
  ///
  public native @ByVal BasicDecimal256 ReduceScaleBy(int reduce_by, @Cast("bool") boolean round/*=true*/);
  public native @ByVal BasicDecimal256 ReduceScaleBy(int reduce_by);

  /** \brief Whether this number fits in the given precision
   * 
   *  Return true if the number of significant digits is less or equal to {@code precision}. */
  public native @Cast("bool") boolean FitsInPrecision(int precision);

  public native @Cast("int64_t") long Sign();

  public native @Cast("int64_t") long IsNegative();

  /** \brief Multiply this number by another number. The result is truncated to 256 bits. */
  
  ///
  public native @ByRef @Name("operator *=") BasicDecimal256 multiplyPut(@Const @ByRef BasicDecimal256 right);

  /** Divide this number by right and return the result.
   * 
   *  This operation is not destructive.
   *  The answer rounds to zero. Signs work like:
   *    21 /  5 ->  4,  1
   *   -21 /  5 -> -4, -1
   *    21 / -5 -> -4,  1
   *   -21 / -5 ->  4, -1
   *  @param divisor [in] the number to divide by
   *  @param result [out] the quotient
   *  @param remainder [out] the remainder after the division */
  public native DecimalStatus Divide(@Const @ByRef BasicDecimal256 divisor, BasicDecimal256 result,
                         BasicDecimal256 remainder);
  /** \brief Shift left by the given number of bits. */
  public native @ByRef @Name("operator <<=") BasicDecimal256 shiftLeftPut(@Cast("uint32_t") int bits);

  /** \brief In-place division. */
  public native @ByRef @Name("operator /=") BasicDecimal256 dividePut(@Const @ByRef BasicDecimal256 right);
}
