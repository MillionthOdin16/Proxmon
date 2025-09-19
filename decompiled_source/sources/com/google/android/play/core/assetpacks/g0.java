package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 extends b {

    /* renamed from: a, reason: collision with root package name */
    private final int f1614a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1615b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1616c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(int i, String str, String str2) {
        this.f1614a = i;
        this.f1615b = str;
        this.f1616c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String b() {
        return this.f1616c;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int c() {
        return this.f1614a;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String d() {
        return this.f1615b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f1614a == bVar.c() && ((str = this.f1615b) != null ? str.equals(bVar.d()) : bVar.d() == null)) {
                String str2 = this.f1616c;
                String b2 = bVar.b();
                if (str2 != null ? str2.equals(b2) : b2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f1614a ^ 1000003) * 1000003;
        String str = this.f1615b;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1616c;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f1614a;
        String str = this.f1615b;
        String str2 = this.f1616c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
