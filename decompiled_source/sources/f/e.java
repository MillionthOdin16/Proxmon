package f;

import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public interface e extends t, ReadableByteChannel {
    @Deprecated
    c a();

    short f();

    f j(long j);

    String k(long j);

    void l(long j);

    String o();

    byte[] p();

    void q(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    int t();

    c u();

    boolean v();

    long x(byte b2);

    byte[] y(long j);

    long z();
}
