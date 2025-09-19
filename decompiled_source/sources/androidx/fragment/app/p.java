package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b.e.j.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class p {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f809b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f810c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f811d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f812e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f813f;

        a(p pVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f809b = i;
            this.f810c = arrayList;
            this.f811d = arrayList2;
            this.f812e = arrayList3;
            this.f813f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f809b; i++) {
                b.e.j.r.Q((View) this.f810c.get(i), (String) this.f811d.get(i));
                b.e.j.r.Q((View) this.f812e.get(i), (String) this.f813f.get(i));
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f815c;

        b(p pVar, ArrayList arrayList, Map map) {
            this.f814b = arrayList;
            this.f815c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f814b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f814b.get(i);
                String r = b.e.j.r.r(view);
                if (r != null) {
                    b.e.j.r.Q(view, p.i(this.f815c, r));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f817c;

        c(p pVar, ArrayList arrayList, Map map) {
            this.f816b = arrayList;
            this.f817c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f816b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f816b.get(i);
                b.e.j.r.Q(view, (String) this.f817c.get(b.e.j.r.r(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            View view2 = view;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean a2 = t.a(viewGroup);
                view2 = viewGroup;
                if (!a2) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        f(arrayList, viewGroup.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String r = b.e.j.r.r(view);
            if (r != null) {
                map.put(r, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(b.e.j.r.r(view));
            b.e.j.r.Q(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        b.e.j.p.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        b.e.j.p.a(view, new b(this, arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String r = b.e.j.r.r(view2);
            arrayList4.add(r);
            if (r != null) {
                b.e.j.r.Q(view2, null);
                String str = map.get(r);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        b.e.j.r.Q(arrayList2.get(i2), r);
                        break;
                    }
                    i2++;
                }
            }
        }
        b.e.j.p.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
