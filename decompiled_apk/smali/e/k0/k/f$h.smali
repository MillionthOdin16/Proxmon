.class public Le/k0/k/f$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field a:Ljava/net/Socket;

.field b:Ljava/lang/String;

.field c:Lf/e;

.field d:Lf/d;

.field e:Le/k0/k/f$j;

.field f:Le/k0/k/l;

.field g:Z

.field h:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le/k0/k/f$j;->a:Le/k0/k/f$j;

    iput-object v0, p0, Le/k0/k/f$h;->e:Le/k0/k/f$j;

    sget-object v0, Le/k0/k/l;->a:Le/k0/k/l;

    iput-object v0, p0, Le/k0/k/f$h;->f:Le/k0/k/l;

    iput-boolean p1, p0, Le/k0/k/f$h;->g:Z

    return-void
.end method


# virtual methods
.method public a()Le/k0/k/f;
    .locals 1

    new-instance v0, Le/k0/k/f;

    invoke-direct {v0, p0}, Le/k0/k/f;-><init>(Le/k0/k/f$h;)V

    return-object v0
.end method

.method public b(Le/k0/k/f$j;)Le/k0/k/f$h;
    .locals 0

    iput-object p1, p0, Le/k0/k/f$h;->e:Le/k0/k/f$j;

    return-object p0
.end method

.method public c(I)Le/k0/k/f$h;
    .locals 0

    iput p1, p0, Le/k0/k/f$h;->h:I

    return-object p0
.end method

.method public d(Ljava/net/Socket;Ljava/lang/String;Lf/e;Lf/d;)Le/k0/k/f$h;
    .locals 0

    iput-object p1, p0, Le/k0/k/f$h;->a:Ljava/net/Socket;

    iput-object p2, p0, Le/k0/k/f$h;->b:Ljava/lang/String;

    iput-object p3, p0, Le/k0/k/f$h;->c:Lf/e;

    iput-object p4, p0, Le/k0/k/f$h;->d:Lf/d;

    return-object p0
.end method
