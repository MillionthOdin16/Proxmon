package c.a.a;

import android.app.Activity;
import c.b.a.a.a.f.e;
import d.a.c.a.h;
import d.a.c.a.i;
import io.flutter.embedding.engine.i.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class a implements io.flutter.embedding.engine.i.a, i.c, io.flutter.embedding.engine.i.c.a {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f1390b;

    /* renamed from: c, reason: collision with root package name */
    private i f1391c;

    /* renamed from: d, reason: collision with root package name */
    private c.b.a.a.a.c.a f1392d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0046a implements c.b.a.a.a.f.a<c.b.a.a.a.c.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.d f1393a;

        C0046a(i.d dVar) {
            this.f1393a = dVar;
        }

        @Override // c.b.a.a.a.f.a
        public void a(e<c.b.a.a.a.c.a> eVar) {
            i.d dVar;
            String str;
            if (eVar.g()) {
                a.this.f1392d = eVar.e();
                dVar = this.f1393a;
                str = "1";
            } else {
                dVar = this.f1393a;
                str = "0";
            }
            dVar.success(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c.b.a.a.a.f.a<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.d f1395a;

        b(a aVar, i.d dVar) {
            this.f1395a = dVar;
        }

        @Override // c.b.a.a.a.f.a
        public void a(e<Void> eVar) {
            this.f1395a.success("Success: " + eVar.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c.b.a.a.a.f.a<c.b.a.a.a.c.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.d f1396a;

        c(i.d dVar) {
            this.f1396a = dVar;
        }

        @Override // c.b.a.a.a.f.a
        public void a(e<c.b.a.a.a.c.a> eVar) {
            if (!eVar.g()) {
                this.f1396a.error("Requesting review not possible", null, null);
                return;
            }
            a.this.f1392d = eVar.e();
            a.this.e(this.f1396a);
        }
    }

    private void c(i.d dVar) {
        c.b.a.a.a.c.c.a(this.f1390b.get()).b().a(new c(dVar));
    }

    private void d(i.d dVar) {
        WeakReference<Activity> weakReference = this.f1390b;
        if (weakReference == null || weakReference.get() == null) {
            dVar.error("error", "Android activity not available", null);
        } else {
            c.b.a.a.a.c.c.a(this.f1390b.get()).b().a(new C0046a(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(i.d dVar) {
        WeakReference<Activity> weakReference = this.f1390b;
        if (weakReference == null || weakReference.get() == null) {
            dVar.error("error", "Android activity not available", null);
        } else if (this.f1392d == null) {
            c(dVar);
        } else {
            c.b.a.a.a.c.c.a(this.f1390b.get()).a(this.f1390b.get(), this.f1392d).a(new b(this, dVar));
        }
    }

    private void f(d.a.c.a.b bVar) {
        i iVar = new i(bVar, "app_review");
        this.f1391c = iVar;
        iVar.e(this);
    }

    private void g() {
        this.f1391c.e(null);
        this.f1391c = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(io.flutter.embedding.engine.i.c.c cVar) {
        this.f1390b = new WeakReference<>(cVar.getActivity());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        f(bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        this.f1390b = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        g();
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String str = hVar.f1873a;
        int hashCode = str.hashCode();
        if (hashCode != -1837495924) {
            if (hashCode == 1361080007 && str.equals("requestReview")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("isRequestReviewAvailable")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            d(dVar);
        } else if (c2 != 1) {
            dVar.notImplemented();
        } else {
            e(dVar);
        }
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.i.c.c cVar) {
        onAttachedToActivity(cVar);
    }
}
