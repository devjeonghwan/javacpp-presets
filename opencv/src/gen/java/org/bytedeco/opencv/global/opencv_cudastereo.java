// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_cudastereo.*;

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

public class opencv_cudastereo extends org.bytedeco.opencv.presets.opencv_cudastereo {
    static { Loader.load(); }

// Parsed from <opencv2/cudastereo.hpp>

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
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
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

// #ifndef OPENCV_CUDASTEREO_HPP
// #define OPENCV_CUDASTEREO_HPP

// #ifndef __cplusplus
// #endif

// #include "opencv2/core/cuda.hpp"
// #include "opencv2/calib3d.hpp"

/**
  \addtogroup cuda
  \{
    \defgroup cudastereo Stereo Correspondence
  \}
 */
// Targeting ../opencv_cudastereo/StereoBM.java



/** \brief Creates StereoBM object.
<p>
@param numDisparities the disparity search range. For each pixel algorithm will find the best
disparity from 0 (default minimum disparity) to numDisparities. The search range can then be
shifted by changing the minimum disparity.
@param blockSize the linear size of the blocks compared by the algorithm. The size should be odd
(as the block is centered at the current pixel). Larger block size implies smoother, though less
accurate disparity map. Smaller block size gives more detailed disparity map, but there is higher
chance for algorithm to find a wrong correspondence.
 */
@Namespace("cv::cuda") public static native @Ptr org.bytedeco.opencv.opencv_cudastereo.StereoBM createStereoBM(int numDisparities/*=64*/, int blockSize/*=19*/);
@Namespace("cv::cuda") public static native @Ptr org.bytedeco.opencv.opencv_cudastereo.StereoBM createStereoBM();
// Targeting ../opencv_cudastereo/StereoBeliefPropagation.java



/** \brief Creates StereoBeliefPropagation object.
<p>
@param ndisp Number of disparities.
@param iters Number of BP iterations on each level.
@param levels Number of levels.
@param msg_type Type for messages. CV_16SC1 and CV_32FC1 types are supported.
 */
@Namespace("cv::cuda") public static native @Ptr StereoBeliefPropagation createStereoBeliefPropagation(int ndisp/*=64*/, int iters/*=5*/, int levels/*=5*/, int msg_type/*=CV_32F*/);
@Namespace("cv::cuda") public static native @Ptr StereoBeliefPropagation createStereoBeliefPropagation();
// Targeting ../opencv_cudastereo/StereoConstantSpaceBP.java



/** \brief Creates StereoConstantSpaceBP object.
<p>
@param ndisp Number of disparities.
@param iters Number of BP iterations on each level.
@param levels Number of levels.
@param nr_plane Number of disparity levels on the first level.
@param msg_type Type for messages. CV_16SC1 and CV_32FC1 types are supported.
 */
@Namespace("cv::cuda") public static native @Ptr StereoConstantSpaceBP createStereoConstantSpaceBP(int ndisp/*=128*/, int iters/*=8*/, int levels/*=4*/, int nr_plane/*=4*/, int msg_type/*=CV_32F*/);
@Namespace("cv::cuda") public static native @Ptr StereoConstantSpaceBP createStereoConstantSpaceBP();
// Targeting ../opencv_cudastereo/StereoSGM.java



/** \brief Creates StereoSGM object.
<p>
@param minDisparity Minimum possible disparity value. Normally, it is zero but sometimes rectification algorithms can shift images, so this parameter needs to be adjusted accordingly.
@param numDisparities Maximum disparity minus minimum disparity. The value must be 64, 128 or 256.
@param P1 The first parameter controlling the disparity smoothness.This parameter is used for the case of slanted surfaces (not fronto parallel).
@param P2 The second parameter controlling the disparity smoothness.This parameter is used for "solving" the depth discontinuities problem.
@param uniquenessRatio Margin in percentage by which the best (minimum) computed cost function
value should "win" the second best value to consider the found match correct. Normally, a value
within the 5-15 range is good enough.
@param mode Set it to StereoSGM::MODE_HH to run the full-scale two-pass dynamic programming algorithm.
It will consume O(W\*H\*numDisparities) bytes. By default, it is set to StereoSGM::MODE_HH4.
*/
@Namespace("cv::cuda") public static native @Ptr StereoSGM createStereoSGM(int minDisparity/*=0*/, int numDisparities/*=128*/, int P1/*=10*/, int P2/*=120*/, int uniquenessRatio/*=5*/, int mode/*=cv::cuda::StereoSGM::MODE_HH4*/);
@Namespace("cv::cuda") public static native @Ptr StereoSGM createStereoSGM();
// Targeting ../opencv_cudastereo/DisparityBilateralFilter.java



/** \brief Creates DisparityBilateralFilter object.
<p>
@param ndisp Number of disparities.
@param radius Filter radius.
@param iters Number of iterations.
 */
@Namespace("cv::cuda") public static native @Ptr DisparityBilateralFilter createDisparityBilateralFilter(int ndisp/*=64*/, int radius/*=3*/, int iters/*=1*/);
@Namespace("cv::cuda") public static native @Ptr DisparityBilateralFilter createDisparityBilateralFilter();

/////////////////////////////////////////
// Utility

/** \brief Reprojects a disparity image to 3D space.
<p>
@param disp Input single-channel 8-bit unsigned, 16-bit signed, 32-bit signed or 32-bit
floating-point disparity image. If 16-bit signed format is used, the values are assumed to have no
fractional bits.
@param xyzw Output 3- or 4-channel floating-point image of the same size as disp . Each element of
xyzw(x,y) contains 3D coordinates (x,y,z) or (x,y,z,1) of the point (x,y) , computed from the
disparity map.
@param Q {@code 4 \times 4} perspective transformation matrix that can be obtained via stereoRectify .
@param dst_cn The number of channels for output image. Can be 3 or 4.
@param stream Stream for the asynchronous version.
<p>
@see reprojectImageTo3D
 */
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal Mat disp, @ByVal Mat xyzw, @ByVal Mat Q, int dst_cn/*=4*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal Mat disp, @ByVal Mat xyzw, @ByVal Mat Q);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal UMat disp, @ByVal UMat xyzw, @ByVal UMat Q, int dst_cn/*=4*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal UMat disp, @ByVal UMat xyzw, @ByVal UMat Q);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal GpuMat disp, @ByVal GpuMat xyzw, @ByVal GpuMat Q, int dst_cn/*=4*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal GpuMat disp, @ByVal GpuMat xyzw, @ByVal GpuMat Q);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal GpuMat disp, @ByRef GpuMat xyzw, @ByVal Mat Q, int dst_cn/*=4*/, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void reprojectImageTo3D(@ByVal GpuMat disp, @ByRef GpuMat xyzw, @ByVal Mat Q);

/** \brief Colors a disparity image.
<p>
@param src_disp Input single-channel 8-bit unsigned, 16-bit signed, 32-bit signed or 32-bit
floating-point disparity image. If 16-bit signed format is used, the values are assumed to have no
fractional bits.
@param dst_disp Output disparity image. It has the same size as src_disp. The type is CV_8UC4
in BGRA format (alpha = 255).
@param ndisp Number of disparities.
@param stream Stream for the asynchronous version.
<p>
This function draws a colored disparity map by converting disparity values from [0..ndisp) interval
first to HSV color space (where different disparity values correspond to different hues) and then
converting the pixels to RGB for visualization.
 */
@Namespace("cv::cuda") public static native void drawColorDisp(@ByVal Mat src_disp, @ByVal Mat dst_disp, int ndisp, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void drawColorDisp(@ByVal Mat src_disp, @ByVal Mat dst_disp, int ndisp);
@Namespace("cv::cuda") public static native void drawColorDisp(@ByVal UMat src_disp, @ByVal UMat dst_disp, int ndisp, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void drawColorDisp(@ByVal UMat src_disp, @ByVal UMat dst_disp, int ndisp);
@Namespace("cv::cuda") public static native void drawColorDisp(@ByVal GpuMat src_disp, @ByVal GpuMat dst_disp, int ndisp, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
@Namespace("cv::cuda") public static native void drawColorDisp(@ByVal GpuMat src_disp, @ByVal GpuMat dst_disp, int ndisp);

/** \} */

 // namespace cv { namespace cuda {

// #endif /* OPENCV_CUDASTEREO_HPP */


}
