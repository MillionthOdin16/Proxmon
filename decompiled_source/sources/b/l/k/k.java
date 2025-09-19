package b.l.k;

import android.annotation.SuppressLint;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import b.l.f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* loaded from: classes.dex */
public class k extends b.l.f {

    /* renamed from: a, reason: collision with root package name */
    private WebMessagePort f1364a;

    /* renamed from: b, reason: collision with root package name */
    private WebMessagePortBoundaryInterface f1365b;

    /* loaded from: classes.dex */
    class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f.a f1366a;

        a(k kVar, f.a aVar) {
            this.f1366a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f1366a.onMessage(new k(webMessagePort), k.h(webMessage));
        }
    }

    public k(WebMessagePort webMessagePort) {
        this.f1364a = webMessagePort;
    }

    public k(InvocationHandler invocationHandler) {
        this.f1365b = (WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static WebMessage f(b.l.e eVar) {
        return new WebMessage(eVar.a(), g(eVar.b()));
    }

    public static WebMessagePort[] g(b.l.f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        int length = fVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = fVarArr[i].b();
        }
        return webMessagePortArr;
    }

    public static b.l.e h(WebMessage webMessage) {
        return new b.l.e(webMessage.getData(), k(webMessage.getPorts()));
    }

    private WebMessagePortBoundaryInterface i() {
        if (this.f1365b == null) {
            this.f1365b = (WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebMessagePortBoundaryInterface.class, m.c().d(this.f1364a));
        }
        return this.f1365b;
    }

    private WebMessagePort j() {
        if (this.f1364a == null) {
            this.f1364a = m.c().c(Proxy.getInvocationHandler(this.f1365b));
        }
        return this.f1364a;
    }

    public static b.l.f[] k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        b.l.f[] fVarArr = new b.l.f[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            fVarArr[i] = new k(webMessagePortArr[i]);
        }
        return fVarArr;
    }

    @Override // b.l.f
    @SuppressLint({"NewApi"})
    public void a() {
        l lVar = l.WEB_MESSAGE_PORT_CLOSE;
        if (lVar.f()) {
            j().close();
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().close();
        }
    }

    @Override // b.l.f
    public WebMessagePort b() {
        return j();
    }

    @Override // b.l.f
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(i());
    }

    @Override // b.l.f
    @SuppressLint({"NewApi"})
    public void d(b.l.e eVar) {
        l lVar = l.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (lVar.f()) {
            j().postMessage(f(eVar));
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().postMessage(org.chromium.support_lib_boundary.a.a.c(new h(eVar)));
        }
    }

    @Override // b.l.f
    @SuppressLint({"NewApi"})
    public void e(f.a aVar) {
        l lVar = l.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (lVar.f()) {
            j().setWebMessageCallback(new a(this, aVar));
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            i().setWebMessageCallback(org.chromium.support_lib_boundary.a.a.c(new i(aVar)));
        }
    }
}
