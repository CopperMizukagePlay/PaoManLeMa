package p092m;

import p001a0.C0037j;
import p001a0.C0056n2;
import p060h5.C1814v;
import p067i4.AbstractC2072e;
import p100n.C2628a1;
import p100n.C2631b1;
import p100n.C2643f1;
import p140s2.AbstractC3092b;
import p140s2.C3100j;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3277a;
import p162v1.AbstractC3526o0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;
import p177x0.C3795c;
import p177x0.InterfaceC3797e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.u */
/* loaded from: classes.dex */
public final class C2505u extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: A */
    public InterfaceC3797e f13838A;

    /* renamed from: B */
    public final C2504t f13839B;

    /* renamed from: s */
    public C2643f1 f13840s;

    /* renamed from: t */
    public C2631b1 f13841t;

    /* renamed from: u */
    public C2631b1 f13842u;

    /* renamed from: v */
    public C2506v f13843v;

    /* renamed from: w */
    public C2507w f13844w;

    /* renamed from: x */
    public InterfaceC3277a f13845x;

    /* renamed from: y */
    public C2497m f13846y;

    /* renamed from: z */
    public long f13847z = AbstractC2494j.f13807a;

    public C2505u(C2643f1 c2643f1, C2631b1 c2631b1, C2631b1 c2631b12, C2506v c2506v, C2507w c2507w, InterfaceC3277a interfaceC3277a, C2497m c2497m) {
        this.f13840s = c2643f1;
        this.f13841t = c2631b1;
        this.f13842u = c2631b12;
        this.f13843v = c2506v;
        this.f13844w = c2507w;
        this.f13845x = interfaceC3277a;
        this.f13846y = c2497m;
        AbstractC3092b.m4765b(0, 0, 15);
        this.f13839B = new C2504t(this, 0);
        new C2504t(this, 1);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return interfaceC3214k0.mo4917c0(i7);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        this.f13847z = AbstractC2494j.f13807a;
    }

    /* renamed from: K0 */
    public final InterfaceC3797e m4062K0() {
        if (this.f13840s.m4241f().m4202a(EnumC2496l.f13811e, EnumC2496l.f13812f)) {
            C2495k c2495k = this.f13843v.f13849a.f13788b;
            if (c2495k != null) {
                return c2495k.f13808a;
            }
            C2495k c2495k2 = this.f13844w.f13852a.f13788b;
            if (c2495k2 != null) {
                return c2495k2.f13808a;
            }
            return null;
        }
        C2495k c2495k3 = this.f13844w.f13852a.f13788b;
        if (c2495k3 != null) {
            return c2495k3.f13808a;
        }
        C2495k c2495k4 = this.f13843v.f13849a.f13788b;
        if (c2495k4 != null) {
            return c2495k4.f13808a;
        }
        return null;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return interfaceC3214k0.mo4916V(i7);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        C2628a1 c2628a1;
        long j7;
        long j8;
        long j9;
        C2628a1 c2628a12 = null;
        if (this.f13840s.m4238c() == this.f13840s.f14308d.getValue()) {
            this.f13838A = null;
        } else if (this.f13838A == null) {
            InterfaceC3797e m4062K0 = m4062K0();
            if (m4062K0 == null) {
                m4062K0 = C3795c.f17964e;
            }
            this.f13838A = m4062K0;
        }
        boolean mo4889s = interfaceC3223n0.mo4889s();
        C1814v c1814v = C1814v.f10861e;
        if (mo4889s) {
            AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
            long m3326b = AbstractC2072e.m3326b(mo4918e.f16053e, mo4918e.f16054f);
            this.f13847z = m3326b;
            return interfaceC3223n0.mo4941K((int) (m3326b >> 32), (int) (4294967295L & m3326b), c1814v, new C0056n2(mo4918e, 5));
        }
        if (((Boolean) this.f13845x.mo52a()).booleanValue()) {
            C2497m c2497m = this.f13846y;
            C2631b1 c2631b1 = c2497m.f13815a;
            C2643f1 c2643f1 = c2497m.f13816b;
            C2506v c2506v = c2497m.f13817c;
            C2507w c2507w = c2497m.f13818d;
            if (c2631b1 != null) {
                c2628a1 = c2631b1.m4201a(new C2498n(c2506v, c2507w, 0), new C2498n(c2506v, c2507w, 1));
            } else {
                c2628a1 = null;
            }
            c2643f1.m4238c();
            C0037j c0037j = new C0037j(c2628a1, c2628a12, c2628a12, 7);
            AbstractC3239v0 mo4918e2 = interfaceC3214k0.mo4918e(j6);
            long m3326b2 = AbstractC2072e.m3326b(mo4918e2.f16053e, mo4918e2.f16054f);
            if (!C3102l.m4790a(this.f13847z, AbstractC2494j.f13807a)) {
                j7 = this.f13847z;
            } else {
                j7 = m3326b2;
            }
            C2631b1 c2631b12 = this.f13841t;
            if (c2631b12 != null) {
                c2628a12 = c2631b12.m4201a(this.f13839B, new C2503s(this, j7, 0));
            }
            if (c2628a12 != null) {
                m3326b2 = ((C3102l) c2628a12.getValue()).f15702a;
            }
            long m4767d = AbstractC3092b.m4767d(j6, m3326b2);
            C2631b1 c2631b13 = this.f13842u;
            if (c2631b13 != null) {
                j8 = ((C3100j) c2631b13.m4201a(C2491g.f13803k, new C2503s(this, j7, 1)).getValue()).f15696a;
            } else {
                j8 = 0;
            }
            InterfaceC3797e interfaceC3797e = this.f13838A;
            if (interfaceC3797e != null) {
                j9 = interfaceC3797e.mo5825a(j7, m4767d, EnumC3103m.f15703e);
            } else {
                j9 = 0;
            }
            return interfaceC3223n0.mo4941K((int) (m4767d >> 32), (int) (m4767d & 4294967295L), c1814v, new C2502r(mo4918e2, C3100j.m4785c(j9, 0L), j8, c0037j, 0));
        }
        AbstractC3239v0 mo4918e3 = interfaceC3214k0.mo4918e(j6);
        return interfaceC3223n0.mo4941K(mo4918e3.f16053e, mo4918e3.f16054f, c1814v, new C0056n2(mo4918e3, 6));
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
