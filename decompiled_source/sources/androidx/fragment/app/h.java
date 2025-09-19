package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: c, reason: collision with root package name */
    static final f f715c = new f();

    /* renamed from: b, reason: collision with root package name */
    private f f716b = null;

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void a(h hVar, Fragment fragment, Bundle bundle);

        public abstract void b(h hVar, Fragment fragment, Context context);

        public abstract void c(h hVar, Fragment fragment, Bundle bundle);

        public abstract void d(h hVar, Fragment fragment);

        public abstract void e(h hVar, Fragment fragment);

        public abstract void f(h hVar, Fragment fragment);

        public abstract void g(h hVar, Fragment fragment, Context context);

        public abstract void h(h hVar, Fragment fragment, Bundle bundle);

        public abstract void i(h hVar, Fragment fragment);

        public abstract void j(h hVar, Fragment fragment, Bundle bundle);

        public abstract void k(h hVar, Fragment fragment);

        public abstract void l(h hVar, Fragment fragment);

        public abstract void m(h hVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(h hVar, Fragment fragment);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public f b() {
        if (this.f716b == null) {
            this.f716b = f715c;
        }
        return this.f716b;
    }

    public abstract List<Fragment> c();

    public abstract boolean d();

    public void e(f fVar) {
        this.f716b = fVar;
    }
}
