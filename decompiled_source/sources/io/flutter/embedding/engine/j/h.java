package io.flutter.embedding.engine.j;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.i f2539a;

    public h(io.flutter.embedding.engine.f.a aVar) {
        this.f2539a = new d.a.c.a.i(aVar, "flutter/navigation", d.a.c.a.e.f1872a);
    }

    public void a() {
        d.a.b.e("NavigationChannel", "Sending message to pop route.");
        this.f2539a.c("popRoute", null);
    }

    public void b(String str) {
        d.a.b.e("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f2539a.c("pushRoute", str);
    }

    public void c(String str) {
        d.a.b.e("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f2539a.c("setInitialRoute", str);
    }
}
