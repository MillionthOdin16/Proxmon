package b.b.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f962a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f963b = Executors.newFixedThreadPool(2, new a(this));

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f964a = new AtomicInteger(0);

        a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f964a.getAndIncrement())));
            return thread;
        }
    }

    @Override // b.b.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
