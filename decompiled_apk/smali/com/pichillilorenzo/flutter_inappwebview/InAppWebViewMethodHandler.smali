.class public Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field static final LOG_TAG:Ljava/lang/String; = "IAWMethodHandler"


# instance fields
.field public webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "getTitle"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "evaluateJavascript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x7

    goto/16 :goto_1

    :sswitch_2
    const-string v4, "injectJavascriptFileFromUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x8

    goto/16 :goto_1

    :sswitch_3
    const-string v4, "findAllAsync"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x1e

    goto/16 :goto_1

    :sswitch_4
    const-string v4, "loadFile"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x6

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "loadData"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x5

    goto/16 :goto_1

    :sswitch_6
    const-string v4, "goBackOrForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x10

    goto/16 :goto_1

    :sswitch_7
    const-string v4, "setContextMenu"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x34

    goto/16 :goto_1

    :sswitch_8
    const-string v4, "requestImageRef"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x36

    goto/16 :goto_1

    :sswitch_9
    const-string v4, "callAsyncJavaScript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x3f

    goto/16 :goto_1

    :sswitch_a
    const-string v4, "setOptions"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x15

    goto/16 :goto_1

    :sswitch_b
    const-string v4, "getZoomScale"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x2b

    goto/16 :goto_1

    :sswitch_c
    const-string v4, "addUserScript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x3b

    goto/16 :goto_1

    :sswitch_d
    const-string v4, "removeAllUserScripts"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x3e

    goto/16 :goto_1

    :sswitch_e
    const-string v4, "resumeTimers"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x26

    goto/16 :goto_1

    :sswitch_f
    const-string v4, "getCertificate"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x39

    goto/16 :goto_1

    :sswitch_10
    const-string v4, "requestFocusNodeHref"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x35

    goto/16 :goto_1

    :sswitch_11
    const-string v4, "getOriginalUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x2a

    goto/16 :goto_1

    :sswitch_12
    const-string v4, "getProgress"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x2

    goto/16 :goto_1

    :sswitch_13
    const-string v4, "clearSslPreferences"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x1d

    goto/16 :goto_1

    :sswitch_14
    const-string v4, "removeUserScriptsByGroupName"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x3d

    goto/16 :goto_1

    :sswitch_15
    const-string v4, "clearHistory"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x3a

    goto/16 :goto_1

    :sswitch_16
    const-string v4, "pageDown"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x2e

    goto/16 :goto_1

    :sswitch_17
    const-string v4, "clearMatches"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x20

    goto/16 :goto_1

    :sswitch_18
    const-string v4, "injectCSSFileFromUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xa

    goto/16 :goto_1

    :sswitch_19
    const-string v4, "canScrollVertically"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x44

    goto/16 :goto_1

    :sswitch_1a
    const-string v4, "getHitTestResult"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x2d

    goto/16 :goto_1

    :sswitch_1b
    const-string v4, "loadUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x3

    goto/16 :goto_1

    :sswitch_1c
    const-string v4, "postWebMessage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x42

    goto/16 :goto_1

    :sswitch_1d
    const-string v4, "takeScreenshot"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x14

    goto/16 :goto_1

    :sswitch_1e
    const-string v4, "pause"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x23

    goto/16 :goto_1

    :sswitch_1f
    const-string v4, "createWebMessageChannel"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x41

    goto/16 :goto_1

    :sswitch_20
    const-string v4, "close"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x17

    goto/16 :goto_1

    :sswitch_21
    const-string v4, "show"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x18

    goto/16 :goto_1

    :sswitch_22
    const-string v4, "hide"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x19

    goto/16 :goto_1

    :sswitch_23
    const-string v4, "startSafeBrowsing"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x1b

    goto/16 :goto_1

    :sswitch_24
    const-string v4, "getCopyBackForwardList"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x1a

    goto/16 :goto_1

    :sswitch_25
    const-string v4, "injectCSSCode"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x9

    goto/16 :goto_1

    :sswitch_26
    const-string v4, "zoomOut"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x32

    goto/16 :goto_1

    :sswitch_27
    const-string v4, "getSelectedText"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x2c

    goto/16 :goto_1

    :sswitch_28
    const-string v4, "getOptions"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x16

    goto/16 :goto_1

    :sswitch_29
    const-string v4, "isLoading"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x13

    goto/16 :goto_1

    :sswitch_2a
    const-string v4, "canGoBack"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xd

    goto/16 :goto_1

    :sswitch_2b
    const-string v4, "goForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xe

    goto/16 :goto_1

    :sswitch_2c
    const-string v4, "postUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto/16 :goto_1

    :sswitch_2d
    const-string v4, "scrollTo"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x21

    goto/16 :goto_1

    :sswitch_2e
    const-string v4, "scrollBy"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x22

    goto/16 :goto_1

    :sswitch_2f
    const-string v4, "printCurrentPage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x27

    goto/16 :goto_1

    :sswitch_30
    const-string v4, "findNext"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x1f

    goto/16 :goto_1

    :sswitch_31
    const-string v4, "addWebMessageListener"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x43

    goto/16 :goto_1

    :sswitch_32
    const-string v4, "zoomIn"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x31

    goto/16 :goto_1

    :sswitch_33
    const-string v4, "zoomBy"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x29

    goto/16 :goto_1

    :sswitch_34
    const-string v4, "clearFocus"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x33

    goto/16 :goto_1

    :sswitch_35
    const-string v4, "clearCache"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x1c

    goto/16 :goto_1

    :sswitch_36
    const-string v4, "resume"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x24

    goto/16 :goto_1

    :sswitch_37
    const-string v4, "reload"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xb

    goto/16 :goto_1

    :sswitch_38
    const-string v4, "stopLoading"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x12

    goto/16 :goto_1

    :sswitch_39
    const-string v4, "canScrollHorizontally"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x45

    goto/16 :goto_1

    :sswitch_3a
    const-string v4, "pageUp"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x2f

    goto/16 :goto_1

    :sswitch_3b
    const-string v4, "canGoForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xf

    goto/16 :goto_1

    :sswitch_3c
    const-string v4, "goBack"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xc

    goto/16 :goto_1

    :sswitch_3d
    const-string v4, "getUrl"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :sswitch_3e
    const-string v4, "canGoBackOrForward"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x11

    goto :goto_1

    :sswitch_3f
    const-string v4, "getScrollY"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x38

    goto :goto_1

    :sswitch_40
    const-string v4, "getScrollX"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x37

    goto :goto_1

    :sswitch_41
    const-string v4, "saveWebArchive"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x30

    goto :goto_1

    :sswitch_42
    const-string v4, "removeUserScript"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x3c

    goto :goto_1

    :sswitch_43
    const-string v4, "getContentHeight"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x28

    goto :goto_1

    :sswitch_44
    const-string v4, "pauseTimers"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x25

    goto :goto_1

    :sswitch_45
    const-string v4, "isSecureContext"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x40

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v3, -0x1

    :goto_1
    const-string v4, "index"

    const-string v9, "userScript"

    const-string v10, "animated"

    const-string v11, "y"

    const-string v12, "x"

    const-string v13, "steps"

    const-string v14, "urlFile"

    const-string v15, "contentWorld"

    const-string v6, "source"

    const-string v5, "data"

    const-string v7, "IAWMethodHandler"

    const/4 v8, 0x0

    packed-switch v3, :pswitch_data_0

    :cond_1
    invoke-interface/range {p2 .. p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto/16 :goto_b

    :pswitch_0
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->canScrollHorizontally()Z

    move-result v0

    goto/16 :goto_4

    :pswitch_1
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->canScrollVertically()Z

    move-result v0

    goto/16 :goto_4

    :pswitch_2
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "WEB_MESSAGE_LISTENER"

    invoke-static {v3}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    const-string v3, "webMessageListener"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    invoke-static {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;->fromMap(Ld/a/c/a/b;Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    move-result-object v0

    :try_start_0
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->addWebMessageListener(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v0}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_b

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v7, v0, v8}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "POST_WEB_MESSAGE"

    invoke-static {v3}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    const-string v3, "message"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    const-string v6, "targetOrigin"

    invoke-virtual {v0, v6}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-string v9, "ports"

    invoke-interface {v3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    if-eqz v9, :cond_3

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    const-string v11, "webMessageChannelId"

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    iget-object v12, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v12, v12, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->webMessageChannels:Ljava/util/Map;

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    if-eqz v11, :cond_2

    iget-object v11, v11, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->ports:Ljava/util/List;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance v4, Lb/l/e;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x0

    new-array v5, v5, [Lb/l/f;

    invoke-interface {v6, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lb/l/f;

    invoke-direct {v4, v3, v5}, Lb/l/e;-><init>(Ljava/lang/String;[Lb/l/f;)V

    :try_start_1
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v3, v4, v0}, Lb/l/g;->j(Landroid/webkit/WebView;Lb/l/e;Landroid/net/Uri;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v0}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_b

    :pswitch_4
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    const-string v0, "CREATE_WEB_MESSAGE_CHANNEL"

    invoke-static {v0}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->createCompatWebMessageChannel()Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->toMap()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_5
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_4

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_4

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$5;

    invoke-direct {v3, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$5;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Ld/a/c/a/i$d;)V

    invoke-virtual {v0, v3}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->isSecureContext(Landroid/webkit/ValueCallback;)V

    goto/16 :goto_b

    :pswitch_6
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_8

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_8

    const-string v3, "functionBody"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "arguments"

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v0, v15}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;

    move-result-object v0

    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    new-instance v6, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$4;

    invoke-direct {v6, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$4;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Ld/a/c/a/i$d;)V

    invoke-virtual {v5, v3, v4, v0, v6}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->callAsyncJavaScript(Ljava/lang/String;Ljava/util/Map;Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;Landroid/webkit/ValueCallback;)V

    goto/16 :goto_b

    :pswitch_7
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->removeAllUserOnlyScripts()V

    goto/16 :goto_9

    :pswitch_8
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    if-eqz v3, :cond_9

    const-string v3, "groupName"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->removeUserOnlyScriptsByGroupName(Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_9
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_4

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    if-eqz v3, :cond_4

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v9}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;

    move-result-object v0

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v4, v4, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;->getInjectionTime()Lcom/pichillilorenzo/flutter_inappwebview/types/UserScriptInjectionTime;

    move-result-object v0

    invoke-virtual {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->removeUserOnlyScriptAt(ILcom/pichillilorenzo/flutter_inappwebview/types/UserScriptInjectionTime;)Z

    move-result v0

    goto/16 :goto_4

    :pswitch_a
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_4

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    if-eqz v3, :cond_4

    invoke-virtual {v0, v9}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;

    move-result-object v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->addUserOnlyScript(Lcom/pichillilorenzo/flutter_inappwebview/types/UserScript;)Z

    move-result v0

    goto/16 :goto_4

    :pswitch_b
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    goto/16 :goto_9

    :pswitch_c
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v0

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/SslCertificateExt;->toMap(Landroid/net/http/SslCertificate;)Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_d
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v0

    goto :goto_3

    :pswitch_e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getScrollX()I

    move-result v0

    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_f
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->requestImageRef()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_10
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->requestFocusNodeHref()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_11
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "contextMenu"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iput-object v0, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->contextMenu:Ljava/util/Map;

    goto/16 :goto_9

    :pswitch_12
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InputAwareWebView;->clearFocus()V

    goto/16 :goto_9

    :pswitch_13
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/webkit/WebView;->zoomOut()Z

    move-result v0

    goto :goto_4

    :pswitch_14
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/webkit/WebView;->zoomIn()Z

    move-result v0

    goto :goto_4

    :pswitch_15
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_8

    const-string v3, "filePath"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "autoname"

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$3;

    invoke-direct {v5, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$3;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Ld/a/c/a/i$d;)V

    invoke-virtual {v4, v3, v0, v5}, Landroid/webkit/WebView;->saveWebArchive(Ljava/lang/String;ZLandroid/webkit/ValueCallback;)V

    goto/16 :goto_b

    :pswitch_16
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_4

    const-string v3, "top"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->pageUp(Z)Z

    move-result v0

    goto :goto_4

    :pswitch_17
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_4

    const-string v3, "bottom"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->pageDown(Z)Z

    move-result v0

    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_18
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getHitTestResult()Landroid/webkit/WebView$HitTestResult;

    move-result-object v0

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Landroid/webkit/WebView$HitTestResult;->getType()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "type"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/webkit/WebView$HitTestResult;->getExtra()Ljava/lang/String;

    move-result-object v0

    const-string v4, "extra"

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2, v3}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_19
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_8

    invoke-virtual {v0, v2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->getSelectedText(Ld/a/c/a/i$d;)V

    goto/16 :goto_b

    :pswitch_1a
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    iget v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->zoomScale:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    goto/16 :goto_8

    :pswitch_1b
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_8

    :pswitch_1c
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_9

    const-string v3, "zoomFactor"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    double-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->zoomBy(F)V

    goto/16 :goto_9

    :pswitch_1d
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v0

    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto/16 :goto_8

    :pswitch_1e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_9

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->printCurrentPage()V

    goto/16 :goto_9

    :pswitch_1f
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->resumeTimers()V

    goto/16 :goto_9

    :pswitch_20
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->pauseTimers()V

    goto/16 :goto_9

    :pswitch_21
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    goto/16 :goto_9

    :pswitch_22
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    goto/16 :goto_9

    :pswitch_23
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v12}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v11}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v0, v10}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v5, v3, v4, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->scrollBy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    goto/16 :goto_9

    :pswitch_24
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v12}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v0, v11}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v0, v10}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v5, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v5, v3, v4, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->scrollTo(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    goto/16 :goto_9

    :pswitch_25
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearMatches()V

    goto/16 :goto_9

    :pswitch_26
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "forward"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->findNext(Z)V

    goto/16 :goto_9

    :pswitch_27
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "find"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->findAllAsync(Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_28
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearSslPreferences()V

    goto/16 :goto_9

    :pswitch_29
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->clearAllCache()V

    goto/16 :goto_9

    :pswitch_2a
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_4

    const-string v0, "START_SAFE_BROWSING"

    invoke-static {v0}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$2;

    invoke-direct {v3, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Ld/a/c/a/i$d;)V

    invoke-static {v0, v3}, Lb/l/g;->n(Landroid/content/Context;Landroid/webkit/ValueCallback;)V

    goto/16 :goto_b

    :cond_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_a

    :pswitch_2b
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->getCopyBackForwardList()Ljava/util/HashMap;

    move-result-object v8

    goto/16 :goto_8

    :pswitch_2c
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v0, :cond_1

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->hide()V

    goto/16 :goto_9

    :pswitch_2d
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v0, :cond_1

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->show()V

    goto/16 :goto_9

    :pswitch_2e
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v0, :cond_1

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0, v2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->close(Ld/a/c/a/i$d;)V

    goto/16 :goto_b

    :pswitch_2f
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v0, :cond_5

    instance-of v3, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v3, :cond_5

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->getOptions()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_a

    :cond_5
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->getOptions()Ljava/util/Map;

    move-result-object v8

    goto/16 :goto_8

    :pswitch_30
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    const-string v4, "options"

    if-eqz v3, :cond_6

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v3, :cond_6

    instance-of v5, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    if-eqz v5, :cond_6

    check-cast v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;

    invoke-direct {v5}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;-><init>()V

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;

    invoke-virtual {v3, v5, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserActivity;->setOptions(Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserOptions;Ljava/util/HashMap;)V

    goto/16 :goto_9

    :cond_6
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    invoke-direct {v3}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;-><init>()V

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->setOptions(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;Ljava/util/HashMap;)V

    goto/16 :goto_9

    :pswitch_31
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_8

    const-string v3, "screenshotConfiguration"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0, v2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->takeScreenshot(Ljava/util/Map;Ld/a/c/a/i$d;)V

    goto/16 :goto_b

    :pswitch_32
    const/4 v5, 0x0

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_6

    :pswitch_33
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    goto/16 :goto_9

    :pswitch_34
    const/4 v5, 0x0

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_7

    invoke-virtual {v0, v13}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->canGoBackOrForward(I)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_6

    :pswitch_35
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v13}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->goBackOrForward(I)V

    goto/16 :goto_9

    :pswitch_36
    const/4 v5, 0x0

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_6

    :pswitch_37
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    goto/16 :goto_9

    :pswitch_38
    const/4 v5, 0x0

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_7

    :goto_6
    const/4 v6, 0x1

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    :goto_7
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_a

    :pswitch_39
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto/16 :goto_9

    :pswitch_3a
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->reload()V

    goto/16 :goto_9

    :pswitch_3b
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v14}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "cssLinkHtmlTagAttributes"

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->injectCSSFileFromUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_9

    :pswitch_3c
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v6}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->injectCSSCode(Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_3d
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v14}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "scriptHtmlTagAttributes"

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v4, v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->injectJavascriptFileFromUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_9

    :pswitch_3e
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_8

    invoke-virtual {v0, v6}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v15}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;

    move-result-object v0

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;

    invoke-direct {v5, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Ld/a/c/a/i$d;)V

    invoke-virtual {v4, v3, v0, v5}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->evaluateJavascript(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;Landroid/webkit/ValueCallback;)V

    goto/16 :goto_b

    :cond_8
    :goto_8
    invoke-interface {v2, v8}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_3f
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "assetFilePath"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_2
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->loadFile(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_9

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v7, v0, v8}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :pswitch_40
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    invoke-virtual {v0, v5}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    const-string v3, "mimeType"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    const-string v3, "encoding"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    const-string v3, "baseUrl"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    const-string v3, "historyUrl"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual/range {v4 .. v9}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :pswitch_41
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "url"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "postData"

    invoke-virtual {v0, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iget-object v4, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {v4, v3, v0}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    goto :goto_9

    :pswitch_42
    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v3, :cond_9

    const-string v3, "urlRequest"

    invoke-virtual {v0, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;->fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->loadUrl(Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;)V

    :cond_9
    :goto_9
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_a
    invoke-interface {v2, v0}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto :goto_b

    :pswitch_43
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getProgress()I

    move-result v0

    goto/16 :goto_5

    :pswitch_44
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_8

    :pswitch_45
    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->webView:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_8

    :goto_b
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x788cbad2 -> :sswitch_45
        -0x6a88dc9c -> :sswitch_44
        -0x69b090b6 -> :sswitch_43
        -0x64569be6 -> :sswitch_42
        -0x60d253d5 -> :sswitch_41
        -0x4f5bd10b -> :sswitch_40
        -0x4f5bd10a -> :sswitch_3f
        -0x4e0b0fbd -> :sswitch_3e
        -0x4a7789c7 -> :sswitch_3d
        -0x4a012e11 -> :sswitch_3c
        -0x3f9d4d33 -> :sswitch_3b
        -0x3b59fa76 -> :sswitch_3a
        -0x391587f2 -> :sswitch_39
        -0x38833526 -> :sswitch_38
        -0x37b57e67 -> :sswitch_37
        -0x37b237d3 -> :sswitch_36
        -0x2d410ecb -> :sswitch_35
        -0x2d106975 -> :sswitch_34
        -0x29807c76 -> :sswitch_33
        -0x29807ba8 -> :sswitch_32
        -0x2961c598 -> :sswitch_31
        -0x287e8fb4 -> :sswitch_30
        -0x28785945 -> :sswitch_2f
        -0x17f88ffc -> :sswitch_2e
        -0x17f88dd8 -> :sswitch_2d
        -0x17518f51 -> :sswitch_2c
        -0x12f8b743 -> :sswitch_2b
        -0x12e5de21 -> :sswitch_2a
        -0xe7dd74e -> :sswitch_29
        -0xcac3d98 -> :sswitch_28
        -0x7a08722 -> :sswitch_27
        -0x68ee185 -> :sswitch_26
        -0x32ce041 -> :sswitch_25
        -0x1f169cf -> :sswitch_24
        -0x10edb0a -> :sswitch_23
        0x30dd42 -> :sswitch_22
        0x35dafd -> :sswitch_21
        0x5a5ddf8 -> :sswitch_20
        0x5d6b9d4 -> :sswitch_1f
        0x65825f6 -> :sswitch_1e
        0xb9ed94d -> :sswitch_1d
        0xc9252d3 -> :sswitch_1c
        0x141096a9 -> :sswitch_1b
        0x1d5dd38c -> :sswitch_1a
        0x215ffa20 -> :sswitch_19
        0x2c211a37 -> :sswitch_18
        0x30b32a26 -> :sswitch_17
        0x33331bd1 -> :sswitch_16
        0x35d48587 -> :sswitch_15
        0x3b8691ba -> :sswitch_14
        0x3e28c0f9 -> :sswitch_13
        0x402effa3 -> :sswitch_12
        0x410b6ca8 -> :sswitch_11
        0x4a4dcef6 -> :sswitch_10
        0x4e358861 -> :sswitch_f
        0x5aa2005b -> :sswitch_e
        0x5ea44800 -> :sswitch_d
        0x5f2823f7 -> :sswitch_c
        0x6140d281 -> :sswitch_b
        0x66c50fdc -> :sswitch_a
        0x66e42eeb -> :sswitch_9
        0x6714ace7 -> :sswitch_8
        0x6a1709ec -> :sswitch_7
        0x6bed5233 -> :sswitch_6
        0x6dfa45b0 -> :sswitch_5
        0x6dfb4b82 -> :sswitch_4
        0x72420634 -> :sswitch_3
        0x72be6f8b -> :sswitch_2
        0x738236e6 -> :sswitch_1
        0x7531c8a2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
