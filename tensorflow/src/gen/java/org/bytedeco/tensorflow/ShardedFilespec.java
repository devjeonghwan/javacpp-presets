// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Generate a glob pattern matching all sharded file names.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The filename tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ShardedFilespec extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShardedFilespec(Pointer p) { super(p); }

  public ShardedFilespec(@Const @ByRef Scope scope, @ByVal Input basename,
                  @ByVal Input num_shards) { super((Pointer)null); allocate(scope, basename, num_shards); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input basename,
                  @ByVal Input num_shards);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ShardedFilespec operation(Operation setter);
  public native @ByRef Output filename(); public native ShardedFilespec filename(Output setter);
}
