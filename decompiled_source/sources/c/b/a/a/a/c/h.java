package c.b.a.a.a.c;

import android.os.RemoteException;
import c.b.a.a.a.f.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f1441c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f1442d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, p pVar, p pVar2) {
        super(pVar);
        this.f1442d = kVar;
        this.f1441c = pVar2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        String str;
        String str2;
        try {
            c.b.a.a.a.a.b f2 = this.f1442d.f1447a.f();
            str2 = this.f1442d.f1448b;
            f2.l(str2, com.google.android.play.core.common.b.a(), new j(this.f1442d, this.f1441c));
        } catch (RemoteException e2) {
            eVar = k.f1446c;
            str = this.f1442d.f1448b;
            eVar.d(e2, "error requesting in-app review for %s", str);
            this.f1441c.d(new RuntimeException(e2));
        }
    }
}
