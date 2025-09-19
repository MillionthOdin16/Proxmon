package io.flutter.embedding.engine.j;

import d.a.c.a.a;
import d.a.c.a.p;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.a<Object> f2517a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2518b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0073b f2519c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d<Object> f2520d = new a();

    /* loaded from: classes.dex */
    class a implements a.d<Object> {
        a() {
        }

        @Override // d.a.c.a.a.d
        public void a(Object obj, a.e<Object> eVar) {
            String str;
            if (b.this.f2519c == null) {
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str2 = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            d.a.b.e("AccessibilityChannel", "Received " + str2 + " message.");
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1140076541:
                    if (str2.equals("tooltip")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -649620375:
                    if (str2.equals("announce")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 114595:
                    if (str2.equals("tap")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 114203431:
                    if (str2.equals("longPress")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    b.this.f2519c.e(str3);
                }
            } else if (c2 == 1) {
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    b.this.f2519c.f(num.intValue());
                }
            } else if (c2 == 2) {
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    b.this.f2519c.d(num2.intValue());
                }
            } else if (c2 == 3 && (str = (String) hashMap2.get("message")) != null) {
                b.this.f2519c.c(str);
            }
            eVar.a(null);
        }
    }

    /* renamed from: io.flutter.embedding.engine.j.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0073b extends FlutterJNI.a {
        void c(String str);

        void d(int i);

        void e(String str);

        void f(int i);
    }

    public b(io.flutter.embedding.engine.f.a aVar, FlutterJNI flutterJNI) {
        d.a.c.a.a<Object> aVar2 = new d.a.c.a.a<>(aVar, "flutter/accessibility", p.f1884a);
        this.f2517a = aVar2;
        aVar2.e(this.f2520d);
        this.f2518b = flutterJNI;
    }

    public void b(int i, c.g gVar) {
        this.f2518b.dispatchSemanticsAction(i, gVar);
    }

    public void c(int i, c.g gVar, Object obj) {
        this.f2518b.dispatchSemanticsAction(i, gVar, obj);
    }

    public void d() {
        this.f2518b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f2518b.setSemanticsEnabled(true);
    }

    public void f(int i) {
        this.f2518b.setAccessibilityFeatures(i);
    }

    public void g(InterfaceC0073b interfaceC0073b) {
        this.f2519c = interfaceC0073b;
        this.f2518b.setAccessibilityDelegate(interfaceC0073b);
    }
}
