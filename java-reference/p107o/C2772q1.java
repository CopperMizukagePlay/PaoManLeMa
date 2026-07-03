package p107o;

import p001a0.C0092x1;
import p060h5.C1814v;
import p073j2.AbstractC2168e;
import p085l0.C2349d1;
import p122q.EnumC2931o0;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;
import p162v1.AbstractC3526o0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.q1 */
/* loaded from: classes.dex */
public final class C2772q1 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public C2769p1 f14757s;

    /* renamed from: t */
    public boolean f14758t;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (this.f14758t) {
            return interfaceC3214k0.mo4917c0(Integer.MAX_VALUE);
        }
        return interfaceC3214k0.mo4917c0(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (this.f14758t) {
            return interfaceC3214k0.mo4916V(Integer.MAX_VALUE);
        }
        return interfaceC3214k0.mo4916V(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        EnumC2931o0 enumC2931o0;
        int m4759g;
        InterfaceC3279c interfaceC3279c;
        int i7;
        if (this.f14758t) {
            enumC2931o0 = EnumC2931o0.f15240e;
        } else {
            enumC2931o0 = EnumC2931o0.f15241f;
        }
        AbstractC2168e.m3525l(j6, enumC2931o0);
        int i8 = Integer.MAX_VALUE;
        if (this.f14758t) {
            m4759g = Integer.MAX_VALUE;
        } else {
            m4759g = C3091a.m4759g(j6);
        }
        if (this.f14758t) {
            i8 = C3091a.m4760h(j6);
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(C3091a.m4753a(j6, 0, i8, 0, m4759g, 5));
        int i9 = mo4918e.f16053e;
        int m4760h = C3091a.m4760h(j6);
        if (i9 > m4760h) {
            i9 = m4760h;
        }
        int i10 = mo4918e.f16054f;
        int m4759g2 = C3091a.m4759g(j6);
        if (i10 > m4759g2) {
            i10 = m4759g2;
        }
        int i11 = mo4918e.f16054f - i10;
        int i12 = mo4918e.f16053e - i9;
        if (!this.f14758t) {
            i11 = i12;
        }
        C2769p1 c2769p1 = this.f14757s;
        C2349d1 c2349d1 = c2769p1.f14748d;
        C2349d1 c2349d12 = c2769p1.f14745a;
        c2349d1.m3742h(i11);
        AbstractC3459f m5263d = AbstractC3470q.m5263d();
        if (m5263d != null) {
            interfaceC3279c = m5263d.mo5207e();
        } else {
            interfaceC3279c = null;
        }
        AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
        try {
            if (c2349d12.m3741g() > i11) {
                c2349d12.m3742h(i11);
            }
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            C2769p1 c2769p12 = this.f14757s;
            if (this.f14758t) {
                i7 = i10;
            } else {
                i7 = i9;
            }
            c2769p12.f14746b.m3742h(i7);
            return interfaceC3223n0.mo4941K(i9, i10, C1814v.f10861e, new C0092x1(this, i11, mo4918e));
        } catch (Throwable th) {
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            throw th;
        }
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (this.f14758t) {
            return interfaceC3214k0.mo4920f(i7);
        }
        return interfaceC3214k0.mo4920f(Integer.MAX_VALUE);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        if (this.f14758t) {
            return interfaceC3214k0.mo4919e0(i7);
        }
        return interfaceC3214k0.mo4919e0(Integer.MAX_VALUE);
    }
}
