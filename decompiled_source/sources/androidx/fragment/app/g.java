package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class g<E> extends d {

    /* renamed from: b, reason: collision with root package name */
    private final Activity f710b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f711c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f712d;

    /* renamed from: e, reason: collision with root package name */
    private final int f713e;

    /* renamed from: f, reason: collision with root package name */
    final i f714f;

    g(Activity activity, Context context, Handler handler, int i) {
        this.f714f = new i();
        this.f710b = activity;
        b.e.i.d.c(context, "context == null");
        this.f711c = context;
        b.e.i.d.c(handler, "handler == null");
        this.f712d = handler;
        this.f713e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.d
    public View b(int i) {
        return null;
    }

    @Override // androidx.fragment.app.d
    public boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity d() {
        return this.f710b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context e() {
        return this.f711c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler f() {
        return this.f712d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f711c);
    }

    public int k() {
        return this.f713e;
    }

    public boolean l() {
        return true;
    }

    public boolean m(Fragment fragment) {
        return true;
    }

    public void n() {
    }
}
