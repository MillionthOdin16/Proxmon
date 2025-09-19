package c.b.b.a;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f1478a;

        /* renamed from: b, reason: collision with root package name */
        private final C0048a f1479b;

        /* renamed from: c, reason: collision with root package name */
        private C0048a f1480c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1481d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c.b.b.a.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a {

            /* renamed from: a, reason: collision with root package name */
            String f1482a;

            /* renamed from: b, reason: collision with root package name */
            Object f1483b;

            /* renamed from: c, reason: collision with root package name */
            C0048a f1484c;

            private C0048a() {
            }
        }

        private b(String str) {
            C0048a c0048a = new C0048a();
            this.f1479b = c0048a;
            this.f1480c = c0048a;
            this.f1481d = false;
            c.b.b.a.b.b(str);
            this.f1478a = str;
        }

        private C0048a a() {
            C0048a c0048a = new C0048a();
            this.f1480c.f1484c = c0048a;
            this.f1480c = c0048a;
            return c0048a;
        }

        private b b(Object obj) {
            a().f1483b = obj;
            return this;
        }

        public b c(Object obj) {
            b(obj);
            return this;
        }

        public String toString() {
            boolean z = this.f1481d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f1478a);
            sb.append('{');
            String str = BuildConfig.VERSION_NAME;
            for (C0048a c0048a = this.f1479b.f1484c; c0048a != null; c0048a = c0048a.f1484c) {
                Object obj = c0048a.f1483b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = c0048a.f1482a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
