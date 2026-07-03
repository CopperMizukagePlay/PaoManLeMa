package p085l0;

import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.f2 */
/* loaded from: classes.dex */
public final class C2358f2 extends AbstractC3451a0 {

    /* renamed from: c */
    public int f13397c;

    public C2358f2(int i7, long j6) {
        super(j6);
        this.f13397c = i7;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f13397c = ((C2358f2) abstractC3451a0).f13397c;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C2358f2(this.f13397c, j6);
    }
}
