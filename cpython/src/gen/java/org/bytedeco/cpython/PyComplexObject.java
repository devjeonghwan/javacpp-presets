// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/* Complex object interface */

/*
PyComplexObject represents a complex number with double-precision
real and imaginary parts.
*/
// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyComplexObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyComplexObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyComplexObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyComplexObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyComplexObject position(long position) {
        return (PyComplexObject)super.position(position);
    }
    @Override public PyComplexObject getPointer(long i) {
        return new PyComplexObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyComplexObject ob_base(PyObject setter);
    public native @ByRef Py_complex cval(); public native PyComplexObject cval(Py_complex setter);
}
