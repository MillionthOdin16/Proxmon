.class public Lb/l/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/l/g$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/net/Uri;

.field private static final b:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "*"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lb/l/g;->a:Landroid/net/Uri;

    const-string v0, ""

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lb/l/g;->b:Landroid/net/Uri;

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;Lb/l/g$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lb/l/g$a;",
            ")V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    sget-object v0, Lb/l/k/l;->V:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lb/l/g;->h(Landroid/webkit/WebView;)Lb/l/k/n;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lb/l/k/n;->a(Ljava/lang/String;[Ljava/lang/String;Lb/l/g$a;)V

    return-void

    :cond_0
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "Should be on Lollipop and above."

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method private static b(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 1

    invoke-static {}, Lb/l/g;->e()Lb/l/k/o;

    move-result-object v0

    invoke-interface {v0, p0}, Lb/l/k/o;->createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/webkit/WebView;)[Lb/l/f;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->H:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/webkit/WebView;->createWebMessageChannel()[Landroid/webkit/WebMessagePort;

    move-result-object p0

    invoke-static {p0}, Lb/l/k/k;->k([Landroid/webkit/WebMessagePort;)[Lb/l/f;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lb/l/g;->h(Landroid/webkit/WebView;)Lb/l/k/n;

    move-result-object p0

    invoke-virtual {p0}, Lb/l/k/n;->b()[Lb/l/f;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static d(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    return-object v1

    :cond_0
    const/16 v2, 0x1a

    if-lt v0, v2, :cond_1

    invoke-static {}, Landroid/webkit/WebView;->getCurrentWebViewPackage()Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0

    :cond_1
    :try_start_0
    invoke-static {}, Lb/l/g;->f()Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-static {p0}, Lb/l/g;->g(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0

    :catch_0
    return-object v1
.end method

.method private static e()Lb/l/k/o;
    .locals 1

    invoke-static {}, Lb/l/k/m;->d()Lb/l/k/o;

    move-result-object v0

    return-object v0
.end method

.method private static f()Landroid/content/pm/PackageInfo;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const-string v0, "android.webkit.WebViewFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    const-string v3, "getLoadedPackageInfo"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    return-object v0
.end method

.method private static g(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-gt v1, v2, :cond_0

    const-string v1, "android.webkit.WebViewFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getWebViewPackageName"

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const-string v1, "android.webkit.WebViewUpdateService"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getCurrentWebViewPackageName"

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    :try_start_1
    invoke-virtual {p0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method private static h(Landroid/webkit/WebView;)Lb/l/k/n;
    .locals 1

    new-instance v0, Lb/l/k/n;

    invoke-static {p0}, Lb/l/g;->b(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    invoke-direct {v0, p0}, Lb/l/k/n;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    return-object v0
.end method

.method public static i()Landroid/net/Uri;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->n:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/webkit/WebView;->getSafeBrowsingPrivacyPolicyUrl()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/l/g;->e()Lb/l/k/o;

    move-result-object v0

    invoke-interface {v0}, Lb/l/k/o;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->getSafeBrowsingPrivacyPolicyUrl()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public static j(Landroid/webkit/WebView;Lb/l/e;Landroid/net/Uri;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/g;->a:Landroid/net/Uri;

    invoke-virtual {v0, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lb/l/g;->b:Landroid/net/Uri;

    :cond_0
    sget-object v0, Lb/l/k/l;->I:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lb/l/k/k;->f(Lb/l/e;)Landroid/webkit/WebMessage;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->postWebMessage(Landroid/webkit/WebMessage;Landroid/net/Uri;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lb/l/g;->h(Landroid/webkit/WebView;)Lb/l/k/n;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lb/l/k/n;->c(Lb/l/e;Landroid/net/Uri;)V

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static k(Ljava/util/Set;Landroid/webkit/ValueCallback;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->m:Lb/l/k/l;

    sget-object v1, Lb/l/k/l;->l:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb/l/g;->e()Lb/l/k/o;

    move-result-object v0

    invoke-interface {v0}, Lb/l/k/o;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->setSafeBrowsingAllowlist(Ljava/util/Set;Landroid/webkit/ValueCallback;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Lb/l/k/l;->f()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {v0, p1}, Landroid/webkit/WebView;->setSafeBrowsingWhitelist(Ljava/util/List;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lb/l/k/l;->g()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, Lb/l/g;->e()Lb/l/k/o;

    move-result-object p0

    invoke-interface {p0}, Lb/l/k/o;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object p0

    invoke-interface {p0, v0, p1}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->setSafeBrowsingWhitelist(Ljava/util/List;Landroid/webkit/ValueCallback;)V

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static l(Ljava/util/List;Landroid/webkit/ValueCallback;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, p1}, Lb/l/g;->k(Ljava/util/Set;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static m(Landroid/webkit/WebView;Lb/l/j;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->P:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    new-instance v2, Lb/l/k/r;

    invoke-direct {v2, p1}, Lb/l/k/r;-><init>(Lb/l/j;)V

    :cond_0
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setWebViewRenderProcessClient(Landroid/webkit/WebViewRenderProcessClient;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lb/l/g;->h(Landroid/webkit/WebView;)Lb/l/k/n;

    move-result-object p0

    invoke-virtual {p0, v2, p1}, Lb/l/k/n;->d(Ljava/util/concurrent/Executor;Lb/l/j;)V

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static n(Landroid/content/Context;Landroid/webkit/ValueCallback;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->i:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Landroid/webkit/WebView;->startSafeBrowsing(Landroid/content/Context;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lb/l/g;->e()Lb/l/k/o;

    move-result-object v0

    invoke-interface {v0}, Lb/l/k/o;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->initSafeBrowsing(Landroid/content/Context;Landroid/webkit/ValueCallback;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
