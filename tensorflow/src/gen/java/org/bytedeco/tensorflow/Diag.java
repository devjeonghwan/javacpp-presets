// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a diagonal tensor with a given diagonal values.
 * 
 *  Given a {@code diagonal}, this operation returns a tensor with the {@code diagonal} and
 *  everything else padded with zeros. The diagonal is computed as follows:
 * 
 *  Assume {@code diagonal} has dimensions [D1,..., Dk], then the output is a tensor of
 *  rank 2k with dimensions [D1,..., Dk, D1,..., Dk] where:
 * 
 *  {@code output[i1,..., ik, i1,..., ik] = diagonal[i1, ..., ik]} and 0 everywhere else.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 'diagonal' is [1, 2, 3, 4]
 *  tf.diag(diagonal) ==> [[1, 0, 0, 0]
 *                         [0, 2, 0, 0]
 *                         [0, 0, 3, 0]
 *                         [0, 0, 0, 4]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * diagonal: Rank k tensor where k is at most 1.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Diag extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Diag(Pointer p) { super(p); }

  public Diag(@Const @ByRef Scope scope, @ByVal Input diagonal) { super((Pointer)null); allocate(scope, diagonal); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input diagonal);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Diag operation(Operation setter);
  public native @ByRef Output output(); public native Diag output(Output setter);
}
