package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<g> f853c;

    /* renamed from: a, reason: collision with root package name */
    private b.b.a.b.a<f, b> f851a = new b.b.a.b.a<>();

    /* renamed from: d, reason: collision with root package name */
    private int f854d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f855e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f856f = false;
    private ArrayList<d.b> g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private d.b f852b = d.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f857a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f858b;

        static {
            int[] iArr = new int[d.b.values().length];
            f858b = iArr;
            try {
                iArr[d.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f858b[d.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f858b[d.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f858b[d.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f858b[d.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.a.values().length];
            f857a = iArr2;
            try {
                iArr2[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f857a[d.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f857a[d.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f857a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f857a[d.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f857a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f857a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        d.b f859a;

        /* renamed from: b, reason: collision with root package name */
        e f860b;

        b(f fVar, d.b bVar) {
            this.f860b = j.f(fVar);
            this.f859a = bVar;
        }

        void a(g gVar, d.a aVar) {
            d.b h = h.h(aVar);
            this.f859a = h.l(this.f859a, h);
            this.f860b.d(gVar, aVar);
            this.f859a = h;
        }
    }

    public h(g gVar) {
        this.f853c = new WeakReference<>(gVar);
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> a2 = this.f851a.a();
        while (a2.hasNext() && !this.f856f) {
            Map.Entry<f, b> next = a2.next();
            b value = next.getValue();
            while (value.f859a.compareTo(this.f852b) > 0 && !this.f856f && this.f851a.contains(next.getKey())) {
                d.a f2 = f(value.f859a);
                o(h(f2));
                value.a(gVar, f2);
                n();
            }
        }
    }

    private d.b e(f fVar) {
        Map.Entry<f, b> i = this.f851a.i(fVar);
        d.b bVar = null;
        d.b bVar2 = i != null ? i.getValue().f859a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(r0.size() - 1);
        }
        return l(l(this.f852b, bVar2), bVar);
    }

    private static d.a f(d.b bVar) {
        int i = a.f858b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return d.a.ON_DESTROY;
        }
        if (i == 3) {
            return d.a.ON_STOP;
        }
        if (i == 4) {
            return d.a.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        b.b.a.b.b<f, b>.d d2 = this.f851a.d();
        while (d2.hasNext() && !this.f856f) {
            Map.Entry next = d2.next();
            b bVar = (b) next.getValue();
            while (bVar.f859a.compareTo(this.f852b) < 0 && !this.f856f && this.f851a.contains(next.getKey())) {
                o(bVar.f859a);
                bVar.a(gVar, r(bVar.f859a));
                n();
            }
        }
    }

    static d.b h(d.a aVar) {
        switch (a.f857a[aVar.ordinal()]) {
            case 1:
            case 2:
                return d.b.CREATED;
            case 3:
            case 4:
                return d.b.STARTED;
            case 5:
                return d.b.RESUMED;
            case 6:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f851a.size() == 0) {
            return true;
        }
        d.b bVar = this.f851a.b().getValue().f859a;
        d.b bVar2 = this.f851a.e().getValue().f859a;
        return bVar == bVar2 && this.f852b == bVar2;
    }

    static d.b l(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(d.b bVar) {
        if (this.f852b == bVar) {
            return;
        }
        this.f852b = bVar;
        if (this.f855e || this.f854d != 0) {
            this.f856f = true;
            return;
        }
        this.f855e = true;
        q();
        this.f855e = false;
    }

    private void n() {
        this.g.remove(r0.size() - 1);
    }

    private void o(d.b bVar) {
        this.g.add(bVar);
    }

    private void q() {
        g gVar = this.f853c.get();
        if (gVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean j = j();
            this.f856f = false;
            if (j) {
                return;
            }
            if (this.f852b.compareTo(this.f851a.b().getValue().f859a) < 0) {
                d(gVar);
            }
            Map.Entry<f, b> e2 = this.f851a.e();
            if (!this.f856f && e2 != null && this.f852b.compareTo(e2.getValue().f859a) > 0) {
                g(gVar);
            }
        }
    }

    private static d.a r(d.b bVar) {
        int i = a.f858b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return d.a.ON_START;
            }
            if (i == 3) {
                return d.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return d.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f852b;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.f851a.g(fVar, bVar3) == null && (gVar = this.f853c.get()) != null) {
            boolean z = this.f854d != 0 || this.f855e;
            d.b e2 = e(fVar);
            this.f854d++;
            while (bVar3.f859a.compareTo(e2) < 0 && this.f851a.contains(fVar)) {
                o(bVar3.f859a);
                bVar3.a(gVar, r(bVar3.f859a));
                n();
                e2 = e(fVar);
            }
            if (!z) {
                q();
            }
            this.f854d--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.f852b;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        this.f851a.h(fVar);
    }

    public void i(d.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(d.b bVar) {
        p(bVar);
    }

    public void p(d.b bVar) {
        m(bVar);
    }
}
