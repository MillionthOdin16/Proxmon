package c.b.a.a.a.a;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class l extends f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IBinder f1411c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f1412d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(n nVar, IBinder iBinder) {
        this.f1412d = nVar;
        this.f1411c = iBinder;
    }

    @Override // c.b.a.a.a.a.f
    public final void a() {
        k kVar;
        List list;
        List list2;
        o oVar = this.f1412d.f1414a;
        kVar = oVar.g;
        oVar.k = (IInterface) kVar.a(this.f1411c);
        o.n(this.f1412d.f1414a);
        this.f1412d.f1414a.f1419e = false;
        list = this.f1412d.f1414a.f1418d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f1412d.f1414a.f1418d;
        list2.clear();
    }
}
