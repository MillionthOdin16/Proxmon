package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends androidx.lifecycle.p {
    private static final q.a h = new a();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f755e;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<Fragment> f752b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, k> f753c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.r> f754d = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f756f = false;
    private boolean g = false;

    /* loaded from: classes.dex */
    static class a implements q.a {
        a() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends androidx.lifecycle.p> T a(Class<T> cls) {
            return new k(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(boolean z) {
        this.f755e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k g(androidx.lifecycle.r rVar) {
        return (k) new androidx.lifecycle.q(rVar, h).a(k.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.p
    public void c() {
        if (i.I) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f756f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Fragment fragment) {
        return this.f752b.add(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (i.I) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        k kVar = this.f753c.get(fragment.f693f);
        if (kVar != null) {
            kVar.c();
            this.f753c.remove(fragment.f693f);
        }
        androidx.lifecycle.r rVar = this.f754d.get(fragment.f693f);
        if (rVar != null) {
            rVar.a();
            this.f754d.remove(fragment.f693f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f752b.equals(kVar.f752b) && this.f753c.equals(kVar.f753c) && this.f754d.equals(kVar.f754d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k f(Fragment fragment) {
        k kVar = this.f753c.get(fragment.f693f);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this.f755e);
        this.f753c.put(fragment.f693f, kVar2);
        return kVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> h() {
        return this.f752b;
    }

    public int hashCode() {
        return (((this.f752b.hashCode() * 31) + this.f753c.hashCode()) * 31) + this.f754d.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.r i(Fragment fragment) {
        androidx.lifecycle.r rVar = this.f754d.get(fragment.f693f);
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r();
        this.f754d.put(fragment.f693f, rVar2);
        return rVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f756f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(Fragment fragment) {
        return this.f752b.remove(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(Fragment fragment) {
        if (this.f752b.contains(fragment)) {
            return this.f755e ? this.f756f : !this.g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f752b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f753c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f754d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
