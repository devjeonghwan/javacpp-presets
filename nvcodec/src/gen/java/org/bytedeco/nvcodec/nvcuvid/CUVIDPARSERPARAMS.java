// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/**************************************/
/** \ingroup STRUCTS
/** \struct CUVIDPARSERPARAMS
/** Used in cuvidCreateVideoParser API
/**************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDPARSERPARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDPARSERPARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDPARSERPARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDPARSERPARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDPARSERPARAMS position(long position) {
        return (CUVIDPARSERPARAMS)super.position(position);
    }
    @Override public CUVIDPARSERPARAMS getPointer(long i) {
        return new CUVIDPARSERPARAMS((Pointer)this).offsetAddress(i);
    }

    /** IN: cudaVideoCodec_XXX                                                  */
    public native @Cast("cudaVideoCodec") int CodecType(); public native CUVIDPARSERPARAMS CodecType(int setter);
    /** IN: Max # of decode surfaces (parser will cycle through these)          */
    public native @Cast("unsigned int") int ulMaxNumDecodeSurfaces(); public native CUVIDPARSERPARAMS ulMaxNumDecodeSurfaces(int setter);
    /** IN: Timestamp units in Hz (0=default=10000000Hz)                        */
    public native @Cast("unsigned int") int ulClockRate(); public native CUVIDPARSERPARAMS ulClockRate(int setter);
    /** IN: % Error threshold (0-100) for calling pfnDecodePicture (100=always 
                                                         IN: call pfnDecodePicture even if picture bitstream is fully corrupted) */
    public native @Cast("unsigned int") int ulErrorThreshold(); public native CUVIDPARSERPARAMS ulErrorThreshold(int setter);
    /** IN: Max display queue delay (improves pipelining of decode with display)
                                                             0=no delay (recommended values: 2..4)                               */
    public native @Cast("unsigned int") int ulMaxDisplayDelay(); public native CUVIDPARSERPARAMS ulMaxDisplayDelay(int setter);
    /** IN: AV1 annexB stream                                                   */
    public native @Cast("unsigned int") @NoOffset int bAnnexb(); public native CUVIDPARSERPARAMS bAnnexb(int setter);
    /** Reserved for future use - set to zero                                   */
    public native @Cast("unsigned int") @NoOffset int uReserved(); public native CUVIDPARSERPARAMS uReserved(int setter);
    /** IN: Reserved for future use - set to 0                                  */
    public native @Cast("unsigned int") int uReserved1(int i); public native CUVIDPARSERPARAMS uReserved1(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer uReserved1();
    /** IN: User data for callbacks                                             */
    public native Pointer pUserData(); public native CUVIDPARSERPARAMS pUserData(Pointer setter);
    /** IN: Called before decoding frames and/or whenever there is a fmt change */
    public native PFNVIDSEQUENCECALLBACK pfnSequenceCallback(); public native CUVIDPARSERPARAMS pfnSequenceCallback(PFNVIDSEQUENCECALLBACK setter);
    /** IN: Called when a picture is ready to be decoded (decode order)         */
    public native PFNVIDDECODECALLBACK pfnDecodePicture(); public native CUVIDPARSERPARAMS pfnDecodePicture(PFNVIDDECODECALLBACK setter);
    /** IN: Called whenever a picture is ready to be displayed (display order)  */
    public native PFNVIDDISPLAYCALLBACK pfnDisplayPicture(); public native CUVIDPARSERPARAMS pfnDisplayPicture(PFNVIDDISPLAYCALLBACK setter);
    /** IN: Called from AV1 sequence header to get operating point of a AV1 
                                                             scalable bitstream                                                  */
    public native PFNVIDOPPOINTCALLBACK pfnGetOperatingPoint(); public native CUVIDPARSERPARAMS pfnGetOperatingPoint(PFNVIDOPPOINTCALLBACK setter);
    /** IN: Called when all SEI messages are parsed for particular frame        */
    public native PFNVIDSEIMSGCALLBACK pfnGetSEIMsg(); public native CUVIDPARSERPARAMS pfnGetSEIMsg(PFNVIDSEIMSGCALLBACK setter);
    /** Reserved for future use - set to NULL                                   */
    public native Pointer pvReserved2(int i); public native CUVIDPARSERPARAMS pvReserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer pvReserved2();
    /** IN: [Optional] sequence header data from system layer                   */
    public native CUVIDEOFORMATEX pExtVideoInfo(); public native CUVIDPARSERPARAMS pExtVideoInfo(CUVIDEOFORMATEX setter);
}
