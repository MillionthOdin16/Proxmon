.class Lb/e/g/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/g/b;->g(Landroid/content/Context;Lb/e/g/a;Lb/e/d/d/f$a;Landroid/os/Handler;ZII)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lb/e/g/b$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lb/e/g/a;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lb/e/g/a;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb/e/g/b$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lb/e/g/b$a;->b:Lb/e/g/a;

    iput p3, p0, Lb/e/g/b$a;->c:I

    iput-object p4, p0, Lb/e/g/b$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb/e/g/b$g;
    .locals 4

    iget-object v0, p0, Lb/e/g/b$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lb/e/g/b$a;->b:Lb/e/g/a;

    iget v2, p0, Lb/e/g/b$a;->c:I

    invoke-static {v0, v1, v2}, Lb/e/g/b;->f(Landroid/content/Context;Lb/e/g/a;I)Lb/e/g/b$g;

    move-result-object v0

    iget-object v1, v0, Lb/e/g/b$g;->a:Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    sget-object v2, Lb/e/g/b;->a:Lb/d/e;

    iget-object v3, p0, Lb/e/g/b$a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lb/d/e;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb/e/g/b$a;->a()Lb/e/g/b$g;

    move-result-object v0

    return-object v0
.end method
