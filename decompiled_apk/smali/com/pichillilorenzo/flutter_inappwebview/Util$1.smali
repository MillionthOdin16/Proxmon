.class Lcom/pichillilorenzo/flutter_inappwebview/Util$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/Util;->invokeMethodAndWait(Ld/a/c/a/i;Ljava/lang/String;Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$arguments:Ljava/lang/Object;

.field final synthetic val$channel:Ld/a/c/a/i;

.field final synthetic val$flutterResultMap:Ljava/util/Map;

.field final synthetic val$latch:Ljava/util/concurrent/CountDownLatch;

.field final synthetic val$method:Ljava/lang/String;


# direct methods
.method constructor <init>(Ld/a/c/a/i;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$channel:Ld/a/c/a/i;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$method:Ljava/lang/String;

    iput-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$arguments:Ljava/lang/Object;

    iput-object p4, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$flutterResultMap:Ljava/util/Map;

    iput-object p5, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$latch:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$channel:Ld/a/c/a/i;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$method:Ljava/lang/String;

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview/Util$1;->val$arguments:Ljava/lang/Object;

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/Util$1$1;

    invoke-direct {v3, p0}, Lcom/pichillilorenzo/flutter_inappwebview/Util$1$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/Util$1;)V

    invoke-virtual {v0, v1, v2, v3}, Ld/a/c/a/i;->d(Ljava/lang/String;Ljava/lang/Object;Ld/a/c/a/i$d;)V

    return-void
.end method
