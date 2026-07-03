package p158u5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.n */
/* loaded from: classes.dex */
public final class C3371n implements InterfaceC3361d {

    /* renamed from: a */
    public final Class f16444a;

    public C3371n(Class cls) {
        this.f16444a = cls;
    }

    @Override // p158u5.InterfaceC3361d
    /* renamed from: a */
    public final Class mo5092a() {
        return this.f16444a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3371n) {
            if (AbstractC3367j.m5096a(this.f16444a, ((C3371n) obj).f16444a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16444a.hashCode();
    }

    public final String toString() {
        return this.f16444a + " (Kotlin reflection is not available)";
    }
}
