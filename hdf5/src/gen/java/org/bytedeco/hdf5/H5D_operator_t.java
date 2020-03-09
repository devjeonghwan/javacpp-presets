// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Define the operator function pointer for H5Diterate() */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5D_operator_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5D_operator_t(Pointer p) { super(p); }
    protected H5D_operator_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(Pointer elem, @Cast("hid_t") long type_id, @Cast("unsigned") int ndim,
				 @Cast("const hsize_t*") LongPointer point, Pointer operator_data);
}
