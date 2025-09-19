package b.e.d.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f1081a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f1082b;

        a(int i, int i2) {
            this.f1081a = new int[]{i, i2};
            this.f1082b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f1081a = new int[]{i, i2, i3};
            this.f1082b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1081a = new int[size];
            this.f1082b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1081a[i] = list.get(i).intValue();
                this.f1082b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k = g.k(resources, theme, attributeSet, b.e.c.GradientColor);
        float f2 = g.f(k, xmlPullParser, "startX", b.e.c.GradientColor_android_startX, 0.0f);
        float f3 = g.f(k, xmlPullParser, "startY", b.e.c.GradientColor_android_startY, 0.0f);
        float f4 = g.f(k, xmlPullParser, "endX", b.e.c.GradientColor_android_endX, 0.0f);
        float f5 = g.f(k, xmlPullParser, "endY", b.e.c.GradientColor_android_endY, 0.0f);
        float f6 = g.f(k, xmlPullParser, "centerX", b.e.c.GradientColor_android_centerX, 0.0f);
        float f7 = g.f(k, xmlPullParser, "centerY", b.e.c.GradientColor_android_centerY, 0.0f);
        int g = g.g(k, xmlPullParser, "type", b.e.c.GradientColor_android_type, 0);
        int b2 = g.b(k, xmlPullParser, "startColor", b.e.c.GradientColor_android_startColor, 0);
        boolean j = g.j(xmlPullParser, "centerColor");
        int b3 = g.b(k, xmlPullParser, "centerColor", b.e.c.GradientColor_android_centerColor, 0);
        int b4 = g.b(k, xmlPullParser, "endColor", b.e.c.GradientColor_android_endColor, 0);
        int g2 = g.g(k, xmlPullParser, "tileMode", b.e.c.GradientColor_android_tileMode, 0);
        float f8 = g.f(k, xmlPullParser, "gradientRadius", b.e.c.GradientColor_android_gradientRadius, 0.0f);
        k.recycle();
        a a2 = a(c(resources, xmlPullParser, attributeSet, theme), b2, b4, j, b3);
        if (g != 1) {
            return g != 2 ? new LinearGradient(f2, f3, f4, f5, a2.f1081a, a2.f1082b, d(g2)) : new SweepGradient(f6, f7, a2.f1081a, a2.f1082b);
        }
        if (f8 > 0.0f) {
            return new RadialGradient(f6, f7, f8, a2.f1081a, a2.f1082b, d(g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static b.e.d.d.d.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = b.e.c.GradientColorItem
            android.content.res.TypedArray r3 = b.e.d.d.g.k(r8, r11, r10, r3)
            int r5 = b.e.c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = b.e.c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = b.e.c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = b.e.c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            b.e.d.d.d$a r8 = new b.e.d.d.d$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.d.d.d.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b.e.d.d.d$a");
    }

    private static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
