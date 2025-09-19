package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.embedding.engine.i.a;

/* loaded from: classes.dex */
public final class c implements io.flutter.embedding.engine.i.a, io.flutter.embedding.engine.i.c.a {

    /* renamed from: b, reason: collision with root package name */
    private a f2805b;

    /* renamed from: c, reason: collision with root package name */
    private b f2806c;

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(io.flutter.embedding.engine.i.c.c cVar) {
        if (this.f2805b == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f2806c.d(cVar.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        b bVar2 = new b(bVar.a(), null);
        this.f2806c = bVar2;
        a aVar = new a(bVar2);
        this.f2805b = aVar;
        aVar.e(bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        if (this.f2805b == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f2806c.d(null);
        }
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        a aVar = this.f2805b;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.f();
        this.f2805b = null;
        this.f2806c = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.i.c.c cVar) {
        onAttachedToActivity(cVar);
    }
}
