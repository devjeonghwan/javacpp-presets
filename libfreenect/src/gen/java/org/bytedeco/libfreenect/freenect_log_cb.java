// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect.global.freenect.*;


/** Typedef for logging callback functions */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_log_cb extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    freenect_log_cb(Pointer p) { super(p); }
    protected freenect_log_cb() { allocate(); }
    private native void allocate();
    public native void call(freenect_context dev, @Cast("freenect_loglevel") int level, @Cast("const char*") BytePointer msg);
}
