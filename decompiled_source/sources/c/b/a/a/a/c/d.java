package c.b.a.a.a.c;

import android.app.PendingIntent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    private final PendingIntent f1436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f1436b = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.b.a.a.a.c.a
    public final PendingIntent a() {
        return this.f1436b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.f1436b.equals(((a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1436b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1436b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
