package p001a0;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.AbstractC0150f;
import androidx.compose.foundation.gestures.AbstractC0152a;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p060h5.C1814v;
import p063i0.AbstractC2052z1;
import p063i0.C1893f5;
import p063i0.C1936k5;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2780u0;
import p115p.AbstractC2831k;
import p115p.C2821a;
import p122q.C2927n;
import p122q.EnumC2931o0;
import p122q.InterfaceC2914i1;
import p137s.C3081j;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p170w1.AbstractC3674f1;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.j2 */
/* loaded from: classes.dex */
public final class C0040j2 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ int f183f;

    /* renamed from: g */
    public final /* synthetic */ boolean f184g;

    /* renamed from: h */
    public final /* synthetic */ Object f185h;

    /* renamed from: i */
    public final /* synthetic */ Object f186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0040j2(C0061p c0061p, boolean z7, InterfaceC3277a interfaceC3277a) {
        super(3);
        this.f183f = 4;
        this.f185h = c0061p;
        this.f184g = z7;
        this.f186i = (AbstractC3368k) interfaceC3277a;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        boolean z8;
        boolean z9;
        int m4762j;
        C3081j c3081j;
        int i7 = this.f183f;
        boolean z10 = this.f184g;
        Object obj4 = C2375k.f13421a;
        C1694m c1694m = C1694m.f10482a;
        int i8 = 2;
        Object obj5 = this.f186i;
        Object obj6 = this.f185h;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                C0048l2 c0048l2 = (C0048l2) obj6;
                c2395p.m3857Z(805428266);
                if (c2395p.m3878k(AbstractC3674f1.f17523n) == EnumC3103m.f15704f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (((EnumC2931o0) c0048l2.f250e.getValue()) != EnumC2931o0.f15240e && z7) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                boolean m3870g = c2395p.m3870g(c0048l2);
                Object m3847O = c2395p.m3847O();
                if (m3870g || m3847O == obj4) {
                    m3847O = new C0005b(2, c0048l2);
                    c2395p.m3877j0(m3847O);
                }
                InterfaceC2425y0 m3953A = AbstractC2418w.m3953A((InterfaceC3279c) m3847O, c2395p);
                Object m3847O2 = c2395p.m3847O();
                if (m3847O2 == obj4) {
                    Object c2927n = new C2927n(new C0024f2(m3953A, 1));
                    c2395p.m3877j0(c2927n);
                    m3847O2 = c2927n;
                }
                InterfaceC2914i1 interfaceC2914i1 = (InterfaceC2914i1) m3847O2;
                boolean m3870g2 = c2395p.m3870g(interfaceC2914i1) | c2395p.m3870g(c0048l2);
                Object m3847O3 = c2395p.m3847O();
                if (m3870g2 || m3847O3 == obj4) {
                    m3847O3 = new C0036i2(interfaceC2914i1, c0048l2);
                    c2395p.m3877j0(m3847O3);
                }
                C0036i2 c0036i2 = (C0036i2) m3847O3;
                EnumC2931o0 enumC2931o0 = (EnumC2931o0) c0048l2.f250e.getValue();
                if (z10 && c0048l2.f247b.m3729g() != 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                InterfaceC3810r m328b = AbstractC0152a.m328b(C3807o.f17991a, c0036i2, enumC2931o0, null, z9, z8, null, (C3081j) obj5, null);
                c2395p.m3888r(false);
                return m328b;
            case 1:
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) obj;
                InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) obj2;
                long j6 = ((C3091a) obj3).f15687a;
                float f7 = AbstractC2052z1.f12199a;
                int m4770g = AbstractC3092b.m4770g(((C2349d1) obj6).m3741g(), j6);
                int m4769f = AbstractC3092b.m4769f(((C2349d1) obj5).m3741g(), j6);
                if (z10) {
                    m4762j = m4770g;
                } else {
                    m4762j = C3091a.m4762j(j6);
                }
                if (!z10) {
                    m4770g = C3091a.m4760h(j6);
                }
                AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(C3091a.m4753a(j6, m4762j, m4770g, 0, m4769f, 4));
                return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0056n2(mo4918e, 3));
            case 2:
                ((Number) obj3).intValue();
                C1936k5.f11432a.m3136a((C3081j) obj5, null, (C1893f5) obj6, this.f184g, 0L, (C2395p) obj2, 196608);
                return c1694m;
            case 3:
                C2395p c2395p2 = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p2.m3857Z(-756081143);
                InterfaceC2768p0 interfaceC2768p0 = (InterfaceC2768p0) c2395p2.m3878k(AbstractC0150f.f613a);
                if (interfaceC2768p0 instanceof InterfaceC2780u0) {
                    c2395p2.m3857Z(617140216);
                    c2395p2.m3888r(false);
                    c3081j = null;
                } else {
                    c2395p2.m3857Z(617248189);
                    Object m3847O4 = c2395p2.m3847O();
                    if (m3847O4 == obj4) {
                        m3847O4 = new C3081j();
                        c2395p2.m3877j0(m3847O4);
                    }
                    c3081j = (C3081j) m3847O4;
                    c2395p2.m3888r(false);
                }
                InterfaceC3810r m320c = AbstractC0145a.m320c(C3807o.f17991a, c3081j, interfaceC2768p0, this.f184g, (String) obj6, null, (InterfaceC3277a) obj5);
                c2395p2.m3888r(false);
                return m320c;
            default:
                C2821a c2821a = (C2821a) obj;
                C2395p c2395p3 = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (c2395p3.m3870g(c2821a)) {
                        i8 = 4;
                    }
                    intValue |= i8;
                }
                if ((intValue & 19) == 18 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    String str = (String) ((C0061p) obj6).mo22d(c2395p3, 0);
                    if (!AbstractC0444k.m937a0(str)) {
                        AbstractC2831k.m4452b(str, this.f184g, c2821a, (AbstractC3368k) obj5, c2395p3, (intValue << 6) & 896);
                    } else {
                        throw new IllegalStateException("Label must not be blank");
                    }
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040j2(C0048l2 c0048l2, boolean z7, C3081j c3081j) {
        super(3);
        this.f183f = 0;
        this.f185h = c0048l2;
        this.f184g = z7;
        this.f186i = c3081j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040j2(C3081j c3081j, C1893f5 c1893f5, boolean z7) {
        super(3);
        this.f183f = 2;
        this.f186i = c3081j;
        this.f185h = c1893f5;
        this.f184g = z7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040j2(boolean z7, Object obj, Object obj2, int i7) {
        super(3);
        this.f183f = i7;
        this.f184g = z7;
        this.f185h = obj;
        this.f186i = obj2;
    }
}
