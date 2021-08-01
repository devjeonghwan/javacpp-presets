// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_BATTERY_STATE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_BATTERY_STATE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_BATTERY_STATE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_BATTERY_STATE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_BATTERY_STATE position(long position) {
        return (SYSTEM_BATTERY_STATE)super.position(position);
    }
    @Override public SYSTEM_BATTERY_STATE getPointer(long i) {
        return new SYSTEM_BATTERY_STATE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("BOOLEAN") boolean AcOnLine(); public native SYSTEM_BATTERY_STATE AcOnLine(boolean setter);
    public native @Cast("BOOLEAN") boolean BatteryPresent(); public native SYSTEM_BATTERY_STATE BatteryPresent(boolean setter);
    public native @Cast("BOOLEAN") boolean Charging(); public native SYSTEM_BATTERY_STATE Charging(boolean setter);
    public native @Cast("BOOLEAN") boolean Discharging(); public native SYSTEM_BATTERY_STATE Discharging(boolean setter);
    public native @Cast("BOOLEAN") boolean Spare1(int i); public native SYSTEM_BATTERY_STATE Spare1(int i, boolean setter);
    @MemberGetter public native @Cast("BOOLEAN*") BoolPointer Spare1();

    public native @Cast("BYTE") byte Tag(); public native SYSTEM_BATTERY_STATE Tag(byte setter);

    public native @Cast("DWORD") int MaxCapacity(); public native SYSTEM_BATTERY_STATE MaxCapacity(int setter);
    public native @Cast("DWORD") int RemainingCapacity(); public native SYSTEM_BATTERY_STATE RemainingCapacity(int setter);
    public native @Cast("DWORD") int Rate(); public native SYSTEM_BATTERY_STATE Rate(int setter);
    public native @Cast("DWORD") int EstimatedTime(); public native SYSTEM_BATTERY_STATE EstimatedTime(int setter);

    public native @Cast("DWORD") int DefaultAlert1(); public native SYSTEM_BATTERY_STATE DefaultAlert1(int setter);
    public native @Cast("DWORD") int DefaultAlert2(); public native SYSTEM_BATTERY_STATE DefaultAlert2(int setter);
}
