package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;

/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    Runnable f502b;

    /* renamed from: c, reason: collision with root package name */
    private c f503c;

    /* renamed from: d, reason: collision with root package name */
    i0 f504d;

    /* renamed from: e, reason: collision with root package name */
    private Spinner f505e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f506f;
    int g;
    int h;
    private int i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f507b;

        a(View view) {
            this.f507b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f507b.getLeft() - ((p0.this.getWidth() - this.f507b.getWidth()) / 2), 0);
            p0.this.f502b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f504d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) p0.this.f504d.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f504d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = p0.this.f504d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        private final int[] f511b;

        /* renamed from: c, reason: collision with root package name */
        private a.c f512c;

        /* renamed from: d, reason: collision with root package name */
        private TextView f513d;

        /* renamed from: e, reason: collision with root package name */
        private ImageView f514e;

        /* renamed from: f, reason: collision with root package name */
        private View f515f;

        public d(Context context, a.c cVar, boolean z) {
            super(context, null, b.a.a.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f511b = iArr;
            this.f512c = cVar;
            w0 u = w0.u(context, null, iArr, b.a.a.actionBarTabStyle, 0);
            if (u.r(0)) {
                setBackgroundDrawable(u.f(0));
            }
            u.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f512c = cVar;
            c();
        }

        public a.c b() {
            return this.f512c;
        }

        public void c() {
            a.c cVar = this.f512c;
            View b2 = cVar.b();
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f515f = b2;
                TextView textView = this.f513d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f514e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f514e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f515f;
            if (view != null) {
                removeView(view);
                this.f515f = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f514e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f514e = oVar;
                }
                this.f514e.setImageDrawable(c2);
                this.f514e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f514e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f514e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f513d == null) {
                    z zVar = new z(getContext(), null, b.a.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f513d = zVar;
                }
                this.f513d.setText(d2);
                this.f513d.setVisibility(0);
            } else {
                TextView textView2 = this.f513d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f513d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f514e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            y0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (p0.this.g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = p0.this.g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, b.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f505e;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f505e == null) {
            this.f505e = b();
        }
        removeView(this.f504d);
        addView(this.f505e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f505e.getAdapter() == null) {
            this.f505e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f502b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f502b = null;
        }
        this.f505e.setSelection(this.j);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f505e);
        addView(this.f504d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f505e.getSelectedItemPosition());
        return false;
    }

    public void a(int i) {
        View childAt = this.f504d.getChildAt(i);
        Runnable runnable = this.f502b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f502b = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f503c == null) {
                this.f503c = new c();
            }
            dVar.setOnClickListener(this.f503c);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f502b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.a.n.a b2 = b.a.n.a.b(getContext());
        setContentHeight(b2.f());
        this.h = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f502b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f504d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.g, this.h);
        }
        this.g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (!z && this.f506f) {
            this.f504d.measure(0, makeMeasureSpec);
            if (this.f504d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.j);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f506f = z;
    }

    public void setContentHeight(int i) {
        this.i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.j = i;
        int childCount = this.f504d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f504d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.f505e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
