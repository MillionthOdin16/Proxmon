package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u1 implements k3 {
    private static final c.b.a.a.a.a.e g = new c.b.a.a.a.a.e("FakeAssetPackService");

    /* renamed from: a, reason: collision with root package name */
    private final String f1782a;

    /* renamed from: b, reason: collision with root package name */
    private final w f1783b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1784c;

    /* renamed from: d, reason: collision with root package name */
    private final g2 f1785d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<Executor> f1786e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f1787f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(File file, w wVar, y0 y0Var, Context context, g2 g2Var, c.b.a.a.a.a.d0<Executor> d0Var) {
        this.f1782a = file.getAbsolutePath();
        this.f1783b = wVar;
        this.f1784c = context;
        this.f1785d = g2Var;
        this.f1786e = d0Var;
    }

    static long c(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0L;
    }

    private static String d(File file) {
        try {
            return w1.b(Arrays.asList(file));
        } catch (IOException e2) {
            throw new com.google.android.play.core.common.a(String.format("Could not digest file: %s.", file), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new com.google.android.play.core.common.a("SHA256 algorithm not supported.", e3);
        }
    }

    private final void e(int i, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f1785d.a());
        bundle.putInt("session_id", i);
        File[] m = m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : m) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = c.b.a.a.a.a.q.a(file);
            bundle.putParcelableArrayList(c.b.a.a.a.a.h0.b("chunk_intents", str, a2), arrayList2);
            bundle.putString(c.b.a.a.a.a.h0.b("uncompressed_hash_sha256", str, a2), d(file));
            bundle.putLong(c.b.a.a.a.a.h0.b("uncompressed_size", str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(c.b.a.a.a.a.h0.a("slice_ids", str), arrayList);
        bundle.putLong(c.b.a.a.a.a.h0.a("pack_version", str), this.f1785d.a());
        bundle.putInt(c.b.a.a.a.a.h0.a("status", str), i2);
        bundle.putInt(c.b.a.a.a.a.h0.a("error_code", str), 0);
        bundle.putLong(c.b.a.a.a.a.h0.a("bytes_downloaded", str), c(i2, j));
        bundle.putLong(c.b.a.a.a.a.h0.a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", c(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f1787f.post(new Runnable(this, putExtra) { // from class: com.google.android.play.core.assetpacks.t1

            /* renamed from: b, reason: collision with root package name */
            private final u1 f1775b;

            /* renamed from: c, reason: collision with root package name */
            private final Intent f1776c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1775b = this;
                this.f1776c = putExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1775b.f(this.f1776c);
            }
        });
    }

    private final File[] m(final String str) {
        File file = new File(this.f1782a);
        if (!file.isDirectory()) {
            throw new com.google.android.play.core.common.a(String.format("Local testing directory '%s' not found.", file));
        }
        File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.s1

            /* renamed from: a, reason: collision with root package name */
            private final String f1762a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1762a = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.f1762a).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (listFiles == null) {
            throw new com.google.android.play.core.common.a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (listFiles.length == 0) {
            throw new com.google.android.play.core.common.a(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : listFiles) {
            if (c.b.a.a.a.a.q.a(file2).equals(str)) {
                return listFiles;
            }
        }
        throw new com.google.android.play.core.common.a(String.format("No master slice available for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void a() {
        g.f("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void b(final int i, final String str) {
        g.f("notifyModuleCompleted", new Object[0]);
        this.f1786e.a().execute(new Runnable(this, i, str) { // from class: com.google.android.play.core.assetpacks.r1

            /* renamed from: b, reason: collision with root package name */
            private final u1 f1750b;

            /* renamed from: c, reason: collision with root package name */
            private final int f1751c;

            /* renamed from: d, reason: collision with root package name */
            private final String f1752d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1750b = this;
                this.f1751c = i;
                this.f1752d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1750b.l(this.f1751c, this.f1752d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(Intent intent) {
        this.f1783b.a(this.f1784c, intent);
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void g(List<String> list) {
        g.f("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void h(int i) {
        g.f("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final c.b.a.a.a.f.e<ParcelFileDescriptor> i(int i, String str, String str2, int i2) {
        int i3;
        g.f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        c.b.a.a.a.f.p pVar = new c.b.a.a.a.f.p();
        try {
        } catch (com.google.android.play.core.common.a e2) {
            g.g("getChunkFileDescriptor failed", e2);
            pVar.b(e2);
        } catch (FileNotFoundException e3) {
            g.g("getChunkFileDescriptor failed", e3);
            pVar.b(new com.google.android.play.core.common.a("Asset Slice file not found.", e3));
        }
        for (File file : m(str)) {
            if (c.b.a.a.a.a.q.a(file).equals(str2)) {
                pVar.c(ParcelFileDescriptor.open(file, 268435456));
                return pVar.a();
            }
        }
        throw new com.google.android.play.core.common.a(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final void j(int i, String str, String str2, int i2) {
        g.f("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.k3
    public final c.b.a.a.a.f.e<List<String>> k(Map<String, Long> map) {
        g.f("syncPacks()", new Object[0]);
        return c.b.a.a.a.f.g.b(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l(int i, String str) {
        try {
            e(i, str, 4);
        } catch (com.google.android.play.core.common.a e2) {
            g.g("notifyModuleCompleted failed", e2);
        }
    }
}
