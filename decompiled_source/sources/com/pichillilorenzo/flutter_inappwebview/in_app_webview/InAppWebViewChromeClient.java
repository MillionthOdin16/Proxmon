package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import b.e.d.a;
import b.e.d.b;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import d.a.c.a.i;
import d.a.c.a.k;
import d.a.c.a.m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppWebViewChromeClient extends WebChromeClient implements k, ActivityResultListener {
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    protected static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private static final String fileProviderAuthorityExtension = "flutter_inappwebview.fileprovider";
    private static Uri imageOutputFileUri;
    private static Uri videoOutputFileUri;
    final String DEFAULT_MIME_TYPES = "*/*";
    private final i channel;
    private InAppBrowserDelegate inAppBrowserDelegate;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;
    public static Map<Integer, Message> windowWebViewMessages = new HashMap();
    private static int windowAutoincrementId = 0;
    protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);

    public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, i iVar, InAppBrowserDelegate inAppBrowserDelegate) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channel = iVar;
        this.inAppBrowserDelegate = inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().add(this);
        }
        m mVar = inAppWebViewFlutterPlugin.registrar;
        if (mVar != null) {
            mVar.a(this);
        } else {
            inAppWebViewFlutterPlugin.activityPluginBinding.a(this);
        }
    }

    private Boolean acceptsAny(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return Boolean.TRUE;
        }
        for (String str : strArr) {
            if (str.equals("*/*")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", BuildConfig.VERSION_NAME));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsImages(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", BuildConfig.VERSION_NAME));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean acceptsVideo(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "video").booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(".", BuildConfig.VERSION_NAME));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(String str) {
        String str2;
        String str3;
        boolean equals = str.equals("android.media.action.IMAGE_CAPTURE");
        String str4 = BuildConfig.VERSION_NAME;
        if (equals) {
            str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str4 = Environment.DIRECTORY_MOVIES;
            str2 = "video";
            str3 = ".mp4";
        } else {
            str2 = BuildConfig.VERSION_NAME;
            str3 = str2;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new File(Environment.getExternalStoragePublicDirectory(str4), String.format("%s-%d%s", str2, Long.valueOf(System.currentTimeMillis()), str3));
        }
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        return File.createTempFile(str2, str3, (inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity).getApplicationContext().getExternalFilesDir(null));
    }

    private Uri getCapturedMediaFile() {
        Uri uri = imageOutputFileUri;
        if (uri != null && isFileNotEmpty(uri)) {
            return imageOutputFileUri;
        }
        Uri uri2 = videoOutputFileUri;
        if (uri2 == null || !isFileNotEmpty(uri2)) {
            return null;
        }
        return videoOutputFileUri;
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", BuildConfig.VERSION_NAME));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e2) {
            Log.e(LOG_TAG, "Error occurred while creating the File", e2);
            e2.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        Activity activity = inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity;
        String packageName = activity.getApplicationContext().getPackageName();
        return b.getUriForFile(activity.getApplicationContext(), packageName + "." + fileProviderAuthorityExtension, file);
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        imageOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent != null && intent.getData() != null) {
            if (i != -1 || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
        if (intent == null || intent.getClipData() == null) {
            Uri capturedMediaFile = getCapturedMediaFile();
            if (capturedMediaFile != null) {
                return new Uri[]{capturedMediaFile};
            }
            return null;
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i2 = 0; i2 < itemCount; i2++) {
            uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
        }
        return uriArr;
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        videoOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private boolean isFileNotEmpty(Uri uri) {
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        try {
            AssetFileDescriptor openAssetFileDescriptor = (inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity).getContentResolver().openAssetFileDescriptor(uri, "r");
            long length = openAssetFileDescriptor.getLength();
            openAssetFileDescriptor.close();
            return length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public void createAlertDialog(WebView webView, String str, final JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
            }
        };
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        c.a aVar = new c.a(inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity, R.style.Theme_AppCompat_Dialog_Alert);
        aVar.f(str);
        if (str3 == null || str3.isEmpty()) {
            aVar.k(android.R.string.ok, onClickListener);
        } else {
            aVar.l(str3, onClickListener);
        }
        aVar.i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        });
        aVar.a().show();
    }

    public void createBeforeUnloadDialog(WebView webView, String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.14
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        };
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        c.a aVar = new c.a(inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity, R.style.Theme_AppCompat_Dialog_Alert);
        aVar.f(str);
        if (str3 == null || str3.isEmpty()) {
            aVar.k(android.R.string.ok, onClickListener);
        } else {
            aVar.l(str3, onClickListener);
        }
        if (str4 == null || str4.isEmpty()) {
            aVar.g(android.R.string.cancel, onClickListener2);
        } else {
            aVar.h(str4, onClickListener2);
        }
        aVar.i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.15
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        });
        aVar.a().show();
    }

    public void createConfirmDialog(WebView webView, String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        };
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        c.a aVar = new c.a(inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity, R.style.Theme_AppCompat_Dialog_Alert);
        aVar.f(str);
        if (str3 == null || str3.isEmpty()) {
            aVar.k(android.R.string.ok, onClickListener);
        } else {
            aVar.l(str3, onClickListener);
        }
        if (str4 == null || str4.isEmpty()) {
            aVar.g(android.R.string.cancel, onClickListener2);
        } else {
            aVar.h(str4, onClickListener2);
        }
        aVar.i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.7
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        });
        aVar.a().show();
    }

    public void createPromptDialog(WebView webView, String str, String str2, final JsPromptResult jsPromptResult, String str3, String str4, final String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                JsPromptResult jsPromptResult2 = jsPromptResult;
                String str8 = str5;
                if (str8 != null) {
                    obj = str8;
                }
                jsPromptResult2.confirm(obj);
                dialogInterface.dismiss();
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
            }
        };
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        c.a aVar = new c.a(inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity, R.style.Theme_AppCompat_Dialog_Alert);
        aVar.f(str);
        if (str7 == null || str7.isEmpty()) {
            aVar.k(android.R.string.ok, onClickListener);
        } else {
            aVar.l(str7, onClickListener);
        }
        if (str6 == null || str6.isEmpty()) {
            aVar.g(android.R.string.cancel, onClickListener2);
        } else {
            aVar.h(str6, onClickListener2);
        }
        aVar.i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.11
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
            }
        });
        c a2 = aVar.a();
        a2.g(frameLayout);
        a2.show();
    }

    public void dispose() {
        io.flutter.embedding.engine.i.c.c cVar;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (cVar = inAppWebViewFlutterPlugin.activityPluginBinding) != null) {
            cVar.b(this);
        }
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.plugin = null;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    protected ViewGroup getRootView() {
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        return (ViewGroup) (inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity).findViewById(android.R.id.content);
    }

    protected boolean needsCameraPermission() {
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        Activity activity = inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity;
        try {
            if (Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (a.a(activity, "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // d.a.c.a.k, com.pichillilorenzo.flutter_inappwebview.in_app_browser.ActivityResultListener
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (InAppWebViewFlutterPlugin.filePathCallback == null && InAppWebViewFlutterPlugin.filePathCallbackLegacy == null) {
            return true;
        }
        if (i == 1) {
            Uri[] selectedFiles = i2 == -1 ? getSelectedFiles(intent, i2) : null;
            ValueCallback<Uri[]> valueCallback = InAppWebViewFlutterPlugin.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(selectedFiles);
            }
        } else if (i == 3) {
            InAppWebViewFlutterPlugin.filePathCallbackLegacy.onReceiveValue(i2 == -1 ? intent != null ? intent.getData() : getCapturedMediaFile() : null);
        }
        InAppWebViewFlutterPlugin.filePathCallback = null;
        InAppWebViewFlutterPlugin.filePathCallbackLegacy = null;
        imageOutputFileUri = null;
        videoOutputFileUri = null;
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        this.channel.c("onCloseWindow", new HashMap());
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", consoleMessage.message());
        hashMap.put("messageLevel", Integer.valueOf(consoleMessage.messageLevel().ordinal()));
        this.channel.c("onConsoleMessage", hashMap);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        final int i = windowAutoincrementId + 1;
        windowAutoincrementId = i;
        CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(webView.getHitTestResult().getExtra(), "GET", null, null), true, z2, false, i, z);
        windowWebViewMessages.put(Integer.valueOf(i), message);
        this.channel.d("onCreateWindow", createWindowAction.toMap(), new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.16
            @Override // d.a.c.a.i.d
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = BuildConfig.VERSION_NAME;
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(i))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(i));
                }
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(i))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(i));
                }
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                if ((obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) || !InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(i))) {
                    return;
                }
                InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(i));
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        this.channel.c("onGeolocationPermissionsHidePrompt", new HashMap());
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        this.channel.d("onGeolocationPermissionsShowPrompt", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.17
            @Override // d.a.c.a.i.d
            public void error(String str2, String str3, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(", ");
                if (str3 == null) {
                    str3 = BuildConfig.VERSION_NAME;
                }
                sb.append(str3);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                callback.invoke(str, false, false);
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                callback.invoke(str, false, false);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                Map map = (Map) obj;
                if (map != null) {
                    callback.invoke((String) map.get("origin"), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
                } else {
                    callback.invoke(str, false, false);
                }
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        Activity activity = inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity;
        ViewGroup rootView = getRootView();
        ((FrameLayout) rootView).removeView(this.mCustomView);
        this.mCustomView = null;
        rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
        activity.setRequestedOrientation(this.mOriginalOrientation);
        this.mCustomViewCallback.onCustomViewHidden();
        this.mCustomViewCallback = null;
        activity.getWindow().clearFlags(512);
        this.channel.c("onExitFullscreen", new HashMap());
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(final WebView webView, String str, final String str2, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", null);
        this.channel.d("onJsAlert", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.1
            @Override // d.a.c.a.i.d
            public void error(String str3, String str4, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(", ");
                if (str4 == null) {
                    str4 = BuildConfig.VERSION_NAME;
                }
                sb.append(str4);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsResult.cancel();
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewChromeClient.this.createAlertDialog(webView, str2, jsResult, null, null);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                String str3;
                String str4;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str5 = (String) map.get("message");
                    String str6 = (String) map.get("confirmButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsResult.cancel();
                            return;
                        } else {
                            jsResult.confirm();
                            return;
                        }
                    }
                    str3 = str5;
                    str4 = str6;
                } else {
                    str3 = null;
                    str4 = null;
                }
                InAppWebViewChromeClient.this.createAlertDialog(webView, str2, jsResult, str3, str4);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(final WebView webView, String str, final String str2, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        this.channel.d("onJsBeforeUnload", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.12
            @Override // d.a.c.a.i.d
            public void error(String str3, String str4, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(", ");
                if (str4 == null) {
                    str4 = BuildConfig.VERSION_NAME;
                }
                sb.append(str4);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsResult.cancel();
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewChromeClient.this.createConfirmDialog(webView, str2, jsResult, null, null, null);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                String str3;
                String str4;
                String str5;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str6 = (String) map.get("message");
                    String str7 = (String) map.get("confirmButtonTitle");
                    String str8 = (String) map.get("cancelButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsResult.cancel();
                            return;
                        } else {
                            jsResult.confirm();
                            return;
                        }
                    }
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                } else {
                    str3 = null;
                    str4 = null;
                    str5 = null;
                }
                InAppWebViewChromeClient.this.createBeforeUnloadDialog(webView, str2, jsResult, str3, str4, str5);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(final WebView webView, String str, final String str2, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", null);
        this.channel.d("onJsConfirm", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.4
            @Override // d.a.c.a.i.d
            public void error(String str3, String str4, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(", ");
                if (str4 == null) {
                    str4 = BuildConfig.VERSION_NAME;
                }
                sb.append(str4);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsResult.cancel();
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewChromeClient.this.createConfirmDialog(webView, str2, jsResult, null, null, null);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                String str3;
                String str4;
                String str5;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str6 = (String) map.get("message");
                    String str7 = (String) map.get("confirmButtonTitle");
                    String str8 = (String) map.get("cancelButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsResult.cancel();
                            return;
                        } else {
                            jsResult.confirm();
                            return;
                        }
                    }
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                } else {
                    str3 = null;
                    str4 = null;
                    str5 = null;
                }
                InAppWebViewChromeClient.this.createConfirmDialog(webView, str2, jsResult, str3, str4, str5);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(final WebView webView, String str, final String str2, final String str3, final JsPromptResult jsPromptResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("defaultValue", str3);
        hashMap.put("iosIsMainFrame", null);
        this.channel.d("onJsPrompt", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.8
            @Override // d.a.c.a.i.d
            public void error(String str4, String str5, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(", ");
                if (str5 == null) {
                    str5 = BuildConfig.VERSION_NAME;
                }
                sb.append(str5);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsPromptResult.cancel();
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewChromeClient.this.createPromptDialog(webView, str2, str3, jsPromptResult, null, null, null, null, null);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str9 = (String) map.get("message");
                    String str10 = (String) map.get("defaultValue");
                    String str11 = (String) map.get("confirmButtonTitle");
                    String str12 = (String) map.get("cancelButtonTitle");
                    String str13 = (String) map.get("value");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsPromptResult.cancel();
                            return;
                        } else {
                            jsPromptResult.confirm(str13);
                            return;
                        }
                    }
                    str4 = str9;
                    str5 = str10;
                    str8 = str11;
                    str7 = str12;
                    str6 = str13;
                } else {
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                }
                InAppWebViewChromeClient.this.createPromptDialog(webView, str2, str3, jsPromptResult, str4, str5, str6, str7, str8);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        if (Build.VERSION.SDK_INT >= 23) {
            HashMap hashMap = new HashMap();
            hashMap.put("origin", permissionRequest.getOrigin().toString());
            hashMap.put("resources", Arrays.asList(permissionRequest.getResources()));
            this.channel.d("onPermissionRequest", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.18
                @Override // d.a.c.a.i.d
                public void error(String str, String str2, Object obj) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(", ");
                    if (str2 == null) {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    sb.append(str2);
                    Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                    permissionRequest.deny();
                }

                @Override // d.a.c.a.i.d
                public void notImplemented() {
                    permissionRequest.deny();
                }

                @Override // d.a.c.a.i.d
                public void success(Object obj) {
                    if (obj != null) {
                        Map map = (Map) obj;
                        Integer num = (Integer) map.get("action");
                        List list = (List) map.get("resources");
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String[] strArr = (String[]) list.toArray(new String[list.size()]);
                        if (num != null) {
                            if (num.intValue() != 1) {
                                permissionRequest.deny();
                                return;
                            } else {
                                permissionRequest.grant(strArr);
                                return;
                            }
                        }
                    }
                    permissionRequest.deny();
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InAppWebView inAppWebView = (InAppWebView) webView;
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeProgress(i);
        }
        InAppWebViewClient inAppWebViewClient = inAppWebView.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("progress", Integer.valueOf(i));
        this.channel.c("onProgressChanged", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message != null) {
                Log.e(LOG_TAG, message);
            }
        }
        bitmap.recycle();
        HashMap hashMap = new HashMap();
        hashMap.put("icon", byteArrayOutputStream.toByteArray());
        this.channel.c("onReceivedIcon", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeTitle(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title", str);
        this.channel.c("onTitleChanged", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("precomposed", Boolean.valueOf(z));
        this.channel.c("onReceivedTouchIconUrl", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.mCustomView != null) {
            onHideCustomView();
            return;
        }
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        Activity activity = inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity;
        ViewGroup rootView = getRootView();
        this.mCustomView = view;
        this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
        this.mOriginalOrientation = activity.getRequestedOrientation();
        this.mCustomViewCallback = customViewCallback;
        this.mCustomView.setBackgroundColor(-16777216);
        rootView.setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT : FULLSCREEN_SYSTEM_UI_VISIBILITY);
        activity.getWindow().setFlags(512, 512);
        ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
        this.channel.c("onEnterFullscreen", new HashMap());
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
    }

    protected void openFileChooser(ValueCallback<Uri> valueCallback) {
        startPhotoPickerIntent(valueCallback, BuildConfig.VERSION_NAME);
    }

    protected void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        startPhotoPickerIntent(valueCallback, str);
    }

    protected void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        startPhotoPickerIntent(valueCallback, str);
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        InAppWebViewFlutterPlugin.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), BuildConfig.VERSION_NAME);
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(str).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        Activity activity = inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity;
        if (createChooser.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(createChooser, 3);
        } else {
            Log.d(LOG_TAG, "there is no Activity to handle this Intent");
        }
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) {
        InAppWebViewFlutterPlugin.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue()) {
                arrayList.add(getPhotoIntent());
            }
            if (acceptsVideo(strArr).booleanValue()) {
                arrayList.add(getVideoIntent());
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        Activity activity = inAppBrowserDelegate != null ? inAppBrowserDelegate.getActivity() : this.plugin.activity;
        if (intent2.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent2, 1);
        } else {
            Log.d(LOG_TAG, "there is no Activity to handle this Intent");
        }
        return true;
    }
}
