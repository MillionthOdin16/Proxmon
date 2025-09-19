package androidx.fragment.app;

import androidx.lifecycle.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q implements androidx.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    private androidx.lifecycle.h f818b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d.a aVar) {
        this.f818b.i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f818b == null) {
            this.f818b = new androidx.lifecycle.h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f818b != null;
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d getLifecycle() {
        b();
        return this.f818b;
    }
}
