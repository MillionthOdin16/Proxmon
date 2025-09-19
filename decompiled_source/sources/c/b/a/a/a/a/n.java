package c.b.a.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f1414a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(o oVar) {
        this.f1414a = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar;
        eVar = this.f1414a.f1416b;
        eVar.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f1414a.h(new l(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar;
        eVar = this.f1414a.f1416b;
        eVar.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f1414a.h(new m(this));
    }
}
