package io.flutter.embedding.engine.j;

import d.a.c.a.i;
import d.a.c.a.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final d.a.c.a.i f2522a;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.g.a f2523b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<i.d>> f2524c;

    /* renamed from: d, reason: collision with root package name */
    final i.c f2525d = new a();

    /* loaded from: classes.dex */
    class a implements i.c {
        a() {
        }

        @Override // d.a.c.a.i.c
        public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
            String a2;
            if (c.this.f2523b == null) {
                return;
            }
            String str = hVar.f1873a;
            Map map = (Map) hVar.b();
            d.a.b.e("DeferredComponentChannel", "Received '" + str + "' message.");
            int intValue = ((Integer) map.get("loadingUnitId")).intValue();
            String str2 = (String) map.get("componentName");
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1004447972) {
                if (hashCode != 399701758) {
                    if (hashCode == 520962947 && str.equals("installDeferredComponent")) {
                        c2 = 0;
                    }
                } else if (str.equals("getDeferredComponentInstallState")) {
                    c2 = 1;
                }
            } else if (str.equals("uninstallDeferredComponent")) {
                c2 = 2;
            }
            if (c2 == 0) {
                c.this.f2523b.c(intValue, str2);
                if (!c.this.f2524c.containsKey(str2)) {
                    c.this.f2524c.put(str2, new ArrayList());
                }
                ((List) c.this.f2524c.get(str2)).add(dVar);
                return;
            }
            if (c2 == 1) {
                a2 = c.this.f2523b.a(intValue, str2);
            } else if (c2 != 2) {
                dVar.notImplemented();
                return;
            } else {
                c.this.f2523b.d(intValue, str2);
                a2 = null;
            }
            dVar.success(a2);
        }
    }

    public c(io.flutter.embedding.engine.f.a aVar) {
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/deferredcomponent", q.f1887b);
        this.f2522a = iVar;
        iVar.e(this.f2525d);
        this.f2523b = d.a.a.d().a();
        this.f2524c = new HashMap();
    }

    public void c(io.flutter.embedding.engine.g.a aVar) {
        this.f2523b = aVar;
    }
}
