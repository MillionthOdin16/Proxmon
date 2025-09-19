package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: c, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1619c = new c.b.a.a.a.a.e("PackageStateCache");

    /* renamed from: a, reason: collision with root package name */
    private final Context f1620a;

    /* renamed from: b, reason: collision with root package name */
    private int f1621b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(Context context) {
        this.f1620a = context;
    }

    public final synchronized int a() {
        if (this.f1621b == -1) {
            try {
                this.f1621b = this.f1620a.getPackageManager().getPackageInfo(this.f1620a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f1619c.e("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f1621b;
    }
}
