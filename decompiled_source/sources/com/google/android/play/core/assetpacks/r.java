package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r implements k3 {

    /* renamed from: f, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1740f = new c.b.a.a.a.a.e("AssetPackServiceImpl");
    private static final Intent g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    private final String f1741a;

    /* renamed from: b, reason: collision with root package name */
    private final y0 f1742b;

    /* renamed from: c, reason: collision with root package name */
    private c.b.a.a.a.a.o<c.b.a.a.a.a.n0> f1743c;

    /* renamed from: d, reason: collision with root package name */
    private c.b.a.a.a.a.o<c.b.a.a.a.a.n0> f1744d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f1745e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, y0 y0Var) {
        this.f1741a = context.getPackageName();
        this.f1742b = y0Var;
        if (c.b.a.a.a.a.s.a(context)) {
            this.f1743c = new c.b.a.a.a.a.o<>(c.b.a.a.a.d.a.a(context), f1740f, "AssetPackService", g, l3.f1689a);
            this.f1744d = new c.b.a.a.a.a.o<>(c.b.a.a.a.d.a.a(context), f1740f, "AssetPackService-keepAlive", g, m3.f1704a);
        }
        f1740f.c("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List e(r rVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c next = d.b((Bundle) list.get(i), rVar.f1742b).e().values().iterator().next();
            if (next == null) {
                f1740f.e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (w1.c(next.f())) {
                arrayList.add(next.e());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i, String str, int i2) {
        if (this.f1743c == null) {
            throw new u0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f1740f.f("notifyModuleCompleted", new Object[0]);
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        this.f1743c.c(new i(this, pVar, i, str, pVar, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle o(Map map) {
        Bundle x = x();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        x.putParcelableArrayList("installed_asset_module", arrayList);
        return x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle r(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle s(int i, String str) {
        Bundle r = r(i);
        r.putString("module_name", str);
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle t(int i, String str, String str2, int i2) {
        Bundle s = s(i, str);
        s.putString("slice_id", str2);
        s.putInt("chunk_number", i2);
        return s;
    }

    private static <T> c.b.a.a.a.f.e<T> w() {
        f1740f.e("onError(%d)", -11);
        return c.b.a.a.a.f.g.a(new a(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle x() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final synchronized void a() {
        if (this.f1744d == null) {
            f1740f.g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f1740f.f("keepAlive", new Object[0]);
        if (!this.f1745e.compareAndSet(false, true)) {
            f1740f.f("Service is already kept alive.", new Object[0]);
        } else {
            c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
            this.f1744d.c(new l(this, pVar, pVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void b(int i, String str) {
        f(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void g(List<String> list) {
        if (this.f1743c == null) {
            return;
        }
        f1740f.f("cancelDownloads(%s)", list);
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        this.f1743c.c(new f(this, pVar, list, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void h(int i) {
        if (this.f1743c == null) {
            throw new u0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f1740f.f("notifySessionFailed", new Object[0]);
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        this.f1743c.c(new j(this, pVar, i, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final c.b.a.a.a.f.e<ParcelFileDescriptor> i(int i, String str, String str2, int i2) {
        if (this.f1743c == null) {
            return w();
        }
        f1740f.f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        this.f1743c.c(new k(this, pVar, i, str, str2, i2, pVar));
        return pVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void j(int i, String str, String str2, int i2) {
        if (this.f1743c == null) {
            throw new u0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f1740f.f("notifyChunkTransferred", new Object[0]);
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        this.f1743c.c(new h(this, pVar, i, str, str2, i2, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final c.b.a.a.a.f.e<List<String>> k(Map<String, Long> map) {
        if (this.f1743c == null) {
            return w();
        }
        f1740f.f("syncPacks", new Object[0]);
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        this.f1743c.c(new g(this, pVar, map, pVar));
        return pVar.a();
    }
}
