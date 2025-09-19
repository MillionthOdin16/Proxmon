package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.ComponentName;
import b.c.b.c;
import b.c.b.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ServiceConnection extends e {
    private WeakReference<ServiceConnectionCallback> mConnectionCallback;

    public ServiceConnection(ServiceConnectionCallback serviceConnectionCallback) {
        this.mConnectionCallback = new WeakReference<>(serviceConnectionCallback);
    }

    @Override // b.c.b.e
    public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceConnected(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceDisconnected();
        }
    }
}
