package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public interface f {
    void dispose();

    View getView();

    @SuppressLint({"NewApi"})
    void onFlutterViewAttached(View view);

    @SuppressLint({"NewApi"})
    void onFlutterViewDetached();

    @SuppressLint({"NewApi"})
    void onInputConnectionLocked();

    @SuppressLint({"NewApi"})
    void onInputConnectionUnlocked();
}
