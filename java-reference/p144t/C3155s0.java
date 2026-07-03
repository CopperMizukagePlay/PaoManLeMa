package p144t;

import p001a0.C0056n2;
import p060h5.C1814v;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.C3096f;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.AbstractC3526o0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.s0 */
/* loaded from: classes.dex */
public final class C3155s0 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public float f15837s;

    /* renamed from: t */
    public float f15838t;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        int i8;
        int mo4917c0 = interfaceC3214k0.mo4917c0(i7);
        if (!C3096f.m4776a(this.f15837s, Float.NaN)) {
            i8 = abstractC3526o0.mo4513Q(this.f15837s);
        } else {
            i8 = 0;
        }
        if (mo4917c0 < i8) {
            return i8;
        }
        return mo4917c0;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        int i8;
        int mo4916V = interfaceC3214k0.mo4916V(i7);
        if (!C3096f.m4776a(this.f15837s, Float.NaN)) {
            i8 = abstractC3526o0.mo4513Q(this.f15837s);
        } else {
            i8 = 0;
        }
        if (mo4916V < i8) {
            return i8;
        }
        return mo4916V;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        int m4762j;
        int i7 = 0;
        if (!C3096f.m4776a(this.f15837s, Float.NaN) && C3091a.m4762j(j6) == 0) {
            m4762j = interfaceC3223n0.mo4513Q(this.f15837s);
            int m4760h = C3091a.m4760h(j6);
            if (m4762j > m4760h) {
                m4762j = m4760h;
            }
            if (m4762j < 0) {
                m4762j = 0;
            }
        } else {
            m4762j = C3091a.m4762j(j6);
        }
        int m4760h2 = C3091a.m4760h(j6);
        if (!C3096f.m4776a(this.f15838t, Float.NaN) && C3091a.m4761i(j6) == 0) {
            int mo4513Q = interfaceC3223n0.mo4513Q(this.f15838t);
            int m4759g = C3091a.m4759g(j6);
            if (mo4513Q > m4759g) {
                mo4513Q = m4759g;
            }
            if (mo4513Q >= 0) {
                i7 = mo4513Q;
            }
        } else {
            i7 = C3091a.m4761i(j6);
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4764a(m4762j, m4760h2, i7, C3091a.m4759g(j6)));
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0056n2(mo4918e, 10));
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        int i8;
        int mo4920f = interfaceC3214k0.mo4920f(i7);
        if (!C3096f.m4776a(this.f15838t, Float.NaN)) {
            i8 = abstractC3526o0.mo4513Q(this.f15838t);
        } else {
            i8 = 0;
        }
        if (mo4920f < i8) {
            return i8;
        }
        return mo4920f;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        int i8;
        int mo4919e0 = interfaceC3214k0.mo4919e0(i7);
        if (!C3096f.m4776a(this.f15838t, Float.NaN)) {
            i8 = abstractC3526o0.mo4513Q(this.f15838t);
        } else {
            i8 = 0;
        }
        if (mo4919e0 < i8) {
            return i8;
        }
        return mo4919e0;
    }
}
