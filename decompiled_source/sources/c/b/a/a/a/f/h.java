package c.b.a.a.a.f;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f1452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f1453c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(i iVar, e eVar) {
        this.f1453c = iVar;
        this.f1452b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        a aVar;
        a aVar2;
        obj = this.f1453c.f1455b;
        synchronized (obj) {
            aVar = this.f1453c.f1456c;
            if (aVar != null) {
                aVar2 = this.f1453c.f1456c;
                aVar2.a(this.f1452b);
            }
        }
    }
}
