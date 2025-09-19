.class public final Lc/b/a/a/a/a/v;
.super Lc/b/a/a/a/a/u;
.source ""


# instance fields
.field private final b:Lc/b/a/a/a/a/u;

.field private final c:J

.field private final d:J


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/u;JJ)V
    .locals 0

    invoke-direct {p0}, Lc/b/a/a/a/a/u;-><init>()V

    iput-object p1, p0, Lc/b/a/a/a/a/v;->b:Lc/b/a/a/a/a/u;

    invoke-direct {p0, p2, p3}, Lc/b/a/a/a/a/v;->C(J)J

    move-result-wide p1

    iput-wide p1, p0, Lc/b/a/a/a/a/v;->c:J

    add-long/2addr p1, p4

    invoke-direct {p0, p1, p2}, Lc/b/a/a/a/a/v;->C(J)J

    move-result-wide p1

    iput-wide p1, p0, Lc/b/a/a/a/a/v;->d:J

    return-void
.end method

.method private final C(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lc/b/a/a/a/a/v;->b:Lc/b/a/a/a/a/u;

    invoke-virtual {v0}, Lc/b/a/a/a/a/u;->r()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    iget-object p1, p0, Lc/b/a/a/a/a/v;->b:Lc/b/a/a/a/a/u;

    invoke-virtual {p1}, Lc/b/a/a/a/a/u;->r()J

    move-result-wide p1

    :cond_1
    return-wide p1
.end method


# virtual methods
.method protected final A(JJ)Ljava/io/InputStream;
    .locals 1

    iget-wide p1, p0, Lc/b/a/a/a/a/v;->c:J

    invoke-direct {p0, p1, p2}, Lc/b/a/a/a/a/v;->C(J)J

    move-result-wide p1

    add-long/2addr p3, p1

    invoke-direct {p0, p3, p4}, Lc/b/a/a/a/a/v;->C(J)J

    move-result-wide p3

    iget-object v0, p0, Lc/b/a/a/a/a/v;->b:Lc/b/a/a/a/a/u;

    sub-long/2addr p3, p1

    invoke-virtual {v0, p1, p2, p3, p4}, Lc/b/a/a/a/a/u;->A(JJ)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final r()J
    .locals 4

    iget-wide v0, p0, Lc/b/a/a/a/a/v;->d:J

    iget-wide v2, p0, Lc/b/a/a/a/a/v;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
