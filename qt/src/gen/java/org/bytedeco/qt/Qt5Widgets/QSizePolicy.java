// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

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

// Parsed from QtWidgets/qsizepolicy.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QSizePolicy extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QSizePolicy(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QSizePolicy(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QSizePolicy position(long position) {
        return (QSizePolicy)super.position(position);
    }
    @Override public QSizePolicy getPointer(long i) {
        return new QSizePolicy(this).position(position + i);
    }

    /** enum QSizePolicy::PolicyFlag */
    public static final int
        GrowFlag = 1,
        ExpandFlag = 2,
        ShrinkFlag = 4,
        IgnoreFlag = 8;

    /** enum QSizePolicy::Policy */
    public static final int
        Fixed = 0,
        Minimum = GrowFlag,
        Maximum = ShrinkFlag,
        Preferred = GrowFlag | ShrinkFlag,
        MinimumExpanding = GrowFlag | ExpandFlag,
        Expanding = GrowFlag | ShrinkFlag | ExpandFlag,
        Ignored = ShrinkFlag | GrowFlag | IgnoreFlag;
    

    public enum ControlType {
        DefaultType     (0x00000001),
        ButtonBox       (0x00000002),
        CheckBox        (0x00000004),
        ComboBox        (0x00000008),
        Frame           (0x00000010),
        GroupBox        (0x00000020),
        Label           (0x00000040),
        Line            (0x00000080),
        LineEdit        (0x00000100),
        PushButton      (0x00000200),
        RadioButton     (0x00000400),
        Slider          (0x00000800),
        SpinBox         (0x00001000),
        TabWidget       (0x00002000),
        ToolButton      (0x00004000);

        public final int value;
        private ControlType(int v) { this.value = v; }
        private ControlType(ControlType e) { this.value = e.value; }
        public ControlType intern() { for (ControlType e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
//     #define Q_DECLARE_FLAGS(arg0, arg1)(ControlTypes, ControlType)
    

     public QSizePolicy() { super((Pointer)null); allocate(); }
@NoException private native void allocate();

// #if defined(Q_COMPILER_UNIFORM_INIT) && !defined(Q_QDOC)
// #else
    public QSizePolicy(@Cast("QSizePolicy::Policy") int horizontal, @Cast("QSizePolicy::Policy") int vertical, ControlType type/*=QSizePolicy::DefaultType*/) { super((Pointer)null); allocate(horizontal, vertical, type); }
    @NoException private native void allocate(@Cast("QSizePolicy::Policy") int horizontal, @Cast("QSizePolicy::Policy") int vertical, ControlType type/*=QSizePolicy::DefaultType*/);
    public QSizePolicy(@Cast("QSizePolicy::Policy") int horizontal, @Cast("QSizePolicy::Policy") int vertical) { super((Pointer)null); allocate(horizontal, vertical); }
    @NoException private native void allocate(@Cast("QSizePolicy::Policy") int horizontal, @Cast("QSizePolicy::Policy") int vertical);
// #endif // uniform-init
     public native @NoException @Cast("QSizePolicy::Policy") int horizontalPolicy();
     public native @NoException @Cast("QSizePolicy::Policy") int verticalPolicy();
    public native @NoException ControlType controlType();

     public native @NoException void setHorizontalPolicy(@Cast("QSizePolicy::Policy") int d);
     public native @NoException void setVerticalPolicy(@Cast("QSizePolicy::Policy") int d);
    public native @NoException void setControlType(ControlType type);

    

     public native @NoException void setHeightForWidth(@Cast("bool") boolean b);
     public native @Cast("bool") @NoException boolean hasHeightForWidth();
     public native @NoException void setWidthForHeight(@Cast("bool") boolean b);
     public native @Cast("bool") @NoException boolean hasWidthForHeight();

     public native @Cast("bool") @Name("operator ==") @NoException boolean equals(@Const @ByRef QSizePolicy s);
     public native @Cast("bool") @Name("operator !=") @NoException boolean notEquals(@Const @ByRef QSizePolicy s);

    

    public native @ByVal @Name("operator QVariant") QVariant asQVariant();

     public native @NoException int horizontalStretch();
     public native @NoException int verticalStretch();
     public native void setHorizontalStretch(int stretchFactor);
     public native void setVerticalStretch(int stretchFactor);

     public native @Cast("bool") @NoException boolean retainSizeWhenHidden();
     public native @NoException void setRetainSizeWhenHidden(@Cast("bool") boolean retainSize);

     public native @NoException void transpose();
    
// #ifndef Q_QDOC
// #endif
    public native @ByVal @NoException QSizePolicy transposed();
}
