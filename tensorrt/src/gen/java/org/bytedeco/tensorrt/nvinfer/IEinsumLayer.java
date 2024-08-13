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
 *  \class IEinsumLayer
 * 
 *  \brief An Einsum layer in a network
 * 
 *  This layer implements a summation over the elements of the inputs along dimensions specified by the equation
 *  parameter, based on the Einstein summation convention.
 *  The layer can have one or more inputs of rank >= 0. All the inputs must have type DataType::kFLOAT
 *  or DataType::kHALF, not necessarily the same. There is one output of type DataType::kFLOAT.
 *  The shape of the output tensor is determined by the equation.
 * 
 *  The equation specifies ASCII lower-case letters for each dimension in the inputs in the same order as the
 *  dimensions, separated by comma for each input. The dimensions labeled with the same subscript must match or be
 *  broadcastable. Repeated subscript labels in one input take the diagonal. Repeating a label across multiple inputs
 *  means that those axes will be multiplied. Omitting a label from the output means values along those axes will be
 *  summed. In implicit mode, the indices which appear once in the expression will be part of the output in increasing
 *  alphabetical order. In explicit mode, the output can be controlled by specifying output subscript labels by adding
 *  an arrow ('->') followed by subscripts for the output.
 *  For example, "ij,jk->ik" is equivalent to "ij,jk".
 *  Ellipsis ('...') can be used in place of subscripts to broadcast the dimensions.
 *  See the TensorRT Developer Guide for more details on equation syntax.
 * 
 *  Many common operations can be expressed using the Einsum equation.
 *  For example:
 *  Matrix Transpose:             ij->ji
 *  Sum:                          ij->
 *  Matrix-Matrix Multiplication: ik,kj->ij
 *  Dot Product:                  i,i->
 *  Matrix-Vector Multiplication: ik,k->i
 *  Batch Matrix Multiplication:  ijk,ikl->ijl
 *  Batch Diagonal:               ...ii->...i
 * 
 *  \note TensorRT does not support ellipsis, diagonal operations or more than two inputs for Einsum.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IEinsumLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IEinsumLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the equation.
     *  The equation is a comma-separated list of subscript labels, where each label refers to a
     *  dimension of the corresponding tensor.
     * 
     *  @return true if the equation was syntactically valid and set successfully, false otherwise.
     * 
     *  @see setEquation()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setEquation(String equation);
    public native @Cast("bool") @NoException(true) boolean setEquation(@Cast("const char*") BytePointer equation);

    /**
     *  \brief Return the equation.
     * 
     *  @see setEquation()
     *  */
    public native @NoException(true) String getEquation();
}
