package p085l0;

import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;
import p161v0.AbstractC3465l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.h2 */
/* loaded from: classes.dex */
public final class C2366h2 extends AbstractC3451a0 {

    /* renamed from: c */
    public Object f13409c;

    public C2366h2(long j6, Object obj) {
        super(j6);
        this.f13409c = obj;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f13409c = ((C2366h2) abstractC3451a0).f13409c;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C2366h2(AbstractC3465l.m5244k().mo5221g(), this.f13409c);
    }
}
