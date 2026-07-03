package p144t;

import p001a0.C0056n2;
import p060h5.C1814v;
import p073j2.AbstractC2168e;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.w */
/* loaded from: classes.dex */
public final class C3162w extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public int f15867s;

    /* renamed from: t */
    public float f15868t;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        int m4762j;
        int m4760h;
        int m4759g;
        int i7;
        if (C3091a.m4756d(j6) && this.f15867s != 1) {
            m4762j = AbstractC2168e.m3530q(Math.round(C3091a.m4760h(j6) * this.f15868t), C3091a.m4762j(j6), C3091a.m4760h(j6));
            m4760h = m4762j;
        } else {
            m4762j = C3091a.m4762j(j6);
            m4760h = C3091a.m4760h(j6);
        }
        if (C3091a.m4755c(j6) && this.f15867s != 2) {
            i7 = AbstractC2168e.m3530q(Math.round(C3091a.m4759g(j6) * this.f15868t), C3091a.m4761i(j6), C3091a.m4759g(j6));
            m4759g = i7;
        } else {
            int m4761i = C3091a.m4761i(j6);
            m4759g = C3091a.m4759g(j6);
            i7 = m4761i;
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4764a(m4762j, m4760h, i7, m4759g));
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0056n2(mo4918e, 7));
    }
}
