package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: f, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1692f = new c.b.a.a.a.a.e("ExtractorSessionStoreView");

    /* renamed from: a, reason: collision with root package name */
    private final c0 f1693a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<k3> f1694b;

    /* renamed from: c, reason: collision with root package name */
    private final y0 f1695c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, j1> f1696d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantLock f1697e = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(c0 c0Var, c.b.a.a.a.a.d0<k3> d0Var, y0 y0Var, c.b.a.a.a.a.d0<Executor> d0Var2) {
        this.f1693a = c0Var;
        this.f1694b = d0Var;
        this.f1695c = y0Var;
    }

    private final <T> T a(l1<T> l1Var) {
        try {
            b();
            return l1Var.a();
        } finally {
            f();
        }
    }

    private final Map<String, j1> o(final List<String> list) {
        return (Map) a(new l1(this, list) { // from class: com.google.android.play.core.assetpacks.e1

            /* renamed from: a, reason: collision with root package name */
            private final m1 f1586a;

            /* renamed from: b, reason: collision with root package name */
            private final List f1587b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1586a = this;
                this.f1587b = list;
            }

            @Override // com.google.android.play.core.assetpacks.l1
            public final Object a() {
                return this.f1586a.l(this.f1587b);
            }
        });
    }

    private final j1 q(int i) {
        Map<Integer, j1> map = this.f1696d;
        Integer valueOf = Integer.valueOf(i);
        j1 j1Var = map.get(valueOf);
        if (j1Var != null) {
            return j1Var;
        }
        throw new u0(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    private static String r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new u0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static <T> List<T> s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f1697e.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(final int i) {
        a(new l1(this, i) { // from class: com.google.android.play.core.assetpacks.g1

            /* renamed from: a, reason: collision with root package name */
            private final m1 f1617a;

            /* renamed from: b, reason: collision with root package name */
            private final int f1618b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1617a = this;
                this.f1618b = i;
            }

            @Override // com.google.android.play.core.assetpacks.l1
            public final Object a() {
                this.f1617a.m(this.f1618b);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(final String str, final int i, final long j) {
        a(new l1(this, str, i, j) { // from class: com.google.android.play.core.assetpacks.d1

            /* renamed from: a, reason: collision with root package name */
            private final m1 f1579a;

            /* renamed from: b, reason: collision with root package name */
            private final String f1580b;

            /* renamed from: c, reason: collision with root package name */
            private final int f1581c;

            /* renamed from: d, reason: collision with root package name */
            private final long f1582d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1579a = this;
                this.f1580b = str;
                this.f1581c = i;
                this.f1582d = j;
            }

            @Override // com.google.android.play.core.assetpacks.l1
            public final Object a() {
                this.f1579a.h(this.f1580b, this.f1581c, this.f1582d);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(final Bundle bundle) {
        return ((Boolean) a(new l1(this, bundle) { // from class: com.google.android.play.core.assetpacks.b1

            /* renamed from: a, reason: collision with root package name */
            private final m1 f1565a;

            /* renamed from: b, reason: collision with root package name */
            private final Bundle f1566b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1565a = this;
                this.f1566b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.l1
            public final Object a() {
                return this.f1565a.n(this.f1566b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.f1697e.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(int i) {
        q(i).f1658c.f1644c = 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, int i, long j) {
        j1 j1Var = o(Arrays.asList(str)).get(str);
        if (j1Var == null || w1.f(j1Var.f1658c.f1644c)) {
            f1692f.e(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f1693a.A(str, i, j);
        j1Var.f1658c.f1644c = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(final Bundle bundle) {
        return ((Boolean) a(new l1(this, bundle) { // from class: com.google.android.play.core.assetpacks.c1

            /* renamed from: a, reason: collision with root package name */
            private final m1 f1572a;

            /* renamed from: b, reason: collision with root package name */
            private final Bundle f1573b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1572a = this;
                this.f1573b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.l1
            public final Object a() {
                return this.f1572a.j(this.f1573b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, j1> map = this.f1696d;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        if (this.f1696d.get(valueOf).f1658c.f1644c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!w1.d(r0.f1658c.f1644c, bundle.getInt(c.b.a.a.a.a.h0.a("status", r(bundle)))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, j1> k() {
        return this.f1696d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map l(List list) {
        HashMap hashMap = new HashMap();
        for (j1 j1Var : this.f1696d.values()) {
            String str = j1Var.f1658c.f1642a;
            if (list.contains(str)) {
                j1 j1Var2 = (j1) hashMap.get(str);
                if ((j1Var2 == null ? -1 : j1Var2.f1656a) < j1Var.f1656a) {
                    hashMap.put(str, j1Var);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m(int i) {
        j1 q = q(i);
        if (!w1.f(q.f1658c.f1644c)) {
            throw new u0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        c0 c0Var = this.f1693a;
        i1 i1Var = q.f1658c;
        c0Var.A(i1Var.f1642a, q.f1657b, i1Var.f1643b);
        i1 i1Var2 = q.f1658c;
        int i2 = i1Var2.f1644c;
        if (i2 == 5 || i2 == 6) {
            this.f1693a.t(i1Var2.f1642a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean n(Bundle bundle) {
        k1 k1Var;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, j1> map = this.f1696d;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            j1 q = q(i);
            int i2 = bundle.getInt(c.b.a.a.a.a.h0.a("status", q.f1658c.f1642a));
            if (w1.d(q.f1658c.f1644c, i2)) {
                f1692f.c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(q.f1658c.f1644c));
                i1 i1Var = q.f1658c;
                String str = i1Var.f1642a;
                int i3 = i1Var.f1644c;
                if (i3 == 4) {
                    this.f1694b.a().b(i, str);
                } else if (i3 == 5) {
                    this.f1694b.a().h(i);
                } else if (i3 == 6) {
                    this.f1694b.a().g(Arrays.asList(str));
                }
            } else {
                q.f1658c.f1644c = i2;
                if (w1.f(i2)) {
                    c(i);
                    this.f1695c.b(q.f1658c.f1642a);
                } else {
                    List<k1> list = q.f1658c.f1646e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        k1 k1Var2 = list.get(i4);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c.b.a.a.a.a.h0.b("chunk_intents", q.f1658c.f1642a, k1Var2.f1668a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    k1Var2.f1671d.get(i5).f1633a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String r = r(bundle);
            long j = bundle.getLong(c.b.a.a.a.a.h0.a("pack_version", r));
            int i6 = bundle.getInt(c.b.a.a.a.a.h0.a("status", r));
            long j2 = bundle.getLong(c.b.a.a.a.a.h0.a("total_bytes_to_download", r));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(c.b.a.a.a.a.h0.a("slice_ids", r));
            ArrayList arrayList = new ArrayList();
            Iterator it = s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(c.b.a.a.a.a.h0.b("chunk_intents", r, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = s(parcelableArrayList2).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it;
                    if (((Intent) it2.next()) != null) {
                        z = true;
                    }
                    arrayList2.add(new h1(z));
                    it = it3;
                    z = false;
                }
                Iterator it4 = it;
                String string = bundle.getString(c.b.a.a.a.a.h0.b("uncompressed_hash_sha256", r, str2));
                long j3 = bundle.getLong(c.b.a.a.a.a.h0.b("uncompressed_size", r, str2));
                int i7 = bundle.getInt(c.b.a.a.a.a.h0.b("patch_format", r, str2), 0);
                if (i7 != 0) {
                    k1Var = new k1(str2, string, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    k1Var = new k1(str2, string, j3, arrayList2, bundle.getInt(c.b.a.a.a.a.h0.b("compression_format", r, str2), 0), 0);
                }
                arrayList.add(k1Var);
                it = it4;
            }
            this.f1696d.put(Integer.valueOf(i), new j1(i, bundle.getInt("app_version_code"), new i1(r, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(final int i) {
        a(new l1(this, i) { // from class: com.google.android.play.core.assetpacks.f1

            /* renamed from: a, reason: collision with root package name */
            private final m1 f1601a;

            /* renamed from: b, reason: collision with root package name */
            private final int f1602b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1601a = this;
                this.f1602b = i;
            }

            @Override // com.google.android.play.core.assetpacks.l1
            public final Object a() {
                this.f1601a.g(this.f1602b);
                return null;
            }
        });
    }
}
