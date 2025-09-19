package io.flutter.plugins.c;

import android.content.Context;
import d.a.c.a.i;
import io.flutter.embedding.engine.i.a;

/* loaded from: classes.dex */
public class b implements io.flutter.embedding.engine.i.a {

    /* renamed from: b, reason: collision with root package name */
    private i f2788b;

    private void a(d.a.c.a.b bVar, Context context) {
        this.f2788b = new i(bVar, "plugins.flutter.io/shared_preferences");
        this.f2788b.e(new a(context));
    }

    private void b() {
        this.f2788b.e(null);
        this.f2788b = null;
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
