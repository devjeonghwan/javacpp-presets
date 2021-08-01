// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_LOAD_CONFIG_DIRECTORY64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_LOAD_CONFIG_DIRECTORY64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_LOAD_CONFIG_DIRECTORY64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_LOAD_CONFIG_DIRECTORY64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_LOAD_CONFIG_DIRECTORY64 position(long position) {
        return (IMAGE_LOAD_CONFIG_DIRECTORY64)super.position(position);
    }
    @Override public IMAGE_LOAD_CONFIG_DIRECTORY64 getPointer(long i) {
        return new IMAGE_LOAD_CONFIG_DIRECTORY64((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Size(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 Size(int setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 TimeDateStamp(int setter);
    public native @Cast("WORD") short MajorVersion(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 MajorVersion(short setter);
    public native @Cast("WORD") short MinorVersion(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 MinorVersion(short setter);
    public native @Cast("DWORD") int GlobalFlagsClear(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 GlobalFlagsClear(int setter);
    public native @Cast("DWORD") int GlobalFlagsSet(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 GlobalFlagsSet(int setter);
    public native @Cast("DWORD") int CriticalSectionDefaultTimeout(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 CriticalSectionDefaultTimeout(int setter);
    public native @Cast("ULONGLONG") long DeCommitFreeBlockThreshold(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 DeCommitFreeBlockThreshold(long setter);
    public native @Cast("ULONGLONG") long DeCommitTotalFreeThreshold(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 DeCommitTotalFreeThreshold(long setter);
    public native @Cast("ULONGLONG") long LockPrefixTable(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 LockPrefixTable(long setter);             // VA
    public native @Cast("ULONGLONG") long MaximumAllocationSize(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 MaximumAllocationSize(long setter);
    public native @Cast("ULONGLONG") long VirtualMemoryThreshold(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 VirtualMemoryThreshold(long setter);
    public native @Cast("ULONGLONG") long ProcessAffinityMask(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 ProcessAffinityMask(long setter);
    public native @Cast("DWORD") int ProcessHeapFlags(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 ProcessHeapFlags(int setter);
    public native @Cast("WORD") short CSDVersion(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 CSDVersion(short setter);
    public native @Cast("WORD") short Reserved1(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 Reserved1(short setter);
    public native @Cast("ULONGLONG") long EditList(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 EditList(long setter);                    // VA
    public native @Cast("ULONGLONG") long SecurityCookie(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 SecurityCookie(long setter);              // VA
    public native @Cast("ULONGLONG") long SEHandlerTable(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 SEHandlerTable(long setter);              // VA
    public native @Cast("ULONGLONG") long SEHandlerCount(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 SEHandlerCount(long setter);
    public native @Cast("ULONGLONG") long GuardCFCheckFunctionPointer(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 GuardCFCheckFunctionPointer(long setter); // VA
    public native @Cast("ULONGLONG") long Reserved2(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 Reserved2(long setter);
    public native @Cast("ULONGLONG") long GuardCFFunctionTable(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 GuardCFFunctionTable(long setter);        // VA
    public native @Cast("ULONGLONG") long GuardCFFunctionCount(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 GuardCFFunctionCount(long setter);
    public native @Cast("DWORD") int GuardFlags(); public native IMAGE_LOAD_CONFIG_DIRECTORY64 GuardFlags(int setter);
}
