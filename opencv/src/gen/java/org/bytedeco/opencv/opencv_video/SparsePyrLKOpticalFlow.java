// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_video.*;


/** \brief Class used for calculating a sparse optical flow.
<p>
The class can calculate an optical flow for a sparse feature set using the
iterative Lucas-Kanade method with pyramids.
<p>
@see calcOpticalFlowPyrLK
<p>
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class SparsePyrLKOpticalFlow extends SparseOpticalFlow {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparsePyrLKOpticalFlow(Pointer p) { super(p); }

    public native @ByVal Size getWinSize();
    public native void setWinSize(@ByVal Size winSize);

    public native int getMaxLevel();
    public native void setMaxLevel(int maxLevel);

    public native @ByVal TermCriteria getTermCriteria();
    public native void setTermCriteria(@ByRef TermCriteria crit);

    public native int getFlags();
    public native void setFlags(int flags);

    public native double getMinEigThreshold();
    public native void setMinEigThreshold(double minEigThreshold);

    public static native @Ptr SparsePyrLKOpticalFlow create(
                @ByVal(nullValue = "cv::Size(21, 21)") Size winSize,
                int maxLevel/*=3*/, @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::COUNT+cv::TermCriteria::EPS, 30, 0.01)") TermCriteria crit,
                int flags/*=0*/,
                double minEigThreshold/*=1e-4*/);
    public static native @Ptr SparsePyrLKOpticalFlow create();
}
