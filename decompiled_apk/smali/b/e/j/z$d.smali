.class Lb/e/j/z$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Lb/e/j/z;


# direct methods
.method constructor <init>()V
    .locals 2

    new-instance v0, Lb/e/j/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/e/j/z;-><init>(Lb/e/j/z;)V

    invoke-direct {p0, v0}, Lb/e/j/z$d;-><init>(Lb/e/j/z;)V

    return-void
.end method

.method constructor <init>(Lb/e/j/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e/j/z$d;->a:Lb/e/j/z;

    return-void
.end method


# virtual methods
.method a()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$d;->a:Lb/e/j/z;

    return-object v0
.end method

.method b(Lb/e/e/b;)V
    .locals 0

    return-void
.end method

.method c(Lb/e/e/b;)V
    .locals 0

    return-void
.end method
