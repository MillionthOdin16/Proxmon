package b.d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: e, reason: collision with root package name */
    static Object[] f1054e;

    /* renamed from: f, reason: collision with root package name */
    static int f1055f;
    static Object[] g;
    static int h;

    /* renamed from: b, reason: collision with root package name */
    int[] f1056b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f1057c;

    /* renamed from: d, reason: collision with root package name */
    int f1058d;

    public g() {
        this.f1056b = c.f1025a;
        this.f1057c = c.f1027c;
        this.f1058d = 0;
    }

    public g(int i) {
        if (i == 0) {
            this.f1056b = c.f1025a;
            this.f1057c = c.f1027c;
        } else {
            a(i);
        }
        this.f1058d = 0;
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (g.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.f1057c = objArr;
                    g = (Object[]) objArr[0];
                    this.f1056b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (g.class) {
                if (f1054e != null) {
                    Object[] objArr2 = f1054e;
                    this.f1057c = objArr2;
                    f1054e = (Object[]) objArr2[0];
                    this.f1056b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1055f--;
                    return;
                }
            }
        }
        this.f1056b = new int[i];
        this.f1057c = new Object[i << 1];
    }

    private static int b(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                if (f1055f < 10) {
                    objArr[0] = f1054e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1054e = objArr;
                    f1055f++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.f1058d;
        int[] iArr = this.f1056b;
        if (iArr.length < i) {
            Object[] objArr = this.f1057c;
            a(i);
            if (this.f1058d > 0) {
                System.arraycopy(iArr, 0, this.f1056b, 0, i2);
                System.arraycopy(objArr, 0, this.f1057c, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.f1058d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f1058d;
        if (i > 0) {
            int[] iArr = this.f1056b;
            Object[] objArr = this.f1057c;
            this.f1056b = c.f1025a;
            this.f1057c = c.f1027c;
            this.f1058d = 0;
            d(iArr, objArr, i);
        }
        if (this.f1058d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i) {
        int i2 = this.f1058d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f1056b, i2, i);
        if (b2 < 0 || obj.equals(this.f1057c[b2 << 1])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f1056b[i3] == i) {
            if (obj.equals(this.f1057c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b2 - 1; i4 >= 0 && this.f1056b[i4] == i; i4--) {
            if (obj.equals(this.f1057c[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f1058d; i++) {
                try {
                    K i2 = i(i);
                    V l = l(i);
                    Object obj2 = gVar.get(i2);
                    if (l == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!l.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f1058d; i3++) {
                try {
                    K i4 = i(i3);
                    V l2 = l(i3);
                    Object obj3 = map.get(i4);
                    if (l2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i = this.f1058d;
        if (i == 0) {
            return -1;
        }
        int b2 = b(this.f1056b, i, 0);
        if (b2 < 0 || this.f1057c[b2 << 1] == null) {
            return b2;
        }
        int i2 = b2 + 1;
        while (i2 < i && this.f1056b[i2] == 0) {
            if (this.f1057c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b2 - 1; i3 >= 0 && this.f1056b[i3] == 0; i3--) {
            if (this.f1057c[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.f1057c[(f2 << 1) + 1] : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i = this.f1058d * 2;
        Object[] objArr = this.f1057c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f1056b;
        Object[] objArr = this.f1057c;
        int i = this.f1058d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return (K) this.f1057c[i << 1];
    }

    public boolean isEmpty() {
        return this.f1058d <= 0;
    }

    public V j(int i) {
        Object[] objArr = this.f1057c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f1058d;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.f1056b, objArr, i3);
            this.f1056b = c.f1025a;
            this.f1057c = c.f1027c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f1056b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f1056b;
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f1057c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f1057c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.f1056b;
                Object[] objArr4 = this.f1057c;
                a(i9);
                if (i3 != this.f1058d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f1056b, 0, i);
                    System.arraycopy(objArr4, 0, this.f1057c, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.f1056b, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.f1057c, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f1058d) {
            throw new ConcurrentModificationException();
        }
        this.f1058d = i4;
        return v;
    }

    public V k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1057c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V l(int i) {
        return (V) this.f1057c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int e2;
        int i2 = this.f1058d;
        if (k == null) {
            e2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            e2 = e(k, hashCode);
        }
        if (e2 >= 0) {
            int i3 = (e2 << 1) + 1;
            Object[] objArr = this.f1057c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = e2 ^ (-1);
        if (i2 >= this.f1056b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f1056b;
            Object[] objArr2 = this.f1057c;
            a(i5);
            if (i2 != this.f1058d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1056b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1057c, 0, objArr2.length);
            }
            d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1056b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1057c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f1058d - i4) << 1);
        }
        int i7 = this.f1058d;
        if (i2 == i7) {
            int[] iArr4 = this.f1056b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f1057c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f1058d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return j(f2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        V l = l(f2);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        j(f2);
        return true;
    }

    public V replace(K k, V v) {
        int f2 = f(k);
        if (f2 >= 0) {
            return k(f2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f2 = f(k);
        if (f2 < 0) {
            return false;
        }
        V l = l(f2);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        k(f2, v2);
        return true;
    }

    public int size() {
        return this.f1058d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1058d * 28);
        sb.append('{');
        for (int i = 0; i < this.f1058d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l = l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
