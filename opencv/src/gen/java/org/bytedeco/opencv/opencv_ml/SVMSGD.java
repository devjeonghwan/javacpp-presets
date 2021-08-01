// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;



/****************************************************************************************\
*                        Stochastic Gradient Descent SVM Classifier                      *
\****************************************************************************************/

/**
\brief Stochastic Gradient Descent SVM classifier
<p>
SVMSGD provides a fast and easy-to-use implementation of the SVM classifier using the Stochastic Gradient Descent approach,
as presented in \cite bottou2010large.
<p>
The classifier has following parameters:
- model type,
- margin type,
- margin regularization ({@code \lambda}),
- initial step size ({@code \gamma_0}),
- step decreasing power ({@code c}),
- and termination criteria.
<p>
The model type may have one of the following values: \ref SGD and \ref ASGD.
<p>
- \ref SGD is the classic version of SVMSGD classifier: every next step is calculated by the formula
  <pre>{@code \[w_{t+1} = w_t - \gamma(t) \frac{dQ_i}{dw} |_{w = w_t}\]}</pre>
  where
  - {@code w_t} is the weights vector for decision function at step {@code t},
  - {@code \gamma(t)} is the step size of model parameters at the iteration {@code t}, it is decreased on each step by the formula
    {@code \gamma(t) = \gamma_0  (1 + \lambda  \gamma_0 t) ^ {-c}}
  - {@code Q_i} is the target functional from SVM task for sample with number {@code i}, this sample is chosen stochastically on each step of the algorithm.
<p>
- \ref ASGD is Average Stochastic Gradient Descent SVM Classifier. ASGD classifier averages weights vector on each step of algorithm by the formula
{@code \widehat{w}_{t+1} = \frac{t}{1+t}\widehat{w}_{t} + \frac{1}{1+t}w_{t+1}}
<p>
The recommended model type is ASGD (following \cite bottou2010large).
<p>
The margin type may have one of the following values: \ref SOFT_MARGIN or \ref HARD_MARGIN.
<p>
- You should use \ref HARD_MARGIN type, if you have linearly separable sets.
- You should use \ref SOFT_MARGIN type, if you have non-linearly separable sets or sets with outliers.
- In the general case (if you know nothing about linear separability of your sets), use SOFT_MARGIN.
<p>
The other parameters may be described as follows:
- Margin regularization parameter is responsible for weights decreasing at each step and for the strength of restrictions on outliers
  (the less the parameter, the less probability that an outlier will be ignored).
  Recommended value for SGD model is 0.0001, for ASGD model is 0.00001.
<p>
- Initial step size parameter is the initial value for the step size {@code \gamma(t)}.
  You will have to find the best initial step for your problem.
<p>
- Step decreasing power is the power parameter for {@code \gamma(t)} decreasing by the formula, mentioned above.
  Recommended value for SGD model is 1, for ASGD model is 0.75.
<p>
- Termination criteria can be TermCriteria::COUNT, TermCriteria::EPS or TermCriteria::COUNT + TermCriteria::EPS.
  You will have to find the best termination criteria for your problem.
<p>
Note that the parameters margin regularization, initial step size, and step decreasing power should be positive.
<p>
To use SVMSGD algorithm do as follows:
<p>
- first, create the SVMSGD object. The algorithm will set optimal parameters by default, but you can set your own parameters via functions setSvmsgdType(),
  setMarginType(), setMarginRegularization(), setInitialStepSize(), and setStepDecreasingPower().
<p>
- then the SVM model can be trained using the train features and the correspondent labels by the method train().
<p>
- after that, the label of a new feature vector can be predicted using the method predict().
<p>
<pre>{@code
// Create empty object
cv::Ptr<SVMSGD> svmsgd = SVMSGD::create();

// Train the Stochastic Gradient Descent SVM
svmsgd->train(trainData);

// Predict labels for the new samples
svmsgd->predict(samples, responses);
}</pre>
<p>
*/

