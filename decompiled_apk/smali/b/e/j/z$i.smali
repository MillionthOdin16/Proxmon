.class Lb/e/j/z$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# instance fields
.field final a:Lb/e/j/z;


# direct methods
.method constructor <init>(Lb/e/j/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e/j/z$i;->a:Lb/e/j/z;

    return-void
.end method


# virtual methods
.method a()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$i;->a:Lb/e/j/z;

    return-object v0
.end method

.method b()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$i;->a:Lb/e/j/z;

    return-object v0
.end method

.method c()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$i;->a:Lb/e/j/z;

    return-object v0
.end method

.method d()Lb/e/j/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method e()Lb/e/e/b;
    .locals 1

    sget-object v0, Lb/e/e/b;->e:Lb/e/e/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb/e/j/z$i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb/e/j/z$i;

    invoke-virtual {p0}, Lb/e/j/z$i;->i()Z

    move-result v1

    invoke-virtual {p1}, Lb/e/j/z$i;->i()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Lb/e/j/z$i;->h()Z

    move-result v1

    invoke-virtual {p1}, Lb/e/j/z$i;->h()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Lb/e/j/z$i;->f()Lb/e/e/b;

    move-result-object v1

    invoke-virtual {p1}, Lb/e/j/z$i;->f()Lb/e/e/b;

    move-result-object v3

    invoke-static {v1, v3}, Lb/e/i/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lb/e/j/z$i;->e()Lb/e/e/b;

    move-result-object v1

    invoke-virtual {p1}, Lb/e/j/z$i;->e()Lb/e/e/b;

    move-result-object v3

    invoke-static {v1, v3}, Lb/e/i/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lb/e/j/z$i;->d()Lb/e/j/c;

    move-result-object v1

    invoke-virtual {p1}, Lb/e/j/z$i;->d()Lb/e/j/c;

    move-result-object p1

    invoke-static {v1, p1}, Lb/e/i/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method f()Lb/e/e/b;
    .locals 1

    sget-object v0, Lb/e/e/b;->e:Lb/e/e/b;

    return-object v0
.end method

.method g(IIII)Lb/e/j/z;
    .locals 0

    sget-object p1, Lb/e/j/z;->b:Lb/e/j/z;

    return-object p1
.end method

.method h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lb/e/j/z$i;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/e/j/z$i;->h()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/e/j/z$i;->f()Lb/e/e/b;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/e/j/z$i;->e()Lb/e/e/b;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lb/e/j/z$i;->d()Lb/e/j/c;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lb/e/i/c;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
