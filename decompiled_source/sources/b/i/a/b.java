package b.i.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import b.d.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends b.i.a.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f1258c = false;

    /* renamed from: a, reason: collision with root package name */
    private final g f1259a;

    /* renamed from: b, reason: collision with root package name */
    private final c f1260b;

    /* loaded from: classes.dex */
    public static class a<D> extends l<D> {
        private final int j;
        private final Bundle k;
        private final b.i.b.a<D> l;
        private g m;
        private C0040b<D> n;
        private b.i.b.a<D> o;

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f1258c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.d();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void f() {
            if (b.f1258c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.e();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(m<? super D> mVar) {
            super.g(mVar);
            this.m = null;
            this.n = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void h(D d2) {
            super.h(d2);
            b.i.b.a<D> aVar = this.o;
            if (aVar == null) {
                return;
            }
            aVar.c();
            throw null;
        }

        b.i.b.a<D> i(boolean z) {
            if (b.f1258c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            this.l.b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        void k() {
            g gVar = this.m;
            C0040b<D> c0040b = this.n;
            if (gVar == null || c0040b == null) {
                return;
            }
            super.g(c0040b);
            d(gVar, c0040b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            b.e.i.a.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.i.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0040b<D> implements m<D> {
    }

    /* loaded from: classes.dex */
    static class c extends p {

        /* renamed from: c, reason: collision with root package name */
        private static final q.a f1261c = new a();

        /* renamed from: b, reason: collision with root package name */
        private h<a> f1262b = new h<>();

        /* loaded from: classes.dex */
        static class a implements q.a {
            a() {
            }

            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c e(r rVar) {
            return (c) new q(rVar, f1261c).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.p
        public void c() {
            super.c();
            if (this.f1262b.k() <= 0) {
                this.f1262b.b();
            } else {
                this.f1262b.l(0).i(true);
                throw null;
            }
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1262b.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f1262b.k() <= 0) {
                    return;
                }
                a l = this.f1262b.l(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1262b.h(0));
                printWriter.print(": ");
                printWriter.println(l.toString());
                l.j(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        void f() {
            int k = this.f1262b.k();
            for (int i = 0; i < k; i++) {
                this.f1262b.l(i).k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar, r rVar) {
        this.f1259a = gVar;
        this.f1260b = c.e(rVar);
    }

    @Override // b.i.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1260b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // b.i.a.a
    public void c() {
        this.f1260b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.e.i.a.a(this.f1259a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
