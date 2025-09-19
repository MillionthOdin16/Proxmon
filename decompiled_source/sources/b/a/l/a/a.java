package b.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import b.a.l.a.b;
import b.a.l.a.d;
import b.d.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends b.a.l.a.d implements androidx.core.graphics.drawable.b {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f896a;

        b(Animatable animatable) {
            super();
            this.f896a = animatable;
        }

        @Override // b.a.l.a.a.g
        public void c() {
            this.f896a.start();
        }

        @Override // b.a.l.a.a.g
        public void d() {
            this.f896a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends d.a {
        b.d.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new b.d.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i, int i2) {
            return i2 | (i << 32);
        }

        int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.i(z, Integer.valueOf(i));
            return z;
        }

        int C(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a2;
            this.K.a(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.f(i, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i, int i2) {
            return (int) this.K.f(D(i, i2), -1L).longValue();
        }

        boolean H(int i, int i2) {
            return (this.K.f(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i, int i2) {
            return (this.K.f(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // b.a.l.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // b.a.l.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // b.a.l.a.d.a, b.a.l.a.b.c
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final b.k.a.a.b f897a;

        d(b.k.a.a.b bVar) {
            super();
            this.f897a = bVar;
        }

        @Override // b.a.l.a.a.g
        public void c() {
            this.f897a.start();
        }

        @Override // b.a.l.a.a.g
        public void d() {
            this.f897a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f898a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f899b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f899b = z2;
            this.f898a = ofInt;
        }

        @Override // b.a.l.a.a.g
        public boolean a() {
            return this.f899b;
        }

        @Override // b.a.l.a.a.g
        public void b() {
            this.f898a.reverse();
        }

        @Override // b.a.l.a.a.g
        public void c() {
            this.f898a.start();
        }

        @Override // b.a.l.a.a.g
        public void d() {
            this.f898a.cancel();
        }
    }

    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f900a;

        /* renamed from: b, reason: collision with root package name */
        private int f901b;

        /* renamed from: c, reason: collision with root package name */
        private int f902c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        int a() {
            return this.f902c;
        }

        int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f901b = numberOfFrames;
            int[] iArr = this.f900a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f900a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f900a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f902c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i = (int) ((f2 * this.f902c) + 0.5f);
            int i2 = this.f901b;
            int[] iArr = this.f900a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f902c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = b.k.a.a.h.c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r4.p.B(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 != 4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            int[] r0 = b.a.m.b.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = b.e.d.d.g.k(r6, r9, r8, r0)
            int r1 = b.a.m.b.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = b.a.m.b.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.m0 r3 = androidx.appcompat.widget.m0.h()
            android.graphics.drawable.Drawable r5 = r3.j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.k(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L70
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L57
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            b.k.a.a.h r5 = b.k.a.a.h.c(r6, r7, r8, r9)
            goto L70
        L47:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L52
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L70
        L52:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L70
        L57:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L70:
            if (r5 == 0) goto L79
            b.a.l.a.a$c r6 = r4.p
            int r5 = r6.B(r0, r5, r1)
            return r5
        L79:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            goto L93
        L92:
            throw r5
        L93:
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.l.a.a.q(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = b.k.a.a.b.a(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r3 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        return r7.p.C(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4 != 4) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int r(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = b.a.m.b.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = b.e.d.d.g.k(r9, r12, r11, r0)
            int r1 = b.a.m.b.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = b.a.m.b.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = b.a.m.b.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.m0 r5 = androidx.appcompat.widget.m0.h()
            android.graphics.drawable.Drawable r4 = r5.j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = b.a.m.b.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L78
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L5f
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            b.k.a.a.b r4 = b.k.a.a.b.a(r8, r9, r10, r11, r12)
            goto L78
        L4f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L5a
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L78
        L5a:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L78
        L5f:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L78:
            if (r4 == 0) goto La0
            if (r1 == r2) goto L85
            if (r3 == r2) goto L85
            b.a.l.a.a$c r8 = r7.p
            int r8 = r8.C(r1, r3, r4, r5)
            return r8
        L85:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La0:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            goto Lba
        Lb9:
            throw r8
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.l.a.a.r(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    private boolean s(int i) {
        int c2;
        int G;
        g bVar;
        g gVar = this.q;
        if (gVar == null) {
            c2 = c();
        } else {
            if (i == this.r) {
                return true;
            }
            if (i == this.s && gVar.a()) {
                gVar.b();
                this.r = this.s;
                this.s = i;
                return true;
            }
            c2 = this.r;
            gVar.d();
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int E = cVar.E(c2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else {
            if (!(current instanceof b.k.a.a.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((b.k.a.a.b) current);
        }
        bVar.c();
        this.q = bVar;
        this.s = c2;
        this.r = i;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f913d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.t(typedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.u(typedArray.getInt(b.a.m.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.v(typedArray.getInt(b.a.m.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.a.l.a.d, b.a.l.a.b
    public void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    @Override // b.a.l.a.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.a.l.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            g(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.a.l.a.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.p, this, null);
    }

    @Override // b.a.l.a.d, b.a.l.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.r();
                this.t = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k = b.e.d.d.g.k(resources, theme, attributeSet, b.a.m.b.AnimatedStateListDrawableCompat);
        setVisible(k.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_visible, true), true);
        t(k);
        i(resources);
        k.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.l.a.d, b.a.l.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.p.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // b.a.l.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
