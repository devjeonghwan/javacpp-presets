// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


/**
 * \brief Config used to aggregate information about the compression of a particular buffer.
 *
 * Contains a "PinnedPtrHandle" to an nvcompStatus. After the compression is complete,
 * the user can check the result status which resides in pinned host memory.
 */
@Namespace("nvcomp") @NoOffset @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class CompressionConfig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompressionConfig(Pointer p) { super(p); }
 // API
  public native @Cast("size_t") long uncompressed_buffer_size(); public native CompressionConfig uncompressed_buffer_size(long setter);
  public native @Cast("size_t") long max_compressed_buffer_size(); public native CompressionConfig max_compressed_buffer_size(long setter);
  public native @Cast("size_t") long num_chunks(); public native CompressionConfig num_chunks(long setter);
  public native @Cast("bool") boolean compute_checksums(); public native CompressionConfig compute_checksums(boolean setter);

  /**
   * \brief Construct the config given an nvcompStatus_t memory pool
   */

  /**
   * \brief Get the raw nvcompStatus_t*
   */
  public native @Cast("nvcompStatus_t*") IntPointer get_status();

  public CompressionConfig(@ByRef(true) CompressionConfig other) { super((Pointer)null); allocate(other); }
  private native void allocate(@ByRef(true) CompressionConfig other);
  public native @ByRef @Name("operator =") CompressionConfig put(@ByRef(true) CompressionConfig other);
}
