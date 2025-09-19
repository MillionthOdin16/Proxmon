.class public final Le/o;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Le/k0/h/g;


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x5

    const-wide/16 v2, 0x5

    invoke-direct {p0, v1, v2, v3, v0}, Le/o;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le/k0/h/g;

    invoke-direct {v0, p1, p2, p3, p4}, Le/k0/h/g;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    iput-object v0, p0, Le/o;->a:Le/k0/h/g;

    return-void
.end method
