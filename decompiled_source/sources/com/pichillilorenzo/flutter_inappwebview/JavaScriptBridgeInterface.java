package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import d.a.c.a.i;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    private final i channel;
    private InAppWebView inAppWebView;

    public JavaScriptBridgeInterface(InAppWebView inAppWebView) {
        this.inAppWebView = inAppWebView;
        this.channel = inAppWebView.channel;
    }

    @JavascriptInterface
    public void _callHandler(final String str, final String str2, final String str3) {
        if (this.inAppWebView == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("handlerName", str);
        hashMap.put("args", str3);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.JavaScriptBridgeInterface.2
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                    return;
                }
                if (str.equals("onPrint") && Build.VERSION.SDK_INT >= 21) {
                    JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage();
                } else {
                    if (str.equals("callAsyncJavaScript")) {
                        try {
                            JSONObject jSONObject = new JSONArray(str3).getJSONObject(0);
                            String string = jSONObject.getString("resultUuid");
                            ValueCallback<String> valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string);
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(jSONObject.toString());
                                JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string);
                                return;
                            }
                            return;
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    if (str.equals("evaluateJavaScriptWithContentWorld")) {
                        try {
                            JSONObject jSONObject2 = new JSONArray(str3).getJSONObject(0);
                            String string2 = jSONObject2.getString("resultUuid");
                            ValueCallback<String> valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string2);
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(jSONObject2.has("value") ? jSONObject2.get("value").toString() : "null");
                                JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string2);
                                return;
                            }
                            return;
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                            return;
                        }
                    }
                }
                JavaScriptBridgeInterface.this.channel.d("onCallJsHandler", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.JavaScriptBridgeInterface.2.1
                    @Override // d.a.c.a.i.d
                    public void error(String str4, String str5, Object obj) {
                        Log.d(JavaScriptBridgeInterface.LOG_TAG, "ERROR: " + str4 + " " + str5);
                    }

                    @Override // d.a.c.a.i.d
                    public void notImplemented() {
                    }

                    @Override // d.a.c.a.i.d
                    public void success(Object obj) {
                        if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 19) {
                            JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript("if(window.flutter_inappwebview[" + str2 + "] != null) {window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "](" + obj + "); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "];}", null);
                            return;
                        }
                        JavaScriptBridgeInterface.this.inAppWebView.loadUrl("javascript:if(window.flutter_inappwebview[" + str2 + "] != null) {window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "](" + obj + "); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "];}");
                    }
                });
            }
        });
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.JavaScriptBridgeInterface.1
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu == null) {
                    return;
                }
                JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
            }
        });
    }

    public void dispose() {
        this.inAppWebView = null;
    }
}
