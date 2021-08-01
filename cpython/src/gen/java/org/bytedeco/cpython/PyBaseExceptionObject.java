// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyBaseExceptionObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyBaseExceptionObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyBaseExceptionObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyBaseExceptionObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyBaseExceptionObject position(long position) {
        return (PyBaseExceptionObject)super.position(position);
    }
    @Override public PyBaseExceptionObject getPointer(long i) {
        return new PyBaseExceptionObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyBaseExceptionObject ob_base(PyObject setter); public native PyObject dict(); public native PyBaseExceptionObject dict(PyObject setter);
             public native PyObject args(); public native PyBaseExceptionObject args(PyObject setter); public native PyObject traceback(); public native PyBaseExceptionObject traceback(PyObject setter);
             public native PyObject context(); public native PyBaseExceptionObject context(PyObject setter); public native PyObject cause(); public native PyBaseExceptionObject cause(PyObject setter);
             public native @Cast("char") byte suppress_context(); public native PyBaseExceptionObject suppress_context(byte setter);
}
