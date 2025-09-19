package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f864a = new HashMap();

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Map<String, Object> map = this.f864a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f864a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }
}
