// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_time_datetime_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_time_datetime_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_time_datetime_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_time_datetime_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_time_datetime_t position(long position) {
        return (sk_time_datetime_t)super.position(position);
    }
    @Override public sk_time_datetime_t getPointer(long i) {
        return new sk_time_datetime_t((Pointer)this).offsetAddress(i);
    }

    public native short fTimeZoneMinutes(); public native sk_time_datetime_t fTimeZoneMinutes(short setter);
    public native @Cast("uint16_t") short fYear(); public native sk_time_datetime_t fYear(short setter);
    public native @Cast("uint8_t") byte fMonth(); public native sk_time_datetime_t fMonth(byte setter);
    public native @Cast("uint8_t") byte fDayOfWeek(); public native sk_time_datetime_t fDayOfWeek(byte setter);
    public native @Cast("uint8_t") byte fDay(); public native sk_time_datetime_t fDay(byte setter);
    public native @Cast("uint8_t") byte fHour(); public native sk_time_datetime_t fHour(byte setter);
    public native @Cast("uint8_t") byte fMinute(); public native sk_time_datetime_t fMinute(byte setter);
    public native @Cast("uint8_t") byte fSecond(); public native sk_time_datetime_t fSecond(byte setter);
}
