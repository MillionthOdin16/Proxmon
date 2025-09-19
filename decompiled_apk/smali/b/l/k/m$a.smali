.class Lb/l/k/m$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/l/k/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lb/l/k/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb/l/k/t;

    invoke-static {}, Lb/l/k/m;->d()Lb/l/k/o;

    move-result-object v1

    invoke-interface {v1}, Lb/l/k/o;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/l/k/t;-><init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V

    sput-object v0, Lb/l/k/m$a;->a:Lb/l/k/t;

    return-void
.end method
