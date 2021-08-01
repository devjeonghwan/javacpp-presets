// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the batched diagonal part of a batched tensor.
 * 
 *  This operation returns a tensor with the {@code diagonal} part
 *  of the batched {@code input}. The {@code diagonal} part is computed as follows:
 * 
 *  Assume {@code input} has {@code k} dimensions {@code [I, J, K, ..., M, N]}, then the output is a
 *  tensor of rank {@code k - 1} with dimensions {@code [I, J, K, ..., min(M, N)]} where:
 * 
 *  {@code diagonal[i, j, k, ..., n] = input[i, j, k, ..., n, n]}.
 * 
 *  The input must be at least a matrix.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 'input' is [[[1, 0, 0, 0]
 *                 [0, 2, 0, 0]
 *                 [0, 0, 3, 0]
 *                 [0, 0, 0, 4]],
 *                [[5, 0, 0, 0]
 *                 [0, 6, 0, 0]
 *                 [0, 0, 7, 0]
 *                 [0, 0, 0, 8]]]
 * 
 *  and input.shape = (2, 4, 4)
 * 
 *  tf.matrix_diag_part(input) ==> [[1, 2, 3, 4], [5, 6, 7, 8]]
 * 
 *  which has shape (2, 4)
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Rank {@code k} tensor where {@code k >= 2}.
 * 
 *  Returns:
 *  * {@code Output}: The extracted diagonal(s) having shape
 *  {@code diagonal.shape = input.shape[:-2] + [min(input.shape[-2:])]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixDiagPart extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixDiagPart(Pointer p) { super(p); }

  public MatrixDiagPart(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MatrixDiagPart operation(Operation setter);
  public native @ByRef Output diagonal(); public native MatrixDiagPart diagonal(Output setter);
}
