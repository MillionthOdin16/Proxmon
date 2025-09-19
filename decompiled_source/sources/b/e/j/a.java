package b.e.j;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.e.j.a0.b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f1168c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f1169a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f1170b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.e.j.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0035a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f1171a;

        C0035a(a aVar) {
            this.f1171a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1171a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b.e.j.a0.c b2 = this.f1171a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1171a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            b.e.j.a0.b O = b.e.j.a0.b.O(accessibilityNodeInfo);
            O.L(r.y(view));
            O.J(r.u(view));
            O.K(r.k(view));
            this.f1171a.g(view, O);
            O.c(accessibilityNodeInfo.getText(), view);
            List<b.a> c2 = a.c(view);
            for (int i = 0; i < c2.size(); i++) {
                O.a(c2.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1171a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1171a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f1171a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f1171a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1171a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f1168c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1169a = accessibilityDelegate;
        this.f1170b = new C0035a(this);
    }

    static List<b.a> c(View view) {
        List<b.a> list = (List) view.getTag(b.e.b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] l = b.e.j.a0.b.l(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; l != null && i < l.length; i++) {
                if (clickableSpan.equals(l[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b.e.b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1169a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b.e.j.a0.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f1169a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new b.e.j.a0.c(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f1170b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1169a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, b.e.j.a0.b bVar) {
        this.f1169a.onInitializeAccessibilityNodeInfo(view, bVar.N());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1169a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1169a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List<b.a> c2 = c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c2.size()) {
                break;
            }
            b.a aVar = c2.get(i2);
            if (aVar.a() == i) {
                z = aVar.c(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f1169a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != b.e.b.accessibility_action_clickable_span) ? z : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i) {
        this.f1169a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1169a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
