package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final Context f236a;

    /* renamed from: b, reason: collision with root package name */
    private b.d.g<b.e.f.a.b, MenuItem> f237b;

    /* renamed from: c, reason: collision with root package name */
    private b.d.g<b.e.f.a.c, SubMenu> f238c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f236a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b.e.f.a.b)) {
            return menuItem;
        }
        b.e.f.a.b bVar = (b.e.f.a.b) menuItem;
        if (this.f237b == null) {
            this.f237b = new b.d.g<>();
        }
        MenuItem menuItem2 = this.f237b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f236a, bVar);
        this.f237b.put(bVar, jVar);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof b.e.f.a.c)) {
            return subMenu;
        }
        b.e.f.a.c cVar = (b.e.f.a.c) subMenu;
        if (this.f238c == null) {
            this.f238c = new b.d.g<>();
        }
        SubMenu subMenu2 = this.f238c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f236a, cVar);
        this.f238c.put(cVar, sVar);
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        b.d.g<b.e.f.a.b, MenuItem> gVar = this.f237b;
        if (gVar != null) {
            gVar.clear();
        }
        b.d.g<b.e.f.a.c, SubMenu> gVar2 = this.f238c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        if (this.f237b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f237b.size()) {
            if (this.f237b.i(i2).getGroupId() == i) {
                this.f237b.j(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        if (this.f237b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f237b.size(); i2++) {
            if (this.f237b.i(i2).getItemId() == i) {
                this.f237b.j(i2);
                return;
            }
        }
    }
}
