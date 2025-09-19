package c.b.a.a.a.f;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f1457b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f1458c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar, e eVar) {
        this.f1458c = kVar;
        this.f1457b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f1458c.f1460b;
        synchronized (obj) {
            bVar = this.f1458c.f1461c;
            if (bVar != null) {
                bVar2 = this.f1458c.f1461c;
                bVar2.b(this.f1457b.d());
            }
        }
    }
}
