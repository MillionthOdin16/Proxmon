.class public final Lb/e/j/z$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lb/e/j/z$d;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lb/e/j/z$c;

    invoke-direct {v0}, Lb/e/j/z$c;-><init>()V

    :goto_0
    iput-object v0, p0, Lb/e/j/z$a;->a:Lb/e/j/z$d;

    goto :goto_1

    :cond_0
    const/16 v1, 0x14

    if-lt v0, v1, :cond_1

    new-instance v0, Lb/e/j/z$b;

    invoke-direct {v0}, Lb/e/j/z$b;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Lb/e/j/z$d;

    invoke-direct {v0}, Lb/e/j/z$d;-><init>()V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(Lb/e/j/z;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lb/e/j/z$c;

    invoke-direct {v0, p1}, Lb/e/j/z$c;-><init>(Lb/e/j/z;)V

    :goto_0
    iput-object v0, p0, Lb/e/j/z$a;->a:Lb/e/j/z$d;

    goto :goto_1

    :cond_0
    const/16 v1, 0x14

    if-lt v0, v1, :cond_1

    new-instance v0, Lb/e/j/z$b;

    invoke-direct {v0, p1}, Lb/e/j/z$b;-><init>(Lb/e/j/z;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lb/e/j/z$d;

    invoke-direct {v0, p1}, Lb/e/j/z$d;-><init>(Lb/e/j/z;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$a;->a:Lb/e/j/z$d;

    invoke-virtual {v0}, Lb/e/j/z$d;->a()Lb/e/j/z;

    move-result-object v0

    return-object v0
.end method

.method public b(Lb/e/e/b;)Lb/e/j/z$a;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$a;->a:Lb/e/j/z$d;

    invoke-virtual {v0, p1}, Lb/e/j/z$d;->b(Lb/e/e/b;)V

    return-object p0
.end method

.method public c(Lb/e/e/b;)Lb/e/j/z$a;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$a;->a:Lb/e/j/z$d;

    invoke-virtual {v0, p1}, Lb/e/j/z$d;->c(Lb/e/e/b;)V

    return-object p0
.end method
