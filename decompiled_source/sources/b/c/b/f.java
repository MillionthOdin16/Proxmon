package b.c.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a.a.a.b f1014a;

    /* renamed from: b, reason: collision with root package name */
    private final a.a.a.a f1015b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f1016c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f1017d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a.a.a.b bVar, a.a.a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1014a = bVar;
        this.f1015b = aVar;
        this.f1016c = componentName;
        this.f1017d = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1017d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder c() {
        return this.f1015b.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName d() {
        return this.f1016c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent e() {
        return this.f1017d;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1014a.w(this.f1015b, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
