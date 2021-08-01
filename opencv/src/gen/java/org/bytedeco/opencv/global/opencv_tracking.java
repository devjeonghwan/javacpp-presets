// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_tracking.*;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

public class opencv_tracking extends org.bytedeco.opencv.presets.opencv_tracking {
    static { Loader.load(); }

// Targeting ../opencv_tracking/TrackedObjectDeque.java


// Targeting ../opencv_tracking/SizeTPointVectorMap.java


// Targeting ../opencv_tracking/SizeTTrackMap.java


// Parsed from <opencv2/tracking.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_CONTRIB_TRACKING_HPP
// #define OPENCV_CONTRIB_TRACKING_HPP

// #include "opencv2/core.hpp"
// #include "opencv2/video/tracking.hpp"
// #ifndef CV_DOXYGEN
// Targeting ../opencv_tracking/TrackerCSRT.java


// Targeting ../opencv_tracking/TrackerKCF.java




/** \} */

// #ifndef CV_DOXYGEN

// #endif
  // namespace

// #endif // OPENCV_CONTRIB_TRACKING_HPP


// Parsed from <opencv2/tracking/feature.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
 //
 //  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
 //
 //  By downloading, copying, installing or using the software you agree to this license.
 //  If you do not agree to this license, do not download, install,
 //  copy or use the software.
 //
 //
 //                           License Agreement
 //                For Open Source Computer Vision Library
 //
 // Copyright (C) 2013, OpenCV Foundation, all rights reserved.
 // Third party copyrights are property of their respective owners.
 //
 // Redistribution and use in source and binary forms, with or without modification,
 // are permitted provided that the following conditions are met:
 //
 //   * Redistribution's of source code must retain the above copyright notice,
 //     this list of conditions and the following disclaimer.
 //
 //   * Redistribution's in binary form must reproduce the above copyright notice,
 //     this list of conditions and the following disclaimer in the documentation
 //     and/or other materials provided with the distribution.
 //
 //   * The name of the copyright holders may not be used to endorse or promote products
 //     derived from this software without specific prior written permission.
 //
 // This software is provided by the copyright holders and contributors "as is" and
 // any express or implied warranties, including, but not limited to, the implied
 // warranties of merchantability and fitness for a particular purpose are disclaimed.
 // In no event shall the Intel Corporation or contributors be liable for any direct,
 // indirect, incidental, special, exemplary, or consequential damages
 // (including, but not limited to, procurement of substitute goods or services;
 // loss of use, data, or profits; or business interruption) however caused
 // and on any theory of liability, whether in contract, strict liability,
 // or tort (including negligence or otherwise) arising in any way out of
 // the use of this software, even if advised of the possibility of such damage.
 //
 //M*/

// #ifndef __OPENCV_FEATURE_HPP__
// #define __OPENCV_FEATURE_HPP__

// #include "opencv2/core.hpp"
// #include "opencv2/imgproc.hpp"
// #include <iostream>
// #include <string>
// #include <time.h>

/*
 * TODO This implementation is based on apps/traincascade/
 * TODO Changed CvHaarEvaluator based on ADABOOSTING implementation (Grabner et al.)
 */

/** \addtogroup tracking_detail
 *  \{ */

public static final String FEATURES = "features";

public static final String CC_FEATURES =       FEATURES;
public static final String CC_FEATURE_PARAMS = "featureParams";
public static final String CC_MAX_CAT_COUNT =  "maxCatCount";
public static final String CC_FEATURE_SIZE =   "featSize";
public static final String CC_NUM_FEATURES =   "numFeat";
public static final String CC_ISINTEGRAL = "isIntegral";
public static final String CC_RECTS =       "rects";
public static final String CC_TILTED =      "tilted";
public static final String CC_RECT = "rect";

public static final String LBPF_NAME = "lbpFeatureParams";
public static final String HOGF_NAME = "HOGFeatureParams";
public static final String HFP_NAME = "haarFeatureParams";

public static final int CV_HAAR_FEATURE_MAX = 3;
public static final int N_BINS = 9;
public static final int N_CELLS = 4;

// #define CV_SUM_OFFSETS( p0, p1, p2, p3, rect, step )
//     /* (x, y) */
//     (p0) = (rect).x + (step) * (rect).y;
//     /* (x + w, y) */
//     (p1) = (rect).x + (rect).width + (step) * (rect).y;
//     /* (x + w, y) */
//     (p2) = (rect).x + (step) * ((rect).y + (rect).height);
//     /* (x + w, y + h) */
//     (p3) = (rect).x + (rect).width + (step) * ((rect).y + (rect).height);

// #define CV_TILTED_OFFSETS( p0, p1, p2, p3, rect, step )
//     /* (x, y) */
//     (p0) = (rect).x + (step) * (rect).y;
//     /* (x - h, y + h) */
//     (p1) = (rect).x - (rect).height + (step) * ((rect).y + (rect).height);
//     /* (x + w, y + w) */
//     (p2) = (rect).x + (rect).width + (step) * ((rect).y + (rect).width);
//     /* (x + w - h, y + w + h) */
//     (p3) = (rect).x + (rect).width - (rect).height
//            + (step) * ((rect).y + (rect).width + (rect).height);
// Targeting ../opencv_tracking/CvParams.java


// Targeting ../opencv_tracking/CvFeatureParams.java


// Targeting ../opencv_tracking/CvFeatureEvaluator.java


// Targeting ../opencv_tracking/CvHaarFeatureParams.java


// Targeting ../opencv_tracking/CvHaarEvaluator.java


// Targeting ../opencv_tracking/CvHOGFeatureParams.java


// Targeting ../opencv_tracking/CvHOGEvaluator.java






// Targeting ../opencv_tracking/CvLBPFeatureParams.java


// Targeting ../opencv_tracking/CvLBPEvaluator.java





