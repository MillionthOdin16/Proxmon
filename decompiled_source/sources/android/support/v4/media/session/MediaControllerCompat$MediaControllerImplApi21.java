package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a, reason: collision with root package name */
    final Object f36a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f37b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f38c;

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f39d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f40b;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f40b.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f36a) {
                mediaControllerCompat$MediaControllerImplApi21.f39d.b(b.a.W(androidx.core.app.d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f39d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c.BinderC0007c {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.BinderC0007c, android.support.v4.media.session.a
        public void V(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0007c, android.support.v4.media.session.a
        public void c(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0007c, android.support.v4.media.session.a
        public void d(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0007c, android.support.v4.media.session.a
        public void e() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0007c, android.support.v4.media.session.a
        public void j(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0007c, android.support.v4.media.session.a
        public void q(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f39d.a() == null) {
            return;
        }
        for (c cVar : this.f37b) {
            a aVar = new a(cVar);
            this.f38c.put(cVar, aVar);
            cVar.f62b = aVar;
            try {
                this.f39d.a().n(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        this.f37b.clear();
    }
}
