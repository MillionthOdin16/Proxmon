package b.d;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f1033a;

    /* renamed from: b, reason: collision with root package name */
    private int f1034b;

    /* renamed from: c, reason: collision with root package name */
    private int f1035c;

    /* renamed from: d, reason: collision with root package name */
    private int f1036d;

    /* renamed from: e, reason: collision with root package name */
    private int f1037e;

    /* renamed from: f, reason: collision with root package name */
    private int f1038f;
    private int g;
    private int h;

    public e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1035c = i;
        this.f1033a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int e(K k, V v) {
        int f2 = f(k, v);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    protected V a(K k) {
        return null;
    }

    protected void b(boolean z, K k, V v, V v2) {
    }

    public final V c(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f1033a.get(k);
            if (v2 != null) {
                this.g++;
                return v2;
            }
            this.h++;
            V a2 = a(k);
            if (a2 == null) {
                return null;
            }
            synchronized (this) {
                this.f1037e++;
                v = (V) this.f1033a.put(k, a2);
                if (v != null) {
                    this.f1033a.put(k, v);
                } else {
                    this.f1034b += e(k, a2);
                }
            }
            if (v != null) {
                b(false, k, a2, v);
                return v;
            }
            g(this.f1035c);
            return a2;
        }
    }

    public final V d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1036d++;
            this.f1034b += e(k, v);
            put = this.f1033a.put(k, v);
            if (put != null) {
                this.f1034b -= e(k, put);
            }
        }
        if (put != null) {
            b(false, k, put, v);
        }
        g(this.f1035c);
        return put;
    }

    protected int f(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1034b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1033a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1034b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1034b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1033a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1033a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1033a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1034b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1034b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1038f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1038f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: b.d.e.g(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.g + this.h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1035c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}
