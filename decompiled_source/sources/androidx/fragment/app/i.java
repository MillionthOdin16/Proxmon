package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.h implements LayoutInflater.Factory2 {
    static boolean I = false;
    static final Interpolator J = new DecelerateInterpolator(2.5f);
    static final Interpolator K = new DecelerateInterpolator(1.5f);
    ArrayList<androidx.fragment.app.a> A;
    ArrayList<Boolean> B;
    ArrayList<Fragment> C;
    ArrayList<l> F;
    private androidx.fragment.app.k G;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<k> f717d;

    /* renamed from: e, reason: collision with root package name */
    boolean f718e;
    ArrayList<androidx.fragment.app.a> i;
    ArrayList<Fragment> j;
    private OnBackPressedDispatcher k;
    ArrayList<androidx.fragment.app.a> m;
    ArrayList<Integer> n;
    ArrayList<h.b> o;
    androidx.fragment.app.g r;
    androidx.fragment.app.d s;
    Fragment t;
    Fragment u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    /* renamed from: f, reason: collision with root package name */
    int f719f = 0;
    final ArrayList<Fragment> g = new ArrayList<>();
    final HashMap<String, Fragment> h = new HashMap<>();
    private final androidx.activity.b l = new a(false);
    private final CopyOnWriteArrayList<C0017i> p = new CopyOnWriteArrayList<>();
    int q = 0;
    Bundle D = null;
    SparseArray<Parcelable> E = null;
    Runnable H = new b();

    /* loaded from: classes.dex */
    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            i.this.w0();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f722a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f723b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f723b.h() != null) {
                    c.this.f723b.W0(null);
                    c cVar = c.this;
                    i iVar = i.this;
                    Fragment fragment = cVar.f723b;
                    iVar.M0(fragment, fragment.C(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f722a = viewGroup;
            this.f723b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f722a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f726a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f728c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f726a = viewGroup;
            this.f727b = view;
            this.f728c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f726a.endViewTransition(this.f727b);
            Animator i = this.f728c.i();
            this.f728c.X0(null);
            if (i == null || this.f726a.indexOfChild(this.f727b) >= 0) {
                return;
            }
            i iVar = i.this;
            Fragment fragment = this.f728c;
            iVar.M0(fragment, fragment.C(), 0, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f730a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f731b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f732c;

        e(i iVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f730a = viewGroup;
            this.f731b = view;
            this.f732c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f730a.endViewTransition(this.f731b);
            animator.removeListener(this);
            Fragment fragment = this.f732c;
            View view = fragment.H;
            if (view == null || !fragment.z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends androidx.fragment.app.f {
        f() {
        }

        @Override // androidx.fragment.app.f
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.g gVar = i.this.r;
            return gVar.a(gVar.e(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f734a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f735b;

        g(Animator animator) {
            this.f734a = null;
            this.f735b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f734a = animation;
            this.f735b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ViewGroup f736b;

        /* renamed from: c, reason: collision with root package name */
        private final View f737c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f738d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f739e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f740f;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f740f = true;
            this.f736b = viewGroup;
            this.f737c = view;
            addAnimation(animation);
            this.f736b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f740f = true;
            if (this.f738d) {
                return !this.f739e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f738d = true;
                b.e.j.p.a(this.f736b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f740f = true;
            if (this.f738d) {
                return !this.f739e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f738d = true;
                b.e.j.p.a(this.f736b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f738d || !this.f740f) {
                this.f736b.endViewTransition(this.f737c);
                this.f739e = true;
            } else {
                this.f740f = false;
                this.f736b.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0017i {

        /* renamed from: a, reason: collision with root package name */
        final h.a f741a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f742b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f743a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l implements Fragment.e {

        /* renamed from: a, reason: collision with root package name */
        final boolean f744a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f745b;

        /* renamed from: c, reason: collision with root package name */
        private int f746c;

        l(androidx.fragment.app.a aVar, boolean z) {
            this.f744a = z;
            this.f745b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.e
        public void a() {
            int i = this.f746c - 1;
            this.f746c = i;
            if (i != 0) {
                return;
            }
            this.f745b.r.c1();
        }

        @Override // androidx.fragment.app.Fragment.e
        public void b() {
            this.f746c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f745b;
            aVar.r.q(aVar, this.f744a, false, false);
        }

        public void d() {
            boolean z = this.f746c > 0;
            i iVar = this.f745b.r;
            int size = iVar.g.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = iVar.g.get(i);
                fragment.c1(null);
                if (z && fragment.K()) {
                    fragment.e1();
                }
            }
            androidx.fragment.app.a aVar = this.f745b;
            aVar.r.q(aVar, this.f744a, !z, true);
        }

        public boolean e() {
            return this.f746c == 0;
        }
    }

    static g F0(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g H0(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(J);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void I0(b.d.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment h2 = bVar.h(i);
            if (!h2.l) {
                View T0 = h2.T0();
                h2.O = T0.getAlpha();
                T0.setAlpha(0.0f);
            }
        }
    }

    private boolean P0(String str, int i, int i2) {
        f0();
        d0(true);
        Fragment fragment = this.u;
        if (fragment != null && i < 0 && str == null && fragment.j().d()) {
            return true;
        }
        boolean Q0 = Q0(this.A, this.B, str, i, i2);
        if (Q0) {
            this.f718e = true;
            try {
                U0(this.A, this.B);
            } finally {
                p();
            }
        }
        k1();
        b0();
        m();
        return Q0;
    }

    private int R0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, b.d.b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.m() && !aVar.k(arrayList, i4 + 1, i2)) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                l lVar = new l(aVar, booleanValue);
                this.F.add(lVar);
                aVar.o(lVar);
                if (booleanValue) {
                    aVar.f();
                } else {
                    aVar.g(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                f(bVar);
            }
        }
        return i3;
    }

    private void S(Fragment fragment) {
        if (fragment == null || this.h.get(fragment.f693f) != fragment) {
            return;
        }
        fragment.M0();
    }

    private void U0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        i0(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).p) {
                if (i2 != i) {
                    h0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).p) {
                        i2++;
                    }
                }
                h0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            h0(arrayList, arrayList2, i2, size);
        }
    }

    public static int Y0(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void Z(int i) {
        try {
            this.f718e = true;
            K0(i, false);
            this.f718e = false;
            f0();
        } catch (Throwable th) {
            this.f718e = false;
            throw th;
        }
    }

    private void c0() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.h() != null) {
                    int C = fragment.C();
                    View h2 = fragment.h();
                    Animation animation = h2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        h2.clearAnimation();
                    }
                    fragment.W0(null);
                    M0(fragment, C, 0, 0, false);
                } else if (fragment.i() != null) {
                    fragment.i().end();
                }
            }
        }
    }

    private void d0(boolean z) {
        if (this.f718e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.r.f().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            o();
        }
        if (this.A == null) {
            this.A = new ArrayList<>();
            this.B = new ArrayList<>();
        }
        this.f718e = true;
        try {
            i0(null, null);
        } finally {
            this.f718e = false;
        }
    }

    private void f(b.d.b<Fragment> bVar) {
        int i = this.q;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment.f689b < min) {
                M0(fragment, min, fragment.s(), fragment.t(), false);
                if (fragment.H != null && !fragment.z && fragment.M) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void g0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            androidx.fragment.app.a aVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                aVar.c(-1);
                aVar.g(i == i2 + (-1));
            } else {
                aVar.c(1);
                aVar.f();
            }
            i++;
        }
    }

    private void h0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5 = i;
        boolean z = arrayList.get(i5).p;
        ArrayList<Fragment> arrayList3 = this.C;
        if (arrayList3 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.C.addAll(this.g);
        Fragment u0 = u0();
        boolean z2 = false;
        for (int i6 = i5; i6 < i2; i6++) {
            androidx.fragment.app.a aVar = arrayList.get(i6);
            u0 = !arrayList2.get(i6).booleanValue() ? aVar.h(this.C, u0) : aVar.p(this.C, u0);
            z2 = z2 || aVar.h;
        }
        this.C.clear();
        if (!z) {
            n.C(this, arrayList, arrayList2, i, i2, false);
        }
        g0(arrayList, arrayList2, i, i2);
        if (z) {
            b.d.b<Fragment> bVar = new b.d.b<>();
            f(bVar);
            int R0 = R0(arrayList, arrayList2, i, i2, bVar);
            I0(bVar);
            i3 = R0;
        } else {
            i3 = i2;
        }
        if (i3 != i5 && z) {
            n.C(this, arrayList, arrayList2, i, i3, true);
            K0(this.q, true);
        }
        while (i5 < i2) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && (i4 = aVar2.t) >= 0) {
                o0(i4);
                aVar2.t = -1;
            }
            aVar2.n();
            i5++;
        }
        if (z2) {
            W0();
        }
    }

    private void i0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<l> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            l lVar = this.F.get(i);
            if (arrayList == null || lVar.f744a || (indexOf2 = arrayList.indexOf(lVar.f745b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (lVar.e() || (arrayList != null && lVar.f745b.k(arrayList, 0, arrayList.size()))) {
                    this.F.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || lVar.f744a || (indexOf = arrayList.indexOf(lVar.f745b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        lVar.d();
                    }
                }
                i++;
            } else {
                this.F.remove(i);
                i--;
                size--;
            }
            lVar.c();
            i++;
        }
    }

    private void i1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b.e.i.b("FragmentManager"));
        androidx.fragment.app.g gVar = this.r;
        try {
            if (gVar != null) {
                gVar.h("  ", null, printWriter, new String[0]);
            } else {
                a("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    private void j(Fragment fragment, g gVar, int i) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        fragment.d1(i);
        if (gVar.f734a != null) {
            h hVar = new h(gVar.f734a, viewGroup, view);
            fragment.W0(fragment.H);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.H.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f735b;
        fragment.X0(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.H);
        animator.start();
    }

    public static int j1(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private void k1() {
        ArrayList<k> arrayList = this.f717d;
        if (arrayList == null || arrayList.isEmpty()) {
            this.l.f(q0() > 0 && A0(this.t));
        } else {
            this.l.f(true);
        }
    }

    private void m() {
        this.h.values().removeAll(Collections.singleton(null));
    }

    private Fragment m0(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.g.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.g.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void n0() {
        if (this.F != null) {
            while (!this.F.isEmpty()) {
                this.F.remove(0).d();
            }
        }
    }

    private void o() {
        if (C0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void p() {
        this.f718e = false;
        this.B.clear();
        this.A.clear();
    }

    private boolean p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f717d != null && this.f717d.size() != 0) {
                int size = this.f717d.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.f717d.get(i).a(arrayList, arrayList2);
                }
                this.f717d.clear();
                this.r.f().removeCallbacks(this.H);
                return z;
            }
            return false;
        }
    }

    private boolean z0(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.n();
    }

    public void A() {
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null) {
                fragment.F0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        i iVar = fragment.s;
        return fragment == iVar.u0() && A0(iVar.t);
    }

    public void B(boolean z) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.g.get(size);
            if (fragment != null) {
                fragment.G0(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B0(int i) {
        return this.q >= i;
    }

    void C(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).C(fragment, bundle, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.a(this, fragment, bundle);
            }
        }
    }

    public boolean C0() {
        return this.w || this.x;
    }

    void D(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).D(fragment, context, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.b(this, fragment, context);
            }
        }
    }

    g D0(Fragment fragment, int i, boolean z, int i2) {
        int j1;
        int s = fragment.s();
        boolean z2 = false;
        fragment.a1(0);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation U = fragment.U(i, z, s);
        if (U != null) {
            return new g(U);
        }
        Animator V = fragment.V(i, z, s);
        if (V != null) {
            return new g(V);
        }
        if (s != 0) {
            boolean equals = "anim".equals(this.r.e().getResources().getResourceTypeName(s));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.r.e(), s);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.r.e(), s);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.r.e(), s);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2);
                    }
                }
            }
        }
        if (i == 0 || (j1 = j1(i, z)) < 0) {
            return null;
        }
        switch (j1) {
            case 1:
                return H0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return H0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return H0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return H0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return F0(0.0f, 1.0f);
            case 6:
                return F0(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.r.l()) {
                    this.r.k();
                }
                return null;
        }
    }

    void E(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).E(fragment, bundle, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.c(this, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E0(Fragment fragment) {
        if (this.h.get(fragment.f693f) != null) {
            return;
        }
        this.h.put(fragment.f693f, fragment);
        if (fragment.C) {
            if (fragment.B) {
                i(fragment);
            } else {
                V0(fragment);
            }
            fragment.C = false;
        }
        if (I) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void F(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).F(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.d(this, fragment);
            }
        }
    }

    void G(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).G(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.e(this, fragment);
            }
        }
    }

    void G0(Fragment fragment) {
        if (this.h.get(fragment.f693f) == null) {
            return;
        }
        if (I) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment.f693f.equals(fragment2.i)) {
                fragment2.h = fragment;
                fragment2.i = null;
            }
        }
        this.h.put(fragment.f693f, null);
        V0(fragment);
        String str = fragment.i;
        if (str != null) {
            fragment.h = this.h.get(str);
        }
        fragment.G();
    }

    void H(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).H(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.f(this, fragment);
            }
        }
    }

    void I(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).I(fragment, context, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.g(this, fragment, context);
            }
        }
    }

    void J(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).J(fragment, bundle, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.h(this, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.h.containsKey(fragment.f693f)) {
            if (I) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
                return;
            }
            return;
        }
        int i = this.q;
        if (fragment.m) {
            i = fragment.J() ? Math.min(i, 1) : Math.min(i, 0);
        }
        M0(fragment, i, fragment.t(), fragment.u(), false);
        if (fragment.H != null) {
            Fragment m0 = m0(fragment);
            if (m0 != null) {
                View view = m0.H;
                ViewGroup viewGroup = fragment.G;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.H);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.H, indexOfChild);
                }
            }
            if (fragment.M && fragment.G != null) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                fragment.O = 0.0f;
                fragment.M = false;
                g D0 = D0(fragment, fragment.t(), true, fragment.u());
                if (D0 != null) {
                    Animation animation = D0.f734a;
                    if (animation != null) {
                        fragment.H.startAnimation(animation);
                    } else {
                        D0.f735b.setTarget(fragment.H);
                        D0.f735b.start();
                    }
                }
            }
        }
        if (fragment.N) {
            r(fragment);
        }
    }

    void K(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).K(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.i(this, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(int i, boolean z) {
        androidx.fragment.app.g gVar;
        if (this.r == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.q) {
            this.q = i;
            int size = this.g.size();
            for (int i2 = 0; i2 < size; i2++) {
                J0(this.g.get(i2));
            }
            for (Fragment fragment : this.h.values()) {
                if (fragment != null && (fragment.m || fragment.A)) {
                    if (!fragment.M) {
                        J0(fragment);
                    }
                }
            }
            h1();
            if (this.v && (gVar = this.r) != null && this.q == 4) {
                gVar.n();
                this.v = false;
            }
        }
    }

    void L(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).L(fragment, bundle, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.j(this, fragment, bundle);
            }
        }
    }

    void L0(Fragment fragment) {
        M0(fragment, this.q, 0, 0, false);
    }

    void M(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).M(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.k(this, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 != 3) goto L268;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.M0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void N(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).N(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.l(this, fragment);
            }
        }
    }

    public void N0() {
        this.w = false;
        this.x = false;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null) {
                fragment.M();
            }
        }
    }

    void O(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).O(fragment, view, bundle, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.m(this, fragment, view, bundle);
            }
        }
    }

    public void O0(Fragment fragment) {
        if (fragment.J) {
            if (this.f718e) {
                this.z = true;
            } else {
                fragment.J = false;
                M0(fragment, this.q, 0, 0, false);
            }
        }
    }

    void P(Fragment fragment, boolean z) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            androidx.fragment.app.h p = fragment2.p();
            if (p instanceof i) {
                ((i) p).P(fragment, true);
            }
        }
        Iterator<C0017i> it = this.p.iterator();
        while (it.hasNext()) {
            C0017i next = it.next();
            if (!z || next.f742b) {
                next.f741a.n(this, fragment);
            }
        }
    }

    public boolean Q(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null && fragment.H0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean Q0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.i;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.i.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.i.get(size2);
                    if ((str != null && str.equals(aVar.i())) || (i >= 0 && i == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.i.get(size2);
                        if (str == null || !str.equals(aVar2.i())) {
                            if (i < 0 || i != aVar2.t) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.i.size() - 1) {
                return false;
            }
            for (int size3 = this.i.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.i.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void R(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null) {
                fragment.I0(menu);
            }
        }
    }

    public void S0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.s == this) {
            bundle.putString(str, fragment.f693f);
            return;
        }
        i1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    public void T() {
        Z(3);
    }

    public void T0(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.J();
        if (!fragment.A || z) {
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (z0(fragment)) {
                this.v = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    public void U(boolean z) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.g.get(size);
            if (fragment != null) {
                fragment.K0(z);
            }
        }
    }

    public boolean V(Menu menu) {
        if (this.q < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null && fragment.L0(menu)) {
                z = true;
            }
        }
        return z;
    }

    void V0(Fragment fragment) {
        if (C0()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.G.k(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        k1();
        S(this.u);
    }

    void W0() {
        if (this.o != null) {
            for (int i = 0; i < this.o.size(); i++) {
                this.o.get(i).a();
            }
        }
    }

    public void X() {
        this.w = false;
        this.x = false;
        Z(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0(Parcelable parcelable) {
        androidx.fragment.app.l lVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.j jVar = (androidx.fragment.app.j) parcelable;
        if (jVar.f747b == null) {
            return;
        }
        for (Fragment fragment : this.G.h()) {
            if (I) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.l> it = jVar.f747b.iterator();
            while (true) {
                if (it.hasNext()) {
                    lVar = it.next();
                    if (lVar.f758c.equals(fragment.f693f)) {
                        break;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar == null) {
                if (I) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + jVar.f747b);
                }
                M0(fragment, 1, 0, 0, false);
                fragment.m = true;
                M0(fragment, 0, 0, 0, false);
            } else {
                lVar.o = fragment;
                fragment.f691d = null;
                fragment.r = 0;
                fragment.o = false;
                fragment.l = false;
                Fragment fragment2 = fragment.h;
                fragment.i = fragment2 != null ? fragment2.f693f : null;
                fragment.h = null;
                Bundle bundle = lVar.n;
                if (bundle != null) {
                    bundle.setClassLoader(this.r.e().getClassLoader());
                    fragment.f691d = lVar.n.getSparseParcelableArray("android:view_state");
                    fragment.f690c = lVar.n;
                }
            }
        }
        this.h.clear();
        Iterator<androidx.fragment.app.l> it2 = jVar.f747b.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.l next = it2.next();
            if (next != null) {
                Fragment a2 = next.a(this.r.e().getClassLoader(), b());
                a2.s = this;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a2.f693f + "): " + a2);
                }
                this.h.put(a2.f693f, a2);
                next.o = null;
            }
        }
        this.g.clear();
        ArrayList<String> arrayList = jVar.f748c;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.h.get(next2);
                if (fragment3 == null) {
                    i1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                    throw null;
                }
                fragment3.l = true;
                if (I) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.g.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.g) {
                    this.g.add(fragment3);
                }
            }
        }
        if (jVar.f749d != null) {
            this.i = new ArrayList<>(jVar.f749d.length);
            int i = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = jVar.f749d;
                if (i >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a3 = bVarArr[i].a(this);
                if (I) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + a3.t + "): " + a3);
                    PrintWriter printWriter = new PrintWriter(new b.e.i.b("FragmentManager"));
                    a3.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.i.add(a3);
                int i2 = a3.t;
                if (i2 >= 0) {
                    d1(i2, a3);
                }
                i++;
            }
        } else {
            this.i = null;
        }
        String str = jVar.f750e;
        if (str != null) {
            Fragment fragment4 = this.h.get(str);
            this.u = fragment4;
            S(fragment4);
        }
        this.f719f = jVar.f751f;
    }

    public void Y() {
        this.w = false;
        this.x = false;
        Z(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable Z0() {
        ArrayList<String> arrayList;
        int size;
        n0();
        c0();
        f0();
        this.w = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.h.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.l> arrayList2 = new ArrayList<>(this.h.size());
        boolean z = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.s != this) {
                    i1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
                androidx.fragment.app.l lVar = new androidx.fragment.app.l(fragment);
                arrayList2.add(lVar);
                if (fragment.f689b <= 0 || lVar.n != null) {
                    lVar.n = fragment.f690c;
                } else {
                    lVar.n = a1(fragment);
                    String str = fragment.i;
                    if (str != null) {
                        Fragment fragment2 = this.h.get(str);
                        if (fragment2 == null) {
                            i1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                            throw null;
                        }
                        if (lVar.n == null) {
                            lVar.n = new Bundle();
                        }
                        S0(lVar.n, "android:target_state", fragment2);
                        int i = fragment.j;
                        if (i != 0) {
                            lVar.n.putInt("android:target_req_state", i);
                        }
                    }
                }
                if (I) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + lVar.n);
                }
                z = true;
            }
        }
        if (!z) {
            if (I) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.g.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.g.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f693f);
                if (next.s != this) {
                    i1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                }
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f693f + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.i;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.i.get(i2));
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.i.get(i2));
                }
            }
        }
        androidx.fragment.app.j jVar = new androidx.fragment.app.j();
        jVar.f747b = arrayList2;
        jVar.f748c = arrayList;
        jVar.f749d = bVarArr;
        Fragment fragment3 = this.u;
        if (fragment3 != null) {
            jVar.f750e = fragment3.f693f;
        }
        jVar.f751f = this.f719f;
        return jVar;
    }

    @Override // androidx.fragment.app.h
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.h.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.h.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.b(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.g.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size5; i++) {
                Fragment fragment2 = this.g.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.j;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size4; i2++) {
                Fragment fragment3 = this.j.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.i;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                androidx.fragment.app.a aVar = this.i.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.d(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.m != null && (size2 = this.m.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj = (androidx.fragment.app.a) this.m.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.n != null && this.n.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.n.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.f717d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i5 = 0; i5 < size; i5++) {
                Object obj2 = (k) this.f717d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public void a0() {
        this.x = true;
        Z(2);
    }

    Bundle a1(Fragment fragment) {
        if (this.D == null) {
            this.D = new Bundle();
        }
        fragment.O0(this.D);
        L(fragment, this.D, false);
        Bundle bundle = null;
        if (!this.D.isEmpty()) {
            Bundle bundle2 = this.D;
            this.D = null;
            bundle = bundle2;
        }
        if (fragment.H != null) {
            b1(fragment);
        }
        if (fragment.f691d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f691d);
        }
        if (!fragment.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.K);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.h
    public androidx.fragment.app.f b() {
        if (super.b() == androidx.fragment.app.h.f715c) {
            Fragment fragment = this.t;
            if (fragment != null) {
                return fragment.s.b();
            }
            e(new f());
        }
        return super.b();
    }

    void b0() {
        if (this.z) {
            this.z = false;
            h1();
        }
    }

    void b1(Fragment fragment) {
        if (fragment.I == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.E;
        if (sparseArray == null) {
            this.E = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.I.saveHierarchyState(this.E);
        if (this.E.size() > 0) {
            fragment.f691d = this.E;
            this.E = null;
        }
    }

    @Override // androidx.fragment.app.h
    public List<Fragment> c() {
        List<Fragment> list;
        if (this.g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.g) {
            list = (List) this.g.clone();
        }
        return list;
    }

    void c1() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.F == null || this.F.isEmpty()) ? false : true;
            if (this.f717d != null && this.f717d.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.r.f().removeCallbacks(this.H);
                this.r.f().post(this.H);
                k1();
            }
        }
    }

    @Override // androidx.fragment.app.h
    public boolean d() {
        o();
        return P0(null, -1, 0);
    }

    public void d1(int i, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int size = this.m.size();
            if (i < size) {
                if (I) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + aVar);
                }
                this.m.set(i, aVar);
            } else {
                while (size < i) {
                    this.m.add(null);
                    if (this.n == null) {
                        this.n = new ArrayList<>();
                    }
                    if (I) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.n.add(Integer.valueOf(size));
                    size++;
                }
                if (I) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + aVar);
                }
                this.m.add(aVar);
            }
        }
    }

    void e0(Fragment fragment) {
        if (!fragment.n || fragment.q) {
            return;
        }
        fragment.A0(fragment.E0(fragment.f690c), null, fragment.f690c);
        View view = fragment.H;
        if (view == null) {
            fragment.I = null;
            return;
        }
        fragment.I = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.z) {
            fragment.H.setVisibility(8);
        }
        fragment.s0(fragment.H, fragment.f690c);
        O(fragment, fragment.H, fragment.f690c, false);
    }

    public void e1(Fragment fragment, d.b bVar) {
        if (this.h.get(fragment.f693f) == fragment && (fragment.t == null || fragment.p() == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean f0() {
        d0(true);
        boolean z = false;
        while (p0(this.A, this.B)) {
            this.f718e = true;
            try {
                U0(this.A, this.B);
                p();
                z = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        k1();
        b0();
        m();
        return z;
    }

    public void f1(Fragment fragment) {
        if (fragment == null || (this.h.get(fragment.f693f) == fragment && (fragment.t == null || fragment.p() == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            S(fragment2);
            S(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(androidx.fragment.app.a aVar) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(aVar);
    }

    public void g1(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.N = !fragment.N;
        }
    }

    public void h(Fragment fragment, boolean z) {
        if (I) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        E0(fragment);
        if (fragment.A) {
            return;
        }
        if (this.g.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.g) {
            this.g.add(fragment);
        }
        fragment.l = true;
        fragment.m = false;
        if (fragment.H == null) {
            fragment.N = false;
        }
        if (z0(fragment)) {
            this.v = true;
        }
        if (z) {
            L0(fragment);
        }
    }

    void h1() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                O0(fragment);
            }
        }
    }

    void i(Fragment fragment) {
        if (C0()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.G.d(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public Fragment j0(int i) {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.g.get(size);
            if (fragment != null && fragment.w == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment2.w == i) {
                return fragment2;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(androidx.fragment.app.g gVar, androidx.fragment.app.d dVar, Fragment fragment) {
        if (this.r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.r = gVar;
        this.s = dVar;
        this.t = fragment;
        if (fragment != null) {
            k1();
        }
        if (gVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) gVar;
            this.k = cVar.getOnBackPressedDispatcher();
            Fragment fragment2 = cVar;
            if (fragment != null) {
                fragment2 = fragment;
            }
            this.k.a(fragment2, this.l);
        }
        this.G = fragment != null ? fragment.s.r0(fragment) : gVar instanceof s ? androidx.fragment.app.k.g(((s) gVar).getViewModelStore()) : new androidx.fragment.app.k(false);
    }

    public Fragment k0(String str) {
        if (str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && str.equals(fragment2.y)) {
                return fragment2;
            }
        }
        return null;
    }

    public void l(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (I) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.g) {
                this.g.add(fragment);
            }
            fragment.l = true;
            if (z0(fragment)) {
                this.v = true;
            }
        }
    }

    public Fragment l0(String str) {
        Fragment d2;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && (d2 = fragment.d(str)) != null) {
                return d2;
            }
        }
        return null;
    }

    boolean n() {
        boolean z = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                z = z0(fragment);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void o0(int i) {
        synchronized (this) {
            this.m.set(i, null);
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            if (I) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.n.add(Integer.valueOf(i));
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f743a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.f.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment j0 = resourceId != -1 ? j0(resourceId) : null;
        if (j0 == null && string != null) {
            j0 = k0(string);
        }
        if (j0 == null && id != -1) {
            j0 = j0(id);
        }
        if (I) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + j0);
        }
        if (j0 == null) {
            j0 = b().a(context.getClassLoader(), str2);
            j0.n = true;
            j0.w = resourceId != 0 ? resourceId : id;
            j0.x = id;
            j0.y = string;
            j0.o = true;
            j0.s = this;
            androidx.fragment.app.g gVar = this.r;
            j0.t = gVar;
            j0.f0(gVar.e(), attributeSet, j0.f690c);
            h(j0, true);
        } else {
            if (j0.o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            j0.o = true;
            androidx.fragment.app.g gVar2 = this.r;
            j0.t = gVar2;
            j0.f0(gVar2.e(), attributeSet, j0.f690c);
        }
        Fragment fragment = j0;
        if (this.q >= 1 || !fragment.n) {
            L0(fragment);
        } else {
            M0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    void q(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.g(z3);
        } else {
            aVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            n.C(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            K0(this.q, true);
        }
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && fragment.H != null && fragment.M && aVar.j(fragment.x)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z3) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    public int q0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void r(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            g D0 = D0(fragment, fragment.t(), !fragment.z, fragment.u());
            if (D0 == null || (animator = D0.f735b) == null) {
                if (D0 != null) {
                    fragment.H.startAnimation(D0.f734a);
                    D0.f734a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.I()) ? 0 : 8);
                if (fragment.I()) {
                    fragment.Z0(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.I()) {
                    fragment.Z0(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    D0.f735b.addListener(new e(this, viewGroup, view, fragment));
                }
                D0.f735b.start();
            }
        }
        if (fragment.l && z0(fragment)) {
            this.v = true;
        }
        fragment.N = false;
        fragment.d0(fragment.z);
    }

    androidx.fragment.app.k r0(Fragment fragment) {
        return this.G.f(fragment);
    }

    public void s(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        if (fragment.l) {
            if (I) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (z0(fragment)) {
                this.v = true;
            }
            fragment.l = false;
        }
    }

    public Fragment s0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.h.get(string);
        if (fragment != null) {
            return fragment;
        }
        i1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public void t() {
        this.w = false;
        this.x = false;
        Z(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 t0() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.t;
        if (obj == null) {
            obj = this.r;
        }
        b.e.i.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u(Configuration configuration) {
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null) {
                fragment.w0(configuration);
            }
        }
    }

    public Fragment u0() {
        return this.u;
    }

    public boolean v(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null && fragment.x0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.r v0(Fragment fragment) {
        return this.G.i(fragment);
    }

    public void w() {
        this.w = false;
        this.x = false;
        Z(1);
    }

    void w0() {
        f0();
        if (this.l.c()) {
            d();
        } else {
            this.k.c();
        }
    }

    public boolean x(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null && fragment.z0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                Fragment fragment2 = this.j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.Z();
                }
            }
        }
        this.j = arrayList;
        return z;
    }

    public void x0(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.z) {
            return;
        }
        fragment.z = true;
        fragment.N = true ^ fragment.N;
    }

    public void y() {
        this.y = true;
        f0();
        Z(0);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.k != null) {
            this.l.d();
            this.k = null;
        }
    }

    public boolean y0() {
        return this.y;
    }

    public void z() {
        Z(1);
    }
}
