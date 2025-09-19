.class public abstract Lio/flutter/plugin/platform/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final createArgsCodec:Ld/a/c/a/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/c/a/g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld/a/c/a/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/c/a/g<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/g;->createArgsCodec:Ld/a/c/a/g;

    return-void
.end method


# virtual methods
.method public abstract create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/f;
.end method

.method public final getCreateArgsCodec()Ld/a/c/a/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld/a/c/a/g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugin/platform/g;->createArgsCodec:Ld/a/c/a/g;

    return-object v0
.end method
