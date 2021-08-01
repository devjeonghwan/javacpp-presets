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


/** \class IPluginV2Ext
 * 
 *  \brief Plugin class for user-implemented layers.
 * 
 *  Plugins are a mechanism for applications to implement custom layers. This
 *  interface provides additional capabilities to the IPluginV2 interface by
 *  supporting different output data types and broadcast across batch.
 * 
 *  @see IPluginV2
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginV2Ext extends IPluginV2 {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginV2Ext(Pointer p) { super(p); }

    /**
     *  \brief Return the DataType of the plugin output at the requested index.
     *  The default behavior should be to return the type of the first input, or DataType::kFLOAT if the layer has no inputs.
     *  The returned data type must have a format that is supported by the plugin.
     *  @see supportsFormat()
     * 
     *  \warning DataType:kBOOL not supported.
     *  */
    
    //!
    //!
    //!
    public native @NoException(true) DataType getOutputDataType(
            int index, @Cast("nvinfer1::DataType*") IntPointer inputTypes, int nbInputs);
    public native @NoException(true) @Cast("nvinfer1::DataType") int getOutputDataType(
            int index, @Cast("nvinfer1::DataType*") IntBuffer inputTypes, int nbInputs);
    public native @NoException(true) DataType getOutputDataType(
            int index, @Cast("nvinfer1::DataType*") int[] inputTypes, int nbInputs);

    /** \brief Return true if output tensor is broadcast across a batch.
     * 
     *  @param outputIndex The index of the output
     *  @param inputIsBroadcasted The ith element is true if the tensor for the ith input is broadcast across a batch.
     *  @param nbInputs The number of inputs
     * 
     *  The values in inputIsBroadcasted refer to broadcasting at the semantic level,
     *  i.e. are unaffected by whether method canBroadcastInputAcrossBatch requests
     *  physical replication of the values.
     *  */
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean isOutputBroadcastAcrossBatch(
            int outputIndex, @Cast("const bool*") BoolPointer inputIsBroadcasted, int nbInputs);
    public native @Cast("bool") @NoException(true) boolean isOutputBroadcastAcrossBatch(
            int outputIndex, @Cast("const bool*") boolean[] inputIsBroadcasted, int nbInputs);

    /** \brief Return true if plugin can use input that is broadcast across batch without replication.
     * 
     *  @param inputIndex Index of input that could be broadcast.
     * 
     *  For each input whose tensor is semantically broadcast across a batch,
     *  TensorRT calls this method before calling configurePlugin.
     *  If canBroadcastInputAcrossBatch returns true, TensorRT will not replicate the input tensor;
     *  i.e., there will be a single copy that the plugin should share across the batch.
     *  If it returns false, TensorRT will replicate the input tensor
     *  so that it appears like a non-broadcasted tensor.
     * 
     *  This method is called only for inputs that can be broadcast.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean canBroadcastInputAcrossBatch(int inputIndex);

    /**
     *  \brief Configure the layer with input and output data types.
     * 
     *  This function is called by the builder prior to initialize(). It provides an opportunity for the layer to make
     *  algorithm choices on the basis of its weights, dimensions, data types and maximum batch size.
     * 
     *  @param inputDims The input tensor dimensions.
     *  @param nbInputs The number of inputs.
     *  @param outputDims The output tensor dimensions.
     *  @param nbOutputs The number of outputs.
     *  @param inputTypes The data types selected for the plugin inputs.
     *  @param outputTypes The data types selected for the plugin outputs.
     *  @param inputIsBroadcast True for each input that the plugin must broadcast across the batch.
     *  @param outputIsBroadcast True for each output that TensorRT will broadcast across the batch.
     *  @param floatFormat The format selected for the engine for the floating point inputs/outputs.
     *  @param maxBatchSize The maximum batch size.
     * 
     *  The dimensions passed here do not include the outermost batch size (i.e. for 2-D image networks, they will be
     *  3-dimensional CHW dimensions). When inputIsBroadcast or outputIsBroadcast is true, the outermost batch size for
     *  that input or output should be treated as if it is one.
     *  \ref inputIsBroadcast[i] is true only if the input is semantically broadcast across the batch and
     *  \ref canBroadcastInputAcrossBatch(i) returned true.
     *  \ref outputIsBroadcast[i] is true only if \ref isOutputBroadcastAcrossBatch(i) returns true.
     * 
     *  \warning for the floatFormat field, the values PluginFormat::kCHW4, PluginFormat::kCHW16, and
     *  PluginFormat::kCHW32 will not be passed in, this is to keep backward compatibility with TensorRT 5.x series. Use
     *  PluginV2IOExt or PluginV2DynamicExt for other PluginFormats.
     *  */

    public native @NoException(true) void configurePlugin(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType*") IntPointer inputTypes, @Cast("nvinfer1::DataType*") IntPointer outputTypes, @Cast("const bool*") BoolPointer inputIsBroadcast,
            @Cast("const bool*") BoolPointer outputIsBroadcast, @Cast("nvinfer1::PluginFormat") TensorFormat floatFormat, int maxBatchSize);
    public native @NoException(true) void configurePlugin(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType*") IntBuffer inputTypes, @Cast("nvinfer1::DataType*") IntBuffer outputTypes, @Cast("const bool*") boolean[] inputIsBroadcast,
            @Cast("const bool*") boolean[] outputIsBroadcast, @Cast("nvinfer1::PluginFormat") int floatFormat, int maxBatchSize);
    public native @NoException(true) void configurePlugin(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType*") int[] inputTypes, @Cast("nvinfer1::DataType*") int[] outputTypes, @Cast("const bool*") BoolPointer inputIsBroadcast,
            @Cast("const bool*") BoolPointer outputIsBroadcast, @Cast("nvinfer1::PluginFormat") TensorFormat floatFormat, int maxBatchSize);
    public native @NoException(true) void configurePlugin(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType*") IntPointer inputTypes, @Cast("nvinfer1::DataType*") IntPointer outputTypes, @Cast("const bool*") boolean[] inputIsBroadcast,
            @Cast("const bool*") boolean[] outputIsBroadcast, @Cast("nvinfer1::PluginFormat") int floatFormat, int maxBatchSize);
    public native @NoException(true) void configurePlugin(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType*") IntBuffer inputTypes, @Cast("nvinfer1::DataType*") IntBuffer outputTypes, @Cast("const bool*") BoolPointer inputIsBroadcast,
            @Cast("const bool*") BoolPointer outputIsBroadcast, @Cast("nvinfer1::PluginFormat") TensorFormat floatFormat, int maxBatchSize);
    public native @NoException(true) void configurePlugin(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType*") int[] inputTypes, @Cast("nvinfer1::DataType*") int[] outputTypes, @Cast("const bool*") boolean[] inputIsBroadcast,
            @Cast("const bool*") boolean[] outputIsBroadcast, @Cast("nvinfer1::PluginFormat") int floatFormat, int maxBatchSize);

    /**
     *  \brief Attach the plugin object to an execution context and grant the plugin the access to some context resource.
     * 
     *  @param cudnn The CUDNN context handle of the execution context
     *  @param cublas The cublas context handle of the execution context
     *  @param allocator The allocator used by the execution context
     * 
     *  This function is called automatically for each plugin when a new execution context is created. If the context
     *  was created without resources, this method is not called until the resources are assigned. It is also called if
     *  new resources are assigned to the context.
     * 
     *  If the plugin needs per-context resource, it can be allocated here.
     *  The plugin can also get context-owned CUDNN and CUBLAS context here.
     * 
     *  \note In the automotive safety context, the CUDNN and CUBLAS parameters will be nullptr because CUDNN and CUBLAS
     *        is not used by the safe runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void attachToContext(cudnnContext arg0, cublasContext arg1, IGpuAllocator arg2);

    /**
     *  \brief Detach the plugin object from its execution context.
     * 
     *  This function is called automatically for each plugin when a execution context is destroyed or the context
     *  resources are unassigned from the context.
     * 
     *  If the plugin owns per-context resource, it can be released here.
     *  */
    
    
    //!
    //!
    public native @NoException(true) void detachFromContext();

    /**
     *  \brief Clone the plugin object. This copies over internal plugin parameters as well and returns a new plugin object with these parameters.
     *  If the source plugin is pre-configured with configurePlugin(), the returned object should also be pre-configured. The returned object should allow attachToContext() with a new execution context.
     *  Cloned plugin objects can share the same per-engine immutable resource (e.g. weights) with the source object (e.g. via ref-counting) to avoid duplication.
     *  */
    public native @NoException(true) IPluginV2Ext clone();
}
