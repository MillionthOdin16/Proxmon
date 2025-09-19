.class Lb/c/b/c$a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/b/c$a;->H(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Landroid/net/Uri;

.field final synthetic d:Z

.field final synthetic e:Landroid/os/Bundle;

.field final synthetic f:Lb/c/b/c$a;


# direct methods
.method constructor <init>(Lb/c/b/c$a;ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/c$a$e;->f:Lb/c/b/c$a;

    iput p2, p0, Lb/c/b/c$a$e;->b:I

    iput-object p3, p0, Lb/c/b/c$a$e;->c:Landroid/net/Uri;

    iput-boolean p4, p0, Lb/c/b/c$a$e;->d:Z

    iput-object p5, p0, Lb/c/b/c$a$e;->e:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lb/c/b/c$a$e;->f:Lb/c/b/c$a;

    iget-object v0, v0, Lb/c/b/c$a;->b:Lb/c/b/b;

    iget v1, p0, Lb/c/b/c$a$e;->b:I

    iget-object v2, p0, Lb/c/b/c$a$e;->c:Landroid/net/Uri;

    iget-boolean v3, p0, Lb/c/b/c$a$e;->d:Z

    iget-object v4, p0, Lb/c/b/c$a$e;->e:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3, v4}, Lb/c/b/b;->onRelationshipValidationResult(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    return-void
.end method
