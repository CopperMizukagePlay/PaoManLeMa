.class public final Lt4/l;
.super Ljava/lang/Object;
.source "r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047"


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lt4/l;->a:Z

    .line 5
    .line 6
    iput p1, p0, Lt4/l;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static a(I)Lt4/l;
    .locals 2

    .line 1
    new-instance v0, Lt4/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lt4/l;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static b(I)Lt4/l;
    .locals 2

    .line 1
    new-instance v0, Lt4/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lt4/l;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
