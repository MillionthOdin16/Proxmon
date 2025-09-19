package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.l.g;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener;
import d.a.c.a.i;
import e.b0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppWebView extends InputAwareWebView {
    static final String LOG_TAG = "InAppWebView";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public i channel;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;
    public Handler headlessHandler;
    public b0 httpClient;
    public Object id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    public int initialPositionScrollStoppedTask;
    public boolean isLoading;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    int okHttpClientCacheSize;
    public InAppWebViewOptions options;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public Integer windowId;
    public float zoomScale;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$20, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass20 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType;

        static {
            int[] iArr = new int[PreferredContentModeOptionType.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType = iArr;
            try {
                iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    class DownloadStartListener implements DownloadListener {
        DownloadStartListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            InAppWebView.this.channel.c("onDownloadStart", hashMap);
        }
    }

    public InAppWebView(Context context) {
        super(context);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.okHttpClientCacheSize = 10485760;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.headlessHandler = new Handler(Looper.getMainLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.okHttpClientCacheSize = 10485760;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.headlessHandler = new Handler(Looper.getMainLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.okHttpClientCacheSize = 10485760;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.headlessHandler = new Handler(Looper.getMainLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, i iVar, Object obj, Integer num, InAppWebViewOptions inAppWebViewOptions, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewOptions.useHybridComposition);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.okHttpClientCacheSize = 10485760;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.headlessHandler = new Handler(Looper.getMainLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = inAppWebViewFlutterPlugin;
        this.channel = iVar;
        this.id = obj;
        this.windowId = num;
        this.options = inAppWebViewOptions;
        this.contextMenu = map;
        this.userContentController.addUserOnlyScripts(list);
        inAppWebViewFlutterPlugin.activity.registerForContextMenu(this);
    }

    private void clearCookies() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.7
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                }
            });
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    private void sendOnCreateContextMenuEvent() {
        WebView.HitTestResult hitTestResult = getHitTestResult();
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(hitTestResult.getType()));
        hashMap.put("extra", hitTestResult.getExtra());
        this.channel.c("onCreateContextMenu", hashMap);
    }

    public void addWebMessageListener(WebMessageListener webMessageListener) {
        g.a(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.16
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    if (str == null || str.equalsIgnoreCase("null")) {
                        InAppWebView.this.floatingContextMenu.setVisibility(0);
                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                        InAppWebView inAppWebView = InAppWebView.this;
                        inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                        return;
                    }
                    int i = InAppWebView.this.contextMenuPoint.x;
                    double parseFloat = Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext());
                    double height = InAppWebView.this.floatingContextMenu.getHeight();
                    Double.isNaN(height);
                    Double.isNaN(parseFloat);
                    int i2 = (int) (parseFloat + (height / 3.5d));
                    InAppWebView.this.contextMenuPoint.y = i2;
                    InAppWebView.this.onFloatingActionGlobalLayout(i, i2);
                }
            }
        });
    }

    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String uuid = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(uuid, valueCallback);
        }
        Iterator<String> keys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String join = TextUtils.join(", ", arrayList);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, join).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(", ", arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid), contentWorld), null);
    }

    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    public WebMessageChannel createCompatWebMessageChannel() {
        String uuid = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(uuid, this);
        this.webMessageChannels.put(uuid, webMessageChannel);
        return webMessageChannel;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_webview.InputAwareWebView
    public void dispose() {
        Integer num = this.windowId;
        if (num != null) {
            InAppWebViewChromeClient.windowWebViewMessages.remove(num);
        }
        this.headlessHandler.removeCallbacksAndMessages(null);
        mHandler.removeCallbacksAndMessages(null);
        disposeWebMessageChannels();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        this.inAppWebViewChromeClient = null;
        this.inAppWebViewClient = null;
        this.javaScriptBridgeInterface = null;
        this.inAppWebViewRenderProcessClient = null;
        this.plugin = null;
        super.dispose();
    }

    public void disposeWebMessageChannels() {
        Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageChannels.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z, final PluginScript pluginScript) {
        evaluateJavascript("window." + str, null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.9
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (!((str2 == null || str2.equalsIgnoreCase("null")) ? false : true)) {
                    if (z) {
                        InAppWebView.this.evaluateJavascript(pluginScript.getSource(), null, null);
                        InAppWebView.this.userContentController.addPluginScript(pluginScript);
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript("window." + str + " = " + z + ";", null, null);
                if (z) {
                    return;
                }
                InAppWebView.this.userContentController.removePluginScript(pluginScript);
            }
        });
    }

    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, null, valueCallback);
    }

    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put("title", itemAtIndex.getTitle());
            hashMap.put("url", itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("history", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    public Map<String, Object> getOptions() {
        InAppWebViewOptions inAppWebViewOptions = this.options;
        if (inAppWebViewOptions != null) {
            return inAppWebViewOptions.getRealOptions(this);
        }
        return null;
    }

    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.17
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    public void getSelectedText(final i.d dVar) {
        getSelectedText(new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.18
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                dVar.success(str);
            }
        });
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        onHideContextMenu();
    }

    public void injectCSSCode(String str) {
        injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; d.head.appendChild(style); })(document);", null);
    }

    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = BuildConfig.VERSION_NAME;
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = BuildConfig.VERSION_NAME + " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = BuildConfig.VERSION_NAME;
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                str3 = str3 + " link.media = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                str3 = str3 + " link.crossOrigin = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                str3 = str3 + " link.integrity = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                str3 = str3 + " link.referrerPolicy = '" + str9.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                str3 = str3 + " link.disabled = true; ";
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                str2 = str3 + " link.title = '" + str10.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str2 = str3;
            }
        } else {
            str2 = BuildConfig.VERSION_NAME;
        }
        injectDeferredObject(str, null, "(function(d) { var link = d.createElement('link'); link.rel='" + str4 + "stylesheet'; link.type='text/css'; " + str2 + " link.href = %s; d.head.appendChild(link); })(document);", null);
    }

    public void injectDeferredObject(String str, final ContentWorld contentWorld, String str2, final ValueCallback<String> valueCallback) {
        String str3;
        final String str4;
        final String uuid = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String jSONArray2 = jSONArray.toString();
            str3 = String.format(str2, jSONArray2.substring(1, jSONArray2.length() - 1));
        } else {
            str3 = str;
        }
        if (uuid == null || valueCallback == null) {
            str4 = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(uuid, valueCallback);
            str4 = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid);
        }
        this.headlessHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.10
            @Override // java.lang.Runnable
            public void run() {
                ValueCallback valueCallback2;
                String generateCodeForScriptEvaluation = InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str4, contentWorld);
                if (Build.VERSION.SDK_INT >= 19) {
                    InAppWebView.this.evaluateJavascript(generateCodeForScriptEvaluation, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.10.1
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str5) {
                            ValueCallback valueCallback3;
                            AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                            if (uuid != null || (valueCallback3 = valueCallback) == null) {
                                return;
                            }
                            valueCallback3.onReceiveValue(str5);
                        }
                    });
                    return;
                }
                InAppWebView.this.loadUrl("javascript:" + generateCodeForScriptEvaluation.replaceAll("[\r\n]+", BuildConfig.VERSION_NAME));
                if (contentWorld == null || (valueCallback2 = valueCallback) == null) {
                    return;
                }
                valueCallback2.onReceiveValue(BuildConfig.VERSION_NAME);
            }
        });
    }

    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = BuildConfig.VERSION_NAME;
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                str2 = BuildConfig.VERSION_NAME + " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String replaceAll = str4.replaceAll("'", "\\\\'");
                str2 = ((str2 + " script.id = '" + replaceAll + "'; ") + " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '" + replaceAll + "');  }};") + " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '" + replaceAll + "');  }};";
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                str2 = str2 + " script.async = true; ";
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2 + " script.defer = true; ";
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                str2 = str2 + " script.crossOrigin = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                str2 = str2 + " script.integrity = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2 + " script.noModule = true; ";
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                str2 = str2 + " script.nonce = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                str2 = str2 + " script.referrerPolicy = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
        }
        injectDeferredObject(str, null, "(function(d) { var script = d.createElement('script'); " + str2 + " script.src = %s; d.body.appendChild(script); })(document);", null);
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    @TargetApi(21)
    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.19
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                ValueCallback valueCallback2;
                Boolean bool;
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback2 = valueCallback;
                    bool = Boolean.FALSE;
                } else {
                    valueCallback2 = valueCallback;
                    bool = Boolean.TRUE;
                }
                valueCallback2.onReceiveValue(bool);
            }
        });
    }

    public void loadFile(String str) {
        loadUrl(Util.getUrlAsset(this.plugin, str));
    }

    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method != null && method.equals("POST")) {
            postUrl(url, uRLRequest.getBody());
            return;
        }
        Map<String, String> headers = uRLRequest.getHeaders();
        if (headers != null) {
            loadUrl(url, headers);
        } else {
            loadUrl(url);
        }
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        sendOnCreateContextMenuEvent();
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.options.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.11
                @Override // java.lang.Runnable
                public void run() {
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (inputMethodManager == null || inputMethodManager.isAcceptingText()) {
                        return;
                    }
                    inputMethodManager.hideSoftInputFromWindow(InAppWebView.this.containerView.getWindowToken(), 2);
                }
            }, 128L);
        }
        return onCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i, int i2) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i3 = i - (width2 / 2);
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 + width2 > width) {
            i3 = width - width2;
        }
        float f2 = i2 - (height * 1.5f);
        if (f2 < 0.0f) {
            f2 = i2 + height;
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i3, ((int) f2) + getScrollY()));
        this.headlessHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.15
            @Override // java.lang.Runnable
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                }
            }
        });
    }

    public void onHideContextMenu() {
        this.channel.c("onHideContextMenu", new HashMap());
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        boolean z3 = canScrollHorizontally() && z;
        boolean z4 = canScrollVertically() && z2;
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z4 && i2 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.options.enabled.booleanValue());
            setOverScrollMode(this.options.overScrollMode.intValue());
        }
        if (z3 || z4) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i));
            hashMap.put("y", Integer.valueOf(i2));
            hashMap.put("clampedX", Boolean.valueOf(z3));
            hashMap.put("clampedY", Boolean.valueOf(z4));
            this.channel.c("onOverScrolled", hashMap);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(i));
        hashMap.put("y", Integer.valueOf(i2));
        this.channel.c("onScrollChanged", hashMap);
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu == null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        adjustFloatingContextMenuPosition();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0534 A[LOOP:0: B:141:0x052e->B:143:0x0534, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void prepare() {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.prepare():void");
    }

    public void printCurrentPage() {
        PrintManager printManager = (PrintManager) this.plugin.activity.getSystemService("print");
        if (printManager == null) {
            Log.e(LOG_TAG, "No PrintManager available");
            return;
        }
        String str = getTitle() + " Document";
        printManager.print(str, createPrintDocumentAdapter(str), new PrintAttributes.Builder().build());
    }

    public ActionMode rebuildActionMode(final ActionMode actionMode, final ActionMode.Callback callback) {
        boolean z;
        View view;
        if (!this.options.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z = true;
        } else {
            z = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (this.options.disableContextMenu.booleanValue()) {
            menu.clear();
            return actionMode;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode, (ViewGroup) this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList = new ArrayList();
        ContextMenuOptions contextMenuOptions = new ContextMenuOptions();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList = (List) map.get("menuItems");
            Map<String, Object> map2 = (Map) this.contextMenu.get("options");
            if (map2 != null) {
                contextMenuOptions.parse(map2);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        List<Map> list = arrayList;
        Boolean bool = contextMenuOptions.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (int i = 0; i < menu.size(); i++) {
                final MenuItem item = menu.getItem(i);
                final int itemId = item.getItemId();
                final String charSequence = item.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup) this, false);
                textView.setText(charSequence);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.12
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        InAppWebView.this.hideContextMenu();
                        callback.onActionItemClicked(actionMode, item);
                        HashMap hashMap = new HashMap();
                        hashMap.put("androidId", Integer.valueOf(itemId));
                        hashMap.put("iosId", null);
                        hashMap.put("title", charSequence);
                        InAppWebView.this.channel.c("onContextMenuActionItemClicked", hashMap);
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            final int intValue = ((Integer) map3.get("androidId")).intValue();
            final String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup) this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    InAppWebView.this.hideContextMenu();
                    HashMap hashMap = new HashMap();
                    hashMap.put("androidId", Integer.valueOf(intValue));
                    hashMap.put("iosId", null);
                    hashMap.put("title", str);
                    InAppWebView.this.channel.c("onContextMenuActionItemClicked", hashMap);
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i2 = point != null ? point.x : 0;
        Point point2 = this.lastTouch;
        final int i3 = point2 != null ? point2.y : 0;
        this.contextMenuPoint = new Point(i2, i3);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.14
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
                    if (linearLayout4 != null) {
                        linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(i2, i3);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i2, i3));
            if (z) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        menu.clear();
        return actionMode;
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public Map<String, Object> requestFocusNodeHref() {
        Message obtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put("url", peekData.getString("url"));
        hashMap.put("title", peekData.getString("title"));
        return hashMap;
    }

    public Map<String, Object> requestImageRef() {
        Message obtainMessage = mHandler.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("url", peekData.getString("url"));
        return hashMap;
    }

    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", getScrollX() + num.intValue()), PropertyValuesHolder.ofInt("scrollY", getScrollY() + num2.intValue())).setDuration(300L).start();
        } else {
            scrollBy(num.intValue(), num2.intValue());
        }
    }

    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
        } else {
            scrollTo(num.intValue(), num2.intValue());
        }
    }

    public void setCacheEnabled(boolean z) {
        boolean z2;
        WebSettings settings = getSettings();
        if (z) {
            Context context = getContext();
            if (context == null) {
                return;
            }
            settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            settings.setCacheMode(-1);
            z2 = true;
        } else {
            settings.setCacheMode(2);
            z2 = false;
        }
        settings.setAppCacheEnabled(z2);
    }

    public void setDesktopMode(boolean z) {
        WebSettings settings = getSettings();
        String userAgentString = settings.getUserAgentString();
        settings.setUserAgentString(z ? userAgentString.replace("Mobile", "eliboM").replace("Android", "diordnA") : userAgentString.replace("eliboM", "Mobile").replace("diordnA", "Android"));
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    public void setIncognito(boolean z) {
        WebSettings settings = getSettings();
        if (!z) {
            settings.setCacheMode(-1);
            settings.setAppCacheEnabled(true);
            settings.setSavePassword(true);
            settings.setSaveFormData(true);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        settings.setCacheMode(2);
        settings.setAppCacheEnabled(false);
        clearHistory();
        clearCache(true);
        clearFormData();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
    }

    public void setOptions(InAppWebViewOptions inAppWebViewOptions, HashMap<String, Object> hashMap) {
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        Integer num4;
        WebSettings settings = getSettings();
        if (hashMap.get("javaScriptEnabled") != null) {
            Boolean bool = this.options.javaScriptEnabled;
            Boolean bool2 = inAppWebViewOptions.javaScriptEnabled;
            if (bool != bool2) {
                settings.setJavaScriptEnabled(bool2.booleanValue());
            }
        }
        if (hashMap.get("useShouldInterceptAjaxRequest") != null) {
            Boolean bool3 = this.options.useShouldInterceptAjaxRequest;
            Boolean bool4 = inAppWebViewOptions.useShouldInterceptAjaxRequest;
            if (bool3 != bool4) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool4.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("useShouldInterceptFetchRequest") != null) {
            Boolean bool5 = this.options.useShouldInterceptFetchRequest;
            Boolean bool6 = inAppWebViewOptions.useShouldInterceptFetchRequest;
            if (bool5 != bool6) {
                enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool6.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("useOnLoadResource") != null) {
            Boolean bool7 = this.options.useOnLoadResource;
            Boolean bool8 = inAppWebViewOptions.useOnLoadResource;
            if (bool7 != bool8) {
                enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool8.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("javaScriptCanOpenWindowsAutomatically") != null) {
            Boolean bool9 = this.options.javaScriptCanOpenWindowsAutomatically;
            Boolean bool10 = inAppWebViewOptions.javaScriptCanOpenWindowsAutomatically;
            if (bool9 != bool10) {
                settings.setJavaScriptCanOpenWindowsAutomatically(bool10.booleanValue());
            }
        }
        if (hashMap.get("builtInZoomControls") != null) {
            Boolean bool11 = this.options.builtInZoomControls;
            Boolean bool12 = inAppWebViewOptions.builtInZoomControls;
            if (bool11 != bool12) {
                settings.setBuiltInZoomControls(bool12.booleanValue());
            }
        }
        if (hashMap.get("displayZoomControls") != null) {
            Boolean bool13 = this.options.displayZoomControls;
            Boolean bool14 = inAppWebViewOptions.displayZoomControls;
            if (bool13 != bool14) {
                settings.setDisplayZoomControls(bool14.booleanValue());
            }
        }
        if (hashMap.get("safeBrowsingEnabled") != null) {
            Boolean bool15 = this.options.safeBrowsingEnabled;
            Boolean bool16 = inAppWebViewOptions.safeBrowsingEnabled;
            if (bool15 != bool16 && Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(bool16.booleanValue());
            }
        }
        if (hashMap.get("mediaPlaybackRequiresUserGesture") != null) {
            Boolean bool17 = this.options.mediaPlaybackRequiresUserGesture;
            Boolean bool18 = inAppWebViewOptions.mediaPlaybackRequiresUserGesture;
            if (bool17 != bool18) {
                settings.setMediaPlaybackRequiresUserGesture(bool18.booleanValue());
            }
        }
        if (hashMap.get("databaseEnabled") != null) {
            Boolean bool19 = this.options.databaseEnabled;
            Boolean bool20 = inAppWebViewOptions.databaseEnabled;
            if (bool19 != bool20) {
                settings.setDatabaseEnabled(bool20.booleanValue());
            }
        }
        if (hashMap.get("domStorageEnabled") != null) {
            Boolean bool21 = this.options.domStorageEnabled;
            Boolean bool22 = inAppWebViewOptions.domStorageEnabled;
            if (bool21 != bool22) {
                settings.setDomStorageEnabled(bool22.booleanValue());
            }
        }
        if (hashMap.get("userAgent") != null && !this.options.userAgent.equals(inAppWebViewOptions.userAgent) && !inAppWebViewOptions.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewOptions.userAgent);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.options.applicationNameForUserAgent.equals(inAppWebViewOptions.applicationNameForUserAgent) && !inAppWebViewOptions.applicationNameForUserAgent.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String str3 = inAppWebViewOptions.userAgent;
            settings.setUserAgentString(((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewOptions.userAgent) + " " + this.options.applicationNameForUserAgent);
        }
        if (hashMap.get("clearCache") != null && inAppWebViewOptions.clearCache.booleanValue()) {
            clearAllCache();
        } else if (hashMap.get("clearSessionCache") != null && inAppWebViewOptions.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (hashMap.get("thirdPartyCookiesEnabled") != null && this.options.thirdPartyCookiesEnabled != inAppWebViewOptions.thirdPartyCookiesEnabled && Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewOptions.thirdPartyCookiesEnabled.booleanValue());
        }
        if (hashMap.get("useWideViewPort") != null) {
            Boolean bool23 = this.options.useWideViewPort;
            Boolean bool24 = inAppWebViewOptions.useWideViewPort;
            if (bool23 != bool24) {
                settings.setUseWideViewPort(bool24.booleanValue());
            }
        }
        if (hashMap.get("supportZoom") != null) {
            Boolean bool25 = this.options.supportZoom;
            Boolean bool26 = inAppWebViewOptions.supportZoom;
            if (bool25 != bool26) {
                settings.setSupportZoom(bool26.booleanValue());
            }
        }
        if (hashMap.get("textZoom") != null && !this.options.textZoom.equals(inAppWebViewOptions.textZoom)) {
            settings.setTextZoom(inAppWebViewOptions.textZoom.intValue());
        }
        if (hashMap.get("verticalScrollBarEnabled") != null) {
            Boolean bool27 = this.options.verticalScrollBarEnabled;
            Boolean bool28 = inAppWebViewOptions.verticalScrollBarEnabled;
            if (bool27 != bool28) {
                setVerticalScrollBarEnabled(bool28.booleanValue());
            }
        }
        if (hashMap.get("horizontalScrollBarEnabled") != null) {
            Boolean bool29 = this.options.horizontalScrollBarEnabled;
            Boolean bool30 = inAppWebViewOptions.horizontalScrollBarEnabled;
            if (bool29 != bool30) {
                setHorizontalScrollBarEnabled(bool30.booleanValue());
            }
        }
        boolean z = false;
        if (hashMap.get("transparentBackground") != null) {
            Boolean bool31 = this.options.transparentBackground;
            Boolean bool32 = inAppWebViewOptions.transparentBackground;
            if (bool31 != bool32) {
                if (bool32.booleanValue()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 21 && hashMap.get("mixedContentMode") != null && ((num4 = this.options.mixedContentMode) == null || !num4.equals(inAppWebViewOptions.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewOptions.mixedContentMode.intValue());
        }
        if (hashMap.get("supportMultipleWindows") != null) {
            Boolean bool33 = this.options.supportMultipleWindows;
            Boolean bool34 = inAppWebViewOptions.supportMultipleWindows;
            if (bool33 != bool34) {
                settings.setSupportMultipleWindows(bool34.booleanValue());
            }
        }
        if (hashMap.get("useOnDownloadStart") != null) {
            Boolean bool35 = this.options.useOnDownloadStart;
            Boolean bool36 = inAppWebViewOptions.useOnDownloadStart;
            if (bool35 != bool36) {
                if (bool36.booleanValue()) {
                    setDownloadListener(new DownloadStartListener());
                } else {
                    setDownloadListener(null);
                }
            }
        }
        if (hashMap.get("allowContentAccess") != null) {
            Boolean bool37 = this.options.allowContentAccess;
            Boolean bool38 = inAppWebViewOptions.allowContentAccess;
            if (bool37 != bool38) {
                settings.setAllowContentAccess(bool38.booleanValue());
            }
        }
        if (hashMap.get("allowFileAccess") != null) {
            Boolean bool39 = this.options.allowFileAccess;
            Boolean bool40 = inAppWebViewOptions.allowFileAccess;
            if (bool39 != bool40) {
                settings.setAllowFileAccess(bool40.booleanValue());
            }
        }
        if (hashMap.get("allowFileAccessFromFileURLs") != null) {
            Boolean bool41 = this.options.allowFileAccessFromFileURLs;
            Boolean bool42 = inAppWebViewOptions.allowFileAccessFromFileURLs;
            if (bool41 != bool42) {
                settings.setAllowFileAccessFromFileURLs(bool42.booleanValue());
            }
        }
        if (hashMap.get("allowUniversalAccessFromFileURLs") != null) {
            Boolean bool43 = this.options.allowUniversalAccessFromFileURLs;
            Boolean bool44 = inAppWebViewOptions.allowUniversalAccessFromFileURLs;
            if (bool43 != bool44) {
                settings.setAllowUniversalAccessFromFileURLs(bool44.booleanValue());
            }
        }
        if (hashMap.get("cacheEnabled") != null) {
            Boolean bool45 = this.options.cacheEnabled;
            Boolean bool46 = inAppWebViewOptions.cacheEnabled;
            if (bool45 != bool46) {
                setCacheEnabled(bool46.booleanValue());
            }
        }
        if (hashMap.get("appCachePath") != null && ((str2 = this.options.appCachePath) == null || !str2.equals(inAppWebViewOptions.appCachePath))) {
            settings.setAppCachePath(inAppWebViewOptions.appCachePath);
        }
        if (hashMap.get("blockNetworkImage") != null) {
            Boolean bool47 = this.options.blockNetworkImage;
            Boolean bool48 = inAppWebViewOptions.blockNetworkImage;
            if (bool47 != bool48) {
                settings.setBlockNetworkImage(bool48.booleanValue());
            }
        }
        if (hashMap.get("blockNetworkLoads") != null) {
            Boolean bool49 = this.options.blockNetworkLoads;
            Boolean bool50 = inAppWebViewOptions.blockNetworkLoads;
            if (bool49 != bool50) {
                settings.setBlockNetworkLoads(bool50.booleanValue());
            }
        }
        if (hashMap.get("cacheMode") != null && !this.options.cacheMode.equals(inAppWebViewOptions.cacheMode)) {
            settings.setCacheMode(inAppWebViewOptions.cacheMode.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.options.cursiveFontFamily.equals(inAppWebViewOptions.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewOptions.cursiveFontFamily);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.options.defaultFixedFontSize.equals(inAppWebViewOptions.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewOptions.defaultFixedFontSize.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.options.defaultFontSize.equals(inAppWebViewOptions.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewOptions.defaultFontSize.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.options.defaultTextEncodingName.equals(inAppWebViewOptions.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewOptions.defaultTextEncodingName);
        }
        if (Build.VERSION.SDK_INT >= 24 && hashMap.get("disabledActionModeMenuItems") != null && ((num3 = this.options.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewOptions.disabledActionModeMenuItems))) {
            settings.setDisabledActionModeMenuItems(inAppWebViewOptions.disabledActionModeMenuItems.intValue());
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.options.fantasyFontFamily.equals(inAppWebViewOptions.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewOptions.fantasyFontFamily);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.options.fixedFontFamily.equals(inAppWebViewOptions.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewOptions.fixedFontFamily);
        }
        if (hashMap.get("forceDark") != null && !this.options.forceDark.equals(inAppWebViewOptions.forceDark) && Build.VERSION.SDK_INT >= 29) {
            settings.setForceDark(inAppWebViewOptions.forceDark.intValue());
        }
        if (hashMap.get("geolocationEnabled") != null) {
            Boolean bool51 = this.options.geolocationEnabled;
            Boolean bool52 = inAppWebViewOptions.geolocationEnabled;
            if (bool51 != bool52) {
                settings.setGeolocationEnabled(bool52.booleanValue());
            }
        }
        if (hashMap.get("layoutAlgorithm") != null) {
            WebSettings.LayoutAlgorithm layoutAlgorithm = this.options.layoutAlgorithm;
            WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewOptions.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                if (Build.VERSION.SDK_INT >= 19) {
                    layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
                }
                settings.setLayoutAlgorithm(inAppWebViewOptions.layoutAlgorithm);
            }
        }
        if (hashMap.get("loadWithOverviewMode") != null) {
            Boolean bool53 = this.options.loadWithOverviewMode;
            Boolean bool54 = inAppWebViewOptions.loadWithOverviewMode;
            if (bool53 != bool54) {
                settings.setLoadWithOverviewMode(bool54.booleanValue());
            }
        }
        if (hashMap.get("loadsImagesAutomatically") != null) {
            Boolean bool55 = this.options.loadsImagesAutomatically;
            Boolean bool56 = inAppWebViewOptions.loadsImagesAutomatically;
            if (bool55 != bool56) {
                settings.setLoadsImagesAutomatically(bool56.booleanValue());
            }
        }
        if (hashMap.get("minimumFontSize") != null && !this.options.minimumFontSize.equals(inAppWebViewOptions.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewOptions.minimumFontSize.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.options.minimumLogicalFontSize.equals(inAppWebViewOptions.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewOptions.minimumLogicalFontSize.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.options.initialScale.equals(inAppWebViewOptions.initialScale)) {
            setInitialScale(inAppWebViewOptions.initialScale.intValue());
        }
        if (hashMap.get("needInitialFocus") != null) {
            Boolean bool57 = this.options.needInitialFocus;
            Boolean bool58 = inAppWebViewOptions.needInitialFocus;
            if (bool57 != bool58) {
                settings.setNeedInitialFocus(bool58.booleanValue());
            }
        }
        if (hashMap.get("offscreenPreRaster") != null) {
            Boolean bool59 = this.options.offscreenPreRaster;
            Boolean bool60 = inAppWebViewOptions.offscreenPreRaster;
            if (bool59 != bool60 && Build.VERSION.SDK_INT >= 23) {
                settings.setOffscreenPreRaster(bool60.booleanValue());
            }
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.options.sansSerifFontFamily.equals(inAppWebViewOptions.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewOptions.sansSerifFontFamily);
        }
        if (hashMap.get("serifFontFamily") != null && !this.options.serifFontFamily.equals(inAppWebViewOptions.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewOptions.serifFontFamily);
        }
        if (hashMap.get("standardFontFamily") != null && !this.options.standardFontFamily.equals(inAppWebViewOptions.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewOptions.standardFontFamily);
        }
        if (hashMap.get("preferredContentMode") != null && !this.options.preferredContentMode.equals(inAppWebViewOptions.preferredContentMode)) {
            int i = AnonymousClass20.$SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(inAppWebViewOptions.preferredContentMode.intValue()).ordinal()];
            if (i == 1) {
                setDesktopMode(true);
            } else if (i == 2 || i == 3) {
                setDesktopMode(false);
            }
        }
        if (hashMap.get("saveFormData") != null) {
            Boolean bool61 = this.options.saveFormData;
            Boolean bool62 = inAppWebViewOptions.saveFormData;
            if (bool61 != bool62) {
                settings.setSaveFormData(bool62.booleanValue());
            }
        }
        if (hashMap.get("incognito") != null) {
            Boolean bool63 = this.options.incognito;
            Boolean bool64 = inAppWebViewOptions.incognito;
            if (bool63 != bool64) {
                setIncognito(bool64.booleanValue());
            }
        }
        if (hashMap.get("hardwareAcceleration") != null) {
            Boolean bool65 = this.options.hardwareAcceleration;
            Boolean bool66 = inAppWebViewOptions.hardwareAcceleration;
            if (bool65 != bool66) {
                if (bool66.booleanValue()) {
                    setLayerType(2, null);
                } else {
                    setLayerType(1, null);
                }
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && ((str = this.options.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewOptions.regexToCancelSubFramesLoading))) {
            if (inAppWebViewOptions.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.options.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewOptions.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map<String, Map<String, Object>> map : inAppWebViewOptions.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map.get("trigger")), ContentBlockerAction.fromMap(map.get("action"))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.options.scrollBarStyle.equals(inAppWebViewOptions.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewOptions.scrollBarStyle.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.options.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewOptions.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewOptions.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.options.scrollbarFadingEnabled.equals(inAppWebViewOptions.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewOptions.scrollbarFadingEnabled.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && ((num = this.options.scrollBarFadeDuration) == null || !num.equals(inAppWebViewOptions.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewOptions.scrollBarFadeDuration.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.options.verticalScrollbarPosition.equals(inAppWebViewOptions.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewOptions.verticalScrollbarPosition.intValue());
        }
        if (hashMap.get("disableVerticalScroll") != null) {
            Boolean bool67 = this.options.disableVerticalScroll;
            Boolean bool68 = inAppWebViewOptions.disableVerticalScroll;
            if (bool67 != bool68) {
                setVerticalScrollBarEnabled(!bool68.booleanValue() && inAppWebViewOptions.verticalScrollBarEnabled.booleanValue());
            }
        }
        if (hashMap.get("disableHorizontalScroll") != null) {
            Boolean bool69 = this.options.disableHorizontalScroll;
            Boolean bool70 = inAppWebViewOptions.disableHorizontalScroll;
            if (bool69 != bool70) {
                if (!bool70.booleanValue() && inAppWebViewOptions.horizontalScrollBarEnabled.booleanValue()) {
                    z = true;
                }
                setHorizontalScrollBarEnabled(z);
            }
        }
        if (hashMap.get("overScrollMode") != null && !this.options.overScrollMode.equals(inAppWebViewOptions.overScrollMode)) {
            setOverScrollMode(inAppWebViewOptions.overScrollMode.intValue());
        }
        if (hashMap.get("networkAvailable") != null) {
            Boolean bool71 = this.options.networkAvailable;
            Boolean bool72 = inAppWebViewOptions.networkAvailable;
            if (bool71 != bool72) {
                setNetworkAvailable(bool72.booleanValue());
            }
        }
        if (hashMap.get("rendererPriorityPolicy") != null && ((this.options.rendererPriorityPolicy.get("rendererRequestedPriority") != inAppWebViewOptions.rendererPriorityPolicy.get("rendererRequestedPriority") || this.options.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewOptions.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewOptions.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewOptions.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (hashMap.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.options.verticalScrollbarThumbColor, inAppWebViewOptions.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.verticalScrollbarThumbColor)));
            }
            if (hashMap.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.options.verticalScrollbarTrackColor, inAppWebViewOptions.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.verticalScrollbarTrackColor)));
            }
            if (hashMap.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.options.horizontalScrollbarThumbColor, inAppWebViewOptions.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.horizontalScrollbarThumbColor)));
            }
            if (hashMap.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.options.horizontalScrollbarTrackColor, inAppWebViewOptions.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.horizontalScrollbarTrackColor)));
            }
        }
        this.options = inAppWebViewOptions;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        return (this.options.useHybridComposition.booleanValue() && !this.options.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Map<String, Object> map;
        return (this.options.useHybridComposition.booleanValue() && !this.options.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback, i) : rebuildActionMode(super.startActionMode(callback, i), callback);
    }

    public void takeScreenshot(final Map<String, Object> map, final i.d dVar) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.headlessHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    int i = 100;
                    if (map != null) {
                        Map map2 = (Map) map.get("rect");
                        if (map2 != null) {
                            double doubleValue = ((Double) map2.get("x")).doubleValue();
                            double d2 = pixelDensity;
                            Double.isNaN(d2);
                            int floor = (int) Math.floor((doubleValue * d2) + 0.5d);
                            double doubleValue2 = ((Double) map2.get("y")).doubleValue();
                            double d3 = pixelDensity;
                            Double.isNaN(d3);
                            int floor2 = (int) Math.floor((doubleValue2 * d3) + 0.5d);
                            int width = createBitmap.getWidth();
                            double doubleValue3 = ((Double) map2.get("width")).doubleValue();
                            double d4 = pixelDensity;
                            Double.isNaN(d4);
                            int min = Math.min(width, (int) Math.floor((doubleValue3 * d4) + 0.5d));
                            int height = createBitmap.getHeight();
                            double doubleValue4 = ((Double) map2.get("height")).doubleValue();
                            double d5 = pixelDensity;
                            Double.isNaN(d5);
                            createBitmap = Bitmap.createBitmap(createBitmap, floor, floor2, min, Math.min(height, (int) Math.floor((doubleValue4 * d5) + 0.5d)));
                        }
                        Double d6 = (Double) map.get("snapshotWidth");
                        if (d6 != null) {
                            double doubleValue5 = d6.doubleValue();
                            double d7 = pixelDensity;
                            Double.isNaN(d7);
                            int floor3 = (int) Math.floor((doubleValue5 * d7) + 0.5d);
                            createBitmap = Bitmap.createScaledBitmap(createBitmap, floor3, (int) (floor3 / (createBitmap.getWidth() / createBitmap.getHeight())), true);
                        }
                        try {
                            compressFormat = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e2) {
                            e2.printStackTrace();
                        }
                        i = ((Integer) map.get("quality")).intValue();
                    }
                    createBitmap.compress(compressFormat, i, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    createBitmap.recycle();
                    dVar.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e4) {
                    e4.printStackTrace();
                    dVar.success(null);
                }
            }
        });
    }
}
