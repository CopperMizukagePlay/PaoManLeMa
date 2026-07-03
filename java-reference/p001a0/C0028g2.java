package p001a0;

import androidx.compose.p007ui.input.pointer.SuspendPointerInputElement;
import p027d1.C0464b;
import p032d6.InterfaceC0516a0;
import p034e0.AbstractC0602e0;
import p034e0.C0596b0;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.C2427z;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p100n.C2635d;
import p100n.C2659l;
import p107o.C2776s0;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2771q0;
import p115p.C2821a;
import p115p.C2825e;
import p117p1.C2845b0;
import p122q.EnumC2931o0;
import p129r.AbstractC3021j;
import p137s.C3081j;
import p137s.InterfaceC3080i;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p168w.AbstractC3642y;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.g2 */
/* loaded from: classes.dex */
public final class C0028g2 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ int f131f;

    /* renamed from: g */
    public final /* synthetic */ Object f132g;

    /* renamed from: h */
    public final /* synthetic */ Object f133h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0028g2(int i7, Object obj, Object obj2) {
        super(3);
        this.f131f = i7;
        this.f132g = obj;
        this.f133h = obj2;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        InterfaceC3810r mo5829e;
        boolean z7;
        float m3247u;
        switch (this.f131f) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                C3081j c3081j = (C3081j) this.f133h;
                c2395p.m3857Z(-102778667);
                Object m3847O = c2395p.m3847O();
                C2413u0 c2413u0 = C2375k.f13421a;
                if (m3847O == c2413u0) {
                    C2427z c2427z = new C2427z(AbstractC2418w.m3971n(c2395p));
                    c2395p.m3877j0(c2427z);
                    m3847O = c2427z;
                }
                InterfaceC0516a0 interfaceC0516a0 = ((C2427z) m3847O).f13636e;
                Object m3847O2 = c2395p.m3847O();
                if (m3847O2 == c2413u0) {
                    m3847O2 = AbstractC2418w.m3980x(null);
                    c2395p.m3877j0(m3847O2);
                }
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O2;
                InterfaceC2425y0 m3953A = AbstractC2418w.m3953A((InterfaceC3279c) this.f132g, c2395p);
                boolean m3870g = c2395p.m3870g(c3081j);
                Object m3847O3 = c2395p.m3847O();
                if (m3870g || m3847O3 == c2413u0) {
                    m3847O3 = new C0078t0(2, interfaceC2425y0, c3081j);
                    c2395p.m3877j0(m3847O3);
                }
                AbstractC2418w.m3962d(c3081j, (InterfaceC3279c) m3847O3, c2395p);
                boolean m3874i = c2395p.m3874i(interfaceC0516a0) | c2395p.m3870g(c3081j) | c2395p.m3870g(m3953A);
                C3081j c3081j2 = (C3081j) this.f133h;
                Object m3847O4 = c2395p.m3847O();
                if (m3874i || m3847O4 == c2413u0) {
                    m3847O4 = new C0073s(interfaceC0516a0, interfaceC2425y0, c3081j2, m3953A, (InterfaceC2313c) null);
                    c2395p.m3877j0(m3847O4);
                }
                mo5829e = C3807o.f17991a.mo5829e(new SuspendPointerInputElement(c3081j, null, new C2845b0((InterfaceC3281e) m3847O4), 6));
                c2395p.m3888r(false);
                return mo5829e;
            case 1:
                C2395p c2395p2 = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p2.m3857Z(759876635);
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f133h;
                Object m3847O5 = c2395p2.m3847O();
                C2413u0 c2413u02 = C2375k.f13421a;
                if (m3847O5 == c2413u02) {
                    m3847O5 = AbstractC2418w.m3974q(interfaceC3277a);
                    c2395p2.m3877j0(m3847O5);
                }
                InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) m3847O5;
                Object m3847O6 = c2395p2.m3847O();
                if (m3847O6 == c2413u02) {
                    m3847O6 = new C2635d(new C0464b(((C0464b) interfaceC2390n2.getValue()).f1623a), AbstractC0602e0.f1984b, new C0464b(AbstractC0602e0.f1985c), 8);
                    c2395p2.m3877j0(m3847O6);
                }
                C2635d c2635d = (C2635d) m3847O6;
                boolean m3874i2 = c2395p2.m3874i(c2635d);
                Object m3847O7 = c2395p2.m3847O();
                if (m3874i2 || m3847O7 == c2413u02) {
                    m3847O7 = new C0070r0(interfaceC2390n2, c2635d, (InterfaceC2313c) null, 2);
                    c2395p2.m3877j0(m3847O7);
                }
                AbstractC2418w.m3965g(C1694m.f10482a, c2395p2, (InterfaceC3281e) m3847O7);
                C2659l c2659l = c2635d.f14259c;
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f132g;
                boolean m3870g2 = c2395p2.m3870g(c2659l);
                Object m3847O8 = c2395p2.m3847O();
                if (m3870g2 || m3847O8 == c2413u02) {
                    m3847O8 = new C0596b0(c2659l, 0);
                    c2395p2.m3877j0(m3847O8);
                }
                InterfaceC3810r interfaceC3810r = (InterfaceC3810r) interfaceC3279c.mo23f((InterfaceC3277a) m3847O8);
                c2395p2.m3888r(false);
                return interfaceC3810r;
            case 2:
                C2395p c2395p3 = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p3.m3857Z(-353972293);
                InterfaceC2771q0 mo2788b = ((InterfaceC2768p0) this.f132g).mo2788b((InterfaceC3080i) this.f133h, c2395p3);
                boolean m3870g3 = c2395p3.m3870g(mo2788b);
                Object m3847O9 = c2395p3.m3847O();
                if (m3870g3 || m3847O9 == C2375k.f13421a) {
                    m3847O9 = new C2776s0(mo2788b);
                    c2395p3.m3877j0(m3847O9);
                }
                C2776s0 c2776s0 = (C2776s0) m3847O9;
                c2395p3.m3888r(false);
                return c2776s0;
            case 3:
                C2395p c2395p4 = (C2395p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    Object m3847O10 = c2395p4.m3847O();
                    if (m3847O10 == C2375k.f13421a) {
                        m3847O10 = new C2825e();
                        c2395p4.m3877j0(m3847O10);
                    }
                    C2825e c2825e = (C2825e) m3847O10;
                    C0078t0 c0078t0 = (C0078t0) this.f132g;
                    C2821a c2821a = (C2821a) this.f133h;
                    c2825e.f14886a.clear();
                    c0078t0.mo23f(c2825e);
                    c2825e.m4450a(c2821a, c2395p4, 0);
                }
                return C1694m.f10482a;
            default:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                float floatValue3 = ((Number) obj3).floatValue();
                AbstractC3642y abstractC3642y = (AbstractC3642y) this.f132g;
                EnumC3103m enumC3103m = (EnumC3103m) this.f133h;
                char c7 = 0;
                if (abstractC3642y.m5609j().f17361e == EnumC2931o0.f15240e) {
                    z7 = AbstractC2064e.m3252z(abstractC3642y);
                } else if (enumC3103m == EnumC3103m.f15703e) {
                    z7 = AbstractC2064e.m3252z(abstractC3642y);
                } else if (!AbstractC2064e.m3252z(abstractC3642y)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int i7 = abstractC3642y.m5609j().f17358b;
                if (i7 == 0) {
                    m3247u = 0.0f;
                } else {
                    m3247u = AbstractC2064e.m3247u(abstractC3642y) / i7;
                }
                float f7 = m3247u - ((int) m3247u);
                if (Math.abs(floatValue) >= abstractC3642y.f17409p.mo4526y(AbstractC3021j.f15576a)) {
                    if (floatValue > 0.0f) {
                        c7 = 1;
                    } else {
                        c7 = 2;
                    }
                }
                if (c7 == 0) {
                    if (Math.abs(f7) > 0.5f) {
                        floatValue2 = floatValue3;
                    } else {
                        floatValue2 = floatValue3;
                        break;
                    }
                } else {
                    if (c7 != 1) {
                        if (c7 != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                }
                return Float.valueOf(floatValue2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028g2(InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c) {
        super(3);
        this.f131f = 1;
        this.f133h = interfaceC3277a;
        this.f132g = interfaceC3279c;
    }
}
