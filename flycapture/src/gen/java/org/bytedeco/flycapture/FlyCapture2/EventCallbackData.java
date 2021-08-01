// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;



    /* Callback data passed to the callback function provided when using
     * RegisterEvent() or RegisterAllEvents().
     */
    @Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class EventCallbackData extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public EventCallbackData() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public EventCallbackData(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public EventCallbackData(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public EventCallbackData position(long position) {
            return (EventCallbackData)super.position(position);
        }
        @Override public EventCallbackData getPointer(long i) {
            return new EventCallbackData((Pointer)this).offsetAddress(i);
        }
    
        /** Pointer to the user-supplied data struct */
        public native Pointer EventUserData(); public native EventCallbackData EventUserData(Pointer setter);

        /** Size of the user data data supplied to the RegisterEvent()
         * function.
         */
        public native @Cast("size_t") long EventUserDataSize(); public native EventCallbackData EventUserDataSize(long setter);

        /** The event name used to register the event. Provided so the user
         * knows which event triggered the callback.
         */
        public native @Cast("const char*") BytePointer EventName(); public native EventCallbackData EventName(BytePointer setter);

        /** The device register which EventName maps to. Provides an alternate
         * means of indexing into different event types.
         */
        public native @Cast("long long unsigned") long EventID(); public native EventCallbackData EventID(long setter);

        /** Timestamp indicated the time (as reported by the camera) at which
         * the camera exposure operation completed. This can be compared with
         * image stimestamps if there is a need to map event timestamps to
         * specific images, if applicable.
         */
        public native @Cast("long long unsigned") long EventTimestamp(); public native EventCallbackData EventTimestamp(long setter);

        /** A pointer to additional data pertaining to the event which just
         * trigger the callback function. The data may be of difference sizes
         * or may not even be allocated, depending on the type of event which
         * triggered the callback.
         */
        public native Pointer EventData(); public native EventCallbackData EventData(Pointer setter);

        /** The size of the structure pointed to by EventData. This value should
         * be checked, especially if there are events which can trigger variable-
         * length event data to be returned to the user when the callback function
         * is issued.
         */
        public native @Cast("size_t") long EventDataSize(); public native EventCallbackData EventDataSize(long setter);
    }
