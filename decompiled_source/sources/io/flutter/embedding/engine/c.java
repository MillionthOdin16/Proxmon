package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f2458b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f2459a = new HashMap();

    c() {
    }

    public static c b() {
        if (f2458b == null) {
            f2458b = new c();
        }
        return f2458b;
    }

    public b a(String str) {
        return this.f2459a.get(str);
    }

    public void c(String str, b bVar) {
        if (bVar != null) {
            this.f2459a.put(str, bVar);
        } else {
            this.f2459a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
