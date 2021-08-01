// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow::io") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RecordReaderOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RecordReaderOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecordReaderOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordReaderOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RecordReaderOptions position(long position) {
        return (RecordReaderOptions)super.position(position);
    }
    @Override public RecordReaderOptions getPointer(long i) {
        return new RecordReaderOptions((Pointer)this).offsetAddress(i);
    }

  /** enum tensorflow::io::RecordReaderOptions::CompressionType */
  public static final int NONE = 0, ZLIB_COMPRESSION = 1;
  public native @Cast("tensorflow::io::RecordReaderOptions::CompressionType") int compression_type(); public native RecordReaderOptions compression_type(int setter);

  // If buffer_size is non-zero, then all reads must be sequential, and no
  // skipping around is permitted. (Note: this is the same behavior as reading
  // compressed files.) Consider using SequentialRecordReader.
  public native @Cast("tensorflow::int64") long buffer_size(); public native RecordReaderOptions buffer_size(long setter);

  public static native @ByVal RecordReaderOptions CreateRecordReaderOptions(
        @StdString BytePointer compression_type);
  public static native @ByVal RecordReaderOptions CreateRecordReaderOptions(
        @StdString String compression_type);

// #if !defined(IS_SLIM_BUILD)
  // Options specific to zlib compression.
  public native @ByRef ZlibCompressionOptions zlib_options(); public native RecordReaderOptions zlib_options(ZlibCompressionOptions setter);
// #endif  // IS_SLIM_BUILD
}
