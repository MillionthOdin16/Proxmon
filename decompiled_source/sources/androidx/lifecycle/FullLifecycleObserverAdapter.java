package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b f820a;

    /* renamed from: b, reason: collision with root package name */
    private final e f821b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f822a;

        static {
            int[] iArr = new int[d.a.values().length];
            f822a = iArr;
            try {
                iArr[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f822a[d.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f822a[d.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f822a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f822a[d.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f822a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f822a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f820a = bVar;
        this.f821b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) {
        switch (a.f822a[aVar.ordinal()]) {
            case 1:
                this.f820a.c(gVar);
                break;
            case 2:
                this.f820a.g(gVar);
                break;
            case 3:
                this.f820a.a(gVar);
                break;
            case 4:
                this.f820a.e(gVar);
                break;
            case 5:
                this.f820a.f(gVar);
                break;
            case 6:
                this.f820a.b(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f821b;
        if (eVar != null) {
            eVar.d(gVar, aVar);
        }
    }
}
