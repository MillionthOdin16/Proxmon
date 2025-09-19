package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class x0 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    private final y1 f1822b = new y1();

    /* renamed from: c, reason: collision with root package name */
    private final File f1823c;

    /* renamed from: d, reason: collision with root package name */
    private final m2 f1824d;

    /* renamed from: e, reason: collision with root package name */
    private long f1825e;

    /* renamed from: f, reason: collision with root package name */
    private long f1826f;
    private FileOutputStream g;
    private s2 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(File file, m2 m2Var) {
        this.f1823c = file;
        this.f1824d = m2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int min;
        while (i2 > 0) {
            if (this.f1825e == 0 && this.f1826f == 0) {
                int b2 = this.f1822b.b(bArr, i, i2);
                if (b2 == -1) {
                    return;
                }
                i += b2;
                i2 -= b2;
                s2 c2 = this.f1822b.c();
                this.h = c2;
                if (c2.h()) {
                    this.f1825e = 0L;
                    this.f1824d.k(this.h.i(), this.h.i().length);
                    this.f1826f = this.h.i().length;
                } else if (!this.h.c() || this.h.b()) {
                    byte[] i3 = this.h.i();
                    this.f1824d.k(i3, i3.length);
                    this.f1825e = this.h.e();
                } else {
                    this.f1824d.f(this.h.i());
                    File file = new File(this.f1823c, this.h.d());
                    file.getParentFile().mkdirs();
                    this.f1825e = this.h.e();
                    this.g = new FileOutputStream(file);
                }
            }
            if (!this.h.b()) {
                if (this.h.h()) {
                    this.f1824d.c(this.f1826f, bArr, i, i2);
                    this.f1826f += i2;
                    min = i2;
                } else if (this.h.c()) {
                    min = (int) Math.min(i2, this.f1825e);
                    this.g.write(bArr, i, min);
                    long j = this.f1825e - min;
                    this.f1825e = j;
                    if (j == 0) {
                        this.g.close();
                    }
                } else {
                    min = (int) Math.min(i2, this.f1825e);
                    this.f1824d.c((this.h.i().length + this.h.e()) - this.f1825e, bArr, i, min);
                    this.f1825e -= min;
                }
                i += min;
                i2 -= min;
            }
        }
    }
}
