package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(16)
/* loaded from: classes.dex */
public class a implements f {

    /* renamed from: b, reason: collision with root package name */
    private final FlutterJNI f2666b;

    /* renamed from: d, reason: collision with root package name */
    private Surface f2668d;

    /* renamed from: f, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.b f2670f;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f2667c = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private boolean f2669e = false;

    /* renamed from: io.flutter.embedding.engine.renderer.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0077a implements io.flutter.embedding.engine.renderer.b {
        C0077a() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void b() {
            a.this.f2669e = false;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            a.this.f2669e = true;
        }
    }

    /* loaded from: classes.dex */
    final class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final long f2672a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f2673b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2674c;

        /* renamed from: d, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f2675d = new C0078a();

        /* renamed from: io.flutter.embedding.engine.renderer.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0078a implements SurfaceTexture.OnFrameAvailableListener {
            C0078a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (b.this.f2674c || !a.this.f2666b.isAttached()) {
                    return;
                }
                b bVar = b.this;
                a.this.j(bVar.f2672a);
            }
        }

        b(long j, SurfaceTexture surfaceTexture) {
            this.f2672a = j;
            this.f2673b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                c().setOnFrameAvailableListener(this.f2675d, new Handler());
            } else {
                c().setOnFrameAvailableListener(this.f2675d);
            }
        }

        @Override // io.flutter.view.f.a
        public void a() {
            if (this.f2674c) {
                return;
            }
            d.a.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f2672a + ").");
            this.f2673b.release();
            a.this.s(this.f2672a);
            this.f2674c = true;
        }

        @Override // io.flutter.view.f.a
        public long b() {
            return this.f2672a;
        }

        @Override // io.flutter.view.f.a
        public SurfaceTexture c() {
            return this.f2673b.surfaceTexture();
        }

        public SurfaceTextureWrapper f() {
            return this.f2673b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public float f2678a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f2679b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f2680c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f2681d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f2682e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f2683f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = -1;

        boolean a() {
            return this.f2679b > 0 && this.f2680c > 0 && this.f2678a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0077a c0077a = new C0077a();
        this.f2670f = c0077a;
        this.f2666b = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0077a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j) {
        this.f2666b.markTextureFrameAvailable(j);
    }

    private void k(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f2666b.registerTexture(j, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(long j) {
        this.f2666b.unregisterTexture(j);
    }

    @Override // io.flutter.view.f
    public f.a b() {
        d.a.b.e("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        b bVar = new b(this.f2667c.getAndIncrement(), surfaceTexture);
        d.a.b.e("FlutterRenderer", "New SurfaceTexture ID: " + bVar.b());
        k(bVar.b(), bVar.f());
        return bVar;
    }

    public void f(io.flutter.embedding.engine.renderer.b bVar) {
        this.f2666b.addIsDisplayingFlutterUiListener(bVar);
        if (this.f2669e) {
            bVar.e();
        }
    }

    public void g(ByteBuffer byteBuffer, int i) {
        this.f2666b.dispatchPointerDataPacket(byteBuffer, i);
    }

    public boolean h() {
        return this.f2669e;
    }

    public boolean i() {
        return this.f2666b.getIsSoftwareRenderingEnabled();
    }

    public void l(io.flutter.embedding.engine.renderer.b bVar) {
        this.f2666b.removeIsDisplayingFlutterUiListener(bVar);
    }

    public void m(boolean z) {
        this.f2666b.setSemanticsEnabled(z);
    }

    public void n(c cVar) {
        if (cVar.a()) {
            d.a.b.e("FlutterRenderer", "Setting viewport metrics\nSize: " + cVar.f2679b + " x " + cVar.f2680c + "\nPadding - L: " + cVar.g + ", T: " + cVar.f2681d + ", R: " + cVar.f2682e + ", B: " + cVar.f2683f + "\nInsets - L: " + cVar.k + ", T: " + cVar.h + ", R: " + cVar.i + ", B: " + cVar.j + "\nSystem Gesture Insets - L: " + cVar.o + ", T: " + cVar.l + ", R: " + cVar.m + ", B: " + cVar.j);
            this.f2666b.setViewportMetrics(cVar.f2678a, cVar.f2679b, cVar.f2680c, cVar.f2681d, cVar.f2682e, cVar.f2683f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o, cVar.p);
        }
    }

    public void o(Surface surface) {
        if (this.f2668d != null) {
            p();
        }
        this.f2668d = surface;
        this.f2666b.onSurfaceCreated(surface);
    }

    public void p() {
        this.f2666b.onSurfaceDestroyed();
        this.f2668d = null;
        if (this.f2669e) {
            this.f2670f.b();
        }
        this.f2669e = false;
    }

    public void q(int i, int i2) {
        this.f2666b.onSurfaceChanged(i, i2);
    }

    public void r(Surface surface) {
        this.f2668d = surface;
        this.f2666b.onSurfaceWindowChanged(surface);
    }
}
