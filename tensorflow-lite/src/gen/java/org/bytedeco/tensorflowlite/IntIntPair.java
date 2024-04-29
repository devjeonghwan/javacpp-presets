// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@NoOffset @Name("std::pair<int32_t,int32_t>") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class IntIntPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntPair(Pointer p) { super(p); }
    public IntIntPair(int firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public IntIntPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef IntIntPair put(@ByRef IntIntPair x);


    @MemberGetter public native int first(); public native IntIntPair first(int first);
    @MemberGetter public native int second();  public native IntIntPair second(int second);

    public IntIntPair put(int firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

