// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyBytesObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyBytesObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyBytesObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyBytesObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyBytesObject position(long position) {
        return (PyBytesObject)super.position(position);
    }
    @Override public PyBytesObject getPointer(long i) {
        return new PyBytesObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyVarObject ob_base(); public native PyBytesObject ob_base(PyVarObject setter);
    public native @Cast("Py_hash_t") long ob_shash(); public native PyBytesObject ob_shash(long setter);
    public native @Cast("char") byte ob_sval(int i); public native PyBytesObject ob_sval(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer ob_sval();

    /* Invariants:
     *     ob_sval contains space for 'ob_size+1' elements.
     *     ob_sval[ob_size] == 0.
     *     ob_shash is the hash of the string or -1 if not computed yet.
     */
}
