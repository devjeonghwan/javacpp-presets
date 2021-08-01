// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;

@NoOffset @Name("std::pair<arrow::Decimal256,arrow::Decimal256>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Decimal256Pair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Decimal256Pair(Pointer p) { super(p); }
    public Decimal256Pair(Decimal256 firstValue, Decimal256 secondValue) { this(); put(firstValue, secondValue); }
    public Decimal256Pair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef Decimal256Pair put(@ByRef Decimal256Pair x);


    @MemberGetter public native @ByRef Decimal256 first(); public native Decimal256Pair first(Decimal256 first);
    @MemberGetter public native @ByRef Decimal256 second();  public native Decimal256Pair second(Decimal256 second);

    public Decimal256Pair put(Decimal256 firstValue, Decimal256 secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

