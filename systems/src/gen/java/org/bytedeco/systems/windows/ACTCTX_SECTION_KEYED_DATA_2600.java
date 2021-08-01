// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTCTX_SECTION_KEYED_DATA_2600 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTCTX_SECTION_KEYED_DATA_2600() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTCTX_SECTION_KEYED_DATA_2600(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTCTX_SECTION_KEYED_DATA_2600(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTCTX_SECTION_KEYED_DATA_2600 position(long position) {
        return (ACTCTX_SECTION_KEYED_DATA_2600)super.position(position);
    }
    @Override public ACTCTX_SECTION_KEYED_DATA_2600 getPointer(long i) {
        return new ACTCTX_SECTION_KEYED_DATA_2600((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONG") long cbSize(); public native ACTCTX_SECTION_KEYED_DATA_2600 cbSize(long setter);
    public native @Cast("ULONG") long ulDataFormatVersion(); public native ACTCTX_SECTION_KEYED_DATA_2600 ulDataFormatVersion(long setter);
    public native @Cast("PVOID") Pointer lpData(); public native ACTCTX_SECTION_KEYED_DATA_2600 lpData(Pointer setter);
    public native @Cast("ULONG") long ulLength(); public native ACTCTX_SECTION_KEYED_DATA_2600 ulLength(long setter);
    public native @Cast("PVOID") Pointer lpSectionGlobalData(); public native ACTCTX_SECTION_KEYED_DATA_2600 lpSectionGlobalData(Pointer setter);
    public native @Cast("ULONG") long ulSectionGlobalDataLength(); public native ACTCTX_SECTION_KEYED_DATA_2600 ulSectionGlobalDataLength(long setter);
    public native @Cast("PVOID") Pointer lpSectionBase(); public native ACTCTX_SECTION_KEYED_DATA_2600 lpSectionBase(Pointer setter);
    public native @Cast("ULONG") long ulSectionTotalLength(); public native ACTCTX_SECTION_KEYED_DATA_2600 ulSectionTotalLength(long setter);
    public native @Cast("HANDLE") Pointer hActCtx(); public native ACTCTX_SECTION_KEYED_DATA_2600 hActCtx(Pointer setter);
    public native @Cast("ULONG") long ulAssemblyRosterIndex(); public native ACTCTX_SECTION_KEYED_DATA_2600 ulAssemblyRosterIndex(long setter);
}
