package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes.dex */
final class s2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1763a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1764b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1765c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1766d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1767e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f1768f;

    s2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f1763a = str;
        this.f1764b = j;
        this.f1765c = i;
        this.f1766d = z;
        this.f1767e = z2;
        this.f1768f = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s2 a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new s2(str, j, i, z, z2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        if (d() == null) {
            return false;
        }
        return d().endsWith("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return f() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f1763a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long e() {
        return this.f1764b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s2) {
            s2 s2Var = (s2) obj;
            String str = this.f1763a;
            if (str != null ? str.equals(s2Var.d()) : s2Var.d() == null) {
                if (this.f1764b == s2Var.e() && this.f1765c == s2Var.f() && this.f1766d == s2Var.g() && this.f1767e == s2Var.h()) {
                    if (Arrays.equals(this.f1768f, s2Var instanceof s2 ? s2Var.f1768f : s2Var.i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1765c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f1766d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f1767e;
    }

    public int hashCode() {
        String str = this.f1763a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f1764b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f1765c) * 1000003) ^ (true != this.f1766d ? 1237 : 1231)) * 1000003) ^ (true == this.f1767e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f1768f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] i() {
        return this.f1768f;
    }

    public String toString() {
        String str = this.f1763a;
        long j = this.f1764b;
        int i = this.f1765c;
        boolean z = this.f1766d;
        boolean z2 = this.f1767e;
        String arrays = Arrays.toString(this.f1768f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
