package c.b.b.b.a;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f1518a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f1519b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f1520c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f1521d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f1522e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f1523a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f1525c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f1526d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f1527e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1528f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1523a = threadFactory;
            this.f1524b = str;
            this.f1525c = atomicLong;
            this.f1526d = bool;
            this.f1527e = num;
            this.f1528f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f1523a.newThread(runnable);
            String str = this.f1524b;
            if (str != null) {
                newThread.setName(g.d(str, Long.valueOf(this.f1525c.getAndIncrement())));
            }
            Boolean bool = this.f1526d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f1527e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f1528f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(g gVar) {
        String str = gVar.f1518a;
        Boolean bool = gVar.f1519b;
        Integer num = gVar.f1520c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = gVar.f1521d;
        ThreadFactory threadFactory = gVar.f1522e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public g e(String str) {
        d(str, 0);
        this.f1518a = str;
        return this;
    }

    public g f(int i) {
        c.b.b.a.b.a(i >= 1, "Thread priority (%s) must be >= %s", i, 1);
        c.b.b.a.b.a(i <= 10, "Thread priority (%s) must be <= %s", i, 10);
        this.f1520c = Integer.valueOf(i);
        return this;
    }
}
