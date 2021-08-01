// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;



     /** \brief This class is presented high-level API for neural networks.
      *
      * Model allows to set params for preprocessing input image.
      * Model creates net from file with trained weights and config,
      * sets preprocessing input and runs forward pass.
      */
     @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class Model extends Pointer {
         static { Loader.load(); }
         /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
         public Model(Pointer p) { super(p); }
         /** Native array allocator. Access with {@link Pointer#position(long)}. */
         public Model(long size) { super((Pointer)null); allocateArray(size); }
         private native void allocateArray(long size);
         @Override public Model position(long position) {
             return (Model)super.position(position);
         }
         @Override public Model getPointer(long i) {
             return new Model((Pointer)this).offsetAddress(i);
         }
     
         public Model() { super((Pointer)null); allocate(); }
         @Deprecated private native void allocate();

         public Model(@Const @ByRef Model arg0) { super((Pointer)null); allocate(arg0); }
         private native void allocate(@Const @ByRef Model arg0);
         public native @ByRef @Name("operator =") Model put(@Const @ByRef Model arg0);

         /**
          * \brief Create model from deep learning network represented in one of the supported formats.
          * An order of \p model and \p config arguments does not matter.
          * @param model [in] Binary file contains trained weights.
          * @param config [in] Text file contains network configuration.
          */
         public Model(@Str BytePointer model, @Str BytePointer config/*=""*/) { super((Pointer)null); allocate(model, config); }
         private native void allocate(@Str BytePointer model, @Str BytePointer config/*=""*/);
         public Model(@Str BytePointer model) { super((Pointer)null); allocate(model); }
         private native void allocate(@Str BytePointer model);
         public Model(@Str String model, @Str String config/*=""*/) { super((Pointer)null); allocate(model, config); }
         private native void allocate(@Str String model, @Str String config/*=""*/);
         public Model(@Str String model) { super((Pointer)null); allocate(model); }
         private native void allocate(@Str String model);

         /**
          * \brief Create model from deep learning network.
          * @param network [in] Net object.
          */
         public Model(@Const @ByRef Net network) { super((Pointer)null); allocate(network); }
         private native void allocate(@Const @ByRef Net network);

         /** \brief Set input size for frame.
          *  @param size [in] New input size.
          *  \note If shape of the new blob less than 0, then frame size not change.
         */
         public native @ByRef Model setInputSize(@Const @ByRef Size size);

         /** \overload
         *  @param width [in] New input width.
         *  @param height [in] New input height.
         */
         public native @ByRef Model setInputSize(int width, int height);

         /** \brief Set mean value for frame.
          *  @param mean [in] Scalar with mean values which are subtracted from channels.
         */
         public native @ByRef Model setInputMean(@Const @ByRef Scalar mean);

         /** \brief Set scalefactor value for frame.
          *  @param scale [in] Multiplier for frame values.
         */
         public native @ByRef Model setInputScale(double scale);

         /** \brief Set flag crop for frame.
          *  @param crop [in] Flag which indicates whether image will be cropped after resize or not.
         */
         public native @ByRef Model setInputCrop(@Cast("bool") boolean crop);

         /** \brief Set flag swapRB for frame.
          *  @param swapRB [in] Flag which indicates that swap first and last channels.
         */
         public native @ByRef Model setInputSwapRB(@Cast("bool") boolean swapRB);

         /** \brief Set preprocessing parameters for frame.
         *  @param size [in] New input size.
         *  @param mean [in] Scalar with mean values which are subtracted from channels.
         *  @param scale [in] Multiplier for frame values.
         *  @param swapRB [in] Flag which indicates that swap first and last channels.
         *  @param crop [in] Flag which indicates whether image will be cropped after resize or not.
         *  blob(n, c, y, x) = scale * resize( frame(y, x, c) ) - mean(c) )
         */
         public native void setInputParams(double scale/*=1.0*/, @Const @ByRef(nullValue = "cv::Size()") Size size,
                                              @Const @ByRef(nullValue = "cv::Scalar()") Scalar mean, @Cast("bool") boolean swapRB/*=false*/, @Cast("bool") boolean crop/*=false*/);
         public native void setInputParams();

         /** \brief Given the \p input frame, create input blob, run net and return the output \p blobs.
          *  @param frame [in]  The input image.
          *  @param outs [out] Allocated output blobs, which will store results of the computation.
          */
         public native void predict(@ByVal Mat frame, @ByVal MatVector outs);
         public native void predict(@ByVal Mat frame, @ByVal UMatVector outs);
         public native void predict(@ByVal Mat frame, @ByVal GpuMatVector outs);
         public native void predict(@ByVal UMat frame, @ByVal MatVector outs);
         public native void predict(@ByVal UMat frame, @ByVal UMatVector outs);
         public native void predict(@ByVal UMat frame, @ByVal GpuMatVector outs);
         public native void predict(@ByVal GpuMat frame, @ByVal MatVector outs);
         public native void predict(@ByVal GpuMat frame, @ByVal UMatVector outs);
         public native void predict(@ByVal GpuMat frame, @ByVal GpuMatVector outs);


         // ============================== Net proxy methods ==============================
         // Never expose methods with network implementation details, like:
         // - addLayer, addLayerToPrev, connect, setInputsNames, setInputShape, setParam, getParam
         // - getLayer*, getUnconnectedOutLayers, getUnconnectedOutLayersNames, getLayersShapes
         // - forward* methods, setInput

         /** @see Net::setPreferableBackend */
         public native @ByRef Model setPreferableBackend(@Cast("cv::dnn::Backend") int backendId);
         /** @see Net::setPreferableTarget */
         public native @ByRef Model setPreferableTarget(@Cast("cv::dnn::Target") int targetId);

         public native @Deprecated @ByRef @Name("operator cv::dnn::Net&") Net asNet();

     //protected: - internal/tests usage only
         public native @ByRef Net getNetwork_();

         @Opaque public static class Impl extends Pointer {
             /** Empty constructor. Calls {@code super((Pointer)null)}. */
             public Impl() { super((Pointer)null); }
             /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
             public Impl(Pointer p) { super(p); }
         }
         public native Impl getImpl();
         public native @ByRef Impl getImplRef();
     }
