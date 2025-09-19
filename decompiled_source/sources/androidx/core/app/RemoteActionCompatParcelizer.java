package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f605a = (IconCompat) aVar.v(remoteActionCompat.f605a, 1);
        remoteActionCompat.f606b = aVar.l(remoteActionCompat.f606b, 2);
        remoteActionCompat.f607c = aVar.l(remoteActionCompat.f607c, 3);
        remoteActionCompat.f608d = (PendingIntent) aVar.r(remoteActionCompat.f608d, 4);
        remoteActionCompat.f609e = aVar.h(remoteActionCompat.f609e, 5);
        remoteActionCompat.f610f = aVar.h(remoteActionCompat.f610f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f605a, 1);
        aVar.D(remoteActionCompat.f606b, 2);
        aVar.D(remoteActionCompat.f607c, 3);
        aVar.H(remoteActionCompat.f608d, 4);
        aVar.z(remoteActionCompat.f609e, 5);
        aVar.z(remoteActionCompat.f610f, 6);
    }
}
