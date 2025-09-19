package d.a.c.a;

import d.a.c.a.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final d.a.c.a.b f1875a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1876b;

    /* renamed from: c, reason: collision with root package name */
    private final j f1877c;

    /* loaded from: classes.dex */
    private final class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f1878a;

        /* renamed from: d.a.c.a.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0059a implements d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0058b f1880a;

            C0059a(b.InterfaceC0058b interfaceC0058b) {
                this.f1880a = interfaceC0058b;
            }

            @Override // d.a.c.a.i.d
            public void error(String str, String str2, Object obj) {
                this.f1880a.a(i.this.f1877c.f(str, str2, obj));
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                this.f1880a.a(null);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                this.f1880a.a(i.this.f1877c.a(obj));
            }
        }

        a(c cVar) {
            this.f1878a = cVar;
        }

        private String b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        @Override // d.a.c.a.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
            try {
                this.f1878a.onMethodCall(i.this.f1877c.b(byteBuffer), new C0059a(interfaceC0058b));
            } catch (RuntimeException e2) {
                d.a.b.c("MethodChannel#" + i.this.f1876b, "Failed to handle method call", e2);
                interfaceC0058b.a(i.this.f1877c.d("error", e2.getMessage(), null, b(e2)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements b.InterfaceC0058b {

        /* renamed from: a, reason: collision with root package name */
        private final d f1882a;

        b(d dVar) {
            this.f1882a = dVar;
        }

        @Override // d.a.c.a.b.InterfaceC0058b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f1882a.notImplemented();
                } else {
                    try {
                        this.f1882a.success(i.this.f1877c.c(byteBuffer));
                    } catch (d.a.c.a.c e2) {
                        this.f1882a.error(e2.f1869b, e2.getMessage(), e2.f1870c);
                    }
                }
            } catch (RuntimeException e3) {
                d.a.b.c("MethodChannel#" + i.this.f1876b, "Failed to handle method call result", e3);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onMethodCall(h hVar, d dVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void error(String str, String str2, Object obj);

        void notImplemented();

        void success(Object obj);
    }

    public i(d.a.c.a.b bVar, String str) {
        this(bVar, str, q.f1887b);
    }

    public i(d.a.c.a.b bVar, String str, j jVar) {
        this.f1875a = bVar;
        this.f1876b = str;
        this.f1877c = jVar;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f1875a.a(this.f1876b, this.f1877c.e(new h(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        this.f1875a.c(this.f1876b, cVar == null ? null : new a(cVar));
    }
}
