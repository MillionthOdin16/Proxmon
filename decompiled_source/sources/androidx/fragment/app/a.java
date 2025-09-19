package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends m implements i.k {
    final i r;
    boolean s;
    int t = -1;

    public a(i iVar) {
        this.r = iVar;
    }

    private static boolean l(m.a aVar) {
        Fragment fragment = aVar.f769b;
        return (fragment == null || !fragment.l || fragment.H == null || fragment.A || fragment.z || !fragment.K()) ? false : true;
    }

    @Override // androidx.fragment.app.i.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (i.I) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.h) {
            return true;
        }
        this.r.g(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        if (this.h) {
            if (i.I) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f762a.size();
            for (int i2 = 0; i2 < size; i2++) {
                m.a aVar = this.f762a.get(i2);
                Fragment fragment = aVar.f769b;
                if (fragment != null) {
                    fragment.r += i;
                    if (i.I) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f769b + " to " + aVar.f769b.r);
                    }
                }
            }
        }
    }

    public void d(String str, PrintWriter printWriter) {
        e(str, printWriter, true);
    }

    public void e(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f767f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f767f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f763b != 0 || this.f764c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f763b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f764c));
            }
            if (this.f765d != 0 || this.f766e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f765d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f766e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (this.f762a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f762a.size();
        for (int i = 0; i < size; i++) {
            m.a aVar = this.f762a.get(i);
            switch (aVar.f768a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f768a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f769b);
            if (z) {
                if (aVar.f770c != 0 || aVar.f771d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f770c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f771d));
                }
                if (aVar.f772e != 0 || aVar.f773f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f772e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f773f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        int size = this.f762a.size();
        for (int i = 0; i < size; i++) {
            m.a aVar = this.f762a.get(i);
            Fragment fragment = aVar.f769b;
            if (fragment != null) {
                fragment.b1(this.f767f, this.g);
            }
            switch (aVar.f768a) {
                case 1:
                    fragment.a1(aVar.f770c);
                    this.r.h(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f768a);
                case 3:
                    fragment.a1(aVar.f771d);
                    this.r.T0(fragment);
                    break;
                case 4:
                    fragment.a1(aVar.f771d);
                    this.r.x0(fragment);
                    break;
                case 5:
                    fragment.a1(aVar.f770c);
                    this.r.g1(fragment);
                    break;
                case 6:
                    fragment.a1(aVar.f771d);
                    this.r.s(fragment);
                    break;
                case 7:
                    fragment.a1(aVar.f770c);
                    this.r.l(fragment);
                    break;
                case 8:
                    this.r.f1(fragment);
                    break;
                case 9:
                    this.r.f1(null);
                    break;
                case 10:
                    this.r.e1(fragment, aVar.h);
                    break;
            }
            if (!this.p && aVar.f768a != 1 && fragment != null) {
                this.r.J0(fragment);
            }
        }
        if (this.p) {
            return;
        }
        i iVar = this.r;
        iVar.K0(iVar.q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z) {
        for (int size = this.f762a.size() - 1; size >= 0; size--) {
            m.a aVar = this.f762a.get(size);
            Fragment fragment = aVar.f769b;
            if (fragment != null) {
                fragment.b1(i.Y0(this.f767f), this.g);
            }
            switch (aVar.f768a) {
                case 1:
                    fragment.a1(aVar.f773f);
                    this.r.T0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f768a);
                case 3:
                    fragment.a1(aVar.f772e);
                    this.r.h(fragment, false);
                    break;
                case 4:
                    fragment.a1(aVar.f772e);
                    this.r.g1(fragment);
                    break;
                case 5:
                    fragment.a1(aVar.f773f);
                    this.r.x0(fragment);
                    break;
                case 6:
                    fragment.a1(aVar.f772e);
                    this.r.l(fragment);
                    break;
                case 7:
                    fragment.a1(aVar.f773f);
                    this.r.s(fragment);
                    break;
                case 8:
                    this.r.f1(null);
                    break;
                case 9:
                    this.r.f1(fragment);
                    break;
                case 10:
                    this.r.e1(fragment, aVar.g);
                    break;
            }
            if (!this.p && aVar.f768a != 3 && fragment != null) {
                this.r.J0(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        i iVar = this.r;
        iVar.K0(iVar.q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f762a.size()) {
            m.a aVar = this.f762a.get(i);
            int i2 = aVar.f768a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f769b;
                    int i3 = fragment3.x;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.x == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f762a.add(i, new m.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                m.a aVar2 = new m.a(3, fragment4);
                                aVar2.f770c = aVar.f770c;
                                aVar2.f772e = aVar.f772e;
                                aVar2.f771d = aVar.f771d;
                                aVar2.f773f = aVar.f773f;
                                this.f762a.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f762a.remove(i);
                        i--;
                    } else {
                        aVar.f768a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f769b);
                    Fragment fragment5 = aVar.f769b;
                    if (fragment5 == fragment2) {
                        this.f762a.add(i, new m.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f762a.add(i, new m.a(9, fragment2));
                        i++;
                        fragment2 = aVar.f769b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f769b);
            i++;
        }
        return fragment2;
    }

    public String i() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(int i) {
        int size = this.f762a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f762a.get(i2).f769b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f762a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f762a.get(i4).f769b;
            int i5 = fragment != null ? fragment.x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f762a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f762a.get(i7).f769b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        for (int i = 0; i < this.f762a.size(); i++) {
            if (l(this.f762a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void n() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Fragment.e eVar) {
        for (int i = 0; i < this.f762a.size(); i++) {
            m.a aVar = this.f762a.get(i);
            if (l(aVar)) {
                aVar.f769b.c1(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment p(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f762a.size() - 1; size >= 0; size--) {
            m.a aVar = this.f762a.get(size);
            int i = aVar.f768a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f769b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.f769b);
            }
            arrayList.remove(aVar.f769b);
        }
        return fragment;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
