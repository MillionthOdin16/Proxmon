package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.n.b;
import b.e.j.e;

/* loaded from: classes.dex */
public class h extends Dialog implements e {

    /* renamed from: b, reason: collision with root package name */
    private f f160b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f161c;

    /* loaded from: classes.dex */
    class a implements e.a {
        a() {
        }

        @Override // b.e.j.e.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.c(keyEvent);
        }
    }

    public h(Context context, int i) {
        super(context, b(context, i));
        this.f161c = new a();
        f a2 = a();
        a2.F(b(context, i));
        a2.r(null);
    }

    private static int b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public f a() {
        if (this.f160b == null) {
            this.f160b = f.h(this, this);
        }
        return this.f160b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i) {
        return a().A(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.e.j.e.e(this.f161c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().i(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().o();
        super.onCreate(bundle);
        a().r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().x();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(b.a.n.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(b.a.n.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public b.a.n.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().B(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().C(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().G(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().G(charSequence);
    }
}
