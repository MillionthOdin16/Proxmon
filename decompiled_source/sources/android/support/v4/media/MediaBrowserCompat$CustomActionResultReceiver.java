package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/* loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends a.a.b.a.b {

    /* renamed from: d, reason: collision with root package name */
    private final String f10d;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f11e;

    /* renamed from: f, reason: collision with root package name */
    private final a f12f;

    @Override // a.a.b.a.b
    protected void a(int i, Bundle bundle) {
        if (this.f12f == null) {
            return;
        }
        MediaSessionCompat.a(bundle);
        if (i == -1) {
            this.f12f.a(this.f10d, this.f11e, bundle);
            return;
        }
        if (i == 0) {
            this.f12f.c(this.f10d, this.f11e, bundle);
            return;
        }
        if (i == 1) {
            this.f12f.b(this.f10d, this.f11e, bundle);
            return;
        }
        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f11e + ", resultData=" + bundle + ")");
    }
}
