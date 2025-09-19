.class public final synthetic Le/d;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Le/v$b;


# instance fields
.field public final synthetic a:Le/v;


# direct methods
.method public synthetic constructor <init>(Le/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/d;->a:Le/v;

    return-void
.end method


# virtual methods
.method public final a(Le/j;)Le/v;
    .locals 1

    iget-object v0, p0, Le/d;->a:Le/v;

    invoke-static {v0, p1}, Le/v;->l(Le/v;Le/j;)Le/v;

    move-result-object p1

    return-object p1
.end method
