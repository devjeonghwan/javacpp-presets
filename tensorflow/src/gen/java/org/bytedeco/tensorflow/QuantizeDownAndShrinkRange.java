// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Convert the quantized 'input' tensor into a lower-precision 'output', using the
 * 
 *  actual distribution of the values to maximize the usage of the lower bit depth
 *  and adjusting the output min and max ranges accordingly.
 * 
 *  [input_min, input_max] are scalar floats that specify the range for the float
 *  interpretation of the 'input' data. For example, if input_min is -1.0f and
 *  input_max is 1.0f, and we are dealing with quint16 quantized data, then a 0
 *  value in the 16-bit data should be interpreted as -1.0f, and a 65535 means 1.0f.
 * 
 *  This operator tries to squeeze as much precision as possible into an output with
 *  a lower bit depth by calculating the actual min and max values found in the
 *  data. For example, maybe that quint16 input has no values lower than 16,384 and
 *  none higher than 49,152. That means only half the range is actually needed, all
 *  the float interpretations are between -0.5f and 0.5f, so if we want to compress
 *  the data into a quint8 output, we can use that range rather than the theoretical
 *  -1.0f to 1.0f that is suggested by the input min and max.
 * 
 *  In practice, this is most useful for taking output from operations like
 *  QuantizedMatMul that can produce higher bit-depth outputs than their inputs and
 *  may have large potential output ranges, but in practice have a distribution of
 *  input values that only uses a small fraction of the possible range. By feeding
 *  that output into this operator, we can reduce it from 32 bits down to 8 with
 *  minimal loss of accuracy.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_min: The float value that the minimum quantized input value represents.
 *  * input_max: The float value that the maximum quantized input value represents.
 *  * out_type: The type of the output. Should be a lower bit depth than Tinput.
 * 
 *  Returns:
 *  * {@code Output} output
 *  * {@code Output} output_min: The float value that the minimum quantized output value represents.
 *  * {@code Output} output_max: The float value that the maximum quantized output value represents. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizeDownAndShrinkRange extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizeDownAndShrinkRange(Pointer p) { super(p); }

  public QuantizeDownAndShrinkRange(@Const @ByRef Scope scope,
                             @ByVal Input input, @ByVal Input input_min, @ByVal Input input_max, @Cast("tensorflow::DataType") int out_type) { super((Pointer)null); allocate(scope, input, input_min, input_max, out_type); }
  private native void allocate(@Const @ByRef Scope scope,
                             @ByVal Input input, @ByVal Input input_min, @ByVal Input input_max, @Cast("tensorflow::DataType") int out_type);

  public native @ByRef Operation operation(); public native QuantizeDownAndShrinkRange operation(Operation setter);
  public native @ByRef Output output(); public native QuantizeDownAndShrinkRange output(Output setter);
  public native @ByRef Output output_min(); public native QuantizeDownAndShrinkRange output_min(Output setter);
  public native @ByRef Output output_max(); public native QuantizeDownAndShrinkRange output_max(Output setter);
}
