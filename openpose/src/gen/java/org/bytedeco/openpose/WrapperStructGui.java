// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

    /**
     * WrapperStructGui: It controls a small GUI for quick visualization.
     */
    @Namespace("op") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class WrapperStructGui extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public WrapperStructGui(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public WrapperStructGui(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public WrapperStructGui position(long position) {
            return (WrapperStructGui)super.position(position);
        }
        @Override public WrapperStructGui getPointer(long i) {
            return new WrapperStructGui((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Display mode
         * a) -1 for automatic selection.
         * b) 0 for no display. Useful if there is no X server and/or to slightly speed up the processing if visual
         *    output is not required.
         * c) 2 for 2-D display in the OpenPose small integrated GUI.
         * d) 3 for 3-D display, if {@code --3d} was enabled.
         * e) 1 for both 2-D and 3-D display.
         */
        public native DisplayMode displayMode(); public native WrapperStructGui displayMode(DisplayMode setter);

        /**
         * Whether to add some information to the frame (number of frame, number people detected, etc.) after it is
         * saved on disk and before it is displayed and/or returned to the user.
         */
        public native @Cast("bool") boolean guiVerbose(); public native WrapperStructGui guiVerbose(boolean setter);

        /**
         * Whether to display the OpenPose small integrated GUI on fullscreen mode. It can be changed by interacting
         * with the GUI itself.
         */
        public native @Cast("bool") boolean fullScreen(); public native WrapperStructGui fullScreen(boolean setter);

        /**
         * Constructor of the struct.
         * It has the recommended and default values we recommend for each element of the struct.
         * Since all the elements of the struct are public, they can also be manually filled.
         */
        public WrapperStructGui(
                    DisplayMode displayMode/*=op::DisplayMode::NoDisplay*/, @Cast("const bool") boolean guiVerbose/*=false*/,
                    @Cast("const bool") boolean fullScreen/*=false*/) { super((Pointer)null); allocate(displayMode, guiVerbose, fullScreen); }
        private native void allocate(
                    DisplayMode displayMode/*=op::DisplayMode::NoDisplay*/, @Cast("const bool") boolean guiVerbose/*=false*/,
                    @Cast("const bool") boolean fullScreen/*=false*/);
        public WrapperStructGui() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
