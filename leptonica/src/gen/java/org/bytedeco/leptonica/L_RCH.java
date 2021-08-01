// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/**
 *  Data returned from correlation matching on a single character
 */
@Name("L_Rch") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_RCH extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_RCH() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_RCH(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_RCH(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_RCH position(long position) {
        return (L_RCH)super.position(position);
    }
    @Override public L_RCH getPointer(long i) {
        return new L_RCH((Pointer)this).offsetAddress(i);
    }

    /** index of best template                   */
    public native @Cast("l_int32") int index(); public native L_RCH index(int setter);
    /** correlation score of best template       */
    public native @Cast("l_float32") float score(); public native L_RCH score(float setter);
    /** character string of best template        */
    public native @Cast("char*") BytePointer text(); public native L_RCH text(BytePointer setter);
    /** index of best sample (within the best    */
    /** template class, if all samples are used) */
    public native @Cast("l_int32") int sample(); public native L_RCH sample(int setter);
    /** x-location of template (delx + shiftx)   */
    public native @Cast("l_int32") int xloc(); public native L_RCH xloc(int setter);
    /** y-location of template (dely + shifty)   */
    public native @Cast("l_int32") int yloc(); public native L_RCH yloc(int setter);
    /** width of best template                   */
    public native @Cast("l_int32") int width(); public native L_RCH width(int setter);
}
