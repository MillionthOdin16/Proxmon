package c.b.a.a.a.f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f1471a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1471a.post(runnable);
    }
}
