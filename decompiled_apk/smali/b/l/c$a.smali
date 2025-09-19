.class Lb/l/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/l/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lb/l/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/l/k/f;

    invoke-direct {v0}, Lb/l/k/f;-><init>()V

    sput-object v0, Lb/l/c$a;->a:Lb/l/c;

    return-void
.end method
