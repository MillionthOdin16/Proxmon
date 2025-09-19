package c.b.a.a.a.a;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<x, List<Throwable>> f1426a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f1427b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f1427b.poll();
            if (poll == null) {
                break;
            }
            this.f1426a.remove(poll);
        }
        List<Throwable> list = this.f1426a.get(new x(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f1426a.putIfAbsent(new x(th, this.f1427b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
