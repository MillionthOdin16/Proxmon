.class public Lb/e/j/z;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/e/j/z$c;,
        Lb/e/j/z$b;,
        Lb/e/j/z$d;,
        Lb/e/j/z$a;,
        Lb/e/j/z$h;,
        Lb/e/j/z$g;,
        Lb/e/j/z$f;,
        Lb/e/j/z$e;,
        Lb/e/j/z$i;
    }
.end annotation


# static fields
.field public static final b:Lb/e/j/z;


# instance fields
.field private final a:Lb/e/j/z$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/e/j/z$a;

    invoke-direct {v0}, Lb/e/j/z$a;-><init>()V

    invoke-virtual {v0}, Lb/e/j/z$a;->a()Lb/e/j/z;

    move-result-object v0

    invoke-virtual {v0}, Lb/e/j/z;->a()Lb/e/j/z;

    move-result-object v0

    invoke-virtual {v0}, Lb/e/j/z;->b()Lb/e/j/z;

    move-result-object v0

    invoke-virtual {v0}, Lb/e/j/z;->c()Lb/e/j/z;

    move-result-object v0

    sput-object v0, Lb/e/j/z;->b:Lb/e/j/z;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lb/e/j/z$h;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$h;-><init>(Lb/e/j/z;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, Lb/e/j/z$g;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$g;-><init>(Lb/e/j/z;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    new-instance v0, Lb/e/j/z$f;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$f;-><init>(Lb/e/j/z;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x14

    if-lt v0, v1, :cond_3

    new-instance v0, Lb/e/j/z$e;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$e;-><init>(Lb/e/j/z;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_3
    new-instance p1, Lb/e/j/z$i;

    invoke-direct {p1, p0}, Lb/e/j/z$i;-><init>(Lb/e/j/z;)V

    iput-object p1, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    :goto_1
    return-void
.end method

.method public constructor <init>(Lb/e/j/z;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    iget-object p1, p1, Lb/e/j/z;->a:Lb/e/j/z$i;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    instance-of v0, p1, Lb/e/j/z$h;

    if-eqz v0, :cond_0

    new-instance v0, Lb/e/j/z$h;

    check-cast p1, Lb/e/j/z$h;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$h;-><init>(Lb/e/j/z;Lb/e/j/z$h;)V

    :goto_0
    iput-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    goto :goto_2

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    instance-of v0, p1, Lb/e/j/z$g;

    if-eqz v0, :cond_1

    new-instance v0, Lb/e/j/z$g;

    check-cast p1, Lb/e/j/z$g;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$g;-><init>(Lb/e/j/z;Lb/e/j/z$g;)V

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    instance-of v0, p1, Lb/e/j/z$f;

    if-eqz v0, :cond_2

    new-instance v0, Lb/e/j/z$f;

    check-cast p1, Lb/e/j/z$f;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$f;-><init>(Lb/e/j/z;Lb/e/j/z$f;)V

    goto :goto_0

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_3

    instance-of v0, p1, Lb/e/j/z$e;

    if-eqz v0, :cond_3

    new-instance v0, Lb/e/j/z$e;

    check-cast p1, Lb/e/j/z$e;

    invoke-direct {v0, p0, p1}, Lb/e/j/z$e;-><init>(Lb/e/j/z;Lb/e/j/z$e;)V

    goto :goto_0

    :cond_3
    new-instance p1, Lb/e/j/z$i;

    invoke-direct {p1, p0}, Lb/e/j/z$i;-><init>(Lb/e/j/z;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lb/e/j/z$i;

    invoke-direct {p1, p0}, Lb/e/j/z$i;-><init>(Lb/e/j/z;)V

    :goto_1
    iput-object p1, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    :goto_2
    return-void
.end method

.method static j(Lb/e/e/b;IIII)Lb/e/e/b;
    .locals 5

    iget v0, p0, Lb/e/e/b;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lb/e/e/b;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lb/e/e/b;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lb/e/e/b;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lb/e/e/b;->a(IIII)Lb/e/e/b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/view/WindowInsets;)Lb/e/j/z;
    .locals 1

    new-instance v0, Lb/e/j/z;

    invoke-static {p0}, Lb/e/i/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, Lb/e/j/z;-><init>(Landroid/view/WindowInsets;)V

    return-object v0
.end method


# virtual methods
.method public a()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    invoke-virtual {v0}, Lb/e/j/z$i;->a()Lb/e/j/z;

    move-result-object v0

    return-object v0
.end method

.method public b()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    invoke-virtual {v0}, Lb/e/j/z$i;->b()Lb/e/j/z;

    move-result-object v0

    return-object v0
.end method

.method public c()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    invoke-virtual {v0}, Lb/e/j/z$i;->c()Lb/e/j/z;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    invoke-virtual {p0}, Lb/e/j/z;->h()Lb/e/e/b;

    move-result-object v0

    iget v0, v0, Lb/e/e/b;->d:I

    return v0
.end method

.method public e()I
    .locals 1

    invoke-virtual {p0}, Lb/e/j/z;->h()Lb/e/e/b;

    move-result-object v0

    iget v0, v0, Lb/e/e/b;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lb/e/j/z;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lb/e/j/z;

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    iget-object p1, p1, Lb/e/j/z;->a:Lb/e/j/z$i;

    invoke-static {v0, p1}, Lb/e/i/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Lb/e/j/z;->h()Lb/e/e/b;

    move-result-object v0

    iget v0, v0, Lb/e/e/b;->c:I

    return v0
.end method

.method public g()I
    .locals 1

    invoke-virtual {p0}, Lb/e/j/z;->h()Lb/e/e/b;

    move-result-object v0

    iget v0, v0, Lb/e/e/b;->b:I

    return v0
.end method

.method public h()Lb/e/e/b;
    .locals 1

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    invoke-virtual {v0}, Lb/e/j/z$i;->f()Lb/e/e/b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/e/j/z$i;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i(IIII)Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    invoke-virtual {v0, p1, p2, p3, p4}, Lb/e/j/z$i;->g(IIII)Lb/e/j/z;

    move-result-object p1

    return-object p1
.end method

.method public k(IIII)Lb/e/j/z;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lb/e/j/z$a;

    invoke-direct {v0, p0}, Lb/e/j/z$a;-><init>(Lb/e/j/z;)V

    invoke-static {p1, p2, p3, p4}, Lb/e/e/b;->a(IIII)Lb/e/e/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb/e/j/z$a;->c(Lb/e/e/b;)Lb/e/j/z$a;

    invoke-virtual {v0}, Lb/e/j/z$a;->a()Lb/e/j/z;

    move-result-object p1

    return-object p1
.end method

.method public l()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, Lb/e/j/z;->a:Lb/e/j/z$i;

    instance-of v1, v0, Lb/e/j/z$e;

    if-eqz v1, :cond_0

    check-cast v0, Lb/e/j/z$e;

    iget-object v0, v0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
