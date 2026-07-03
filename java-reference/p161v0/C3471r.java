package p161v0;

import p108o0.InterfaceC2794d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.r */
/* loaded from: classes.dex */
public final class C3471r extends AbstractC3451a0 {

    /* renamed from: c */
    public InterfaceC2794d f16735c;

    /* renamed from: d */
    public int f16736d;

    public C3471r(long j6, InterfaceC2794d interfaceC2794d) {
        super(j6);
        this.f16735c = interfaceC2794d;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C3471r c3471r = (C3471r) abstractC3451a0;
        synchronized (AbstractC3470q.f16734b) {
            this.f16735c = c3471r.f16735c;
            this.f16736d = c3471r.f16736d;
        }
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C3471r(j6, this.f16735c);
    }
}
