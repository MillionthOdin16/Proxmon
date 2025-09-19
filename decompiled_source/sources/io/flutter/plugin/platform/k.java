package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.h;
import io.flutter.embedding.android.n;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.j.j;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.k;
import io.flutter.view.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class k implements j {

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.android.b f2747b;

    /* renamed from: c, reason: collision with root package name */
    private Context f2748c;

    /* renamed from: d, reason: collision with root package name */
    private View f2749d;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.view.f f2750e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.plugin.editing.d f2751f;
    private io.flutter.embedding.engine.j.j g;
    private int n = 0;
    private boolean o = false;
    private boolean p = true;
    private final j.e t = new a();

    /* renamed from: a, reason: collision with root package name */
    private final i f2746a = new i();
    final HashMap<Integer, l> i = new HashMap<>();
    private final d h = new d();
    private final HashMap<Context, View> j = new HashMap<>();
    private final SparseArray<io.flutter.embedding.android.h> m = new SparseArray<>();
    private HashSet<Integer> q = new HashSet<>();
    private HashSet<Integer> r = new HashSet<>();
    private final SparseArray<f> k = new SparseArray<>();
    private final SparseArray<io.flutter.embedding.engine.mutatorsstack.a> l = new SparseArray<>();
    private final n s = n.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements j.e {

        /* renamed from: io.flutter.plugin.platform.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0080a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f2753b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Runnable f2754c;

            RunnableC0080a(l lVar, Runnable runnable) {
                this.f2753b = lVar;
                this.f2754c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.b0(this.f2753b);
                this.f2754c.run();
            }
        }

        a() {
        }

        private void j(int i) {
            if (Build.VERSION.SDK_INT >= i) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + Build.VERSION.SDK_INT + ", required API level is: " + i);
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void a(int i) {
            View d2;
            f fVar = (f) k.this.k.get(i);
            if (fVar != null) {
                d2 = fVar.getView();
            } else {
                j(20);
                d2 = k.this.i.get(Integer.valueOf(i)).d();
            }
            d2.clearFocus();
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void b(boolean z) {
            k.this.p = z;
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void c(j.c cVar, Runnable runnable) {
            j(20);
            l lVar = k.this.i.get(Integer.valueOf(cVar.f2596a));
            if (lVar == null) {
                throw new IllegalStateException("Trying to resize a platform view with unknown id: " + cVar.f2596a);
            }
            int a0 = k.this.a0(cVar.f2597b);
            int a02 = k.this.a0(cVar.f2598c);
            k.this.d0(a0, a02);
            k.this.N(lVar);
            lVar.i(a0, a02, new RunnableC0080a(lVar, runnable));
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void d(int i) {
            f fVar = (f) k.this.k.get(i);
            io.flutter.embedding.engine.mutatorsstack.a aVar = (io.flutter.embedding.engine.mutatorsstack.a) k.this.l.get(i);
            if (fVar != null) {
                if (aVar != null) {
                    aVar.removeView(fVar.getView());
                }
                k.this.k.remove(i);
                fVar.dispose();
            }
            if (aVar != null) {
                aVar.c();
                ((ViewGroup) aVar.getParent()).removeView(aVar);
                k.this.l.remove(i);
            }
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void e(int i) {
            j(20);
            l lVar = k.this.i.get(Integer.valueOf(i));
            if (lVar == null) {
                throw new IllegalStateException("Trying to dispose a platform view with unknown id: " + i);
            }
            if (k.this.f2751f != null) {
                k.this.f2751f.l(i);
            }
            k.this.j.remove(lVar.d().getContext());
            lVar.c();
            k.this.i.remove(Integer.valueOf(i));
        }

        @Override // io.flutter.embedding.engine.j.j.e
        @TargetApi(17)
        public void f(int i, int i2) {
            if (!k.c0(i2)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
            }
            j(20);
            View d2 = k.this.i.get(Integer.valueOf(i)).d();
            if (d2 != null) {
                d2.setLayoutDirection(i2);
                return;
            }
            throw new IllegalStateException("Sending touch to an unknown view with id: " + i2);
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void g(j.b bVar) {
            j(19);
            if (!k.c0(bVar.f2594e)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + bVar.f2594e + "(view id: " + bVar.f2590a + ")");
            }
            g b2 = k.this.f2746a.b(bVar.f2591b);
            if (b2 != null) {
                k.this.k.put(bVar.f2590a, b2.create(k.this.f2748c, bVar.f2590a, bVar.f2595f != null ? b2.getCreateArgsCodec().a(bVar.f2595f) : null));
                return;
            }
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + bVar.f2591b);
        }

        @Override // io.flutter.embedding.engine.j.j.e
        @TargetApi(17)
        public long h(final j.b bVar) {
            j(20);
            if (!k.c0(bVar.f2594e)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + bVar.f2594e + "(view id: " + bVar.f2590a + ")");
            }
            if (k.this.i.containsKey(Integer.valueOf(bVar.f2590a))) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + bVar.f2590a);
            }
            g b2 = k.this.f2746a.b(bVar.f2591b);
            if (b2 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + bVar.f2591b);
            }
            Object a2 = bVar.f2595f != null ? b2.getCreateArgsCodec().a(bVar.f2595f) : null;
            int a0 = k.this.a0(bVar.f2592c);
            int a02 = k.this.a0(bVar.f2593d);
            k.this.d0(a0, a02);
            f.a b3 = k.this.f2750e.b();
            l a3 = l.a(k.this.f2748c, k.this.h, b2, b3, a0, a02, bVar.f2590a, a2, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.a
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    k.a.this.k(bVar, view, z);
                }
            });
            if (a3 == null) {
                throw new IllegalStateException("Failed creating virtual display for a " + bVar.f2591b + " with id: " + bVar.f2590a);
            }
            if (k.this.f2749d != null) {
                a3.e(k.this.f2749d);
            }
            k.this.i.put(Integer.valueOf(bVar.f2590a), a3);
            View d2 = a3.d();
            d2.setLayoutDirection(bVar.f2594e);
            k.this.j.put(d2.getContext(), d2);
            return b3.b();
        }

        @Override // io.flutter.embedding.engine.j.j.e
        public void i(j.d dVar) {
            int i = dVar.f2599a;
            float f2 = k.this.f2748c.getResources().getDisplayMetrics().density;
            j(20);
            if (k.this.i.containsKey(Integer.valueOf(i))) {
                k.this.i.get(Integer.valueOf(dVar.f2599a)).b(k.this.Z(f2, dVar, true));
            } else {
                if (k.this.k.get(i) == null) {
                    throw new IllegalStateException("Sending touch to an unknown view with id: " + i);
                }
                MotionEvent Z = k.this.Z(f2, dVar, false);
                View view = ((f) k.this.k.get(dVar.f2599a)).getView();
                if (view != null) {
                    view.dispatchTouchEvent(Z);
                }
            }
        }

        public /* synthetic */ void k(j.b bVar, View view, boolean z) {
            if (z) {
                k.this.g.d(bVar.f2590a);
            }
        }
    }

    private void F(boolean z) {
        for (int i = 0; i < this.m.size(); i++) {
            int keyAt = this.m.keyAt(i);
            io.flutter.embedding.android.h valueAt = this.m.valueAt(i);
            if (this.q.contains(Integer.valueOf(keyAt))) {
                ((io.flutter.embedding.android.k) this.f2749d).j(valueAt);
                z &= valueAt.d();
            } else {
                if (!this.o) {
                    valueAt.c();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            int keyAt2 = this.l.keyAt(i2);
            io.flutter.embedding.engine.mutatorsstack.a aVar = this.l.get(keyAt2);
            if (!this.r.contains(Integer.valueOf(keyAt2)) || (!z && this.p)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    private void G() {
        Iterator<l> it = this.i.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.i.clear();
        while (this.k.size() > 0) {
            this.t.d(this.k.keyAt(0));
        }
    }

    private float H() {
        return this.f2748c.getResources().getDisplayMetrics().density;
    }

    private void K() {
        if (!this.p || this.o) {
            return;
        }
        ((io.flutter.embedding.android.k) this.f2749d).m();
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(l lVar) {
        io.flutter.plugin.editing.d dVar = this.f2751f;
        if (dVar == null) {
            return;
        }
        dVar.u();
        lVar.g();
    }

    private static MotionEvent.PointerCoords V(Object obj, float f2) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f2;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f2;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f2;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f2;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f2;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f2;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> W(Object obj, float f2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(V(it.next(), f2));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties X(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> Y(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(X(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a0(double d2) {
        double H = H();
        Double.isNaN(H);
        return (int) Math.round(d2 * H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(l lVar) {
        io.flutter.plugin.editing.d dVar = this.f2751f;
        if (dVar == null) {
            return;
        }
        dVar.G();
        lVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c0(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i, int i2) {
        DisplayMetrics displayMetrics = this.f2748c.getResources().getDisplayMetrics();
        if (i2 > displayMetrics.heightPixels || i > displayMetrics.widthPixels) {
            d.a.b.f("PlatformViewsController", "Creating a virtual display of size: [" + i + ", " + i2 + "] may result in problems(https://github.com/flutter/flutter/issues/2897).It is larger than the device screen size: [" + displayMetrics.widthPixels + ", " + displayMetrics.heightPixels + "].");
        }
    }

    @TargetApi(19)
    public FlutterOverlaySurface A(io.flutter.embedding.android.h hVar) {
        int i = this.n;
        this.n = i + 1;
        this.m.put(i, hVar);
        return new FlutterOverlaySurface(i, hVar.getSurface());
    }

    public void B() {
        for (int i = 0; i < this.m.size(); i++) {
            this.m.keyAt(i);
            io.flutter.embedding.android.h valueAt = this.m.valueAt(i);
            valueAt.c();
            View view = this.f2749d;
            if (view != null) {
                ((io.flutter.embedding.android.k) view).removeView(valueAt);
            }
        }
        this.m.clear();
    }

    public void C() {
        io.flutter.embedding.engine.j.j jVar = this.g;
        if (jVar != null) {
            jVar.e(null);
        }
        B();
        this.g = null;
        this.f2748c = null;
        this.f2750e = null;
    }

    public void D() {
        B();
        this.f2749d = null;
        Iterator<l> it = this.i.values().iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void E() {
        this.f2751f = null;
    }

    public h I() {
        return this.f2746a;
    }

    void J(final int i) {
        f fVar = this.k.get(i);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.l.get(i) != null) {
            return;
        }
        if (fVar.getView() == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (fVar.getView().getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f2748c;
        io.flutter.embedding.engine.mutatorsstack.a aVar = new io.flutter.embedding.engine.mutatorsstack.a(context, context.getResources().getDisplayMetrics().density, this.f2747b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                k.this.L(i, view, z);
            }
        });
        this.l.put(i, aVar);
        aVar.addView(fVar.getView());
        ((io.flutter.embedding.android.k) this.f2749d).addView(aVar);
    }

    public /* synthetic */ void L(int i, View view, boolean z) {
        if (z) {
            this.g.d(i);
            return;
        }
        io.flutter.plugin.editing.d dVar = this.f2751f;
        if (dVar != null) {
            dVar.l(i);
        }
    }

    public /* synthetic */ void M() {
        F(false);
    }

    public void O() {
    }

    public void P() {
        this.q.clear();
        this.r.clear();
    }

    public void Q() {
        G();
    }

    public void R(int i, int i2, int i3, int i4, int i5) {
        if (this.m.get(i) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
        }
        K();
        io.flutter.embedding.android.h hVar = this.m.get(i);
        if (hVar.getParent() == null) {
            ((io.flutter.embedding.android.k) this.f2749d).addView(hVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        hVar.setLayoutParams(layoutParams);
        hVar.setVisibility(0);
        hVar.bringToFront();
        this.q.add(Integer.valueOf(i));
    }

    public void S(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        K();
        J(i);
        io.flutter.embedding.engine.mutatorsstack.a aVar = this.l.get(i);
        aVar.b(flutterMutatorsStack, i2, i3, i4, i5);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View view = this.k.get(i).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.r.add(Integer.valueOf(i));
    }

    public void T() {
        io.flutter.embedding.android.k kVar = (io.flutter.embedding.android.k) this.f2749d;
        boolean z = false;
        if (this.o && this.r.isEmpty()) {
            this.o = false;
            kVar.w(new Runnable() { // from class: io.flutter.plugin.platform.b
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.M();
                }
            });
        } else {
            if (this.o && kVar.g()) {
                z = true;
            }
            F(z);
        }
    }

    public void U() {
        G();
    }

    public MotionEvent Z(float f2, j.d dVar, boolean z) {
        MotionEvent b2 = this.s.b(n.a.c(dVar.p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) Y(dVar.f2604f).toArray(new MotionEvent.PointerProperties[dVar.f2603e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) W(dVar.g, f2).toArray(new MotionEvent.PointerCoords[dVar.f2603e]);
        return (z || b2 == null) ? MotionEvent.obtain(dVar.f2600b.longValue(), dVar.f2601c.longValue(), dVar.f2602d, dVar.f2603e, pointerPropertiesArr, pointerCoordsArr, dVar.h, dVar.i, dVar.j, dVar.k, dVar.l, dVar.m, dVar.n, dVar.o) : MotionEvent.obtain(b2.getDownTime(), b2.getEventTime(), b2.getAction(), dVar.f2603e, pointerPropertiesArr, pointerCoordsArr, b2.getMetaState(), b2.getButtonState(), b2.getXPrecision(), b2.getYPrecision(), b2.getDeviceId(), b2.getEdgeFlags(), b2.getSource(), b2.getFlags());
    }

    @Override // io.flutter.plugin.platform.j
    public void a(io.flutter.view.c cVar) {
        this.h.b(cVar);
    }

    @Override // io.flutter.plugin.platform.j
    public void b() {
        this.h.b(null);
    }

    @Override // io.flutter.plugin.platform.j
    public View c(Integer num) {
        if (this.k.get(num.intValue()) != null) {
            return this.k.get(num.intValue()).getView();
        }
        l lVar = this.i.get(num);
        if (lVar == null) {
            return null;
        }
        return lVar.d();
    }

    @Override // io.flutter.plugin.platform.j
    public boolean d(Integer num) {
        return this.i.containsKey(num);
    }

    public void u(Context context, io.flutter.view.f fVar, io.flutter.embedding.engine.f.a aVar) {
        if (this.f2748c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f2748c = context;
        this.f2750e = fVar;
        io.flutter.embedding.engine.j.j jVar = new io.flutter.embedding.engine.j.j(aVar);
        this.g = jVar;
        jVar.e(this.t);
    }

    public void v(io.flutter.plugin.editing.d dVar) {
        this.f2751f = dVar;
    }

    public void w(io.flutter.embedding.engine.renderer.a aVar) {
        this.f2747b = new io.flutter.embedding.android.b(aVar, true);
    }

    public void x(View view) {
        this.f2749d = view;
        Iterator<l> it = this.i.values().iterator();
        while (it.hasNext()) {
            it.next().e(view);
        }
    }

    public boolean y(View view) {
        if (view == null || !this.j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    public FlutterOverlaySurface z() {
        return A(new io.flutter.embedding.android.h(this.f2749d.getContext(), this.f2749d.getWidth(), this.f2749d.getHeight(), h.b.overlay));
    }
}
