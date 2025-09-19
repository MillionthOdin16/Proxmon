.class Lb/l/k/m$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/l/k/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static final a:Lb/l/k/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lb/l/k/m;->a()Lb/l/k/o;

    move-result-object v0

    sput-object v0, Lb/l/k/m$b;->a:Lb/l/k/o;

    return-void
.end method
