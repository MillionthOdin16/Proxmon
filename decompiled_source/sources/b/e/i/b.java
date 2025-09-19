package b.e.i;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class b extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final String f1166b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f1167c = new StringBuilder(128);

    public b(String str) {
        this.f1166b = str;
    }

    private void r() {
        if (this.f1167c.length() > 0) {
            Log.d(this.f1166b, this.f1167c.toString());
            StringBuilder sb = this.f1167c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        r();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                r();
            } else {
                this.f1167c.append(c2);
            }
        }
    }
}
