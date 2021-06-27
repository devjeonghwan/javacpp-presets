// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Access to receive messages coming from XLink stream
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DataOutputQueue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataOutputQueue(Pointer p) { super(p); }

    /** Alias for callback id */
    // DataOutputQueue constructor
    public DataOutputQueue(@SharedPtr XLinkConnection conn, @StdString BytePointer streamName, @Cast("unsigned int") int maxSize/*=16*/, @Cast("bool") boolean blocking/*=true*/) { super((Pointer)null); allocate(conn, streamName, maxSize, blocking); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString BytePointer streamName, @Cast("unsigned int") int maxSize/*=16*/, @Cast("bool") boolean blocking/*=true*/);
    public DataOutputQueue(@SharedPtr XLinkConnection conn, @StdString BytePointer streamName) { super((Pointer)null); allocate(conn, streamName); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString BytePointer streamName);
    public DataOutputQueue(@SharedPtr XLinkConnection conn, @StdString String streamName, @Cast("unsigned int") int maxSize/*=16*/, @Cast("bool") boolean blocking/*=true*/) { super((Pointer)null); allocate(conn, streamName, maxSize, blocking); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString String streamName, @Cast("unsigned int") int maxSize/*=16*/, @Cast("bool") boolean blocking/*=true*/);
    public DataOutputQueue(@SharedPtr XLinkConnection conn, @StdString String streamName) { super((Pointer)null); allocate(conn, streamName); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString String streamName);

    /**
     * Sets queue behavior when full (maxSize)
     *
     * @param blocking Specifies if block or overwrite the oldest message in the queue
     */
    public native void setBlocking(@Cast("bool") boolean blocking);

    /**
     * Gets current queue behavior when full (maxSize)
     *
     * @return True if blocking, false otherwise
     */
    public native @Cast("bool") boolean getBlocking();

    /**
     * Sets queue maximum size
     *
     * @param maxSize Specifies maximum number of messages in the queue
     */
    public native void setMaxSize(@Cast("unsigned int") int maxSize);

    /**
     * Gets queue maximum size
     *
     * @return Maximum queue size
     */
    public native @Cast("unsigned int") int getMaxSize(@Cast("unsigned int") int maxSize);

    /**
     * Gets queues name
     *
     * @return Queue name
     */
    public native @StdString BytePointer getName();

    /**
     * Adds a callback on message received
     *
     * @param callback Callback function with queue name and message pointer
     * @return Callback id
     */
    public native @Cast("dai::DataOutputQueue::CallbackId") int addCallback(NameMessageCallback arg0);

    /**
     * Adds a callback on message received
     *
     * @param callback Callback function with message pointer
     * @return Callback id
     */
    public native @Cast("dai::DataOutputQueue::CallbackId") int addCallback(MessageCallback arg0);

    /**
     * Adds a callback on message received
     *
     * @param callback Callback function without any parameters
     * @return Callback id
     */
    public native @Cast("dai::DataOutputQueue::CallbackId") int addCallback(Callback callback);

    /**
     * Removes a callback
     *
     * @param callbackId Id of callback to be removed
     * @return True if callback was removed, false otherwise
     */
    public native @Cast("bool") boolean removeCallback(@Cast("dai::DataOutputQueue::CallbackId") int callbackId);

    /**
     * Check whether front of the queue has message of type T
     * @return True if queue isn't empty and the first element is of type T, false otherwise
     */
    public native @Cast("bool") boolean has();
    public native @Name("has<dai::ImgFrame>") @Cast("bool") boolean hasImgFrame();
    public native @Name("has<dai::IMUData>") @Cast("bool") boolean hasIMUData();
    public native @Name("has<dai::SpatialLocationCalculatorConfig>") @Cast("bool") boolean hasSpatialLocationCalculatorConfig();
    public native @Name("has<dai::ImgDetections>") @Cast("bool") boolean hasImgDetections();
    public native @Name("has<dai::NNData>") @Cast("bool") boolean hasNNData();
    public native @Name("has<dai::Tracklets>") @Cast("bool") boolean hasTracklets();
    public native @Name("has<dai::SpatialImgDetections>") @Cast("bool") boolean hasSpatialImgDetections();
    public native @Name("has<dai::SpatialLocationCalculatorData>") @Cast("bool") boolean hasSpatialLocationCalculatorData();
    public native @Name("has<dai::SystemInformation>") @Cast("bool") boolean hasSystemInformation();

    /**
     * Check whether front of the queue has a message (isn't empty)
     * @return True if queue isn't empty, false otherwise
     */

    /**
     * Try to retrieve message T from queue. If message isn't of type T it returns nullptr
     *
     * @return Message of type T or nullptr if no message available
     */
    public native @SharedPtr @ByVal ADatatype tryGet();
    public native @Name("tryGet<dai::ADatatype>") void tryGetVoid();
    public native @Name("tryGet<dai::ImgFrame>") @SharedPtr ImgFrame tryGetImgFrame();
    public native @Name("tryGet<dai::IMUData>") @SharedPtr IMUData tryGetIMUData();
    public native @Name("tryGet<dai::SpatialLocationCalculatorConfig>") @SharedPtr SpatialLocationCalculatorConfig tryGetSpatialLocationCalculatorConfig();
    public native @Name("tryGet<dai::ImgDetections>") @SharedPtr ImgDetections tryGetImgDetections();
    public native @Name("tryGet<dai::NNData>") @SharedPtr NNData tryGetNNData();
    public native @Name("tryGet<dai::Tracklets>") @SharedPtr Tracklets tryGetTracklets();
    public native @Name("tryGet<dai::SpatialImgDetections>") @SharedPtr SpatialImgDetections tryGetSpatialImgDetections();
    public native @Name("tryGet<dai::SpatialLocationCalculatorData>") @SharedPtr SpatialLocationCalculatorData tryGetSpatialLocationCalculatorData();
    public native @Name("tryGet<dai::SystemInformation>") @SharedPtr SystemInformation tryGetSystemInformation();

    /**
     * Try to retrieve message from queue. If no message available, return immidiately with nullptr
     *
     * @return Message or nullptr if no message available
     */

    /**
     * Block until a message is available.
     *
     * @return Message of type T or nullptr if no message available
     */
    public native @SharedPtr @ByVal ADatatype get();
    public native @Name("get<dai::ADatatype>") void getVoid();
    public native @Name("get<dai::ImgFrame>") @SharedPtr ImgFrame getImgFrame();
    public native @Name("get<dai::IMUData>") @SharedPtr IMUData getIMUData();
    public native @Name("get<dai::SpatialLocationCalculatorConfig>") @SharedPtr SpatialLocationCalculatorConfig getSpatialLocationCalculatorConfig();
    public native @Name("get<dai::ImgDetections>") @SharedPtr ImgDetections getImgDetections();
    public native @Name("get<dai::NNData>") @SharedPtr NNData getNNData();
    public native @Name("get<dai::Tracklets>") @SharedPtr Tracklets getTracklets();
    public native @Name("get<dai::SpatialImgDetections>") @SharedPtr SpatialImgDetections getSpatialImgDetections();
    public native @Name("get<dai::SpatialLocationCalculatorData>") @SharedPtr SpatialLocationCalculatorData getSpatialLocationCalculatorData();
    public native @Name("get<dai::SystemInformation>") @SharedPtr SystemInformation getSystemInformation();

    /**
     * Block until a message is available.
     *
     * @return Message or nullptr if no message available
     */

    /**
     * Gets first message in the queue.
     *
     * @return Message of type T or nullptr if no message available
     */
    public native @SharedPtr @ByVal ADatatype front();
    public native @Name("front<dai::ADatatype>") void frontVoid();
    public native @Name("front<dai::ImgFrame>") @SharedPtr ImgFrame frontImgFrame();
    public native @Name("front<dai::IMUData>") @SharedPtr IMUData frontIMUData();
    public native @Name("front<dai::SpatialLocationCalculatorConfig>") @SharedPtr SpatialLocationCalculatorConfig frontSpatialLocationCalculatorConfig();
    public native @Name("front<dai::ImgDetections>") @SharedPtr ImgDetections frontImgDetections();
    public native @Name("front<dai::NNData>") @SharedPtr NNData frontNNData();
    public native @Name("front<dai::Tracklets>") @SharedPtr Tracklets frontTracklets();
    public native @Name("front<dai::SpatialImgDetections>") @SharedPtr SpatialImgDetections frontSpatialImgDetections();
    public native @Name("front<dai::SpatialLocationCalculatorData>") @SharedPtr SpatialLocationCalculatorData frontSpatialLocationCalculatorData();
    public native @Name("front<dai::SystemInformation>") @SharedPtr SystemInformation frontSystemInformation();

    /**
     * Gets first message in the queue.
     *
     * @return Message or nullptr if no message available
     */

    /**
     * Block until a message is available with a timeout.
     *
     * @param timeout Duration for which the function should block
     * @param hasTimedout [out] Outputs true if timeout occured, false otherwise
     * @return Message of type T otherwise nullptr if message isn't type T or timeout occured
     */

    /**
     * Block until a message is available with a timeout.
     *
     * @param timeout Duration for which the function should block
     * @param hasTimedout [out] Outputs true if timeout occured, false otherwise
     * @return Message of type T otherwise nullptr if message isn't type T or timeout occured
     */

    /**
     * Try to retrieve all messages in the queue.
     *
     * @return Vector of messages which can either be of type T or nullptr
     */

    /**
     * Try to retrieve all messages in the queue.
     *
     * @return Vector of messages
     */
    public native @ByVal ADatatypeVector tryGetAll();

    /**
     * Block until at least one message in the queue.
     * Then return all messages from the queue.
     *
     * @return Vector of messages which can either be of type T or nullptr
     */

    /**
     * Block until at least one message in the queue.
     * Then return all messages from the queue.
     *
     * @return Vector of messages
     */
    public native @ByVal ADatatypeVector getAll();

    /**
     * Block for maximum timeout duration.
     * Then return all messages from the queue.
     * @param timeout Maximum duration to block
     * @param hasTimedout [out] Outputs true if timeout occured, false otherwise
     * @return Vector of messages which can either be of type T or nullptr
     */

    /**
     * Block for maximum timeout duration.
     * Then return all messages from the queue.
     * @param timeout Maximum duration to block
     * @param hasTimedout [out] Outputs true if timeout occured, false otherwise
     * @return Vector of messages
     */
}
