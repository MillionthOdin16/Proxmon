package b.a.n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import b.a.n.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f928a;

    /* renamed from: b, reason: collision with root package name */
    final b f929b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f930a;

        /* renamed from: b, reason: collision with root package name */
        final Context f931b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f932c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final b.d.g<Menu, Menu> f933d = new b.d.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f931b = context;
            this.f930a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f933d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f931b, (b.e.f.a.a) menu);
            this.f933d.put(menu, oVar);
            return oVar;
        }

        @Override // b.a.n.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f930a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // b.a.n.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f930a.onActionItemClicked(e(bVar), new j(this.f931b, (b.e.f.a.b) menuItem));
        }

        @Override // b.a.n.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f930a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // b.a.n.b.a
        public void d(b bVar) {
            this.f930a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f932c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f932c.get(i);
                if (fVar != null && fVar.f929b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f931b, bVar);
            this.f932c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f928a = context;
        this.f929b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f929b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f929b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f928a, (b.e.f.a.a) this.f929b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f929b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f929b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f929b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f929b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f929b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f929b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f929b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f929b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f929b.n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f929b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f929b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f929b.q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f929b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f929b.s(z);
    }
}
