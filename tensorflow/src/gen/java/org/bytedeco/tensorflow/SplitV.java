// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Splits a tensor into {@code num_split} tensors along one dimension.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * value: The tensor to split.
 *  * size_splits: list containing the sizes of each output tensor along the split
 *  dimension. Must sum to the dimension of value along split_dim.
 *  Can contain one -1 indicating that dimension is to be inferred.
 *  * axis: 0-D.  The dimension along which to split.  Must be in the range
 *  {@code [-rank(value), rank(value))}.
 * 
 *  Returns:
 *  * {@code OutputList}: Tensors whose shape matches that of {@code value}
 *  except along {@code axis}, where their sizes are
 *  {@code size_splits[i]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SplitV extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SplitV(Pointer p) { super(p); }

  public SplitV(@Const @ByRef Scope scope, @ByVal Input value,
         @ByVal Input size_splits, @ByVal Input axis, @Cast("tensorflow::int64") long num_split) { super((Pointer)null); allocate(scope, value, size_splits, axis, num_split); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value,
         @ByVal Input size_splits, @ByVal Input axis, @Cast("tensorflow::int64") long num_split);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public native @ByRef Operation operation(); public native SplitV operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output(); public native SplitV output(OutputVector setter);
}
