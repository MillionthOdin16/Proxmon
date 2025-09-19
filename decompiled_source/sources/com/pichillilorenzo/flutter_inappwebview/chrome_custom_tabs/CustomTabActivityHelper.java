package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import b.c.b.b;
import b.c.b.c;
import b.c.b.d;
import b.c.b.e;
import b.c.b.f;
import java.util.List;

/* loaded from: classes.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private c mClient;
    private e mConnection;
    private ConnectionCallback mConnectionCallback;
    private b mCustomTabsCallback;
    private f mCustomTabsSession;

    /* loaded from: classes.dex */
    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, d dVar, Uri uri, int i) {
        dVar.f1007a.setData(uri);
        activity.startActivityForResult(dVar.f1007a, i);
    }

    public void bindCustomTabsService(Activity activity) {
        String packageNameToUse;
        if (this.mClient == null && (packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity)) != null) {
            ServiceConnection serviceConnection = new ServiceConnection(this);
            this.mConnection = serviceConnection;
            c.a(activity, packageNameToUse, serviceConnection);
        }
    }

    public f getSession() {
        f c2;
        c cVar = this.mClient;
        if (cVar != null) {
            c2 = this.mCustomTabsSession == null ? cVar.c(this.mCustomTabsCallback) : null;
            return this.mCustomTabsSession;
        }
        this.mCustomTabsSession = c2;
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        f session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        return session.f(uri, bundle, list);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(c cVar) {
        this.mClient = cVar;
        cVar.e(0L);
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(b bVar) {
        this.mCustomTabsCallback = bVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        e eVar = this.mConnection;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }
}
