package b.k.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b extends g implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    private C0044b f1301c;

    /* renamed from: d, reason: collision with root package name */
    private Context f1302d;

    /* renamed from: e, reason: collision with root package name */
    private ArgbEvaluator f1303e;

    /* renamed from: f, reason: collision with root package name */
    final Drawable.Callback f1304f;

    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            b.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.k.a.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0044b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1306a;

        /* renamed from: b, reason: collision with root package name */
        h f1307b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f1308c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f1309d;

        /* renamed from: e, reason: collision with root package name */
        b.d.a<Animator, String> f1310e;

        public C0044b(Context context, C0044b c0044b, Drawable.Callback callback, Resources resources) {
            if (c0044b != null) {
                this.f1306a = c0044b.f1306a;
                h hVar = c0044b.f1307b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f1307b = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    h hVar2 = this.f1307b;
                    hVar2.mutate();
                    h hVar3 = hVar2;
                    this.f1307b = hVar3;
                    hVar3.setCallback(callback);
                    this.f1307b.setBounds(c0044b.f1307b.getBounds());
                    this.f1307b.h(false);
                }
                ArrayList<Animator> arrayList = c0044b.f1309d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1309d = new ArrayList<>(size);
                    this.f1310e = new b.d.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c0044b.f1309d.get(i);
                        Animator clone = animator.clone();
                        String str = c0044b.f1310e.get(animator);
                        clone.setTarget(this.f1307b.d(str));
                        this.f1309d.add(clone);
                        this.f1310e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f1308c == null) {
                this.f1308c = new AnimatorSet();
            }
            this.f1308c.playTogether(this.f1309d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1306a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1311a;

        public c(Drawable.ConstantState constantState) {
            this.f1311a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1311a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1311a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f1311a.newDrawable();
            bVar.f1316b = newDrawable;
            newDrawable.setCallback(bVar.f1304f);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f1311a.newDrawable(resources);
            bVar.f1316b = newDrawable;
            newDrawable.setCallback(bVar.f1304f);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f1311a.newDrawable(resources, theme);
            bVar.f1316b = newDrawable;
            newDrawable.setCallback(bVar.f1304f);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0044b c0044b, Resources resources) {
        this.f1303e = null;
        this.f1304f = new a();
        this.f1302d = context;
        if (c0044b != null) {
            this.f1301c = c0044b;
        } else {
            this.f1301c = new C0044b(context, c0044b, this.f1304f, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f1301c.f1307b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0044b c0044b = this.f1301c;
        if (c0044b.f1309d == null) {
            c0044b.f1309d = new ArrayList<>();
            this.f1301c.f1310e = new b.d.a<>();
        }
        this.f1301c.f1309d.add(animator);
        this.f1301c.f1310e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1303e == null) {
                    this.f1303e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1303e);
            }
        }
    }

    @Override // b.k.a.a.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1301c.f1307b.draw(canvas);
        if (this.f1301c.f1308c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1316b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f1301c.f1307b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1301c.f1306a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1316b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f1301c.f1307b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1316b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f1316b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1301c.f1307b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1301c.f1307b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.getOpacity() : this.f1301c.f1307b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = b.e.d.d.g.k(resources, theme, attributeSet, b.k.a.a.a.f1299e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b2 = h.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.f1304f);
                        h hVar = this.f1301c.f1307b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f1301c.f1307b = b2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, b.k.a.a.a.f1300f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1302d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f1301c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1316b;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f1301c.f1307b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1316b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1301c.f1308c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.isStateful() : this.f1301c.f1307b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1301c.f1307b.setBounds(rect);
        }
    }

    @Override // b.k.a.a.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.setLevel(i) : this.f1301c.f1307b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1316b;
        return drawable != null ? drawable.setState(iArr) : this.f1301c.f1307b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1301c.f1307b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z);
        } else {
            this.f1301c.f1307b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1301c.f1307b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i);
        } else {
            this.f1301c.f1307b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
        } else {
            this.f1301c.f1307b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
        } else {
            this.f1301c.f1307b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1301c.f1307b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f1301c.f1308c.isStarted()) {
                return;
            }
            this.f1301c.f1308c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1316b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1301c.f1308c.end();
        }
    }
}
