package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* loaded from: classes.dex */
final class e0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f1584b;

    /* renamed from: c, reason: collision with root package name */
    private long f1585c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(InputStream inputStream, long j) {
        this.f1584b = inputStream;
        this.f1585c = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f1584b.close();
        this.f1585c = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f1585c;
        if (j <= 0) {
            return -1;
        }
        this.f1585c = j - 1;
        return this.f1584b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f1585c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f1584b.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f1585c -= read;
        }
        return read;
    }
}
