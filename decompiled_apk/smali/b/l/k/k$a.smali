.class Lb/l/k/k$a;
.super Landroid/webkit/WebMessagePort$WebMessageCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/l/k/k;->e(Lb/l/f$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/l/f$a;


# direct methods
.method constructor <init>(Lb/l/k/k;Lb/l/f$a;)V
    .locals 0

    iput-object p2, p0, Lb/l/k/k$a;->a:Lb/l/f$a;

    invoke-direct {p0}, Landroid/webkit/WebMessagePort$WebMessageCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V
    .locals 2

    iget-object v0, p0, Lb/l/k/k$a;->a:Lb/l/f$a;

    new-instance v1, Lb/l/k/k;

    invoke-direct {v1, p1}, Lb/l/k/k;-><init>(Landroid/webkit/WebMessagePort;)V

    invoke-static {p2}, Lb/l/k/k;->h(Landroid/webkit/WebMessage;)Lb/l/e;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lb/l/f$a;->onMessage(Lb/l/f;Lb/l/e;)V

    return-void
.end method
