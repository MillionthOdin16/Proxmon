package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    protected final C0011a f380b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f381c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuView f382d;

    /* renamed from: e, reason: collision with root package name */
    protected c f383e;

    /* renamed from: f, reason: collision with root package name */
    protected int f384f;
    protected b.e.j.v g;
    private boolean h;
    private boolean i;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0011a implements b.e.j.w {

        /* renamed from: a, reason: collision with root package name */
        private boolean f385a = false;

        /* renamed from: b, reason: collision with root package name */
        int f386b;

        protected C0011a() {
        }

        @Override // b.e.j.w
        public void a(View view) {
            if (this.f385a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f386b);
        }

        @Override // b.e.j.w
        public void b(View view) {
            a.super.setVisibility(0);
            this.f385a = false;
        }

        @Override // b.e.j.w
        public void c(View view) {
            this.f385a = true;
        }

        public C0011a d(b.e.j.v vVar, int i) {
            a.this.g = vVar;
            this.f386b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f380b = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f381c = context;
        } else {
            this.f381c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public b.e.j.v f(int i, long j) {
        b.e.j.v vVar = this.g;
        if (vVar != null) {
            vVar.b();
        }
        if (i != 0) {
            b.e.j.v b2 = b.e.j.r.b(this);
            b2.a(0.0f);
            b2.d(j);
            C0011a c0011a = this.f380b;
            c0011a.d(b2, i);
            b2.f(c0011a);
            return b2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        b.e.j.v b3 = b.e.j.r.b(this);
        b3.a(1.0f);
        b3.d(j);
        C0011a c0011a2 = this.f380b;
        c0011a2.d(b3, i);
        b3.f(c0011a2);
        return b3;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f380b.f386b : getVisibility();
    }

    public int getContentHeight() {
        return this.f384f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(b.a.j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f383e;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            b.e.j.v vVar = this.g;
            if (vVar != null) {
                vVar.b();
            }
            super.setVisibility(i);
        }
    }
}
