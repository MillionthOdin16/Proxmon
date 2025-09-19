package c.b.a.a.a.f;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f1462b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f1463c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar, e eVar) {
        this.f1463c = mVar;
        this.f1462b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f1463c.f1465b;
        synchronized (obj) {
            cVar = this.f1463c.f1466c;
            if (cVar != null) {
                cVar2 = this.f1463c.f1466c;
                cVar2.a(this.f1462b.e());
            }
        }
    }
}
