package b.d;

/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f1028f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f1029b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f1030c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f1031d;

    /* renamed from: e, reason: collision with root package name */
    private int f1032e;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f1029b = false;
        if (i == 0) {
            this.f1030c = c.f1026b;
            this.f1031d = c.f1027c;
        } else {
            int f2 = c.f(i);
            this.f1030c = new long[f2];
            this.f1031d = new Object[f2];
        }
    }

    private void d() {
        int i = this.f1032e;
        long[] jArr = this.f1030c;
        Object[] objArr = this.f1031d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1028f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1029b = false;
        this.f1032e = i2;
    }

    public void a(long j, E e2) {
        int i = this.f1032e;
        if (i != 0 && j <= this.f1030c[i - 1]) {
            h(j, e2);
            return;
        }
        if (this.f1029b && this.f1032e >= this.f1030c.length) {
            d();
        }
        int i2 = this.f1032e;
        if (i2 >= this.f1030c.length) {
            int f2 = c.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f1030c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1031d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1030c = jArr;
            this.f1031d = objArr;
        }
        this.f1030c[i2] = j;
        this.f1031d[i2] = e2;
        this.f1032e = i2 + 1;
    }

    public void b() {
        int i = this.f1032e;
        Object[] objArr = this.f1031d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1032e = 0;
        this.f1029b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f1030c = (long[]) this.f1030c.clone();
            dVar.f1031d = (Object[]) this.f1031d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(long j) {
        return f(j, null);
    }

    public E f(long j, E e2) {
        int b2 = c.b(this.f1030c, this.f1032e, j);
        if (b2 >= 0) {
            Object[] objArr = this.f1031d;
            if (objArr[b2] != f1028f) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public long g(int i) {
        if (this.f1029b) {
            d();
        }
        return this.f1030c[i];
    }

    public void h(long j, E e2) {
        int b2 = c.b(this.f1030c, this.f1032e, j);
        if (b2 >= 0) {
            this.f1031d[b2] = e2;
            return;
        }
        int i = b2 ^ (-1);
        if (i < this.f1032e) {
            Object[] objArr = this.f1031d;
            if (objArr[i] == f1028f) {
                this.f1030c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f1029b && this.f1032e >= this.f1030c.length) {
            d();
            i = c.b(this.f1030c, this.f1032e, j) ^ (-1);
        }
        int i2 = this.f1032e;
        if (i2 >= this.f1030c.length) {
            int f2 = c.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f1030c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1031d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1030c = jArr;
            this.f1031d = objArr2;
        }
        int i3 = this.f1032e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f1030c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f1031d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f1032e - i);
        }
        this.f1030c[i] = j;
        this.f1031d[i] = e2;
        this.f1032e++;
    }

    public void i(long j) {
        int b2 = c.b(this.f1030c, this.f1032e, j);
        if (b2 >= 0) {
            Object[] objArr = this.f1031d;
            Object obj = objArr[b2];
            Object obj2 = f1028f;
            if (obj != obj2) {
                objArr[b2] = obj2;
                this.f1029b = true;
            }
        }
    }

    public int j() {
        if (this.f1029b) {
            d();
        }
        return this.f1032e;
    }

    public E k(int i) {
        if (this.f1029b) {
            d();
        }
        return (E) this.f1031d[i];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1032e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1032e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(g(i));
            sb.append('=');
            E k = k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
