package io.flutter.embedding.engine.j;

import d.a.c.a.i;
import d.a.c.a.q;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final d.a.c.a.i f2585a;

    /* renamed from: b, reason: collision with root package name */
    private e f2586b;

    /* renamed from: c, reason: collision with root package name */
    private final i.c f2587c = new a();

    /* loaded from: classes.dex */
    class a implements i.c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.flutter.embedding.engine.j.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0075a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i.d f2589b;

            RunnableC0075a(a aVar, i.d dVar) {
                this.f2589b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2589b.success(null);
            }
        }

        a() {
        }

        private void a(d.a.c.a.h hVar, i.d dVar) {
            try {
                j.this.f2586b.a(((Integer) hVar.b()).intValue());
                dVar.success(null);
            } catch (IllegalStateException e2) {
                dVar.error("error", j.c(e2), null);
            }
        }

        private void b(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            b bVar = new b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), z ? 0.0d : ((Double) map.get("width")).doubleValue(), z ? 0.0d : ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null);
            try {
                if (z) {
                    j.this.f2586b.g(bVar);
                    dVar.success(null);
                } else {
                    dVar.success(Long.valueOf(j.this.f2586b.h(bVar)));
                }
            } catch (IllegalStateException e2) {
                dVar.error("error", j.c(e2), null);
            }
        }

        private void c(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            int intValue = ((Integer) map.get("id")).intValue();
            try {
                if (map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue()) {
                    j.this.f2586b.d(intValue);
                } else {
                    j.this.f2586b.e(intValue);
                }
                dVar.success(null);
            } catch (IllegalStateException e2) {
                dVar.error("error", j.c(e2), null);
            }
        }

        private void d(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                j.this.f2586b.c(new c(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new RunnableC0075a(this, dVar));
            } catch (IllegalStateException e2) {
                dVar.error("error", j.c(e2), null);
            }
        }

        private void e(d.a.c.a.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                j.this.f2586b.f(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.success(null);
            } catch (IllegalStateException e2) {
                dVar.error("error", j.c(e2), null);
            }
        }

        private void f(d.a.c.a.h hVar, i.d dVar) {
            try {
                j.this.f2586b.b(((Boolean) hVar.b()).booleanValue());
                dVar.success(null);
            } catch (IllegalStateException e2) {
                dVar.error("error", j.c(e2), null);
            }
        }

        private void g(d.a.c.a.h hVar, i.d dVar) {
            i.d dVar2;
            List list = (List) hVar.b();
            try {
                j.this.f2586b.i(new d(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2 = dVar;
            }
            try {
                dVar2.success(null);
            } catch (IllegalStateException e3) {
                e = e3;
                dVar2.error("error", j.c(e), null);
            }
        }

        @Override // d.a.c.a.i.c
        public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
            if (j.this.f2586b == null) {
                return;
            }
            d.a.b.e("PlatformViewsChannel", "Received '" + hVar.f1873a + "' message.");
            String str = hVar.f1873a;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -308988850:
                    if (str.equals("synchronizeToNativeViewHierarchy")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    b(hVar, dVar);
                    return;
                case 1:
                    c(hVar, dVar);
                    return;
                case 2:
                    d(hVar, dVar);
                    return;
                case 3:
                    g(hVar, dVar);
                    return;
                case 4:
                    e(hVar, dVar);
                    return;
                case 5:
                    a(hVar, dVar);
                    return;
                case 6:
                    f(hVar, dVar);
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2590a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2591b;

        /* renamed from: c, reason: collision with root package name */
        public final double f2592c;

        /* renamed from: d, reason: collision with root package name */
        public final double f2593d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2594e;

        /* renamed from: f, reason: collision with root package name */
        public final ByteBuffer f2595f;

        public b(int i, String str, double d2, double d3, int i2, ByteBuffer byteBuffer) {
            this.f2590a = i;
            this.f2591b = str;
            this.f2592c = d2;
            this.f2593d = d3;
            this.f2594e = i2;
            this.f2595f = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2596a;

        /* renamed from: b, reason: collision with root package name */
        public final double f2597b;

        /* renamed from: c, reason: collision with root package name */
        public final double f2598c;

        public c(int i, double d2, double d3) {
            this.f2596a = i;
            this.f2597b = d2;
            this.f2598c = d3;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f2599a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f2600b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f2601c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2602d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2603e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f2604f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        public d(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f2, float f3, int i6, int i7, int i8, int i9, long j) {
            this.f2599a = i;
            this.f2600b = number;
            this.f2601c = number2;
            this.f2602d = i2;
            this.f2603e = i3;
            this.f2604f = obj;
            this.g = obj2;
            this.h = i4;
            this.i = i5;
            this.j = f2;
            this.k = f3;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = i9;
            this.p = j;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i);

        void b(boolean z);

        void c(c cVar, Runnable runnable);

        void d(int i);

        void e(int i);

        void f(int i, int i2);

        void g(b bVar);

        long h(b bVar);

        void i(d dVar);
    }

    public j(io.flutter.embedding.engine.f.a aVar) {
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/platform_views", q.f1887b);
        this.f2585a = iVar;
        iVar.e(this.f2587c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void d(int i) {
        d.a.c.a.i iVar = this.f2585a;
        if (iVar == null) {
            return;
        }
        iVar.c("viewFocused", Integer.valueOf(i));
    }

    public void e(e eVar) {
        this.f2586b = eVar;
    }
}
