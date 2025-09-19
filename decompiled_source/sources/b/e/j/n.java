package b.e.j;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private int f1199a;

    /* renamed from: b, reason: collision with root package name */
    private int f1200b;

    public n(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1199a | this.f1200b;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f1200b = i;
        } else {
            this.f1199a = i;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i) {
        if (i == 1) {
            this.f1200b = 0;
        } else {
            this.f1199a = 0;
        }
    }
}
