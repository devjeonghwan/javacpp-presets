// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// An interface for reporting thread local memory usage
// per device
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MemoryReportingInfoBase extends DebugInfoBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryReportingInfoBase(Pointer p) { super(p); }


  // Negative alloc_size corresponds to freeing of the memory
  public native void reportMemoryUsage(
        Pointer ptr,
        @Cast("int64_t") long alloc_size,
        @ByVal Device device);

  public native @Cast("bool") boolean memoryProfilingEnabled();
}
