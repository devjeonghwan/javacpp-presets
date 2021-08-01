// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;

/** Use this function to override b2Free() without recompiling this library. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2FreeFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    b2FreeFunction(Pointer p) { super(p); }
    protected b2FreeFunction() { allocate(); }
    private native void allocate();
    public native void call(Pointer mem, Pointer callbackData);
}
