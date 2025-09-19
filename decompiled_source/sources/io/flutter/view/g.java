package io.flutter.view;

import android.view.Choreographer;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private static g f2888c;

    /* renamed from: a, reason: collision with root package name */
    private final WindowManager f2889a;

    /* renamed from: b, reason: collision with root package name */
    private final FlutterJNI.b f2890b = new a();

    /* loaded from: classes.dex */
    class a implements FlutterJNI.b {

        /* renamed from: io.flutter.view.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class ChoreographerFrameCallbackC0085a implements Choreographer.FrameCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f2892a;

            ChoreographerFrameCallbackC0085a(long j) {
                this.f2892a = j;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                double refreshRate = g.this.f2889a.getDefaultDisplay().getRefreshRate();
                Double.isNaN(refreshRate);
                FlutterJNI.nativeOnVsync(j, j + ((long) (1.0E9d / refreshRate)), this.f2892a);
            }
        }

        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j) {
            Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0085a(j));
        }
    }

    private g(WindowManager windowManager) {
        this.f2889a = windowManager;
    }

    public static g b(WindowManager windowManager) {
        if (f2888c == null) {
            f2888c = new g(windowManager);
        }
        return f2888c;
    }

    public void c() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.f2890b);
        FlutterJNI.setRefreshRateFPS(this.f2889a.getDefaultDisplay().getRefreshRate());
    }
}
