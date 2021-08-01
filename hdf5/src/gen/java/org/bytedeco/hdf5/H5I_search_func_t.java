// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * The type of a function to compare objects & keys
 */
/** <!-- [H5I_search_func_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5I_search_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5I_search_func_t(Pointer p) { super(p); }
    protected H5I_search_func_t() { allocate(); }
    private native void allocate();
    public native int call(Pointer obj, @Cast("hid_t") long id, Pointer key);
}
