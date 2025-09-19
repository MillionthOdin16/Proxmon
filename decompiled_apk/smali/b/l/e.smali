.class public Lb/l/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/lang/String;

.field private b:[Lb/l/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lb/l/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lb/l/e;->b:[Lb/l/f;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/l/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()[Lb/l/f;
    .locals 1

    iget-object v0, p0, Lb/l/e;->b:[Lb/l/f;

    return-object v0
.end method
