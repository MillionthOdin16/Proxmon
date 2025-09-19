package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends c.b.a.a.a.b.c<c> {
    private final m1 g;
    private final v0 h;
    private final c.b.a.a.a.a.d0<k3> i;
    private final m0 j;
    private final y0 k;
    private final com.google.android.play.core.common.c l;
    private final c.b.a.a.a.a.d0<Executor> m;
    private final c.b.a.a.a.a.d0<Executor> n;
    private final Handler o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Context context, m1 m1Var, v0 v0Var, c.b.a.a.a.a.d0<k3> d0Var, y0 y0Var, m0 m0Var, com.google.android.play.core.common.c cVar, c.b.a.a.a.a.d0<Executor> d0Var2, c.b.a.a.a.a.d0<Executor> d0Var3) {
        super(new c.b.a.a.a.a.e("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.o = new Handler(Looper.getMainLooper());
        this.g = m1Var;
        this.h = v0Var;
        this.i = d0Var;
        this.k = y0Var;
        this.j = m0Var;
        this.l = cVar;
        this.m = d0Var2;
        this.n = d0Var3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.b.a.a.a.b.c
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f1430a.e("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f1430a.e("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra2 != null) {
            this.l.a(bundleExtra2);
        }
        final c a2 = c.a(bundleExtra, stringArrayList.get(0), this.k, y.f1835a);
        this.f1430a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.j.a(pendingIntent);
        }
        this.n.a().execute(new Runnable(this, bundleExtra, a2) { // from class: com.google.android.play.core.assetpacks.u

            /* renamed from: b, reason: collision with root package name */
            private final w f1778b;

            /* renamed from: c, reason: collision with root package name */
            private final Bundle f1779c;

            /* renamed from: d, reason: collision with root package name */
            private final c f1780d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1778b = this;
                this.f1779c = bundleExtra;
                this.f1780d = a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1778b.g(this.f1779c, this.f1780d);
            }
        });
        this.m.a().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.v

            /* renamed from: b, reason: collision with root package name */
            private final w f1789b;

            /* renamed from: c, reason: collision with root package name */
            private final Bundle f1790c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1789b = this;
                this.f1790c = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1789b.f(this.f1790c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(Bundle bundle) {
        if (this.g.e(bundle)) {
            this.h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(Bundle bundle, c cVar) {
        if (this.g.i(bundle)) {
            h(cVar);
            this.i.a().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(final c cVar) {
        this.o.post(new Runnable(this, cVar) { // from class: com.google.android.play.core.assetpacks.t

            /* renamed from: b, reason: collision with root package name */
            private final w f1769b;

            /* renamed from: c, reason: collision with root package name */
            private final c f1770c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1769b = this;
                this.f1770c = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1769b.b(this.f1770c);
            }
        });
    }
}
