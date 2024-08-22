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
 * \brief The activity record for an instantaneous CUPTI event.
 *
 * This activity record represents a CUPTI event value
 * (CUPTI_ACTIVITY_KIND_EVENT) sampled at a particular instant.
 * This activity record kind is not produced by the activity API but is
 * included for completeness and ease-of-use. Profiler frameworks built on
 * top of CUPTI that collect event data at a particular time may choose to
 * use this type to store the collected event data.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityInstantaneousEvent extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityInstantaneousEvent() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityInstantaneousEvent(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityInstantaneousEvent(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityInstantaneousEvent position(long position) {
        return (CUpti_ActivityInstantaneousEvent)super.position(position);
    }
    @Override public CUpti_ActivityInstantaneousEvent getPointer(long i) {
        return new CUpti_ActivityInstantaneousEvent((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_INSTANTANEOUS_EVENT.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityInstantaneousEvent kind(int setter);

  /**
   * The event ID.
   */
  public native @Cast("CUpti_EventID") int id(); public native CUpti_ActivityInstantaneousEvent id(int setter);

  /**
   * The event value.
   */
  public native @Cast("uint64_t") long value(); public native CUpti_ActivityInstantaneousEvent value(long setter);

  /**
   * The timestamp at which event is sampled
   */
  public native @Cast("uint64_t") long timestamp(); public native CUpti_ActivityInstantaneousEvent timestamp(long setter);

  /**
   * The device id
   */
  public native @Cast("uint32_t") int deviceId(); public native CUpti_ActivityInstantaneousEvent deviceId(int setter);

  /**
   * Undefined. reserved for internal use
   */
  public native @Cast("uint32_t") int reserved(); public native CUpti_ActivityInstantaneousEvent reserved(int setter);
}
