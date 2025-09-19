package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static n f2438c;

    /* renamed from: a, reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f2439a = new LongSparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Long> f2440b = new PriorityQueue<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicLong f2441b = new AtomicLong(0);

        /* renamed from: a, reason: collision with root package name */
        private final long f2442a;

        private a(long j) {
            this.f2442a = j;
        }

        public static a b() {
            return c(f2441b.incrementAndGet());
        }

        public static a c(long j) {
            return new a(j);
        }

        public long d() {
            return this.f2442a;
        }
    }

    private n() {
    }

    public static n a() {
        if (f2438c == null) {
            f2438c = new n();
        }
        return f2438c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f2440b.isEmpty() && this.f2440b.peek().longValue() < aVar.f2442a) {
            this.f2439a.remove(this.f2440b.poll().longValue());
        }
        if (!this.f2440b.isEmpty() && this.f2440b.peek().longValue() == aVar.f2442a) {
            this.f2440b.poll();
        }
        MotionEvent motionEvent = this.f2439a.get(aVar.f2442a);
        this.f2439a.remove(aVar.f2442a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b2 = a.b();
        this.f2439a.put(b2.f2442a, MotionEvent.obtain(motionEvent));
        this.f2440b.add(Long.valueOf(b2.f2442a));
        return b2;
    }
}
