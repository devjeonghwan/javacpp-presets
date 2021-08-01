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
 *  \class IQuantizeLayer
 * 
 *  \brief A Quantize layer in a network definition.
 * 
 *  This layer accepts a floating-point data input tensor, and uses the scale and zeroPt inputs to
 *  quantize the data to an 8-bit signed integer according to:
 *  \p output = clamp(round(\p input / \p scale) + \p zeroPt)
 * 
 *  Rounding type is rounding-to-nearest ties-to-even (https://en.wikipedia.org/wiki/Rounding#Round_half_to_even).
 *  Clamping is in the range [-128, 127].
 * 
 *  The first input (index 0) is the tensor to be quantized.
 *  The second (index 1) and third (index 2) are the scale and zero point respectively.
 *  Each of \p scale and \p zeroPt must be either a scalar, or a 1D tensor.
 * 
 *  The \p zeroPt tensor is optional, and if not set, will be assumed to be zero.  Its data type must be
 *  DataType::kINT8. \p zeroPt must only contain zero-valued coefficients, because only symmetric quantization is
 *  supported.
 *  The \p scale value must be either a scalar for per-tensor quantization, or a 1D tensor for per-channel
 *  quantization. All \p scale coefficients must have positive values.  The size of the 1-D \p scale tensor must match
 *  the size of the quantization axis. The size of the \p scale must match the size of the \p zeroPt.
 * 
 *  The subgraph which terminates with the \p scale tensor must be a build-time constant.  The same restrictions apply
 *  to the \p zeroPt.
 *  The output type, if constrained, must be constrained to DataType::kINT8. The input type, if constrained, must be
 *  constrained to DataType::kFLOAT (FP16 input is not supported).
 *  The output size is the same as the input size. The quantization axis is in reference to the input tensor's
 *  dimensions.
 * 
 *  IQuantizeLayer only supports DataType::kFLOAT precision and will default to this precision during instantiation.
 *  IQuantizeLayer only supports DataType::kINT8 output.
 * 
 *  As an example of the operation of this layer, imagine a 4D NCHW activation input which can be quantized using a
 *  single scale coefficient (referred to as per-tensor quantization):
 *      For each n in N:
 *          For each c in C:
 *              For each h in H:
 *                  For each w in W:
 *                      output[n,c,h,w] = clamp(round(\p input[n,c,h,w] / \p scale) + \p zeroPt)
 * 
 *  Per-channel quantization is supported only for weight inputs. Thus, Activations cannot be quantized per-channel.
 *  As an example of per-channel operation, imagine a 4D KCRS weights input and K (dimension 0) as the quantization
 *  axis. The scale is an array of coefficients, and must have the same size as the quantization axis.
 *      For each k in K:
 *          For each c in C:
 *              For each r in R:
 *                  For each s in S:
 *                      output[k,c,r,s] = clamp(round(\p input[k,c,r,s] / \p scale[k]) + \p zeroPt[k])
 * 
 *  \note Only symmetric quantization is supported.
 *  \note Currently the only allowed build-time constant \p scale and \zeroPt subgraphs are:
 *  1. Constant -> Quantize
 *  2. Constant -> Cast -> Quantize
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IQuantizeLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IQuantizeLayer(Pointer p) { super(p); }

    /**
     *  \brief Get the quantization axis.
     * 
     *  @return axis parameter set by setAxis().
     *  The return value is the index of the quantization axis in the input tensor's dimensions.
     *  A value of -1 indicates per-tensor quantization.
     *  The default value is -1.
     *  */
    
    //!
    //!
    //!
    public native @NoException(true) int getAxis();
    /**
     *  \brief Set the quantization axis.
     * 
     *  Set the index of the quantization axis (with reference to the input tensor's dimensions).
     *  The axis must be a valid axis if the scale tensor has more than one coefficient.
     *  The axis value will be ignored if the scale tensor has exactly one coefficient (per-tensor quantization).
     *  */
    public native @NoException(true) void setAxis(int axis);
}
