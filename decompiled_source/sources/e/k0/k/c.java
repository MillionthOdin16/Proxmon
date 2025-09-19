package e.k0.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final f.f f2103d = f.f.g(":");

    /* renamed from: e, reason: collision with root package name */
    public static final f.f f2104e = f.f.g(":status");

    /* renamed from: f, reason: collision with root package name */
    public static final f.f f2105f = f.f.g(":method");
    public static final f.f g = f.f.g(":path");
    public static final f.f h = f.f.g(":scheme");
    public static final f.f i = f.f.g(":authority");

    /* renamed from: a, reason: collision with root package name */
    public final f.f f2106a;

    /* renamed from: b, reason: collision with root package name */
    public final f.f f2107b;

    /* renamed from: c, reason: collision with root package name */
    final int f2108c;

    public c(f.f fVar, f.f fVar2) {
        this.f2106a = fVar;
        this.f2107b = fVar2;
        this.f2108c = fVar.o() + 32 + fVar2.o();
    }

    public c(f.f fVar, String str) {
        this(fVar, f.f.g(str));
    }

    public c(String str, String str2) {
        this(f.f.g(str), f.f.g(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2106a.equals(cVar.f2106a) && this.f2107b.equals(cVar.f2107b);
    }

    public int hashCode() {
        return ((527 + this.f2106a.hashCode()) * 31) + this.f2107b.hashCode();
    }

    public String toString() {
        return e.k0.e.o("%s: %s", this.f2106a.t(), this.f2107b.t());
    }
}
