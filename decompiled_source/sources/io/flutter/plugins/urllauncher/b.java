package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2799a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f2800b;

    /* loaded from: classes.dex */
    enum a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, Activity activity) {
        this.f2799a = context;
        this.f2800b = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f2799a.getPackageManager());
        return (resolveActivity == null || "{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f2799a.sendBroadcast(new Intent(WebViewActivity.f2789f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Activity activity = this.f2800b;
        if (activity == null) {
            return a.NO_ACTIVITY;
        }
        try {
            this.f2800b.startActivity(z ? WebViewActivity.b(activity, str, z2, z3, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle));
            return a.OK;
        } catch (ActivityNotFoundException unused) {
            return a.ACTIVITY_NOT_FOUND;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Activity activity) {
        this.f2800b = activity;
    }
}
