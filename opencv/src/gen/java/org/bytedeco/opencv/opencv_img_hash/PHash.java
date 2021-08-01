// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_img_hash;

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

import static org.bytedeco.opencv.global.opencv_img_hash.*;


/** \addtogroup img_hash
 *  \{
<p>
/** \brief pHash
<p>
Slower than average_hash, but tolerant of minor modifications
<p>
This algorithm can combat more variation than averageHash, for more details please refer to \cite lookslikeit
*/
@Namespace("cv::img_hash") @Properties(inherit = org.bytedeco.opencv.presets.opencv_img_hash.class)
public class PHash extends ImgHashBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PHash(Pointer p) { super(p); }

    public static native @Ptr PHash create();
}
