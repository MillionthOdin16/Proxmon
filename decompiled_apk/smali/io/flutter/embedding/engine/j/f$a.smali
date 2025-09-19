.class Lio/flutter/embedding/engine/j/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/j/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lio/flutter/embedding/engine/j/f;


# direct methods
.method constructor <init>(Lio/flutter/embedding/engine/j/f;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/j/f$a;->b:Lio/flutter/embedding/engine/j/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 5

    const-string v0, "locale"

    iget-object v1, p0, Lio/flutter/embedding/engine/j/f$a;->b:Lio/flutter/embedding/engine/j/f;

    invoke-static {v1}, Lio/flutter/embedding/engine/j/f;->a(Lio/flutter/embedding/engine/j/f;)Lio/flutter/embedding/engine/j/f$b;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0xf776bc0

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "Localization.getStringResource"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ld/a/c/a/h;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "key"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    iget-object v0, p0, Lio/flutter/embedding/engine/j/f$a;->b:Lio/flutter/embedding/engine/j/f;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/f;->a(Lio/flutter/embedding/engine/j/f;)Lio/flutter/embedding/engine/j/f$b;

    move-result-object v0

    invoke-interface {v0, v2, p1}, Lio/flutter/embedding/engine/j/f$b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "error"

    invoke-interface {p2, v0, p1, v1}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
