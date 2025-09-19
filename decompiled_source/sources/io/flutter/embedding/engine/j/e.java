package io.flutter.embedding.engine.j;

import d.a.c.a.r;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.a<String> f2530a;

    public e(io.flutter.embedding.engine.f.a aVar) {
        this.f2530a = new d.a.c.a.a<>(aVar, "flutter/lifecycle", r.f1890b);
    }

    public void a() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f2530a.c("AppLifecycleState.detached");
    }

    public void b() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f2530a.c("AppLifecycleState.inactive");
    }

    public void c() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f2530a.c("AppLifecycleState.paused");
    }

    public void d() {
        d.a.b.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f2530a.c("AppLifecycleState.resumed");
    }
}
