package b.k.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import b.e.e.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h extends b.k.a.a.g {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private C0045h f1317c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f1318d;

    /* renamed from: e, reason: collision with root package name */
    private ColorFilter f1319e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1320f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1330b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1329a = b.e.e.c.d(string2);
            }
            this.f1331c = b.e.d.d.g.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // b.k.a.a.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (b.e.d.d.g.j(xmlPullParser, "pathData")) {
                TypedArray k = b.e.d.d.g.k(resources, theme, attributeSet, b.k.a.a.a.f1298d);
                f(k, xmlPullParser);
                k.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f1321e;

        /* renamed from: f, reason: collision with root package name */
        b.e.d.d.b f1322f;
        float g;
        b.e.d.d.b h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f1321e = cVar.f1321e;
            this.f1322f = cVar.f1322f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.f1331c = cVar.f1331c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f1321e = null;
            if (b.e.d.d.g.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1330b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1329a = b.e.e.c.d(string2);
                }
                this.h = b.e.d.d.g.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.j = b.e.d.d.g.f(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = e(b.e.d.d.g.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(b.e.d.d.g.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = b.e.d.d.g.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f1322f = b.e.d.d.g.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.i = b.e.d.d.g.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.g = b.e.d.d.g.f(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
                this.l = b.e.d.d.g.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = b.e.d.d.g.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = b.e.d.d.g.f(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f1331c = b.e.d.d.g.g(typedArray, xmlPullParser, "fillType", 13, this.f1331c);
            }
        }

        @Override // b.k.a.a.h.e
        public boolean a() {
            return this.h.i() || this.f1322f.i();
        }

        @Override // b.k.a.a.h.e
        public boolean b(int[] iArr) {
            return this.f1322f.j(iArr) | this.h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = b.e.d.d.g.k(resources, theme, attributeSet, b.k.a.a.a.f1297c);
            h(k, xmlPullParser, theme);
            k.recycle();
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.h.e();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f1322f.e();
        }

        float getStrokeWidth() {
            return this.g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f2) {
            this.j = f2;
        }

        void setFillColor(int i) {
            this.h.k(i);
        }

        void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        void setStrokeColor(int i) {
            this.f1322f.k(i);
        }

        void setStrokeWidth(float f2) {
            this.g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f1323a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f1324b;

        /* renamed from: c, reason: collision with root package name */
        float f1325c;

        /* renamed from: d, reason: collision with root package name */
        private float f1326d;

        /* renamed from: e, reason: collision with root package name */
        private float f1327e;

        /* renamed from: f, reason: collision with root package name */
        private float f1328f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.f1323a = new Matrix();
            this.f1324b = new ArrayList<>();
            this.f1325c = 0.0f;
            this.f1326d = 0.0f;
            this.f1327e = 0.0f;
            this.f1328f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, b.d.a<String, Object> aVar) {
            super();
            f bVar;
            this.f1323a = new Matrix();
            this.f1324b = new ArrayList<>();
            this.f1325c = 0.0f;
            this.f1326d = 0.0f;
            this.f1327e = 0.0f;
            this.f1328f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f1325c = dVar.f1325c;
            this.f1326d = dVar.f1326d;
            this.f1327e = dVar.f1327e;
            this.f1328f = dVar.f1328f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f1324b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f1324b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f1324b.add(bVar);
                    String str2 = bVar.f1330b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.f1326d, -this.f1327e);
            this.j.postScale(this.f1328f, this.g);
            this.j.postRotate(this.f1325c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.f1326d, this.i + this.f1327e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f1325c = b.e.d.d.g.f(typedArray, xmlPullParser, "rotation", 5, this.f1325c);
            this.f1326d = typedArray.getFloat(1, this.f1326d);
            this.f1327e = typedArray.getFloat(2, this.f1327e);
            this.f1328f = b.e.d.d.g.f(typedArray, xmlPullParser, "scaleX", 3, this.f1328f);
            this.g = b.e.d.d.g.f(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = b.e.d.d.g.f(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = b.e.d.d.g.f(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // b.k.a.a.h.e
        public boolean a() {
            for (int i = 0; i < this.f1324b.size(); i++) {
                if (this.f1324b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.k.a.a.h.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f1324b.size(); i++) {
                z |= this.f1324b.get(i).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = b.e.d.d.g.k(resources, theme, attributeSet, b.k.a.a.a.f1296b);
            e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f1326d;
        }

        public float getPivotY() {
            return this.f1327e;
        }

        public float getRotation() {
            return this.f1325c;
        }

        public float getScaleX() {
            return this.f1328f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f1326d) {
                this.f1326d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f1327e) {
                this.f1327e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f1325c) {
                this.f1325c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f1328f) {
                this.f1328f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected c.b[] f1329a;

        /* renamed from: b, reason: collision with root package name */
        String f1330b;

        /* renamed from: c, reason: collision with root package name */
        int f1331c;

        /* renamed from: d, reason: collision with root package name */
        int f1332d;

        public f() {
            super();
            this.f1329a = null;
            this.f1331c = 0;
        }

        public f(f fVar) {
            super();
            this.f1329a = null;
            this.f1331c = 0;
            this.f1330b = fVar.f1330b;
            this.f1332d = fVar.f1332d;
            this.f1329a = b.e.e.c.f(fVar.f1329a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f1329a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f1329a;
        }

        public String getPathName() {
            return this.f1330b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (b.e.e.c.b(this.f1329a, bVarArr)) {
                b.e.e.c.j(this.f1329a, bVarArr);
            } else {
                this.f1329a = b.e.e.c.f(bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f1333a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f1334b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f1335c;

        /* renamed from: d, reason: collision with root package name */
        Paint f1336d;

        /* renamed from: e, reason: collision with root package name */
        Paint f1337e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f1338f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final b.d.a<String, Object> p;

        public g() {
            this.f1335c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new b.d.a<>();
            this.h = new d();
            this.f1333a = new Path();
            this.f1334b = new Path();
        }

        public g(g gVar) {
            this.f1335c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            b.d.a<String, Object> aVar = new b.d.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f1333a = new Path(gVar.f1333a);
            this.f1334b = new Path(gVar.f1334b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f1323a.set(matrix);
            dVar.f1323a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f1324b.size(); i3++) {
                e eVar = dVar.f1324b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f1323a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f2 = i / this.k;
            float f3 = i2 / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.f1323a;
            this.f1335c.set(matrix);
            this.f1335c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 == 0.0f) {
                return;
            }
            fVar.d(this.f1333a);
            Path path = this.f1333a;
            this.f1334b.reset();
            if (fVar.c()) {
                this.f1334b.setFillType(fVar.f1331c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f1334b.addPath(path, this.f1335c);
                canvas.clipPath(this.f1334b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.k != 0.0f || cVar.l != 1.0f) {
                float f4 = cVar.k;
                float f5 = cVar.m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.l + f5) % 1.0f;
                if (this.f1338f == null) {
                    this.f1338f = new PathMeasure();
                }
                this.f1338f.setPath(this.f1333a, false);
                float length = this.f1338f.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f1338f.getSegment(f8, length, path, true);
                    this.f1338f.getSegment(0.0f, f9, path, true);
                } else {
                    this.f1338f.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1334b.addPath(path, this.f1335c);
            if (cVar.h.l()) {
                b.e.d.d.b bVar = cVar.h;
                if (this.f1337e == null) {
                    Paint paint = new Paint(1);
                    this.f1337e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f1337e;
                if (bVar.h()) {
                    Shader f10 = bVar.f();
                    f10.setLocalMatrix(this.f1335c);
                    paint2.setShader(f10);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(bVar.e(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.f1334b.setFillType(cVar.f1331c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1334b, paint2);
            }
            if (cVar.f1322f.l()) {
                b.e.d.d.b bVar2 = cVar.f1322f;
                if (this.f1336d == null) {
                    Paint paint3 = new Paint(1);
                    this.f1336d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f1336d;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (bVar2.h()) {
                    Shader f11 = bVar2.f();
                    f11.setLocalMatrix(this.f1335c);
                    paint4.setShader(f11);
                    paint4.setAlpha(Math.round(cVar.i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(bVar2.e(), cVar.i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.g * min * e2);
                canvas.drawPath(this.f1334b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.h, q, canvas, i, i2, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.k.a.a.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0045h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1339a;

        /* renamed from: b, reason: collision with root package name */
        g f1340b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f1341c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f1342d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1343e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f1344f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public C0045h() {
            this.f1341c = null;
            this.f1342d = h.k;
            this.f1340b = new g();
        }

        public C0045h(C0045h c0045h) {
            this.f1341c = null;
            this.f1342d = h.k;
            if (c0045h != null) {
                this.f1339a = c0045h.f1339a;
                g gVar = new g(c0045h.f1340b);
                this.f1340b = gVar;
                if (c0045h.f1340b.f1337e != null) {
                    gVar.f1337e = new Paint(c0045h.f1340b.f1337e);
                }
                if (c0045h.f1340b.f1336d != null) {
                    this.f1340b.f1336d = new Paint(c0045h.f1340b.f1336d);
                }
                this.f1341c = c0045h.f1341c;
                this.f1342d = c0045h.f1342d;
                this.f1343e = c0045h.f1343e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f1344f.getWidth() && i2 == this.f1344f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.f1341c && this.h == this.f1342d && this.j == this.f1343e && this.i == this.f1340b.getRootAlpha();
        }

        public void c(int i, int i2) {
            if (this.f1344f == null || !a(i, i2)) {
                this.f1344f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1344f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f1340b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.f1340b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f1340b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1339a;
        }

        public boolean h(int[] iArr) {
            boolean g = this.f1340b.g(iArr);
            this.k |= g;
            return g;
        }

        public void i() {
            this.g = this.f1341c;
            this.h = this.f1342d;
            this.i = this.f1340b.getRootAlpha();
            this.j = this.f1343e;
            this.k = false;
        }

        public void j(int i, int i2) {
            this.f1344f.eraseColor(0);
            this.f1340b.b(new Canvas(this.f1344f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1345a;

        public i(Drawable.ConstantState constantState) {
            this.f1345a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1345a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1345a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f1316b = (VectorDrawable) this.f1345a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f1316b = (VectorDrawable) this.f1345a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f1316b = (VectorDrawable) this.f1345a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1317c = new C0045h();
    }

    h(C0045h c0045h) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1317c = c0045h;
        this.f1318d = j(this.f1318d, c0045h.f1341c, c0045h.f1342d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f1316b = b.e.d.d.f.a(resources, i2, theme);
            new i(hVar.f1316b.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        C0045h c0045h = this.f1317c;
        g gVar = c0045h.f1340b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1324b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1324b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1324b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = c0045h.f1339a;
                    i3 = dVar2.k;
                    c0045h.f1339a = i3 | i2;
                }
                i2 = c0045h.f1339a;
                i3 = bVar.f1332d;
                c0045h.f1339a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0045h c0045h = this.f1317c;
        g gVar = c0045h.f1340b;
        c0045h.f1342d = g(b.e.d.d.g.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = b.e.d.d.g.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c2 != null) {
            c0045h.f1341c = c2;
        }
        c0045h.f1343e = b.e.d.d.g.a(typedArray, xmlPullParser, "autoMirrored", 5, c0045h.f1343e);
        gVar.k = b.e.d.d.g.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float f2 = b.e.d.d.g.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = f2;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.i = typedArray.getDimension(3, gVar.i);
        float dimension = typedArray.getDimension(2, gVar.j);
        gVar.j = dimension;
        if (gVar.i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(b.e.d.d.g.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.n = string;
            gVar.p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1316b;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f1317c.f1340b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1319e;
        if (colorFilter == null) {
            colorFilter = this.f1318d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.j.width() * abs));
        int min2 = Math.min(2048, (int) (this.j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f1317c.c(min, min2);
        if (!this.g) {
            this.f1317c.j(min, min2);
        } else if (!this.f1317c.b()) {
            this.f1317c.j(min, min2);
            this.f1317c.i();
        }
        this.f1317c.d(canvas, colorFilter, this.j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1316b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f1317c.f1340b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1317c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1316b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f1319e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1316b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f1316b.getConstantState());
        }
        this.f1317c.f1339a = getChangingConfigurations();
        return this.f1317c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1317c.f1340b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1317c.f1340b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z) {
        this.g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0045h c0045h = this.f1317c;
        c0045h.f1340b = new g();
        TypedArray k2 = b.e.d.d.g.k(resources, theme, attributeSet, b.k.a.a.a.f1295a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        c0045h.f1339a = getChangingConfigurations();
        c0045h.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f1318d = j(this.f1318d, c0045h.f1341c, c0045h.f1342d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1316b;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f1317c.f1343e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0045h c0045h;
        ColorStateList colorStateList;
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0045h = this.f1317c) != null && (c0045h.g() || ((colorStateList = this.f1317c.f1341c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1320f && super.mutate() == this) {
            this.f1317c = new C0045h(this.f1317c);
            this.f1320f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0045h c0045h = this.f1317c;
        ColorStateList colorStateList = c0045h.f1341c;
        if (colorStateList != null && (mode = c0045h.f1342d) != null) {
            this.f1318d = j(this.f1318d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c0045h.g() || !c0045h.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f1317c.f1340b.getRootAlpha() != i2) {
            this.f1317c.f1340b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z);
        } else {
            this.f1317c.f1343e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1319e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        C0045h c0045h = this.f1317c;
        if (c0045h.f1341c != colorStateList) {
            c0045h.f1341c = colorStateList;
            this.f1318d = j(this.f1318d, colorStateList, c0045h.f1342d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        C0045h c0045h = this.f1317c;
        if (c0045h.f1342d != mode) {
            c0045h.f1342d = mode;
            this.f1318d = j(this.f1318d, c0045h.f1341c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
