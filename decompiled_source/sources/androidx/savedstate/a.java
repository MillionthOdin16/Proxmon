package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f882a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f883b = new SavedStateRegistry();

    private a(b bVar) {
        this.f882a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f883b;
    }

    public void c(Bundle bundle) {
        d lifecycle = this.f882a.getLifecycle();
        if (lifecycle.b() != d.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.f882a));
        this.f883b.b(lifecycle, bundle);
    }

    public void d(Bundle bundle) {
        this.f883b.c(bundle);
    }
}
