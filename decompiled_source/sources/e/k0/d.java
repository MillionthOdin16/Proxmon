package e.k0;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    protected final String f1987b;

    public d(String str, Object... objArr) {
        this.f1987b = e.o(str, objArr);
    }

    protected abstract void k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f1987b);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
