package p100n;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.r0 */
/* loaded from: classes.dex */
public final class C2678r0 implements InterfaceC2656k {

    /* renamed from: a */
    public final InterfaceC2656k f14394a;

    /* renamed from: b */
    public final long f14395b;

    public C2678r0(InterfaceC2627a0 interfaceC2627a0, long j6) {
        this.f14394a = interfaceC2627a0;
        this.f14395b = j6;
    }

    @Override // p100n.InterfaceC2656k
    /* renamed from: a */
    public final InterfaceC2670o1 mo4196a(C2664m1 c2664m1) {
        return new C2681s0(this.f14394a.mo4196a(c2664m1), this.f14395b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2678r0)) {
            return false;
        }
        C2678r0 c2678r0 = (C2678r0) obj;
        if (c2678r0.f14395b != this.f14395b || !AbstractC3367j.m5096a(c2678r0.f14394a, this.f14394a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14395b) + (this.f14394a.hashCode() * 31);
    }
}
