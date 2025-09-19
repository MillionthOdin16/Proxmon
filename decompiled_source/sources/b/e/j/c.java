package b.e.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1187a;

    private c(Object obj) {
        this.f1187a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1187a;
        Object obj3 = ((c) obj).f1187a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f1187a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1187a + "}";
    }
}
