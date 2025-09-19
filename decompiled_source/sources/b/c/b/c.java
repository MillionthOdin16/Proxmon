package b.c.b;

import a.a.a.a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final a.a.a.b f987a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f988b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0000a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f989a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.c.b.b f990b;

        /* renamed from: b.c.b.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0024a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f991b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f992c;

            RunnableC0024a(int i, Bundle bundle) {
                this.f991b = i;
                this.f992c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f990b.onNavigationEvent(this.f991b, this.f992c);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f994b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f995c;

            b(String str, Bundle bundle) {
                this.f994b = str;
                this.f995c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f990b.extraCallback(this.f994b, this.f995c);
            }
        }

        /* renamed from: b.c.b.c$a$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0025c implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f997b;

            RunnableC0025c(Bundle bundle) {
                this.f997b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f990b.onMessageChannelReady(this.f997b);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f999b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f1000c;

            d(String str, Bundle bundle) {
                this.f999b = str;
                this.f1000c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f990b.onPostMessage(this.f999b, this.f1000c);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1002b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f1003c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f1004d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f1005e;

            e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f1002b = i;
                this.f1003c = uri;
                this.f1004d = z;
                this.f1005e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f990b.onRelationshipValidationResult(this.f1002b, this.f1003c, this.f1004d, this.f1005e);
            }
        }

        a(c cVar, b.c.b.b bVar) {
            this.f990b = bVar;
        }

        @Override // a.a.a.a
        public void B(String str, Bundle bundle) {
            if (this.f990b == null) {
                return;
            }
            this.f989a.post(new d(str, bundle));
        }

        @Override // a.a.a.a
        public void C(String str, Bundle bundle) {
            if (this.f990b == null) {
                return;
            }
            this.f989a.post(new b(str, bundle));
        }

        @Override // a.a.a.a
        public void E(Bundle bundle) {
            if (this.f990b == null) {
                return;
            }
            this.f989a.post(new RunnableC0025c(bundle));
        }

        @Override // a.a.a.a
        public void H(int i, Uri uri, boolean z, Bundle bundle) {
            if (this.f990b == null) {
                return;
            }
            this.f989a.post(new e(i, uri, z, bundle));
        }

        @Override // a.a.a.a
        public void T(int i, Bundle bundle) {
            if (this.f990b == null) {
                return;
            }
            this.f989a.post(new RunnableC0024a(i, bundle));
        }

        @Override // a.a.a.a
        public Bundle o(String str, Bundle bundle) {
            b.c.b.b bVar = this.f990b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a.a.a.b bVar, ComponentName componentName, Context context) {
        this.f987a = bVar;
        this.f988b = componentName;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0000a b(b bVar) {
        return new a(this, bVar);
    }

    private f d(b bVar, PendingIntent pendingIntent) {
        boolean x;
        a.AbstractBinderC0000a b2 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                x = this.f987a.A(b2, bundle);
            } else {
                x = this.f987a.x(b2);
            }
            if (x) {
                return new f(this.f987a, b2, this.f988b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f c(b bVar) {
        return d(bVar, null);
    }

    public boolean e(long j) {
        try {
            return this.f987a.G(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
