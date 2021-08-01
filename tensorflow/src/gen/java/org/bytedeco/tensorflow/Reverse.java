// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reverses specific dimensions of a tensor.
 * 
 *  NOTE {@code tf.reverse} has now changed behavior in preparation for 1.0.
 *  {@code tf.reverse_v2} is currently an alias that will be deprecated before TF 1.0.
 * 
 *  Given a {@code tensor}, and a {@code int32} tensor {@code axis} representing the set of
 *  dimensions of {@code tensor} to reverse. This operation reverses each dimension
 *  {@code i} for which there exists {@code j} s.t. {@code axis[j] == i}.
 * 
 *  {@code tensor} can have up to 8 dimensions. The number of dimensions specified
 *  in {@code axis} may be 0 or more entries. If an index is specified more than
 *  once, a InvalidArgument error is raised.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # tensor 't' is [[[[ 0,  1,  2,  3],
 *  #                  [ 4,  5,  6,  7],
 *  #                  [ 8,  9, 10, 11]],
 *  #                 [[12, 13, 14, 15],
 *  #                  [16, 17, 18, 19],
 *  #                  [20, 21, 22, 23]]]]
 *  # tensor 't' shape is [1, 2, 3, 4]
 * 
 *  # 'dims' is [3] or 'dims' is [-1]
 *  reverse(t, dims) ==> [[[[ 3,  2,  1,  0],
 *                          [ 7,  6,  5,  4],
 *                          [ 11, 10, 9, 8]],
 *                         [[15, 14, 13, 12],
 *                          [19, 18, 17, 16],
 *                          [23, 22, 21, 20]]]]
 * 
 *  # 'dims' is '[1]' (or 'dims' is '[-3]')
 *  reverse(t, dims) ==> [[[[12, 13, 14, 15],
 *                          [16, 17, 18, 19],
 *                          [20, 21, 22, 23]
 *                         [[ 0,  1,  2,  3],
 *                          [ 4,  5,  6,  7],
 *                          [ 8,  9, 10, 11]]]]
 * 
 *  # 'dims' is '[2]' (or 'dims' is '[-2]')
 *  reverse(t, dims) ==> [[[[8, 9, 10, 11],
 *                          [4, 5, 6, 7],
 *                          [0, 1, 2, 3]]
 *                         [[20, 21, 22, 23],
 *                          [16, 17, 18, 19],
 *                          [12, 13, 14, 15]]]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * tensor: Up to 8-D.
 *  * axis: 1-D. The indices of the dimensions to reverse. Must be in the range
 *  {@code [-rank(tensor), rank(tensor))}.
 * 
 *  Returns:
 *  * {@code Output}: The same shape as {@code tensor}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Reverse extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Reverse(Pointer p) { super(p); }

  public Reverse(@Const @ByRef Scope scope, @ByVal Input tensor,
          @ByVal Input axis) { super((Pointer)null); allocate(scope, tensor, axis); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor,
          @ByVal Input axis);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Reverse operation(Operation setter);
  public native @ByRef Output output(); public native Reverse output(Output setter);
}
