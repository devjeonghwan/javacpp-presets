// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyDateTime_BaseDateTime extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyDateTime_BaseDateTime() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyDateTime_BaseDateTime(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyDateTime_BaseDateTime(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyDateTime_BaseDateTime position(long position) {
        return (_PyDateTime_BaseDateTime)super.position(position);
    }
    @Override public _PyDateTime_BaseDateTime getPointer(long i) {
        return new _PyDateTime_BaseDateTime((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native _PyDateTime_BaseDateTime ob_base(PyObject setter);
    public native @Cast("Py_hash_t") long hashcode(); public native _PyDateTime_BaseDateTime hashcode(long setter);
    public native @Cast("char") byte hastzinfo(); public native _PyDateTime_BaseDateTime hastzinfo(byte setter);             /* boolean flag */
    public native @Cast("unsigned char") byte data(int i); public native _PyDateTime_BaseDateTime data(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer data();
}
