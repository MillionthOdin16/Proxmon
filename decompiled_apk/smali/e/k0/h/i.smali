.class public final Le/k0/h/i;
.super Ljava/lang/RuntimeException;
.source ""


# instance fields
.field private b:Ljava/io/IOException;

.field private c:Ljava/io/IOException;


# direct methods
.method constructor <init>(Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Le/k0/h/i;->b:Ljava/io/IOException;

    iput-object p1, p0, Le/k0/h/i;->c:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method a(Ljava/io/IOException;)V
    .locals 1

    iget-object v0, p0, Le/k0/h/i;->b:Ljava/io/IOException;

    invoke-static {v0, p1}, Le/k0/e;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object p1, p0, Le/k0/h/i;->c:Ljava/io/IOException;

    return-void
.end method

.method public b()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, Le/k0/h/i;->b:Ljava/io/IOException;

    return-object v0
.end method

.method public c()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, Le/k0/h/i;->c:Ljava/io/IOException;

    return-object v0
.end method
