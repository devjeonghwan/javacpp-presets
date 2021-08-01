// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _arguments extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _arguments() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _arguments(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _arguments(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _arguments position(long position) {
        return (_arguments)super.position(position);
    }
    @Override public _arguments getPointer(long i) {
        return new _arguments((Pointer)this).offsetAddress(i);
    }

    public native asdl_seq posonlyargs(); public native _arguments posonlyargs(asdl_seq setter);
    public native asdl_seq args(); public native _arguments args(asdl_seq setter);
    public native _arg vararg(); public native _arguments vararg(_arg setter);
    public native asdl_seq kwonlyargs(); public native _arguments kwonlyargs(asdl_seq setter);
    public native asdl_seq kw_defaults(); public native _arguments kw_defaults(asdl_seq setter);
    public native _arg kwarg(); public native _arguments kwarg(_arg setter);
    public native asdl_seq defaults(); public native _arguments defaults(asdl_seq setter);
}
