package io.flutter.embedding.engine.j;

import d.a.c.a.i;
import d.a.c.a.q;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2605a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f2606b;

    /* renamed from: c, reason: collision with root package name */
    private d.a.c.a.i f2607c;

    /* renamed from: d, reason: collision with root package name */
    private i.d f2608d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2609e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2610f;
    private final i.c g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements i.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f2611a;

        a(byte[] bArr) {
            this.f2611a = bArr;
        }

        @Override // d.a.c.a.i.d
        public void error(String str, String str2, Object obj) {
            d.a.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // d.a.c.a.i.d
        public void notImplemented() {
        }

        @Override // d.a.c.a.i.d
        public void success(Object obj) {
            k.this.f2606b = this.f2611a;
        }
    }

    /* loaded from: classes.dex */
    class b implements i.c {
        b() {
        }

        @Override // d.a.c.a.i.c
        public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
            char c2;
            Map map;
            String str = hVar.f1873a;
            Object obj = hVar.f1874b;
            int hashCode = str.hashCode();
            if (hashCode != 102230) {
                if (hashCode == 111375 && str.equals("put")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (str.equals("get")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                k.this.f2606b = (byte[]) obj;
                map = null;
            } else {
                if (c2 != 1) {
                    dVar.notImplemented();
                    return;
                }
                k.this.f2610f = true;
                if (!k.this.f2609e) {
                    k kVar = k.this;
                    if (kVar.f2605a) {
                        kVar.f2608d = dVar;
                        return;
                    }
                }
                k kVar2 = k.this;
                map = kVar2.i(kVar2.f2606b);
            }
            dVar.success(map);
        }
    }

    k(d.a.c.a.i iVar, boolean z) {
        this.f2609e = false;
        this.f2610f = false;
        b bVar = new b();
        this.g = bVar;
        this.f2607c = iVar;
        this.f2605a = z;
        iVar.e(bVar);
    }

    public k(io.flutter.embedding.engine.f.a aVar, boolean z) {
        this(new d.a.c.a.i(aVar, "flutter/restoration", q.f1887b), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f2606b = null;
    }

    public byte[] h() {
        return this.f2606b;
    }

    public void j(byte[] bArr) {
        this.f2609e = true;
        i.d dVar = this.f2608d;
        if (dVar != null) {
            dVar.success(i(bArr));
            this.f2608d = null;
        } else if (this.f2610f) {
            this.f2607c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f2606b = bArr;
    }
}
