.class public final enum Le/c0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/c0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/c0;

.field public static final enum d:Le/c0;

.field public static final enum e:Le/c0;

.field public static final enum f:Le/c0;

.field public static final enum g:Le/c0;

.field public static final enum h:Le/c0;

.field private static final synthetic i:[Le/c0;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Le/c0;

    const-string v1, "HTTP_1_0"

    const/4 v2, 0x0

    const-string v3, "http/1.0"

    invoke-direct {v0, v1, v2, v3}, Le/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le/c0;->c:Le/c0;

    new-instance v0, Le/c0;

    const-string v1, "HTTP_1_1"

    const/4 v3, 0x1

    const-string v4, "http/1.1"

    invoke-direct {v0, v1, v3, v4}, Le/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le/c0;->d:Le/c0;

    new-instance v0, Le/c0;

    const-string v1, "SPDY_3"

    const/4 v4, 0x2

    const-string v5, "spdy/3.1"

    invoke-direct {v0, v1, v4, v5}, Le/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le/c0;->e:Le/c0;

    new-instance v0, Le/c0;

    const-string v1, "HTTP_2"

    const/4 v5, 0x3

    const-string v6, "h2"

    invoke-direct {v0, v1, v5, v6}, Le/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le/c0;->f:Le/c0;

    new-instance v0, Le/c0;

    const-string v1, "H2_PRIOR_KNOWLEDGE"

    const/4 v6, 0x4

    const-string v7, "h2_prior_knowledge"

    invoke-direct {v0, v1, v6, v7}, Le/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le/c0;->g:Le/c0;

    new-instance v0, Le/c0;

    const-string v1, "QUIC"

    const/4 v7, 0x5

    const-string v8, "quic"

    invoke-direct {v0, v1, v7, v8}, Le/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le/c0;->h:Le/c0;

    const/4 v1, 0x6

    new-array v1, v1, [Le/c0;

    sget-object v8, Le/c0;->c:Le/c0;

    aput-object v8, v1, v2

    sget-object v2, Le/c0;->d:Le/c0;

    aput-object v2, v1, v3

    sget-object v2, Le/c0;->e:Le/c0;

    aput-object v2, v1, v4

    sget-object v2, Le/c0;->f:Le/c0;

    aput-object v2, v1, v5

    sget-object v2, Le/c0;->g:Le/c0;

    aput-object v2, v1, v6

    aput-object v0, v1, v7

    sput-object v1, Le/c0;->i:[Le/c0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Le/c0;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Le/c0;
    .locals 7

    sget-object v0, Le/c0;->h:Le/c0;

    sget-object v1, Le/c0;->e:Le/c0;

    sget-object v2, Le/c0;->f:Le/c0;

    sget-object v3, Le/c0;->g:Le/c0;

    sget-object v4, Le/c0;->d:Le/c0;

    sget-object v5, Le/c0;->c:Le/c0;

    iget-object v6, v5, Le/c0;->b:Ljava/lang/String;

    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    return-object v5

    :cond_0
    iget-object v5, v4, Le/c0;->b:Ljava/lang/String;

    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v4

    :cond_1
    iget-object v4, v3, Le/c0;->b:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return-object v3

    :cond_2
    iget-object v3, v2, Le/c0;->b:Ljava/lang/String;

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    iget-object v2, v1, Le/c0;->b:Ljava/lang/String;

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v1

    :cond_4
    iget-object v1, v0, Le/c0;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected protocol: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/c0;
    .locals 1

    const-class v0, Le/c0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/c0;

    return-object p0
.end method

.method public static values()[Le/c0;
    .locals 1

    sget-object v0, Le/c0;->i:[Le/c0;

    invoke-virtual {v0}, [Le/c0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/c0;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/c0;->b:Ljava/lang/String;

    return-object v0
.end method
