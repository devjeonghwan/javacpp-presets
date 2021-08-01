// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Note that not all platforms support MMAP-based allocation.
// Use `IsSupported()` to check.
@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class MMAPAllocation extends Allocation {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MMAPAllocation(Pointer p) { super(p); }

  // Loads and maps the provided file to a memory region.
  public MMAPAllocation(@Cast("const char*") BytePointer filename, ErrorReporter error_reporter) { super((Pointer)null); allocate(filename, error_reporter); }
  private native void allocate(@Cast("const char*") BytePointer filename, ErrorReporter error_reporter);
  public MMAPAllocation(String filename, ErrorReporter error_reporter) { super((Pointer)null); allocate(filename, error_reporter); }
  private native void allocate(String filename, ErrorReporter error_reporter);

  // Maps the provided file descriptor to a memory region.
  // Note: The provided file descriptor will be dup'ed for usage; the caller
  // retains ownership of the provided descriptor and should close accordingly.
  public MMAPAllocation(int fd, ErrorReporter error_reporter) { super((Pointer)null); allocate(fd, error_reporter); }
  private native void allocate(int fd, ErrorReporter error_reporter);
  public native @Const Pointer base();
  public native @Cast("size_t") long bytes();
  public native @Cast("bool") boolean valid();

  public native int fd();

  public static native @Cast("bool") boolean IsSupported();
}
