// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaimgproc;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;

import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;


/** \} cudaimgproc_hist
<p>
//////////////////////////////// Canny ////////////////////////////////
<p>
/** \brief Base class for Canny Edge Detector. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaimgproc.class)
public class CannyEdgeDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CannyEdgeDetector(Pointer p) { super(p); }

    /** \brief Finds edges in an image using the \cite Canny86 algorithm.
    <p>
    @param image Single-channel 8-bit input image.
    @param edges Output edge map. It has the same size and type as image.
    @param stream Stream for the asynchronous version.
     */
    public native void detect(@ByVal Mat image, @ByVal Mat edges, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal Mat image, @ByVal Mat edges);
    public native void detect(@ByVal UMat image, @ByVal UMat edges, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal UMat image, @ByVal UMat edges);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat edges, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal GpuMat image, @ByVal GpuMat edges);
    /** \overload
    @param dx First derivative of image in the vertical direction. Support only CV_32S type.
    @param dy First derivative of image in the horizontal direction. Support only CV_32S type.
    @param edges Output edge map. It has the same size and type as image.
    @param stream Stream for the asynchronous version.
    */
    public native void detect(@ByVal Mat dx, @ByVal Mat dy, @ByVal Mat edges, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal Mat dx, @ByVal Mat dy, @ByVal Mat edges);
    public native void detect(@ByVal UMat dx, @ByVal UMat dy, @ByVal UMat edges, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal UMat dx, @ByVal UMat dy, @ByVal UMat edges);
    public native void detect(@ByVal GpuMat dx, @ByVal GpuMat dy, @ByVal GpuMat edges, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal GpuMat dx, @ByVal GpuMat dy, @ByVal GpuMat edges);

    public native void setLowThreshold(double low_thresh);
    public native double getLowThreshold();

    public native void setHighThreshold(double high_thresh);
    public native double getHighThreshold();

    public native void setAppertureSize(int apperture_size);
    public native int getAppertureSize();

    public native void setL2Gradient(@Cast("bool") boolean L2gradient);
    public native @Cast("bool") boolean getL2Gradient();
}
