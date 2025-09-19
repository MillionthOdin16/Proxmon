package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    Context f253b;

    /* renamed from: c, reason: collision with root package name */
    LayoutInflater f254c;

    /* renamed from: d, reason: collision with root package name */
    g f255d;

    /* renamed from: e, reason: collision with root package name */
    ExpandedMenuView f256e;

    /* renamed from: f, reason: collision with root package name */
    int f257f;
    int g;
    int h;
    private m.a i;
    a j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        private int f258b = -1;

        public a() {
            a();
        }

        void a() {
            i v = e.this.f255d.v();
            if (v != null) {
                ArrayList<i> z = e.this.f255d.z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.f258b = i;
                        return;
                    }
                }
            }
            this.f258b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i) {
            ArrayList<i> z = e.this.f255d.z();
            int i2 = i + e.this.f257f;
            int i3 = this.f258b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f255d.z().size() - e.this.f257f;
            return this.f258b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f254c.inflate(eVar.h, viewGroup, false);
            }
            ((n.a) view).d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i, int i2) {
        this.h = i;
        this.g = i2;
    }

    public e(Context context, int i) {
        this(i, 0);
        this.f253b = context;
        this.f254c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    public n c(ViewGroup viewGroup) {
        if (this.f256e == null) {
            this.f256e = (ExpandedMenuView) this.f254c.inflate(b.a.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.f256e.setAdapter((ListAdapter) this.j);
            this.f256e.setOnItemClickListener(this);
        }
        return this.f256e;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.g
            r0.<init>(r3, r1)
            r2.f253b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f254c = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f253b
            if (r0 == 0) goto L23
            r2.f253b = r3
            android.view.LayoutInflater r0 = r2.f254c
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f255d = r4
            androidx.appcompat.view.menu.e$a r3 = r2.j
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.e(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.i = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.c(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f255d.M(this.j.getItem(i), this, 0);
    }
}
