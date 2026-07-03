package p001a0;

import java.util.List;
import p050g2.C1587g;
import p050g2.C1596k0;
import p050g2.C1598l0;
import p050g2.C1604o0;
import p050g2.C1605p;
import p050g2.C1609r;
import p053g5.C1687f;
import p060h5.AbstractC1817y;
import p067i4.AbstractC2072e;
import p073j2.AbstractC2168e;
import p080k2.InterfaceC2293d;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.C3096f;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3189c;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3228q;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.x */
/* loaded from: classes.dex */
public final class C0090x implements InterfaceC3217l0 {

    /* renamed from: a */
    public final /* synthetic */ C0043k1 f410a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC3279c f411b;

    /* renamed from: c */
    public final /* synthetic */ C2459w f412c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2453q f413d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3093c f414e;

    /* renamed from: f */
    public final /* synthetic */ int f415f;

    public C0090x(C0043k1 c0043k1, InterfaceC3279c interfaceC3279c, C2459w c2459w, InterfaceC2453q interfaceC2453q, InterfaceC3093c interfaceC3093c, int i7) {
        this.f410a = c0043k1;
        this.f411b = interfaceC3279c;
        this.f412c = c2459w;
        this.f413d = interfaceC2453q;
        this.f414e = interfaceC3093c;
        this.f415f = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01da  */
    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        InterfaceC3279c interfaceC3279c;
        C1598l0 c1598l0;
        long j7;
        C0043k1 c0043k1;
        C1598l0 c1598l02;
        C1598l0 c1598l03;
        C0064p2 c0064p2;
        C1598l0 c1598l04;
        C0090x c0090x;
        C0043k1 c0043k12;
        int i7;
        int i8;
        InterfaceC3238v interfaceC3238v;
        int m4760h;
        int i9;
        boolean z7;
        C0043k1 c0043k13 = this.f410a;
        AbstractC3459f m5263d = AbstractC3470q.m5263d();
        if (m5263d != null) {
            interfaceC3279c = m5263d.mo5207e();
        } else {
            interfaceC3279c = null;
        }
        AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
        try {
            C0064p2 m120d = c0043k13.m120d();
            if (m120d != null) {
                c1598l0 = m120d.f322a;
            } else {
                c1598l0 = null;
            }
            C0067q1 c0067q1 = c0043k13.f211a;
            EnumC3103m layoutDirection = interfaceC3223n0.getLayoutDirection();
            int i10 = c0067q1.f337f;
            boolean z8 = c0067q1.f336e;
            int i11 = c0067q1.f334c;
            if (c1598l0 != null) {
                C1605p c1605p = c1598l0.f10289b;
                C1596k0 c1596k0 = c1598l0.f10288a;
                C1587g c1587g = c0067q1.f332a;
                C1604o0 c1604o0 = c0067q1.f333b;
                List list2 = c0067q1.f340i;
                InterfaceC3093c interfaceC3093c = c0067q1.f338g;
                InterfaceC2293d interfaceC2293d = c0067q1.f339h;
                C1598l0 c1598l05 = c1598l0;
                if (c1605p.f10312a.mo2608b()) {
                    j7 = j6;
                    c0043k1 = c0043k13;
                } else {
                    C1587g c1587g2 = c1596k0.f10276a;
                    c0043k1 = c0043k13;
                    long j8 = c1596k0.f10285j;
                    if (AbstractC3367j.m5096a(c1587g2, c1587g) && c1596k0.f10277b.m2595c(c1604o0) && AbstractC3367j.m5096a(c1596k0.f10278c, list2) && c1596k0.f10279d == i11 && c1596k0.f10280e == z8 && c1596k0.f10281f == i10 && AbstractC3367j.m5096a(c1596k0.f10282g, interfaceC3093c) && c1596k0.f10283h == layoutDirection && AbstractC3367j.m5096a(c1596k0.f10284i, interfaceC2293d) && C3091a.m4762j(j6) == C3091a.m4762j(j8) && ((!z8 && i10 != 2) || (C3091a.m4760h(j6) == C3091a.m4760h(j8) && C3091a.m4759g(j6) == C3091a.m4759g(j8)))) {
                        c1598l04 = new C1598l0(new C1596k0(c1596k0.f10276a, c0067q1.f333b, c1596k0.f10278c, c1596k0.f10279d, c1596k0.f10280e, c1596k0.f10281f, c1596k0.f10282g, c1596k0.f10283h, c1596k0.f10284i, j6), c1605p, AbstractC3092b.m4767d(j6, AbstractC2072e.m3326b(AbstractC0027g1.m65k(c1605p.f10315d), AbstractC0027g1.m65k(c1605p.f10316e))));
                        c1598l03 = c1598l05;
                        c0064p2 = m120d;
                        long j9 = c1598l04.f10290c;
                        Integer valueOf = Integer.valueOf((int) (j9 >> 32));
                        Integer valueOf2 = Integer.valueOf((int) (j9 & 4294967295L));
                        int intValue = valueOf.intValue();
                        int intValue2 = valueOf2.intValue();
                        if (AbstractC3367j.m5096a(c1598l03, c1598l04)) {
                            if (c0064p2 != null) {
                                interfaceC3238v = c0064p2.f324c;
                            } else {
                                interfaceC3238v = null;
                            }
                            c0043k12 = c0043k1;
                            c0043k12.f219i.setValue(new C0064p2(c1598l04, interfaceC3238v));
                            i7 = 0;
                            c0043k12.f226p = false;
                            c0090x = this;
                            c0090x.f411b.mo23f(c1598l04);
                            AbstractC0027g1.m71q(c0043k12, c0090x.f412c, c0090x.f413d);
                        } else {
                            c0090x = this;
                            c0043k12 = c0043k1;
                            i7 = 0;
                        }
                        if (c0090x.f415f != 1) {
                            i8 = AbstractC0027g1.m65k(c1598l04.f10289b.m2599b(i7));
                        } else {
                            i8 = i7;
                        }
                        c0043k12.f217g.setValue(new C3096f(c0090x.f414e.mo4522t0(i8)));
                        return interfaceC3223n0.mo4941K(intValue, intValue2, AbstractC1817y.m3083O(new C1687f(AbstractC3189c.f15928a, Integer.valueOf(Math.round(c1598l04.f10291d))), new C1687f(AbstractC3189c.f15929b, Integer.valueOf(Math.round(c1598l04.f10292e)))), C0029h.f135h);
                    }
                    j7 = j6;
                }
                c1598l02 = c1598l05;
            } else {
                j7 = j6;
                c0043k1 = c0043k13;
                c1598l02 = c1598l0;
            }
            c0067q1.m131a(layoutDirection);
            int m4762j = C3091a.m4762j(j7);
            if ((z8 || i10 == 2) && C3091a.m4756d(j7)) {
                m4760h = C3091a.m4760h(j7);
            } else {
                m4760h = Integer.MAX_VALUE;
            }
            if (!z8 && i10 == 2) {
                i9 = 1;
            } else {
                i9 = i11;
            }
            if (m4762j != m4760h) {
                C1609r c1609r = c0067q1.f341j;
                if (c1609r != null) {
                    m4760h = AbstractC2168e.m3530q(AbstractC0027g1.m65k(c1609r.mo2609c()), m4762j, m4760h);
                } else {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
            }
            C1609r c1609r2 = c0067q1.f341j;
            if (c1609r2 != null) {
                long m3332i = AbstractC2072e.m3332i(0, m4760h, 0, C3091a.m4759g(j7));
                if (i10 == 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C1605p c1605p2 = new C1605p(c1609r2, m3332i, i9, z7);
                long m4767d = AbstractC3092b.m4767d(j7, AbstractC2072e.m3326b(AbstractC0027g1.m65k(c1605p2.f10315d), AbstractC0027g1.m65k(c1605p2.f10316e)));
                c1598l03 = c1598l02;
                c0064p2 = m120d;
                c1598l04 = new C1598l0(new C1596k0(c0067q1.f332a, c0067q1.f333b, c0067q1.f340i, c0067q1.f334c, c0067q1.f336e, c0067q1.f337f, c0067q1.f338g, layoutDirection, c0067q1.f339h, j7), c1605p2, m4767d);
                long j92 = c1598l04.f10290c;
                Integer valueOf3 = Integer.valueOf((int) (j92 >> 32));
                Integer valueOf22 = Integer.valueOf((int) (j92 & 4294967295L));
                int intValue3 = valueOf3.intValue();
                int intValue22 = valueOf22.intValue();
                if (AbstractC3367j.m5096a(c1598l03, c1598l04)) {
                }
                if (c0090x.f415f != 1) {
                }
                c0043k12.f217g.setValue(new C3096f(c0090x.f414e.mo4522t0(i8)));
                return interfaceC3223n0.mo4941K(intValue3, intValue22, AbstractC1817y.m3083O(new C1687f(AbstractC3189c.f15928a, Integer.valueOf(Math.round(c1598l04.f10291d))), new C1687f(AbstractC3189c.f15929b, Integer.valueOf(Math.round(c1598l04.f10292e)))), C0029h.f135h);
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        } finally {
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
        }
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: d */
    public final int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        C0043k1 c0043k1 = this.f410a;
        c0043k1.f211a.m131a(interfaceC3228q.getLayoutDirection());
        C1609r c1609r = c0043k1.f211a.f341j;
        if (c1609r != null) {
            return AbstractC0027g1.m65k(c1609r.mo2609c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
