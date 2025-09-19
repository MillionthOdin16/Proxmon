package io.flutter.embedding.engine.j;

import java.util.HashMap;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.a<Object> f2621a;

    public m(io.flutter.embedding.engine.f.a aVar) {
        this.f2621a = new d.a.c.a.a<>(aVar, "flutter/system", d.a.c.a.d.f1871a);
    }

    public void a() {
        d.a.b.e("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f2621a.c(hashMap);
    }
}
