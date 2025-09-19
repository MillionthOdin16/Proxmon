package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1569c = new c.b.a.a.a.a.e("AssetPackStorage");

    /* renamed from: a, reason: collision with root package name */
    private final Context f1570a;

    /* renamed from: b, reason: collision with root package name */
    private final g2 f1571b;

    static {
        TimeUnit.DAYS.toMillis(14L);
        TimeUnit.DAYS.toMillis(28L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(Context context, g2 g2Var) {
        this.f1570a = context;
        this.f1571b = g2Var;
    }

    private final File B(String str) {
        return new File(G(), str);
    }

    private final File C(String str, int i, long j) {
        return new File(m(str, i, j), "merge.tmp");
    }

    private final List<File> D() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            f1569c.e("Could not process directory while scanning installed packs. %s", e2);
        }
        if (G().exists() && G().listFiles() != null) {
            for (File file : G().listFiles()) {
                if (!file.getCanonicalPath().equals(E().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    private final File E() {
        return new File(G(), "_tmp");
    }

    private final File F(String str, int i, long j) {
        return new File(new File(new File(E(), str), String.valueOf(i)), String.valueOf(j));
    }

    private final File G() {
        return new File(this.f1570a.getFilesDir(), "assetpacks");
    }

    private final File a(String str, int i) {
        return new File(B(str), String.valueOf(i));
    }

    private static void e(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long h = h(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(h)) && !file2.getName().equals("stale.tmp")) {
                q(file2);
            }
        }
    }

    private static long h(File file) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            f1569c.d(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private static boolean q(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= q(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str, int i, long j) {
        if (F(str, i, j).exists()) {
            q(F(str, i, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File b(String str, int i, long j) {
        return new File(a(str, i), String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File c(String str, int i, long j, String str2) {
        return new File(new File(new File(F(str, i, j), "_slices"), "_unverified"), str2);
    }

    final Map<String, b> d() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : D()) {
                b i = i(file.getName());
                if (i != null) {
                    hashMap.put(file.getName(), i);
                }
            }
        } catch (IOException e2) {
            f1569c.e("Could not process directory while scanning installed packs: %s", e2);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str, int i, long j, int i2) {
        File C = C(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        C.getParentFile().mkdirs();
        C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(List<String> list) {
        int a2 = this.f1571b.a();
        List<File> D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (!list.contains(file.getName()) && h(file) != a2) {
                q(file);
            }
        }
    }

    final b i(String str) {
        String o = o(str);
        if (o == null) {
            return null;
        }
        File file = new File(o, "assets");
        if (file.isDirectory()) {
            return b.a(o, file.getCanonicalPath());
        }
        f1569c.e("Failed to find assets directory: %s", file);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File j(String str, int i, long j) {
        return new File(b(str, i, j), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File k(String str, int i, long j, String str2) {
        return new File(new File(new File(F(str, i, j), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, Long> l() {
        HashMap hashMap = new HashMap();
        for (String str : d().keySet()) {
            hashMap.put(str, Long.valueOf(x(str)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File m(String str, int i, long j) {
        return new File(F(str, i, j), "_packs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File n(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), "checkpoint.dat");
    }

    final String o(String str) {
        int length;
        File file = new File(G(), str);
        if (!file.exists()) {
            f1569c.c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f1571b.a()));
        if (!file2.exists()) {
            f1569c.c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f1571b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f1569c.c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f1571b.a()));
            return null;
        }
        if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        }
        f1569c.e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f1571b.a()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        List<File> D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (file.listFiles() != null) {
                e(file);
                long h = h(file);
                if (this.f1571b.a() != h) {
                    try {
                        new File(new File(file, String.valueOf(h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f1569c.e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    e(file2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int r(String str, int i, long j) {
        File C = C(str, i, j);
        if (!C.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(C);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new u0("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e2) {
                throw new u0("Merge checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File s(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(String str) {
        if (B(str).exists()) {
            return q(B(str));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int u(String str) {
        return (int) h(B(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File v(String str, int i, long j) {
        return new File(new File(F(str, i, j), "_slices"), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File w(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), "slice.zip");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long x(String str) {
        return h(a(str, u(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File y(String str, int i, long j, String str2) {
        return new File(v(str, i, j), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        q(G());
    }
}
