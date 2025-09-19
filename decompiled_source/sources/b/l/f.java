package b.l;

import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public static abstract class a {
        public void onMessage(f fVar, e eVar) {
        }
    }

    public abstract void a();

    public abstract WebMessagePort b();

    public abstract InvocationHandler c();

    public abstract void d(e eVar);

    public abstract void e(a aVar);
}
