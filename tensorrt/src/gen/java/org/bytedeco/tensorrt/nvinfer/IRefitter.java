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
 *  \class IRefitter
 * 
 *  \brief Updates weights in an engine.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRefitter extends INoCopy {
    static { Loader.load(); }
    /** Default native constructor. */
    public IRefitter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IRefitter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRefitter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IRefitter position(long position) {
        return (IRefitter)super.position(position);
    }
    @Override public IRefitter getPointer(long i) {
        return new IRefitter((Pointer)this).offsetAddress(i);
    }


    /**
     *  \brief Specify new weights for a layer of given name.
     *  Returns true on success, or false if new weights are rejected.
     *  Possible reasons for rejection are:
     * 
     *  * There is no such layer by that name.
     *  * The layer does not have weights with the specified role.
     *  * The number of weights is inconsistent with the layer’s original specification.
     * 
     *  Modifying the weights before method refit() completes will result in undefined behavior. */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setWeights(String layerName, WeightsRole role, @ByVal Weights weights);
    public native @Cast("bool") @NoException(true) boolean setWeights(@Cast("const char*") BytePointer layerName, @Cast("nvinfer1::WeightsRole") int role, @ByVal Weights weights);

    /**
     *  \brief Updates associated engine.  Return true if successful.
     * 
     *  Failure occurs if getMissing() != 0 before the call.
     * 
     *  The behavior is undefined if the engine has pending enqueued work.
     * 
     *  Extant IExecutionContexts associated with the engine should not be used afterwards.
     *  Instead, create new IExecutionContexts after refitting.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean refitCudaEngine();

    /**
     *  \brief Get description of missing weights.
     * 
     *  For example, if some Weights have been set, but the engine was optimized
     *  in a way that combines weights, any unsupplied Weights in the combination
     *  are considered missing.
     * 
     *  @param size The number of items that can be safely written to a non-null layerNames or roles.
     *  @param layerNames Where to write the layer names.
     *  @param roles Where to write the weights roles.
     * 
     *  @return The number of missing Weights.
     * 
     *  If layerNames!=nullptr, each written pointer points to a string owned by
     *  the engine being refit, and becomes invalid when the engine is destroyed.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getMissing(int size, @Cast("const char**") PointerPointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getMissing(int size, @Cast("const char**") @ByPtrPtr BytePointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getMissing(int size, @Cast("const char**") @ByPtrPtr ByteBuffer layerNames, @Cast("nvinfer1::WeightsRole*") IntBuffer roles);
    public native @NoException(true) int getMissing(int size, @Cast("const char**") @ByPtrPtr byte[] layerNames, @Cast("nvinfer1::WeightsRole*") int[] roles);

    /**
     *  \brief Get description of all weights that could be refit.
     * 
     *  @param size The number of items that can be safely written to a non-null layerNames or roles.
     *  @param layerNames Where to write the layer names.
     *  @param roles Where to write the weights roles.
     * 
     *  @return The number of Weights that could be refit.
     * 
     *  If layerNames!=nullptr, each written pointer points to a string owned by
     *  the engine being refit, and becomes invalid when the engine is destroyed.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int getAll(int size, @Cast("const char**") PointerPointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") @ByPtrPtr BytePointer layerNames, @Cast("nvinfer1::WeightsRole*") IntPointer roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") @ByPtrPtr ByteBuffer layerNames, @Cast("nvinfer1::WeightsRole*") IntBuffer roles);
    public native @NoException(true) int getAll(int size, @Cast("const char**") @ByPtrPtr byte[] layerNames, @Cast("nvinfer1::WeightsRole*") int[] roles);

    /**
     *  @deprecated Deprecated interface will be removed in TensorRT 10.0.
     * 
     *  \warning Calling destroy on a managed pointer will result in a double-free error.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void destroy();

    /**
     *  Update dynamic range for a tensor.
     * 
     *  @param tensorName The name of an ITensor in the network.
     *  @param min The minimum of the dynamic range for the tensor.
     *  @param max The maximum of the dynamic range for the tensor.
     * 
     *  @return True if successful; false otherwise.
     * 
     *  Returns false if there is no Int8 engine tensor derived from
     *  a network tensor of that name.  If successful, then getMissing
     *  may report that some weights need to be supplied. */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setDynamicRange(String tensorName, float min, float max);
    public native @Cast("bool") @NoException(true) boolean setDynamicRange(@Cast("const char*") BytePointer tensorName, float min, float max);

    /**
     *  \brief Get minimum of dynamic range.
     * 
     *  @return Minimum of dynamic range.
     * 
     *  If the dynamic range was never set, returns the minimum computed during calibration.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) float getDynamicRangeMin(String tensorName);
    public native @NoException(true) float getDynamicRangeMin(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Get maximum of dynamic range.
     * 
     *  @return Maximum of dynamic range.
     * 
     *  If the dynamic range was never set, returns the maximum computed during calibration.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) float getDynamicRangeMax(String tensorName);
    public native @NoException(true) float getDynamicRangeMax(@Cast("const char*") BytePointer tensorName);

    /**
     *  \brief Get names of all tensors that have refittable dynamic ranges.
     * 
     *  @param size The number of items that can be safely written to a non-null tensorNames.
     *  @param tensorNames Where to write the layer names.
     * 
     *  @return The number of Weights that could be refit.
     * 
     *  If tensorNames!=nullptr, each written pointer points to a string owned by
     *  the engine being refit, and becomes invalid when the engine is destroyed.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") PointerPointer tensorNames);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") @ByPtrPtr BytePointer tensorNames);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") @ByPtrPtr ByteBuffer tensorNames);
    public native @NoException(true) int getTensorsWithDynamicRange(int size, @Cast("const char**") @ByPtrPtr byte[] tensorNames);

    /**
     *  \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  If an error recorder is not set, messages will be sent to the global log stream.
     * 
     *  @param recorder The error recorder to register with this interface. */
    //
    /** @see getErrorRecorder()
    /** */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief Get the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A nullptr will be returned if
     *  an error handler has not been set.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) IErrorRecorder getErrorRecorder();

    /**
     *  \brief Specify new weights of given name.
     * 
     *  @param name The name of the weights to be refit.
     *  @param weights The new weights to associate with the name.
     * 
     *  Returns true on success, or false if new weights are rejected.
     *  Possible reasons for rejection are:
     * 
     *  * The name of weights is nullptr or does not correspond to any refittable weights.
     *  * The number of weights is inconsistent with the original specification.
     * 
     *  Modifying the weights before method refitCudaEngine() completes will result in undefined behavior. */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean setNamedWeights(String name, @ByVal Weights weights);
    public native @Cast("bool") @NoException(true) boolean setNamedWeights(@Cast("const char*") BytePointer name, @ByVal Weights weights);

    /**
     *  \brief Get names of missing weights.
     * 
     *  For example, if some Weights have been set, but the engine was optimized
     *  in a way that combines weights, any unsupplied Weights in the combination
     *  are considered missing.
     * 
     *  @param size The number of weights names that can be safely written to.
     *  @param weightsNames The names of the weights to be updated, or nullptr for unnamed weights.
     * 
     *  @return The number of missing Weights.
     * 
     *  If layerNames!=nullptr, each written pointer points to a string owned by
     *  the engine being refit, and becomes invalid when the engine is destroyed.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") PointerPointer weightsNames);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") @ByPtrPtr BytePointer weightsNames);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") @ByPtrPtr ByteBuffer weightsNames);
    public native @NoException(true) int getMissingWeights(int size, @Cast("const char**") @ByPtrPtr byte[] weightsNames);

    /**
     *  \brief Get names of all weights that could be refit.
     * 
     *  @param size The number of weights names that can be safely written to.
     *  @param weightsNames The names of the weights to be updated, or nullptr for unnamed weights.
     * 
     *  @return The number of Weights that could be refit.
     * 
     *  If layerNames!=nullptr, each written pointer points to a string owned by
     *  the engine being refit, and becomes invalid when the engine is destroyed.
     *  */
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") PointerPointer weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") @ByPtrPtr BytePointer weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") @ByPtrPtr ByteBuffer weightsNames);
    public native @NoException(true) int getAllWeights(int size, @Cast("const char**") @ByPtrPtr byte[] weightsNames);
}
