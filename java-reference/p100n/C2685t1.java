package p100n;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.t1 */
/* loaded from: classes.dex */
public final class C2685t1 {

    /* renamed from: a */
    public final AbstractC2674q f14424a;

    /* renamed from: b */
    public final InterfaceC2697y f14425b;

    public C2685t1(AbstractC2674q abstractC2674q, InterfaceC2697y interfaceC2697y) {
        this.f14424a = abstractC2674q;
        this.f14425b = interfaceC2697y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2685t1) {
            C2685t1 c2685t1 = (C2685t1) obj;
            if (AbstractC3367j.m5096a(this.f14424a, c2685t1.f14424a) && AbstractC3367j.m5096a(this.f14425b, c2685t1.f14425b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f14425b.hashCode() + (this.f14424a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f14424a + ", easing=" + this.f14425b + ", arcMode=ArcMode(value=0))";
    }
}
