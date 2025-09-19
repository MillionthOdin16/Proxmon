package c.b.a.a.a.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c.b.a.a.a.a.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c<StateT> {

    /* renamed from: a, reason: collision with root package name */
    protected final e f1430a;

    /* renamed from: b, reason: collision with root package name */
    private final IntentFilter f1431b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1432c;

    /* renamed from: d, reason: collision with root package name */
    protected final Set<a<StateT>> f1433d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private b f1434e = null;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f1435f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(e eVar, IntentFilter intentFilter, Context context) {
        this.f1430a = eVar;
        this.f1431b = intentFilter;
        this.f1432c = c.b.a.a.a.d.a.a(context);
    }

    private final void e() {
        b bVar;
        if ((this.f1435f || !this.f1433d.isEmpty()) && this.f1434e == null) {
            b bVar2 = new b(this);
            this.f1434e = bVar2;
            this.f1432c.registerReceiver(bVar2, this.f1431b);
        }
        if (this.f1435f || !this.f1433d.isEmpty() || (bVar = this.f1434e) == null) {
            return;
        }
        this.f1432c.unregisterReceiver(bVar);
        this.f1434e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(StateT statet) {
        Iterator it = new HashSet(this.f1433d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }

    public final synchronized void c(boolean z) {
        this.f1435f = z;
        e();
    }

    public final synchronized boolean d() {
        return this.f1434e != null;
    }
}
