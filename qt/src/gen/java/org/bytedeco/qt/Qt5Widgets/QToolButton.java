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

// Parsed from QtWidgets/qtoolbutton.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QToolButton extends QAbstractButton {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QToolButton(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QToolButton(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QToolButton position(long position) {
        return (QToolButton)super.position(position);
    }
    @Override public QToolButton getPointer(long i) {
        return new QToolButton((Pointer)this).offsetAddress(i);
    }

    /** enum QToolButton::ToolButtonPopupMode */
    public static final int
        DelayedPopup = 0,
        MenuButtonPopup = 1,
        InstantPopup = 2;
    

    public QToolButton(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QToolButton() { super((Pointer)null); allocate(); }
    private native void allocate();

    @Virtual public native @ByVal @Const({false, false, true}) QSize sizeHint();
    public native @ByVal QSize minimumSizeHint();

    public native @Cast("Qt::ToolButtonStyle") int toolButtonStyle();

    public native @Cast("Qt::ArrowType") int arrowType();
    public native void setArrowType(@Cast("Qt::ArrowType") int type);

// #if QT_CONFIG(menu)
    public native void setMenu(QMenu menu);
    public native QMenu menu();

    public native void setPopupMode(@Cast("QToolButton::ToolButtonPopupMode") int mode);
    public native @Cast("QToolButton::ToolButtonPopupMode") int popupMode();
// #endif

    public native QAction defaultAction();

    public native void setAutoRaise(@Cast("bool") boolean enable);
    public native @Cast("bool") boolean autoRaise();
// #if QT_CONFIG(menu)
    public native void showMenu();
// #endif
    public native void setToolButtonStyle(@Cast("Qt::ToolButtonStyle") int style);
    public native void setDefaultAction(QAction arg0);
    @Virtual protected native @Cast("bool") boolean event(QEvent e);
    @Virtual protected native void paintEvent(QPaintEvent arg0);

    @Virtual protected native void enterEvent(QEvent arg0);
    @Virtual protected native void leaveEvent(QEvent arg0);
    @Virtual protected native void timerEvent(QTimerEvent arg0);
    @Virtual protected native void changeEvent(QEvent arg0);
    @Virtual protected native void nextCheckState();

}