@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class SVMSGD extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SVMSGD(Pointer p) { super(p); }


    /** SVMSGD type.
    ASGD is often the preferable choice. */
    /** enum cv::ml::SVMSGD::SvmsgdType */
    public static final int
        /** Stochastic Gradient Descent */
        SGD = 0,
        /** Average Stochastic Gradient Descent */
        ASGD = 1;

    /** Margin type.*/
    /** enum cv::ml::SVMSGD::MarginType */
    public static final int
        /** General case, suits to the case of non-linearly separable sets, allows outliers. */
        SOFT_MARGIN = 0,
        /** More accurate for the case of linearly separable sets. */
        HARD_MARGIN = 1;

    /**
     * @return the weights of the trained model (decision function f(x) = weights * x + shift).
    */
    public native @ByVal Mat getWeights();

    /**
     * @return the shift of the trained model (decision function f(x) = weights * x + shift).
    */
    public native float getShift();

    /** \brief Creates empty model.
     * Use StatModel::train to train the model. Since %SVMSGD has several parameters, you may want to
     * find the best parameters for your problem or use setOptimalParameters() to set some default parameters.
    */
    public static native @Ptr SVMSGD create();

    /** \brief Loads and creates a serialized SVMSGD from a file
     *
     * Use SVMSGD::save to serialize and store an SVMSGD to disk.
     * Load the SVMSGD from this file again, by calling this function with the path to the file.
     * Optionally specify the node for the file containing the classifier
     *
     * @param filepath path to serialized SVMSGD
     * @param nodeName name of node containing the classifier
     */
    public static native @Ptr SVMSGD load(@Str BytePointer filepath, @Str BytePointer nodeName/*=cv::String()*/);
    public static native @Ptr SVMSGD load(@Str BytePointer filepath);
    public static native @Ptr SVMSGD load(@Str String filepath, @Str String nodeName/*=cv::String()*/);
    public static native @Ptr SVMSGD load(@Str String filepath);

    /** \brief Function sets optimal parameters values for chosen SVM SGD model.
     * @param svmsgdType is the type of SVMSGD classifier.
     * @param marginType is the type of margin constraint.
    */
    public native void setOptimalParameters(int svmsgdType/*=cv::ml::SVMSGD::ASGD*/, int marginType/*=cv::ml::SVMSGD::SOFT_MARGIN*/);
    public native void setOptimalParameters();

    /** \brief %Algorithm type, one of SVMSGD::SvmsgdType. */
    /** @see setSvmsgdType */
    public native int getSvmsgdType();
    /** \copybrief getSvmsgdType @see getSvmsgdType */
    public native void setSvmsgdType(int svmsgdType);

    /** \brief %Margin type, one of SVMSGD::MarginType. */
    /** @see setMarginType */
    public native int getMarginType();
    /** \copybrief getMarginType @see getMarginType */
    public native void setMarginType(int marginType);

    /** \brief Parameter marginRegularization of a %SVMSGD optimization problem. */
    /** @see setMarginRegularization */
    public native float getMarginRegularization();
    /** \copybrief getMarginRegularization @see getMarginRegularization */
    public native void setMarginRegularization(float marginRegularization);

    /** \brief Parameter initialStepSize of a %SVMSGD optimization problem. */
    /** @see setInitialStepSize */
    public native float getInitialStepSize();
    /** \copybrief getInitialStepSize @see getInitialStepSize */
    public native void setInitialStepSize(float InitialStepSize);

    /** \brief Parameter stepDecreasingPower of a %SVMSGD optimization problem. */
    /** @see setStepDecreasingPower */
    public native float getStepDecreasingPower();
    /** \copybrief getStepDecreasingPower @see getStepDecreasingPower */
    public native void setStepDecreasingPower(float stepDecreasingPower);

    /** \brief Termination criteria of the training algorithm.
    You can specify the maximum number of iterations (maxCount) and/or how much the error could
    change between the iterations to make the algorithm continue (epsilon).*/
    /** @see setTermCriteria */
    public native @ByVal TermCriteria getTermCriteria();
    /** \copybrief getTermCriteria @see getTermCriteria */
    public native void setTermCriteria(@Const @ByRef TermCriteria val);
}
