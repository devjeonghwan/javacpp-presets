// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Camera diagnostic information. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class CameraStats extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CameraStats(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CameraStats(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public CameraStats position(long position) {
            return (CameraStats)super.position(position);
        }
        @Override public CameraStats getPointer(long i) {
            return new CameraStats((Pointer)this).offsetAddress(i);
        }
    
        /* Number of dropped images in DROP_IMAGE mode */
        public native @Cast("unsigned int") int imageDropped(); public native CameraStats imageDropped(int setter);
        /* Number of corrupt images, such as missing packet, zero packet */
        public native @Cast("unsigned int") int imageCorrupt(); public native CameraStats imageCorrupt(int setter);
        /* Number of transmissions failed of camera */
        public native @Cast("unsigned int") int imageXmitFailed(); public native CameraStats imageXmitFailed(int setter);
        /* Number of images dropped in driver */
        public native @Cast("unsigned int") int imageDriverDropped(); public native CameraStats imageDriverDropped(int setter);
        /* Errors of register reading */
        public native @Cast("unsigned int") int regReadFailed(); public native CameraStats regReadFailed(int setter);
        /* Errors of register writing */
        public native @Cast("unsigned int") int regWriteFailed(); public native CameraStats regWriteFailed(int setter);
        /* Port errors */
        public native @Cast("unsigned int") int portErrors(); public native CameraStats portErrors(int setter);
        /* The value of the camera power register.
         * false: Camera is powered down.
         * true: Camera is powered up.
         */
        public native @Cast("bool") boolean cameraPowerUp(); public native CameraStats cameraPowerUp(boolean setter);

        /* The voltage values of the various voltage registers
         * supported by the camera.
         */
        public native float cameraVoltages(int i); public native CameraStats cameraVoltages(int i, float setter);
        @MemberGetter public native FloatPointer cameraVoltages();
        /** The number of voltage registers available.
         * 0: the values in cameraVoltages[] are invalid.
         */
        public native @Cast("unsigned int") int numVoltages(); public native CameraStats numVoltages(int setter);

        /* The current values of the various current registers
         * supported by the camera.
         */
        public native float cameraCurrents(int i); public native CameraStats cameraCurrents(int i, float setter);
        @MemberGetter public native FloatPointer cameraCurrents();
        /** The number of current registers available.
         * 0: the values in cameraCurrents[] are invalid.
         */
        public native @Cast("unsigned int") int numCurrents(); public native CameraStats numCurrents(int setter);
        /* The temperature of the camera board-level components. The value is
         * in kelvins (0�C = 273.15K) and are in one-tenths (0.1) of a kelvin.
         */
        public native @Cast("unsigned int") int temperature(); public native CameraStats temperature(int setter);
        /* Time in seconds since the camera was initialized. */
        public native @Cast("unsigned int") int timeSinceInitialization(); public native CameraStats timeSinceInitialization(int setter);
        /* Time in seconds since the camera detected a bus reset. */
        public native @Cast("unsigned int") int timeSinceBusReset(); public native CameraStats timeSinceBusReset(int setter);
        /* Time stamp */
        public native @ByRef TimeStamp timeStamp(); public native CameraStats timeStamp(TimeStamp setter);
        /* Number of packets requested for resend */
        public native @Cast("unsigned int") int numResendPacketsRequested(); public native CameraStats numResendPacketsRequested(int setter);
        /* Number of packet-resend packets received */
        public native @Cast("unsigned int") int numResendPacketsReceived(); public native CameraStats numResendPacketsReceived(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native CameraStats reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public CameraStats() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
