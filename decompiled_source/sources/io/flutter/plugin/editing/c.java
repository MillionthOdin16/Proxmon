package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.engine.j.n;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    private int f2692b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f2693c = 0;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<b> f2694d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<b> f2695e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private String f2696f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private BaseInputConnection l;

    /* loaded from: classes.dex */
    class a extends BaseInputConnection {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f2697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, View view, boolean z, Editable editable) {
            super(view, z);
            this.f2697a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f2697a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z, boolean z2, boolean z3);
    }

    public c(n.e eVar, View view) {
        if (eVar != null) {
            l(eVar);
        }
        this.l = new a(this, view, true, this);
    }

    private void h(b bVar, boolean z, boolean z2, boolean z3) {
        this.f2693c++;
        bVar.a(z, z2, z3);
        this.f2693c--;
    }

    private void i(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<b> it = this.f2694d.iterator();
            while (it.hasNext()) {
                h(it.next(), z, z2, z3);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f2693c > 0) {
            d.a.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f2692b > 0) {
            d.a.b.f("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f2695e;
        } else {
            arrayList = this.f2694d;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f2692b++;
        if (this.f2693c > 0) {
            d.a.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2692b != 1 || this.f2694d.isEmpty()) {
            return;
        }
        this.g = toString();
        this.h = g();
        this.i = f();
        this.j = e();
        this.k = d();
    }

    public void c() {
        int i = this.f2692b;
        if (i == 0) {
            d.a.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<b> it = this.f2695e.iterator();
            while (it.hasNext()) {
                h(it.next(), true, true, true);
            }
            if (!this.f2694d.isEmpty()) {
                d.a.b.e("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f2694d.size()) + " listener(s)");
                i(!toString().equals(this.g), (this.h == g() && this.i == f()) ? false : true, (this.j == e() && this.k == d()) ? false : true);
            }
        }
        this.f2694d.addAll(this.f2695e);
        this.f2695e.clear();
        this.f2692b--;
    }

    public final int d() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int e() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int f() {
        return Selection.getSelectionEnd(this);
    }

    public final int g() {
        return Selection.getSelectionStart(this);
    }

    public void j(b bVar) {
        if (this.f2693c > 0) {
            d.a.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f2694d.remove(bVar);
        if (this.f2692b > 0) {
            this.f2695e.remove(bVar);
        }
    }

    public void k(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.l.setComposingRegion(i, i2);
        }
    }

    public void l(n.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f2643a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f2644b, eVar.f2645c);
        } else {
            Selection.removeSelection(this);
        }
        k(eVar.f2646d, eVar.f2647e);
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f2693c > 0) {
            d.a.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        int i5 = i2 - i;
        boolean z = true;
        boolean z2 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z2; i6++) {
            z2 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z2) {
            this.f2696f = null;
        }
        int g = g();
        int f2 = f();
        int e2 = e();
        int d2 = d();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        if (this.f2692b > 0) {
            return replace;
        }
        boolean z3 = (g() == g && f() == f2) ? false : true;
        if (e() == e2 && d() == d2) {
            z = false;
        }
        i(z2, z3, z);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f2696f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f2696f = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
