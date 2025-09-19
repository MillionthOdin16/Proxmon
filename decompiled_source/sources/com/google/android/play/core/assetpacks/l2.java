package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f1684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1685b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1686c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1687d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1688e;

    l2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2(int i, String str, long j, long j2, int i2) {
        this();
        this.f1684a = i;
        this.f1685b = str;
        this.f1686c = j;
        this.f1687d = j2;
        this.f1688e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f1684a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f1685b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return this.f1686c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.f1687d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f1688e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            if (this.f1684a == l2Var.a() && ((str = this.f1685b) != null ? str.equals(l2Var.b()) : l2Var.b() == null) && this.f1686c == l2Var.c() && this.f1687d == l2Var.d() && this.f1688e == l2Var.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f1684a ^ 1000003) * 1000003;
        String str = this.f1685b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f1686c;
        long j2 = this.f1687d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1688e;
    }

    public String toString() {
        int i = this.f1684a;
        String str = this.f1685b;
        long j = this.f1686c;
        long j2 = this.f1687d;
        int i2 = this.f1688e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
