// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns immutable tensor from memory region.
 * 
 *  The current implementation memmaps the tensor from a file.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * dtype: Type of the returned tensor.
 *  * shape: Shape of the returned tensor.
 *  * memory_region_name: Name of readonly memory region used by the tensor, see
 *  NewReadOnlyMemoryRegionFromFile in tensorflow::Env.
 * 
 *  Returns:
 *  * {@code Output}: The tensor tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ImmutableConst extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImmutableConst(Pointer p) { super(p); }

  public ImmutableConst(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                 @ByVal PartialTensorShape shape, @StringPiece BytePointer memory_region_name) { super((Pointer)null); allocate(scope, dtype, shape, memory_region_name); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                 @ByVal PartialTensorShape shape, @StringPiece BytePointer memory_region_name);
  public ImmutableConst(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                 @ByVal PartialTensorShape shape, @StringPiece String memory_region_name) { super((Pointer)null); allocate(scope, dtype, shape, memory_region_name); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                 @ByVal PartialTensorShape shape, @StringPiece String memory_region_name);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ImmutableConst operation(Operation setter);
  public native @ByRef Output tensor(); public native ImmutableConst tensor(Output setter);
}
