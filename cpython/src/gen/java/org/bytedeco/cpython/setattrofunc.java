// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class setattrofunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    setattrofunc(Pointer p) { super(p); }
    protected setattrofunc() { allocate(); }
    private native void allocate();
    public native int call(PyObject arg0, PyObject arg1, PyObject arg2);
}
