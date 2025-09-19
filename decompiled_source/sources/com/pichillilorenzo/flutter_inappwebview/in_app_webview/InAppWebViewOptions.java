package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.os.Build;
import android.webkit.WebSettings;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.Options;
import com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppWebViewOptions implements Options<InAppWebView> {
    public static final String LOG_TAG = "InAppWebViewOptions";
    public Boolean allowContentAccess;
    public Boolean allowFileAccess;
    public Boolean allowFileAccessFromFileURLs;
    public Boolean allowUniversalAccessFromFileURLs;
    public String appCachePath;
    public String applicationNameForUserAgent;
    public Boolean blockNetworkImage;
    public Boolean blockNetworkLoads;
    public Boolean builtInZoomControls;
    public Boolean cacheEnabled;
    public Integer cacheMode;
    public Boolean clearCache;
    public Boolean clearSessionCache;
    public List<Map<String, Map<String, Object>>> contentBlockers;
    public String cursiveFontFamily;
    public Boolean databaseEnabled;
    public Integer defaultFixedFontSize;
    public Integer defaultFontSize;
    public String defaultTextEncodingName;
    public Boolean disableContextMenu;
    public Boolean disableDefaultErrorPage;
    public Boolean disableHorizontalScroll;
    public Boolean disableVerticalScroll;
    public Integer disabledActionModeMenuItems;
    public Boolean displayZoomControls;
    public Boolean domStorageEnabled;
    public String fantasyFontFamily;
    public String fixedFontFamily;
    public Integer forceDark;
    public Boolean geolocationEnabled;
    public Boolean hardwareAcceleration;
    public Boolean horizontalScrollBarEnabled;
    public String horizontalScrollbarThumbColor;
    public String horizontalScrollbarTrackColor;
    public Boolean incognito;
    public Integer initialScale;
    public Boolean javaScriptCanOpenWindowsAutomatically;
    public Boolean javaScriptEnabled;
    public WebSettings.LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode;
    public Boolean loadsImagesAutomatically;
    public Boolean mediaPlaybackRequiresUserGesture;
    public Integer minimumFontSize;
    public Integer minimumLogicalFontSize;
    public Integer mixedContentMode;
    public Boolean needInitialFocus;
    public Boolean networkAvailable;
    public Boolean offscreenPreRaster;
    public Integer overScrollMode;
    public Integer preferredContentMode;
    public String regexToCancelSubFramesLoading;
    public Map<String, Object> rendererPriorityPolicy;
    public List<String> resourceCustomSchemes;
    public Boolean safeBrowsingEnabled;
    public String sansSerifFontFamily;
    public Boolean saveFormData;
    public Integer scrollBarDefaultDelayBeforeFade;
    public Integer scrollBarFadeDuration;
    public Integer scrollBarStyle;
    public Boolean scrollbarFadingEnabled;
    public String serifFontFamily;
    public String standardFontFamily;
    public Boolean supportMultipleWindows;
    public Boolean supportZoom;
    public Integer textZoom;
    public Boolean thirdPartyCookiesEnabled;
    public Boolean transparentBackground;
    public Boolean useHybridComposition;
    public Boolean useOnDownloadStart;
    public Boolean useOnLoadResource;
    public Boolean useOnRenderProcessGone;
    public Boolean useShouldInterceptAjaxRequest;
    public Boolean useShouldInterceptFetchRequest;
    public Boolean useShouldInterceptRequest;
    public Boolean useShouldOverrideUrlLoading;
    public Boolean useWideViewPort;
    public String userAgent;
    public Boolean verticalScrollBarEnabled;
    public Integer verticalScrollbarPosition;
    public String verticalScrollbarThumbColor;
    public String verticalScrollbarTrackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewOptions$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm;

        static {
            int[] iArr = new int[WebSettings.LayoutAlgorithm.values().length];
            $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm = iArr;
            try {
                iArr[WebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public InAppWebViewOptions() {
        Boolean bool = Boolean.FALSE;
        this.useShouldOverrideUrlLoading = bool;
        this.useOnLoadResource = bool;
        this.useOnDownloadStart = bool;
        this.clearCache = bool;
        this.userAgent = BuildConfig.VERSION_NAME;
        this.applicationNameForUserAgent = BuildConfig.VERSION_NAME;
        this.javaScriptEnabled = Boolean.TRUE;
        this.javaScriptCanOpenWindowsAutomatically = Boolean.FALSE;
        this.mediaPlaybackRequiresUserGesture = Boolean.TRUE;
        this.minimumFontSize = 8;
        Boolean bool2 = Boolean.TRUE;
        this.verticalScrollBarEnabled = bool2;
        this.horizontalScrollBarEnabled = bool2;
        this.resourceCustomSchemes = new ArrayList();
        this.contentBlockers = new ArrayList();
        this.preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
        Boolean bool3 = Boolean.FALSE;
        this.useShouldInterceptAjaxRequest = bool3;
        this.useShouldInterceptFetchRequest = bool3;
        this.incognito = bool3;
        this.cacheEnabled = Boolean.TRUE;
        Boolean bool4 = Boolean.FALSE;
        this.transparentBackground = bool4;
        this.disableVerticalScroll = bool4;
        this.disableHorizontalScroll = bool4;
        this.disableContextMenu = bool4;
        this.supportZoom = Boolean.TRUE;
        Boolean bool5 = Boolean.FALSE;
        this.allowFileAccessFromFileURLs = bool5;
        this.allowUniversalAccessFromFileURLs = bool5;
        this.textZoom = 100;
        this.clearSessionCache = Boolean.FALSE;
        this.builtInZoomControls = Boolean.TRUE;
        Boolean bool6 = Boolean.FALSE;
        this.displayZoomControls = bool6;
        this.databaseEnabled = bool6;
        Boolean bool7 = Boolean.TRUE;
        this.domStorageEnabled = bool7;
        this.useWideViewPort = bool7;
        this.safeBrowsingEnabled = bool7;
        this.allowContentAccess = bool7;
        this.allowFileAccess = bool7;
        Boolean bool8 = Boolean.FALSE;
        this.blockNetworkImage = bool8;
        this.blockNetworkLoads = bool8;
        this.cacheMode = -1;
        this.cursiveFontFamily = "cursive";
        this.defaultFixedFontSize = 16;
        this.defaultFontSize = 16;
        this.defaultTextEncodingName = "UTF-8";
        this.fantasyFontFamily = "fantasy";
        this.fixedFontFamily = "monospace";
        this.forceDark = 0;
        Boolean bool9 = Boolean.TRUE;
        this.geolocationEnabled = bool9;
        this.loadWithOverviewMode = bool9;
        this.loadsImagesAutomatically = bool9;
        this.minimumLogicalFontSize = 8;
        this.initialScale = 0;
        this.needInitialFocus = Boolean.TRUE;
        this.offscreenPreRaster = Boolean.FALSE;
        this.sansSerifFontFamily = "sans-serif";
        this.serifFontFamily = "sans-serif";
        this.standardFontFamily = "sans-serif";
        Boolean bool10 = Boolean.TRUE;
        this.saveFormData = bool10;
        this.thirdPartyCookiesEnabled = bool10;
        this.hardwareAcceleration = bool10;
        this.supportMultipleWindows = Boolean.FALSE;
        this.overScrollMode = 1;
        this.networkAvailable = null;
        this.scrollBarStyle = 0;
        this.verticalScrollbarPosition = 0;
        this.scrollBarDefaultDelayBeforeFade = null;
        this.scrollbarFadingEnabled = Boolean.TRUE;
        this.scrollBarFadeDuration = null;
        this.rendererPriorityPolicy = new HashMap();
        Boolean bool11 = Boolean.FALSE;
        this.useShouldInterceptRequest = bool11;
        this.useOnRenderProcessGone = bool11;
        this.disableDefaultErrorPage = bool11;
        this.useHybridComposition = bool11;
    }

    private String getLayoutAlgorithm() {
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.layoutAlgorithm;
        if (layoutAlgorithm == null) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[layoutAlgorithm.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return "NARROW_COLUMNS";
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return "TEXT_AUTOSIZING";
            }
        }
        return "NORMAL";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setLayoutAlgorithm(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L52
            r0 = -1
            int r1 = r6.hashCode()
            r2 = -1986416409(0xffffffff8999b0e7, float:-3.699977E-33)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2d
            r2 = 1055046617(0x3ee2bbd9, float:0.4428394)
            if (r1 == r2) goto L23
            r2 = 1561826623(0x5d17953f, float:6.8266911E17)
            if (r1 == r2) goto L19
            goto L36
        L19:
            java.lang.String r1 = "TEXT_AUTOSIZING"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L36
            r0 = 2
            goto L36
        L23:
            java.lang.String r1 = "NARROW_COLUMNS"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L36
            r0 = 0
            goto L36
        L2d:
            java.lang.String r1 = "NORMAL"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L36
            r0 = 1
        L36:
            if (r0 == 0) goto L3d
            if (r0 == r4) goto L41
            if (r0 == r3) goto L45
            goto L52
        L3d:
            android.webkit.WebSettings$LayoutAlgorithm r6 = android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS
            r5.layoutAlgorithm = r6
        L41:
            android.webkit.WebSettings$LayoutAlgorithm r6 = android.webkit.WebSettings.LayoutAlgorithm.NORMAL
            r5.layoutAlgorithm = r6
        L45:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r6 < r0) goto L4e
            android.webkit.WebSettings$LayoutAlgorithm r6 = android.webkit.WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING
            goto L50
        L4e:
            android.webkit.WebSettings$LayoutAlgorithm r6 = android.webkit.WebSettings.LayoutAlgorithm.NORMAL
        L50:
            r5.layoutAlgorithm = r6
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewOptions.setLayoutAlgorithm(java.lang.String):void");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(InAppWebView inAppWebView) {
        Map<String, Object> map = toMap();
        if (inAppWebView != null) {
            WebSettings settings = inAppWebView.getSettings();
            map.put("userAgent", settings.getUserAgentString());
            map.put("javaScriptEnabled", Boolean.valueOf(settings.getJavaScriptEnabled()));
            map.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(settings.getJavaScriptCanOpenWindowsAutomatically()));
            map.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(settings.getMediaPlaybackRequiresUserGesture()));
            map.put("minimumFontSize", Integer.valueOf(settings.getMinimumFontSize()));
            map.put("verticalScrollBarEnabled", Boolean.valueOf(inAppWebView.isVerticalScrollBarEnabled()));
            map.put("horizontalScrollBarEnabled", Boolean.valueOf(inAppWebView.isHorizontalScrollBarEnabled()));
            map.put("textZoom", Integer.valueOf(settings.getTextZoom()));
            map.put("builtInZoomControls", Boolean.valueOf(settings.getBuiltInZoomControls()));
            map.put("supportZoom", Boolean.valueOf(settings.supportZoom()));
            map.put("displayZoomControls", Boolean.valueOf(settings.getDisplayZoomControls()));
            map.put("databaseEnabled", Boolean.valueOf(settings.getDatabaseEnabled()));
            map.put("domStorageEnabled", Boolean.valueOf(settings.getDomStorageEnabled()));
            map.put("useWideViewPort", Boolean.valueOf(settings.getUseWideViewPort()));
            if (Build.VERSION.SDK_INT >= 26) {
                map.put("safeBrowsingEnabled", Boolean.valueOf(settings.getSafeBrowsingEnabled()));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                map.put("mixedContentMode", Integer.valueOf(settings.getMixedContentMode()));
            }
            map.put("allowContentAccess", Boolean.valueOf(settings.getAllowContentAccess()));
            map.put("allowFileAccess", Boolean.valueOf(settings.getAllowFileAccess()));
            map.put("allowFileAccessFromFileURLs", Boolean.valueOf(settings.getAllowFileAccessFromFileURLs()));
            map.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(settings.getAllowUniversalAccessFromFileURLs()));
            map.put("blockNetworkImage", Boolean.valueOf(settings.getBlockNetworkImage()));
            map.put("blockNetworkLoads", Boolean.valueOf(settings.getBlockNetworkLoads()));
            map.put("cacheMode", Integer.valueOf(settings.getCacheMode()));
            map.put("cursiveFontFamily", settings.getCursiveFontFamily());
            map.put("defaultFixedFontSize", Integer.valueOf(settings.getDefaultFixedFontSize()));
            map.put("defaultFontSize", Integer.valueOf(settings.getDefaultFontSize()));
            map.put("defaultTextEncodingName", settings.getDefaultTextEncodingName());
            if (Build.VERSION.SDK_INT >= 24) {
                map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
            }
            map.put("fantasyFontFamily", settings.getFantasyFontFamily());
            map.put("fixedFontFamily", settings.getFixedFontFamily());
            if (Build.VERSION.SDK_INT >= 29) {
                map.put("forceDark", Integer.valueOf(settings.getForceDark()));
            }
            map.put("layoutAlgorithm", settings.getLayoutAlgorithm().name());
            map.put("loadWithOverviewMode", Boolean.valueOf(settings.getLoadWithOverviewMode()));
            map.put("loadsImagesAutomatically", Boolean.valueOf(settings.getLoadsImagesAutomatically()));
            map.put("minimumLogicalFontSize", Integer.valueOf(settings.getMinimumLogicalFontSize()));
            if (Build.VERSION.SDK_INT >= 23) {
                map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
            }
            map.put("sansSerifFontFamily", settings.getSansSerifFontFamily());
            map.put("serifFontFamily", settings.getSerifFontFamily());
            map.put("standardFontFamily", settings.getStandardFontFamily());
            map.put("saveFormData", Boolean.valueOf(settings.getSaveFormData()));
            map.put("supportMultipleWindows", Boolean.valueOf(settings.supportMultipleWindows()));
            map.put("overScrollMode", Integer.valueOf(inAppWebView.getOverScrollMode()));
            map.put("scrollBarStyle", Integer.valueOf(inAppWebView.getScrollBarStyle()));
            map.put("verticalScrollbarPosition", Integer.valueOf(inAppWebView.getVerticalScrollbarPosition()));
            map.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(inAppWebView.getScrollBarDefaultDelayBeforeFade()));
            map.put("scrollbarFadingEnabled", Boolean.valueOf(inAppWebView.isScrollbarFadingEnabled()));
            map.put("scrollBarFadeDuration", Integer.valueOf(inAppWebView.getScrollBarFadeDuration()));
            if (Build.VERSION.SDK_INT >= 26) {
                HashMap hashMap = new HashMap();
                hashMap.put("rendererRequestedPriority", Integer.valueOf(inAppWebView.getRendererRequestedPriority()));
                hashMap.put("waivedWhenNotVisible", Boolean.valueOf(inAppWebView.getRendererPriorityWaivedWhenNotVisible()));
                map.put("rendererPriorityPolicy", hashMap);
            }
        }
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public InAppWebViewOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                char c2 = 65535;
                switch (key.hashCode()) {
                    case -2116596967:
                        if (key.equals("disableHorizontalScroll")) {
                            c2 = 21;
                            break;
                        }
                        break;
                    case -2095822429:
                        if (key.equals("scrollBarDefaultDelayBeforeFade")) {
                            c2 = 'E';
                            break;
                        }
                        break;
                    case -2020146208:
                        if (key.equals("useWideViewPort")) {
                            c2 = 30;
                            break;
                        }
                        break;
                    case -2014672109:
                        if (key.equals("allowFileAccessFromFileURLs")) {
                            c2 = '#';
                            break;
                        }
                        break;
                    case -1931277743:
                        if (key.equals("defaultFontSize")) {
                            c2 = '+';
                            break;
                        }
                        break;
                    case -1851090878:
                        if (key.equals("supportZoom")) {
                            c2 = 27;
                            break;
                        }
                        break;
                    case -1845480382:
                        if (key.equals("scrollbarFadingEnabled")) {
                            c2 = 'F';
                            break;
                        }
                        break;
                    case -1834028884:
                        if (key.equals("defaultTextEncodingName")) {
                            c2 = ',';
                            break;
                        }
                        break;
                    case -1746033750:
                        if (key.equals("needInitialFocus")) {
                            c2 = '7';
                            break;
                        }
                        break;
                    case -1712086669:
                        if (key.equals("useShouldOverrideUrlLoading")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1673892229:
                        if (key.equals("preferredContentMode")) {
                            c2 = 14;
                            break;
                        }
                        break;
                    case -1657552268:
                        if (key.equals("allowContentAccess")) {
                            c2 = '!';
                            break;
                        }
                        break;
                    case -1626497241:
                        if (key.equals("fixedFontFamily")) {
                            c2 = '/';
                            break;
                        }
                        break;
                    case -1615103092:
                        if (key.equals("builtInZoomControls")) {
                            c2 = 25;
                            break;
                        }
                        break;
                    case -1607633676:
                        if (key.equals("javaScriptEnabled")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -1578962296:
                        if (key.equals("hardwareAcceleration")) {
                            c2 = '>';
                            break;
                        }
                        break;
                    case -1578507205:
                        if (key.equals("networkAvailable")) {
                            c2 = 'B';
                            break;
                        }
                        break;
                    case -1574470051:
                        if (key.equals("useShouldInterceptFetchRequest")) {
                            c2 = 16;
                            break;
                        }
                        break;
                    case -1480607106:
                        if (key.equals("loadsImagesAutomatically")) {
                            c2 = '4';
                            break;
                        }
                        break;
                    case -1455624881:
                        if (key.equals("resourceCustomSchemes")) {
                            c2 = '\f';
                            break;
                        }
                        break;
                    case -1443655540:
                        if (key.equals("disabledActionModeMenuItems")) {
                            c2 = '-';
                            break;
                        }
                        break;
                    case -1423657812:
                        if (key.equals("incognito")) {
                            c2 = 17;
                            break;
                        }
                        break;
                    case -1321236988:
                        if (key.equals("overScrollMode")) {
                            c2 = 'A';
                            break;
                        }
                        break;
                    case -1146673624:
                        if (key.equals("domStorageEnabled")) {
                            c2 = 29;
                            break;
                        }
                        break;
                    case -1143245914:
                        if (key.equals("disableContextMenu")) {
                            c2 = 22;
                            break;
                        }
                        break;
                    case -1038715033:
                        if (key.equals("useShouldInterceptAjaxRequest")) {
                            c2 = 15;
                            break;
                        }
                        break;
                    case -1003454816:
                        if (key.equals("textZoom")) {
                            c2 = 23;
                            break;
                        }
                        break;
                    case -800676066:
                        if (key.equals("minimumFontSize")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case -767637403:
                        if (key.equals("layoutAlgorithm")) {
                            c2 = '2';
                            break;
                        }
                        break;
                    case -759238347:
                        if (key.equals("clearCache")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -742944736:
                        if (key.equals("transparentBackground")) {
                            c2 = 19;
                            break;
                        }
                        break;
                    case -728016272:
                        if (key.equals("allowUniversalAccessFromFileURLs")) {
                            c2 = '$';
                            break;
                        }
                        break;
                    case -710246074:
                        if (key.equals("databaseEnabled")) {
                            c2 = 28;
                            break;
                        }
                        break;
                    case -706772569:
                        if (key.equals("useShouldInterceptRequest")) {
                            c2 = 'I';
                            break;
                        }
                        break;
                    case -553792443:
                        if (key.equals("cacheMode")) {
                            c2 = '(';
                            break;
                        }
                        break;
                    case -443422049:
                        if (key.equals("horizontalScrollBarEnabled")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case -435719349:
                        if (key.equals("scrollBarStyle")) {
                            c2 = 'C';
                            break;
                        }
                        break;
                    case -421090202:
                        if (key.equals("initialScale")) {
                            c2 = '6';
                            break;
                        }
                        break;
                    case -321425255:
                        if (key.equals("verticalScrollbarPosition")) {
                            c2 = 'D';
                            break;
                        }
                        break;
                    case -229178645:
                        if (key.equals("disableVerticalScroll")) {
                            c2 = 20;
                            break;
                        }
                        break;
                    case -227577491:
                        if (key.equals("javaScriptCanOpenWindowsAutomatically")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -225496870:
                        if (key.equals("horizontalScrollbarTrackColor")) {
                            c2 = 'P';
                            break;
                        }
                        break;
                    case -225165915:
                        if (key.equals("offscreenPreRaster")) {
                            c2 = '8';
                            break;
                        }
                        break;
                    case -216514471:
                        if (key.equals("fantasyFontFamily")) {
                            c2 = '.';
                            break;
                        }
                        break;
                    case -158057575:
                        if (key.equals("rendererPriorityPolicy")) {
                            c2 = 'H';
                            break;
                        }
                        break;
                    case -98561827:
                        if (key.equals("sansSerifFontFamily")) {
                            c2 = '9';
                            break;
                        }
                        break;
                    case 57717170:
                        if (key.equals("regexToCancelSubFramesLoading")) {
                            c2 = '@';
                            break;
                        }
                        break;
                    case 100868168:
                        if (key.equals("verticalScrollbarTrackColor")) {
                            c2 = 'N';
                            break;
                        }
                        break;
                    case 174479508:
                        if (key.equals("useOnDownloadStart")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 257886264:
                        if (key.equals("cursiveFontFamily")) {
                            c2 = ')';
                            break;
                        }
                        break;
                    case 273267153:
                        if (key.equals("mediaPlaybackRequiresUserGesture")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 296040698:
                        if (key.equals("blockNetworkImage")) {
                            c2 = '&';
                            break;
                        }
                        break;
                    case 298870764:
                        if (key.equals("blockNetworkLoads")) {
                            c2 = '\'';
                            break;
                        }
                        break;
                    case 311430650:
                        if (key.equals("userAgent")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 387230482:
                        if (key.equals("useOnRenderProcessGone")) {
                            c2 = 'J';
                            break;
                        }
                        break;
                    case 393481210:
                        if (key.equals("useOnLoadResource")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 397237599:
                        if (key.equals("cacheEnabled")) {
                            c2 = 18;
                            break;
                        }
                        break;
                    case 408799019:
                        if (key.equals("saveFormData")) {
                            c2 = '<';
                            break;
                        }
                        break;
                    case 487904071:
                        if (key.equals("useHybridComposition")) {
                            c2 = 'L';
                            break;
                        }
                        break;
                    case 590869196:
                        if (key.equals("applicationNameForUserAgent")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 760962753:
                        if (key.equals("mixedContentMode")) {
                            c2 = ' ';
                            break;
                        }
                        break;
                    case 849171798:
                        if (key.equals("scrollBarFadeDuration")) {
                            c2 = 'G';
                            break;
                        }
                        break;
                    case 1138246185:
                        if (key.equals("allowFileAccess")) {
                            c2 = '\"';
                            break;
                        }
                        break;
                    case 1156608422:
                        if (key.equals("appCachePath")) {
                            c2 = '%';
                            break;
                        }
                        break;
                    case 1193086767:
                        if (key.equals("horizontalScrollbarThumbColor")) {
                            c2 = 'O';
                            break;
                        }
                        break;
                    case 1301942064:
                        if (key.equals("standardFontFamily")) {
                            c2 = ';';
                            break;
                        }
                        break;
                    case 1320461707:
                        if (key.equals("displayZoomControls")) {
                            c2 = 26;
                            break;
                        }
                        break;
                    case 1344414299:
                        if (key.equals("geolocationEnabled")) {
                            c2 = '1';
                            break;
                        }
                        break;
                    case 1409728424:
                        if (key.equals("loadWithOverviewMode")) {
                            c2 = '3';
                            break;
                        }
                        break;
                    case 1474890029:
                        if (key.equals("safeBrowsingEnabled")) {
                            c2 = 31;
                            break;
                        }
                        break;
                    case 1496887792:
                        if (key.equals("serifFontFamily")) {
                            c2 = ':';
                            break;
                        }
                        break;
                    case 1519451805:
                        if (key.equals("verticalScrollbarThumbColor")) {
                            c2 = 'M';
                            break;
                        }
                        break;
                    case 1527546113:
                        if (key.equals("forceDark")) {
                            c2 = '0';
                            break;
                        }
                        break;
                    case 1583791742:
                        if (key.equals("disableDefaultErrorPage")) {
                            c2 = 'K';
                            break;
                        }
                        break;
                    case 1759079762:
                        if (key.equals("contentBlockers")) {
                            c2 = '\r';
                            break;
                        }
                        break;
                    case 1774215812:
                        if (key.equals("supportMultipleWindows")) {
                            c2 = '?';
                            break;
                        }
                        break;
                    case 1793491907:
                        if (key.equals("defaultFixedFontSize")) {
                            c2 = '*';
                            break;
                        }
                        break;
                    case 1812525393:
                        if (key.equals("thirdPartyCookiesEnabled")) {
                            c2 = '=';
                            break;
                        }
                        break;
                    case 1956631083:
                        if (key.equals("minimumLogicalFontSize")) {
                            c2 = '5';
                            break;
                        }
                        break;
                    case 2011947505:
                        if (key.equals("verticalScrollBarEnabled")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case 2038327673:
                        if (key.equals("clearSessionCache")) {
                            c2 = 24;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        this.useShouldOverrideUrlLoading = (Boolean) value;
                        break;
                    case 1:
                        this.useOnLoadResource = (Boolean) value;
                        break;
                    case 2:
                        this.useOnDownloadStart = (Boolean) value;
                        break;
                    case 3:
                        this.clearCache = (Boolean) value;
                        break;
                    case 4:
                        this.userAgent = (String) value;
                        break;
                    case 5:
                        this.applicationNameForUserAgent = (String) value;
                        break;
                    case 6:
                        this.javaScriptEnabled = (Boolean) value;
                        break;
                    case 7:
                        this.javaScriptCanOpenWindowsAutomatically = (Boolean) value;
                        break;
                    case '\b':
                        this.mediaPlaybackRequiresUserGesture = (Boolean) value;
                        break;
                    case '\t':
                        this.minimumFontSize = (Integer) value;
                        break;
                    case '\n':
                        this.verticalScrollBarEnabled = (Boolean) value;
                        break;
                    case 11:
                        this.horizontalScrollBarEnabled = (Boolean) value;
                        break;
                    case '\f':
                        this.resourceCustomSchemes = (List) value;
                        break;
                    case '\r':
                        this.contentBlockers = (List) value;
                        break;
                    case 14:
                        this.preferredContentMode = (Integer) value;
                        break;
                    case 15:
                        this.useShouldInterceptAjaxRequest = (Boolean) value;
                        break;
                    case 16:
                        this.useShouldInterceptFetchRequest = (Boolean) value;
                        break;
                    case 17:
                        this.incognito = (Boolean) value;
                        break;
                    case 18:
                        this.cacheEnabled = (Boolean) value;
                        break;
                    case 19:
                        this.transparentBackground = (Boolean) value;
                        break;
                    case 20:
                        this.disableVerticalScroll = (Boolean) value;
                        break;
                    case 21:
                        this.disableHorizontalScroll = (Boolean) value;
                        break;
                    case 22:
                        this.disableContextMenu = (Boolean) value;
                        break;
                    case 23:
                        this.textZoom = (Integer) value;
                        break;
                    case 24:
                        this.clearSessionCache = (Boolean) value;
                        break;
                    case 25:
                        this.builtInZoomControls = (Boolean) value;
                        break;
                    case 26:
                        this.displayZoomControls = (Boolean) value;
                        break;
                    case 27:
                        this.supportZoom = (Boolean) value;
                        break;
                    case 28:
                        this.databaseEnabled = (Boolean) value;
                        break;
                    case 29:
                        this.domStorageEnabled = (Boolean) value;
                        break;
                    case 30:
                        this.useWideViewPort = (Boolean) value;
                        break;
                    case 31:
                        this.safeBrowsingEnabled = (Boolean) value;
                        break;
                    case ' ':
                        this.mixedContentMode = (Integer) value;
                        break;
                    case '!':
                        this.allowContentAccess = (Boolean) value;
                        break;
                    case '\"':
                        this.allowFileAccess = (Boolean) value;
                        break;
                    case '#':
                        this.allowFileAccessFromFileURLs = (Boolean) value;
                        break;
                    case '$':
                        this.allowUniversalAccessFromFileURLs = (Boolean) value;
                        break;
                    case '%':
                        this.appCachePath = (String) value;
                        break;
                    case '&':
                        this.blockNetworkImage = (Boolean) value;
                        break;
                    case '\'':
                        this.blockNetworkLoads = (Boolean) value;
                        break;
                    case '(':
                        this.cacheMode = (Integer) value;
                        break;
                    case ')':
                        this.cursiveFontFamily = (String) value;
                        break;
                    case '*':
                        this.defaultFixedFontSize = (Integer) value;
                        break;
                    case '+':
                        this.defaultFontSize = (Integer) value;
                        break;
                    case ',':
                        this.defaultTextEncodingName = (String) value;
                        break;
                    case '-':
                        this.disabledActionModeMenuItems = (Integer) value;
                        break;
                    case '.':
                        this.fantasyFontFamily = (String) value;
                        break;
                    case '/':
                        this.fixedFontFamily = (String) value;
                        break;
                    case '0':
                        this.forceDark = (Integer) value;
                        break;
                    case '1':
                        this.geolocationEnabled = (Boolean) value;
                        break;
                    case '2':
                        setLayoutAlgorithm((String) value);
                        break;
                    case '3':
                        this.loadWithOverviewMode = (Boolean) value;
                        break;
                    case '4':
                        this.loadsImagesAutomatically = (Boolean) value;
                        break;
                    case '5':
                        this.minimumLogicalFontSize = (Integer) value;
                        break;
                    case '6':
                        this.initialScale = (Integer) value;
                        break;
                    case '7':
                        this.needInitialFocus = (Boolean) value;
                        break;
                    case '8':
                        this.offscreenPreRaster = (Boolean) value;
                        break;
                    case '9':
                        this.sansSerifFontFamily = (String) value;
                        break;
                    case ':':
                        this.serifFontFamily = (String) value;
                        break;
                    case ';':
                        this.standardFontFamily = (String) value;
                        break;
                    case '<':
                        this.saveFormData = (Boolean) value;
                        break;
                    case '=':
                        this.thirdPartyCookiesEnabled = (Boolean) value;
                        break;
                    case '>':
                        this.hardwareAcceleration = (Boolean) value;
                        break;
                    case '?':
                        this.supportMultipleWindows = (Boolean) value;
                        break;
                    case '@':
                        this.regexToCancelSubFramesLoading = (String) value;
                        break;
                    case 'A':
                        this.overScrollMode = (Integer) value;
                        break;
                    case 'B':
                        this.networkAvailable = (Boolean) value;
                        break;
                    case 'C':
                        this.scrollBarStyle = (Integer) value;
                        break;
                    case 'D':
                        this.verticalScrollbarPosition = (Integer) value;
                        break;
                    case 'E':
                        this.scrollBarDefaultDelayBeforeFade = (Integer) value;
                        break;
                    case 'F':
                        this.scrollbarFadingEnabled = (Boolean) value;
                        break;
                    case 'G':
                        this.scrollBarFadeDuration = (Integer) value;
                        break;
                    case 'H':
                        this.rendererPriorityPolicy = (Map) value;
                        break;
                    case 'I':
                        this.useShouldInterceptRequest = (Boolean) value;
                        break;
                    case 'J':
                        this.useOnRenderProcessGone = (Boolean) value;
                        break;
                    case 'K':
                        this.disableDefaultErrorPage = (Boolean) value;
                        break;
                    case 'L':
                        this.useHybridComposition = (Boolean) value;
                        break;
                    case 'M':
                        this.verticalScrollbarThumbColor = (String) value;
                        break;
                    case 'N':
                        this.verticalScrollbarTrackColor = (String) value;
                        break;
                    case 'O':
                        this.horizontalScrollbarThumbColor = (String) value;
                        break;
                    case 'P':
                        this.horizontalScrollbarTrackColor = (String) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("useShouldOverrideUrlLoading", this.useShouldOverrideUrlLoading);
        hashMap.put("useOnLoadResource", this.useOnLoadResource);
        hashMap.put("useOnDownloadStart", this.useOnDownloadStart);
        hashMap.put("clearCache", this.clearCache);
        hashMap.put("userAgent", this.userAgent);
        hashMap.put("applicationNameForUserAgent", this.applicationNameForUserAgent);
        hashMap.put("javaScriptEnabled", this.javaScriptEnabled);
        hashMap.put("javaScriptCanOpenWindowsAutomatically", this.javaScriptCanOpenWindowsAutomatically);
        hashMap.put("mediaPlaybackRequiresUserGesture", this.mediaPlaybackRequiresUserGesture);
        hashMap.put("minimumFontSize", this.minimumFontSize);
        hashMap.put("verticalScrollBarEnabled", this.verticalScrollBarEnabled);
        hashMap.put("horizontalScrollBarEnabled", this.horizontalScrollBarEnabled);
        hashMap.put("resourceCustomSchemes", this.resourceCustomSchemes);
        hashMap.put("contentBlockers", this.contentBlockers);
        hashMap.put("preferredContentMode", this.preferredContentMode);
        hashMap.put("useShouldInterceptAjaxRequest", this.useShouldInterceptAjaxRequest);
        hashMap.put("useShouldInterceptFetchRequest", this.useShouldInterceptFetchRequest);
        hashMap.put("incognito", this.incognito);
        hashMap.put("cacheEnabled", this.cacheEnabled);
        hashMap.put("transparentBackground", this.transparentBackground);
        hashMap.put("disableVerticalScroll", this.disableVerticalScroll);
        hashMap.put("disableHorizontalScroll", this.disableHorizontalScroll);
        hashMap.put("disableContextMenu", this.disableContextMenu);
        hashMap.put("textZoom", this.textZoom);
        hashMap.put("clearSessionCache", this.clearSessionCache);
        hashMap.put("builtInZoomControls", this.builtInZoomControls);
        hashMap.put("displayZoomControls", this.displayZoomControls);
        hashMap.put("supportZoom", this.supportZoom);
        hashMap.put("databaseEnabled", this.databaseEnabled);
        hashMap.put("domStorageEnabled", this.domStorageEnabled);
        hashMap.put("useWideViewPort", this.useWideViewPort);
        hashMap.put("safeBrowsingEnabled", this.safeBrowsingEnabled);
        hashMap.put("mixedContentMode", this.mixedContentMode);
        hashMap.put("allowContentAccess", this.allowContentAccess);
        hashMap.put("allowFileAccess", this.allowFileAccess);
        hashMap.put("allowFileAccessFromFileURLs", this.allowFileAccessFromFileURLs);
        hashMap.put("allowUniversalAccessFromFileURLs", this.allowUniversalAccessFromFileURLs);
        hashMap.put("appCachePath", this.appCachePath);
        hashMap.put("blockNetworkImage", this.blockNetworkImage);
        hashMap.put("blockNetworkLoads", this.blockNetworkLoads);
        hashMap.put("cacheMode", this.cacheMode);
        hashMap.put("cursiveFontFamily", this.cursiveFontFamily);
        hashMap.put("defaultFixedFontSize", this.defaultFixedFontSize);
        hashMap.put("defaultFontSize", this.defaultFontSize);
        hashMap.put("defaultTextEncodingName", this.defaultTextEncodingName);
        hashMap.put("disabledActionModeMenuItems", this.disabledActionModeMenuItems);
        hashMap.put("fantasyFontFamily", this.fantasyFontFamily);
        hashMap.put("fixedFontFamily", this.fixedFontFamily);
        hashMap.put("forceDark", this.forceDark);
        hashMap.put("geolocationEnabled", this.geolocationEnabled);
        hashMap.put("layoutAlgorithm", getLayoutAlgorithm());
        hashMap.put("loadWithOverviewMode", this.loadWithOverviewMode);
        hashMap.put("loadsImagesAutomatically", this.loadsImagesAutomatically);
        hashMap.put("minimumLogicalFontSize", this.minimumLogicalFontSize);
        hashMap.put("initialScale", this.initialScale);
        hashMap.put("needInitialFocus", this.needInitialFocus);
        hashMap.put("offscreenPreRaster", this.offscreenPreRaster);
        hashMap.put("sansSerifFontFamily", this.sansSerifFontFamily);
        hashMap.put("serifFontFamily", this.serifFontFamily);
        hashMap.put("standardFontFamily", this.standardFontFamily);
        hashMap.put("saveFormData", this.saveFormData);
        hashMap.put("thirdPartyCookiesEnabled", this.thirdPartyCookiesEnabled);
        hashMap.put("hardwareAcceleration", this.hardwareAcceleration);
        hashMap.put("supportMultipleWindows", this.supportMultipleWindows);
        hashMap.put("regexToCancelSubFramesLoading", this.regexToCancelSubFramesLoading);
        hashMap.put("overScrollMode", this.overScrollMode);
        hashMap.put("networkAvailable", this.networkAvailable);
        hashMap.put("scrollBarStyle", this.scrollBarStyle);
        hashMap.put("verticalScrollbarPosition", this.verticalScrollbarPosition);
        hashMap.put("scrollBarDefaultDelayBeforeFade", this.scrollBarDefaultDelayBeforeFade);
        hashMap.put("scrollbarFadingEnabled", this.scrollbarFadingEnabled);
        hashMap.put("scrollBarFadeDuration", this.scrollBarFadeDuration);
        hashMap.put("rendererPriorityPolicy", this.rendererPriorityPolicy);
        hashMap.put("useShouldInterceptRequest", this.useShouldInterceptRequest);
        hashMap.put("useOnRenderProcessGone", this.useOnRenderProcessGone);
        hashMap.put("disableDefaultErrorPage", this.disableDefaultErrorPage);
        hashMap.put("useHybridComposition", this.useHybridComposition);
        hashMap.put("verticalScrollbarThumbColor", this.verticalScrollbarThumbColor);
        hashMap.put("verticalScrollbarTrackColor", this.verticalScrollbarTrackColor);
        hashMap.put("horizontalScrollbarThumbColor", this.horizontalScrollbarThumbColor);
        hashMap.put("horizontalScrollbarTrackColor", this.horizontalScrollbarTrackColor);
        return hashMap;
    }
}
