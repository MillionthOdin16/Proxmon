package d.a.c.a;

import d.a.c.a.b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d.a.c.a.b f1860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1861b;

    /* renamed from: c, reason: collision with root package name */
    private final g<T> f1862c;

    /* loaded from: classes.dex */
    private final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f1863a;

        /* renamed from: d.a.c.a.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0057a implements e<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0058b f1865a;

            C0057a(b.InterfaceC0058b interfaceC0058b) {
                this.f1865a = interfaceC0058b;
            }

            @Override // d.a.c.a.a.e
            public void a(T t) {
                this.f1865a.a(a.this.f1862c.b(t));
            }
        }

        private b(d<T> dVar) {
            this.f1863a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d.a.c.a.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
            try {
                this.f1863a.a(a.this.f1862c.a(byteBuffer), new C0057a(interfaceC0058b));
            } catch (RuntimeException e2) {
                d.a.b.c("BasicMessageChannel#" + a.this.f1861b, "Failed to handle message", e2);
                interfaceC0058b.a(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements b.InterfaceC0058b {

        /* renamed from: a, reason: collision with root package name */
        private final e<T> f1867a;

        private c(e<T> eVar) {
            this.f1867a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d.a.c.a.b.InterfaceC0058b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f1867a.a(a.this.f1862c.a(byteBuffer));
            } catch (RuntimeException e2) {
                d.a.b.c("BasicMessageChannel#" + a.this.f1861b, "Failed to handle message reply", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t, e<T> eVar);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t);
    }

    public a(d.a.c.a.b bVar, String str, g<T> gVar) {
        this.f1860a = bVar;
        this.f1861b = str;
        this.f1862c = gVar;
    }

    public void c(T t) {
        d(t, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(T t, e<T> eVar) {
        this.f1860a.a(this.f1861b, this.f1862c.b(t), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(d<T> dVar) {
        this.f1860a.c(this.f1861b, dVar != null ? new b(dVar) : null);
    }
}
