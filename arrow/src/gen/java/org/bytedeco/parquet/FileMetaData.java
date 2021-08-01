// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief FileMetaData is a proxy around format::FileMetaData. */
@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class FileMetaData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileMetaData(Pointer p) { super(p); }

  /** \brief Create a FileMetaData from a serialized thrift message. */
  public static native @SharedPtr FileMetaData Make(
        @Const Pointer serialized_metadata, @Cast("uint32_t*") IntPointer inout_metadata_len,
        @SharedPtr InternalFileDecryptor file_decryptor/*=nullptr*/);
  public static native @SharedPtr FileMetaData Make(
        @Const Pointer serialized_metadata, @Cast("uint32_t*") IntPointer inout_metadata_len);
  public static native @SharedPtr FileMetaData Make(
        @Const Pointer serialized_metadata, @Cast("uint32_t*") IntBuffer inout_metadata_len,
        @SharedPtr InternalFileDecryptor file_decryptor/*=nullptr*/);
  public static native @SharedPtr FileMetaData Make(
        @Const Pointer serialized_metadata, @Cast("uint32_t*") IntBuffer inout_metadata_len);
  public static native @SharedPtr FileMetaData Make(
        @Const Pointer serialized_metadata, @Cast("uint32_t*") int[] inout_metadata_len,
        @SharedPtr InternalFileDecryptor file_decryptor/*=nullptr*/);
  public static native @SharedPtr FileMetaData Make(
        @Const Pointer serialized_metadata, @Cast("uint32_t*") int[] inout_metadata_len);

  
  ///
  public native @Cast("bool") boolean Equals(@Const @ByRef FileMetaData other);

  /** \brief The number of top-level columns in the schema.
   * 
   *  Parquet thrift definition requires that nested schema elements are
   *  flattened. This method returns the number of columns in the un-flattened
   *  version. */
  
  ///
  public native int num_columns();

  /** \brief The number of flattened schema elements.
   * 
   *  Parquet thrift definition requires that nested schema elements are
   *  flattened. This method returns the total number of elements in the
   *  flattened list. */
  public native int num_schema_elements();

  /** \brief The total number of rows. */
  public native @Cast("int64_t") long num_rows();

  /** \brief The number of row groups in the file. */
  
  ///
  ///
  ///
  public native int num_row_groups();

  /** \brief Return the RowGroupMetaData of the corresponding row group ordinal.
   * 
   *  WARNING, the returned object references memory location in it's parent
   *  (FileMetaData) object. Hence, the parent must outlive the returned object.
   * 
   *  @param index [in] of the RowGroup to retrieve.
   * 
   *  @throws ParquetException if the index is out of bound. */
  public native @UniquePtr RowGroupMetaData RowGroup(int index);

  /** \brief Return the version of the file. */
  public native ParquetVersion.type version();

  /** \brief Return the application's user-agent string of the writer. */
  public native @StdString String created_by();

  /** \brief Return the application's version of the writer. */
  public native @Const @ByRef ApplicationVersion writer_version();

  /** \brief Size of the original thrift encoded metadata footer. */
  
  ///
  public native @Cast("uint32_t") int size();

  /** \brief Indicate if all of the FileMetadata's RowGroups can be decompressed.
   * 
   *  This will return false if any of the RowGroup's page is compressed with a
   *  compression format which is not compiled in the current parquet library. */
  public native @Cast("bool") boolean can_decompress();

  public native @Cast("bool") boolean is_encryption_algorithm_set();
  public native @ByVal EncryptionAlgorithm encryption_algorithm();
  public native @StdString String footer_signing_key_metadata();

  /** \brief Verify signature of FileMetaData when file is encrypted but footer
   *  is not encrypted (plaintext footer). */
  public native @Cast("bool") boolean VerifySignature(@Const Pointer signature);

  public native void WriteTo(OutputStream dst);

  /** \brief Return Thrift-serialized representation of the metadata as a
   *  string */
  public native @StdString String SerializeToString();

  // Return const-pointer to make it clear that this object is not to be copied
  public native @Const SchemaDescriptor schema();

  
  ///
  ///
  public native @Const @SharedPtr KeyValueMetadata key_value_metadata();

  /** \brief Set a path to all ColumnChunk for all RowGroups.
   * 
   *  Commonly used by systems (Dask, Spark) who generates an metadata-only
   *  parquet file. The path is usually relative to said index file.
   * 
   *  @param path [in] to set. */
  
  ///
  ///
  ///
  ///
  public native void set_file_path(@StdString String path);
  public native void set_file_path(@StdString BytePointer path);

  /** \brief Merge row groups from another metadata file into this one.
   * 
   *  The schema of the input FileMetaData must be equal to the
   *  schema of this object.
   * 
   *  This is used by systems who creates an aggregate metadata-only file by
   *  concatenating the row groups of multiple files. This newly created
   *  metadata file acts as an index of all available row groups.
   * 
   *  @param other [in] FileMetaData to merge the row groups from.
   * 
   *  @throws ParquetException if schemas are not equal. */
  public native void AppendRowGroups(@Const @ByRef FileMetaData other);

  /** \brief Return a FileMetaData containing a subset of the row groups in this
   *  FileMetaData. */
  public native @SharedPtr FileMetaData Subset(@StdVector IntPointer row_groups);
  public native @SharedPtr FileMetaData Subset(@StdVector IntBuffer row_groups);
  public native @SharedPtr FileMetaData Subset(@StdVector int[] row_groups);
}
