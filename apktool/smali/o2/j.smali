.class public final Lo2/j;
.super Ljava/lang/Object;
.source "r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047"


# static fields
.field public static final a:Ln/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln/p1;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ln/p1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lm3/j;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ln/p1;->q()Ll0/n2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iput-object v1, v0, Ln/p1;->f:Ljava/lang/Object;

    .line 20
    .line 21
    sput-object v0, Lo2/j;->a:Ln/p1;

    .line 22
    .line 23
    return-void
.end method
