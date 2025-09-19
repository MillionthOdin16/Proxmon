package b.c.b;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import b.c.b.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f1007a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f1010c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f1011d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f1012e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f1013f;
        private Bundle g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f1008a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0023a f1009b = new a.C0023a();
        private int h = 0;
        private boolean i = true;

        public a(f fVar) {
            if (fVar != null) {
                f(fVar);
            }
        }

        private void g(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.d.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1008a.putExtras(bundle);
        }

        @Deprecated
        public a a() {
            h(1);
            return this;
        }

        public a b(String str, PendingIntent pendingIntent) {
            if (this.f1010c == null) {
                this.f1010c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1010c.add(bundle);
            return this;
        }

        public d c() {
            if (!this.f1008a.hasExtra("android.support.customtabs.extra.SESSION")) {
                g(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1010c;
            if (arrayList != null) {
                this.f1008a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1012e;
            if (arrayList2 != null) {
                this.f1008a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1008a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.f1008a.putExtras(this.f1009b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.f1008a.putExtras(bundle);
            }
            if (this.f1013f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1013f);
                this.f1008a.putExtras(bundle2);
            }
            this.f1008a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            return new d(this.f1008a, this.f1011d);
        }

        @Deprecated
        public a d() {
            this.f1008a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }

        public a e(boolean z) {
            this.i = z;
            return this;
        }

        public a f(f fVar) {
            this.f1008a.setPackage(fVar.d().getPackageName());
            g(fVar.c(), fVar.e());
            return this;
        }

        public a h(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.h = i;
            if (i == 1) {
                this.f1008a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i == 2) {
                this.f1008a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1008a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public a i(boolean z) {
            this.f1008a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        @Deprecated
        public a j(int i) {
            this.f1009b.b(i);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1007a = intent;
    }
}
