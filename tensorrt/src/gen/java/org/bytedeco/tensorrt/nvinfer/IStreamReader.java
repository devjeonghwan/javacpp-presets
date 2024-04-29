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
public class IStreamReader extends IVersionedInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IStreamReader(Pointer p) { super(p); }

    /**
     *  TensorRT never calls the destructor for an IStreamReader defined by the
     *  application.
     *  */

    /**
     *  \brief Return version information associated with this interface. Applications must not override this method.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) InterfaceInfo getInterfaceInfo();

    /**
     *  \brief Read the next number of bytes in the stream.
     * 
     *  @param destination The memory to write to
     *  @param nbBytes The number of bytes to read
     * 
     *  @return The number of bytes read. Negative values will be considered an automatic error.
     *  */
    public native @Cast("int64_t") long read(Pointer destination, @Cast("int64_t") long nbBytes);
}
