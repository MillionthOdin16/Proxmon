package io.flutter.embedding.engine.h;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2497c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2498d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f2499e;

    public b(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f2495a = str == null ? "libapp.so" : str;
        this.f2496b = str4 == null ? "flutter_assets" : str4;
        this.f2498d = str6;
        this.f2497c = str5 == null ? BuildConfig.VERSION_NAME : str5;
        this.f2499e = z;
    }
}
