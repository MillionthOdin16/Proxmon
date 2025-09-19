package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final class h0 extends c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1627a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1628b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1629c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1630d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1631e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1632f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(String str, int i, int i2, long j, long j2, int i3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f1627a = str;
        this.f1628b = i;
        this.f1629c = i2;
        this.f1630d = j;
        this.f1631e = j2;
        this.f1632f = i3;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long c() {
        return this.f1630d;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final int d() {
        return this.f1629c;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final String e() {
        return this.f1627a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1627a.equals(cVar.e()) && this.f1628b == cVar.f() && this.f1629c == cVar.d() && this.f1630d == cVar.c() && this.f1631e == cVar.g() && this.f1632f == cVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final int f() {
        return this.f1628b;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long g() {
        return this.f1631e;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final int h() {
        return this.f1632f;
    }

    public final int hashCode() {
        int hashCode = this.f1627a.hashCode();
        int i = this.f1628b;
        int i2 = this.f1629c;
        long j = this.f1630d;
        long j2 = this.f1631e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1632f;
    }

    public final String toString() {
        String str = this.f1627a;
        int i = this.f1628b;
        int i2 = this.f1629c;
        long j = this.f1630d;
        long j2 = this.f1631e;
        int i3 = this.f1632f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
