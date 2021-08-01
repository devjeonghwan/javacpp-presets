// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns up to {@code num_records} (key, value) pairs produced by a Reader.
 * 
 *  Will dequeue from the input queue if necessary (e.g. when the
 *  Reader needs to start reading from a new file since it has finished
 *  with the previous file).
 *  It may return less than {@code num_records} even before the last batch.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * reader_handle: Handle to a {@code Reader}.
 *  * queue_handle: Handle to a {@code Queue}, with string work items.
 *  * num_records: number of records to read from {@code Reader}.
 * 
 *  Returns:
 *  * {@code Output} keys: A 1-D tensor.
 *  * {@code Output} values: A 1-D tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReaderReadUpTo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReaderReadUpTo(Pointer p) { super(p); }

  public ReaderReadUpTo(@Const @ByRef Scope scope, @ByVal Input reader_handle, @ByVal Input queue_handle,
                 @ByVal Input num_records) { super((Pointer)null); allocate(scope, reader_handle, queue_handle, num_records); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input reader_handle, @ByVal Input queue_handle,
                 @ByVal Input num_records);

  public native @ByRef Operation operation(); public native ReaderReadUpTo operation(Operation setter);
  public native @ByRef Output keys(); public native ReaderReadUpTo keys(Output setter);
  public native @ByRef Output values(); public native ReaderReadUpTo values(Output setter);
}
