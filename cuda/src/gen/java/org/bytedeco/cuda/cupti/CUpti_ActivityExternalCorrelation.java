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
 * \brief The activity record for correlation with external records
 *
 * This activity record correlates native CUDA records (e.g. CUDA Driver API,
 * kernels, memcpys, ...) with records from external APIs such as OpenACC.
 * (CUPTI_ACTIVITY_KIND_EXTERNAL_CORRELATION).
 *
 * @see CUpti_ActivityKind
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityExternalCorrelation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityExternalCorrelation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityExternalCorrelation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityExternalCorrelation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityExternalCorrelation position(long position) {
        return (CUpti_ActivityExternalCorrelation)super.position(position);
    }
    @Override public CUpti_ActivityExternalCorrelation getPointer(long i) {
        return new CUpti_ActivityExternalCorrelation((Pointer)this).offsetAddress(i);
    }

  /**
   * The kind of this activity.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityExternalCorrelation kind(int setter);

  /**
   * The kind of external API this record correlated to.
   */
  public native @Cast("CUpti_ExternalCorrelationKind") int externalKind(); public native CUpti_ActivityExternalCorrelation externalKind(int setter);

  /**
   * The correlation ID of the associated non-CUDA API record.
   * The exact field in the associated external record depends
   * on that record's activity kind (@see externalKind).
   */
  public native @Cast("uint64_t") long externalId(); public native CUpti_ActivityExternalCorrelation externalId(long setter);

  /**
   * The correlation ID of the associated CUDA driver or runtime API record.
   */
  public native @Cast("uint32_t") int correlationId(); public native CUpti_ActivityExternalCorrelation correlationId(int setter);

  /**
   * Undefined. Reserved for internal use.
   */
  public native @Cast("uint32_t") int reserved(); public native CUpti_ActivityExternalCorrelation reserved(int setter);
}
