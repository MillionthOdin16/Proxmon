package d.a.c.a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class r implements g<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f1889a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final r f1890b = new r();

    private r() {
    }

    @Override // d.a.c.a.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f1889a);
    }

    @Override // d.a.c.a.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1889a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
