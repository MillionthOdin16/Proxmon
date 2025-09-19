package e.k0.g;

import e.e0;
import e.g0;
import e.i;
import e.k0.i.e;
import e.x;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f1999a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2000b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f2001a;

        /* renamed from: b, reason: collision with root package name */
        final e0 f2002b;

        /* renamed from: c, reason: collision with root package name */
        final g0 f2003c;

        /* renamed from: d, reason: collision with root package name */
        private Date f2004d;

        /* renamed from: e, reason: collision with root package name */
        private String f2005e;

        /* renamed from: f, reason: collision with root package name */
        private Date f2006f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public a(long j, e0 e0Var, g0 g0Var) {
            this.l = -1;
            this.f2001a = j;
            this.f2002b = e0Var;
            this.f2003c = g0Var;
            if (g0Var != null) {
                this.i = g0Var.K();
                this.j = g0Var.I();
                x F = g0Var.F();
                int h = F.h();
                for (int i = 0; i < h; i++) {
                    String e2 = F.e(i);
                    String i2 = F.i(i);
                    if ("Date".equalsIgnoreCase(e2)) {
                        this.f2004d = e.k0.i.d.b(i2);
                        this.f2005e = i2;
                    } else if ("Expires".equalsIgnoreCase(e2)) {
                        this.h = e.k0.i.d.b(i2);
                    } else if ("Last-Modified".equalsIgnoreCase(e2)) {
                        this.f2006f = e.k0.i.d.b(i2);
                        this.g = i2;
                    } else if ("ETag".equalsIgnoreCase(e2)) {
                        this.k = i2;
                    } else if ("Age".equalsIgnoreCase(e2)) {
                        this.l = e.d(i2, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f2004d;
            long max = date != null ? Math.max(0L, this.j - date.getTime()) : 0L;
            int i = this.l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.j;
            return max + (j - this.i) + (this.f2001a - j);
        }

        private long b() {
            if (this.f2003c.A().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            if (this.h != null) {
                Date date = this.f2004d;
                long time = this.h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f2006f == null || this.f2003c.J().h().x() != null) {
                return 0L;
            }
            Date date2 = this.f2004d;
            long time2 = (date2 != null ? date2.getTime() : this.i) - this.f2006f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private c d() {
            if (this.f2003c == null) {
                return new c(this.f2002b, null);
            }
            if ((!this.f2002b.e() || this.f2003c.C() != null) && c.a(this.f2003c, this.f2002b)) {
                i b2 = this.f2002b.b();
                if (b2.h() || e(this.f2002b)) {
                    return new c(this.f2002b, null);
                }
                i A = this.f2003c.A();
                long a2 = a();
                long b3 = b();
                if (b2.d() != -1) {
                    b3 = Math.min(b3, TimeUnit.SECONDS.toMillis(b2.d()));
                }
                long j = 0;
                long millis = b2.f() != -1 ? TimeUnit.SECONDS.toMillis(b2.f()) : 0L;
                if (!A.g() && b2.e() != -1) {
                    j = TimeUnit.SECONDS.toMillis(b2.e());
                }
                if (!A.h()) {
                    long j2 = millis + a2;
                    if (j2 < j + b3) {
                        g0.a G = this.f2003c.G();
                        if (j2 >= b3) {
                            G.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a2 > 86400000 && f()) {
                            G.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, G.c());
                    }
                }
                String str = this.k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f2006f != null) {
                    str = this.g;
                } else {
                    if (this.f2004d == null) {
                        return new c(this.f2002b, null);
                    }
                    str = this.f2005e;
                }
                x.a f2 = this.f2002b.d().f();
                e.k0.c.f1986a.b(f2, str2, str);
                e0.a g = this.f2002b.g();
                g.d(f2.d());
                return new c(g.a(), this.f2003c);
            }
            return new c(this.f2002b, null);
        }

        private static boolean e(e0 e0Var) {
            return (e0Var.c("If-Modified-Since") == null && e0Var.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.f2003c.A().d() == -1 && this.h == null;
        }

        public c c() {
            c d2 = d();
            return (d2.f1999a == null || !this.f2002b.b().j()) ? d2 : new c(null, null);
        }
    }

    c(e0 e0Var, g0 g0Var) {
        this.f1999a = e0Var;
        this.f2000b = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.A().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(e.g0 r3, e.e0 r4) {
        /*
            int r0 = r3.B()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.D(r0)
            if (r0 != 0) goto L5a
            e.i r0 = r3.A()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            e.i r0 = r3.A()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            e.i r0 = r3.A()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            e.i r3 = r3.A()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            e.i r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k0.g.c.a(e.g0, e.e0):boolean");
    }
}
