package c.b.a.a.a.c;

import android.content.Context;
import android.content.Intent;
import c.b.a.a.a.a.o;
import c.b.a.a.a.f.p;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1446c = new c.b.a.a.a.a.e("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    final o<c.b.a.a.a.a.b> f1447a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1448b;

    public k(Context context) {
        this.f1448b = context.getPackageName();
        this.f1447a = new o<>(context, f1446c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), g.f1440a);
    }

    public final c.b.a.a.a.f.e<a> a() {
        f1446c.f("requestInAppReview (%s)", this.f1448b);
        p pVar = new p();
        this.f1447a.c(new h(this, pVar, pVar));
        return pVar.a();
    }
}
