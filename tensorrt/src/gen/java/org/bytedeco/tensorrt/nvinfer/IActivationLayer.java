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


/**
 *  \class IActivationLayer
 * 
 *  \brief An Activation layer in a network definition.
 * 
 *  This layer applies a per-element activation function to its input.
 * 
 *  The output has the same shape as the input.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IActivationLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IActivationLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the type of activation to be performed.
     * 
     *  On the DLA, the valid activation types are kRELU, kSIGMOID, kTANH, and kCLIP.
     * 
     *  @see getActivationType(), ActivationType
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setActivationType(ActivationType type);
    public native @NoException(true) void setActivationType(@Cast("nvinfer1::ActivationType") int type);

    /**
     *  \brief Get the type of activation to be performed.
     * 
     *  @see setActivationType(), ActivationType
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) ActivationType getActivationType();

    /**
     *  \brief Set the alpha parameter (must be finite).
     * 
     *  This parameter is used by the following activations:
     *  LeakyRelu, Elu, Selu, Softplus, Clip, HardSigmoid, ScaledTanh,
     *  ThresholdedRelu.
     * 
     *  It is ignored by the other activations.
     * 
     *  @see getAlpha(), setBeta() */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setAlpha(float alpha);

    /**
     *  \brief Set the beta parameter (must be finite).
     * 
     *  This parameter is used by the following activations:
     *  Selu, Softplus, Clip, HardSigmoid, ScaledTanh.
     * 
     *  It is ignored by the other activations.
     * 
     *  @see getBeta(), setAlpha() */
    
    
    //!
    //!
    public native @NoException(true) void setBeta(float beta);

    /**
     *  \brief Get the alpha parameter.
     * 
     *  @see getBeta(), setAlpha() */
    
    
    //!
    //!
    public native @NoException(true) float getAlpha();

    /**
     *  \brief Get the beta parameter.
     * 
     *  @see getAlpha(), setBeta() */
    public native @NoException(true) float getBeta();
}
