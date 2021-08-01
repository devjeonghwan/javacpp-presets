// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CREATE_PROCESS_DEBUG_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CREATE_PROCESS_DEBUG_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CREATE_PROCESS_DEBUG_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CREATE_PROCESS_DEBUG_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CREATE_PROCESS_DEBUG_INFO position(long position) {
        return (CREATE_PROCESS_DEBUG_INFO)super.position(position);
    }
    @Override public CREATE_PROCESS_DEBUG_INFO getPointer(long i) {
        return new CREATE_PROCESS_DEBUG_INFO((Pointer)this).offsetAddress(i);
    }

    public native @Cast("HANDLE") Pointer hFile(); public native CREATE_PROCESS_DEBUG_INFO hFile(Pointer setter);
    public native @Cast("HANDLE") Pointer hProcess(); public native CREATE_PROCESS_DEBUG_INFO hProcess(Pointer setter);
    public native @Cast("HANDLE") Pointer hThread(); public native CREATE_PROCESS_DEBUG_INFO hThread(Pointer setter);
    public native @Cast("LPVOID") Pointer lpBaseOfImage(); public native CREATE_PROCESS_DEBUG_INFO lpBaseOfImage(Pointer setter);
    public native @Cast("DWORD") int dwDebugInfoFileOffset(); public native CREATE_PROCESS_DEBUG_INFO dwDebugInfoFileOffset(int setter);
    public native @Cast("DWORD") int nDebugInfoSize(); public native CREATE_PROCESS_DEBUG_INFO nDebugInfoSize(int setter);
    public native @Cast("LPVOID") Pointer lpThreadLocalBase(); public native CREATE_PROCESS_DEBUG_INFO lpThreadLocalBase(Pointer setter);
    public native @Cast("LPTHREAD_START_ROUTINE") PTHREAD_START_ROUTINE lpStartAddress(); public native CREATE_PROCESS_DEBUG_INFO lpStartAddress(PTHREAD_START_ROUTINE setter);
    public native @Cast("LPVOID") Pointer lpImageName(); public native CREATE_PROCESS_DEBUG_INFO lpImageName(Pointer setter);
    public native @Cast("WORD") short fUnicode(); public native CREATE_PROCESS_DEBUG_INFO fUnicode(short setter);
}
