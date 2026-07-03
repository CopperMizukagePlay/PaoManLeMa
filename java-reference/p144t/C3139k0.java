package p144t;

import p001a0.C0037j;
import p060h5.C1814v;
import p140s2.AbstractC3092b;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.k0 */
/* loaded from: classes.dex */
public final class C3139k0 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public InterfaceC3135i0 f15800s;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        float f7 = 0;
        if (Float.compare(this.f15800s.mo4827d(interfaceC3223n0.getLayoutDirection()), f7) >= 0 && Float.compare(this.f15800s.mo4825b(), f7) >= 0 && Float.compare(this.f15800s.mo4826c(interfaceC3223n0.getLayoutDirection()), f7) >= 0 && Float.compare(this.f15800s.mo4824a(), f7) >= 0) {
            int mo4513Q = interfaceC3223n0.mo4513Q(this.f15800s.mo4826c(interfaceC3223n0.getLayoutDirection())) + interfaceC3223n0.mo4513Q(this.f15800s.mo4827d(interfaceC3223n0.getLayoutDirection()));
            int mo4513Q2 = interfaceC3223n0.mo4513Q(this.f15800s.mo4824a()) + interfaceC3223n0.mo4513Q(this.f15800s.mo4825b());
            AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4772i(-mo4513Q, -mo4513Q2, j6));
            return interfaceC3223n0.mo4941K(AbstractC3092b.m4770g(mo4918e.f16053e + mo4513Q, j6), AbstractC3092b.m4769f(mo4918e.f16054f + mo4513Q2, j6), C1814v.f10861e, new C0037j(mo4918e, interfaceC3223n0, this, 12));
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
