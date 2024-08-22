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
 * \brief A group of events.
 *
 * An event group is a collection of events that are managed
 * together. All events in an event group must belong to the same
 * domain.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_EventGroup extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUpti_EventGroup() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_EventGroup(Pointer p) { super(p); }
}
