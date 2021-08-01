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


/** \brief Combines a record batch with the fragment that the record batch originated
 *  from
 * 
 *  Knowing the source fragment can be useful for debugging & understanding loaded data */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class TaggedRecordBatch extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TaggedRecordBatch() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TaggedRecordBatch(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TaggedRecordBatch(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TaggedRecordBatch position(long position) {
        return (TaggedRecordBatch)super.position(position);
    }
    @Override public TaggedRecordBatch getPointer(long i) {
        return new TaggedRecordBatch((Pointer)this).offsetAddress(i);
    }

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::RecordBatch>"}) RecordBatch record_batch(); public native TaggedRecordBatch record_batch(RecordBatch setter);
  public native @SharedPtr @ByRef Fragment fragment(); public native TaggedRecordBatch fragment(Fragment setter);
}
