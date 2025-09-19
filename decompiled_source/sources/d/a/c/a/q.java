package d.a.c.a;

import d.a.c.a.p;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final q f1887b = new q(p.f1884a);

    /* renamed from: a, reason: collision with root package name */
    private final p f1888a;

    public q(p pVar) {
        this.f1888a = pVar;
    }

    private static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // d.a.c.a.j
    public ByteBuffer a(Object obj) {
        p.a aVar = new p.a();
        aVar.write(0);
        this.f1888a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.r(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // d.a.c.a.j
    public h b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f2 = this.f1888a.f(byteBuffer);
        Object f3 = this.f1888a.f(byteBuffer);
        if (!(f2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new h((String) f2, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // d.a.c.a.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            d.a.c.a.p r0 = r4.f1888a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            d.a.c.a.p r0 = r4.f1888a
            java.lang.Object r0 = r0.f(r5)
            d.a.c.a.p r1 = r4.f1888a
            java.lang.Object r1 = r1.f(r5)
            d.a.c.a.p r2 = r4.f1888a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            d.a.c.a.c r5 = new d.a.c.a.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.c.a.q.c(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // d.a.c.a.j
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        p.a aVar = new p.a();
        aVar.write(1);
        this.f1888a.p(aVar, str);
        this.f1888a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f1888a.p(aVar, g((Throwable) obj));
        } else {
            this.f1888a.p(aVar, obj);
        }
        this.f1888a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.r(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // d.a.c.a.j
    public ByteBuffer e(h hVar) {
        p.a aVar = new p.a();
        this.f1888a.p(aVar, hVar.f1873a);
        this.f1888a.p(aVar, hVar.f1874b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.r(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // d.a.c.a.j
    public ByteBuffer f(String str, String str2, Object obj) {
        p.a aVar = new p.a();
        aVar.write(1);
        this.f1888a.p(aVar, str);
        this.f1888a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f1888a.p(aVar, g((Throwable) obj));
        } else {
            this.f1888a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.r(), 0, aVar.size());
        return allocateDirect;
    }
}
