package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, s, androidx.savedstate.b {
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    c L;
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    androidx.lifecycle.h S;
    q T;
    androidx.savedstate.a V;
    private int W;

    /* renamed from: c, reason: collision with root package name */
    Bundle f690c;

    /* renamed from: d, reason: collision with root package name */
    SparseArray<Parcelable> f691d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f692e;
    Bundle g;
    Fragment h;
    int j;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    i s;
    g t;
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    /* renamed from: b, reason: collision with root package name */
    int f689b = 0;

    /* renamed from: f, reason: collision with root package name */
    String f693f = UUID.randomUUID().toString();
    String i = null;
    private Boolean k = null;
    i u = new i();
    boolean E = true;
    boolean K = true;
    d.b R = d.b.RESUMED;
    androidx.lifecycle.l<androidx.lifecycle.g> U = new androidx.lifecycle.l<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.a();
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.fragment.app.d {
        b() {
        }

        @Override // androidx.fragment.app.d
        public View b(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.d
        public boolean c() {
            return Fragment.this.H != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        View f697a;

        /* renamed from: b, reason: collision with root package name */
        Animator f698b;

        /* renamed from: c, reason: collision with root package name */
        int f699c;

        /* renamed from: d, reason: collision with root package name */
        int f700d;

        /* renamed from: e, reason: collision with root package name */
        int f701e;

        /* renamed from: f, reason: collision with root package name */
        int f702f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        androidx.core.app.g o;
        androidx.core.app.g p;
        boolean q;
        e r;
        boolean s;

        c() {
            Object obj = Fragment.X;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    public Fragment() {
        F();
    }

    private void F() {
        this.S = new androidx.lifecycle.h(this);
        this.V = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.S.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, d.a aVar) {
                    View view;
                    if (aVar != d.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment H(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = f.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.Y0(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private c c() {
        if (this.L == null) {
            this.L = new c();
        }
        return this.L;
    }

    public Object A() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.N0();
        this.q = true;
        this.T = new q();
        View X2 = X(layoutInflater, viewGroup, bundle);
        this.H = X2;
        if (X2 != null) {
            this.T.b();
            this.U.h(this.T);
        } else {
            if (this.T.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.T = null;
        }
    }

    public Object B() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.l;
        return obj == X ? A() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B0() {
        this.u.y();
        this.S.i(d.a.ON_DESTROY);
        this.f689b = 0;
        this.F = false;
        this.Q = false;
        Y();
        if (this.F) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int C() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f699c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0() {
        this.u.z();
        if (this.H != null) {
            this.T.a(d.a.ON_DESTROY);
        }
        this.f689b = 1;
        this.F = false;
        a0();
        if (this.F) {
            b.i.a.a.b(this).c();
            this.q = false;
        } else {
            throw new r("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final Fragment D() {
        String str;
        Fragment fragment = this.h;
        if (fragment != null) {
            return fragment;
        }
        i iVar = this.s;
        if (iVar == null || (str = this.i) == null) {
            return null;
        }
        return iVar.h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0() {
        this.F = false;
        b0();
        this.P = null;
        if (this.F) {
            if (this.u.y0()) {
                return;
            }
            this.u.y();
            this.u = new i();
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onDetach()");
    }

    public View E() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater E0(Bundle bundle) {
        LayoutInflater c0 = c0(bundle);
        this.P = c0;
        return c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0() {
        onLowMemory();
        this.u.A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        F();
        this.f693f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new i();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G0(boolean z) {
        g0(z);
        this.u.B(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        return (this.D && this.E && h0(menuItem)) || this.u.Q(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I() {
        c cVar = this.L;
        if (cVar == null) {
            return false;
        }
        return cVar.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0(Menu menu) {
        if (this.z) {
            return;
        }
        if (this.D && this.E) {
            i0(menu);
        }
        this.u.R(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J() {
        return this.r > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0() {
        this.u.T();
        if (this.H != null) {
            this.T.a(d.a.ON_PAUSE);
        }
        this.S.i(d.a.ON_PAUSE);
        this.f689b = 3;
        this.F = false;
        j0();
        if (this.F) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K() {
        c cVar = this.L;
        if (cVar == null) {
            return false;
        }
        return cVar.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(boolean z) {
        k0(z);
        this.u.U(z);
    }

    public final boolean L() {
        i iVar = this.s;
        if (iVar == null) {
            return false;
        }
        return iVar.C0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean L0(Menu menu) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            l0(menu);
        }
        return z | this.u.V(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        this.u.N0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M0() {
        boolean A0 = this.s.A0(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != A0) {
            this.k = Boolean.valueOf(A0);
            m0(A0);
            this.u.W();
        }
    }

    public void N(Bundle bundle) {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0() {
        this.u.N0();
        this.u.f0();
        this.f689b = 4;
        this.F = false;
        o0();
        if (!this.F) {
            throw new r("Fragment " + this + " did not call through to super.onResume()");
        }
        this.S.i(d.a.ON_RESUME);
        if (this.H != null) {
            this.T.a(d.a.ON_RESUME);
        }
        this.u.X();
        this.u.f0();
    }

    public void O(int i, int i2, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(Bundle bundle) {
        p0(bundle);
        this.V.d(bundle);
        Parcelable Z0 = this.u.Z0();
        if (Z0 != null) {
            bundle.putParcelable("android:support:fragments", Z0);
        }
    }

    @Deprecated
    public void P(Activity activity) {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0() {
        this.u.N0();
        this.u.f0();
        this.f689b = 3;
        this.F = false;
        q0();
        if (this.F) {
            this.S.i(d.a.ON_START);
            if (this.H != null) {
                this.T.a(d.a.ON_START);
            }
            this.u.Y();
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onStart()");
    }

    public void Q(Context context) {
        this.F = true;
        g gVar = this.t;
        Activity d2 = gVar == null ? null : gVar.d();
        if (d2 != null) {
            this.F = false;
            P(d2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0() {
        this.u.a0();
        if (this.H != null) {
            this.T.a(d.a.ON_STOP);
        }
        this.S.i(d.a.ON_STOP);
        this.f689b = 2;
        this.F = false;
        r0();
        if (this.F) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onStop()");
    }

    public void R(Fragment fragment) {
    }

    public final androidx.fragment.app.c R0() {
        androidx.fragment.app.c e2 = e();
        if (e2 != null) {
            return e2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean S(MenuItem menuItem) {
        return false;
    }

    public final Context S0() {
        Context k = k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void T(Bundle bundle) {
        this.F = true;
        U0(bundle);
        if (this.u.B0(1)) {
            return;
        }
        this.u.w();
    }

    public final View T0() {
        View E = E();
        if (E != null) {
            return E;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animation U(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.X0(parcelable);
        this.u.w();
    }

    public Animator V(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f691d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f691d = null;
        }
        this.F = false;
        t0(bundle);
        if (this.F) {
            if (this.H != null) {
                this.T.a(d.a.ON_CREATE);
            }
        } else {
            throw new r("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void W(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(View view) {
        c().f697a = view;
    }

    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.W;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0(Animator animator) {
        c().f698b = animator;
    }

    public void Y() {
        this.F = true;
    }

    public void Y0(Bundle bundle) {
        if (this.s != null && L()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }

    public void Z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(boolean z) {
        c().s = z;
    }

    void a() {
        c cVar = this.L;
        e eVar = null;
        if (cVar != null) {
            cVar.q = false;
            e eVar2 = cVar.r;
            cVar.r = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.a();
        }
    }

    public void a0() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(int i) {
        if (this.L == null && i == 0) {
            return;
        }
        c().f700d = i;
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f689b);
        printWriter.print(" mWho=");
        printWriter.print(this.f693f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f690c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f690c);
        }
        if (this.f691d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f691d);
        }
        Fragment D = D();
        if (D != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(D);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (s() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(s());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (h() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(h());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(C());
        }
        if (k() != null) {
            b.i.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        this.u.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void b0() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(int i, int i2) {
        if (this.L == null && i == 0 && i2 == 0) {
            return;
        }
        c();
        c cVar = this.L;
        cVar.f701e = i;
        cVar.f702f = i2;
    }

    public LayoutInflater c0(Bundle bundle) {
        return r(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1(e eVar) {
        c();
        e eVar2 = this.L.r;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        c cVar = this.L;
        if (cVar.q) {
            cVar.r = eVar;
        }
        if (eVar != null) {
            eVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment d(String str) {
        return str.equals(this.f693f) ? this : this.u.l0(str);
    }

    public void d0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1(int i) {
        c().f699c = i;
    }

    public final androidx.fragment.app.c e() {
        g gVar = this.t;
        if (gVar == null) {
            return null;
        }
        return (androidx.fragment.app.c) gVar.d();
    }

    @Deprecated
    public void e0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void e1() {
        i iVar = this.s;
        if (iVar == null || iVar.r == null) {
            c().q = false;
        } else if (Looper.myLooper() != this.s.r.f().getLooper()) {
            this.s.r.f().postAtFrontOfQueue(new a());
        } else {
            a();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean f() {
        Boolean bool;
        c cVar = this.L;
        if (cVar == null || (bool = cVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void f0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        g gVar = this.t;
        Activity d2 = gVar == null ? null : gVar.d();
        if (d2 != null) {
            this.F = false;
            e0(d2, attributeSet, bundle);
        }
    }

    public boolean g() {
        Boolean bool;
        c cVar = this.L;
        if (cVar == null || (bool = cVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void g0(boolean z) {
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d getLifecycle() {
        return this.S;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.V.b();
    }

    @Override // androidx.lifecycle.s
    public androidx.lifecycle.r getViewModelStore() {
        i iVar = this.s;
        if (iVar != null) {
            return iVar.v0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View h() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.f697a;
    }

    public boolean h0(MenuItem menuItem) {
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator i() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.f698b;
    }

    public void i0(Menu menu) {
    }

    public final h j() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void j0() {
        this.F = true;
    }

    public Context k() {
        g gVar = this.t;
        if (gVar == null) {
            return null;
        }
        return gVar.e();
    }

    public void k0(boolean z) {
    }

    public Object l() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.g;
    }

    public void l0(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.g m() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.o;
    }

    public void m0(boolean z) {
    }

    public Object n() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.i;
    }

    public void n0(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.g o() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        return cVar.p;
    }

    public void o0() {
        this.F = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        R0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public final h p() {
        return this.s;
    }

    public void p0(Bundle bundle) {
    }

    public final Object q() {
        g gVar = this.t;
        if (gVar == null) {
            return null;
        }
        return gVar.i();
    }

    public void q0() {
        this.F = true;
    }

    @Deprecated
    public LayoutInflater r(Bundle bundle) {
        g gVar = this.t;
        if (gVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater j = gVar.j();
        i iVar = this.u;
        iVar.t0();
        b.e.j.f.b(j, iVar);
        return j;
    }

    public void r0() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f700d;
    }

    public void s0(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f701e;
    }

    public void t0(Bundle bundle) {
        this.F = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.e.i.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f693f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        c cVar = this.L;
        if (cVar == null) {
            return 0;
        }
        return cVar.f702f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u0(Bundle bundle) {
        this.u.N0();
        this.f689b = 2;
        this.F = false;
        N(bundle);
        if (this.F) {
            this.u.t();
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final Fragment v() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v0() {
        this.u.k(this.t, new b(), this);
        this.F = false;
        Q(this.t.e());
        if (this.F) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onAttach()");
    }

    public Object w() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.j;
        return obj == X ? n() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.u(configuration);
    }

    public final Resources x() {
        return S0().getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x0(MenuItem menuItem) {
        if (this.z) {
            return false;
        }
        return S(menuItem) || this.u.v(menuItem);
    }

    public final boolean y() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y0(Bundle bundle) {
        this.u.N0();
        this.f689b = 1;
        this.F = false;
        this.V.c(bundle);
        T(bundle);
        this.Q = true;
        if (this.F) {
            this.S.i(d.a.ON_CREATE);
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object z() {
        c cVar = this.L;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.h;
        return obj == X ? l() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z = true;
            W(menu, menuInflater);
        }
        return z | this.u.x(menu, menuInflater);
    }
}
