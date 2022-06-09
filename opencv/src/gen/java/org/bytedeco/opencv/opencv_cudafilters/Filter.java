// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudafilters;

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

import static org.bytedeco.opencv.global.opencv_cudafilters.*;


/** \addtogroup cudafilters
 *  \{
<p>
/** \brief Common interface for all CUDA filters :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudafilters.class)
public class Filter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Filter(Pointer p) { super(p); }

    /** \brief Applies the specified filter to the image.
    <p>
    @param src Input image.
    @param dst Output image.
    @param stream Stream for the asynchronous version.
     */
    public native void apply(@ByVal Mat src, @ByVal Mat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal Mat src, @ByVal Mat dst);
    public native void apply(@ByVal UMat src, @ByVal UMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal UMat src, @ByVal UMat dst);
    public native void apply(@ByVal GpuMat src, @ByVal GpuMat dst, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void apply(@ByVal GpuMat src, @ByVal GpuMat dst);
}
