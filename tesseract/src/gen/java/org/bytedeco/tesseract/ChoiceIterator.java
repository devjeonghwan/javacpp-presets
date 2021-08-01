// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


// Class to iterate over the classifier choices for a single RIL_SYMBOL.
@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class ChoiceIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChoiceIterator(Pointer p) { super(p); }

  // Construction is from a LTRResultIterator that points to the symbol of
  // interest. The ChoiceIterator allows a one-shot iteration over the
  // choices for this symbol and after that is is useless.
  public ChoiceIterator(@Const @ByRef LTRResultIterator result_it) { super((Pointer)null); allocate(result_it); }
  private native void allocate(@Const @ByRef LTRResultIterator result_it);

  // Moves to the next choice for the symbol and returns false if there
  // are none left.
  public native @Cast("bool") boolean Next();

  // ============= Accessing data ==============.

  // Returns the null terminated UTF-8 encoded text string for the current
  // choice.
  // NOTE: Unlike LTRResultIterator::GetUTF8Text, the return points to an
  // internal structure and should NOT be delete[]ed to free after use.
  public native @Cast("const char*") BytePointer GetUTF8Text();

  // Returns the confidence of the current choice depending on the used language
  // data. If only LSTM traineddata is used the value range is 0.0f - 1.0f. All
  // choices for one symbol should roughly add up to 1.0f.
  // If only traineddata of the legacy engine is used, the number should be
  // interpreted as a percent probability. (0.0f-100.0f) In this case
  // probabilities won't add up to 100. Each one stands on its own.
  public native float Confidence();
}
