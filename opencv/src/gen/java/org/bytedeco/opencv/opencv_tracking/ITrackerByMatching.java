// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

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

import static org.bytedeco.opencv.global.opencv_tracking.*;


/**
 *  \brief Tracker-by-Matching algorithm interface.
 * 
 *  This class is implementation of tracking-by-matching system. It uses two
 *  different appearance measures to compute affinity between bounding boxes:
 *  some fast descriptor and some strong descriptor. Each time the assignment
 *  problem is solved. The assignment problem in our case is how to establish
 *  correspondence between existing tracklets and recently detected objects.
 *  First step is to compute an affinity matrix between tracklets and
 *  detections. The affinity equals to
 *        appearance_affinity * motion_affinity * shape_affinity.
 *  Where appearance is 1 - distance(tracklet_fast_dscr, detection_fast_dscr).
 *  Second step is to solve the assignment problem using Kuhn-Munkres
 *  algorithm. If correspondence between some tracklet and detection is
 *  established with low confidence (affinity) then the strong descriptor is
 *  used to determine if there is correspondence between tracklet and detection.
 *  */
@Namespace("cv::detail::tracking::tbm") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class ITrackerByMatching extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ITrackerByMatching(Pointer p) { super(p); }

    
    
    ///
    ///

    /**
     *  \brief Destructor for the tracker
     *  */

    /**
     *  \brief Process given frame.
     *  @param frame [in] Colored image (CV_8UC3).
     *  @param detections [in] Detected objects on the frame.
     *  @param timestamp [in] Timestamp must be positive and measured in
     *  milliseconds
     *  */
    
    
    ///
    ///
    public native void process(@Const @ByRef Mat frame, @Cast("const cv::detail::tracking::tbm::TrackedObjects*") @ByRef TrackedObjectDeque detections,
                             @Cast("cv::uint64_t") int timestamp);

    /**
     *  \brief Pipeline parameters getter.
     *  @return Parameters of pipeline.
     *  */
    
    
    ///
    ///
    public native @Const @ByRef TrackerParams params();

    /**
     *  \brief Pipeline parameters setter.
     *  @param params [in] Parameters of pipeline.
     *  */
    
    
    ///
    ///
    public native void setParams(@Const @ByRef TrackerParams params);

    /**
     *  \brief Fast descriptor getter.
     *  @return Fast descriptor used in pipeline.
     *  */
    
    
    ///
    ///
    public native @SharedPtr IImageDescriptor descriptorFast();

    /**
     *  \brief Fast descriptor setter.
     *  @param val [in] Fast descriptor used in pipeline.
     *  */
    
    
    ///
    ///
    public native void setDescriptorFast(@SharedPtr IImageDescriptor val);

    /**
     *  \brief Strong descriptor getter.
     *  @return Strong descriptor used in pipeline.
     *  */
    
    
    ///
    ///
    public native @SharedPtr IImageDescriptor descriptorStrong();

    /**
     *  \brief Strong descriptor setter.
     *  @param val [in] Strong descriptor used in pipeline.
     *  */
    
    
    ///
    ///
    public native void setDescriptorStrong(@SharedPtr IImageDescriptor val);

    /**
     *  \brief Fast distance getter.
     *  @return Fast distance used in pipeline.
     *  */
    
    
    ///
    ///
    public native @SharedPtr IDescriptorDistance distanceFast();

    /**
     *  \brief Fast distance setter.
     *  @param val [in] Fast distance used in pipeline.
     *  */
    
    
    ///
    ///
    public native void setDistanceFast(@SharedPtr IDescriptorDistance val);

    /**
     *  \brief Strong distance getter.
     *  @return Strong distance used in pipeline.
     *  */
    
    
    ///
    ///
    public native @SharedPtr IDescriptorDistance distanceStrong();

    /**
     *  \brief Strong distance setter.
     *  @param val [in] Strong distance used in pipeline.
     *  */
    
    
    ///
    ///
    public native void setDistanceStrong(@SharedPtr IDescriptorDistance val);

    /**
     *  \brief Returns number of counted people.
     *  @return a number of counted people.
     *  */
    
    
    ///
    ///
    public native @Cast("size_t") long count();

    /**
     *  \brief Get active tracks to draw
     *  @return Active tracks.
     *  */
    
    
    ///
    ///
    public native @ByVal SizeTPointVectorMap getActiveTracks();

    /**
     *  \brief Get tracked detections.
     *  @return Tracked detections.
     *  */
    
    
    ///
    ///
    public native @ByVal @Cast("cv::detail::tracking::tbm::TrackedObjects*") TrackedObjectDeque trackedDetections();

    /**
     *  \brief Draws active tracks on a given frame.
     *  @param frame [in] Colored image (CV_8UC3).
     *  @return Colored image with drawn active tracks.
     *  */
    
    
    ///
    ///
    public native @ByVal Mat drawActiveTracks(@Const @ByRef Mat frame);

    /**
     *  \brief isTrackForgotten returns true if track is forgotten.
     *  @param id Track ID.
     *  @return true if track is forgotten.
     *  */
    
    
    ///
    ///
    public native @Cast("bool") boolean isTrackForgotten(@Cast("size_t") long id);

    /**
     *  \brief tracks Returns all tracks including forgotten (lost too many frames
     *  ago).
     *  @return Set of tracks {id, track}.
     *  */
    
    
    ///
    ///
    public native @Const @ByRef SizeTTrackMap tracks();

    /**
     *  \brief isTrackValid Checks whether track is valid (duration > threshold).
     *  @param track_id Index of checked track.
     *  @return True if track duration exceeds some predefined value.
     *  */
    
    
    ///
    ///
    public native @Cast("bool") boolean isTrackValid(@Cast("size_t") long track_id);

    /**
     *  \brief dropForgottenTracks Removes tracks from memory that were lost too
     *  many frames ago.
     *  */
    
    
    ///
    ///
    public native void dropForgottenTracks();

    /**
     *  \brief dropForgottenTrack Check that the track was lost too many frames
     *  ago
     *  and removes it frm memory.
     *  */
    public native void dropForgottenTrack(@Cast("size_t") long track_id);
}
