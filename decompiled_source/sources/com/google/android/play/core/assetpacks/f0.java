package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class f0 extends c.b.a.a.a.a.u {

    /* renamed from: b, reason: collision with root package name */
    private final File f1598b;

    /* renamed from: c, reason: collision with root package name */
    private final File f1599c;

    /* renamed from: d, reason: collision with root package name */
    private final NavigableMap<Long, File> f1600d = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(File file, File file2) {
        this.f1598b = file;
        this.f1599c = file2;
        List<File> a2 = o2.a(this.f1598b, this.f1599c);
        if (a2.isEmpty()) {
            throw new u0(String.format("Virtualized slice archive empty for %s, %s", this.f1598b, this.f1599c));
        }
        int size = a2.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            File file3 = a2.get(i);
            this.f1600d.put(Long.valueOf(j), file3);
            j += file3.length();
        }
    }

    private final InputStream C(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f1600d.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new u0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.b.a.a.a.a.u
    public final InputStream A(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new u0(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 > r()) {
            throw new u0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(r()), Long.valueOf(j3)));
        }
        Long floorKey = this.f1600d.floorKey(Long.valueOf(j));
        Long floorKey2 = this.f1600d.floorKey(Long.valueOf(j3));
        if (floorKey.equals(floorKey2)) {
            return new e0(C(j, floorKey), j2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C(j, floorKey));
        Collection<File> values = this.f1600d.subMap(floorKey, false, floorKey2, false).values();
        if (!values.isEmpty()) {
            arrayList.add(new x1(Collections.enumeration(values)));
        }
        arrayList.add(new e0(new FileInputStream((File) this.f1600d.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // c.b.a.a.a.a.u
    public final long r() {
        Map.Entry<Long, File> lastEntry = this.f1600d.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }
}
