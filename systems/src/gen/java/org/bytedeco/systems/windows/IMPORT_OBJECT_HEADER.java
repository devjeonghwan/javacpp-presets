// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMPORT_OBJECT_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMPORT_OBJECT_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMPORT_OBJECT_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMPORT_OBJECT_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMPORT_OBJECT_HEADER position(long position) {
        return (IMPORT_OBJECT_HEADER)super.position(position);
    }
    @Override public IMPORT_OBJECT_HEADER getPointer(long i) {
        return new IMPORT_OBJECT_HEADER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Sig1(); public native IMPORT_OBJECT_HEADER Sig1(short setter);                       // Must be IMAGE_FILE_MACHINE_UNKNOWN
    public native @Cast("WORD") short Sig2(); public native IMPORT_OBJECT_HEADER Sig2(short setter);                       // Must be IMPORT_OBJECT_HDR_SIG2.
    public native @Cast("WORD") short Version(); public native IMPORT_OBJECT_HEADER Version(short setter);
    public native @Cast("WORD") short Machine(); public native IMPORT_OBJECT_HEADER Machine(short setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native IMPORT_OBJECT_HEADER TimeDateStamp(int setter);              // Time/date stamp
    public native @Cast("DWORD") int SizeOfData(); public native IMPORT_OBJECT_HEADER SizeOfData(int setter);                 // particularly useful for incremental links
        public native @Cast("WORD") short Ordinal(); public native IMPORT_OBJECT_HEADER Ordinal(short setter);                // if grf & IMPORT_OBJECT_ORDINAL
        public native @Cast("WORD") short Hint(); public native IMPORT_OBJECT_HEADER Hint(short setter); 

    public native @Cast("WORD") @NoOffset short Type(); public native IMPORT_OBJECT_HEADER Type(short setter);                   // IMPORT_TYPE
    public native @Cast("WORD") @NoOffset short NameType(); public native IMPORT_OBJECT_HEADER NameType(short setter);               // IMPORT_NAME_TYPE
    public native @Cast("WORD") @NoOffset short Reserved(); public native IMPORT_OBJECT_HEADER Reserved(short setter);              // Reserved. Must be zero.
}
