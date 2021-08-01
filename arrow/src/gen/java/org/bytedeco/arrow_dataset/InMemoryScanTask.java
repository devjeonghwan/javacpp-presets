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


/** \}
 <p>
 *  \brief A trivial ScanTask that yields the RecordBatch of an array. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class InMemoryScanTask extends ScanTask {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InMemoryScanTask(Pointer p) { super(p); }

  public InMemoryScanTask(@ByVal RecordBatchVector record_batches,
                     @SharedPtr ScanOptions options,
                     @SharedPtr @ByVal Fragment fragment) { super((Pointer)null); allocate(record_batches, options, fragment); }
  private native void allocate(@ByVal RecordBatchVector record_batches,
                     @SharedPtr ScanOptions options,
                     @SharedPtr @ByVal Fragment fragment);

  public native @ByVal RecordBatchIteratorResult Execute();
}
