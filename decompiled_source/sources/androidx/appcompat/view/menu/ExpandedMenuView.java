package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f217d = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private g f218b;

    /* renamed from: c, reason: collision with root package name */
    private int f219c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 u = w0.u(context, attributeSet, f217d, i, 0);
        if (u.r(0)) {
            setBackgroundDrawable(u.f(0));
        }
        if (u.r(1)) {
            setDivider(u.f(1));
        }
        u.v();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.f218b.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.f218b = gVar;
    }

    public int getWindowAnimations() {
        return this.f219c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((i) getAdapter().getItem(i));
    }
}
