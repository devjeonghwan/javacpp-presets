// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDateTime_TZInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDateTime_TZInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDateTime_TZInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDateTime_TZInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDateTime_TZInfo position(long position) {
        return (PyDateTime_TZInfo)super.position(position);
    }
    @Override public PyDateTime_TZInfo getPointer(long i) {
        return new PyDateTime_TZInfo((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyDateTime_TZInfo ob_base(PyObject setter);               /* a pure abstract base class */
}
