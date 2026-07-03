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
/* renamed from: t.q0 */
/* loaded from: classes.dex */
public final class C3151q0 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public float f15827s;

    /* renamed from: t */
    public float f15828t;

    /* renamed from: u */
    public float f15829u;

    /* renamed from: v */
    public float f15830v;

    /* renamed from: w */
    public boolean f15831w;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        long m4858K0 = m4858K0(abstractC3526o0);
        if (C3091a.m4758f(m4858K0)) {
            return C3091a.m4760h(m4858K0);
        }
        return AbstractC3092b.m4770g(interfaceC3214k0.mo4917c0(i7), m4858K0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m4858K0(InterfaceC3223n0 interfaceC3223n0) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (!C3096f.m4776a(this.f15829u, Float.NaN)) {
            i7 = interfaceC3223n0.mo4513Q(this.f15829u);
            if (i7 < 0) {
                i7 = 0;
            }
        } else {
            i7 = Integer.MAX_VALUE;
        }
        if (!C3096f.m4776a(this.f15830v, Float.NaN)) {
            i8 = interfaceC3223n0.mo4513Q(this.f15830v);
            if (i8 < 0) {
                i8 = 0;
            }
        } else {
            i8 = Integer.MAX_VALUE;
        }
        if (!C3096f.m4776a(this.f15827s, Float.NaN)) {
            i9 = interfaceC3223n0.mo4513Q(this.f15827s);
            if (i9 > i7) {
                i9 = i7;
            }
            if (i9 < 0) {
                i9 = 0;
            }
        }
        i9 = 0;
        if (!C3096f.m4776a(this.f15828t, Float.NaN)) {
            int mo4513Q = interfaceC3223n0.mo4513Q(this.f15828t);
            if (mo4513Q > i8) {
                mo4513Q = i8;
            }
            if (mo4513Q < 0) {
                mo4513Q = 0;
            }
            if (mo4513Q != Integer.MAX_VALUE) {
                i10 = mo4513Q;
            }
        }
        return AbstractC3092b.m4764a(i9, i7, i10, i8);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        long m4858K0 = m4858K0(abstractC3526o0);
        if (C3091a.m4758f(m4858K0)) {
            return C3091a.m4760h(m4858K0);
        }
        return AbstractC3092b.m4770g(interfaceC3214k0.mo4916V(i7), m4858K0);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        int m4762j;
        int m4760h;
        int m4761i;
        int m4759g;
        long m4764a;
        long m4858K0 = m4858K0(interfaceC3223n0);
        if (this.f15831w) {
            m4764a = AbstractC3092b.m4768e(j6, m4858K0);
        } else {
            if (!C3096f.m4776a(this.f15827s, Float.NaN)) {
                m4762j = C3091a.m4762j(m4858K0);
            } else {
                m4762j = C3091a.m4762j(j6);
                int m4760h2 = C3091a.m4760h(m4858K0);
                if (m4762j > m4760h2) {
                    m4762j = m4760h2;
                }
            }
            if (!C3096f.m4776a(this.f15829u, Float.NaN)) {
                m4760h = C3091a.m4760h(m4858K0);
            } else {
                m4760h = C3091a.m4760h(j6);
                int m4762j2 = C3091a.m4762j(m4858K0);
                if (m4760h < m4762j2) {
                    m4760h = m4762j2;
                }
            }
            if (!C3096f.m4776a(this.f15828t, Float.NaN)) {
                m4761i = C3091a.m4761i(m4858K0);
            } else {
                m4761i = C3091a.m4761i(j6);
                int m4759g2 = C3091a.m4759g(m4858K0);
                if (m4761i > m4759g2) {
                    m4761i = m4759g2;
                }
            }
            if (!C3096f.m4776a(this.f15830v, Float.NaN)) {
                m4759g = C3091a.m4759g(m4858K0);
            } else {
                m4759g = C3091a.m4759g(j6);
                int m4761i2 = C3091a.m4761i(m4858K0);
                if (m4759g < m4761i2) {
                    m4759g = m4761i2;
                }
            }
            m4764a = AbstractC3092b.m4764a(m4762j, m4760h, m4761i, m4759g);
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(m4764a);
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0056n2(mo4918e, 9));
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        long m4858K0 = m4858K0(abstractC3526o0);
        if (C3091a.m4757e(m4858K0)) {
            return C3091a.m4759g(m4858K0);
        }
        return AbstractC3092b.m4769f(interfaceC3214k0.mo4920f(i7), m4858K0);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        long m4858K0 = m4858K0(abstractC3526o0);
        if (C3091a.m4757e(m4858K0)) {
            return C3091a.m4759g(m4858K0);
        }
        return AbstractC3092b.m4769f(interfaceC3214k0.mo4919e0(i7), m4858K0);
    }
}
