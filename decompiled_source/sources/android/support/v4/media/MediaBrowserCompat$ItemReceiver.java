package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends a.a.b.a.b {

    /* renamed from: d, reason: collision with root package name */
    private final String f13d;

    /* renamed from: e, reason: collision with root package name */
    private final b f14e;

    @Override // a.a.b.a.b
    protected void a(int i, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f14e.a(this.f13d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f14e.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f14e.a(this.f13d);
        }
    }
}
