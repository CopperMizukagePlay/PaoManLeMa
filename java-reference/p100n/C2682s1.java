package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.s1 */
/* loaded from: classes.dex */
public final class C2682s1 implements InterfaceC2670o1 {

    /* renamed from: e */
    public final InterfaceC2676q1 f14417e;

    /* renamed from: f */
    public final long f14418f;

    /* renamed from: g */
    public final long f14419g;

    public C2682s1(InterfaceC2676q1 interfaceC2676q1, long j6) {
        this.f14417e = interfaceC2676q1;
        this.f14418f = (interfaceC2676q1.mo632p() + interfaceC2676q1.mo628k()) * 1000000;
        this.f14419g = j6 * 1000000;
    }

    /* renamed from: a */
    public final long m4292a(long j6) {
        long j7 = j6 + this.f14419g;
        if (j7 <= 0) {
            return 0L;
        }
        long j8 = this.f14418f;
        return j7 - ((j7 / j8) * j8);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: b */
    public final boolean mo4274b() {
        return true;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: c */
    public final long mo4095c(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return Long.MAX_VALUE;
    }

    /* renamed from: d */
    public final AbstractC2674q m4293d(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        long j7 = this.f14419g;
        long j8 = j6 + j7;
        long j9 = this.f14418f;
        if (j8 > j9) {
            return this.f14417e.mo630n(j9 - j7, abstractC2674q, abstractC2674q3, abstractC2674q2);
        }
        return abstractC2674q2;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public final AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return this.f14417e.mo630n(m4292a(j6), abstractC2674q, abstractC2674q2, m4293d(j6, abstractC2674q, abstractC2674q3, abstractC2674q2));
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public final AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return this.f14417e.mo631o(m4292a(j6), abstractC2674q, abstractC2674q2, m4293d(j6, abstractC2674q, abstractC2674q3, abstractC2674q2));
    }
}
