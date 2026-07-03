package p100n;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.s0 */
/* loaded from: classes.dex */
public final class C2681s0 implements InterfaceC2670o1 {

    /* renamed from: e */
    public final InterfaceC2670o1 f14415e;

    /* renamed from: f */
    public final long f14416f;

    public C2681s0(InterfaceC2670o1 interfaceC2670o1, long j6) {
        this.f14415e = interfaceC2670o1;
        this.f14416f = j6;
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: b */
    public final boolean mo4274b() {
        return this.f14415e.mo4274b();
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: c */
    public final long mo4095c(AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        return this.f14415e.mo4095c(abstractC2674q, abstractC2674q2, abstractC2674q3) + this.f14416f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2681s0)) {
            return false;
        }
        C2681s0 c2681s0 = (C2681s0) obj;
        if (c2681s0.f14416f != this.f14416f || !AbstractC3367j.m5096a(c2681s0.f14415e, this.f14415e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14416f) + (this.f14415e.hashCode() * 31);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: n */
    public final AbstractC2674q mo630n(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        long j7 = this.f14416f;
        if (j6 < j7) {
            return abstractC2674q3;
        }
        return this.f14415e.mo630n(j6 - j7, abstractC2674q, abstractC2674q2, abstractC2674q3);
    }

    @Override // p100n.InterfaceC2670o1
    /* renamed from: o */
    public final AbstractC2674q mo631o(long j6, AbstractC2674q abstractC2674q, AbstractC2674q abstractC2674q2, AbstractC2674q abstractC2674q3) {
        long j7 = this.f14416f;
        if (j6 < j7) {
            return abstractC2674q;
        }
        return this.f14415e.mo631o(j6 - j7, abstractC2674q, abstractC2674q2, abstractC2674q3);
    }
}
