package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import b.c.b.b;
import b.c.b.d;
import b.c.b.f;
import com.pichillilorenzo.flutter_inappwebview.R;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ChromeCustomTabsActivity extends Activity implements i.c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "CustomTabsActivity";
    public d.a builder;
    public i channel;
    public CustomTabActivityHelper customTabActivityHelper;
    public f customTabsSession;
    public String id;
    public ChromeSafariBrowserManager manager;
    public ChromeCustomTabsOptions options;
    protected final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    protected boolean onChromeSafariBrowserOpened = false;
    protected boolean onChromeSafariBrowserCompletedInitialLoad = false;

    private PendingIntent createPendingIntent(int i) {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        bundle.putString(ActionBroadcastReceiver.CHROME_MANAGER_ID, this.manager.id);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, i, intent, 134217728);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareCustomTabs(List<HashMap<String, Object>> list) {
        if (this.options.addDefaultShareMenuItem.booleanValue()) {
            this.builder.a();
        }
        String str = this.options.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            this.builder.j(Color.parseColor(this.options.toolbarBackgroundColor));
        }
        this.builder.i(this.options.showTitle.booleanValue());
        if (this.options.enableUrlBarHiding.booleanValue()) {
            this.builder.d();
        }
        this.builder.e(this.options.instantAppsEnabled.booleanValue());
        for (HashMap<String, Object> hashMap : list) {
            int intValue = ((Integer) hashMap.get("id")).intValue();
            this.builder.b((String) hashMap.get("label"), createPendingIntent(intValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareCustomTabsIntent(d dVar) {
        String str = this.options.packageName;
        if (str != null) {
            dVar.f1007a.setPackage(str);
        } else {
            dVar.f1007a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.options.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, dVar.f1007a);
        }
    }

    public void close() {
        this.customTabsSession = null;
        finish();
        this.channel.c("onChromeSafariBrowserClosed", new HashMap());
    }

    public void dispose() {
        this.channel.e(null);
        this.manager = null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            close();
            dispose();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        this.id = extras.getString("id");
        ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = chromeSafariBrowserManager;
        i iVar = new i(chromeSafariBrowserManager.plugin.messenger, "com.pichillilorenzo/flutter_chromesafaribrowser_" + this.id);
        this.channel = iVar;
        iVar.e(this);
        final String string = extras.getString("url");
        ChromeCustomTabsOptions chromeCustomTabsOptions = new ChromeCustomTabsOptions();
        this.options = chromeCustomTabsOptions;
        chromeCustomTabsOptions.parse((Map<String, Object>) extras.getSerializable("options"));
        final List list = (List) extras.getSerializable("menuItemList");
        CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
        this.customTabActivityHelper = customTabActivityHelper;
        customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity.1
            @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsConnected() {
                ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                chromeCustomTabsActivity.customTabsSession = chromeCustomTabsActivity.customTabActivityHelper.getSession();
                Uri parse = Uri.parse(string);
                ChromeCustomTabsActivity.this.customTabActivityHelper.mayLaunchUrl(parse, null, null);
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                chromeCustomTabsActivity2.builder = new d.a(chromeCustomTabsActivity2.customTabsSession);
                ChromeCustomTabsActivity.this.prepareCustomTabs(list);
                d c2 = ChromeCustomTabsActivity.this.builder.c();
                ChromeCustomTabsActivity.this.prepareCustomTabsIntent(c2);
                CustomTabActivityHelper.openCustomTab(this, c2, parse, 100);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsDisconnected() {
                this.close();
                ChromeCustomTabsActivity.this.dispose();
            }
        });
        this.customTabActivityHelper.setCustomTabsCallback(new b() { // from class: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity.2
            @Override // b.c.b.b
            public void extraCallback(String str, Bundle bundle2) {
            }

            @Override // b.c.b.b
            public void onMessageChannelReady(Bundle bundle2) {
            }

            @Override // b.c.b.b
            public void onNavigationEvent(int i, Bundle bundle2) {
                if (i == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.onChromeSafariBrowserOpened) {
                        chromeCustomTabsActivity.onChromeSafariBrowserOpened = true;
                        ChromeCustomTabsActivity.this.channel.c("onChromeSafariBrowserOpened", new HashMap());
                    }
                }
                if (i == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                    if (chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad) {
                        return;
                    }
                    chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad = true;
                    ChromeCustomTabsActivity.this.channel.c("onChromeSafariBrowserCompletedInitialLoad", new HashMap());
                }
            }

            @Override // b.c.b.b
            public void onPostMessage(String str, Bundle bundle2) {
            }

            @Override // b.c.b.b
            public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle2) {
            }
        });
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        String str = hVar.f1873a;
        if (((str.hashCode() == 94756344 && str.equals("close")) ? (char) 0 : (char) 65535) != 0) {
            dVar.notImplemented();
            return;
        }
        onStop();
        onDestroy();
        close();
        Activity activity = this.manager.plugin.activity;
        Intent intent = new Intent(activity, activity.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        this.manager.plugin.activity.startActivity(intent);
        dispose();
        dVar.success(Boolean.TRUE);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.customTabActivityHelper.bindCustomTabsService(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
    }
}
