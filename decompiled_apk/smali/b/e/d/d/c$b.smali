.class public final Lb/e/d/d/c$b;
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
    name = "b"
.end annotation


# instance fields
.field private final a:[Lb/e/d/d/c$c;


# direct methods
.method public constructor <init>([Lb/e/d/d/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/e/d/d/c$b;->a:[Lb/e/d/d/c$c;

    return-void
.end method


# virtual methods
.method public a()[Lb/e/d/d/c$c;
    .locals 1

    iget-object v0, p0, Lb/e/d/d/c$b;->a:[Lb/e/d/d/c$c;

    return-object v0
.end method
