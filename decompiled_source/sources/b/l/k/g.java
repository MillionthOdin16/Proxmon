package b.l.k;

import android.annotation.SuppressLint;
import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class g extends b.l.d {

    /* renamed from: a, reason: collision with root package name */
    private ServiceWorkerWebSettings f1359a;

    /* renamed from: b, reason: collision with root package name */
    private ServiceWorkerWebSettingsBoundaryInterface f1360b;

    public g(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f1359a = serviceWorkerWebSettings;
    }

    public g(InvocationHandler invocationHandler) {
        this.f1360b = (ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private ServiceWorkerWebSettingsBoundaryInterface i() {
        if (this.f1360b == null) {
            this.f1360b = (ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, m.c().b(this.f1359a));
        }
        return this.f1360b;
    }

    private ServiceWorkerWebSettings j() {
        if (this.f1359a == null) {
            this.f1359a = m.c().a(Proxy.getInvocationHandler(this.f1360b));
        }
        return this.f1359a;
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public boolean a() {
        l lVar = l.SERVICE_WORKER_CONTENT_ACCESS;
        if (lVar.f()) {
            return j().getAllowContentAccess();
        }
        if (lVar.g()) {
            return i().getAllowContentAccess();
        }
        throw l.c();
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public boolean b() {
        l lVar = l.SERVICE_WORKER_FILE_ACCESS;
        if (lVar.f()) {
            return j().getAllowFileAccess();
        }
        if (lVar.g()) {
            return i().getAllowFileAccess();
        }
        throw l.c();
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public boolean c() {
        l lVar = l.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (lVar.f()) {
            return j().getBlockNetworkLoads();
        }
        if (lVar.g()) {
            return i().getBlockNetworkLoads();
        }
        throw l.c();
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public int d() {
        l lVar = l.SERVICE_WORKER_CACHE_MODE;
        if (lVar.f()) {
            return j().getCacheMode();
        }
        if (lVar.g()) {
            return i().getCacheMode();
        }
        throw l.c();
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public void e(boolean z) {
        l lVar = l.SERVICE_WORKER_CONTENT_ACCESS;
        if (lVar.f()) {
            j().setAllowContentAccess(z);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().setAllowContentAccess(z);
        }
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public void f(boolean z) {
        l lVar = l.SERVICE_WORKER_FILE_ACCESS;
        if (lVar.f()) {
            j().setAllowFileAccess(z);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().setAllowFileAccess(z);
        }
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public void g(boolean z) {
        l lVar = l.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (lVar.f()) {
            j().setBlockNetworkLoads(z);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().setBlockNetworkLoads(z);
        }
    }

    @Override // b.l.d
    @SuppressLint({"NewApi"})
    public void h(int i) {
        l lVar = l.SERVICE_WORKER_CACHE_MODE;
        if (lVar.f()) {
            j().setCacheMode(i);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().setCacheMode(i);
        }
    }
}
