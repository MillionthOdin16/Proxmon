.class Lio/flutter/embedding/engine/h/c$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/engine/h/c$a;->a()Lio/flutter/embedding/engine/h/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lio/flutter/embedding/engine/h/c$a;


# direct methods
.method constructor <init>(Lio/flutter/embedding/engine/h/c$a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/h/c$a$a;->b:Lio/flutter/embedding/engine/h/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/h/c$a$a;->b:Lio/flutter/embedding/engine/h/c$a;

    iget-object v0, v0, Lio/flutter/embedding/engine/h/c$a;->b:Lio/flutter/embedding/engine/h/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/h/c;->b(Lio/flutter/embedding/engine/h/c;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    return-void
.end method
