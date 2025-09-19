package io.flutter.app;

import android.app.Application;

/* loaded from: classes.dex */
public class FlutterApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        d.a.a.d().b().i(this);
    }
}
