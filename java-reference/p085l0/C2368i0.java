package p085l0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.i0 */
/* loaded from: classes.dex */
public final class C2368i0 implements InterfaceC2402q2 {

    /* renamed from: a */
    public final C2361g1 f13410a;

    public C2368i0(C2361g1 c2361g1) {
        this.f13410a = c2361g1;
    }

    @Override // p085l0.InterfaceC2402q2
    /* renamed from: a */
    public final Object mo3724a(InterfaceC2385m1 interfaceC2385m1) {
        return this.f13410a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2368i0) || !this.f13410a.equals(((C2368i0) obj).f13410a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13410a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f13410a + ')';
    }
}
