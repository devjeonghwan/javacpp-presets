// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect.global.freenect.*;


@Opaque @Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class _freenect_context extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _freenect_context() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _freenect_context(Pointer p) { super(p); }
}
