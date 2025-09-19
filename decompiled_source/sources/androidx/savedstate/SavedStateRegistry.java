package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: a, reason: collision with root package name */
    private b.b.a.b.b<String, b> f877a = new b.b.a.b.b<>();

    /* renamed from: b, reason: collision with root package name */
    private Bundle f878b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f879c;

    /* renamed from: d, reason: collision with root package name */
    boolean f880d;

    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (!this.f879c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f878b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f878b.remove(str);
        if (this.f878b.isEmpty()) {
            this.f878b = null;
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar, Bundle bundle) {
        if (this.f879c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f878b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dVar.a(new e() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.e
            public void d(g gVar, d.a aVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z;
                if (aVar == d.a.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z = true;
                } else {
                    if (aVar != d.a.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z = false;
                }
                savedStateRegistry.f880d = z;
            }
        });
        this.f879c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f878b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b.a.b.b<String, b>.d d2 = this.f877a.d();
        while (d2.hasNext()) {
            Map.Entry next = d2.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
