package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b, reason: collision with root package name */
    private g f271b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.c f272c;

    /* renamed from: d, reason: collision with root package name */
    e f273d;

    /* renamed from: e, reason: collision with root package name */
    private m.a f274e;

    public h(g gVar) {
        this.f271b = gVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f272c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void b(g gVar, boolean z) {
        if (z || gVar == this.f271b) {
            a();
        }
        m.a aVar = this.f274e;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean c(g gVar) {
        m.a aVar = this.f274e;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        g gVar = this.f271b;
        c.a aVar = new c.a(gVar.u());
        e eVar = new e(aVar.b(), b.a.g.abc_list_menu_item_layout);
        this.f273d = eVar;
        eVar.i(this);
        this.f271b.b(this.f273d);
        aVar.c(this.f273d.a(), this);
        View y = gVar.y();
        if (y != null) {
            aVar.d(y);
        } else {
            aVar.e(gVar.w());
            aVar.n(gVar.x());
        }
        aVar.j(this);
        androidx.appcompat.app.c a2 = aVar.a();
        this.f272c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f272c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f272c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f271b.L((i) this.f273d.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f273d.b(this.f271b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f272c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f272c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f271b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f271b.performShortcut(i, keyEvent, 0);
    }
}
