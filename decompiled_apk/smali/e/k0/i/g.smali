.class public final Le/k0/i/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/z$a;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/z;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Le/k0/h/k;

.field private final c:Le/k0/h/d;

.field private final d:I

.field private final e:Le/e0;

.field private final f:Le/j;

.field private final g:I

.field private final h:I

.field private final i:I

.field private j:I


# direct methods
.method public constructor <init>(Ljava/util/List;Le/k0/h/k;Le/k0/h/d;ILe/e0;Le/j;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/z;",
            ">;",
            "Le/k0/h/k;",
            "Le/k0/h/d;",
            "I",
            "Le/e0;",
            "Le/j;",
            "III)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k0/i/g;->a:Ljava/util/List;

    iput-object p2, p0, Le/k0/i/g;->b:Le/k0/h/k;

    iput-object p3, p0, Le/k0/i/g;->c:Le/k0/h/d;

    iput p4, p0, Le/k0/i/g;->d:I

    iput-object p5, p0, Le/k0/i/g;->e:Le/e0;

    iput-object p6, p0, Le/k0/i/g;->f:Le/j;

    iput p7, p0, Le/k0/i/g;->g:I

    iput p8, p0, Le/k0/i/g;->h:I

    iput p9, p0, Le/k0/i/g;->i:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Le/k0/i/g;->i:I

    return v0
.end method

.method public b(Le/e0;)Le/g0;
    .locals 2

    iget-object v0, p0, Le/k0/i/g;->b:Le/k0/h/k;

    iget-object v1, p0, Le/k0/i/g;->c:Le/k0/h/d;

    invoke-virtual {p0, p1, v0, v1}, Le/k0/i/g;->g(Le/e0;Le/k0/h/k;Le/k0/h/d;)Le/g0;

    move-result-object p1

    return-object p1
.end method

.method public c()Le/e0;
    .locals 1

    iget-object v0, p0, Le/k0/i/g;->e:Le/e0;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Le/k0/i/g;->g:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Le/k0/i/g;->h:I

    return v0
.end method

.method public f()Le/k0/h/d;
    .locals 1

    iget-object v0, p0, Le/k0/i/g;->c:Le/k0/h/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public g(Le/e0;Le/k0/h/k;Le/k0/h/d;)Le/g0;
    .locals 15

    move-object v0, p0

    iget v1, v0, Le/k0/i/g;->d:I

    iget-object v2, v0, Le/k0/i/g;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    iget v1, v0, Le/k0/i/g;->j:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Le/k0/i/g;->j:I

    iget-object v1, v0, Le/k0/i/g;->c:Le/k0/h/d;

    const-string v3, "network interceptor "

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Le/k0/h/d;->c()Le/k0/h/f;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Le/e0;->h()Le/y;

    move-result-object v4

    invoke-virtual {v1, v4}, Le/k0/h/f;->u(Le/y;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Le/k0/i/g;->a:Ljava/util/List;

    iget v5, v0, Le/k0/i/g;->d:I

    sub-int/2addr v5, v2

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " must retain the same host and port"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v1, v0, Le/k0/i/g;->c:Le/k0/h/d;

    const-string v4, " must call proceed() exactly once"

    if-eqz v1, :cond_3

    iget v1, v0, Le/k0/i/g;->j:I

    if-gt v1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Le/k0/i/g;->a:Ljava/util/List;

    iget v6, v0, Le/k0/i/g;->d:I

    sub-int/2addr v6, v2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    new-instance v1, Le/k0/i/g;

    iget-object v6, v0, Le/k0/i/g;->a:Ljava/util/List;

    iget v5, v0, Le/k0/i/g;->d:I

    add-int/lit8 v9, v5, 0x1

    iget-object v11, v0, Le/k0/i/g;->f:Le/j;

    iget v12, v0, Le/k0/i/g;->g:I

    iget v13, v0, Le/k0/i/g;->h:I

    iget v14, v0, Le/k0/i/g;->i:I

    move-object v5, v1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v10, p1

    invoke-direct/range {v5 .. v14}, Le/k0/i/g;-><init>(Ljava/util/List;Le/k0/h/k;Le/k0/h/d;ILe/e0;Le/j;III)V

    iget-object v5, v0, Le/k0/i/g;->a:Ljava/util/List;

    iget v6, v0, Le/k0/i/g;->d:I

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/z;

    invoke-interface {v5, v1}, Le/z;->a(Le/z$a;)Le/g0;

    move-result-object v6

    if-eqz p3, :cond_5

    iget v7, v0, Le/k0/i/g;->d:I

    add-int/2addr v7, v2

    iget-object v8, v0, Le/k0/i/g;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_5

    iget v1, v1, Le/k0/i/g;->j:I

    if-ne v1, v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_2
    const-string v1, "interceptor "

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Le/g0;->r()Le/h0;

    move-result-object v2

    if-eqz v2, :cond_6

    return-object v6

    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned a response with no body"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned null"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method

.method public h()Le/k0/h/k;
    .locals 1

    iget-object v0, p0, Le/k0/i/g;->b:Le/k0/h/k;

    return-object v0
.end method
