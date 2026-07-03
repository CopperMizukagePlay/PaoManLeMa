package p144t;

import p060h5.C1814v;
import p073j2.AbstractC2168e;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p158u5.AbstractC3368k;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.a1 */
/* loaded from: classes.dex */
public final class C3119a1 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public int f15751s;

    /* renamed from: t */
    public AbstractC3368k f15752t;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        int m4762j;
        int i7 = 0;
        if (this.f15751s != 1) {
            m4762j = 0;
        } else {
            m4762j = C3091a.m4762j(j6);
        }
        if (this.f15751s == 2) {
            i7 = C3091a.m4761i(j6);
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4764a(m4762j, C3091a.m4760h(j6), i7, C3091a.m4759g(j6)));
        int m3530q = AbstractC2168e.m3530q(mo4918e.f16053e, C3091a.m4762j(j6), C3091a.m4760h(j6));
        int m3530q2 = AbstractC2168e.m3530q(mo4918e.f16054f, C3091a.m4761i(j6), C3091a.m4759g(j6));
        return interfaceC3223n0.mo4941K(m3530q, m3530q2, C1814v.f10861e, new C3169z0(this, m3530q, mo4918e, m3530q2, interfaceC3223n0));
    }
}
