package e.k0.h;

import e.i0;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Set<i0> f2043a = new LinkedHashSet();

    public synchronized void a(i0 i0Var) {
        this.f2043a.remove(i0Var);
    }

    public synchronized void b(i0 i0Var) {
        this.f2043a.add(i0Var);
    }

    public synchronized boolean c(i0 i0Var) {
        return this.f2043a.contains(i0Var);
    }
}
