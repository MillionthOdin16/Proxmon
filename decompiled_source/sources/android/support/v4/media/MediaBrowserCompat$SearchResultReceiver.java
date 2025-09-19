package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends a.a.b.a.b {

    /* renamed from: d, reason: collision with root package name */
    private final String f17d;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f18e;

    /* renamed from: f, reason: collision with root package name */
    private final c f19f;

    @Override // a.a.b.a.b
    protected void a(int i, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f19f.a(this.f17d, this.f18e);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f19f.b(this.f17d, this.f18e, arrayList);
    }
}
