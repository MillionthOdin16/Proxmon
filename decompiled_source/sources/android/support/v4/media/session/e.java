package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
class e {

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);

        void b(Object obj);

        void c(List<?> list);

        void d(CharSequence charSequence);

        void e();

        void f(int i, int i2, int i3, int i4, int i5);

        void g(String str, Bundle bundle);

        void j(Bundle bundle);
    }

    /* loaded from: classes.dex */
    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a, reason: collision with root package name */
        protected final T f65a;

        public b(T t) {
            this.f65a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f65a.f(playbackInfo.getPlaybackType(), c.b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f65a.j(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f65a.b(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f65a.a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f65a.c(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f65a.d(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f65a.e();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f65a.g(str, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static AudioAttributes a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int b(Object obj) {
            return c(a(obj));
        }

        private static int c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }
}
