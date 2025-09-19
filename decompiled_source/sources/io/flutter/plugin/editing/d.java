package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.m;
import io.flutter.embedding.engine.j.n;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f2698a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f2699b;

    /* renamed from: c, reason: collision with root package name */
    private final AutofillManager f2700c;

    /* renamed from: d, reason: collision with root package name */
    private final n f2701d;

    /* renamed from: e, reason: collision with root package name */
    private c f2702e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    private n.b f2703f;
    private SparseArray<n.b> g;
    private io.flutter.plugin.editing.c h;
    private boolean i;
    private InputConnection j;
    private k k;
    private Rect l;
    private ImeSyncDeferringInsetsCallback m;
    private n.e n;
    private boolean o;

    /* loaded from: classes.dex */
    class a implements n.f {
        a() {
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void a() {
            d dVar = d.this;
            dVar.F(dVar.f2698a);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void b(String str, Bundle bundle) {
            d.this.B(str, bundle);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void c() {
            d.this.m();
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void d(int i, boolean z) {
            d.this.C(i, z);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void e(double d2, double d3, double[] dArr) {
            d.this.A(d2, d3, dArr);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void f() {
            d.this.x();
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void g(int i, n.b bVar) {
            d.this.D(i, bVar);
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void h(boolean z) {
            if (Build.VERSION.SDK_INT < 26 || d.this.f2700c == null) {
                return;
            }
            if (z) {
                d.this.f2700c.commit();
            } else {
                d.this.f2700c.cancel();
            }
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void i() {
            if (d.this.f2702e.f2708a == c.a.HC_PLATFORM_VIEW) {
                d.this.y();
            } else {
                d dVar = d.this;
                dVar.s(dVar.f2698a);
            }
        }

        @Override // io.flutter.embedding.engine.j.n.f
        public void j(n.e eVar) {
            d dVar = d.this;
            dVar.E(dVar.f2698a, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0079d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f2706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f2707c;

        b(d dVar, boolean z, double[] dArr, double[] dArr2) {
            this.f2705a = z;
            this.f2706b = dArr;
            this.f2707c = dArr2;
        }

        @Override // io.flutter.plugin.editing.d.InterfaceC0079d
        public void a(double d2, double d3) {
            double d4 = 1.0d;
            if (!this.f2705a) {
                double[] dArr = this.f2706b;
                d4 = 1.0d / (((dArr[3] * d2) + (dArr[7] * d3)) + dArr[15]);
            }
            double[] dArr2 = this.f2706b;
            double d5 = ((dArr2[0] * d2) + (dArr2[4] * d3) + dArr2[12]) * d4;
            double d6 = ((dArr2[1] * d2) + (dArr2[5] * d3) + dArr2[13]) * d4;
            double[] dArr3 = this.f2707c;
            if (d5 < dArr3[0]) {
                dArr3[0] = d5;
            } else if (d5 > dArr3[1]) {
                dArr3[1] = d5;
            }
            double[] dArr4 = this.f2707c;
            if (d6 < dArr4[2]) {
                dArr4[2] = d6;
            } else if (d6 > dArr4[3]) {
                dArr4[3] = d6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        a f2708a;

        /* renamed from: b, reason: collision with root package name */
        int f2709b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VD_PLATFORM_VIEW,
            HC_PLATFORM_VIEW
        }

        public c(a aVar, int i) {
            this.f2708a = aVar;
            this.f2709b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.plugin.editing.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0079d {
        void a(double d2, double d3);
    }

    @SuppressLint({"NewApi"})
    public d(View view, n nVar, k kVar) {
        this.f2698a = view;
        this.f2699b = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.f2700c = Build.VERSION.SDK_INT >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (Build.VERSION.SDK_INT >= 30) {
            int navigationBars = (this.f2698a.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : 0;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (this.f2698a.getWindowSystemUiVisibility() & 4) == 0 ? navigationBars | WindowInsets.Type.statusBars() : navigationBars, WindowInsets.Type.ime());
            this.m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f2701d = nVar;
        nVar.l(new a());
        nVar.i();
        this.k = kVar;
        kVar.v(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(double d2, double d3, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12] / dArr[15];
        dArr2[1] = d4;
        dArr2[0] = d4;
        double d5 = dArr[13] / dArr[15];
        dArr2[3] = d5;
        dArr2[2] = d5;
        b bVar = new b(this, z, dArr, dArr2);
        bVar.a(d2, 0.0d);
        bVar.a(d2, d3);
        bVar.a(0.0d, d3);
        Float valueOf = Float.valueOf(this.f2698a.getContext().getResources().getDisplayMetrics().density);
        double d6 = dArr2[0];
        double floatValue = valueOf.floatValue();
        Double.isNaN(floatValue);
        double d7 = dArr2[2];
        double floatValue2 = valueOf.floatValue();
        Double.isNaN(floatValue2);
        int i = (int) (d7 * floatValue2);
        double d8 = dArr2[1];
        double floatValue3 = valueOf.floatValue();
        Double.isNaN(floatValue3);
        int ceil = (int) Math.ceil(d8 * floatValue3);
        double d9 = dArr2[3];
        double floatValue4 = valueOf.floatValue();
        Double.isNaN(floatValue4);
        this.l = new Rect((int) (d6 * floatValue), i, ceil, (int) Math.ceil(d9 * floatValue4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i, boolean z) {
        if (!z) {
            this.f2702e = new c(c.a.HC_PLATFORM_VIEW, i);
            this.j = null;
        } else {
            this.f2698a.requestFocus();
            this.f2702e = new c(c.a.VD_PLATFORM_VIEW, i);
            this.f2699b.restartInput(this.f2698a);
            this.i = false;
        }
    }

    private void H(n.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.i == null) {
            this.g = null;
            return;
        }
        n.b[] bVarArr = bVar.j;
        SparseArray<n.b> sparseArray = new SparseArray<>();
        this.g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.i.f2632a.hashCode(), bVar);
            return;
        }
        for (n.b bVar2 : bVarArr) {
            n.b.a aVar = bVar2.i;
            if (aVar != null) {
                this.g.put(aVar.f2632a.hashCode(), bVar2);
                this.f2700c.notifyValueChanged(this.f2698a, aVar.f2632a.hashCode(), AutofillValue.forText(aVar.f2634c.f2643a));
            }
        }
    }

    private boolean k() {
        n.c cVar;
        n.b bVar = this.f2703f;
        return bVar == null || (cVar = bVar.f2631f) == null || cVar.f2635a != n.g.NONE;
    }

    private static boolean n(n.e eVar, n.e eVar2) {
        int i = eVar.f2647e - eVar.f2646d;
        if (i != eVar2.f2647e - eVar2.f2646d) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (eVar.f2643a.charAt(eVar.f2646d + i2) != eVar2.f2643a.charAt(eVar2.f2646d + i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f2699b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(n.c cVar, boolean z, boolean z2, boolean z3, boolean z4, n.d dVar) {
        n.g gVar = cVar.f2635a;
        if (gVar == n.g.DATETIME) {
            return 4;
        }
        if (gVar == n.g.NUMBER) {
            int i = cVar.f2636b ? 4098 : 2;
            return cVar.f2637c ? i | 8192 : i;
        }
        if (gVar == n.g.PHONE) {
            return 3;
        }
        if (gVar == n.g.NONE) {
            return 0;
        }
        int i2 = 1;
        if (gVar == n.g.MULTILINE) {
            i2 = 131073;
        } else if (gVar == n.g.EMAIL_ADDRESS) {
            i2 = 33;
        } else if (gVar == n.g.URL) {
            i2 = 17;
        } else if (gVar == n.g.VISIBLE_PASSWORD) {
            i2 = 145;
        } else if (gVar == n.g.NAME) {
            i2 = 97;
        } else if (gVar == n.g.POSTAL_ADDRESS) {
            i2 = 113;
        }
        if (z) {
            i2 = i2 | 524288 | 128;
        } else {
            if (z2) {
                i2 |= 32768;
            }
            if (!z3) {
                i2 |= 524288;
            }
        }
        return dVar == n.d.CHARACTERS ? i2 | 4096 : dVar == n.d.WORDS ? i2 | 8192 : dVar == n.d.SENTENCES ? i2 | 16384 : i2;
    }

    private boolean v() {
        return this.g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f2700c == null || !v()) {
            return;
        }
        this.f2700c.notifyValueChanged(this.f2698a, this.f2703f.i.f2632a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f2700c == null || !v()) {
            return;
        }
        String str = this.f2703f.i.f2632a;
        int[] iArr = new int[2];
        this.f2698a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.l);
        rect.offset(iArr[0], iArr[1]);
        this.f2700c.notifyViewEntered(this.f2698a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        n.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f2700c == null || (bVar = this.f2703f) == null || bVar.i == null || !v()) {
            return;
        }
        this.f2700c.notifyViewExited(this.f2698a, this.f2703f.i.f2632a.hashCode());
    }

    public void B(String str, Bundle bundle) {
        this.f2699b.sendAppPrivateCommand(this.f2698a, str, bundle);
    }

    void D(int i, n.b bVar) {
        y();
        this.f2703f = bVar;
        this.f2702e = k() ? new c(c.a.FRAMEWORK_CLIENT, i) : new c(c.a.NO_TARGET, i);
        io.flutter.plugin.editing.c cVar = this.h;
        if (cVar != null) {
            cVar.j(this);
        }
        n.b.a aVar = bVar.i;
        this.h = new io.flutter.plugin.editing.c(aVar != null ? aVar.f2634c : null, this.f2698a);
        H(bVar);
        this.i = true;
        G();
        this.l = null;
        this.h.a(this);
    }

    void E(View view, n.e eVar) {
        n.e eVar2;
        if (!this.i && (eVar2 = this.n) != null && eVar2.b()) {
            boolean n = n(this.n, eVar);
            this.i = n;
            if (n) {
                d.a.b.d("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.n = eVar;
        this.h.l(eVar);
        if (this.i) {
            this.f2699b.restartInput(view);
            this.i = false;
        }
    }

    void F(View view) {
        if (!k()) {
            s(view);
        } else {
            view.requestFocus();
            this.f2699b.showSoftInput(view, 0);
        }
    }

    public void G() {
        this.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7 == r0.f2647e) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.c r9 = r8.h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        Lb:
            io.flutter.plugin.editing.c r9 = r8.h
            int r9 = r9.g()
            io.flutter.plugin.editing.c r10 = r8.h
            int r10 = r10.f()
            io.flutter.plugin.editing.c r11 = r8.h
            int r11 = r11.e()
            io.flutter.plugin.editing.c r0 = r8.h
            int r7 = r0.d()
            io.flutter.embedding.engine.j.n$e r0 = r8.n
            if (r0 == 0) goto L4c
            io.flutter.plugin.editing.c r0 = r8.h
            java.lang.String r0 = r0.toString()
            io.flutter.embedding.engine.j.n$e r1 = r8.n
            java.lang.String r1 = r1.f2643a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            io.flutter.embedding.engine.j.n$e r0 = r8.n
            int r1 = r0.f2644b
            if (r9 != r1) goto L4a
            int r1 = r0.f2645c
            if (r10 != r1) goto L4a
            int r1 = r0.f2646d
            if (r11 != r1) goto L4a
            int r0 = r0.f2647e
            if (r7 != r0) goto L4a
            goto L4c
        L4a:
            r0 = 0
            goto L4d
        L4c:
            r0 = 1
        L4d:
            if (r0 != 0) goto L90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send EditingState to flutter: "
            r0.append(r1)
            io.flutter.plugin.editing.c r1 = r8.h
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TextInputPlugin"
            d.a.b.e(r1, r0)
            io.flutter.embedding.engine.j.n r0 = r8.f2701d
            io.flutter.plugin.editing.d$c r1 = r8.f2702e
            int r1 = r1.f2709b
            io.flutter.plugin.editing.c r2 = r8.h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.n(r1, r2, r3, r4, r5, r6)
            io.flutter.embedding.engine.j.n$e r6 = new io.flutter.embedding.engine.j.n$e
            io.flutter.plugin.editing.c r0 = r8.h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.n = r6
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.d.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        n.b.a aVar;
        n.b.a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (aVar = this.f2703f.i) != null) {
            HashMap<String, n.e> hashMap = new HashMap<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                n.b bVar = this.g.get(sparseArray.keyAt(i));
                if (bVar != null && (aVar2 = bVar.i) != null) {
                    String charSequence = sparseArray.valueAt(i).getTextValue().toString();
                    n.e eVar = new n.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f2632a.equals(aVar.f2632a)) {
                        this.h.l(eVar);
                    } else {
                        hashMap.put(aVar2.f2632a, eVar);
                    }
                }
            }
            this.f2701d.o(this.f2702e.f2709b, hashMap);
        }
    }

    public void l(int i) {
        c.a aVar = this.f2702e.f2708a;
        if ((aVar == c.a.VD_PLATFORM_VIEW || aVar == c.a.HC_PLATFORM_VIEW) && this.f2702e.f2709b == i) {
            this.f2702e = new c(c.a.NO_TARGET, 0);
            y();
            this.f2699b.hideSoftInputFromWindow(this.f2698a.getApplicationWindowToken(), 0);
            this.f2699b.restartInput(this.f2698a);
            this.i = false;
        }
    }

    void m() {
        if (this.f2702e.f2708a == c.a.VD_PLATFORM_VIEW) {
            return;
        }
        this.h.j(this);
        y();
        H(null);
        this.f2702e = new c(c.a.NO_TARGET, 0);
        G();
        this.l = null;
    }

    public InputConnection o(View view, m mVar, EditorInfo editorInfo) {
        c cVar = this.f2702e;
        c.a aVar = cVar.f2708a;
        if (aVar == c.a.NO_TARGET) {
            this.j = null;
            return null;
        }
        if (aVar == c.a.HC_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VD_PLATFORM_VIEW) {
            if (this.o) {
                return this.j;
            }
            InputConnection onCreateInputConnection = this.k.c(Integer.valueOf(cVar.f2709b)).onCreateInputConnection(editorInfo);
            this.j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        n.b bVar = this.f2703f;
        editorInfo.inputType = t(bVar.f2631f, bVar.f2626a, bVar.f2627b, bVar.f2628c, bVar.f2629d, bVar.f2630e);
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f2703f.f2629d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f2703f.g;
        int intValue = num == null ? (131072 & editorInfo.inputType) != 0 ? 1 : 6 : num.intValue();
        String str = this.f2703f.h;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        io.flutter.plugin.editing.b bVar2 = new io.flutter.plugin.editing.b(view, this.f2702e.f2709b, this.f2701d, mVar, this.h, editorInfo);
        editorInfo.initialSelStart = this.h.g();
        editorInfo.initialSelEnd = this.h.f();
        this.j = bVar2;
        return bVar2;
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.k.E();
        this.f2701d.l(null);
        y();
        io.flutter.plugin.editing.c cVar = this.h;
        if (cVar != null) {
            cVar.j(this);
        }
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f2699b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f2702e.f2708a == c.a.VD_PLATFORM_VIEW) {
            this.o = true;
        }
    }

    public void z(ViewStructure viewStructure, int i) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f2703f.i.f2632a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            int keyAt = this.g.keyAt(i2);
            n.b.a aVar = this.g.valueAt(i2).i;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i2);
                newChild.setAutofillId(autofillId, keyAt);
                newChild.setAutofillHints(aVar.f2633b);
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                if (str.hashCode() != keyAt || (rect = this.l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f2634c.f2643a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.l.height());
                    charSequence = this.h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }
}
