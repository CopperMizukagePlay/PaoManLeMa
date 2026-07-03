package p026d0;

import java.util.LinkedHashMap;
import java.util.Map;
import p001a0.AbstractC0027g1;
import p001a0.C0053n;
import p001a0.C0056n2;
import p005a6.InterfaceC0114e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p028d2.C0490w;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p049g1.AbstractC1571e;
import p049g1.C1573g;
import p050g2.AbstractC1586f0;
import p050g2.C1575a;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1604o0;
import p050g2.InterfaceC1612u;
import p058h2.C1773j;
import p067i4.AbstractC2072e;
import p080k2.InterfaceC2293d;
import p132r2.C3038l;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3189c;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3526o0;
import p162v1.C3508i0;
import p162v1.InterfaceC3522n;
import p162v1.InterfaceC3549w;
import p162v1.InterfaceC3551w1;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d0.g */
/* loaded from: classes.dex */
public final class C0462g extends AbstractC3809q implements InterfaceC3549w, InterfaceC3522n, InterfaceC3551w1 {

    /* renamed from: A */
    public C0459d f1608A;

    /* renamed from: B */
    public C0461f f1609B;

    /* renamed from: C */
    public C0460e f1610C;

    /* renamed from: s */
    public String f1611s;

    /* renamed from: t */
    public C1604o0 f1612t;

    /* renamed from: u */
    public InterfaceC2293d f1613u;

    /* renamed from: v */
    public int f1614v;

    /* renamed from: w */
    public boolean f1615w;

    /* renamed from: x */
    public int f1616x;

    /* renamed from: y */
    public int f1617y;

