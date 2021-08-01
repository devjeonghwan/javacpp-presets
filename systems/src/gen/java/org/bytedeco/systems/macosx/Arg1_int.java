// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


// #endif  /* (!_POSIX_C_SOURCE || _DARWIN_C_SOURCE) */
// #endif  /* !_ANSI_SOURCE */

/*
 * For historical reasons; programs expect signal's return value to be
 * defined by <sys/signal.h>.
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class Arg1_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Arg1_int(Pointer p) { super(p); }
    protected Arg1_int() { allocate(); }
    private native void allocate();
    public native void call(int arg0);
}
