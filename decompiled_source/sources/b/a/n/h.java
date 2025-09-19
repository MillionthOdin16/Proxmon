package b.a.n;

import android.view.View;
import android.view.animation.Interpolator;
import b.e.j.v;
import b.e.j.w;
import b.e.j.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f951c;

    /* renamed from: d, reason: collision with root package name */
    w f952d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f953e;

    /* renamed from: b, reason: collision with root package name */
    private long f950b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final x f954f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<v> f949a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends x {

        /* renamed from: a, reason: collision with root package name */
        private boolean f955a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f956b = 0;

        a() {
        }

        @Override // b.e.j.w
        public void a(View view) {
            int i = this.f956b + 1;
            this.f956b = i;
            if (i == h.this.f949a.size()) {
                w wVar = h.this.f952d;
                if (wVar != null) {
                    wVar.a(null);
                }
                d();
            }
        }

        @Override // b.e.j.x, b.e.j.w
        public void b(View view) {
            if (this.f955a) {
                return;
            }
            this.f955a = true;
            w wVar = h.this.f952d;
            if (wVar != null) {
                wVar.b(null);
            }
        }

        void d() {
            this.f956b = 0;
            this.f955a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f953e) {
            Iterator<v> it = this.f949a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f953e = false;
        }
    }

    void b() {
        this.f953e = false;
    }

    public h c(v vVar) {
        if (!this.f953e) {
            this.f949a.add(vVar);
        }
        return this;
    }

    public h d(v vVar, v vVar2) {
        this.f949a.add(vVar);
        vVar2.h(vVar.c());
        this.f949a.add(vVar2);
        return this;
    }

    public h e(long j) {
        if (!this.f953e) {
            this.f950b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f953e) {
            this.f951c = interpolator;
        }
        return this;
    }

    public h g(w wVar) {
        if (!this.f953e) {
            this.f952d = wVar;
        }
        return this;
    }

    public void h() {
        if (this.f953e) {
            return;
        }
        Iterator<v> it = this.f949a.iterator();
        while (it.hasNext()) {
            v next = it.next();
            long j = this.f950b;
            if (j >= 0) {
                next.d(j);
            }
            Interpolator interpolator = this.f951c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f952d != null) {
                next.f(this.f954f);
            }
            next.j();
        }
        this.f953e = true;
    }
}
