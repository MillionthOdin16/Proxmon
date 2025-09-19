package io.flutter.embedding.engine.i;

import android.content.Context;
import io.flutter.plugin.platform.h;
import io.flutter.view.f;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: io.flutter.embedding.engine.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0072a {
        String a(String str);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2512a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a.c.a.b f2513b;

        /* renamed from: c, reason: collision with root package name */
        private final h f2514c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC0072a f2515d;

        public b(Context context, io.flutter.embedding.engine.b bVar, d.a.c.a.b bVar2, f fVar, h hVar, InterfaceC0072a interfaceC0072a) {
            this.f2512a = context;
            this.f2513b = bVar2;
            this.f2514c = hVar;
            this.f2515d = interfaceC0072a;
        }

        public Context a() {
            return this.f2512a;
        }

        public d.a.c.a.b b() {
            return this.f2513b;
        }

        public InterfaceC0072a c() {
            return this.f2515d;
        }

        public h d() {
            return this.f2514c;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
