package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: b, reason: collision with root package name */
    protected Context f231b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f232c;

    /* renamed from: d, reason: collision with root package name */
    protected g f233d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f234e;

    /* renamed from: f, reason: collision with root package name */
    private m.a f235f;
    private int g;
    private int h;
    protected n i;

    public b(Context context, int i, int i2) {
        this.f231b = context;
        this.f234e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.f235f;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    public abstract void c(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void e(Context context, g gVar) {
        this.f232c = context;
        LayoutInflater.from(context);
        this.f233d = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    public n.a g(ViewGroup viewGroup) {
        return (n.a) this.f234e.inflate(this.h, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.f235f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean j(r rVar) {
        m.a aVar = this.f235f;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f233d;
        }
        return aVar.c(rVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void k(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f233d;
        int i = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> E = this.f233d.E();
            int size = E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = E.get(i3);
                if (q(i2, iVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View n = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        n.setPressed(false);
                        n.jumpDrawablesToCurrentState();
                    }
                    if (n != childAt) {
                        a(n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!l(viewGroup, i)) {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public m.a m() {
        return this.f235f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a g = view instanceof n.a ? (n.a) view : g(viewGroup);
        c(iVar, g);
        return (View) g;
    }

    public n o(ViewGroup viewGroup) {
        if (this.i == null) {
            n nVar = (n) this.f234e.inflate(this.g, viewGroup, false);
            this.i = nVar;
            nVar.b(this.f233d);
            k(true);
        }
        return this.i;
    }

    public void p(int i) {
    }

    public abstract boolean q(int i, i iVar);
}
