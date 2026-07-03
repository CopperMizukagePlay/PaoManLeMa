package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.o0 */
/* loaded from: classes.dex */
public final class C2669o0 implements InterfaceC2695x {

    /* renamed from: a */
    public final int f14377a;

    public C2669o0(int i7) {
        this.f14377a = i7;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2669o0) && ((C2669o0) obj).f14377a == this.f14377a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14377a;
    }

    @Override // p100n.InterfaceC2656k
    /* renamed from: a */
    public final InterfaceC2676q1 mo4196a(C2664m1 c2664m1) {
        return new C2691v1(this.f14377a);
    }
}
