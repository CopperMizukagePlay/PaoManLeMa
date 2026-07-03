package p085l0;

import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.b0 */
/* loaded from: classes.dex */
public final class C2340b0 implements InterfaceC2402q2 {

    /* renamed from: a */
    public final AbstractC3368k f13340a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2340b0(InterfaceC3279c interfaceC3279c) {
        this.f13340a = (AbstractC3368k) interfaceC3279c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.c, u5.k] */
    @Override // p085l0.InterfaceC2402q2
    /* renamed from: a */
    public final Object mo3724a(InterfaceC2385m1 interfaceC2385m1) {
        return this.f13340a.mo23f(interfaceC2385m1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2340b0) || !this.f13340a.equals(((C2340b0) obj).f13340a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13340a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f13340a + ')';
    }
}
