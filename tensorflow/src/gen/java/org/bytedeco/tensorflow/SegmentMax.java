// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the maximum along segments of a tensor.
 * 
 *  Read
 *  [the section on segmentation](https://tensorflow.org/api_docs/python/tf/math#Segmentation)
 *  for an explanation of segments.
 * 
 *  Computes a tensor such that
 *  \(output_i = \max_j(data_j)\) where {@code max} is over {@code j} such
 *  that {@code segment_ids[j] == i}.
 * 
 *  If the max is empty for a given segment ID {@code i}, {@code output[i] = 0}.
 * 
 *  <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 *  <img style="width:100%" src="https://www.tensorflow.org/images/SegmentMax.png" alt>
 *  </div>
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  c = tf.constant([[1,2,3,4], [4, 3, 2, 1], [5,6,7,8]])
 *  tf.segment_max(c, tf.constant([0, 0, 1]))
 *  # ==> [[4, 3, 3, 4],
 *  #      [5, 6, 7, 8]]
 *  }</pre>
 * 
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * segment_ids: A 1-D tensor whose size is equal to the size of {@code data}'s
 *  first dimension.  Values should be sorted and can be repeated.
 * 
 *  Returns:
 *  * {@code Output}: Has same shape as data, except for dimension 0 which
 *  has size {@code k}, the number of segments. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SegmentMax extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SegmentMax(Pointer p) { super(p); }

  public SegmentMax(@Const @ByRef Scope scope, @ByVal Input data,
             @ByVal Input segment_ids) { super((Pointer)null); allocate(scope, data, segment_ids); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
             @ByVal Input segment_ids);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SegmentMax operation(Operation setter);
  public native @ByRef Output output(); public native SegmentMax output(Output setter);
}
