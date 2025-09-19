package com.google.android.play.core.assetpacks;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.e f1551b = new c.b.a.a.a.a.e("AssetPackExtractionService");

    /* renamed from: c, reason: collision with root package name */
    Context f1552c;

    /* renamed from: d, reason: collision with root package name */
    w2 f1553d;

    /* renamed from: e, reason: collision with root package name */
    c0 f1554e;

    /* renamed from: f, reason: collision with root package name */
    private a0 f1555f;
    private NotificationManager g;

    private final synchronized void c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f1552c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f1552c).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f1551b.f("Starting foreground service.", new Object[0]);
        this.f1553d.b(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.g.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        c.b.a.a.a.a.e eVar = this.f1551b;
        Integer valueOf = Integer.valueOf(i);
        eVar.c("updateServiceState: %d", valueOf);
        if (i == 1) {
            c(bundle);
        } else if (i == 2) {
            b();
        } else {
            this.f1551b.e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.f1551b.f("Stopping service.", new Object[0]);
        this.f1553d.b(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1555f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f1551b.c("onCreate", new Object[0]);
        w1.a(getApplicationContext()).a(this);
        this.f1555f = new a0(this.f1552c, this, this.f1554e);
        this.g = (NotificationManager) this.f1552c.getSystemService("notification");
    }
}
