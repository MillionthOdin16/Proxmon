package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* loaded from: classes.dex */
final class r0 extends o1 {

    /* renamed from: c, reason: collision with root package name */
    final int f1746c;

    /* renamed from: d, reason: collision with root package name */
    final long f1747d;

    /* renamed from: e, reason: collision with root package name */
    final String f1748e;

    /* renamed from: f, reason: collision with root package name */
    final int f1749f;
    final int g;
    final int h;
    final long i;
    final int j;
    final InputStream k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(int i, String str, int i2, long j, String str2, int i3, int i4, int i5, long j2, int i6, InputStream inputStream) {
        super(i, str);
        this.f1746c = i2;
        this.f1747d = j;
        this.f1748e = str2;
        this.f1749f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j2;
        this.j = i6;
        this.k = inputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.g + 1 == this.h;
    }
}
