package b.d;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f1059f = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f1060b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f1061c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f1062d;

    /* renamed from: e, reason: collision with root package name */
    private int f1063e;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f1060b = false;
        if (i == 0) {
            this.f1061c = c.f1025a;
            this.f1062d = c.f1027c;
        } else {
            int e2 = c.e(i);
            this.f1061c = new int[e2];
            this.f1062d = new Object[e2];
        }
    }

    private void d() {
        int i = this.f1063e;
        int[] iArr = this.f1061c;
        Object[] objArr = this.f1062d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1059f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1060b = false;
        this.f1063e = i2;
    }

    public void a(int i, E e2) {
        int i2 = this.f1063e;
        if (i2 != 0 && i <= this.f1061c[i2 - 1]) {
            i(i, e2);
            return;
        }
        if (this.f1060b && this.f1063e >= this.f1061c.length) {
            d();
        }
        int i3 = this.f1063e;
        if (i3 >= this.f1061c.length) {
            int e3 = c.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f1061c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1062d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1061c = iArr;
            this.f1062d = objArr;
        }
        this.f1061c[i3] = i;
        this.f1062d[i3] = e2;
        this.f1063e = i3 + 1;
    }

    public void b() {
        int i = this.f1063e;
        Object[] objArr = this.f1062d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1063e = 0;
        this.f1060b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1061c = (int[]) this.f1061c.clone();
            hVar.f1062d = (Object[]) this.f1062d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(int i) {
        return f(i, null);
    }

    public E f(int i, E e2) {
        int a2 = c.a(this.f1061c, this.f1063e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f1062d;
            if (objArr[a2] != f1059f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int g(int i) {
        if (this.f1060b) {
            d();
        }
        return c.a(this.f1061c, this.f1063e, i);
    }

    public int h(int i) {
        if (this.f1060b) {
            d();
        }
        return this.f1061c[i];
    }

    public void i(int i, E e2) {
        int a2 = c.a(this.f1061c, this.f1063e, i);
        if (a2 >= 0) {
            this.f1062d[a2] = e2;
            return;
        }
        int i2 = a2 ^ (-1);
        if (i2 < this.f1063e) {
            Object[] objArr = this.f1062d;
            if (objArr[i2] == f1059f) {
                this.f1061c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1060b && this.f1063e >= this.f1061c.length) {
            d();
            i2 = c.a(this.f1061c, this.f1063e, i) ^ (-1);
        }
        int i3 = this.f1063e;
        if (i3 >= this.f1061c.length) {
            int e3 = c.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f1061c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1062d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1061c = iArr;
            this.f1062d = objArr2;
        }
        int i4 = this.f1063e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f1061c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f1062d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f1063e - i2);
        }
        this.f1061c[i2] = i;
        this.f1062d[i2] = e2;
        this.f1063e++;
    }

    public void j(int i) {
        int a2 = c.a(this.f1061c, this.f1063e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f1062d;
            Object obj = objArr[a2];
            Object obj2 = f1059f;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.f1060b = true;
            }
        }
    }

    public int k() {
        if (this.f1060b) {
            d();
        }
        return this.f1063e;
    }

    public E l(int i) {
        if (this.f1060b) {
            d();
        }
        return (E) this.f1062d[i];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1063e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1063e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(h(i));
            sb.append('=');
            E l = l(i);
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
