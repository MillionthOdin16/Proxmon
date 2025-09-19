package io.flutter.embedding.engine.j;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.a<Object> f2614a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final d.a.c.a.a<Object> f2615a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, Object> f2616b = new HashMap();

        a(d.a.c.a.a<Object> aVar) {
            this.f2615a = aVar;
        }

        public void a() {
            d.a.b.e("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f2616b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f2616b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f2616b.get("platformBrightness"));
            this.f2615a.c(this.f2616b);
        }

        public a b(b bVar) {
            this.f2616b.put("platformBrightness", bVar.f2620b);
            return this;
        }

        public a c(float f2) {
            this.f2616b.put("textScaleFactor", Float.valueOf(f2));
            return this;
        }

        public a d(boolean z) {
            this.f2616b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        light("light"),
        dark("dark");


        /* renamed from: b, reason: collision with root package name */
        public String f2620b;

        b(String str) {
            this.f2620b = str;
        }
    }

    public l(io.flutter.embedding.engine.f.a aVar) {
        this.f2614a = new d.a.c.a.a<>(aVar, "flutter/settings", d.a.c.a.d.f1871a);
    }

    public a a() {
        return new a(this.f2614a);
    }
}
