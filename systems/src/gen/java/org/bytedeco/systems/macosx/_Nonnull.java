// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;

@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class _Nonnull extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    _Nonnull(Pointer p) { super(p); }
    protected _Nonnull() { allocate(); }
    private native void allocate();
    public native void call();
}
