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
 * \brief The activity record for a CUPTI event.
 *
 * This activity record represents a CUPTI event value
 * (CUPTI_ACTIVITY_KIND_EVENT). This activity record kind is not
 * produced by the activity API but is included for completeness and
 * ease-of-use. Profile frameworks built on top of CUPTI that collect
 * event data may choose to use this type to store the collected event
 * data.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityEvent extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityEvent() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityEvent(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityEvent(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityEvent position(long position) {
        return (CUpti_ActivityEvent)super.position(position);
    }
    @Override public CUpti_ActivityEvent getPointer(long i) {
        return new CUpti_ActivityEvent((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_EVENT.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityEvent kind(int setter);

  /**
   * The event ID.
   */
  public native @Cast("CUpti_EventID") int id(); public native CUpti_ActivityEvent id(int setter);

  /**
   * The event value.
   */
  public native @Cast("uint64_t") long value(); public native CUpti_ActivityEvent value(long setter);

  /**
   * The event domain ID.
   */
  public native @Cast("CUpti_EventDomainID") int domain(); public native CUpti_ActivityEvent domain(int setter);

  /**
   * The correlation ID of the event. Use of this ID is user-defined,
   * but typically this ID value will equal the correlation ID of the
   * kernel for which the event was gathered.
   */
  public native @Cast("uint32_t") int correlationId(); public native CUpti_ActivityEvent correlationId(int setter);
}
