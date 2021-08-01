// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Options for making a FileSystemDataset from a Parquet _metadata file. */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ParquetFactoryOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParquetFactoryOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParquetFactoryOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFactoryOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParquetFactoryOptions position(long position) {
        return (ParquetFactoryOptions)super.position(position);
    }
    @Override public ParquetFactoryOptions getPointer(long i) {
        return new ParquetFactoryOptions((Pointer)this).offsetAddress(i);
    }

  /** Either an explicit Partitioning or a PartitioningFactory to discover one.
   * 
   *  If a factory is provided, it will be used to infer a schema for partition fields
   *  based on file and directory paths then construct a Partitioning. The default
   *  is a Partitioning which will yield no partition information.
   * 
   *  The (explicit or discovered) partitioning will be applied to discovered files
   *  and the resulting partition information embedded in the Dataset. */
  
  ///
  ///
  ///
  ///
  public native @ByRef PartitioningOrFactory partitioning(); public native ParquetFactoryOptions partitioning(PartitioningOrFactory setter);

  /** For the purposes of applying the partitioning, paths will be stripped
   *  of the partition_base_dir. Files not matching the partition_base_dir
   *  prefix will be skipped for partition discovery. The ignored files will still
   *  be part of the Dataset, but will not have partition information.
   * 
   *  Example:
   *  partition_base_dir = "/dataset";
   * 
   *  - "/dataset/US/sales.csv" -> "US/sales.csv" will be given to the partitioning
   * 
   *  - "/home/john/late_sales.csv" -> Will be ignored for partition discovery.
   * 
   *  This is useful for partitioning which parses directory when ordering
   *  is important, e.g. DirectoryPartitioning. */
  public native @StdString String partition_base_dir(); public native ParquetFactoryOptions partition_base_dir(String setter);

  /** Assert that all ColumnChunk paths are consistent. The parquet spec allows for
   *  ColumnChunk data to be stored in multiple files, but ParquetDatasetFactory
   *  supports only a single file with all ColumnChunk data. If this flag is set
   *  construction of a ParquetDatasetFactory will raise an error if ColumnChunk
   *  data is not resident in a single file. */
  public native @Cast("bool") boolean validate_column_chunk_paths(); public native ParquetFactoryOptions validate_column_chunk_paths(boolean setter);
}
