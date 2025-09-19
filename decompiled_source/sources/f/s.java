package f;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface s extends Closeable, Flushable {
    u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(c cVar, long j);

    void flush();
}
