// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IRNNv2Layer
 * 
 *  \brief An RNN layer in a network definition, version 2.
 * 
 *  This layer supersedes IRNNLayer.
 * 
 *  @deprecated IRNNv2Layer will be removed in TensorRT 9.0, use INetworkDefinition::addLoop instead.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRNNv2Layer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRNNv2Layer(Pointer p) { super(p); }

    /** Get the layer count of the RNN. */
    public native @NoException(true) int getLayerCount();
    /** Get the hidden size of the RNN. */
    public native @NoException(true) int getHiddenSize();
    /** Get the maximum sequence length of the RNN. */
    public native @NoException(true) int getMaxSeqLength();
    /** Get the maximum data length of the RNN.
    <p>
    //!
    //!
    //!
    //!
    //!
    //! */
    public native @NoException(true) int getDataLength();

    /**
     *  \brief Specify individual sequence lengths in the batch with the ITensor pointed to by
     *  \p seqLengths.
     * 
     *  The \p seqLengths ITensor should be a {N1, ..., Np} tensor, where N1..Np are the index dimensions
     *  of the input tensor to the RNN.
     * 
     *  If this is not specified, then the RNN layer assumes all sequences are size getMaxSeqLength().
     * 
     *  All sequence lengths in \p seqLengths should be in the range [1, getMaxSeqLength()].  Zero-length
     *  sequences are not supported.
     * 
     *  This tensor must be of type DataType::kINT32.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setSequenceLengths(@ByRef ITensor seqLengths);

    /**
     *  \brief Get the sequence lengths specified for the RNN.
     * 
     *  @return nullptr if no sequence lengths were specified, the sequence length data otherwise.
     * 
     *  @see setSequenceLengths()
     *  */
    
    
    //!
    //!
    public native @NoException(true) ITensor getSequenceLengths();

    /**
     *  \brief Set the operation of the RNN layer.
     *  @see getOperation(), RNNOperation
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setOperation(RNNOperation op);
    public native @NoException(true) void setOperation(@Cast("nvinfer1::RNNOperation") int op);

    /**
     *  \brief Get the operation of the RNN layer.
     *  @see setOperation(), RNNOperation
     *  */
    
    
    //!
    //!
    public native @NoException(true) RNNOperation getOperation();

    /**
     *  \brief Set the input mode of the RNN layer.
     *  @see getInputMode(), RNNInputMode
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setInputMode(RNNInputMode op);
    public native @NoException(true) void setInputMode(@Cast("nvinfer1::RNNInputMode") int op);

    /**
     *  \brief Get the input mode of the RNN layer.
     *  @see setInputMode(), RNNInputMode
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) RNNInputMode getInputMode();

    /**
     *  \brief Set the direction of the RNN layer.
     * 
     *  The direction determines if the RNN is run as a unidirectional(left to right) or
     *  bidirectional(left to right and right to left).
     *  In the ::kBIDIRECTION case the output is concatenated together, resulting
     *  in output size of 2x getHiddenSize().
     * 
     *  @see getDirection(), RNNDirection
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setDirection(RNNDirection op);
    public native @NoException(true) void setDirection(@Cast("nvinfer1::RNNDirection") int op);

    /**
     *  \brief Get the direction of the RNN layer.
     *  @see setDirection(), RNNDirection
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) RNNDirection getDirection();

    /**
     *  \brief Set the weight parameters for an individual gate in the RNN.
     * 
     *  The #DataType for this structure must be ::kFLOAT or ::kHALF, and must be the same
     *  datatype as the input tensor.
     * 
     *  Each parameter matrix is row-major in memory, and has the following dimensions:
     * 
     *  ~~~
     *      Let K := { ::kUNIDIRECTION => 1
     *               { ::kBIDIRECTION => 2
     *          l := layer index (as described above)
     *          H := getHiddenSize()
     *          E := getDataLength() (the embedding length)
     *          isW := true if the matrix is an input (W) matrix, and false if
     *                 the matrix is a recurrent input (R) matrix.
     * 
     *     if isW:
     *        if l < K and ::kSKIP:
     *           (numRows, numCols) := (0, 0) # input matrix is skipped
     *        elif l < K and ::kLINEAR:
     *           (numRows, numCols) := (H, E) # input matrix acts on input data size E
     *        elif l >= K:
     *           (numRows, numCols) := (H, K * H) # input matrix acts on previous hidden state
     *     else: # not isW
     *        (numRows, numCols) := (H, H)
     *  ~~~
     * 
     *  In other words, the input weights of the first layer of the RNN (if
     *  not skipped) transform a {@code getDataLength()}-size column
     *  vector into a {@code getHiddenSize()}-size column vector.  The input
     *  weights of subsequent layers transform a {@code K*getHiddenSize()}-size
     *  column vector into a {@code getHiddenSize()}-size column vector.  {@code K=2} in
     *  the bidirectional case to account for the full hidden state being
     *  the concatenation of the forward and backward RNN hidden states.
     * 
     *  The recurrent weight matrices for all layers all have shape {@code (H, H)},
     *  both in the unidirectional and bidirectional cases.  (In the
     *  bidirectional case, each recurrent weight matrix for the (forward or
     *  backward) RNN cell operates on the previous (forward or
     *  backward) RNN cell's hidden state, which is size {@code H}).
     * 
     *  @param layerIndex The index of the layer that contains this gate.  See the section
     *  @param gate The name of the gate within the RNN layer.  The gate name must correspond
     *         to one of the gates used by this layer's #RNNOperation.
     *  @param isW True if the weight parameters are for the input matrix W[g]
     *         and false if they are for the recurrent input matrix R[g].  See
     *         #RNNOperation for equations showing how these matrices are used
     *         in the RNN gate.
     *  @param weights The weight structure holding the weight parameters, which are stored
     *         as a row-major 2D matrix.  See \ref setRNNWeightsLayout "the layout of elements within a weight matrix"
     *         in IRNNLayer::setWeights() for documentation on the expected
     *         dimensions of this matrix.
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setWeightsForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW, @ByVal Weights weights);
    public native @NoException(true) void setWeightsForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW, @ByVal Weights weights);

    /**
     *  \brief Get the weight parameters for an individual gate in the RNN.
     *  @see setWeightsForGate()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getWeightsForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW);
    public native @ByVal @NoException(true) Weights getWeightsForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW);

    /**
     *  \brief Set the bias parameters for an individual gate in the RNN.
     * 
     *  The #DataType for this structure must be ::kFLOAT or ::kHALF, and must be the same
     *  datatype as the input tensor.
     * 
     *  Each bias vector has a fixed size, getHiddenSize().
     * 
     *  @param layerIndex The index of the layer that contains this gate.  See the section
     *         \ref setRNNWeightsOrder "Order of weight matrices" in IRNNLayer::setWeights()
     *         for a description of the layer index.
     *  @param gate The name of the gate within the RNN layer.  The gate name must correspond
     *         to one of the gates used by this layer's #RNNOperation.
     *  @param isW True if the bias parameters are for the input bias Wb[g]
     *         and false if they are for the recurrent input bias Rb[g].  See
     *         #RNNOperation for equations showing how these bias vectors are used
     *         in the RNN gate.
     *  @param bias The weight structure holding the bias parameters, which should be an
     *         array of size getHiddenSize().
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setBiasForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW, @ByVal Weights bias);
    public native @NoException(true) void setBiasForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW, @ByVal Weights bias);

    /**
     *  \brief Get the bias parameters for an individual gate in the RNN.
     *  @see setBiasForGate()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Weights getBiasForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW);
    public native @ByVal @NoException(true) Weights getBiasForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW);

    /**
     *  \brief Set the initial hidden state of the RNN with the provided \p hidden ITensor.
     * 
     *  The \p hidden ITensor should have the dimensions {@code {N1, ..., Np, L, H}}, where:
     * 
     *   - {@code N1..Np} are the index dimensions specified by the input tensor
     *   - {@code L} is the number of layers in the RNN, equal to getLayerCount() if getDirection is ::kUNIDIRECTION,
     *      and 2x getLayerCount() if getDirection is ::kBIDIRECTION. In the bi-directional
     *      case, layer {@code l}'s final forward hidden state is stored in {@code L = 2*l}, and
     *      final backward hidden state is stored in {@code L= 2*l + 1}.
     *   - {@code H} is the hidden state for each layer, equal to getHiddenSize().
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setHiddenState(@ByRef ITensor hidden);

    /**
     *  \brief Get the initial hidden state of the RNN.
     *  @see setHiddenState()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) ITensor getHiddenState();

    /**
     *  \brief Set the initial cell state of the LSTM with the provided \p cell ITensor.
     * 
     *  The \p cell ITensor should have the dimensions {@code {N1, ..., Np, L, H}}, where:
     * 
     *   - {@code N1..Np} are the index dimensions specified by the input tensor
     *   - {@code L} is the number of layers in the RNN, equal to getLayerCount() if getDirection is ::kUNIDIRECTION,
     *      and 2x getLayerCount() if getDirection is ::kBIDIRECTION. In the bi-directional
     *      case, layer {@code l}'s final forward hidden state is stored in {@code L = 2*l}, and
     *      final backward hidden state is stored in {@code L= 2*l + 1}.
     *   - {@code H} is the hidden state for each layer, equal to getHiddenSize().
     * 
     *  It is an error to call setCellState() on an RNN layer that is not configured with RNNOperation::kLSTM.
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setCellState(@ByRef ITensor cell);

    /**
     *  \brief Get the initial cell state of the RNN.
     *  @see setCellState()
     *  */
    public native @NoException(true) ITensor getCellState();
}
