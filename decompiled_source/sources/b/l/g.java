package b.l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import b.l.k.k;
import b.l.k.l;
import b.l.k.m;
import b.l.k.n;
import b.l.k.o;
import b.l.k.r;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f1349a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f1350b = Uri.parse(BuildConfig.VERSION_NAME);

    /* loaded from: classes.dex */
    public interface a {
        void onPostMessage(WebView webView, e eVar, Uri uri, boolean z, b.l.a aVar);
    }

    public static void a(WebView webView, String str, Set<String> set, a aVar) {
        if (Build.VERSION.SDK_INT < 21) {
            throw new AssertionError("Should be on Lollipop and above.");
        }
        if (!l.WEB_MESSAGE_LISTENER.g()) {
            throw l.c();
        }
        h(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return e().createWebView(webView);
    }

    @SuppressLint({"NewApi"})
    public static f[] c(WebView webView) {
        l lVar = l.CREATE_WEB_MESSAGE_CHANNEL;
        if (lVar.f()) {
            return k.k(webView.createWebMessageChannel());
        }
        if (lVar.g()) {
            return h(webView).b();
        }
        throw l.c();
    }

    public static PackageInfo d(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return null;
        }
        if (i >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            PackageInfo f2 = f();
            return f2 != null ? f2 : g(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static o e() {
        return m.d();
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo f() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo g(Context context) {
        try {
            String str = (String) ((Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 23) ? Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]));
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static n h(WebView webView) {
        return new n(b(webView));
    }

    @SuppressLint({"NewApi"})
    public static Uri i() {
        l lVar = l.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (lVar.f()) {
            return WebView.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (lVar.g()) {
            return e().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw l.c();
    }

    @SuppressLint({"NewApi"})
    public static void j(WebView webView, e eVar, Uri uri) {
        if (f1349a.equals(uri)) {
            uri = f1350b;
        }
        l lVar = l.POST_WEB_MESSAGE;
        if (lVar.f()) {
            webView.postWebMessage(k.f(eVar), uri);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            h(webView).c(eVar, uri);
        }
    }

    @SuppressLint({"NewApi"})
    public static void k(Set<String> set, ValueCallback<Boolean> valueCallback) {
        l lVar = l.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        l lVar2 = l.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (lVar.g()) {
            e().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (lVar2.f()) {
            WebView.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!lVar2.g()) {
                throw l.c();
            }
            e().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @SuppressLint({"NewApi"})
    @Deprecated
    public static void l(List<String> list, ValueCallback<Boolean> valueCallback) {
        k(new HashSet(list), valueCallback);
    }

    @SuppressLint({"NewApi"})
    public static void m(WebView webView, j jVar) {
        l lVar = l.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (lVar.f()) {
            webView.setWebViewRenderProcessClient(jVar != null ? new r(jVar) : null);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            h(webView).d(null, jVar);
        }
    }

    @SuppressLint({"NewApi"})
    public static void n(Context context, ValueCallback<Boolean> valueCallback) {
        l lVar = l.START_SAFE_BROWSING;
        if (lVar.f()) {
            WebView.startSafeBrowsing(context, valueCallback);
        } else {
            if (!lVar.g()) {
                throw l.c();
            }
            e().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }
}
