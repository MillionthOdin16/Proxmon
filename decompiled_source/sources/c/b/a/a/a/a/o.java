package c.b.a.a.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o<T extends IInterface> {
    private static final Map<String, Handler> l = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f1415a;

    /* renamed from: b, reason: collision with root package name */
    private final e f1416b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1417c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1419e;

    /* renamed from: f, reason: collision with root package name */
    private final Intent f1420f;
    private final k<T> g;
    private ServiceConnection j;
    private T k;

    /* renamed from: d, reason: collision with root package name */
    private final List<f> f1418d = new ArrayList();
    private final IBinder.DeathRecipient i = new IBinder.DeathRecipient(this) { // from class: c.b.a.a.a.a.g

        /* renamed from: a, reason: collision with root package name */
        private final o f1405a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f1405a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f1405a.k();
        }
    };
    private final WeakReference<j> h = new WeakReference<>(null);

    public o(Context context, e eVar, String str, Intent intent, k<T> kVar) {
        this.f1415a = context;
        this.f1416b = eVar;
        this.f1417c = str;
        this.f1420f = intent;
        this.g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(o oVar, f fVar) {
        if (oVar.k != null || oVar.f1419e) {
            if (!oVar.f1419e) {
                fVar.run();
                return;
            } else {
                oVar.f1416b.f("Waiting to bind to the service.", new Object[0]);
                oVar.f1418d.add(fVar);
                return;
            }
        }
        oVar.f1416b.f("Initiate binding to the service.", new Object[0]);
        oVar.f1418d.add(fVar);
        n nVar = new n(oVar);
        oVar.j = nVar;
        oVar.f1419e = true;
        if (oVar.f1415a.bindService(oVar.f1420f, nVar, 1)) {
            return;
        }
        oVar.f1416b.f("Failed to bind to the service.", new Object[0]);
        oVar.f1419e = false;
        List<f> list = oVar.f1418d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.b.a.a.a.f.p<?> b2 = list.get(i).b();
            if (b2 != null) {
                b2.d(new p());
            }
        }
        oVar.f1418d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(f fVar) {
        Handler handler;
        synchronized (l) {
            if (!l.containsKey(this.f1417c)) {
                HandlerThread handlerThread = new HandlerThread(this.f1417c, 10);
                handlerThread.start();
                l.put(this.f1417c, new Handler(handlerThread.getLooper()));
            }
            handler = l.get(this.f1417c);
        }
        handler.post(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n(o oVar) {
        oVar.f1416b.f("linkToDeath", new Object[0]);
        try {
            oVar.k.asBinder().linkToDeath(oVar.i, 0);
        } catch (RemoteException e2) {
            oVar.f1416b.d(e2, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(o oVar) {
        oVar.f1416b.f("unlinkToDeath", new Object[0]);
        oVar.k.asBinder().unlinkToDeath(oVar.i, 0);
    }

    public final void b() {
        h(new i(this));
    }

    public final void c(f fVar) {
        h(new h(this, fVar.b(), fVar));
    }

    public final T f() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void k() {
        this.f1416b.f("reportBinderDeath", new Object[0]);
        j jVar = this.h.get();
        if (jVar != null) {
            this.f1416b.f("calling onBinderDied", new Object[0]);
            jVar.a();
            return;
        }
        this.f1416b.f("%s : Binder has died.", this.f1417c);
        List<f> list = this.f1418d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.b.a.a.a.f.p<?> b2 = list.get(i).b();
            if (b2 != null) {
                b2.d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f1417c).concat(" : Binder has died.")));
            }
        }
        this.f1418d.clear();
    }
}
