// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMemberDescrObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMemberDescrObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMemberDescrObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMemberDescrObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMemberDescrObject position(long position) {
        return (PyMemberDescrObject)super.position(position);
    }
    @Override public PyMemberDescrObject getPointer(long i) {
        return new PyMemberDescrObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyDescrObject d_common(); public native PyMemberDescrObject d_common(PyDescrObject setter);
    public native PyMemberDef d_member(); public native PyMemberDescrObject d_member(PyMemberDef setter);
}
