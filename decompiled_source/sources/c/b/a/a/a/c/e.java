package c.b.a.a.a.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import c.b.a.a.a.f.p;

/* loaded from: classes.dex */
final class e extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f1437b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Handler handler, p pVar) {
        super(handler);
        this.f1437b = pVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f1437b.e(null);
    }
}
