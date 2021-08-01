// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

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


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VScaleLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VScaleLayer(Pointer p) { super(p); }

    public native @NoException(true) void setMode(ScaleMode mode);
    public native @NoException(true) void setMode(@Cast("nvinfer1::ScaleMode") int mode);
    public native @NoException(true) ScaleMode getMode();
    public native @NoException(true) void setShift(@ByVal Weights shift);
    public native @ByVal @NoException(true) Weights getShift();
    public native @NoException(true) void setScale(@ByVal Weights scale);
    public native @ByVal @NoException(true) Weights getScale();
    public native @NoException(true) void setPower(@ByVal Weights power);
    public native @ByVal @NoException(true) Weights getPower();
    public native @NoException(true) int getChannelAxis();
    public native @NoException(true) void setChannelAxis(int channelAxis);
}
