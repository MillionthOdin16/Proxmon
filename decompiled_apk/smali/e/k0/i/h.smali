.class public final Le/k0/i/h;
.super Le/h0;
.source ""


# instance fields
.field private final b:J

.field private final c:Lf/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLf/e;)V
    .locals 0

    invoke-direct {p0}, Le/h0;-><init>()V

    iput-wide p2, p0, Le/k0/i/h;->b:J

    iput-object p4, p0, Le/k0/i/h;->c:Lf/e;

    return-void
.end method


# virtual methods
.method public B()J
    .locals 2

    iget-wide v0, p0, Le/k0/i/h;->b:J

    return-wide v0
.end method

.method public E()Lf/e;
    .locals 1

    iget-object v0, p0, Le/k0/i/h;->c:Lf/e;

    return-object v0
.end method
