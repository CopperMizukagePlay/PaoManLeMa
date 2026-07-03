package p160v;

import p001a0.C0031h1;
import p019c1.C0367k;
import p039e5.C1414x1;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.q0 */
/* loaded from: classes.dex */
public final class C3431q0 {

    /* renamed from: a */
    public final InterfaceC3279c f16606a;

    /* renamed from: b */
    public final C1414x1 f16607b = new C1414x1(1);

    /* renamed from: c */
    public C0031h1 f16608c;

    public C3431q0(C0367k c0367k) {
        this.f16606a = c0367k;
    }

    /* renamed from: a */
    public final InterfaceC3429p0 m5184a(int i7, long j6) {
        C0031h1 c0031h1 = this.f16608c;
        if (c0031h1 != null) {
            C3398a1 c3398a1 = new C3398a1(c0031h1, i7, j6, this.f16607b);
            RunnableC3399b runnableC3399b = (RunnableC3399b) c0031h1.f154h;
            runnableC3399b.f16517f.m4300b(c3398a1);
            if (!runnableC3399b.f16518g) {
                runnableC3399b.f16518g = true;
                runnableC3399b.f16516e.post(runnableC3399b);
            }
            return c3398a1;
        }
        return C3410g.f16543a;
    }
}
