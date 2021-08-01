// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief DetectionNetwork, base for different network specializations
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DetectionNetwork extends NeuralNetwork {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionNetwork(Pointer p) { super(p); }


    public native @StdString @Override BytePointer getName();
    /**
     * Input message with data to be infered upon
     * Default queue is blocking with size 5
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Outputs ImgDetections message that carries parsed detection results.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Passthrough message on which the inference was performed.
     *
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthrough();

    /**
     * Specifies confidence threshold at which to filter the rest of the detections.
     * @param thresh Detection confidence must be greater than specified threshold to be added to the list
     */
    public native void setConfidenceThreshold(float thresh);
}
