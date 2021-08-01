// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /* Activations */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class ActivationLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ActivationLayer(Pointer p) { super(p); }
    
        public native void forwardSlice(@Const FloatPointer src, FloatPointer dst, int len,
                                          @Cast("size_t") long outPlaneSize, int cn0, int cn1);
        public native void forwardSlice(@Const FloatBuffer src, FloatBuffer dst, int len,
                                          @Cast("size_t") long outPlaneSize, int cn0, int cn1);
        public native void forwardSlice(@Const float[] src, float[] dst, int len,
                                          @Cast("size_t") long outPlaneSize, int cn0, int cn1);
    }
