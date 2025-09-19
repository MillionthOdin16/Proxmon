package com.google.android.play.core.assetpacks;

import java.util.Map;

/* loaded from: classes.dex */
final class i0 extends d {

    /* renamed from: a, reason: collision with root package name */
    private final long f1640a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c> f1641b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(long j, Map<String, c> map) {
        this.f1640a = j;
        this.f1641b = map;
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final Map<String, c> e() {
        return this.f1641b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f1640a == dVar.f() && this.f1641b.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.d
    public final long f() {
        return this.f1640a;
    }

    public final int hashCode() {
        long j = this.f1640a;
        return this.f1641b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f1640a;
        String valueOf = String.valueOf(this.f1641b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