    /* renamed from: z */
    public Map f1618z;

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return AbstractC0027g1.m65k(m1001L0(abstractC3526o0).m999e(abstractC3526o0.getLayoutDirection()).mo2609c());
    }

    /* renamed from: K0 */
    public final C0459d m1000K0() {
        if (this.f1608A == null) {
            this.f1608A = new C0459d(this.f1611s, this.f1612t, this.f1613u, this.f1614v, this.f1615w, this.f1616x, this.f1617y);
        }
        C0459d c0459d = this.f1608A;
        AbstractC3367j.m5097b(c0459d);
        return c0459d;
    }

    /* renamed from: L0 */
    public final C0459d m1001L0(InterfaceC3093c interfaceC3093c) {
        C0459d c0459d;
        C0460e c0460e = this.f1610C;
        if (c0460e != null && c0460e.f1604c && (c0459d = c0460e.f1605d) != null) {
            c0459d.m998d(interfaceC3093c);
            return c0459d;
        }
        C0459d m1000K0 = m1000K0();
        m1000K0.m998d(interfaceC3093c);
        return m1000K0;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return AbstractC0027g1.m65k(m1001L0(abstractC3526o0).m999e(abstractC3526o0.getLayoutDirection()).mo2607a());
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        long j7;
        boolean z7;
        boolean z8;
        InterfaceC1612u interfaceC1612u;
        boolean z9;
        C0459d m1001L0 = m1001L0(interfaceC3223n0);
        EnumC3103m layoutDirection = interfaceC3223n0.getLayoutDirection();
        if (m1001L0.f1590g > 1) {
            C0457b c0457b = m1001L0.f1596m;
            C1604o0 c1604o0 = m1001L0.f1585b;
            InterfaceC3093c interfaceC3093c = m1001L0.f1592i;
            AbstractC3367j.m5097b(interfaceC3093c);
            InterfaceC2293d interfaceC2293d = m1001L0.f1586c;
            if ((c0457b == null || layoutDirection != c0457b.f1575a || !AbstractC3367j.m5096a(c1604o0, c0457b.f1576b) || interfaceC3093c.mo559b() != c0457b.f1577c.mo559b() || interfaceC2293d != c0457b.f1578d) && ((c0457b = C0457b.f1574h) == null || layoutDirection != c0457b.f1575a || !AbstractC3367j.m5096a(c1604o0, c0457b.f1576b) || interfaceC3093c.mo559b() != c0457b.f1577c.mo559b() || interfaceC2293d != c0457b.f1578d)) {
                c0457b = new C0457b(layoutDirection, AbstractC1586f0.m2564h(c1604o0, layoutDirection), interfaceC3093c, interfaceC2293d);
                C0457b.f1574h = c0457b;
            }
            m1001L0.f1596m = c0457b;
            int i7 = m1001L0.f1590g;
            float f7 = c0457b.f1581g;
            float f8 = c0457b.f1580f;
            int i8 = 0;
            if (Float.isNaN(f7) || Float.isNaN(f8)) {
                float m2548b = AbstractC1586f0.m2557a(AbstractC0458c.f1582a, c0457b.f1579e, AbstractC3092b.m4765b(0, 0, 15), c0457b.f1577c, c0457b.f1578d, 1, 96).m2548b();
                float m2548b2 = AbstractC1586f0.m2557a(AbstractC0458c.f1583b, c0457b.f1579e, AbstractC3092b.m4765b(0, 0, 15), c0457b.f1577c, c0457b.f1578d, 2, 96).m2548b() - m2548b;
                c0457b.f1581g = m2548b;
                c0457b.f1580f = m2548b2;
                f8 = m2548b2;
                f7 = m2548b;
            }
            if (i7 != 1) {
                int round = Math.round((f8 * (i7 - 1)) + f7);
                if (round >= 0) {
                    i8 = round;
                }
                int m4759g = C3091a.m4759g(j6);
                if (i8 > m4759g) {
                    i8 = m4759g;
                }
            } else {
                i8 = C3091a.m4761i(j6);
            }
            j7 = AbstractC3092b.m4764a(C3091a.m4762j(j6), C3091a.m4760h(j6), i8, C3091a.m4759g(j6));
        } else {
            j7 = j6;
        }
        C1575a c1575a = m1001L0.f1593j;
        if (c1575a != null && (interfaceC1612u = m1001L0.f1597n) != null && !interfaceC1612u.mo2608b() && layoutDirection == m1001L0.f1598o && (C3091a.m4754b(j7, m1001L0.f1599p) || (C3091a.m4760h(j7) == C3091a.m4760h(m1001L0.f1599p) && C3091a.m4759g(j7) >= c1575a.m2548b() && !c1575a.f10195d.f10795d))) {
            if (!C3091a.m4754b(j7, m1001L0.f1599p)) {
                C1575a c1575a2 = m1001L0.f1593j;
                AbstractC3367j.m5097b(c1575a2);
                m1001L0.f1595l = AbstractC3092b.m4767d(j7, AbstractC2072e.m3326b(AbstractC0027g1.m65k(Math.min(c1575a2.f10192a.f14840i.m2921c(), c1575a2.m2550d())), AbstractC0027g1.m65k(c1575a2.m2548b())));
                if (m1001L0.f1587d == 3 || (((int) (r12 >> 32)) >= c1575a2.m2550d() && ((int) (r12 & 4294967295L)) >= c1575a2.m2548b())) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                m1001L0.f1594k = z9;
                m1001L0.f1599p = j7;
            }
            z8 = false;
        } else {
            C1575a m996b = m1001L0.m996b(j7, layoutDirection);
            m1001L0.f1599p = j7;
            m1001L0.f1595l = AbstractC3092b.m4767d(j7, AbstractC2072e.m3326b(AbstractC0027g1.m65k(m996b.m2550d()), AbstractC0027g1.m65k(m996b.m2548b())));
            if (m1001L0.f1587d == 3 || (((int) (r5 >> 32)) >= m996b.m2550d() && ((int) (r5 & 4294967295L)) >= m996b.m2548b())) {
                z7 = false;
            } else {
                z7 = true;
            }
            m1001L0.f1594k = z7;
            m1001L0.f1593j = m996b;
            z8 = true;
        }
        InterfaceC1612u interfaceC1612u2 = m1001L0.f1597n;
        if (interfaceC1612u2 != null) {
            interfaceC1612u2.mo2608b();
        }
        C1575a c1575a3 = m1001L0.f1593j;
        AbstractC3367j.m5097b(c1575a3);
        C1773j c1773j = c1575a3.f10195d;
        long j8 = m1001L0.f1595l;
        if (z8) {
            AbstractC3498f.m5380t(this, 2).m5340c1();
            Map map = this.f1618z;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(AbstractC3189c.f15928a, Integer.valueOf(Math.round(c1773j.m2931d(0))));
            map.put(AbstractC3189c.f15929b, Integer.valueOf(Math.round(c1773j.m2931d(c1773j.f10798g - 1))));
            this.f1618z = map;
        }
        int i9 = (int) (j8 >> 32);
        int i10 = (int) (j8 & 4294967295L);
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC2072e.m3332i(i9, i9, i10, i10));
        Map map2 = this.f1618z;
        AbstractC3367j.m5097b(map2);
        return interfaceC3223n0.mo4941K(i9, i10, map2, new C0056n2(mo4918e, 2));
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return m1001L0(abstractC3526o0).m995a(i7, abstractC3526o0.getLayoutDirection());
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        if (this.f18005r) {
            C0459d m1001L0 = m1001L0(c3508i0);
            C1575a c1575a = m1001L0.f1593j;
            if (c1575a != null) {
                InterfaceC0674q m106u = c3508i0.f16933e.f10182f.m106u();
                boolean z7 = m1001L0.f1594k;
                if (z7) {
                    long j6 = m1001L0.f1595l;
                    m106u.mo1341m();
                    m106u.mo1335g(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L), 1);
                }
                try {
                    C1588g0 c1588g0 = this.f1612t.f10309a;
                    C3038l c3038l = c1588g0.f10254m;
                    if (c3038l == null) {
                        c3038l = C3038l.f15604b;
                    }
                    C3038l c3038l2 = c3038l;
                    C0665l0 c0665l0 = c1588g0.f10255n;
                    if (c0665l0 == null) {
                        c0665l0 = C0665l0.f2176d;
                    }
                    C0665l0 c0665l02 = c0665l0;
                    AbstractC1571e abstractC1571e = c1588g0.f10257p;
                    if (abstractC1571e == null) {
                        abstractC1571e = C1573g.f10187a;
                    }
                    AbstractC1571e abstractC1571e2 = abstractC1571e;
                    AbstractC0670o mo4718c = c1588g0.f10242a.mo4718c();
                    if (mo4718c != null) {
                        c1575a.m2553g(m106u, mo4718c, this.f1612t.f10309a.f10242a.mo4716a(), c0665l02, c3038l2, abstractC1571e2);
                    } else {
                        long j7 = C0677s.f2209g;
                        if (j7 == 16) {
                            if (this.f1612t.m2594b() != 16) {
                                j7 = this.f1612t.m2594b();
                            } else {
                                j7 = C0677s.f2204b;
                            }
                        }
                        c1575a.m2552f(m106u, j7, c0665l02, c3038l2, abstractC1571e2);
                    }
                    if (z7) {
                        m106u.mo1338j();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z7) {
                        m106u.mo1338j();
                    }
                    throw th;
                }
            }
            throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f1608A + ", textSubstitution=" + this.f1610C + ')').toString());
        }
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        return m1001L0(abstractC3526o0).m995a(i7, abstractC3526o0.getLayoutDirection());
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        C0461f c0461f = this.f1609B;
        if (c0461f == null) {
            c0461f = new C0461f(this, 0);
            this.f1609B = c0461f;
        }
        C1587g c1587g = new C1587g(this.f1611s, null, 6);
        InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
        c0477j.m1036d(AbstractC0487t.f1725A, AbstractC3784a.m5817z(c1587g));
        C0460e c0460e = this.f1610C;
        if (c0460e != null) {
            boolean z7 = c0460e.f1604c;
            C0490w c0490w = AbstractC0487t.f1727C;
            InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
            InterfaceC0114e interfaceC0114e = interfaceC0114eArr2[16];
            c0490w.m1066a(c0477j, Boolean.valueOf(z7));
            C1587g c1587g2 = new C1587g(c0460e.f1603b, null, 6);
            C0490w c0490w2 = AbstractC0487t.f1726B;
            InterfaceC0114e interfaceC0114e2 = interfaceC0114eArr2[15];
            c0490w2.m1066a(c0477j, c1587g2);
        }
        c0477j.m1036d(AbstractC0476i.f1667k, new C0468a(null, new C0461f(this, 1)));
        c0477j.m1036d(AbstractC0476i.f1668l, new C0468a(null, new C0461f(this, 2)));
        c0477j.m1036d(AbstractC0476i.f1669m, new C0468a(null, new C0053n(6, this)));
        AbstractC0489v.m1063a(c0477j, c0461f);
    }
}
