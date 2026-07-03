package p100n;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.i0 */
/* loaded from: classes.dex */
public final class C2651i0 {

    /* renamed from: a */
    public final Float f14328a;

    /* renamed from: b */
    public InterfaceC2697y f14329b;

    public C2651i0(Float f7, InterfaceC2697y interfaceC2697y) {
        this.f14328a = f7;
        this.f14329b = interfaceC2697y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2651i0) {
            C2651i0 c2651i0 = (C2651i0) obj;
            if (c2651i0.f14328a.equals(this.f14328a) && AbstractC3367j.m5096a(c2651i0.f14329b, this.f14329b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14329b.hashCode() + AbstractC2647h.m4255a(0, this.f14328a.hashCode() * 31, 31);
    }
}
