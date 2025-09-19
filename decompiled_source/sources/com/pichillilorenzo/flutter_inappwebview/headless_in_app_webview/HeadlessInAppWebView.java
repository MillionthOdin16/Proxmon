package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HeadlessInAppWebView implements i.c {
    protected static final String LOG_TAG = "HeadlessInAppWebView";
    public final i channel;
    public FlutterWebView flutterWebView;
    public final String id;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, FlutterWebView flutterWebView) {
        this.id = str;
        this.plugin = inAppWebViewFlutterPlugin;
        this.flutterWebView = flutterWebView;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_headless_inappwebview_" + str);
        this.channel = iVar;
        iVar.e(this);
    }

    public void dispose() {
        this.channel.e(null);
        HeadlessInAppWebViewManager.webViews.remove(this.id);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.plugin.activity.findViewById(R.id.content)).getChildAt(0);
        if (viewGroup != null) {
            viewGroup.removeView(this.flutterWebView.getView());
        }
        this.flutterWebView.dispose();
        this.flutterWebView = null;
        this.plugin = null;
    }

    public Size2D getSize() {
        FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView == null || flutterWebView.webView == null) {
            return null;
        }
        View view = flutterWebView.getView();
        float pixelDensity = Util.getPixelDensity(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return new Size2D(layoutParams.width / pixelDensity, layoutParams.height / pixelDensity);
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        Object obj;
        String str = hVar.f1873a;
        int hashCode = str.hashCode();
        if (hashCode == -75151241) {
            if (str.equals("getSize")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 1671767583) {
            if (hashCode == 1984958339 && str.equals("setSize")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("dispose")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            dispose();
        } else {
            if (c2 != 1) {
                if (c2 != 2) {
                    dVar.notImplemented();
                    return;
                }
                Size2D size = getSize();
                obj = size != null ? size.toMap() : null;
                dVar.success(obj);
            }
            Size2D fromMap = Size2D.fromMap((Map) hVar.a("size"));
            if (fromMap != null) {
                setSize(fromMap);
            }
        }
        obj = Boolean.TRUE;
        dVar.success(obj);
    }

    public void onWebViewCreated() {
        this.channel.c("onWebViewCreated", new HashMap());
    }

    public void prepare(Map<String, Object> map) {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.plugin.activity.findViewById(R.id.content)).getChildAt(0);
        if (viewGroup != null) {
            View view = this.flutterWebView.getView();
            Size2D fromMap = Size2D.fromMap((Map) map.get("initialSize"));
            if (fromMap != null) {
                setSize(fromMap);
            } else {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            viewGroup.addView(view, 0);
            view.setVisibility(4);
        }
    }

    public void setSize(Size2D size2D) {
        FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView == null || flutterWebView.webView == null) {
            return;
        }
        View view = flutterWebView.getView();
        float pixelDensity = Util.getPixelDensity(view.getContext());
        double width = size2D.getWidth();
        double d2 = pixelDensity;
        Double.isNaN(d2);
        int i = (int) (width * d2);
        double height = size2D.getHeight();
        Double.isNaN(d2);
        view.setLayoutParams(new FrameLayout.LayoutParams(i, (int) (height * d2)));
    }
}
