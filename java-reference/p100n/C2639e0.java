package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.e0 */
/* loaded from: classes.dex */
public final class C2639e0 implements InterfaceC2656k {

    /* renamed from: a */
    public final InterfaceC2695x f14293a;

    /* renamed from: b */
    public final long f14294b;

    public C2639e0(InterfaceC2695x interfaceC2695x, long j6) {
        this.f14293a = interfaceC2695x;
        this.f14294b = j6;
    }

    @Override // p100n.InterfaceC2656k
    /* renamed from: a */
    public final InterfaceC2670o1 mo4196a(C2664m1 c2664m1) {
        return new C2682s1(this.f14293a.mo4196a(c2664m1), this.f14294b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2639e0) {
            C2639e0 c2639e0 = (C2639e0) obj;
            if (c2639e0.f14293a.equals(this.f14293a) && c2639e0.f14294b == this.f14294b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14294b) + ((AbstractC2647h.m4257c(1) + (this.f14293a.hashCode() * 31)) * 31);
    }
}
