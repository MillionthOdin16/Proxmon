package c.b.a.a.a.a;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class u implements Closeable {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract InputStream A(long j, long j2);

    public synchronized InputStream B() {
        return A(0L, r());
    }

    public abstract long r();
}
