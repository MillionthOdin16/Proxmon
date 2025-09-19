package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* loaded from: classes.dex */
public final class x1 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    private final Enumeration<File> f1827b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f1828c;

    public x1(Enumeration<File> enumeration) {
        this.f1827b = enumeration;
        r();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InputStream inputStream = this.f1828c;
        if (inputStream != null) {
            inputStream.close();
            this.f1828c = null;
        }
    }

    final void r() {
        InputStream inputStream = this.f1828c;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f1828c = this.f1827b.hasMoreElements() ? new FileInputStream(this.f1827b.nextElement()) : null;
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            InputStream inputStream = this.f1828c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            r();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f1828c == null) {
            return -1;
        }
        if (bArr == null) {
            throw null;
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int read = this.f1828c.read(bArr, i, i2);
            if (read > 0) {
                return read;
            }
            r();
        } while (this.f1828c != null);
        return -1;
    }
}
