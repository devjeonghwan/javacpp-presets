// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Collect schema and record batches decoded by StreamDecoder.
 * 
 *  This API is EXPERIMENTAL.
 * 
 *  @since 0.17.0 */
@Namespace("arrow::ipc") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CollectListener extends Listener {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectListener(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollectListener(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CollectListener position(long position) {
        return (CollectListener)super.position(position);
    }
    @Override public CollectListener getPointer(long i) {
        return new CollectListener((Pointer)this).offsetAddress(i);
    }

  public CollectListener() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal Status OnSchemaDecoded(@SharedPtr @ByVal Schema schema);

  public native @ByVal Status OnRecordBatchDecoded(@SharedPtr @Cast({"", "std::shared_ptr<arrow::RecordBatch>"}) RecordBatch record_batch);

  /** @return the decoded schema */
  public native @SharedPtr @ByVal Schema schema();

  /** @return the all decoded record batches */
  public native @ByVal RecordBatchVector record_batches();
}
