package b.d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0026a extends f<K, V> {
        C0026a() {
        }

        @Override // b.d.f
        protected void a() {
            a.this.clear();
        }

        @Override // b.d.f
        protected Object b(int i, int i2) {
            return a.this.f1057c[(i << 1) + i2];
        }

        @Override // b.d.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // b.d.f
        protected int d() {
            return a.this.f1058d;
        }

        @Override // b.d.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // b.d.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // b.d.f
        protected void g(K k, V v) {
            a.this.put(k, v);
        }

        @Override // b.d.f
        protected void h(int i) {
            a.this.j(i);
        }

        @Override // b.d.f
        protected V i(int i, V v) {
            return a.this.k(i, v);
        }
    }

    public a() {
    }

    public a(int i) {
        super(i);
    }

    private f<K, V> m() {
        if (this.i == null) {
            this.i = new C0026a();
        }
        return this.i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f1058d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
