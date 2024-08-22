// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cupti;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cupti.*;


/**
 * \brief The activity record for CDP (CUDA Dynamic Parallelism)
 * kernel.
 *
 * This activity record represents a CDP kernel execution.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityCdpKernel extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityCdpKernel() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityCdpKernel(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityCdpKernel(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityCdpKernel position(long position) {
        return (CUpti_ActivityCdpKernel)super.position(position);
    }
    @Override public CUpti_ActivityCdpKernel getPointer(long i) {
        return new CUpti_ActivityCdpKernel((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_CDP_KERNEL
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityCdpKernel kind(int setter);

    @Name("cacheConfig.both") public native @Cast("uint8_t") byte cacheConfig_both(); public native CUpti_ActivityCdpKernel cacheConfig_both(byte setter);
      /**
       * The cache configuration requested by the kernel. The value is one
       * of the CUfunc_cache enumeration values from cuda.h.
       */
      @Name("cacheConfig.config.requested") public native @Cast("uint8_t") @NoOffset byte cacheConfig_config_requested(); public native CUpti_ActivityCdpKernel cacheConfig_config_requested(byte setter);

      /**
       * The cache configuration used for the kernel. The value is one of
       * the CUfunc_cache enumeration values from cuda.h.
       */
      @Name("cacheConfig.config.executed") public native @Cast("uint8_t") @NoOffset byte cacheConfig_config_executed(); public native CUpti_ActivityCdpKernel cacheConfig_config_executed(byte setter);

  /**
   * The shared memory configuration used for the kernel. The value is one of
   * the CUsharedconfig enumeration values from cuda.h.
   */
  public native @Cast("uint8_t") byte sharedMemoryConfig(); public native CUpti_ActivityCdpKernel sharedMemoryConfig(byte setter);

  /**
   * The number of registers required for each thread executing the
   * kernel.
   */
  public native @Cast("uint16_t") short registersPerThread(); public native CUpti_ActivityCdpKernel registersPerThread(short setter);

  /**
   * The start timestamp for the kernel execution, in ns. A value of 0
   * for both the start and end timestamps indicates that timestamp
   * information could not be collected for the kernel.
   */
  public native @Cast("uint64_t") long start(); public native CUpti_ActivityCdpKernel start(long setter);

  /**
   * The end timestamp for the kernel execution, in ns. A value of 0
   * for both the start and end timestamps indicates that timestamp
   * information could not be collected for the kernel.
   */
  public native @Cast("uint64_t") long end(); public native CUpti_ActivityCdpKernel end(long setter);

  /**
   * The ID of the device where the kernel is executing.
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityCdpKernel deviceId(int setter);

  /**
   * The ID of the context where the kernel is executing.
   */
  public native @Cast("uint32_t") int contextId(); public native CUpti_ActivityCdpKernel contextId(int setter);

  /**
   * The ID of the stream where the kernel is executing.
   */
  public native @Cast("uint32_t") int streamId(); public native CUpti_ActivityCdpKernel streamId(int setter);

  /**
   * The X-dimension grid size for the kernel.
   */
  public native int gridX(); public native CUpti_ActivityCdpKernel gridX(int setter);

  /**
   * The Y-dimension grid size for the kernel.
   */
  public native int gridY(); public native CUpti_ActivityCdpKernel gridY(int setter);

  /**
   * The Z-dimension grid size for the kernel.
   */
  public native int gridZ(); public native CUpti_ActivityCdpKernel gridZ(int setter);

  /**
   * The X-dimension block size for the kernel.
   */
  public native int blockX(); public native CUpti_ActivityCdpKernel blockX(int setter);

  /**
   * The Y-dimension block size for the kernel.
   */
  public native int blockY(); public native CUpti_ActivityCdpKernel blockY(int setter);

  /**
   * The Z-dimension grid size for the kernel.
   */
  public native int blockZ(); public native CUpti_ActivityCdpKernel blockZ(int setter);

  /**
   * The static shared memory allocated for the kernel, in bytes.
   */
  public native int staticSharedMemory(); public native CUpti_ActivityCdpKernel staticSharedMemory(int setter);

  /**
   * The dynamic shared memory reserved for the kernel, in bytes.
   */
  public native int dynamicSharedMemory(); public native CUpti_ActivityCdpKernel dynamicSharedMemory(int setter);

  /**
   * The amount of local memory reserved for each thread, in bytes.
   */
  public native @Cast("uint32_t") int localMemoryPerThread(); public native CUpti_ActivityCdpKernel localMemoryPerThread(int setter);

  /**
   * The total amount of local memory reserved for the kernel, in
   * bytes.
   */
  public native @Cast("uint32_t") int localMemoryTotal(); public native CUpti_ActivityCdpKernel localMemoryTotal(int setter);

  /**
   * The correlation ID of the kernel. Each kernel execution is
   * assigned a unique correlation ID that is identical to the
   * correlation ID in the driver API activity record that launched
   * the kernel.
   */
  public native @Cast("uint32_t") int correlationId(); public native CUpti_ActivityCdpKernel correlationId(int setter);

  /**
   * The grid ID of the kernel. Each kernel execution
   * is assigned a unique grid ID.
   */
  public native @Cast("int64_t") long gridId(); public native CUpti_ActivityCdpKernel gridId(long setter);

  /**
   * The grid ID of the parent kernel.
   */
  public native @Cast("int64_t") long parentGridId(); public native CUpti_ActivityCdpKernel parentGridId(long setter);

  /**
   * The timestamp when kernel is queued up, in ns. A value of
   * CUPTI_TIMESTAMP_UNKNOWN indicates that the queued time is
   * unknown.
   */
  public native @Cast("uint64_t") long queued(); public native CUpti_ActivityCdpKernel queued(long setter);

  /**
   * The timestamp when kernel is submitted to the gpu, in ns. A value
   * of CUPTI_TIMESTAMP_UNKNOWN indicates that the submission time is
   * unknown.
   */
  public native @Cast("uint64_t") long submitted(); public native CUpti_ActivityCdpKernel submitted(long setter);

  /**
   * The timestamp when kernel is marked as completed, in ns. A value
   * of CUPTI_TIMESTAMP_UNKNOWN indicates that the completion time is
   * unknown.
   */
  public native @Cast("uint64_t") long completed(); public native CUpti_ActivityCdpKernel completed(long setter);

  /**
   * The X-dimension of the parent block.
   */
  public native @Cast("uint32_t") int parentBlockX(); public native CUpti_ActivityCdpKernel parentBlockX(int setter);

  /**
   * The Y-dimension of the parent block.
   */
  public native @Cast("uint32_t") int parentBlockY(); public native CUpti_ActivityCdpKernel parentBlockY(int setter);

  /**
   * The Z-dimension of the parent block.
   */
  public native @Cast("uint32_t") int parentBlockZ(); public native CUpti_ActivityCdpKernel parentBlockZ(int setter);

// #ifdef CUPTILP64
  /**
   * Undefined. Reserved for internal use.
   */
  public native @Cast("uint32_t") int pad(); public native CUpti_ActivityCdpKernel pad(int setter);
// #endif

  /**
   * The name of the kernel. This name is shared across all activity
   * records representing the same kernel, and so should not be
   * modified.
   */
  public native @Cast("const char*") BytePointer name(); public native CUpti_ActivityCdpKernel name(BytePointer setter);
}
