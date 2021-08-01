// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


/**
 * Tracker is the vision core of ARToolKit.
 * Almost all original ARToolKit methods are included here.
 * Exceptions: matrix & vector.
 *
 * Tracker includes all methods that are needed to create a
 * basic ARToolKit application (e.g. the simple example
 * from the original ARToolKit package)
 *
 * Application developers should usually prefer using the
 * more high level classes:
 *  - TrackerSingleMarker
 *  - TrackerMultiMarker
 */
@Namespace("ARToolKitPlus") @NoOffset @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class Tracker extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tracker(Pointer p) { super(p); }

    public Tracker(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/) { super((Pointer)null); allocate(imWidth, imHeight, maxImagePatterns, pattWidth, pattHeight, pattSamples, maxLoadPatterns); }
    private native void allocate(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/);
    public Tracker(int imWidth, int imHeight) { super((Pointer)null); allocate(imWidth, imHeight); }
    private native void allocate(int imWidth, int imHeight);

    /**
     * Sets the pixel format of the camera image
     *  Default format is RGB888 (PIXEL_FORMAT_RGB)
     */
    public native @Cast("bool") boolean setPixelFormat(@Cast("ARToolKitPlus::PIXEL_FORMAT") int nFormat);

    /**
     * Loads a camera calibration file and stores data internally
     *  To prevent memory leaks, this method internally deletes an existing camera.
     *  If you want to use more than one camera, retrieve the existing camera using getCamera()
     *  and call setCamera(NULL); before loading another camera file.
     *  On destruction, ARToolKitPlus will only destroy the currently set camera. All other
     *  cameras have to be destroyed manually.
     */
    public native @Cast("bool") boolean loadCameraFile(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);
    public native @Cast("bool") boolean loadCameraFile(String nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /**
     * Set to true to try loading camera undistortion table from a cache file
     *  On slow platforms (e.g. Smartphone) creation of the undistortion lookup-table
     *  can take quite a while. Consequently caching will speedup the start phase.
     *  If set to true and no cache file could be found a new one will be created.
     *  The cache file will get the same name as the camera file with the added extension '.LUT'
     */
    public native void setLoadUndistLUT(@Cast("bool") boolean nSet);

    /** marker detection using tracking history */
    public native int arDetectMarker(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @Cast("ARToolKitPlus::ARMarkerInfo**") PointerPointer marker_info, IntPointer marker_num);
    public native int arDetectMarker(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntPointer marker_num);
    public native int arDetectMarker(@Cast("const uint8_t*") ByteBuffer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntBuffer marker_num);
    public native int arDetectMarker(@Cast("const uint8_t*") byte[] dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, int[] marker_num);

    /** marker detection without using tracking history */
    public native int arDetectMarkerLite(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @Cast("ARToolKitPlus::ARMarkerInfo**") PointerPointer marker_info, IntPointer marker_num);
    public native int arDetectMarkerLite(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntPointer marker_num);
    public native int arDetectMarkerLite(@Cast("const uint8_t*") ByteBuffer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntBuffer marker_num);
    public native int arDetectMarkerLite(@Cast("const uint8_t*") byte[] dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, int[] marker_num);

    /** calculates the transformation matrix between camera and the given multi-marker config */
    public native @Cast("ARFloat") float arMultiGetTransMat(ARMarkerInfo marker_info, int marker_num, ARMultiMarkerInfoT config);

    public native @Cast("ARFloat") float arMultiGetTransMatHull(ARMarkerInfo marker_info, int marker_num, ARMultiMarkerInfoT config);

    /** calculates the transformation matrix between camera and the given marker */
    public native @Cast("ARFloat") float arGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatPointer center, @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer conv);
    public native @Cast("ARFloat") float arGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatBuffer center, @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float arGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") float[] center, @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") float[] conv);

    public native @Cast("ARFloat") float arGetTransMatCont(ARMarkerInfo marker_info, @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer prev_conv, @Cast("ARFloat*") FloatPointer center,
                @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer conv);
    public native @Cast("ARFloat") float arGetTransMatCont(ARMarkerInfo marker_info, @Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer prev_conv, @Cast("ARFloat*") FloatBuffer center,
                @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float arGetTransMatCont(ARMarkerInfo marker_info, @Cast("ARFloat(* /*[3]*/ )[4]") float[] prev_conv, @Cast("ARFloat*") float[] center,
                @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") float[] conv);

    // RPP integration -- [t.pintaric]
    public native @Cast("ARFloat") float rppMultiGetTransMat(ARMarkerInfo marker_info, int marker_num, ARMultiMarkerInfoT config);
    public native @Cast("ARFloat") float rppGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatPointer center, @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer conv);
    public native @Cast("ARFloat") float rppGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatBuffer center, @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float rppGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") float[] center, @Cast("ARFloat") float width, @Cast("ARFloat(* /*[3]*/ )[4]") float[] conv);

    /** loads a pattern from a file */
    public native int arLoadPatt(@Cast("char*") BytePointer filename);
    public native int arLoadPatt(@Cast("char*") ByteBuffer filename);
    public native int arLoadPatt(@Cast("char*") byte[] filename);

    /** frees a pattern from memory */
    public native int arFreePatt(int patno);

    public native int arMultiFreeConfig(ARMultiMarkerInfoT config);

    public native ARMultiMarkerInfoT arMultiReadConfigFile(@Cast("const char*") BytePointer filename);
    public native ARMultiMarkerInfoT arMultiReadConfigFile(String filename);

    /**
     * activates binary markers
     *  markers are converted to pure black/white during loading
     */
    public native void activateBinaryMarker(int nThreshold);

    /**
     * activate the usage of id-based markers rather than template based markers
     *  Template markers are the classic marker type used in ARToolKit.
     *  Id-based markers directly encode the marker id in the image.
     *  Simple markers use 3-times redundancy to increase robustness, while
     *  BCH markers use an advanced CRC algorithm to detect and repair marker damages.
     *  See arBitFieldPattern.h for more information.
     *  In order to use id-based markers, the marker size has to be 6x6, 12x12 or 18x18.
     */
    public native void setMarkerMode(@Cast("ARToolKitPlus::MARKER_MODE") int nMarkerMode);

    /**
     * activates the complensation of brightness falloff in the corners of the camera image
     *  some cameras have a falloff in brightness at the border of the image, which creates
     *  problems with thresholding the image. use this function to set a (linear) adapted
     *  threshold value. the threshold value will stay exactly the same at the center but
     *  will deviate near to the border. all values specify a difference, not absolute values!
     *  nCorners define the falloff a all four corners. nLeftRight defines the falloff
     *  at the half y-position at the left and right side of the image. nTopBottom defines the falloff
     *  at the half x-position at the top and bottom side of the image.
     *  all values between these 9 points (center, 4 corners, left, right, top, bottom) will
     *  be interpolated.
     */
    public native void activateVignettingCompensation(@Cast("bool") boolean nEnable, int nCorners/*=0*/, int nLeftRight/*=0*/, int nTopBottom/*=0*/);
    public native void activateVignettingCompensation(@Cast("bool") boolean nEnable);

    /**
     * Calculates the camera matrix from an ARToolKit camera file.
     * This method retrieves the OpenGL projection matrix that is stored
     * in an ARToolKit camera calibration file.
     * Returns true if loading of the camera file succeeded.
     */
    public static native @Cast("bool") boolean calcCameraMatrix(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatPointer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(String nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatBuffer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") float[] nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(String nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatPointer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatBuffer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(String nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") float[] nMatrix);

    /** Changes the resolution of the camera after the camerafile was already loaded */
    public native void changeCameraSize(int nWidth, int nHeight);

    /**
     * Changes the undistortion mode
     * Default value is UNDIST_STD which means that
     * artoolkit's standard undistortion method is used.
     */
    public native void setUndistortionMode(@Cast("ARToolKitPlus::UNDIST_MODE") int nMode);

    /**
     * Changes the Pose Estimation Algorithm
     * POSE_ESTIMATOR_ORIGINAL (default): arGetTransMat()
     * POSE_ESTIMATOR_CONT: original pose estimator with "Cont"
     * POSE_ESTIMATOR_RPP: "Robust Pose Estimation from a Planar Target"
     */
    public native @Cast("bool") boolean setPoseEstimator(@Cast("ARToolKitPlus::POSE_ESTIMATOR") int nMethod);

    /**
     * If true the alternative hull-algorithm will be used for multi-marker tracking
     *  Starting with version 2.2 ARToolKitPlus has a new mode for tracking multi-markers:
     *  Instead of using all points (as done by RPP multi-marker tracking)
     *  or tracking all markers independently and combine lateron
     *  (as done in ARToolKit's standard multi-marker pose estimator), ARToolKitPlus can now
     *  use only 4 'good' points of the convex hull to do the pose estimation.
     *  If the pose estimator is set to RPP then RPP will be used to track those 4 points.
     *  Otherwise, ARToolKit's standard single-marker pose estimator will be used to
     *  track the pose of these 4 points.
     */
    public native void setHullMode(@Cast("ARToolKitPlus::HULL_TRACKING_MODE") int nMode);

    /**
     * Sets a new relative border width. ARToolKit's default value is 0.25
     * Take caution that the markers need of course really have thiner borders.
     * Values other than 0.25 have not been tested for regular pattern-based matching,
     * but only for id-encoded markers. It might be that the pattern creation process
     * needs to be updated too.
     */
    public native void setBorderWidth(@Cast("ARFloat") float nFraction);

    /** Sets the threshold value that is used for black/white conversion */
    public native void setThreshold(int nValue);

    /** Returns the current threshold value. */
    public native int getThreshold();

    /** Turns automatic threshold calculation on/off */
    public native void activateAutoThreshold(@Cast("bool") boolean nEnable);

    /** Returns true if automatic threshold detection is enabled */
    public native @Cast("bool") boolean isAutoThresholdActivated();

    /**
     * Sets the number of times the threshold is randomized in case no marker was visible (Minimum: 1, Default: 2)
     *  Autothreshold requires a visible marker to estime the optimal thresholding value. If
     *  no marker is visible ARToolKitPlus randomizes the thresholding value until a marker is
     *  found. This function sets the number of times ARToolKitPlus will randomize the threshold
     *  value and research for a marker per calc() invokation until it gives up.
     *  A value of 2 means that ARToolKitPlus will analyze the image a second time with an other treshold value
     *  if it does not find a marker the first time. Each unsuccessful try uses less processing power
     *  than a single full successful position estimation.
     */
    public native void setNumAutoThresholdRetries(int nNumRetries);

    /**
     * Sets an image processing mode (half or full resolution)
     *  Half resolution is faster but less accurate. When using
     *  full resolution smaller markers will be detected at a
     *  higher accuracy (or even detected at all).
     */
    public native void setImageProcessingMode(@Cast("ARToolKitPlus::IMAGE_PROC_MODE") int nMode);

    /** Returns an opengl-style modelview transformation matrix */
    public native @Cast("const ARFloat*") FloatPointer getModelViewMatrix();

    /** Returns an opengl-style projection transformation matrix */
    public native @Cast("const ARFloat*") FloatPointer getProjectionMatrix();

    /** Returns the compiled-in pixel format */
    public native @Cast("ARToolKitPlus::PIXEL_FORMAT") int getPixelFormat();

    /** Returns the numbber of bits per pixel for the compiled-in pixel format */
    public native int getBitsPerPixel();

    /**
     * Returns the maximum number of patterns that can be loaded
     *  This maximum number of loadable patterns can be set via the
     *  maxLoadPatterns parameter
     */
    public native int getNumLoadablePatterns();

    /** Returns the current camera */
    public native Camera getCamera();

    /** Sets a new camera without specifying new near and far clip values */
    public native void setCamera(Camera nCamera);

    /** Sets a new camera including specifying new near and far clip values */
    public native void setCamera(Camera nCamera, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /** Calculates the OpenGL transformation matrix for a specific marker info */
    public native @Cast("ARFloat") float calcOpenGLMatrixFromMarker(ARMarkerInfo nMarkerInfo, @Cast("ARFloat*") FloatPointer nPatternCenter,
                @Cast("ARFloat") float nPatternSize, @Cast("ARFloat*") FloatPointer nOpenGLMatrix);
    public native @Cast("ARFloat") float calcOpenGLMatrixFromMarker(ARMarkerInfo nMarkerInfo, @Cast("ARFloat*") FloatBuffer nPatternCenter,
                @Cast("ARFloat") float nPatternSize, @Cast("ARFloat*") FloatBuffer nOpenGLMatrix);
    public native @Cast("ARFloat") float calcOpenGLMatrixFromMarker(ARMarkerInfo nMarkerInfo, @Cast("ARFloat*") float[] nPatternCenter,
                @Cast("ARFloat") float nPatternSize, @Cast("ARFloat*") float[] nOpenGLMatrix);

    /** Calls the pose estimator set with setPoseEstimator() for single marker tracking */
    public native @Cast("ARFloat") float executeSingleMarkerPoseEstimator(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatPointer center, @Cast("ARFloat") float width,
                @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer conv);
    public native @Cast("ARFloat") float executeSingleMarkerPoseEstimator(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatBuffer center, @Cast("ARFloat") float width,
                @Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float executeSingleMarkerPoseEstimator(ARMarkerInfo marker_info, @Cast("ARFloat*") float[] center, @Cast("ARFloat") float width,
                @Cast("ARFloat(* /*[3]*/ )[4]") float[] conv);

    /** Calls the pose estimator set with setPoseEstimator() for multi marker tracking */
    public native @Cast("ARFloat") float executeMultiMarkerPoseEstimator(ARMarkerInfo marker_info, int marker_num,
                ARMultiMarkerInfoT config);

    /*
     * Returns a vector with screen coordinates of all corners
     * that were used for marker tracking for the last image
     */
    public native @StdVector CornerPoint getTrackedCorners();
}
