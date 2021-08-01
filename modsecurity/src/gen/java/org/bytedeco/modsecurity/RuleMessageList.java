// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;

@Name("std::list<modsecurity::RuleMessage>") @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class RuleMessageList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RuleMessageList(Pointer p) { super(p); }
    public RuleMessageList()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef RuleMessageList put(@ByRef RuleMessageList x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef RuleMessage value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const RuleMessage get();
    }
}

