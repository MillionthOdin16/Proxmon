package c.b.a.a.a.a;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f1408c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(o oVar) {
        this.f1408c = oVar;
    }

    @Override // c.b.a.a.a.a.f
    public final void a() {
        IInterface iInterface;
        e eVar;
        Context context;
        ServiceConnection serviceConnection;
        iInterface = this.f1408c.k;
        if (iInterface != null) {
            eVar = this.f1408c.f1416b;
            eVar.f("Unbind from service.", new Object[0]);
            context = this.f1408c.f1415a;
            serviceConnection = this.f1408c.j;
            context.unbindService(serviceConnection);
            this.f1408c.f1419e = false;
            this.f1408c.k = null;
            this.f1408c.j = null;
        }
    }
}
