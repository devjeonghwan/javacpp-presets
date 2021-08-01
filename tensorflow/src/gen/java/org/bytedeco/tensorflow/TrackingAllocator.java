// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TrackingAllocator extends Allocator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackingAllocator(Pointer p) { super(p); }

  public native @StdString BytePointer Name();
  public native Pointer AllocateRaw(@Cast("size_t") long alignment, @Cast("size_t") long num_bytes);
  public native Pointer AllocateRaw(@Cast("size_t") long alignment, @Cast("size_t") long num_bytes,
                      @Const @ByRef AllocationAttributes allocation_attr);
  public native void DeallocateRaw(Pointer ptr);
  public native @Cast("bool") boolean TracksAllocationSizes();
  public native @Cast("size_t") long RequestedSize(@Const Pointer ptr);
  public native @Cast("size_t") long AllocatedSize(@Const Pointer ptr);
  public native @Cast("tensorflow::int64") long AllocationId(@Const Pointer ptr);
  public native void ClearStats();

  // If the underlying allocator tracks allocation sizes, this returns
  // a tuple where the first value is the total number of bytes
  // allocated through this wrapper, the second value is the high
  // watermark of bytes allocated through this wrapper and the third value is
  // the allocated bytes through this wrapper that are still alive. If the
  // underlying allocator does not track allocation sizes the first
  // value is the total number of bytes requested through this wrapper
  // and the second and the third are 0.
  //
  public native @ByVal @Cast("std::tuple<size_t,size_t,size_t>*") SizeTPointer GetSizes();
  // After GetRecordsAndUnRef is called, the only further calls allowed
  // on this wrapper are calls to DeallocateRaw with pointers that
  // were allocated by this wrapper and have not yet been
  // deallocated. After this call completes and all allocated pointers
  // have been deallocated the wrapper will delete itself.
  public native @ByVal AllocRecordVector GetRecordsAndUnRef();
  // Returns a copy of allocation records collected so far.
  public native @ByVal AllocRecordVector GetCurrentRecords();
}
