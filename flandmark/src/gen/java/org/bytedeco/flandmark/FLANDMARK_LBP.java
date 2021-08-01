// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.flandmark;

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

import static org.bytedeco.flandmark.global.flandmark.*;


@Properties(inherit = org.bytedeco.flandmark.presets.flandmark.class)
public class FLANDMARK_LBP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FLANDMARK_LBP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FLANDMARK_LBP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FLANDMARK_LBP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FLANDMARK_LBP position(long position) {
        return (FLANDMARK_LBP)super.position(position);
    }
    @Override public FLANDMARK_LBP getPointer(long i) {
        return new FLANDMARK_LBP((Pointer)this).offsetAddress(i);
    }

    public native int winSize(int i); public native FLANDMARK_LBP winSize(int i, int setter);
    @MemberGetter public native IntPointer winSize();
    public native @Cast("uint8_t") byte hop(); public native FLANDMARK_LBP hop(byte setter);
    public native @Cast("uint32_t*") IntPointer wins(); public native FLANDMARK_LBP wins(IntPointer setter);
    public native int WINS_ROWS(); public native FLANDMARK_LBP WINS_ROWS(int setter);
    public native int WINS_COLS(); public native FLANDMARK_LBP WINS_COLS(int setter);
}