  // namespace

/** \} */

  // namespace cv

// #endif


// Parsed from <opencv2/tracking/kalman_filters.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
 //
 //  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
 //
 //  By downloading, copying, installing or using the software you agree to this license.
 //  If you do not agree to this license, do not download, install,
 //  copy or use the software.
 //
 //
 //                           License Agreement
 //                For Open Source Computer Vision Library
 //
 // Copyright (C) 2015, OpenCV Foundation, all rights reserved.
 // Third party copyrights are property of their respective owners.
 //
 // Redistribution and use in source and binary forms, with or without modification,
 // are permitted provided that the following conditions are met:
 //
 //   * Redistribution's of source code must retain the above copyright notice,
 //     this list of conditions and the following disclaimer.
 //
 //   * Redistribution's in binary form must reproduce the above copyright notice,
 //     this list of conditions and the following disclaimer in the documentation
 //     and/or other materials provided with the distribution.
 //
 //   * The name of the copyright holders may not be used to endorse or promote products
 //     derived from this software without specific prior written permission.
 //
 // This software is provided by the copyright holders and contributors "as is" and
 // any express or implied warranties, including, but not limited to, the implied
 // warranties of merchantability and fitness for a particular purpose are disclaimed.
 // In no event shall the Intel Corporation or contributors be liable for any direct,
 // indirect, incidental, special, exemplary, or consequential damages
 // (including, but not limited to, procurement of substitute goods or services;
 // loss of use, data, or profits; or business interruption) however caused
 // and on any theory of liability, whether in contract, strict liability,
 // or tort (including negligence or otherwise) arising in any way out of
 // the use of this software, even if advised of the possibility of such damage.
 //
 //M*/

// #ifndef __OPENCV_TRACKING_KALMAN_HPP_
// #define __OPENCV_TRACKING_KALMAN_HPP_

// #include "opencv2/core.hpp"
// #include <limits>

/** \addtogroup tracking_detail
 *  \{ */
// Targeting ../opencv_tracking/UnscentedKalmanFilter.java


// Targeting ../opencv_tracking/UkfSystemModel.java


// Targeting ../opencv_tracking/UnscentedKalmanFilterParams.java


// Targeting ../opencv_tracking/AugmentedUnscentedKalmanFilterParams.java



/** \brief Unscented Kalman Filter factory method
<p>
* The class implements an Unscented Kalman filter <https://en.wikipedia.org/wiki/Kalman_filter#Unscented_Kalman_filter>.
* @param params - an object of the UnscentedKalmanFilterParams class containing UKF parameters.
* @return pointer to the object of the UnscentedKalmanFilterImpl class implementing UnscentedKalmanFilter.
*/
@Namespace("cv::detail::tracking::kalman_filters") public static native @Ptr UnscentedKalmanFilter createUnscentedKalmanFilter( @Const @ByRef UnscentedKalmanFilterParams params );
/** \brief Augmented Unscented Kalman Filter factory method
<p>
* The class implements an Augmented Unscented Kalman filter http://becs.aalto.fi/en/research/bayes/ekfukf/documentation.pdf, page 31-33.
* AUKF is more accurate than UKF but its computational complexity is larger.
* @param params - an object of the AugmentedUnscentedKalmanFilterParams class containing AUKF parameters.
* @return pointer to the object of the AugmentedUnscentedKalmanFilterImpl class implementing UnscentedKalmanFilter.
*/
@Namespace("cv::detail::tracking::kalman_filters") public static native @Ptr UnscentedKalmanFilter createAugmentedUnscentedKalmanFilter( @Const @ByRef AugmentedUnscentedKalmanFilterParams params );

  // namespace

/** \} */

