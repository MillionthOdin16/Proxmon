package b.j.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import b.e.j.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    private Animation.AnimationListener f1263b;

    /* renamed from: c, reason: collision with root package name */
    private int f1264c;

    /* renamed from: d, reason: collision with root package name */
    private int f1265d;

    /* renamed from: b.j.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0041a extends OvalShape {

        /* renamed from: b, reason: collision with root package name */
        private Paint f1266b = new Paint();

        /* renamed from: c, reason: collision with root package name */
        private int f1267c;

        /* renamed from: d, reason: collision with root package name */
        private a f1268d;

        C0041a(a aVar, int i) {
            this.f1268d = aVar;
            this.f1267c = i;
            a((int) rect().width());
        }

        private void a(int i) {
            float f2 = i / 2;
            this.f1266b.setShader(new RadialGradient(f2, f2, this.f1267c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f1268d.getWidth() / 2;
            float height = this.f1268d.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f1266b);
            canvas.drawCircle(width, height, r0 - this.f1267c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            a((int) f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f2);
        int i2 = (int) (0.0f * f2);
        this.f1264c = (int) (3.5f * f2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(b.j.a.SwipeRefreshLayout);
        this.f1265d = obtainStyledAttributes.getColor(b.j.a.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            r.N(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0041a(this, this.f1264c));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f1264c, i2, i, 503316480);
            int i3 = this.f1264c;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f1265d);
        r.K(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f1263b = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1263b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1263b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f1264c * 2), getMeasuredHeight() + (this.f1264c * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f1265d = i;
        }
    }
}
