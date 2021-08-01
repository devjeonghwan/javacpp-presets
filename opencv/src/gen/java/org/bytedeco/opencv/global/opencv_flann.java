// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_flann.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

public class opencv_flann extends org.bytedeco.opencv.presets.opencv_flann {
    static { Loader.load(); }

// Parsed from <opencv2/flann/defines.h>

/***********************************************************************
 * Software License Agreement (BSD License)
 *
 * Copyright 2008-2011  Marius Muja (mariusm\cs.ubc.ca). All rights reserved.
 * Copyright 2008-2011  David G. Lowe (lowe\cs.ubc.ca). All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR {@code }AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *************************************************************************/


// #ifndef OPENCV_FLANN_DEFINES_H_
// #define OPENCV_FLANN_DEFINES_H_

/** \cond IGNORED */

// #include "config.h"

// #ifdef FLANN_EXPORT
// #endif
// #ifdef _WIN32
/* win32 dll export/import directives */
//  #ifdef FLANN_EXPORTS
//   #define FLANN_EXPORT __declspec(dllexport)
//  #elif defined(FLANN_STATIC)
//   #define FLANN_EXPORT
//  #else
//   #define FLANN_EXPORT __declspec(dllimport)
//  #endif
// #else
/* unix needs nothing */
//  #define FLANN_EXPORT
// #endif


// #undef FLANN_PLATFORM_32_BIT
// #undef FLANN_PLATFORM_64_BIT
// #if defined __amd64__ || defined __x86_64__ || defined _WIN64 || defined _M_X64
// #define FLANN_PLATFORM_64_BIT
// #else
// #define FLANN_PLATFORM_32_BIT
// #endif


// #undef FLANN_ARRAY_LEN
// #define FLANN_ARRAY_LEN(a) (sizeof(a)/sizeof(a[0]))

/* Nearest neighbour index algorithms */
/** enum cvflann::flann_algorithm_t */
public static final int
    FLANN_INDEX_LINEAR = 0,
    FLANN_INDEX_KDTREE = 1,
    FLANN_INDEX_KMEANS = 2,
    FLANN_INDEX_COMPOSITE = 3,
    FLANN_INDEX_KDTREE_SINGLE = 4,
    FLANN_INDEX_HIERARCHICAL = 5,
    FLANN_INDEX_LSH = 6,
    FLANN_INDEX_SAVED = 254,
    FLANN_INDEX_AUTOTUNED = 255,

    // deprecated constants, should use the FLANN_INDEX_* ones instead
    LINEAR = 0,
    KDTREE = 1,
    KMEANS = 2,
    COMPOSITE = 3,
    KDTREE_SINGLE = 4,
    SAVED = 254,
    AUTOTUNED = 255;



/** enum cvflann::flann_centers_init_t */
public static final int
    FLANN_CENTERS_RANDOM = 0,
    FLANN_CENTERS_GONZALES = 1,
    FLANN_CENTERS_KMEANSPP = 2,
    FLANN_CENTERS_GROUPWISE = 3,

    // deprecated constants, should use the FLANN_CENTERS_* ones instead
    CENTERS_RANDOM = 0,
    CENTERS_GONZALES = 1,
    CENTERS_KMEANSPP = 2;

/** enum cvflann::flann_log_level_t */
public static final int
    FLANN_LOG_NONE = 0,
    FLANN_LOG_FATAL = 1,
    FLANN_LOG_ERROR = 2,
    FLANN_LOG_WARN = 3,
    FLANN_LOG_INFO = 4;

/** enum cvflann::flann_distance_t */
public static final int
    FLANN_DIST_EUCLIDEAN = 1,
    FLANN_DIST_L2 = 1,
    FLANN_DIST_MANHATTAN = 2,
    FLANN_DIST_L1 = 2,
    FLANN_DIST_MINKOWSKI = 3,
    FLANN_DIST_MAX   = 4,
    FLANN_DIST_HIST_INTERSECT   = 5,
    FLANN_DIST_HELLINGER = 6,
    FLANN_DIST_CHI_SQUARE = 7,
    FLANN_DIST_CS         = 7,
    FLANN_DIST_KULLBACK_LEIBLER  = 8,
    FLANN_DIST_KL                = 8,
    FLANN_DIST_HAMMING          = 9,
    FLANN_DIST_DNAMMING          = 10,

    // deprecated constants, should use the FLANN_DIST_* ones instead
    EUCLIDEAN = 1,
    MANHATTAN = 2,
    MINKOWSKI = 3,
    MAX_DIST   = 4,
    HIST_INTERSECT   = 5,
    HELLINGER = 6,
    CS         = 7,
    KL         = 8,
    KULLBACK_LEIBLER  = 8;

/** enum cvflann::flann_datatype_t */
public static final int
    FLANN_INT8 = 0,
    FLANN_INT16 = 1,
    FLANN_INT32 = 2,
    FLANN_INT64 = 3,
    FLANN_UINT8 = 4,
    FLANN_UINT16 = 5,
    FLANN_UINT32 = 6,
    FLANN_UINT64 = 7,
    FLANN_FLOAT32 = 8,
    FLANN_FLOAT64 = 9;

/** enum cvflann:: */
public static final int
    FLANN_CHECKS_UNLIMITED = -1,
    FLANN_CHECKS_AUTOTUNED = -2;



/** \endcond */

// #endif /* OPENCV_FLANN_DEFINES_H_ */


// Parsed from <opencv2/flann/miniflann.hpp>

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

// #ifndef OPENCV_MINIFLANN_HPP
// #define OPENCV_MINIFLANN_HPP

/** \cond IGNORED */

// #include "opencv2/core.hpp"
// #include "opencv2/flann/defines.h"

/** enum cv::flann::FlannIndexType */
public static final int
    FLANN_INDEX_TYPE_8U = CV_8U,
    FLANN_INDEX_TYPE_8S = CV_8S,
    FLANN_INDEX_TYPE_16U = CV_16U,
    FLANN_INDEX_TYPE_16S = CV_16S,
    FLANN_INDEX_TYPE_32S = CV_32S,
    FLANN_INDEX_TYPE_32F = CV_32F,
    FLANN_INDEX_TYPE_64F = CV_64F,
    FLANN_INDEX_TYPE_STRING = CV_64F + 1,
    FLANN_INDEX_TYPE_BOOL = CV_64F + 2,
    FLANN_INDEX_TYPE_ALGORITHM = CV_64F + 3,
    LAST_VALUE_FLANN_INDEX_TYPE = FLANN_INDEX_TYPE_ALGORITHM;
// Targeting ../opencv_flann/IndexParams.java


// Targeting ../opencv_flann/KDTreeIndexParams.java


// Targeting ../opencv_flann/LinearIndexParams.java


// Targeting ../opencv_flann/CompositeIndexParams.java


// Targeting ../opencv_flann/AutotunedIndexParams.java


// Targeting ../opencv_flann/HierarchicalClusteringIndexParams.java


// Targeting ../opencv_flann/KMeansIndexParams.java


// Targeting ../opencv_flann/LshIndexParams.java


// Targeting ../opencv_flann/SavedIndexParams.java


// Targeting ../opencv_flann/SearchParams.java


// Targeting ../opencv_flann/Index.java



  // namespace cv::flann

/** \endcond */

// #endif


}
