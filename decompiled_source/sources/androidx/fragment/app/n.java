package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f774a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final p f775b;

    /* renamed from: c, reason: collision with root package name */
    private static final p f776c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f777b;

        a(ArrayList arrayList) {
            this.f777b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.B(this.f777b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f779c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f780d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f781e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f782f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        b(Object obj, p pVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f778b = obj;
            this.f779c = pVar;
            this.f780d = view;
            this.f781e = fragment;
            this.f782f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f778b;
            if (obj != null) {
                this.f779c.p(obj, this.f780d);
                this.g.addAll(n.k(this.f779c, this.f778b, this.f781e, this.f782f, this.f780d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f780d);
                    this.f779c.q(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.f780d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f783b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f784c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f785d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b.d.a f786e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f787f;
        final /* synthetic */ p g;
        final /* synthetic */ Rect h;

        c(Fragment fragment, Fragment fragment2, boolean z, b.d.a aVar, View view, p pVar, Rect rect) {
            this.f783b = fragment;
            this.f784c = fragment2;
            this.f785d = z;
            this.f786e = aVar;
            this.f787f = view;
            this.g = pVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.f(this.f783b, this.f784c, this.f785d, this.f786e, false);
            View view = this.f787f;
            if (view != null) {
                this.g.k(view, this.h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f788b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.d.a f789c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f790d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f791e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f792f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        d(p pVar, b.d.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f788b = pVar;
            this.f789c = aVar;
            this.f790d = obj;
            this.f791e = eVar;
            this.f792f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.d.a<String, View> h = n.h(this.f788b, this.f789c, this.f790d, this.f791e);
            if (h != null) {
                this.f792f.addAll(h.values());
                this.f792f.add(this.g);
            }
            n.f(this.h, this.i, this.j, h, false);
            Object obj = this.f790d;
            if (obj != null) {
                this.f788b.z(obj, this.k, this.f792f);
                View t = n.t(h, this.f791e, this.l, this.j);
                if (t != null) {
                    this.f788b.k(t, this.m);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f793a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f794b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f795c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f796d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f797e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f798f;

        e() {
        }
    }

    static {
        f775b = Build.VERSION.SDK_INT >= 21 ? new o() : null;
        f776c = x();
    }

    private static void A(p pVar, Object obj, Object obj2, b.d.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
        pVar.v(obj, view);
        if (obj2 != null) {
            pVar.v(obj2, view);
        }
    }

    static void B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(i iVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (iVar.q < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(iVar.r.e());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                b.d.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                e eVar = (e) sparseArray.valueAt(i4);
                if (z) {
                    o(iVar, keyAt, eVar, view, d2);
                } else {
                    n(iVar, keyAt, eVar, view, d2);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, b.d.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l = aVar.l(size);
            if (collection.contains(b.e.j.r.r(l))) {
                arrayList.add(l);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (r10.l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0090, code lost:
    
        if (r10.z == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.m.a r17, android.util.SparseArray<androidx.fragment.app.n.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.b(androidx.fragment.app.a, androidx.fragment.app.m$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        int size = aVar.f762a.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.f762a.get(i), sparseArray, false, z);
        }
    }

    private static b.d.a<String, String> d(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        b.d.a<String, String> aVar = new b.d.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i4);
            if (aVar2.j(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.n;
                        arrayList4 = aVar2.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.n;
                        arrayList3 = aVar2.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        if (aVar.r.s.c()) {
            for (int size = aVar.f762a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f762a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, b.d.a<String, View> aVar, boolean z2) {
        androidx.core.app.g m = z ? fragment2.m() : fragment.m();
        if (m != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.i(i));
                arrayList.add(aVar.l(i));
            }
            if (z2) {
                m.f(arrayList2, arrayList, null);
            } else {
                m.e(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(p pVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!pVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static b.d.a<String, View> h(p pVar, b.d.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.g m;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = eVar.f793a;
        View E = fragment.E();
        if (aVar.isEmpty() || obj == null || E == null) {
            aVar.clear();
            return null;
        }
        b.d.a<String, View> aVar2 = new b.d.a<>();
        pVar.j(aVar2, E);
        androidx.fragment.app.a aVar3 = eVar.f795c;
        if (eVar.f794b) {
            m = fragment.o();
            arrayList = aVar3.n;
        } else {
            m = fragment.m();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        if (m != null) {
            m.c(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(b.e.j.r.r(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, b.e.j.r.r(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static b.d.a<String, View> i(p pVar, b.d.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.g o;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f796d;
        b.d.a<String, View> aVar2 = new b.d.a<>();
        pVar.j(aVar2, fragment.T0());
        androidx.fragment.app.a aVar3 = eVar.f798f;
        if (eVar.f797e) {
            o = fragment.m();
            arrayList = aVar3.o;
        } else {
            o = fragment.o();
            arrayList = aVar3.n;
        }
        aVar2.n(arrayList);
        if (o != null) {
            o.c(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(b.e.j.r.r(view))) {
                    aVar.put(b.e.j.r.r(view), aVar.remove(str));
                }
            }
        } else {
            aVar.n(aVar2.keySet());
        }
        return aVar2;
    }

    private static p j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object n = fragment.n();
            if (n != null) {
                arrayList.add(n);
            }
            Object z = fragment.z();
            if (z != null) {
                arrayList.add(z);
            }
            Object B = fragment.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (fragment2 != null) {
            Object l = fragment2.l();
            if (l != null) {
                arrayList.add(l);
            }
            Object w = fragment2.w();
            if (w != null) {
                arrayList.add(w);
            }
            Object A = fragment2.A();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        p pVar = f775b;
        if (pVar != null && g(pVar, arrayList)) {
            return f775b;
        }
        p pVar2 = f776c;
        if (pVar2 != null && g(pVar2, arrayList)) {
            return f776c;
        }
        if (f775b == null && f776c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View E = fragment.E();
        if (E != null) {
            pVar.f(arrayList2, E);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        pVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(p pVar, ViewGroup viewGroup, View view, b.d.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object u;
        b.d.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f793a;
        Fragment fragment2 = eVar.f796d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f794b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            u = null;
        } else {
            u = u(pVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        b.d.a<String, View> i = i(pVar, aVar2, u, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            rect = new Rect();
            pVar.y(obj3, view, arrayList);
            A(pVar, obj3, obj2, i, eVar.f797e, eVar.f798f);
            if (obj != null) {
                pVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        b.e.j.p.a(viewGroup, new d(pVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(p pVar, ViewGroup viewGroup, View view, b.d.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f793a;
        Fragment fragment2 = eVar.f796d;
        if (fragment != null) {
            fragment.T0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f794b;
        Object u = aVar.isEmpty() ? null : u(pVar, fragment, fragment2, z);
        b.d.a<String, View> i = i(pVar, aVar, u, eVar);
        b.d.a<String, View> h = h(pVar, aVar, u, eVar);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i, aVar.keySet());
            a(arrayList2, h, aVar.values());
            obj3 = u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            pVar.y(obj3, view, arrayList);
            A(pVar, obj3, obj2, i, eVar.f797e, eVar.f798f);
            Rect rect2 = new Rect();
            View t = t(h, eVar, obj, z);
            if (t != null) {
                pVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        b.e.j.p.a(viewGroup, new c(fragment, fragment2, z, h, view2, pVar, rect));
        return obj3;
    }

    private static void n(i iVar, int i, e eVar, View view, b.d.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        p j;
        Object obj;
        ViewGroup viewGroup = iVar.s.c() ? (ViewGroup) iVar.s.b(i) : null;
        if (viewGroup == null || (j = j((fragment2 = eVar.f796d), (fragment = eVar.f793a))) == null) {
            return;
        }
        boolean z = eVar.f794b;
        boolean z2 = eVar.f797e;
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l = l(j, viewGroup, view, aVar, eVar, arrayList, arrayList2, r, s);
        if (r == null && l == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList, view);
        Object obj2 = (k == null || k.isEmpty()) ? null : obj;
        j.a(r, view);
        Object v = v(j, r, obj2, l, fragment, eVar.f794b);
        if (v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j.t(v, r, arrayList3, obj2, k, l, arrayList2);
            z(j, viewGroup, fragment, view, arrayList2, r, arrayList3, obj2, k);
            j.w(viewGroup, arrayList2, aVar);
            j.c(viewGroup, v);
            j.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(i iVar, int i, e eVar, View view, b.d.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        p j;
        Object obj;
        ViewGroup viewGroup = iVar.s.c() ? (ViewGroup) iVar.s.b(i) : null;
        if (viewGroup == null || (j = j((fragment2 = eVar.f796d), (fragment = eVar.f793a))) == null) {
            return;
        }
        boolean z = eVar.f794b;
        boolean z2 = eVar.f797e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object r = r(j, fragment, z);
        Object s = s(j, fragment2, z2);
        Object m = m(j, viewGroup, view, aVar, eVar, arrayList2, arrayList, r, s);
        if (r == null && m == null) {
            obj = s;
            if (obj == null) {
                return;
            }
        } else {
            obj = s;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList2, view);
        ArrayList<View> k2 = k(j, r, fragment, arrayList, view);
        B(k2, 4);
        Object v = v(j, r, obj, m, fragment, z);
        if (v != null) {
            w(j, obj, fragment2, k);
            ArrayList<String> o = j.o(arrayList);
            j.t(v, r, k2, obj, k, m, arrayList);
            j.c(viewGroup, v);
            j.x(viewGroup, arrayList2, arrayList, o, aVar);
            B(k2, 0);
            j.z(m, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    private static String q(b.d.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.l(i))) {
                return aVar.i(i);
            }
        }
        return null;
    }

    private static Object r(p pVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return pVar.g(z ? fragment.w() : fragment.l());
    }

    private static Object s(p pVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return pVar.g(z ? fragment.z() : fragment.n());
    }

    static View t(b.d.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f795c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.n : aVar2.o).get(0));
    }

    private static Object u(p pVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return pVar.A(pVar.g(z ? fragment2.B() : fragment.A()));
    }

    private static Object v(p pVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.g() : fragment.f() ? pVar.n(obj2, obj, obj3) : pVar.m(obj2, obj, obj3);
    }

    private static void w(p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.l && fragment.z && fragment.N) {
            fragment.Z0(true);
            pVar.r(obj, fragment.E(), arrayList);
            b.e.j.p.a(fragment.G, new a(arrayList));
        }
    }

    private static p x() {
        try {
            return (p) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(b.d.a<String, String> aVar, b.d.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void z(p pVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        b.e.j.p.a(viewGroup, new b(obj, pVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
