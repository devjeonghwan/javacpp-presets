// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_text;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_text.*;


/** \brief TextDetectorCNN class provides the functionallity of text bounding box detection.
 This class is representing to find bounding boxes of text words given an input image.
 This class uses OpenCV dnn module to load pre-trained model described in \cite LiaoSBWL17.
 The original repository with the modified SSD Caffe version: https://github.com/MhLiao/TextBoxes.
 Model can be downloaded from [DropBox](https://www.dropbox.com/s/g8pjzv2de9gty8g/TextBoxes_icdar13.caffemodel?dl=0).
 Modified .prototxt file with the model description can be found in {@code opencv_contrib/modules/text/samples/textbox.prototxt}.
 */
@Namespace("cv::text") @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class TextDetectorCNN extends TextDetector {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TextDetectorCNN(Pointer p) { super(p); }

    /**
    \overload
    <p>
    @param inputImage an image expected to be a CV_U8C3 of any size
    @param Bbox a vector of Rect that will store the detected word bounding box
    @param confidence a vector of float that will be updated with the confidence the classifier has for the selected bounding box
    */
    public native @Override void detect(@ByVal Mat inputImage, @ByRef RectVector Bbox, @ByRef FloatVector confidence);
    public native @Override void detect(@ByVal UMat inputImage, @ByRef RectVector Bbox, @ByRef FloatVector confidence);
    public native @Override void detect(@ByVal GpuMat inputImage, @ByRef RectVector Bbox, @ByRef FloatVector confidence);

    /** \brief Creates an instance of the TextDetectorCNN class using the provided parameters.
    <p>
    @param modelArchFilename the relative or absolute path to the prototxt file describing the classifiers architecture.
    @param modelWeightsFilename the relative or absolute path to the file containing the pretrained weights of the model in caffe-binary form.
    @param detectionSizes a list of sizes for multiscale detection. The values{@code [(300,300),(700,500),(700,300),(700,700),(1600,1600)]} are
    recommended in \cite LiaoSBWL17 to achieve the best quality.
    */
    public static native @Ptr TextDetectorCNN create(@Str BytePointer modelArchFilename, @Str BytePointer modelWeightsFilename,
                                                   @ByVal SizeVector detectionSizes);
    public static native @Ptr TextDetectorCNN create(@Str String modelArchFilename, @Str String modelWeightsFilename,
                                                   @ByVal SizeVector detectionSizes);
    /**
      \overload
    */
    public static native @Ptr TextDetectorCNN create(@Str BytePointer modelArchFilename, @Str BytePointer modelWeightsFilename);
    public static native @Ptr TextDetectorCNN create(@Str String modelArchFilename, @Str String modelWeightsFilename);
}
