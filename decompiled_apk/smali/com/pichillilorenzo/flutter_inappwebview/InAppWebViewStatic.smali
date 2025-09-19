.class public Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "InAppWebViewStatic"


# instance fields
.field public channel:Ld/a/c/a/i;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Ld/a/c/a/i;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    const-string v1, "com.pichillilorenzo/flutter_inappwebview_static"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->channel:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    return-void
.end method


# virtual methods
.method public convertWebViewPackageToMap(Landroid/content/pm/PackageInfo;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/pm/PackageInfo;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string v2, "versionName"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v1, "packageName"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->channel:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 8

    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "getCurrentWebViewPackage"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_1
    const-string v1, "getDefaultUserAgent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_2
    const-string v1, "getSafeBrowsingPrivacyPolicyUrl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_3
    const-string v1, "clearClientCertPreferences"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :sswitch_4
    const-string v1, "setWebContentsDebuggingEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_5
    const-string v1, "setSafeBrowsingWhitelist"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_b

    const/16 v1, 0x15

    if-eq v0, v6, :cond_9

    const/4 v6, 0x0

    if-eq v0, v5, :cond_7

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_1

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto/16 :goto_3

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    const-string v0, "debuggingEnabled"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_2

    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_4

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    invoke-static {p1}, Lb/l/g;->d(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->convertWebViewPackageToMap(Landroid/content/pm/PackageInfo;)Ljava/util/Map;

    move-result-object p1

    goto/16 :goto_2

    :cond_4
    if-lt p1, v1, :cond_8

    :try_start_0
    const-string p1, "android.webkit.WebViewFactory"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getLoadedPackageInfo"

    new-array v1, v7, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array v0, v7, [Ljava/lang/Object;

    invoke-virtual {p1, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/PackageInfo;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->convertWebViewPackageToMap(Landroid/content/pm/PackageInfo;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_5
    const-string v0, "SAFE_BROWSING_ALLOWLIST"

    invoke-static {v0}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "hosts"

    if-eqz v0, :cond_6

    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$2;

    invoke-direct {p1, p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;Ld/a/c/a/i$d;)V

    invoke-static {v0, p1}, Lb/l/g;->k(Ljava/util/Set;Landroid/webkit/ValueCallback;)V

    goto :goto_3

    :cond_6
    const-string v0, "SAFE_BROWSING_WHITELIST"

    invoke-static {v0}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$3;

    invoke-direct {v0, p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$3;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;Ld/a/c/a/i$d;)V

    invoke-static {p1, v0}, Lb/l/g;->l(Ljava/util/List;Landroid/webkit/ValueCallback;)V

    goto :goto_3

    :cond_7
    const-string p1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    invoke-static {p1}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lb/l/g;->i()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :catch_0
    :cond_8
    invoke-interface {p2, v6}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v1, :cond_a

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$1;

    invoke-direct {p1, p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;Ld/a/c/a/i$d;)V

    invoke-static {p1}, Landroid/webkit/WebView;->clearClientCertPreferences(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_a
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_b
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->applicationContext:Landroid/content/Context;

    invoke-static {p1}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5f63880f -> :sswitch_5
        -0x3643a6a1 -> :sswitch_4
        -0x1a003164 -> :sswitch_3
        0xf6b0a3f -> :sswitch_2
        0x265d382f -> :sswitch_1
        0x5e8d5210 -> :sswitch_0
    .end sparse-switch
.end method
