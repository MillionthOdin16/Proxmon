package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class u extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    private final v f540b;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.seekBarStyle);
    }

    public u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r0.a(this, getContext());
        v vVar = new v(this);
        this.f540b = vVar;
        vVar.c(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f540b.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f540b.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f540b.g(canvas);
    }
}
