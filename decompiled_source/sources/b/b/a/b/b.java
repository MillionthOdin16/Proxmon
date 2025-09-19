package b.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    c<K, V> f966b;

    /* renamed from: c, reason: collision with root package name */
    private c<K, V> f967c;

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f968d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private int f969e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f973e;
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f972d;
        }
    }

    /* renamed from: b.b.a.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0022b<K, V> extends e<K, V> {
        C0022b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f972d;
        }

        @Override // b.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f973e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final K f970b;

        /* renamed from: c, reason: collision with root package name */
        final V f971c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f972d;

        /* renamed from: e, reason: collision with root package name */
        c<K, V> f973e;

        c(K k, V v) {
            this.f970b = k;
            this.f971c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f970b.equals(cVar.f970b) && this.f971c.equals(cVar.f971c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f970b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f971c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f970b.hashCode() ^ this.f971c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f970b + "=" + this.f971c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private c<K, V> f974b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f975c = true;

        d() {
        }

        @Override // b.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f974b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f973e;
                this.f974b = cVar3;
                this.f975c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f975c) {
                this.f975c = false;
                cVar = b.this.f966b;
            } else {
                c<K, V> cVar2 = this.f974b;
                cVar = cVar2 != null ? cVar2.f972d : null;
            }
            this.f974b = cVar;
            return this.f974b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f975c) {
                return b.this.f966b != null;
            }
            c<K, V> cVar = this.f974b;
            return (cVar == null || cVar.f972d == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f977b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f978c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f977b = cVar2;
            this.f978c = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f978c;
            c<K, V> cVar2 = this.f977b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // b.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f977b == cVar && cVar == this.f978c) {
                this.f978c = null;
                this.f977b = null;
            }
            c<K, V> cVar2 = this.f977b;
            if (cVar2 == cVar) {
                this.f977b = b(cVar2);
            }
            if (this.f978c == cVar) {
                this.f978c = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f978c;
            this.f978c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f978c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0022b c0022b = new C0022b(this.f967c, this.f966b);
        this.f968d.put(c0022b, Boolean.FALSE);
        return c0022b;
    }

    public Map.Entry<K, V> b() {
        return this.f966b;
    }

    protected c<K, V> c(K k) {
        c<K, V> cVar = this.f966b;
        while (cVar != null && !cVar.f970b.equals(k)) {
            cVar = cVar.f972d;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f968d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f967c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> f(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f969e++;
        c<K, V> cVar2 = this.f967c;
        if (cVar2 == null) {
            this.f966b = cVar;
        } else {
            cVar2.f972d = cVar;
            cVar.f973e = cVar2;
        }
        this.f967c = cVar;
        return cVar;
    }

    public V g(K k, V v) {
        c<K, V> c2 = c(k);
        if (c2 != null) {
            return c2.f971c;
        }
        f(k, v);
        return null;
    }

    public V h(K k) {
        c<K, V> c2 = c(k);
        if (c2 == null) {
            return null;
        }
        this.f969e--;
        if (!this.f968d.isEmpty()) {
            Iterator<f<K, V>> it = this.f968d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(c2);
            }
        }
        c<K, V> cVar = c2.f973e;
        if (cVar != null) {
            cVar.f972d = c2.f972d;
        } else {
            this.f966b = c2.f972d;
        }
        c<K, V> cVar2 = c2.f972d;
        if (cVar2 != null) {
            cVar2.f973e = c2.f973e;
        } else {
            this.f967c = c2.f973e;
        }
        c2.f972d = null;
        c2.f973e = null;
        return c2.f971c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f966b, this.f967c);
        this.f968d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f969e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
