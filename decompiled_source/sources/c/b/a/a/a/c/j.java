package c.b.a.a.a.c;

import android.app.PendingIntent;
import android.os.Bundle;
import c.b.a.a.a.f.p;

/* loaded from: classes.dex */
final class j extends i<a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar, p pVar) {
        super(kVar, new c.b.a.a.a.a.e("OnRequestInstallCallback"), pVar);
    }

    @Override // c.b.a.a.a.c.i, c.b.a.a.a.a.d
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.f1444b.e(a.b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
