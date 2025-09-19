.class public Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "PlatformUtil"


# instance fields
.field public channel:Ld/a/c/a/i;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Ld/a/c/a/i;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    const-string v1, "com.pichillilorenzo/flutter_inappwebview_platformutil"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->channel:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    return-void
.end method

.method public static formatDate(JLjava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v0, p4}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, p2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getLocaleFromString(Ljava/lang/String;)Ljava/util/Locale;
    .locals 5

    if-nez p0, :cond_0

    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    return-object p0

    :cond_0
    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object v0, p0, v0

    array-length v1, p0

    const-string v2, ""

    const/4 v3, 0x1

    if-le v1, v3, :cond_1

    aget-object v1, p0, v3

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    array-length v3, p0

    const/4 v4, 0x2

    if-le v3, v4, :cond_2

    aget-object v2, p0, v4

    :cond_2
    new-instance p0, Ljava/util/Locale;

    invoke-direct {p0, v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->channel:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 5

    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x13458845

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const v2, 0x4b43fbf3    # 1.2844019E7f

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "getSystemVersion"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const-string v1, "formatDate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_3

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_3

    :cond_3
    const-string v0, "date"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string v2, "format"

    invoke-virtual {p1, v2}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "locale"

    invoke-virtual {p1, v3}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->getLocaleFromString(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    const-string v4, "timezone"

    invoke-virtual {p1, v4}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_4

    const-string p1, "UTC"

    :cond_4
    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->formatDate(JLjava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_3
    return-void
.end method
