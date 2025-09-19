.class Lb/c/b/c$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/b/c$a;->E(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Lb/c/b/c$a;


# direct methods
.method constructor <init>(Lb/c/b/c$a;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/c$a$c;->c:Lb/c/b/c$a;

    iput-object p2, p0, Lb/c/b/c$a$c;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lb/c/b/c$a$c;->c:Lb/c/b/c$a;

    iget-object v0, v0, Lb/c/b/c$a;->b:Lb/c/b/b;

    iget-object v1, p0, Lb/c/b/c$a$c;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lb/c/b/b;->onMessageChannelReady(Landroid/os/Bundle;)V

    return-void
.end method
