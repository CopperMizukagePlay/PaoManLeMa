package p161v0;

import p116p0.AbstractC2834c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.v */
/* loaded from: classes.dex */
public final class C3475v extends AbstractC3451a0 {

    /* renamed from: c */
    public AbstractC2834c f16763c;

    /* renamed from: d */
    public int f16764d;

    /* renamed from: e */
    public int f16765e;

    public C3475v(long j6, AbstractC2834c abstractC2834c) {
        super(j6);
        this.f16763c = abstractC2834c;
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: a */
    public final void mo3737a(AbstractC3451a0 abstractC3451a0) {
        synchronized (AbstractC3470q.f16733a) {
            AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f16763c = ((C3475v) abstractC3451a0).f16763c;
            this.f16764d = ((C3475v) abstractC3451a0).f16764d;
            this.f16765e = ((C3475v) abstractC3451a0).f16765e;
        }
    }

    @Override // p161v0.AbstractC3451a0
    /* renamed from: b */
    public final AbstractC3451a0 mo3738b(long j6) {
        return new C3475v(j6, this.f16763c);
    }
}
