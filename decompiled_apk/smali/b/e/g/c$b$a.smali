.class Lb/e/g/c$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/g/c$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lb/e/g/c$b;


# direct methods
.method constructor <init>(Lb/e/g/c$b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb/e/g/c$b$a;->c:Lb/e/g/c$b;

    iput-object p2, p0, Lb/e/g/c$b$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lb/e/g/c$b$a;->c:Lb/e/g/c$b;

    iget-object v0, v0, Lb/e/g/c$b;->d:Lb/e/g/c$d;

    iget-object v1, p0, Lb/e/g/c$b$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lb/e/g/c$d;->a(Ljava/lang/Object;)V

    return-void
.end method
