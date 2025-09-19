package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterable<Intent> {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f637b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Context f638c;

    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private h(Context context) {
        this.f638c = context;
    }

    public static h d(Context context) {
        return new h(context);
    }

    public h a(Intent intent) {
        this.f637b.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = f.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f638c.getPackageManager());
            }
            c(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public h c(ComponentName componentName) {
        int size = this.f637b.size();
        try {
            Context context = this.f638c;
            while (true) {
                Intent b2 = f.b(context, componentName);
                if (b2 == null) {
                    return this;
                }
                this.f637b.add(size, b2);
                context = this.f638c;
                componentName = b2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f637b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f637b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (b.e.d.a.g(this.f638c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f638c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f637b.iterator();
    }
}
