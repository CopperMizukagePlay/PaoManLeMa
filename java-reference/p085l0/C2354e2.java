package p085l0;

import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.e2 */
/* loaded from: classes.dex */
public final class C2354e2 extends AbstractC3451a0 {

    /* renamed from: c */
    public float f13393c;

    public C2354e2(float f7, long j6) {
        super(j6);
        this.f13393c = f7;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f13393c = ((C2354e2) abstractC3451a0).f13393c;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C2354e2(this.f13393c, j6);
    }
}
