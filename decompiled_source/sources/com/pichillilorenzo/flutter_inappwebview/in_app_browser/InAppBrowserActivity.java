package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.appcompat.app.a;
import androidx.appcompat.app.d;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewOptions;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshOptions;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import d.a.c.a.i;
import io.flutter.embedding.engine.i.c.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppBrowserActivity extends d implements InAppBrowserDelegate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String LOG_TAG = "InAppBrowserActivity";
    public a actionBar;
    public i channel;
    public String fromActivity;
    public String id;
    public InAppBrowserManager manager;
    public Menu menu;
    public InAppWebViewMethodHandler methodCallDelegate;
    public InAppBrowserOptions options;
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;
    public boolean isHidden = false;
    private List<ActivityResultListener> activityResultListeners = new ArrayList();

    private void prepareView() {
        ProgressBar progressBar;
        int i;
        this.webView.prepare();
        if (this.options.hidden.booleanValue()) {
            hide();
        } else {
            show();
        }
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        if (this.options.hideProgressBar.booleanValue()) {
            progressBar = this.progressBar;
            i = 0;
        } else {
            progressBar = this.progressBar;
            i = 100;
        }
        progressBar.setMax(i);
        this.actionBar.v(!this.options.hideTitleBar.booleanValue());
        if (this.options.hideToolbarTop.booleanValue()) {
            this.actionBar.l();
        }
        String str = this.options.toolbarTopBackgroundColor;
        if (str != null && !str.isEmpty()) {
            this.actionBar.t(new ColorDrawable(Color.parseColor(this.options.toolbarTopBackgroundColor)));
        }
        String str2 = this.options.toolbarTopFixedTitle;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        this.actionBar.x(this.options.toolbarTopFixedTitle);
    }

    public boolean canGoBack() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public boolean canGoForward() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void close(i.d dVar) {
        this.channel.c("onExit", new HashMap());
        dispose();
        if (dVar != null) {
            dVar.success(Boolean.TRUE);
        }
    }

    public void closeButtonClicked(MenuItem menuItem) {
        close(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didChangeProgress(int i) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.progressBar.setProgress(i, true);
            } else {
                this.progressBar.setProgress(i);
            }
            if (i == 100) {
                this.progressBar.setVisibility(8);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didChangeTitle(String str) {
        if (this.actionBar != null) {
            String str2 = this.options.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                this.actionBar.x(str);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didFailNavigation(String str, int i, String str2) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didFinishNavigation(String str) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didStartNavigation(String str) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didUpdateVisitedHistory(String str) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
    }

    public void dispose() {
        this.channel.e(null);
        this.activityResultListeners.clear();
        InAppWebViewMethodHandler inAppWebViewMethodHandler = this.methodCallDelegate;
        if (inAppWebViewMethodHandler != null) {
            inAppWebViewMethodHandler.dispose();
            this.methodCallDelegate = null;
        }
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            c cVar = this.manager.plugin.activityPluginBinding;
            if (cVar != null) {
                cVar.b(inAppWebView.inAppWebViewChromeClient);
            }
            ViewGroup viewGroup = (ViewGroup) this.webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.webView);
            }
            this.webView.setWebChromeClient(new WebChromeClient());
            this.webView.setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.4
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    InAppBrowserActivity.this.webView.dispose();
                    InAppBrowserActivity.this.webView.destroy();
                    InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                    inAppBrowserActivity.webView = null;
                    inAppBrowserActivity.manager = null;
                }
            });
            this.webView.loadUrl("about:blank");
            finish();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public Activity getActivity() {
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }

    public Map<String, Object> getOptions() {
        Map<String, Object> options = this.webView.getOptions();
        InAppBrowserOptions inAppBrowserOptions = this.options;
        if (inAppBrowserOptions == null || options == null) {
            return null;
        }
        Map<String, Object> realOptions = inAppBrowserOptions.getRealOptions(this);
        realOptions.putAll(options);
        return realOptions;
    }

    public void goBack() {
        if (this.webView == null || !canGoBack()) {
            return;
        }
        this.webView.goBack();
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        goBack();
    }

    public void goForward() {
        if (this.webView == null || !canGoForward()) {
            return;
        }
        this.webView.goForward();
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    public void hide() {
        try {
            this.isHidden = true;
            Intent intent = new Intent(this, Class.forName(this.fromActivity));
            intent.setFlags(131072);
            startActivityIfNeeded(intent, 0);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            Log.d(LOG_TAG, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<ActivityResultListener> it = this.activityResultListeners.iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBrowserCreated() {
        this.channel.c("onBrowserCreated", new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.id = extras.getString("id");
        this.manager = InAppBrowserManager.shared.get(extras.getString("managerId"));
        this.windowId = Integer.valueOf(extras.getInt("windowId"));
        this.channel = new i(this.manager.plugin.messenger, "com.pichillilorenzo/flutter_inappbrowser_" + this.id);
        setContentView(R.layout.activity_web_view);
        Map<String, Object> map = (Map) extras.getSerializable("pullToRefreshInitialOptions");
        i iVar = new i(this.manager.plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_" + this.id);
        PullToRefreshOptions pullToRefreshOptions = new PullToRefreshOptions();
        pullToRefreshOptions.parse(map);
        PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) findViewById(R.id.pullToRefresh);
        this.pullToRefreshLayout = pullToRefreshLayout;
        pullToRefreshLayout.channel = iVar;
        pullToRefreshLayout.options = pullToRefreshOptions;
        pullToRefreshLayout.prepare();
        InAppWebView inAppWebView = (InAppWebView) findViewById(R.id.webView);
        this.webView = inAppWebView;
        inAppWebView.windowId = this.windowId;
        inAppWebView.inAppBrowserDelegate = this;
        inAppWebView.channel = this.channel;
        inAppWebView.plugin = this.manager.plugin;
        InAppWebViewMethodHandler inAppWebViewMethodHandler = new InAppWebViewMethodHandler(inAppWebView);
        this.methodCallDelegate = inAppWebViewMethodHandler;
        this.channel.e(inAppWebViewMethodHandler);
        this.fromActivity = extras.getString("fromActivity");
        Map<String, Object> map2 = (Map) extras.getSerializable("options");
        Map<String, Object> map3 = (Map) extras.getSerializable("contextMenu");
        List list = (List) extras.getSerializable("initialUserScripts");
        InAppBrowserOptions inAppBrowserOptions = new InAppBrowserOptions();
        this.options = inAppBrowserOptions;
        inAppBrowserOptions.parse(map2);
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse(map2);
        InAppWebView inAppWebView2 = this.webView;
        inAppWebView2.options = inAppWebViewOptions;
        inAppWebView2.contextMenu = map3;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UserScript.fromMap((Map) it.next()));
            }
        }
        this.webView.userContentController.addUserOnlyScripts(arrayList);
        this.actionBar = getSupportActionBar();
        prepareView();
        if (this.windowId.intValue() != -1) {
            Message message = InAppWebViewChromeClient.windowWebViewMessages.get(this.windowId);
            if (message != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                message.sendToTarget();
            }
        } else {
            String string = extras.getString("initialFile");
            Map map4 = (Map) extras.getSerializable("initialUrlRequest");
            String string2 = extras.getString("initialData");
            if (string != null) {
                try {
                    this.webView.loadFile(string);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    Log.e(LOG_TAG, string + " asset file cannot be found!", e2);
                    return;
                }
            } else if (string2 != null) {
                this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, extras.getString("initialMimeType"), extras.getString("initialEncoding"), extras.getString("initialHistoryUrl"));
            } else if (map4 != null) {
                this.webView.loadUrl(URLRequest.fromMap(map4));
            }
        }
        onBrowserCreated();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu_main, this.menu);
        SearchView searchView = (SearchView) this.menu.findItem(R.id.menu_search).getActionView();
        this.searchView = searchView;
        searchView.setFocusable(true);
        if (this.options.hideUrlBar.booleanValue()) {
            this.menu.findItem(R.id.menu_search).setVisible(false);
        }
        this.searchView.setQuery(this.webView.getUrl(), false);
        String str = this.options.toolbarTopFixedTitle;
        if (str == null || str.isEmpty()) {
            this.actionBar.x(this.webView.getTitle());
        }
        this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.1
            @Override // android.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str2) {
                return false;
            }

            @Override // android.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str2) {
                if (str2.isEmpty()) {
                    return false;
                }
                InAppBrowserActivity.this.webView.loadUrl(str2);
                InAppBrowserActivity.this.searchView.setQuery(BuildConfig.VERSION_NAME, false);
                InAppBrowserActivity.this.searchView.setIconified(true);
                return true;
            }
        });
        this.searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.2
            @Override // android.widget.SearchView.OnCloseListener
            public boolean onClose() {
                if (InAppBrowserActivity.this.searchView.getQuery().toString().isEmpty()) {
                    InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                    inAppBrowserActivity.searchView.setQuery(inAppBrowserActivity.webView.getUrl(), false);
                }
                return false;
            }
        });
        this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                InAppBrowserActivity.this.searchView.setQuery(BuildConfig.VERSION_NAME, false);
                InAppBrowserActivity.this.searchView.setIconified(true);
            }
        });
        return true;
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        dispose();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.options.shouldCloseOnBackButtonPressed.booleanValue()) {
                close(null);
                return true;
            }
            if (this.options.allowGoBackWithBackButton.booleanValue()) {
                if (canGoBack()) {
                    goBack();
                } else if (this.options.closeOnCannotGoBack.booleanValue()) {
                    close(null);
                }
                return true;
            }
            if (!this.options.shouldCloseOnBackButtonPressed.booleanValue()) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void reload() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        reload();
    }

    public void setOptions(InAppBrowserOptions inAppBrowserOptions, HashMap<String, Object> hashMap) {
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse((Map<String, Object>) hashMap);
        this.webView.setOptions(inAppWebViewOptions, hashMap);
        if (hashMap.get("hidden") != null) {
            Boolean bool = this.options.hidden;
            Boolean bool2 = inAppBrowserOptions.hidden;
            if (bool != bool2) {
                if (bool2.booleanValue()) {
                    hide();
                } else {
                    show();
                }
            }
        }
        if (hashMap.get("hideProgressBar") != null) {
            Boolean bool3 = this.options.hideProgressBar;
            Boolean bool4 = inAppBrowserOptions.hideProgressBar;
            if (bool3 != bool4 && this.progressBar != null) {
                if (bool4.booleanValue()) {
                    this.progressBar.setMax(0);
                } else {
                    this.progressBar.setMax(100);
                }
            }
        }
        if (hashMap.get("hideTitleBar") != null) {
            if (this.options.hideTitleBar != inAppBrowserOptions.hideTitleBar) {
                this.actionBar.v(!r3.booleanValue());
            }
        }
        if (hashMap.get("hideToolbarTop") != null) {
            Boolean bool5 = this.options.hideToolbarTop;
            Boolean bool6 = inAppBrowserOptions.hideToolbarTop;
            if (bool5 != bool6) {
                if (bool6.booleanValue()) {
                    this.actionBar.l();
                } else {
                    this.actionBar.z();
                }
            }
        }
        if (hashMap.get("toolbarTopBackgroundColor") != null && !Util.objEquals(this.options.toolbarTopBackgroundColor, inAppBrowserOptions.toolbarTopBackgroundColor) && !inAppBrowserOptions.toolbarTopBackgroundColor.isEmpty()) {
            this.actionBar.t(new ColorDrawable(Color.parseColor(inAppBrowserOptions.toolbarTopBackgroundColor)));
        }
        if (hashMap.get("toolbarTopFixedTitle") != null && !Util.objEquals(this.options.toolbarTopFixedTitle, inAppBrowserOptions.toolbarTopFixedTitle) && !inAppBrowserOptions.toolbarTopFixedTitle.isEmpty()) {
            this.actionBar.x(inAppBrowserOptions.toolbarTopFixedTitle);
        }
        if (hashMap.get("hideUrlBar") != null) {
            Boolean bool7 = this.options.hideUrlBar;
            Boolean bool8 = inAppBrowserOptions.hideUrlBar;
            if (bool7 != bool8) {
                if (bool8.booleanValue()) {
                    this.menu.findItem(R.id.menu_search).setVisible(false);
                } else {
                    this.menu.findItem(R.id.menu_search).setVisible(true);
                }
            }
        }
        this.options = inAppBrowserOptions;
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.webView.getUrl());
        startActivity(Intent.createChooser(intent, "Share"));
    }

    public void show() {
        this.isHidden = false;
        Intent intent = new Intent(this, (Class<?>) InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }
}
