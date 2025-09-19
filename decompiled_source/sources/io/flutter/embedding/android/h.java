package io.flutter.embedding.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;

@TargetApi(19)
/* loaded from: classes.dex */
public class h extends View implements io.flutter.embedding.engine.renderer.c {

    /* renamed from: b, reason: collision with root package name */
    private ImageReader f2389b;

    /* renamed from: c, reason: collision with root package name */
    private Image f2390c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f2391d;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.a f2392e;

    /* renamed from: f, reason: collision with root package name */
    private b f2393f;
    private boolean g;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2394a;

        static {
            int[] iArr = new int[b.values().length];
            f2394a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2394a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        background,
        overlay
    }

    public h(Context context, int i, int i2, b bVar) {
        this(context, f(i, i2), bVar);
    }

    h(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.g = false;
        this.f2389b = imageReader;
        this.f2393f = bVar;
        g();
    }

    private void e() {
        Image image = this.f2390c;
        if (image != null) {
            image.close();
            this.f2390c = null;
        }
    }

    @TargetApi(19)
    private static ImageReader f(int i, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i, i2, 1, 3, 768L) : ImageReader.newInstance(i, i2, 1, 3);
    }

    private void g() {
        setAlpha(0.0f);
    }

    @TargetApi(29)
    private void i() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f2390c.getHardwareBuffer();
            this.f2391d = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f2390c.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f2390c.getHeight();
        Bitmap bitmap = this.f2391d;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f2391d.getHeight() != height) {
            this.f2391d = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f2391d.copyPixelsFromBuffer(buffer);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        if (a.f2394a[this.f2393f.ordinal()] == 1) {
            aVar.r(this.f2389b.getSurface());
        }
        setAlpha(1.0f);
        this.f2392e = aVar;
        this.g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.g) {
            setAlpha(0.0f);
            d();
            this.f2391d = null;
            e();
            invalidate();
            this.g = false;
        }
    }

    @TargetApi(19)
    public boolean d() {
        if (!this.g) {
            return false;
        }
        Image acquireLatestImage = this.f2389b.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f2390c = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f2392e;
    }

    public Surface getSurface() {
        return this.f2389b.getSurface();
    }

    public void h(int i, int i2) {
        if (this.f2392e == null) {
            return;
        }
        if (i == this.f2389b.getWidth() && i2 == this.f2389b.getHeight()) {
            return;
        }
        e();
        this.f2389b.close();
        this.f2389b = f(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2390c != null) {
            i();
        }
        Bitmap bitmap = this.f2391d;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.f2389b.getWidth() && i2 == this.f2389b.getHeight()) && this.f2393f == b.background && this.g) {
            h(i, i2);
            this.f2392e.r(this.f2389b.getSurface());
        }
    }
}
