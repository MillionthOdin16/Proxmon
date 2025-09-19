package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b, reason: collision with root package name */
    private int f375b;

    /* renamed from: c, reason: collision with root package name */
    private int f376c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<View> f377d;

    /* renamed from: e, reason: collision with root package name */
    private LayoutInflater f378e;

    /* renamed from: f, reason: collision with root package name */
    private a f379f;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f375b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.j.ViewStubCompat, i, 0);
        this.f376c = obtainStyledAttributes.getResourceId(b.a.j.ViewStubCompat_android_inflatedId, -1);
        this.f375b = obtainStyledAttributes.getResourceId(b.a.j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(b.a.j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f375b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f378e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f375b, viewGroup, false);
        int i = this.f376c;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f377d = new WeakReference<>(inflate);
        a aVar = this.f379f;
        if (aVar != null) {
            aVar.a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f376c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f378e;
    }

    public int getLayoutResource() {
        return this.f375b;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f376c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f378e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f375b = i;
    }

    public void setOnInflateListener(a aVar) {
        this.f379f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f377d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
