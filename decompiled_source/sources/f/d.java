package f;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface d extends s, WritableByteChannel {
    c a();

    d c(byte[] bArr);

    d d(byte[] bArr, int i, int i2);

    @Override // f.s, java.io.Flushable
    void flush();

    d g();

    d h(long j);

    d m(int i);

    d n(int i);

    d s(String str);

    d w(int i);
}
