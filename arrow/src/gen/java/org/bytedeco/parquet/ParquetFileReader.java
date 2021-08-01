// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ParquetFileReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFileReader(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParquetFileReader(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ParquetFileReader position(long position) {
        return (ParquetFileReader)super.position(position);
    }
    @Override public ParquetFileReader getPointer(long i) {
        return new ParquetFileReader((Pointer)this).offsetAddress(i);
    }

  // Declare a virtual class 'Contents' to aid dependency injection and more
  // easily create test fixtures
  // An implementation of the Contents class is defined in the .cc file
  public static class Contents extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Contents(Pointer p) { super(p); }
  
    public static native @UniquePtr Contents Open(
            @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile source,
            @Const @ByRef(nullValue = "parquet::ReaderProperties(parquet::default_reader_properties())") ReaderProperties props,
            @SharedPtr FileMetaData metadata/*=nullptr*/);
    public static native @UniquePtr Contents Open(
            @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile source);
    // Perform any cleanup associated with the file contents
    public native void Close();
    public native @SharedPtr RowGroupReader GetRowGroup(int i);
    public native @SharedPtr FileMetaData metadata();
  }

  public ParquetFileReader() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Create a file reader instance from an Arrow file object. Thread-safety is
  // the responsibility of the file implementation
  public static native @UniquePtr ParquetFileReader Open(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile source,
        @Const @ByRef(nullValue = "parquet::ReaderProperties(parquet::default_reader_properties())") ReaderProperties props,
        @SharedPtr FileMetaData metadata/*=nullptr*/);
  public static native @UniquePtr ParquetFileReader Open(
        @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile source);

  // API Convenience to open a serialized Parquet file on disk, using Arrow IO
  // interfaces.
  public static native @UniquePtr ParquetFileReader OpenFile(
        @StdString String path, @Cast("bool") boolean memory_map/*=true*/,
        @Const @ByRef(nullValue = "parquet::ReaderProperties(parquet::default_reader_properties())") ReaderProperties props,
        @SharedPtr FileMetaData metadata/*=nullptr*/);
  public static native @UniquePtr ParquetFileReader OpenFile(
        @StdString String path);
  public static native @UniquePtr ParquetFileReader OpenFile(
        @StdString BytePointer path, @Cast("bool") boolean memory_map/*=true*/,
        @Const @ByRef(nullValue = "parquet::ReaderProperties(parquet::default_reader_properties())") ReaderProperties props,
        @SharedPtr FileMetaData metadata/*=nullptr*/);
  public static native @UniquePtr ParquetFileReader OpenFile(
        @StdString BytePointer path);

  public native void Open(@UniquePtr Contents contents);
  public native void Close();

  // The RowGroupReader is owned by the FileReader
  public native @SharedPtr RowGroupReader RowGroup(int i);

  // Returns the file metadata. Only one instance is ever created
  
  ///
  ///
  ///
  public native @SharedPtr FileMetaData metadata();

  /** Pre-buffer the specified column indices in all row groups.
   * 
   *  Readers can optionally call this to cache the necessary slices
   *  of the file in-memory before deserialization. Arrow readers can
   *  automatically do this via an option. This is intended to
   *  increase performance when reading from high-latency filesystems
   *  (e.g. Amazon S3).
   * 
   *  After calling this, creating readers for row groups/column
   *  indices that were not buffered may fail. Creating multiple
   *  readers for the a subset of the buffered regions is
   *  acceptable. This may be called again to buffer a different set
   *  of row groups/columns.
   * 
   *  If memory usage is a concern, note that data will remain
   *  buffered in memory until either \a PreBuffer() is called again,
   *  or the reader itself is destructed. Reading - and buffering -
   *  only one row group at a time may be useful. */
  public native @ByVal Future PreBuffer(@StdVector IntPointer row_groups,
                                @StdVector IntPointer column_indices,
                                @Const @ByRef IOContext ctx,
                                @Const @ByRef CacheOptions options);
  public native @ByVal Future PreBuffer(@StdVector IntBuffer row_groups,
                                @StdVector IntBuffer column_indices,
                                @Const @ByRef IOContext ctx,
                                @Const @ByRef CacheOptions options);
  public native @ByVal Future PreBuffer(@StdVector int[] row_groups,
                                @StdVector int[] column_indices,
                                @Const @ByRef IOContext ctx,
                                @Const @ByRef CacheOptions options);
}
