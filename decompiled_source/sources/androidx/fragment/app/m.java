package androidx.fragment.app;

import androidx.lifecycle.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    int f763b;

    /* renamed from: c, reason: collision with root package name */
    int f764c;

    /* renamed from: d, reason: collision with root package name */
    int f765d;

    /* renamed from: e, reason: collision with root package name */
    int f766e;

    /* renamed from: f, reason: collision with root package name */
    int f767f;
    int g;
    boolean h;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    ArrayList<Runnable> q;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f762a = new ArrayList<>();
    boolean p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f768a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f769b;

        /* renamed from: c, reason: collision with root package name */
        int f770c;

        /* renamed from: d, reason: collision with root package name */
        int f771d;

        /* renamed from: e, reason: collision with root package name */
        int f772e;

        /* renamed from: f, reason: collision with root package name */
        int f773f;
        d.b g;
        d.b h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, Fragment fragment) {
            this.f768a = i;
            this.f769b = fragment;
            d.b bVar = d.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f762a.add(aVar);
        aVar.f770c = this.f763b;
        aVar.f771d = this.f764c;
        aVar.f772e = this.f765d;
        aVar.f773f = this.f766e;
    }
}
