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

/** Maximum number of elements in DataType enum. @see DataType */
@Name("nvinfer1::impl::EnumMaxImpl<nvinfer1::DataType>") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class EnumMaxImpl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EnumMaxImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EnumMaxImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnumMaxImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EnumMaxImpl position(long position) {
        return (EnumMaxImpl)super.position(position);
    }
    @Override public EnumMaxImpl getPointer(long i) {
        return new EnumMaxImpl((Pointer)this).offsetAddress(i);
    }

    // Declaration of kVALUE that represents maximum number of elements in DataType enum
    @MemberGetter public static native int kVALUE();
    public static final int kVALUE = kVALUE();
}
