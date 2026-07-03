package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.v1 */
/* loaded from: classes.dex */
public final class C2691v1 implements InterfaceC2676q1 {

    /* renamed from: e */
    public final int f14461e;

    public C2691v1(int i7) {
        this.f14461e = i7;
    }

    @Override // p100n.InterfaceC2676q1
    /* renamed from: k */
    public final int mo628k() {
        return this.f14461e;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public final AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        if (j6 < this.f14461e * 1000000) {
            return abstractC2674q;
        }
        return abstractC2674q2;
    }

    @Override // p100n.InterfaceC2676q1
    /* renamed from: p */
    public final int mo632p() {
        return 0;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public final AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return abstractC2674q3;
    }
}
