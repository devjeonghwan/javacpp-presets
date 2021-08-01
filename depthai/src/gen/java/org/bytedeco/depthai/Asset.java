// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief Asset is identified with string key and can store arbitrary binary data
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Asset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Asset(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Asset(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Asset position(long position) {
        return (Asset)super.position(position);
    }
    @Override public Asset getPointer(long i) {
        return new Asset((Pointer)this).offsetAddress(i);
    }

    public Asset() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Asset(@StdString BytePointer k) { super((Pointer)null); allocate(k); }
    private native void allocate(@StdString BytePointer k);
    public Asset(@StdString String k) { super((Pointer)null); allocate(k); }
    private native void allocate(@StdString String k);
    @MemberGetter public native @StdString BytePointer key();
    public native @Cast("std::uint8_t*") @StdVector BytePointer data(); public native Asset data(BytePointer setter);
    public native @Cast("std::uint32_t") int alignment(); public native Asset alignment(int setter);
}
