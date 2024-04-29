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

@Namespace("nvinfer1::v_1_0") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IDebugListener extends IVersionedInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IDebugListener(Pointer p) { super(p); }

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();

    /**
     *  \brief Callback function that is called when a debug tensor’s value is updated and the debug state of the tensor
     *  is set to true. Content in the given address is only guaranteed to be valid for the duration of the callback.
     * 
     *  @param location TensorLocation of the tensor.
     *  @param addr pointer to buffer.
     *  @param type data Type of the tensor.
     *  @param shape shape of the tensor.
     *  @param name name of the tensor.
     *  @param stream Cuda stream object.
     * 
     *  @return True on success, false otherwise.
     *  */
    public native @Cast("bool") boolean processDebugTensor(@Const Pointer addr, TensorLocation location, DataType type, @Cast("const nvinfer1::Dims*") @ByRef Dims64 shape,
            String name, CUstream_st stream);
    public native @Cast("bool") boolean processDebugTensor(@Const Pointer addr, @Cast("nvinfer1::TensorLocation") int location, @Cast("nvinfer1::DataType") int type, @Cast("const nvinfer1::Dims*") @ByRef Dims64 shape,
            @Cast("const char*") BytePointer name, CUstream_st stream);
}
