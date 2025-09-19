package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f442a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f443b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f444c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f445d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f446e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f447f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CompoundButton compoundButton) {
        this.f442a = compoundButton;
    }

    void a() {
        Drawable a2 = androidx.core.widget.c.a(this.f442a);
        if (a2 != null) {
            if (this.f445d || this.f446e) {
                Drawable mutate = androidx.core.graphics.drawable.a.p(a2).mutate();
                if (this.f445d) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f443b);
                }
                if (this.f446e) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f444c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f442a.getDrawableState());
                }
                this.f442a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = androidx.core.widget.c.a(this.f442a)) == null) ? i : i + a2.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f443b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f444c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:11:0x0043, B:13:0x004b, B:15:0x0053, B:16:0x0062, B:18:0x006a, B:19:0x0075, B:21:0x007d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:11:0x0043, B:13:0x004b, B:15:0x0053, B:16:0x0062, B:18:0x006a, B:19:0x0075, B:21:0x007d), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f442a
            android.content.Context r0 = r0.getContext()
            int[] r1 = b.a.j.CompoundButton
            r2 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.u(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f442a
            android.content.Context r4 = r3.getContext()
            int[] r5 = b.a.j.CompoundButton
            android.content.res.TypedArray r7 = r0.q()
            r9 = 0
            r6 = r11
            r8 = r12
            b.e.j.r.H(r3, r4, r5, r6, r7, r8, r9)
            int r11 = b.a.j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.r(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L40
            int r11 = b.a.j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L92
            int r11 = r0.m(r11, r2)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L40
            android.widget.CompoundButton r12 = r10.f442a     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            android.widget.CompoundButton r1 = r10.f442a     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            android.content.Context r1 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            android.graphics.drawable.Drawable r11 = b.a.k.a.a.d(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L40 java.lang.Throwable -> L92
            r11 = 1
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 != 0) goto L62
            int r11 = b.a.j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.r(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L62
            int r11 = b.a.j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L92
            int r11 = r0.m(r11, r2)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L62
            android.widget.CompoundButton r12 = r10.f442a     // Catch: java.lang.Throwable -> L92
            android.widget.CompoundButton r1 = r10.f442a     // Catch: java.lang.Throwable -> L92
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L92
            android.graphics.drawable.Drawable r11 = b.a.k.a.a.d(r1, r11)     // Catch: java.lang.Throwable -> L92
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L92
        L62:
            int r11 = b.a.j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.r(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L75
            android.widget.CompoundButton r11 = r10.f442a     // Catch: java.lang.Throwable -> L92
            int r12 = b.a.j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L92
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch: java.lang.Throwable -> L92
            androidx.core.widget.c.b(r11, r12)     // Catch: java.lang.Throwable -> L92
        L75:
            int r11 = b.a.j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L92
            boolean r11 = r0.r(r11)     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L8e
            android.widget.CompoundButton r11 = r10.f442a     // Catch: java.lang.Throwable -> L92
            int r12 = b.a.j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L92
            r1 = -1
            int r12 = r0.j(r12, r1)     // Catch: java.lang.Throwable -> L92
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.e0.d(r12, r1)     // Catch: java.lang.Throwable -> L92
            androidx.core.widget.c.c(r11, r12)     // Catch: java.lang.Throwable -> L92
        L8e:
            r0.v()
            return
        L92:
            r11 = move-exception
            r0.v()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f447f) {
            this.f447f = false;
        } else {
            this.f447f = true;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f443b = colorStateList;
        this.f445d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f444c = mode;
        this.f446e = true;
        a();
    }
}
