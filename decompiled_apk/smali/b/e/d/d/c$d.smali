.class public final Lb/e/d/d/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/e/d/d/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/d/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Lb/e/g/a;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lb/e/g/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e/d/d/c$d;->a:Lb/e/g/a;

    iput p2, p0, Lb/e/d/d/c$d;->c:I

    iput p3, p0, Lb/e/d/d/c$d;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lb/e/d/d/c$d;->c:I

    return v0
.end method

.method public b()Lb/e/g/a;
    .locals 1

    iget-object v0, p0, Lb/e/d/d/c$d;->a:Lb/e/g/a;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lb/e/d/d/c$d;->b:I

    return v0
.end method
