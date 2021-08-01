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
 *  An ILoopOutputLayer is the sole way to get output from a loop.
 * 
 *  The first input tensor must be defined inside the loop; the output tensor is outside the loop.
 *  The second input tensor, if present, must be defined outside the loop.
 * 
 *  If getLoopOutput() is kLAST_VALUE, a single input must be provided,
 *  and that input must from a IRecurrenceLayer in the same loop.
 * 
 *  If getLoopOutput() is kCONCATENATE or kREVERSE, a second input must be provided.
 *  The second input must be a scalar “shape tensor”, defined before the loop commences,
 *  that specifies the concatenation length of the output.
 * 
 *  The output tensor has j more dimensions than the input tensor, where
 *  j == 0 if getLoopOutput() is kLAST_VALUE
 *  j == 1 if getLoopOutput() is kCONCATENATE or kREVERSE.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ILoopOutputLayer extends ILoopBoundaryLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ILoopOutputLayer(Pointer p) { super(p); }

    
    
    //!
    //!
    //!
    public native @NoException(true) LoopOutput getLoopOutput();

    /**
     *  \brief Set where to insert the contenation axis. Ignored if getLoopOutput() is kLAST_VALUE.
     * 
     *  For example, if the input tensor has dimensions [b,c,d],
     *  and getLoopOutput() is  kCONCATENATE, the output has four dimensions.
     *  Let a be the value of the second input.
     *  setAxis(0) causes the output to have dimensions [a,b,c,d].
     *  setAxis(1) causes the output to have dimensions [b,a,c,d].
     *  setAxis(2) causes the output to have dimensions [b,c,a,d].
     *  setAxis(3) causes the output to have dimensions [b,c,d,a].
     *  Default is axis is 0.
     *  */
    public native @NoException(true) void setAxis(int axis);

    /** Get axis being concatenated over. */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getAxis();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor */
    //
    /** Sets the input tensor for the given index. The index must be 0 for a kLAST_VALUE loop output layer.
    /** Loop output layer is converted to a kCONCATENATE or kREVERSE loop output layer by calling setInput with an
    /** index 1. A kCONCATENATE or kREVERSE loop output layer cannot be converted back to a kLAST_VALUE loop output
    /** layer.
    /**
    /** For a kCONCATENATE or kREVERSE loop output layer, the values 0 and 1 are valid.
    /** The indices in the kCONCATENATE or kREVERSE cases are as follows:
    /**
    /** - 0: Contribution to the output tensor.  The contribution must come from inside the loop.
    /** - 1: The concatenation length scalar value, must come from outside the loop, as a 0D Int32 shape tensor.
    /**
    /** If this function is called with a value 1, then the function getNbInputs() changes
    /** from returning 1 to 2.
    /** */
}
