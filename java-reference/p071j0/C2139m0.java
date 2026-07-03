package p071j0;

import p035e1.AbstractC0659i0;
import p035e1.AbstractC0663k0;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p049g1.AbstractC1571e;
import p050g2.AbstractC1590h0;
import p050g2.AbstractC1614w;
import p050g2.C1588g0;
import p050g2.C1593j;
import p050g2.C1604o0;
import p050g2.C1613v;
import p050g2.C1615x;
import p050g2.C1616y;
import p053g5.C1694m;
import p066i3.AbstractC2067b;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p085l0.C2395p;
import p085l0.InterfaceC2390n2;
import p100n.C2637d1;
import p103n2.C2714b;
import p132r2.C3027a;
import p132r2.C3028b;
import p132r2.C3029c;
import p132r2.C3030d;
import p132r2.C3031e;
import p132r2.C3035i;
import p132r2.C3037k;
import p132r2.C3038l;
import p132r2.C3039m;
import p132r2.C3040n;
import p132r2.C3042p;
import p132r2.C3043q;
import p132r2.C3045s;
import p132r2.InterfaceC3041o;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.m0 */
/* loaded from: classes.dex */
public final class C2139m0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C1604o0 f12459f;

    /* renamed from: g */
    public final /* synthetic */ C1604o0 f12460g;

    /* renamed from: h */
    public final /* synthetic */ float f12461h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2390n2 f12462i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3281e f12463j;

    /* renamed from: k */
    public final /* synthetic */ boolean f12464k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2390n2 f12465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139m0(C1604o0 c1604o0, C1604o0 c1604o02, float f7, C2637d1 c2637d1, InterfaceC3281e interfaceC3281e, boolean z7, C2637d1 c2637d12) {
        super(2);
        this.f12459f = c1604o0;
        this.f12460g = c1604o02;
        this.f12461h = f7;
        this.f12462i = c2637d1;
        this.f12463j = interfaceC3281e;
        this.f12464k = z7;
        this.f12465l = c2637d12;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        float f7;
        C1616y c1616y;
        C1615x c1615x;
        C1615x c1615x2;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1604o0 c1604o0 = this.f12459f;
            C1588g0 c1588g0 = c1604o0.f10309a;
            C1604o0 c1604o02 = this.f12460g;
            C1588g0 c1588g02 = c1604o02.f10309a;
            InterfaceC3041o interfaceC3041o = AbstractC1590h0.f10262d;
            InterfaceC3041o interfaceC3041o2 = c1588g0.f10242a;
            InterfaceC3041o interfaceC3041o3 = c1588g02.f10242a;
            boolean z7 = interfaceC3041o2 instanceof C3028b;
            InterfaceC3041o interfaceC3041o4 = C3040n.f15609a;
            float f8 = this.f12461h;
            if (!z7 && !(interfaceC3041o3 instanceof C3028b)) {
                long m1415o = AbstractC0659i0.m1415o(interfaceC3041o2.mo4717b(), interfaceC3041o3.mo4717b(), f8);
                if (m1415o != 16) {
                    interfaceC3041o4 = new C3029c(m1415o);
                }
            } else if (z7 && (interfaceC3041o3 instanceof C3028b)) {
                C3028b c3028b = (C3028b) interfaceC3041o2;
                C3028b c3028b2 = (C3028b) interfaceC3041o3;
                AbstractC0670o abstractC0670o = (AbstractC0670o) AbstractC1590h0.m2572b(c3028b.f15586a, c3028b2.f15586a, f8);
                float m3409v = AbstractC2080d.m3409v(c3028b.f15587b, c3028b2.f15587b, f8);
                if (abstractC0670o != null) {
                    if (abstractC0670o instanceof C0671o0) {
                        long m3294s = AbstractC2067b.m3294s(m3409v, ((C0671o0) abstractC0670o).f2197a);
                        if (m3294s != 16) {
                            interfaceC3041o4 = new C3029c(m3294s);
                        }
                    } else if (abstractC0670o instanceof AbstractC0663k0) {
                        interfaceC3041o4 = new C3028b((AbstractC0663k0) abstractC0670o, m3409v);
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                interfaceC3041o4 = (InterfaceC3041o) AbstractC1590h0.m2572b(interfaceC3041o2, interfaceC3041o3, f8);
            }
            InterfaceC3041o interfaceC3041o5 = interfaceC3041o4;
            AbstractC2305p abstractC2305p = (AbstractC2305p) AbstractC1590h0.m2572b(c1588g0.f10247f, c1588g02.f10247f, f8);
            long m2573c = AbstractC1590h0.m2573c(c1588g0.f10243b, c1588g02.f10243b, f8);
            C2300k c2300k = c1588g0.f10244c;
            if (c2300k == null) {
                c2300k = C2300k.f13233h;
            }
            C2300k c2300k2 = c1588g02.f10244c;
            if (c2300k2 == null) {
                c2300k2 = C2300k.f13233h;
            }
            C2300k c2300k3 = new C2300k(AbstractC2168e.m3530q(AbstractC2080d.m3410w(f8, c2300k.f13237e, c2300k2.f13237e), 1, 1000));
            C2298i c2298i = (C2298i) AbstractC1590h0.m2572b(c1588g0.f10245d, c1588g02.f10245d, f8);
            C2299j c2299j = (C2299j) AbstractC1590h0.m2572b(c1588g0.f10246e, c1588g02.f10246e, f8);
            String str = (String) AbstractC1590h0.m2572b(c1588g0.f10248g, c1588g02.f10248g, f8);
            long m2573c2 = AbstractC1590h0.m2573c(c1588g0.f10249h, c1588g02.f10249h, f8);
            C3027a c3027a = c1588g0.f10250i;
            float f9 = 0.0f;
            if (c3027a != null) {
                f7 = c3027a.f15585a;
            } else {
                f7 = 0.0f;
            }
            C3027a c3027a2 = c1588g02.f10250i;
            if (c3027a2 != null) {
                f9 = c3027a2.f15585a;
            }
            float m3409v2 = AbstractC2080d.m3409v(f7, f9, f8);
            C3042p c3042p = c1588g0.f10251j;
            C3042p c3042p2 = C3042p.f15610c;
            if (c3042p == null) {
                c3042p = c3042p2;
            }
            C3042p c3042p3 = c1588g02.f10251j;
            if (c3042p3 != null) {
                c3042p2 = c3042p3;
            }
            C3042p c3042p4 = new C3042p(AbstractC2080d.m3409v(c3042p.f15611a, c3042p2.f15611a, f8), AbstractC2080d.m3409v(c3042p.f15612b, c3042p2.f15612b, f8));
            C2714b c2714b = (C2714b) AbstractC1590h0.m2572b(c1588g0.f10252k, c1588g02.f10252k, f8);
            long m1415o2 = AbstractC0659i0.m1415o(c1588g0.f10253l, c1588g02.f10253l, f8);
            C3038l c3038l = (C3038l) AbstractC1590h0.m2572b(c1588g0.f10254m, c1588g02.f10254m, f8);
            C0665l0 c0665l0 = c1588g0.f10255n;
            if (c0665l0 == null) {
                c0665l0 = new C0665l0();
            }
            C0665l0 c0665l02 = c1588g02.f10255n;
            if (c0665l02 == null) {
                c0665l02 = new C0665l0();
            }
            C0665l0 c0665l03 = new C0665l0(AbstractC0659i0.m1415o(c0665l0.f2177a, c0665l02.f2177a, f8), AbstractC3784a.m5816y(c0665l0.f2178b, c0665l02.f2178b, f8), AbstractC2080d.m3409v(c0665l0.f2179c, c0665l02.f2179c, f8));
            C1616y c1616y2 = c1588g0.f10256o;
            C1616y c1616y3 = c1588g02.f10256o;
            if (c1616y2 == null && c1616y3 == null) {
                c1616y = null;
            } else {
                if (c1616y2 == null) {
                    c1616y2 = C1616y.f10352a;
                }
                c1616y = c1616y2;
            }
            C1588g0 c1588g03 = new C1588g0(interfaceC3041o5, m2573c, c2300k3, c2298i, c2299j, abstractC2305p, str, m2573c2, new C3027a(m3409v2), c3042p4, c2714b, m1415o2, c3038l, c0665l03, c1616y, (AbstractC1571e) AbstractC1590h0.m2572b(c1588g0.f10257p, c1588g02.f10257p, f8));
            C1613v c1613v = c1604o0.f10310b;
            C1613v c1613v2 = c1604o02.f10310b;
            int i7 = AbstractC1614w.f10349b;
            int i8 = ((C3037k) AbstractC1590h0.m2572b(new C3037k(c1613v.f10339a), new C3037k(c1613v2.f10339a), f8)).f15603a;
            int i9 = ((C3039m) AbstractC1590h0.m2572b(new C3039m(c1613v.f10340b), new C3039m(c1613v2.f10340b), f8)).f15608a;
            long m2573c3 = AbstractC1590h0.m2573c(c1613v.f10341c, c1613v2.f10341c, f8);
            C3043q c3043q = c1613v.f10342d;
            if (c3043q == null) {
                c3043q = C3043q.f15613c;
            }
            C3043q c3043q2 = c1613v2.f10342d;
            if (c3043q2 == null) {
                c3043q2 = C3043q.f15613c;
            }
            C3043q c3043q3 = new C3043q(AbstractC1590h0.m2573c(c3043q.f15614a, c3043q2.f15614a, f8), AbstractC1590h0.m2573c(c3043q.f15615b, c3043q2.f15615b, f8));
            C1615x c1615x3 = c1613v.f10343e;
            C1615x c1615x4 = c1613v2.f10343e;
            if (c1615x3 == null && c1615x4 == null) {
                c1615x2 = null;
            } else {
                C1615x c1615x5 = C1615x.f10350b;
                if (c1615x3 == null) {
                    c1615x = c1615x5;
                } else {
                    c1615x = c1615x3;
                }
                boolean z8 = c1615x.f10351a;
                if (c1615x4 == null) {
                    c1615x4 = c1615x5;
                }
                boolean z9 = c1615x4.f10351a;
                if (z8 != z9) {
                    ((C1593j) AbstractC1590h0.m2572b(new Object(), new Object(), f8)).getClass();
                    c1615x = new C1615x(((Boolean) AbstractC1590h0.m2572b(Boolean.valueOf(z8), Boolean.valueOf(z9), f8)).booleanValue());
                }
                c1615x2 = c1615x;
            }
            C1604o0 c1604o03 = new C1604o0(c1588g03, new C1613v(i8, i9, m2573c3, c3043q3, c1615x2, (C3035i) AbstractC1590h0.m2572b(c1613v.f10344f, c1613v2.f10344f, f8), ((C3031e) AbstractC1590h0.m2572b(new C3031e(c1613v.f10345g), new C3031e(c1613v2.f10345g), f8)).f15591a, ((C3030d) AbstractC1590h0.m2572b(new C3030d(c1613v.f10346h), new C3030d(c1613v2.f10346h), f8)).f15589a, (C3045s) AbstractC1590h0.m2572b(c1613v.f10347i, c1613v2.f10347i, f8)));
            if (this.f12464k) {
                c1604o03 = C1604o0.m2592a(c1604o03, ((C0677s) this.f12465l.getValue()).f2211a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            AbstractC2151s0.m3492b(((C0677s) this.f12462i.getValue()).f2211a, c1604o03, this.f12463j, c2395p, 0);
        }
        return C1694m.f10482a;
    }
}
