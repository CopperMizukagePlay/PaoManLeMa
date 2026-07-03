package p085l0;

import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.g2 */
/* loaded from: classes.dex */
public final class C2362g2 extends AbstractC3451a0 {

    /* renamed from: c */
    public long f13403c;

    public C2362g2(long j6, long j7) {
        super(j6);
        this.f13403c = j7;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f13403c = ((C2362g2) abstractC3451a0).f13403c;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C2362g2(j6, this.f13403c);
    }
}
