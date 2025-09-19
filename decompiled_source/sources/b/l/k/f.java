package b.l.k;

import android.annotation.SuppressLint;
import android.webkit.ServiceWorkerController;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes.dex */
public class f extends b.l.c {

    /* renamed from: a, reason: collision with root package name */
    private ServiceWorkerController f1356a;

    /* renamed from: b, reason: collision with root package name */
    private ServiceWorkerControllerBoundaryInterface f1357b;

    /* renamed from: c, reason: collision with root package name */
    private final b.l.d f1358c;

    @SuppressLint({"NewApi"})
    public f() {
        g gVar;
        l lVar = l.SERVICE_WORKER_BASIC_USAGE;
        if (lVar.f()) {
            ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
            this.f1356a = serviceWorkerController;
            this.f1357b = null;
            gVar = new g(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            this.f1356a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController2 = m.d().getServiceWorkerController();
            this.f1357b = serviceWorkerController2;
            gVar = new g(serviceWorkerController2.getServiceWorkerWebSettings());
        }
        this.f1358c = gVar;
    }

    private ServiceWorkerControllerBoundaryInterface d() {
        if (this.f1357b == null) {
            this.f1357b = m.d().getServiceWorkerController();
        }
        return this.f1357b;
    }

    private ServiceWorkerController e() {
        if (this.f1356a == null) {
            this.f1356a = ServiceWorkerController.getInstance();
        }
        return this.f1356a;
    }

    @Override // b.l.c
    public b.l.d b() {
        return this.f1358c;
    }

    @Override // b.l.c
    @SuppressLint({"NewApi"})
    public void c(b.l.b bVar) {
        l lVar = l.SERVICE_WORKER_BASIC_USAGE;
        if (lVar.f()) {
            e().setServiceWorkerClient(new b(bVar));
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            d().setServiceWorkerClient(org.chromium.support_lib_boundary.a.a.c(new e(bVar)));
        }
    }
}
