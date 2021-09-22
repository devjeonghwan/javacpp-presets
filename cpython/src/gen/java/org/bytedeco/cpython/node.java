// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class node extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public node() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public node(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public node(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public node position(long position) {
        return (node)super.position(position);
    }
    @Override public node getPointer(long i) {
        return new node((Pointer)this).offsetAddress(i);
    }

    public native short n_type(); public native node n_type(short setter);
    public native @Cast("char*") BytePointer n_str(); public native node n_str(BytePointer setter);
    public native int n_lineno(); public native node n_lineno(int setter);
    public native int n_col_offset(); public native node n_col_offset(int setter);
    public native int n_nchildren(); public native node n_nchildren(int setter);
    public native @Cast("_node*") node n_child(); public native node n_child(node setter);
    public native int n_end_lineno(); public native node n_end_lineno(int setter);
    public native int n_end_col_offset(); public native node n_end_col_offset(int setter);
}
