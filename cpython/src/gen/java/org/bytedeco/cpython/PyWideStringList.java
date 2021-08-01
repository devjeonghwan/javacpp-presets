// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* --- PyWideStringList ------------------------------------------------ */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyWideStringList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyWideStringList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyWideStringList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyWideStringList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyWideStringList position(long position) {
        return (PyWideStringList)super.position(position);
    }
    @Override public PyWideStringList getPointer(long i) {
        return new PyWideStringList((Pointer)this).offsetAddress(i);
    }

    /* If length is greater than zero, items must be non-NULL
       and all items strings must be non-NULL */
    public native @Cast("Py_ssize_t") long length(); public native PyWideStringList length(long setter);
    public native @Cast("wchar_t*") Pointer items(int i); public native PyWideStringList items(int i, Pointer setter);
    public native @Cast("wchar_t**") PointerPointer items(); public native PyWideStringList items(PointerPointer setter);
}
