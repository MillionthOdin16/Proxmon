package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f836a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0018a f837b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f836a = obj;
        this.f837b = a.f839c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) {
        this.f837b.a(gVar, aVar, this.f836a);
    }
}
