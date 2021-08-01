// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyTryBlock extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyTryBlock() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyTryBlock(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyTryBlock(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyTryBlock position(long position) {
        return (PyTryBlock)super.position(position);
    }
    @Override public PyTryBlock getPointer(long i) {
        return new PyTryBlock((Pointer)this).offsetAddress(i);
    }

    public native int b_type(); public native PyTryBlock b_type(int setter);                 /* what kind of block this is */
    public native int b_handler(); public native PyTryBlock b_handler(int setter);              /* where to jump to find handler */
    public native int b_level(); public native PyTryBlock b_level(int setter);                /* value stack level to pop to */
}
