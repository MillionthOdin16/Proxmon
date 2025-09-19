package androidx.lifecycle;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final a f865a;

    /* renamed from: b, reason: collision with root package name */
    private final r f866b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends p> T a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends p> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends p> T b(String str, Class<T> cls);
    }

    public q(r rVar, a aVar) {
        this.f865a = aVar;
        this.f866b = rVar;
    }

    public <T extends p> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends p> T b(String str, Class<T> cls) {
        T t = (T) this.f866b.b(str);
        if (cls.isInstance(t)) {
            return t;
        }
        a aVar = this.f865a;
        T t2 = aVar instanceof b ? (T) ((b) aVar).b(str, cls) : (T) aVar.a(cls);
        this.f866b.c(str, t2);
        return t2;
    }
}
