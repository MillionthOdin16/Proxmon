package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public class j extends TextureView implements io.flutter.embedding.engine.renderer.c {

    /* renamed from: b, reason: collision with root package name */
    private boolean f2405b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2406c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.a f2407d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f2408e;

    /* renamed from: f, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f2409f;

    /* loaded from: classes.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            d.a.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            j.this.f2405b = true;
            if (j.this.f2406c) {
                j.this.j();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d.a.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            j.this.f2405b = false;
            if (!j.this.f2406c) {
                return true;
            }
            j.this.k();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            d.a.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (j.this.f2406c) {
                j.this.i(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public j(Context context) {
        this(context, null);
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2405b = false;
        this.f2406c = false;
        this.f2409f = new a();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i, int i2) {
        if (this.f2407d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        d.a.b.e("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
        this.f2407d.q(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f2407d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = new Surface(getSurfaceTexture());
        this.f2408e = surface;
        this.f2407d.o(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        io.flutter.embedding.engine.renderer.a aVar = this.f2407d;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.p();
        Surface surface = this.f2408e;
        if (surface != null) {
            surface.release();
            this.f2408e = null;
        }
    }

    private void l() {
        setSurfaceTextureListener(this.f2409f);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        d.a.b.e("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f2407d != null) {
            d.a.b.e("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f2407d.p();
        }
        this.f2407d = aVar;
        this.f2406c = true;
        if (this.f2405b) {
            d.a.b.e("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            j();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (this.f2407d == null) {
            d.a.b.f("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2407d = null;
            this.f2406c = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f2407d == null) {
            d.a.b.f("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            d.a.b.e("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            k();
        }
        this.f2407d = null;
        this.f2406c = false;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f2407d;
    }
}
