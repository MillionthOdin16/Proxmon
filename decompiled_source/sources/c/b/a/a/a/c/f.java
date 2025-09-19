package c.b.a.a.a.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import c.b.a.a.a.f.p;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private final k f1438a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1439b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(k kVar) {
        this.f1438a = kVar;
    }

    @Override // c.b.a.a.a.c.b
    public final c.b.a.a.a.f.e<Void> a(Activity activity, a aVar) {
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.a());
        p pVar = new p();
        intent.putExtra("result_receiver", new e(this.f1439b, pVar));
        activity.startActivity(intent);
        return pVar.a();
    }

    @Override // c.b.a.a.a.c.b
    public final c.b.a.a.a.f.e<a> b() {
        return this.f1438a.a();
    }
}
