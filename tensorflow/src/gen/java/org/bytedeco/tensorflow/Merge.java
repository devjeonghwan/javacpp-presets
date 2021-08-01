// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Forwards the value of an available tensor from {@code inputs} to {@code output}.
 * 
 *  {@code Merge} waits for at least one of the tensors in {@code inputs} to become available.
 *  It is usually combined with {@code Switch} to implement branching.
 * 
 *  {@code Merge} forwards the first tensor to become available to {@code output}, and sets
 *  {@code value_index} to its index in {@code inputs}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: The input tensors, exactly one of which will become available.
 * 
 *  Returns:
 *  * {@code Output} output: Will be set to the available input tensor.
 *  * {@code Output} value_index: The index of the chosen input tensor in {@code inputs}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Merge extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Merge(Pointer p) { super(p); }

  public Merge(@Const @ByRef Scope scope, @ByVal InputList inputs) { super((Pointer)null); allocate(scope, inputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs);

  public native @ByRef Operation operation(); public native Merge operation(Operation setter);
  public native @ByRef Output output(); public native Merge output(Output setter);
  public native @ByRef Output value_index(); public native Merge value_index(Output setter);
}
