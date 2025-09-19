package b.b.a.b;

import b.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f965f = new HashMap<>();

    @Override // b.b.a.b.b
    protected b.c<K, V> c(K k) {
        return this.f965f.get(k);
    }

    public boolean contains(K k) {
        return this.f965f.containsKey(k);
    }

    @Override // b.b.a.b.b
    public V g(K k, V v) {
        b.c<K, V> c2 = c(k);
        if (c2 != null) {
            return c2.f971c;
        }
        this.f965f.put(k, f(k, v));
        return null;
    }

    @Override // b.b.a.b.b
    public V h(K k) {
        V v = (V) super.h(k);
        this.f965f.remove(k);
        return v;
    }

    public Map.Entry<K, V> i(K k) {
        if (contains(k)) {
            return this.f965f.get(k).f973e;
        }
        return null;
    }
}
