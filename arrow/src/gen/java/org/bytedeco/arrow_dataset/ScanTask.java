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


/** \brief Read record batches from a range of a single data fragment. A
 *  ScanTask is meant to be a unit of work to be dispatched. The implementation
 *  must be thread and concurrent safe. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ScanTask extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScanTask(Pointer p) { super(p); }

  /** \brief Iterate through sequence of materialized record batches
   *  resulting from the Scan. Execution semantics are encapsulated in the
   *  particular ScanTask implementation */
  public native @ByVal RecordBatchIteratorResult Execute();

  public native @SharedPtr ScanOptions options();
  public native @Const @SharedPtr @ByRef Fragment fragment();
}
