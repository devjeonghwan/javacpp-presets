// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qlineedit.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QLineEdit extends QWidget {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QLineEdit(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QLineEdit(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QLineEdit position(long position) {
        return (QLineEdit)super.position(position);
    }
    @Override public QLineEdit getPointer(long i) {
        return new QLineEdit((Pointer)this).offsetAddress(i);
    }

    /** enum QLineEdit::ActionPosition */
    public static final int
        LeadingPosition = 0,
        TrailingPosition = 1;
    

    public QLineEdit(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QLineEdit() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QLineEdit(@Const @ByRef QString arg0, QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(arg0, parent); }
    private native void allocate(@Const @ByRef QString arg0, QWidget parent/*=nullptr*/);
    public QLineEdit(@Const @ByRef QString arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef QString arg0);

    public native @ByVal QString text();

    public native @ByVal QString displayText();

    public native @ByVal QString placeholderText();
    public native void setPlaceholderText(@Const @ByRef QString arg0);

    public native int maxLength();
    public native void setMaxLength(int arg0);

    public native void setFrame(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean hasFrame();

    public native void setClearButtonEnabled(@Cast("bool") boolean enable);
    public native @Cast("bool") boolean isClearButtonEnabled();

    /** enum QLineEdit::EchoMode */
    public static final int Normal = 0, NoEcho = 1, Password = 2, PasswordEchoOnEdit = 3;
    
    public native @Cast("QLineEdit::EchoMode") int echoMode();
    public native void setEchoMode(@Cast("QLineEdit::EchoMode") int arg0);

    public native @Cast("bool") boolean isReadOnly();
    public native void setReadOnly(@Cast("bool") boolean arg0);

// #ifndef QT_NO_VALIDATOR
// #endif

// #if QT_CONFIG(completer)
// #endif

    public native @ByVal QSize sizeHint();
    public native @ByVal QSize minimumSizeHint();

    public native int cursorPosition();
    public native void setCursorPosition(int arg0);

    public native void setAlignment(@ByVal @Cast("Qt::Alignment") int flag);
    public native @ByVal @Cast("Qt::Alignment") int alignment();

    public native void cursorForward(@Cast("bool") boolean mark, int steps/*=1*/);
    public native void cursorForward(@Cast("bool") boolean mark);
    public native void cursorBackward(@Cast("bool") boolean mark, int steps/*=1*/);
    public native void cursorBackward(@Cast("bool") boolean mark);
    public native void cursorWordForward(@Cast("bool") boolean mark);
    public native void cursorWordBackward(@Cast("bool") boolean mark);
    public native void backspace();
    public native void del();
    public native void home(@Cast("bool") boolean mark);
    public native void end(@Cast("bool") boolean mark);

    public native @Cast("bool") boolean isModified();
    public native void setModified(@Cast("bool") boolean arg0);

    public native void setSelection(int arg0, int arg1);
    public native @Cast("bool") boolean hasSelectedText();
    public native @ByVal QString selectedText();
    public native int selectionStart();
    public native int selectionEnd();
    public native int selectionLength();

    public native @Cast("bool") boolean isUndoAvailable();
    public native @Cast("bool") boolean isRedoAvailable();

    public native void setDragEnabled(@Cast("bool") boolean b);
    public native @Cast("bool") boolean dragEnabled();

    public native void setCursorMoveStyle(@Cast("Qt::CursorMoveStyle") int style);
    public native @Cast("Qt::CursorMoveStyle") int cursorMoveStyle();

    public native @ByVal QString inputMask();
    public native void setInputMask(@Const @ByRef QString inputMask);
    public native @Cast("bool") boolean hasAcceptableInput();

    public native void setTextMargins(int left, int top, int right, int bottom);
// #if QT_DEPRECATED_SINCE(5, 14)
    public native void getTextMargins(IntPointer left, IntPointer top, IntPointer right, IntPointer bottom);
    public native void getTextMargins(IntBuffer left, IntBuffer top, IntBuffer right, IntBuffer bottom);
    public native void getTextMargins(int[] left, int[] top, int[] right, int[] bottom);
// #endif
    public native void setText(@Const @ByRef QString arg0);
    public native void clear();
    public native void selectAll();
    public native void undo();
    public native void redo();
// #ifndef QT_NO_CLIPBOARD
    public native void cut();
    public native void copy();
    public native void paste();
    public native void deselect();
    public native void insert(@Const @ByRef QString arg0);
// #ifndef QT_NO_CONTEXTMENU
    public native QMenu createStandardContextMenu();
    @Virtual protected native void paintEvent(QPaintEvent arg0);
    @Virtual protected native void changeEvent(QEvent arg0);
    public native @ByVal QVariant inputMethodQuery(@Cast("Qt::InputMethodQuery") int arg0);
    public native @ByVal QVariant inputMethodQuery(@Cast("Qt::InputMethodQuery") int property, @ByVal QVariant argument);
    @Virtual public native @Cast("bool") boolean event(QEvent arg0);
}
