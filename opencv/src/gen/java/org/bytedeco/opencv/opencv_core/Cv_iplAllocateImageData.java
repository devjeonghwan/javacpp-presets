// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Convention("CV_STDCALL") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Cv_iplAllocateImageData extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Cv_iplAllocateImageData(Pointer p) { super(p); }
    protected Cv_iplAllocateImageData() { allocate(); }
    private native void allocate();
    public native void call(IplImage arg0,int arg1,int arg2);
}
