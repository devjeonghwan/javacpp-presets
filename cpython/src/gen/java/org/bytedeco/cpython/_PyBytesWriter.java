// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



/* The _PyBytesWriter structure is big: it contains an embedded "stack buffer".
   A _PyBytesWriter variable must be declared at the end of variables in a
   function to optimize the memory allocation on the stack. */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyBytesWriter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyBytesWriter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyBytesWriter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyBytesWriter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyBytesWriter position(long position) {
        return (_PyBytesWriter)super.position(position);
    }
    @Override public _PyBytesWriter getPointer(long i) {
        return new _PyBytesWriter((Pointer)this).offsetAddress(i);
    }

    /* bytes, bytearray or NULL (when the small buffer is used) */
    public native PyObject buffer(); public native _PyBytesWriter buffer(PyObject setter);

    /* Number of allocated size. */
    public native @Cast("Py_ssize_t") long allocated(); public native _PyBytesWriter allocated(long setter);

    /* Minimum number of allocated bytes,
       incremented by _PyBytesWriter_Prepare() */
    public native @Cast("Py_ssize_t") long min_size(); public native _PyBytesWriter min_size(long setter);

    /* If non-zero, use a bytearray instead of a bytes object for buffer. */
    public native int use_bytearray(); public native _PyBytesWriter use_bytearray(int setter);

    /* If non-zero, overallocate the buffer (default: 0).
       This flag must be zero if use_bytearray is non-zero. */
    public native int overallocate(); public native _PyBytesWriter overallocate(int setter);

    /* Stack buffer */
    public native int use_small_buffer(); public native _PyBytesWriter use_small_buffer(int setter);
    public native @Cast("char") byte small_buffer(int i); public native _PyBytesWriter small_buffer(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer small_buffer();
}
