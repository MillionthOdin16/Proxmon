package b.j.b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import b.e.i.d;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {
    private static final Interpolator h = new LinearInterpolator();
    private static final Interpolator i = new b.h.a.a.b();
    private static final int[] j = {-16777216};

    /* renamed from: b, reason: collision with root package name */
    private final c f1269b;

    /* renamed from: c, reason: collision with root package name */
    private float f1270c;

    /* renamed from: d, reason: collision with root package name */
    private Resources f1271d;

    /* renamed from: e, reason: collision with root package name */
    private Animator f1272e;

    /* renamed from: f, reason: collision with root package name */
    float f1273f;
    boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f1274a;

        a(c cVar) {
            this.f1274a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f1274a);
            b.this.b(floatValue, this.f1274a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.j.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0042b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f1276a;

        C0042b(c cVar) {
            this.f1276a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f1276a, true);
            this.f1276a.A();
            this.f1276a.l();
            b bVar = b.this;
            if (!bVar.g) {
                bVar.f1273f += 1.0f;
                return;
            }
            bVar.g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f1276a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f1273f = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float q;
        int r;
        int s;
        int u;

        /* renamed from: a, reason: collision with root package name */
        final RectF f1278a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f1279b = new Paint();

        /* renamed from: c, reason: collision with root package name */
        final Paint f1280c = new Paint();

        /* renamed from: d, reason: collision with root package name */
        final Paint f1281d = new Paint();

        /* renamed from: e, reason: collision with root package name */
        float f1282e = 0.0f;

        /* renamed from: f, reason: collision with root package name */
        float f1283f = 0.0f;
        float g = 0.0f;
        float h = 5.0f;
        float p = 1.0f;
        int t = 255;

        c() {
            this.f1279b.setStrokeCap(Paint.Cap.SQUARE);
            this.f1279b.setAntiAlias(true);
            this.f1279b.setStyle(Paint.Style.STROKE);
            this.f1280c.setStyle(Paint.Style.FILL);
            this.f1280c.setAntiAlias(true);
            this.f1281d.setColor(0);
        }

        void A() {
            this.k = this.f1282e;
            this.l = this.f1283f;
            this.m = this.g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1278a;
            float f2 = this.q;
            float f3 = (this.h / 2.0f) + f2;
            if (f2 <= 0.0f) {
                f3 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f3, rect.centerY() - f3, rect.centerX() + f3, rect.centerY() + f3);
            float f4 = this.f1282e;
            float f5 = this.g;
            float f6 = (f4 + f5) * 360.0f;
            float f7 = ((this.f1283f + f5) * 360.0f) - f6;
            this.f1279b.setColor(this.u);
            this.f1279b.setAlpha(this.t);
            float f8 = this.h / 2.0f;
            rectF.inset(f8, f8);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1281d);
            float f9 = -f8;
            rectF.inset(f9, f9);
            canvas.drawArc(rectF, f6, f7, false, this.f1279b);
            b(canvas, f6, f7, rectF);
        }

        void b(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f4 = (this.r * this.p) / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f5 = this.r;
                float f6 = this.p;
                path3.lineTo((f5 * f6) / 2.0f, this.s * f6);
                this.o.offset((min + rectF.centerX()) - f4, rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.f1280c.setColor(this.u);
                this.f1280c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.f1280c);
                canvas.restore();
            }
        }

        int c() {
            return this.t;
        }

        float d() {
            return this.f1283f;
        }

        int e() {
            return this.i[f()];
        }

        int f() {
            return (this.j + 1) % this.i.length;
        }

        float g() {
            return this.f1282e;
        }

        int h() {
            return this.i[this.j];
        }

        float i() {
            return this.l;
        }

        float j() {
            return this.m;
        }

        float k() {
            return this.k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i) {
            this.t = i;
        }

        void o(float f2, float f3) {
            this.r = (int) f2;
            this.s = (int) f3;
        }

        void p(float f2) {
            if (f2 != this.p) {
                this.p = f2;
            }
        }

        void q(float f2) {
            this.q = f2;
        }

        void r(int i) {
            this.u = i;
        }

        void s(ColorFilter colorFilter) {
            this.f1279b.setColorFilter(colorFilter);
        }

        void t(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        void u(int[] iArr) {
            this.i = iArr;
            t(0);
        }

        void v(float f2) {
            this.f1283f = f2;
        }

        void w(float f2) {
            this.g = f2;
        }

        void x(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void y(float f2) {
            this.f1282e = f2;
        }

        void z(float f2) {
            this.h = f2;
            this.f1279b.setStrokeWidth(f2);
        }
    }

    public b(Context context) {
        d.b(context);
        this.f1271d = context.getResources();
        c cVar = new c();
        this.f1269b = cVar;
        cVar.u(j);
        k(2.5f);
        m();
    }

    private void a(float f2, c cVar) {
        n(f2, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f2));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f2));
    }

    private int c(float f2, int i2, int i3) {
        return ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r0) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r1) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r2) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r8))));
    }

    private void h(float f2) {
        this.f1270c = f2;
    }

    private void i(float f2, float f3, float f4, float f5) {
        c cVar = this.f1269b;
        float f6 = this.f1271d.getDisplayMetrics().density;
        cVar.z(f3 * f6);
        cVar.q(f2 * f6);
        cVar.t(0);
        cVar.o(f4 * f6, f5 * f6);
    }

    private void m() {
        c cVar = this.f1269b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new C0042b(cVar));
        this.f1272e = ofFloat;
    }

    void b(float f2, c cVar, boolean z) {
        float interpolation;
        float f3;
        if (this.g) {
            a(f2, cVar);
            return;
        }
        if (f2 != 1.0f || z) {
            float j2 = cVar.j();
            if (f2 < 0.5f) {
                interpolation = cVar.k();
                f3 = (i.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k = cVar.k() + 0.79f;
                interpolation = k - (((1.0f - i.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = k;
            }
            float f4 = j2 + (0.20999998f * f2);
            float f5 = (f2 + this.f1273f) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f3);
            cVar.w(f4);
            h(f5);
        }
    }

    public void d(boolean z) {
        this.f1269b.x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1270c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1269b.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f2) {
        this.f1269b.p(f2);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f1269b.u(iArr);
        this.f1269b.t(0);
        invalidateSelf();
    }

    public void g(float f2) {
        this.f1269b.w(f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1269b.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1272e.isRunning();
    }

    public void j(float f2, float f3) {
        this.f1269b.y(f2);
        this.f1269b.v(f3);
        invalidateSelf();
    }

    public void k(float f2) {
        this.f1269b.z(f2);
        invalidateSelf();
    }

    public void l(int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (i2 == 0) {
            f2 = 11.0f;
            f3 = 3.0f;
            f4 = 12.0f;
            f5 = 6.0f;
        } else {
            f2 = 7.5f;
            f3 = 2.5f;
            f4 = 10.0f;
            f5 = 5.0f;
        }
        i(f2, f3, f4, f5);
        invalidateSelf();
    }

    void n(float f2, c cVar) {
        cVar.r(f2 > 0.75f ? c((f2 - 0.75f) / 0.25f, cVar.h(), cVar.e()) : cVar.h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1269b.n(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1269b.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j2;
        this.f1272e.cancel();
        this.f1269b.A();
        if (this.f1269b.d() != this.f1269b.g()) {
            this.g = true;
            animator = this.f1272e;
            j2 = 666;
        } else {
            this.f1269b.t(0);
            this.f1269b.m();
            animator = this.f1272e;
            j2 = 1332;
        }
        animator.setDuration(j2);
        this.f1272e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1272e.cancel();
        h(0.0f);
        this.f1269b.x(false);
        this.f1269b.t(0);
        this.f1269b.m();
        invalidateSelf();
    }
}
