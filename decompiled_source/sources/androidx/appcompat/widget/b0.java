package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: b, reason: collision with root package name */
    private final y f401b;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f401b = yVar;
        yVar.m(attributeSet, i);
    }
}
