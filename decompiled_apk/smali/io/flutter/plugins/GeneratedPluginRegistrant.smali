.class public final Lio/flutter/plugins/GeneratedPluginRegistrant;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GeneratedPluginRegistrant"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerWith(Lio/flutter/embedding/engine/b;)V
    .locals 3

    const-string v0, "GeneratedPluginRegistrant"

    :try_start_0
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object v1

    new-instance v2, Lc/a/a/a;

    invoke-direct {v2}, Lc/a/a/a;-><init>()V

    invoke-interface {v1, v2}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Error registering plugin app_review, com.appleeducate.appreview.AppReviewPlugin"

    invoke-static {v0, v2, v1}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object v1

    new-instance v2, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    invoke-direct {v2}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;-><init>()V

    invoke-interface {v1, v2}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v2, "Error registering plugin flutter_inappwebview, com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin"

    invoke-static {v0, v2, v1}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object v1

    new-instance v2, Lc/c/a/a;

    invoke-direct {v2}, Lc/c/a/a;-><init>()V

    invoke-interface {v1, v2}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    const-string v2, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin"

    invoke-static {v0, v2, v1}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    :try_start_3
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/a/a;

    invoke-direct {v2}, Lio/flutter/plugins/a/a;-><init>()V

    invoke-interface {v1, v2}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v1

    const-string v2, "Error registering plugin package_info, io.flutter.plugins.packageinfo.PackageInfoPlugin"

    invoke-static {v0, v2, v1}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    :try_start_4
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/b/h;

    invoke-direct {v2}, Lio/flutter/plugins/b/h;-><init>()V

    invoke-interface {v1, v2}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v1

    const-string v2, "Error registering plugin path_provider, io.flutter.plugins.pathprovider.PathProviderPlugin"

    invoke-static {v0, v2, v1}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    :try_start_5
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/c/b;

    invoke-direct {v2}, Lio/flutter/plugins/c/b;-><init>()V

    invoke-interface {v1, v2}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v1

    const-string v2, "Error registering plugin shared_preferences, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"

    invoke-static {v0, v2, v1}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    :try_start_6
    invoke-virtual {p0}, Lio/flutter/embedding/engine/b;->p()Lio/flutter/embedding/engine/i/b;

    move-result-object p0

    new-instance v1, Lio/flutter/plugins/urllauncher/c;

    invoke-direct {v1}, Lio/flutter/plugins/urllauncher/c;-><init>()V

    invoke-interface {p0, v1}, Lio/flutter/embedding/engine/i/b;->g(Lio/flutter/embedding/engine/i/a;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception p0

    const-string v1, "Error registering plugin url_launcher, io.flutter.plugins.urllauncher.UrlLauncherPlugin"

    invoke-static {v0, v1, p0}, Ld/a/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    return-void
.end method
