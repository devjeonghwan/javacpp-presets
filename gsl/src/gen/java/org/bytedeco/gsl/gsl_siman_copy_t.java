// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_siman_copy_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    gsl_siman_copy_t(Pointer p) { super(p); }
    protected gsl_siman_copy_t() { allocate(); }
    private native void allocate();
    public native void call(Pointer source, Pointer dest);
}
