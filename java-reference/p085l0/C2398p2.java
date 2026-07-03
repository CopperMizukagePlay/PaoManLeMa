package p085l0;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.p2 */
/* loaded from: classes.dex */
public final class C2398p2 implements InterfaceC2402q2 {

    /* renamed from: a */
    public final Object f13520a;

    public C2398p2(Object obj) {
        this.f13520a = obj;
    }

    @Override // p085l0.InterfaceC2402q2
    /* renamed from: a */
    public final Object mo3724a(InterfaceC2385m1 interfaceC2385m1) {
        return this.f13520a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2398p2) && AbstractC3367j.m5096a(this.f13520a, ((C2398p2) obj).f13520a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13520a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f13520a + ')';
    }
}
