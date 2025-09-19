package io.flutter.embedding.engine.i.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.android.d;

/* loaded from: classes.dex */
public interface b {
    void a(Intent intent);

    void b(Bundle bundle);

    void c(Bundle bundle);

    void d();

    void e(d<Activity> dVar, androidx.lifecycle.d dVar2);

    void f();

    void h();

    boolean onActivityResult(int i, int i2, Intent intent);

    boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
}
