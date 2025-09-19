package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c extends h implements DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    final AlertController f125d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f126a;

        /* renamed from: b, reason: collision with root package name */
        private final int f127b;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public a(Context context, int i) {
            this.f126a = new AlertController.f(new ContextThemeWrapper(context, c.f(context, i)));
            this.f127b = i;
        }

        public c a() {
            c cVar = new c(this.f126a.f105a, this.f127b);
            this.f126a.a(cVar.f125d);
            cVar.setCancelable(this.f126a.r);
            if (this.f126a.r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f126a.s);
            cVar.setOnDismissListener(this.f126a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f126a.u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f126a.f105a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f126a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f126a.g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f126a.f108d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f126a.h = charSequence;
            return this;
        }

        public a g(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f126a;
            fVar.l = fVar.f105a.getText(i);
            this.f126a.n = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f126a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnCancelListener onCancelListener) {
            this.f126a.s = onCancelListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f126a.u = onKeyListener;
            return this;
        }

        public a k(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f126a;
            fVar.i = fVar.f105a.getText(i);
            this.f126a.k = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f126a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f126a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a n(CharSequence charSequence) {
            this.f126a.f110f = charSequence;
            return this;
        }
    }

    protected c(Context context, int i) {
        super(context, f(context, i));
        this.f125d = new AlertController(getContext(), this, getWindow());
    }

    static int f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f125d.d();
    }

    public void g(View view) {
        this.f125d.s(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f125d.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f125d.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f125d.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f125d.q(charSequence);
    }
}
