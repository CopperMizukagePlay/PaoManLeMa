package p144t;

import p001a0.C0056n2;
import p060h5.C1814v;
import p140s2.AbstractC3092b;
import p140s2.AbstractC3099i;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.AbstractC3526o0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.d0 */
/* loaded from: classes.dex */
public final class C3125d0 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public int f15768s;

    /* renamed from: t */
    public boolean f15769t;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (this.f15768s == 1) {
            return interfaceC3214k0.mo4916V(i7);
        }
        return interfaceC3214k0.mo4917c0(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (this.f15768s == 1) {
            return interfaceC3214k0.mo4916V(i7);
        }
        return interfaceC3214k0.mo4917c0(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        int mo4917c0;
        if (this.f15768s == 1) {
            mo4917c0 = interfaceC3214k0.mo4916V(C3091a.m4759g(j6));
        } else {
            mo4917c0 = interfaceC3214k0.mo4917c0(C3091a.m4759g(j6));
        }
        if (mo4917c0 < 0) {
            mo4917c0 = 0;
        }
        if (mo4917c0 < 0) {
            AbstractC3099i.m4781a("width must be >= 0");
        }
        long m4771h = AbstractC3092b.m4771h(mo4917c0, mo4917c0, 0, Integer.MAX_VALUE);
        if (this.f15769t) {
            m4771h = AbstractC3092b.m4768e(j6, m4771h);
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(m4771h);
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0056n2(mo4918e, 8));
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return interfaceC3214k0.mo4920f(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return interfaceC3214k0.mo4919e0(i7);
    }
}
