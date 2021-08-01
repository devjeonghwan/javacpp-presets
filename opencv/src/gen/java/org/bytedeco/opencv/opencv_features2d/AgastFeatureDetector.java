// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \} features2d_main
 <p>
 *  \addtogroup features2d_main
 *  \{
<p>
/** \brief Wrapping class for feature detection using the AGAST method. :
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class AgastFeatureDetector extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AgastFeatureDetector(Pointer p) { super(p); }

    /** enum cv::AgastFeatureDetector::DetectorType */
    public static final int
        AGAST_5_8 = 0, AGAST_7_12d = 1, AGAST_7_12s = 2, OAST_9_16 = 3;

    /** enum cv::AgastFeatureDetector:: */
    public static final int
        THRESHOLD = 10000, NONMAX_SUPPRESSION = 10001;

    public static native @Ptr AgastFeatureDetector create( int threshold/*=10*/,
                                                         @Cast("bool") boolean nonmaxSuppression/*=true*/,
                                                         @Cast("cv::AgastFeatureDetector::DetectorType") int type/*=cv::AgastFeatureDetector::OAST_9_16*/);
    public static native @Ptr AgastFeatureDetector create();

    public native void setThreshold(int threshold);
    public native int getThreshold();

    public native void setNonmaxSuppression(@Cast("bool") boolean f);
    public native @Cast("bool") boolean getNonmaxSuppression();

    public native void setType(@Cast("cv::AgastFeatureDetector::DetectorType") int type);
    public native @Cast("cv::AgastFeatureDetector::DetectorType") int getType();
    public native @Str @Override BytePointer getDefaultName();
}
