package c.b.a.a.a.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class x extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f1425a;

    public x(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f1425a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == x.class) {
            if (this == obj) {
                return true;
            }
            x xVar = (x) obj;
            if (this.f1425a == xVar.f1425a && get() == xVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1425a;
    }
}
