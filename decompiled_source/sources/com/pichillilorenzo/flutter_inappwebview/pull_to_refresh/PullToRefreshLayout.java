package com.pichillilorenzo.flutter_inappwebview.pull_to_refresh;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import b.j.b.c;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PullToRefreshLayout extends c implements i.c {
    static final String LOG_TAG = "PullToRefreshLayout";
    public i channel;
    public PullToRefreshOptions options;

    public PullToRefreshLayout(Context context) {
        super(context);
        this.channel = null;
        this.options = null;
    }

    public PullToRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.channel = null;
        this.options = null;
    }

    public PullToRefreshLayout(Context context, i iVar, PullToRefreshOptions pullToRefreshOptions) {
        super(context);
        this.channel = iVar;
        this.options = pullToRefreshOptions;
    }

    public void dispose() {
        removeAllViews();
        i iVar = this.channel;
        if (iVar != null) {
            iVar.e(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        Object valueOf;
        String str = hVar.f1873a;
        switch (str.hashCode()) {
            case -1790841290:
                if (str.equals("setSlingshotDistance")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 154556713:
                if (str.equals("setRefreshing")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1235582893:
                if (str.equals("getDefaultSlingshotDistance")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1364071551:
                if (str.equals("setEnabled")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1389555745:
                if (str.equals("setColor")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1743806995:
                if (str.equals("setBackgroundColor")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1807783361:
                if (str.equals("setDistanceToTriggerSync")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1849446385:
                if (str.equals("isRefreshing")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                setEnabled(((Boolean) hVar.a("enabled")).booleanValue());
                break;
            case 1:
                setRefreshing(((Boolean) hVar.a("refreshing")).booleanValue());
                break;
            case 2:
                valueOf = Boolean.valueOf(isRefreshing());
                dVar.success(valueOf);
            case 3:
                setColorSchemeColors(Color.parseColor((String) hVar.a("color")));
                break;
            case 4:
                setProgressBackgroundColorSchemeColor(Color.parseColor((String) hVar.a("color")));
                break;
            case 5:
                setDistanceToTriggerSync(((Integer) hVar.a("distanceToTriggerSync")).intValue());
                break;
            case 6:
                setSlingshotDistance(((Integer) hVar.a("slingshotDistance")).intValue());
                break;
            case 7:
                valueOf = -1;
                dVar.success(valueOf);
            case '\b':
                setSize(((Integer) hVar.a("size")).intValue());
                break;
            default:
                dVar.notImplemented();
                return;
        }
        valueOf = Boolean.TRUE;
        dVar.success(valueOf);
    }

    public void prepare() {
        i iVar = this.channel;
        if (iVar != null) {
            iVar.e(this);
        }
        setEnabled(this.options.enabled.booleanValue());
        setOnChildScrollUpCallback(new c.i() { // from class: com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout.1
            @Override // b.j.b.c.i
            public boolean canChildScrollUp(c cVar, View view) {
                if (!(view instanceof InAppWebView)) {
                    return true;
                }
                InAppWebView inAppWebView = (InAppWebView) view;
                if (!inAppWebView.canScrollVertically() || inAppWebView.getScrollY() <= 0) {
                    return !inAppWebView.canScrollVertically() && inAppWebView.getScrollY() == 0;
                }
                return true;
            }
        });
        setOnRefreshListener(new c.j() { // from class: com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout.2
            @Override // b.j.b.c.j
            public void onRefresh() {
                if (PullToRefreshLayout.this.channel == null) {
                    this.setRefreshing(false);
                } else {
                    PullToRefreshLayout.this.channel.c("onRefresh", new HashMap());
                }
            }
        });
        String str = this.options.color;
        if (str != null) {
            setColorSchemeColors(Color.parseColor(str));
        }
        String str2 = this.options.backgroundColor;
        if (str2 != null) {
            setProgressBackgroundColorSchemeColor(Color.parseColor(str2));
        }
        Integer num = this.options.distanceToTriggerSync;
        if (num != null) {
            setDistanceToTriggerSync(num.intValue());
        }
        Integer num2 = this.options.slingshotDistance;
        if (num2 != null) {
            setSlingshotDistance(num2.intValue());
        }
        Integer num3 = this.options.size;
        if (num3 != null) {
            setSize(num3.intValue());
        }
    }
}
