// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;

@Name("std::map<parquet::Encoding::type,int32_t>") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class EncodingIntMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodingIntMap(Pointer p) { super(p); }
    public EncodingIntMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef EncodingIntMap put(@ByRef EncodingIntMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native int get(Encoding.type i);
    public native EncodingIntMap put(Encoding.type i, int value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter Encoding.type first();
        public native @Name("operator *().second") @MemberGetter int second();
    }
}

