// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;
              /* hastzinfo true */


/* All datetime objects are of PyDateTime_DateTimeType, but that can be
 * allocated in two ways too, just like for time objects above.  In addition,
 * the plain date type is a base class for datetime, so it must also have
 * a hastzinfo member (although it's unused there).
 */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDateTime_Date extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDateTime_Date() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDateTime_Date(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDateTime_Date(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDateTime_Date position(long position) {
        return (PyDateTime_Date)super.position(position);
    }
    @Override public PyDateTime_Date getPointer(long i) {
        return new PyDateTime_Date((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyDateTime_Date ob_base(PyObject setter);
    public native @Cast("Py_hash_t") long hashcode(); public native PyDateTime_Date hashcode(long setter);
    public native @Cast("char") byte hastzinfo(); public native PyDateTime_Date hastzinfo(byte setter);             /* boolean flag */
    public native @Cast("unsigned char") byte data(int i); public native PyDateTime_Date data(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer data();
}
