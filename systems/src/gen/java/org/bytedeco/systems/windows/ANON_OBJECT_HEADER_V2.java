// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ANON_OBJECT_HEADER_V2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ANON_OBJECT_HEADER_V2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ANON_OBJECT_HEADER_V2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ANON_OBJECT_HEADER_V2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ANON_OBJECT_HEADER_V2 position(long position) {
        return (ANON_OBJECT_HEADER_V2)super.position(position);
    }
    @Override public ANON_OBJECT_HEADER_V2 getPointer(long i) {
        return new ANON_OBJECT_HEADER_V2((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Sig1(); public native ANON_OBJECT_HEADER_V2 Sig1(short setter);            // Must be IMAGE_FILE_MACHINE_UNKNOWN
    public native @Cast("WORD") short Sig2(); public native ANON_OBJECT_HEADER_V2 Sig2(short setter);            // Must be 0xffff
    public native @Cast("WORD") short Version(); public native ANON_OBJECT_HEADER_V2 Version(short setter);         // >= 2 (implies the Flags field is present - otherwise V1)
    public native @Cast("WORD") short Machine(); public native ANON_OBJECT_HEADER_V2 Machine(short setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native ANON_OBJECT_HEADER_V2 TimeDateStamp(int setter);
    public native @ByRef @Cast("CLSID*") GUID ClassID(); public native ANON_OBJECT_HEADER_V2 ClassID(GUID setter);         // Used to invoke CoCreateInstance
    public native @Cast("DWORD") int SizeOfData(); public native ANON_OBJECT_HEADER_V2 SizeOfData(int setter);      // Size of data that follows the header
    public native @Cast("DWORD") int Flags(); public native ANON_OBJECT_HEADER_V2 Flags(int setter);           // 0x1 -> contains metadata
    public native @Cast("DWORD") int MetaDataSize(); public native ANON_OBJECT_HEADER_V2 MetaDataSize(int setter);    // Size of CLR metadata
    public native @Cast("DWORD") int MetaDataOffset(); public native ANON_OBJECT_HEADER_V2 MetaDataOffset(int setter);  // Offset of CLR metadata
}