  // namespace

// #endif


// Parsed from <opencv2/tracking/onlineBoosting.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
 //
 //  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
 //
 //  By downloading, copying, installing or using the software you agree to this license.
 //  If you do not agree to this license, do not download, install,
 //  copy or use the software.
 //
 //
 //                           License Agreement
 //                For Open Source Computer Vision Library
 //
 // Copyright (C) 2013, OpenCV Foundation, all rights reserved.
 // Third party copyrights are property of their respective owners.
 //
 // Redistribution and use in source and binary forms, with or without modification,
 // are permitted provided that the following conditions are met:
 //
 //   * Redistribution's of source code must retain the above copyright notice,
 //     this list of conditions and the following disclaimer.
 //
 //   * Redistribution's in binary form must reproduce the above copyright notice,
 //     this list of conditions and the following disclaimer in the documentation
 //     and/or other materials provided with the distribution.
 //
 //   * The name of the copyright holders may not be used to endorse or promote products
 //     derived from this software without specific prior written permission.
 //
 // This software is provided by the copyright holders and contributors "as is" and
 // any express or implied warranties, including, but not limited to, the implied
 // warranties of merchantability and fitness for a particular purpose are disclaimed.
 // In no event shall the Intel Corporation or contributors be liable for any direct,
 // indirect, incidental, special, exemplary, or consequential damages
 // (including, but not limited to, procurement of substitute goods or services;
 // loss of use, data, or profits; or business interruption) however caused
 // and on any theory of liability, whether in contract, strict liability,
 // or tort (including negligence or otherwise) arising in any way out of
 // the use of this software, even if advised of the possibility of such damage.
 //
 //M*/

// #ifndef __OPENCV_ONLINEBOOSTING_HPP__
// #define __OPENCV_ONLINEBOOSTING_HPP__

// #include "opencv2/core.hpp"

/** \addtogroup tracking_detail
 *  \{ */
// Targeting ../opencv_tracking/StrongClassifierDirectSelection.java


// Targeting ../opencv_tracking/BaseClassifier.java


// Targeting ../opencv_tracking/EstimatedGaussDistribution.java


// Targeting ../opencv_tracking/WeakClassifierHaarFeature.java


// Targeting ../opencv_tracking/Detector.java


// Targeting ../opencv_tracking/ClassifierThreshold.java



  // namespace

/** \} */

  // namespace

// #endif


// Parsed from <opencv2/tracking/tldDataset.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef OPENCV_TLD_DATASET
// #define OPENCV_TLD_DATASET

// #include "opencv2/core.hpp"

/** \addtogroup tracking_detail
 *  \{ */
		@Namespace("cv::detail::tracking::tld") public static native @ByVal Rect2d tld_InitDataset(int videoInd, @Cast("const char*") BytePointer rootPath/*="TLD_dataset"*/, int datasetInd/*=0*/);
		@Namespace("cv::detail::tracking::tld") public static native @ByVal Rect2d tld_InitDataset(int videoInd);
		@Namespace("cv::detail::tracking::tld") public static native @ByVal Rect2d tld_InitDataset(int videoInd, String rootPath/*="TLD_dataset"*/, int datasetInd/*=0*/);
		@Namespace("cv::detail::tracking::tld") public static native @Str BytePointer tld_getNextDatasetFrame();
	

/** \} */



// #endif


// Parsed from <opencv2/tracking/tracking_by_matching.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef __OPENCV_TRACKING_TRACKING_BY_MATCHING_HPP__
// #define __OPENCV_TRACKING_TRACKING_BY_MATCHING_HPP__

// #include <deque>
// #include <iostream>
// #include <string>
// #include <unordered_map>
// #include <vector>
// #include <memory>
// #include <map>
// #include <tuple>
// #include <set>

// #include "opencv2/core.hpp"
// #include "opencv2/imgproc.hpp"

/** \addtogroup tracking_detail
 *  \{ */
// Targeting ../opencv_tracking/TrackedObject.java





/** (object id, detected objects) pairs collection. */


///
///
// Targeting ../opencv_tracking/IImageDescriptor.java


// Targeting ../opencv_tracking/ResizedImageDescriptor.java


// Targeting ../opencv_tracking/IDescriptorDistance.java


// Targeting ../opencv_tracking/CosDistance.java


// Targeting ../opencv_tracking/MatchTemplateDistance.java


// Targeting ../opencv_tracking/TrackerParams.java


// Targeting ../opencv_tracking/Track.java


// Targeting ../opencv_tracking/ITrackerByMatching.java



/**
 *  \brief The factory to create Tracker-by-Matching algorithm implementation.
 *  */
@Namespace("cv::detail::tracking::tbm") public static native @Ptr ITrackerByMatching createTrackerByMatching(@Const @ByRef(nullValue = "cv::detail::tracking::tbm::TrackerParams()") TrackerParams params);
@Namespace("cv::detail::tracking::tbm") public static native @Ptr ITrackerByMatching createTrackerByMatching();

 // namespace tbm

/** \} */

  // namespace
// #endif // #ifndef __OPENCV_TRACKING_TRACKING_BY_MATCHING_HPP__


}
