// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudastereo;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_cudastereo.*;


/////////////////////////////////////////
// DisparityBilateralFilter

/** \brief Class refining a disparity map using joint bilateral filtering. :
<p>
The class implements \cite Yang2010 algorithm.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudastereo.class)
public class DisparityBilateralFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisparityBilateralFilter(Pointer p) { super(p); }

    /** \brief Refines a disparity map using joint bilateral filtering.
    <p>
    @param disparity Input disparity map. CV_8UC1 and CV_16SC1 types are supported.
    @param image Input image. CV_8UC1 and CV_8UC3 types are supported.
    @param dst Destination disparity map. It has the same size and type as disparity .
    @param stream Stream for the asynchronous version.
     */
    public native void apply(@ByVal Mat disparity, @ByVal Mat image, @ByVal Mat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal Mat disparity, @ByVal Mat image, @ByVal Mat dst);
    public native void apply(@ByVal UMat disparity, @ByVal UMat image, @ByVal UMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal UMat disparity, @ByVal UMat image, @ByVal UMat dst);
    public native void apply(@ByVal GpuMat disparity, @ByVal GpuMat image, @ByVal GpuMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal GpuMat disparity, @ByVal GpuMat image, @ByVal GpuMat dst);

    public native int getNumDisparities();
    public native void setNumDisparities(int numDisparities);

    public native int getRadius();
    public native void setRadius(int radius);

    public native int getNumIters();
    public native void setNumIters(int iters);

    /** truncation of data continuity */
    public native double getEdgeThreshold();
    public native void setEdgeThreshold(double edge_threshold);

    /** truncation of disparity continuity */
    public native double getMaxDiscThreshold();
    public native void setMaxDiscThreshold(double max_disc_threshold);

    /** filter range sigma */
    public native double getSigmaRange();
    public native void setSigmaRange(double sigma_range);
}
