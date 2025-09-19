.class public final Le/k0/h/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/z;


# direct methods
.method public constructor <init>(Le/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/z$a;)Le/g0;
    .locals 5

    move-object v0, p1

    check-cast v0, Le/k0/i/g;

    invoke-virtual {v0}, Le/k0/i/g;->c()Le/e0;

    move-result-object v1

    invoke-virtual {v0}, Le/k0/i/g;->h()Le/k0/h/k;

    move-result-object v2

    invoke-virtual {v1}, Le/e0;->f()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GET"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, p1, v3}, Le/k0/h/k;->k(Le/z$a;Z)Le/k0/h/d;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Le/k0/i/g;->g(Le/e0;Le/k0/h/k;Le/k0/h/d;)Le/g0;

    move-result-object p1

    return-object p1
.end method
