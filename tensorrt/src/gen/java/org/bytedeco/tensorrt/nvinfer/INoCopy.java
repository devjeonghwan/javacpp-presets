// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class INoCopy
 * 
 *  \brief Base class for all TensorRT interfaces that are implemented by the TensorRT libraries
 * 
 *  Objects of such classes are not movable or copyable, and should only be manipulated
 *  via pointers.
 *  */

@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class INoCopy extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public INoCopy(Pointer p) { super(p); }

}
