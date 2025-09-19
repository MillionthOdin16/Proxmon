package c.b.a.a.a.f;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class u implements c, b {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f1477a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ u(byte[] bArr) {
    }

    @Override // c.b.a.a.a.f.c
    public final void a(Object obj) {
        this.f1477a.countDown();
    }

    @Override // c.b.a.a.a.f.b
    public final void b(Exception exc) {
        this.f1477a.countDown();
    }

    public final void c() {
        this.f1477a.await();
    }
}
