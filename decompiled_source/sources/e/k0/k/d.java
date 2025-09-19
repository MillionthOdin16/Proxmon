package e.k0.k;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import f.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f2109a = {new c(c.i, BuildConfig.VERSION_NAME), new c(c.f2105f, "GET"), new c(c.f2105f, "POST"), new c(c.g, "/"), new c(c.g, "/index.html"), new c(c.h, "http"), new c(c.h, "https"), new c(c.f2104e, "200"), new c(c.f2104e, "204"), new c(c.f2104e, "206"), new c(c.f2104e, "304"), new c(c.f2104e, "400"), new c(c.f2104e, "404"), new c(c.f2104e, "500"), new c("accept-charset", BuildConfig.VERSION_NAME), new c("accept-encoding", "gzip, deflate"), new c("accept-language", BuildConfig.VERSION_NAME), new c("accept-ranges", BuildConfig.VERSION_NAME), new c("accept", BuildConfig.VERSION_NAME), new c("access-control-allow-origin", BuildConfig.VERSION_NAME), new c("age", BuildConfig.VERSION_NAME), new c("allow", BuildConfig.VERSION_NAME), new c("authorization", BuildConfig.VERSION_NAME), new c("cache-control", BuildConfig.VERSION_NAME), new c("content-disposition", BuildConfig.VERSION_NAME), new c("content-encoding", BuildConfig.VERSION_NAME), new c("content-language", BuildConfig.VERSION_NAME), new c("content-length", BuildConfig.VERSION_NAME), new c("content-location", BuildConfig.VERSION_NAME), new c("content-range", BuildConfig.VERSION_NAME), new c("content-type", BuildConfig.VERSION_NAME), new c("cookie", BuildConfig.VERSION_NAME), new c("date", BuildConfig.VERSION_NAME), new c("etag", BuildConfig.VERSION_NAME), new c("expect", BuildConfig.VERSION_NAME), new c("expires", BuildConfig.VERSION_NAME), new c("from", BuildConfig.VERSION_NAME), new c(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, BuildConfig.VERSION_NAME), new c("if-match", BuildConfig.VERSION_NAME), new c("if-modified-since", BuildConfig.VERSION_NAME), new c("if-none-match", BuildConfig.VERSION_NAME), new c("if-range", BuildConfig.VERSION_NAME), new c("if-unmodified-since", BuildConfig.VERSION_NAME), new c("last-modified", BuildConfig.VERSION_NAME), new c("link", BuildConfig.VERSION_NAME), new c("location", BuildConfig.VERSION_NAME), new c("max-forwards", BuildConfig.VERSION_NAME), new c("proxy-authenticate", BuildConfig.VERSION_NAME), new c("proxy-authorization", BuildConfig.VERSION_NAME), new c("range", BuildConfig.VERSION_NAME), new c("referer", BuildConfig.VERSION_NAME), new c("refresh", BuildConfig.VERSION_NAME), new c("retry-after", BuildConfig.VERSION_NAME), new c("server", BuildConfig.VERSION_NAME), new c("set-cookie", BuildConfig.VERSION_NAME), new c("strict-transport-security", BuildConfig.VERSION_NAME), new c("transfer-encoding", BuildConfig.VERSION_NAME), new c("user-agent", BuildConfig.VERSION_NAME), new c("vary", BuildConfig.VERSION_NAME), new c("via", BuildConfig.VERSION_NAME), new c("www-authenticate", BuildConfig.VERSION_NAME)};

    /* renamed from: b, reason: collision with root package name */
    static final Map<f.f, Integer> f2110b = b();

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f2111a;

        /* renamed from: b, reason: collision with root package name */
        private final f.e f2112b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2113c;

        /* renamed from: d, reason: collision with root package name */
        private int f2114d;

        /* renamed from: e, reason: collision with root package name */
        c[] f2115e;

        /* renamed from: f, reason: collision with root package name */
        int f2116f;
        int g;
        int h;

        a(int i, int i2, t tVar) {
            this.f2111a = new ArrayList();
            this.f2115e = new c[8];
            this.f2116f = r0.length - 1;
            this.g = 0;
            this.h = 0;
            this.f2113c = i;
            this.f2114d = i2;
            this.f2112b = f.l.b(tVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, t tVar) {
            this(i, i, tVar);
        }

        private void a() {
            int i = this.f2114d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f2115e, (Object) null);
            this.f2116f = this.f2115e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int c(int i) {
            return this.f2116f + 1 + i;
        }

        private int d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f2115e.length;
                while (true) {
                    length--;
                    if (length < this.f2116f || i <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f2115e;
                    i -= cVarArr[length].f2108c;
                    this.h -= cVarArr[length].f2108c;
                    this.g--;
                    i2++;
                }
                c[] cVarArr2 = this.f2115e;
                int i3 = this.f2116f;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i2, this.g);
                this.f2116f += i2;
            }
            return i2;
        }

        private f.f f(int i) {
            c cVar;
            if (!h(i)) {
                int c2 = c(i - d.f2109a.length);
                if (c2 >= 0) {
                    c[] cVarArr = this.f2115e;
                    if (c2 < cVarArr.length) {
                        cVar = cVarArr[c2];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            cVar = d.f2109a[i];
            return cVar.f2106a;
        }

        private void g(int i, c cVar) {
            this.f2111a.add(cVar);
            int i2 = cVar.f2108c;
            if (i != -1) {
                i2 -= this.f2115e[c(i)].f2108c;
            }
            int i3 = this.f2114d;
            if (i2 > i3) {
                b();
                return;
            }
            int d2 = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                c[] cVarArr = this.f2115e;
                if (i4 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f2116f = this.f2115e.length - 1;
                    this.f2115e = cVarArr2;
                }
                int i5 = this.f2116f;
                this.f2116f = i5 - 1;
                this.f2115e[i5] = cVar;
                this.g++;
            } else {
                this.f2115e[i + c(i) + d2] = cVar;
            }
            this.h += i2;
        }

        private boolean h(int i) {
            return i >= 0 && i <= d.f2109a.length - 1;
        }

        private int i() {
            return this.f2112b.readByte() & 255;
        }

        private void l(int i) {
            if (h(i)) {
                this.f2111a.add(d.f2109a[i]);
                return;
            }
            int c2 = c(i - d.f2109a.length);
            if (c2 >= 0) {
                c[] cVarArr = this.f2115e;
                if (c2 < cVarArr.length) {
                    this.f2111a.add(cVarArr[c2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void n(int i) {
            g(-1, new c(f(i), j()));
        }

        private void o() {
            f.f j = j();
            d.a(j);
            g(-1, new c(j, j()));
        }

        private void p(int i) {
            this.f2111a.add(new c(f(i), j()));
        }

        private void q() {
            f.f j = j();
            d.a(j);
            this.f2111a.add(new c(j, j()));
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.f2111a);
            this.f2111a.clear();
            return arrayList;
        }

        f.f j() {
            int i = i();
            boolean z = (i & 128) == 128;
            int m = m(i, 127);
            return z ? f.f.j(k.f().c(this.f2112b.y(m))) : this.f2112b.j(m);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k() {
            while (!this.f2112b.v()) {
                int readByte = this.f2112b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    l(m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o();
                } else if ((readByte & 64) == 64) {
                    n(m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = m(readByte, 31);
                    this.f2114d = m;
                    if (m < 0 || m > this.f2113c) {
                        throw new IOException("Invalid dynamic table size update " + this.f2114d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    q();
                } else {
                    p(m(readByte, 15) - 1);
                }
            }
        }

        int m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f.c f2117a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2118b;

        /* renamed from: c, reason: collision with root package name */
        private int f2119c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2120d;

        /* renamed from: e, reason: collision with root package name */
        int f2121e;

        /* renamed from: f, reason: collision with root package name */
        c[] f2122f;
        int g;
        int h;
        int i;

        b(int i, boolean z, f.c cVar) {
            this.f2119c = Integer.MAX_VALUE;
            this.f2122f = new c[8];
            this.g = r0.length - 1;
            this.h = 0;
            this.i = 0;
            this.f2121e = i;
            this.f2118b = z;
            this.f2117a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(f.c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i = this.f2121e;
            int i2 = this.i;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f2122f, (Object) null);
            this.g = this.f2122f.length - 1;
            this.h = 0;
            this.i = 0;
        }

        private int c(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f2122f.length;
                while (true) {
                    length--;
                    if (length < this.g || i <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f2122f;
                    i -= cVarArr[length].f2108c;
                    this.i -= cVarArr[length].f2108c;
                    this.h--;
                    i2++;
                }
                c[] cVarArr2 = this.f2122f;
                int i3 = this.g;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i2, this.h);
                c[] cVarArr3 = this.f2122f;
                int i4 = this.g;
                Arrays.fill(cVarArr3, i4 + 1, i4 + 1 + i2, (Object) null);
                this.g += i2;
            }
            return i2;
        }

        private void d(c cVar) {
            int i = cVar.f2108c;
            int i2 = this.f2121e;
            if (i > i2) {
                b();
                return;
            }
            c((this.i + i) - i2);
            int i3 = this.h + 1;
            c[] cVarArr = this.f2122f;
            if (i3 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.g = this.f2122f.length - 1;
                this.f2122f = cVarArr2;
            }
            int i4 = this.g;
            this.g = i4 - 1;
            this.f2122f[i4] = cVar;
            this.h++;
            this.i += i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f2121e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f2119c = Math.min(this.f2119c, min);
            }
            this.f2120d = true;
            this.f2121e = min;
            a();
        }

        void f(f.f fVar) {
            int o;
            int i;
            if (!this.f2118b || k.f().e(fVar) >= fVar.o()) {
                o = fVar.o();
                i = 0;
            } else {
                f.c cVar = new f.c();
                k.f().d(fVar, cVar);
                fVar = cVar.I();
                o = fVar.o();
                i = 128;
            }
            h(o, 127, i);
            this.f2117a.R(fVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void g(List<c> list) {
            int i;
            int i2;
            if (this.f2120d) {
                int i3 = this.f2119c;
                if (i3 < this.f2121e) {
                    h(i3, 31, 32);
                }
                this.f2120d = false;
                this.f2119c = Integer.MAX_VALUE;
                h(this.f2121e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                c cVar = list.get(i4);
                f.f r = cVar.f2106a.r();
                f.f fVar = cVar.f2107b;
                Integer num = d.f2110b.get(r);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (Objects.equals(d.f2109a[i - 1].f2107b, fVar)) {
                            i2 = i;
                        } else if (Objects.equals(d.f2109a[i].f2107b, fVar)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.g + 1;
                    int length = this.f2122f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f2122f[i5].f2106a, r)) {
                            if (Objects.equals(this.f2122f[i5].f2107b, fVar)) {
                                i = d.f2109a.length + (i5 - this.g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.g) + d.f2109a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    h(i, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.f2117a.V(64);
                        f(r);
                    } else if (!r.p(c.f2103d) || c.i.equals(r)) {
                        h(i2, 63, 64);
                    } else {
                        h(i2, 15, 0);
                        f(fVar);
                    }
                    f(fVar);
                    d(cVar);
                }
            }
        }

        void h(int i, int i2, int i3) {
            int i4;
            f.c cVar;
            if (i < i2) {
                cVar = this.f2117a;
                i4 = i | i3;
            } else {
                this.f2117a.V(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f2117a.V(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                cVar = this.f2117a;
            }
            cVar.V(i4);
        }
    }

    static f.f a(f.f fVar) {
        int o = fVar.o();
        for (int i = 0; i < o; i++) {
            byte h = fVar.h(i);
            if (h >= 65 && h <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.t());
            }
        }
        return fVar;
    }

    private static Map<f.f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f2109a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f2109a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f2106a)) {
                linkedHashMap.put(f2109a[i].f2106a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
