// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \brief A readonly memmapped file abstraction.
 * 
 *  The implementation must guarantee that all memory is accessible when the
 *  object exists, independently from the Env that created it. */
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReadOnlyMemoryRegion extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadOnlyMemoryRegion(Pointer p) { super(p); }


  /** \brief Returns a pointer to the memory region. */
  public native @Const Pointer data();

  /** \brief Returns the length of the memory region in bytes. */
  public native @Cast("tensorflow::uint64") long length();
}
