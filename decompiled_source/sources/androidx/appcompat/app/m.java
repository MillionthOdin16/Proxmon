package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class m {

    /* renamed from: d, reason: collision with root package name */
    private static m f194d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f195a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f196b;

    /* renamed from: c, reason: collision with root package name */
    private final a f197c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f198a;

        /* renamed from: b, reason: collision with root package name */
        long f199b;

        /* renamed from: c, reason: collision with root package name */
        long f200c;

        /* renamed from: d, reason: collision with root package name */
        long f201d;

        /* renamed from: e, reason: collision with root package name */
        long f202e;

        /* renamed from: f, reason: collision with root package name */
        long f203f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f195a = context;
        this.f196b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m a(Context context) {
        if (f194d == null) {
            Context applicationContext = context.getApplicationContext();
            f194d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f194d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c2 = b.e.d.c.b(this.f195a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c3 = b.e.d.c.b(this.f195a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c3 == null || c2 == null) ? c3 != null ? c3 : c2 : c3.getTime() > c2.getTime() ? c3 : c2;
    }

    private Location c(String str) {
        try {
            if (this.f196b.isProviderEnabled(str)) {
                return this.f196b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f197c.f203f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.f197c;
        long currentTimeMillis = System.currentTimeMillis();
        l b2 = l.b();
        b2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b2.f191a;
        b2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.f193c == 1;
        long j3 = b2.f192b;
        long j4 = b2.f191a;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b2.f192b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f198a = z2;
        aVar.f199b = j2;
        aVar.f200c = j3;
        aVar.f201d = j4;
        aVar.f202e = j5;
        aVar.f203f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f197c;
        if (e()) {
            return aVar.f198a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.f198a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
