package b.e.j;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.e.j.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static Field f1204a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1205b;

    /* renamed from: c, reason: collision with root package name */
    private static WeakHashMap<View, String> f1206c;

    /* renamed from: d, reason: collision with root package name */
    private static WeakHashMap<View, v> f1207d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f1208e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f1209f;
    private static ThreadLocal<Rect> g;

    /* loaded from: classes.dex */
    class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f1210a;

        a(o oVar) {
            this.f1210a = oVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f1210a.a(view, z.m(windowInsets)).l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f<Boolean> {
        b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.e.j.r.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.e.j.r.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b.e.j.r.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1211b = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    r.z(view, 16);
                }
                this.f1211b.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f1211b.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f1212a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f1213b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1214c;

        f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        f(int i, Class<T> cls, int i2, int i3) {
            this.f1212a = i;
            this.f1213b = cls;
            this.f1214c = i3;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f1214c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t = (T) view.getTag(this.f1212a);
            if (this.f1213b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    private static class g {
        static z a(View view, z zVar, Rect rect) {
            WindowInsets l = zVar.l();
            if (l != null) {
                return z.m(view.computeSystemWindowInsets(l, rect));
            }
            rect.setEmpty();
            return zVar;
        }
    }

    /* loaded from: classes.dex */
    private static class h {
        public static WindowInsets a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    private static class i {
        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    static class k {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f1215d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1216a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1217b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f1218c = null;

        k() {
        }

        static k a(View view) {
            k kVar = (k) view.getTag(b.e.b.tag_unhandled_key_event_manager);
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = new k();
            view.setTag(b.e.b.tag_unhandled_key_event_manager, kVar2);
            return kVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1216a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1217b == null) {
                this.f1217b = new SparseArray<>();
            }
            return this.f1217b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(b.e.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((j) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1216a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f1215d.isEmpty()) {
                return;
            }
            synchronized (f1215d) {
                if (this.f1216a == null) {
                    this.f1216a = new WeakHashMap<>();
                }
                for (int size = f1215d.size() - 1; size >= 0; size--) {
                    View view = f1215d.get(size).get();
                    if (view == null) {
                        f1215d.remove(size);
                    } else {
                        this.f1216a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1216a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c2));
                }
            }
            return c2 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1218c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1218c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && r.v(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        f1207d = null;
        f1209f = false;
        new e();
    }

    public static void A(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        if (i3 < 21) {
            c(view, i2);
            return;
        }
        Rect n = n();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            n.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !n.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, i2);
        if (z && n.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(n);
        }
    }

    public static z B(View view, z zVar) {
        WindowInsets l;
        if (Build.VERSION.SDK_INT >= 21 && (l = zVar.l()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(l);
            if (!onApplyWindowInsets.equals(l)) {
                return z.m(onApplyWindowInsets);
            }
        }
        return zVar;
    }

    private static f<CharSequence> C() {
        return new c(b.e.b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void E(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void F(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void G(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void H(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static f<Boolean> I() {
        return new b(b.e.b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void J(View view, b.e.j.a aVar) {
        if (aVar == null && (h(view) instanceof a.C0035a)) {
            aVar = new b.e.j.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void K(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof q) {
                ((q) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof q) {
                ((q) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static void N(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void O(View view, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(oVar));
            }
        }
    }

    public static void P(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void Q(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f1206c == null) {
            f1206c = new WeakHashMap<>();
        }
        f1206c.put(view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void R(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof b.e.j.i) {
            ((b.e.j.i) view).stopNestedScroll();
        }
    }

    private static void S(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    private static f<Boolean> a() {
        return new d(b.e.b.tag_accessibility_heading, Boolean.class, 28);
    }

    public static v b(View view) {
        if (f1207d == null) {
            f1207d = new WeakHashMap<>();
        }
        v vVar = f1207d.get(view);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(view);
        f1207d.put(view, vVar2);
        return vVar2;
    }

    private static void c(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            S(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                S((View) parent);
            }
        }
    }

    public static z d(View view, z zVar, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? g.a(view, zVar, rect) : zVar;
    }

    public static z e(View view, z zVar) {
        WindowInsets l;
        return (Build.VERSION.SDK_INT < 21 || (l = zVar.l()) == null || view.dispatchApplyWindowInsets(l).equals(l)) ? zVar : z.m(l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(view).b(view, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate h(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : i(view);
    }

    private static View.AccessibilityDelegate i(View view) {
        if (f1209f) {
            return null;
        }
        if (f1208e == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1208e = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1209f = true;
                return null;
            }
        }
        try {
            Object obj = f1208e.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1209f = true;
            return null;
        }
    }

    public static int j(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static CharSequence k(View view) {
        return C().d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof q) {
            return ((q) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PorterDuff.Mode m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof q) {
            return ((q) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    private static Rect n() {
        if (g == null) {
            g = new ThreadLocal<>();
        }
        Rect rect = g.get();
        if (rect == null) {
            rect = new Rect();
            g.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f1205b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f1204a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1205b = true;
        }
        Field field = f1204a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static z q(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return z.m(h.a(view));
        }
        return null;
    }

    public static String r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f1206c;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static boolean t(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean u(View view) {
        Boolean d2 = a().d(view);
        if (d2 == null) {
            return false;
        }
        return d2.booleanValue();
    }

    public static boolean v(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean w(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof b.e.j.i) {
            return ((b.e.j.i) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean y(View view) {
        Boolean d2 = I().d(view);
        if (d2 == null) {
            return false;
        }
        return d2.booleanValue();
    }

    static void z(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = k(view) != null;
            if (j(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }
}
