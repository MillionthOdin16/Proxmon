package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public abstract class d {
    @Deprecated
    public Fragment a(Context context, String str, Bundle bundle) {
        return Fragment.H(context, str, bundle);
    }

    public abstract View b(int i);

    public abstract boolean c();
}
