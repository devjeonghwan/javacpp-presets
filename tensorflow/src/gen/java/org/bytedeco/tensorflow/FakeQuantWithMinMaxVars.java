// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Fake-quantize the 'inputs' tensor of type float via global float scalars {@code min}
 * 
 *  and {@code max} to 'outputs' tensor of same shape as {@code inputs}.
 * 
 *  {@code [min; max]} define the clamping range for the {@code inputs} data.
 *  {@code inputs} values are quantized into the quantization range ({@code [0; 2^num_bits - 1]}
 *  when {@code narrow_range} is false and {@code [1; 2^num_bits - 1]} when it is true) and
 *  then de-quantized and output as floats in {@code [min; max]} interval.
 *  {@code num_bits} is the bitwidth of the quantization; between 2 and 16, inclusive.
 * 
 *  Before quantization, {@code min} and {@code max} values are adjusted with the following
 *  logic.
 *  It is suggested to have {@code min <= 0 <= max}. If {@code 0} is not in the range of values,
 *  the behavior can be unexpected:
 *  If {@code 0 < min < max}: {@code min_adj = 0} and {@code max_adj = max - min}.
 *  If {@code min < max < 0}: {@code min_adj = min - max} and {@code max_adj = 0}.
 *  If {@code min <= 0 <= max}: {@code scale = (max - min) / (2^num_bits - 1) },
 *  {@code min_adj = scale * round(min / scale)} and {@code max_adj = max + min_adj - min}.
 * 
 *  This operation has a gradient and thus allows for training {@code min} and {@code max}
 *  values.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The outputs tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FakeQuantWithMinMaxVars extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FakeQuantWithMinMaxVars(Pointer p) { super(p); }

  /** Optional attribute setters for FakeQuantWithMinMaxVars */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Defaults to 8 */
    public native @ByVal Attrs NumBits(@Cast("tensorflow::int64") long x);

    /** Defaults to false */
    public native @ByVal Attrs NarrowRange(@Cast("bool") boolean x);

    public native @Cast("tensorflow::int64") long num_bits_(); public native Attrs num_bits_(long setter);
    public native @Cast("bool") boolean narrow_range_(); public native Attrs narrow_range_(boolean setter);
  }
  public FakeQuantWithMinMaxVars(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input min, @ByVal Input max) { super((Pointer)null); allocate(scope, inputs, min, max); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input min, @ByVal Input max);
  public FakeQuantWithMinMaxVars(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input min, @ByVal Input max, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, inputs, min, max, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input inputs, @ByVal Input min, @ByVal Input max, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs NumBits(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs NarrowRange(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native FakeQuantWithMinMaxVars operation(Operation setter);
  public native @ByRef Output outputs(); public native FakeQuantWithMinMaxVars outputs(Output setter);
}
