package b.e.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f1139b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f1140c;

    /* renamed from: f, reason: collision with root package name */
    private final int f1143f;
    private final int g;
    private final String h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f1138a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f1142e = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f1141d = 0;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            c.this.b((Runnable) message.obj);
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f1145b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Handler f1146c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f1147d;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f1148b;

            a(Object obj) {
                this.f1148b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1147d.a(this.f1148b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f1145b = callable;
            this.f1146c = handler;
            this.f1147d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f1145b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f1146c.post(new a(obj));
        }
    }

    /* renamed from: b.e.g.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0032c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f1150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callable f1151c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f1152d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f1153e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Condition f1154f;

        RunnableC0032c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f1150b = atomicReference;
            this.f1151c = callable;
            this.f1152d = reentrantLock;
            this.f1153e = atomicBoolean;
            this.f1154f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1150b.set(this.f1151c.call());
            } catch (Exception unused) {
            }
            this.f1152d.lock();
            try {
                this.f1153e.set(false);
                this.f1154f.signal();
            } finally {
                this.f1152d.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f1143f = i2;
    }

    private void c(Runnable runnable) {
        synchronized (this.f1138a) {
            if (this.f1139b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f1139b = handlerThread;
                handlerThread.start();
                this.f1140c = new Handler(this.f1139b.getLooper(), this.f1142e);
                this.f1141d++;
            }
            this.f1140c.removeMessages(0);
            this.f1140c.sendMessage(this.f1140c.obtainMessage(1, runnable));
        }
    }

    void a() {
        synchronized (this.f1138a) {
            if (this.f1140c.hasMessages(1)) {
                return;
            }
            this.f1139b.quit();
            this.f1139b = null;
            this.f1140c = null;
        }
    }

    void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f1138a) {
            this.f1140c.removeMessages(0);
            this.f1140c.sendMessageDelayed(this.f1140c.obtainMessage(0), this.f1143f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new RunnableC0032c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
