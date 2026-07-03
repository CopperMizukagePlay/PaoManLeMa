package p039e5;

import android.content.Context;
import java.util.List;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC1991r4;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3147o0;
import p144t.C3152r;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z5 */
/* loaded from: classes.dex */
public final class C1480z5 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f9824e;

    /* renamed from: f */
    public final /* synthetic */ Object f9825f;

    /* renamed from: g */
    public final /* synthetic */ Object f9826g;

    /* renamed from: h */
    public final /* synthetic */ Object f9827h;

    /* renamed from: i */
    public final /* synthetic */ Object f9828i;

    public /* synthetic */ C1480z5(Object obj, List list, Object obj2, Object obj3, int i7) {
        this.f9824e = i7;
        this.f9826g = obj;
        this.f9825f = list;
        this.f9827h = obj2;
        this.f9828i = obj3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        switch (this.f9824e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f9828i;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f9826g;
                List list = (List) this.f9825f;
                if ((intValue & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(-1158091408);
                    boolean m3874i = c2395p.m3874i(list) | c2395p.m3870g(interfaceC2425y0) | c2395p.m3870g(interfaceC3279c);
                    InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f9827h;
                    Object m3847O = c2395p.m3847O();
                    if (m3874i || m3847O == C2375k.f13421a) {
                        C1449y5 c1449y5 = new C1449y5(list, interfaceC3279c, interfaceC2425y0, interfaceC2425y02, 0);
                        c2395p.m3877j0(c1449y5);
                        m3847O = c1449y5;
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O, null, false, null, null, null, AbstractC0792d1.f3272k, c2395p, 805306368, 510);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    if (((EnumC0770cb) this.f9826g) == EnumC0770cb.f3020g && ((List) this.f9825f).isEmpty()) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    C3800h c3800h = C3795c.f17978s;
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f9827h;
                    InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) this.f9828i;
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, c3800h, c2395p2, 48);
                    int m3975r = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m = c2395p2.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, C3807o.f17991a);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(c3558z);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p2, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p2, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p2, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p2, C3507i.f16929c);
                    AbstractC1991r4.m3167h(interfaceC3277a, null, z7, null, null, null, AbstractC1228r1.f7256m0, c2395p2, 805306368, 506);
                    AbstractC1991r4.m3161b(interfaceC3277a2, null, z7, null, null, null, null, null, AbstractC1228r1.f7258n0, c2395p2, 805306368, 506);
                    c2395p2.m3888r(true);
                }
                return C1694m.f10482a;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else if (((String) this.f9825f) != null) {
                    c2395p3.m3857Z(552962732);
                    AbstractC1991r4.m3161b((InterfaceC3277a) this.f9826g, null, false, null, null, null, null, null, AbstractC1228r1.f7264q0, c2395p3, 805306368, 510);
                    c2395p3.m3888r(false);
                } else {
                    c2395p3.m3857Z(553049222);
                    C3130g m4843g = AbstractC3136j.m4843g(8);
                    InterfaceC3277a interfaceC3277a3 = (InterfaceC3277a) this.f9827h;
                    InterfaceC3277a interfaceC3277a4 = (InterfaceC3277a) this.f9828i;
                    C3147o0 m4854a = AbstractC3145n0.m4854a(m4843g, C3795c.f17973n, c2395p3, 6);
                    int hashCode = Long.hashCode(c2395p3.f13486T);
                    InterfaceC2385m1 m3882m2 = c2395p3.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p3, C3807o.f17991a);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p3.m3863c0();
                    if (c2395p3.f13485S) {
                        c2395p3.m3880l(c3558z2);
                    } else {
                        c2395p3.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p3, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m2, c2395p3, C3507i.f16930d);
                    C3504h c3504h2 = C3507i.f16932f;
                    if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode))) {
                        AbstractC2487d.m4050n(hashCode, c2395p3, hashCode, c3504h2);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p3, C3507i.f16929c);
                    AbstractC1991r4.m3167h(interfaceC3277a3, null, false, null, null, null, AbstractC1228r1.f7266r0, c2395p3, 805306368, 510);
                    AbstractC1991r4.m3161b(interfaceC3277a4, null, false, null, null, null, null, null, AbstractC1228r1.f7268s0, c2395p3, 805306368, 510);
                    c2395p3.m3888r(true);
                    c2395p3.m3888r(false);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    C3130g m4843g2 = AbstractC3136j.m4843g(6);
                    InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f9826g;
                    C3469p c3469p = (C3469p) this.f9825f;
                    InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f9827h;
                    Context context = (Context) this.f9828i;
                    C3152r m4857a2 = AbstractC3150q.m4857a(m4843g2, C3795c.f17976q, c2395p4, 6);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p4);
                    InterfaceC2385m1 m3882m3 = c2395p4.m3882m();
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p4, c3807o);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z3 = C3507i.f16928b;
                    c2395p4.m3863c0();
                    if (c2395p4.f13485S) {
                        c2395p4.m3880l(c3558z3);
                    } else {
                        c2395p4.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a2, c2395p4, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m3, c2395p4, C3507i.f16930d);
                    C3504h c3504h3 = C3507i.f16932f;
                    if (c2395p4.f13485S || !AbstractC3367j.m5096a(c2395p4.m3847O(), Integer.valueOf(m3975r2))) {
                        AbstractC2487d.m4050n(m3975r2, c2395p4, m3975r2, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p4, C3507i.f16929c);
                    if (((List) interfaceC2425y03.getValue()).isEmpty()) {
                        c2395p4.m3857Z(1608001881);
                        AbstractC1850a7.m3108b("暂无可用接口，请先刷新接口列表", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 6, 0, 131070);
                        c2395p4 = c2395p4;
                        c2395p4.m3888r(false);
                        z8 = true;
                    } else {
                        c2395p4.m3857Z(1608092370);
                        for (C1248rl c1248rl : (List) interfaceC2425y03.getValue()) {
                            C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p4, 48);
                            int m3975r3 = AbstractC2418w.m3975r(c2395p4);
                            InterfaceC2385m1 m3882m4 = c2395p4.m3882m();
                            InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p4, c3807o);
                            InterfaceC3510j.f16935d.getClass();
                            C3558z c3558z4 = C3507i.f16928b;
                            c2395p4.m3863c0();
                            if (c2395p4.f13485S) {
                                c2395p4.m3880l(c3558z4);
                            } else {
                                c2395p4.m3883m0();
                            }
                            AbstractC2418w.m3954C(m4854a2, c2395p4, C3507i.f16931e);
                            AbstractC2418w.m3954C(m3882m4, c2395p4, C3507i.f16930d);
                            C3504h c3504h4 = C3507i.f16932f;
                            if (c2395p4.f13485S || !AbstractC3367j.m5096a(c2395p4.m3847O(), Integer.valueOf(m3975r3))) {
                                AbstractC2487d.m4050n(m3975r3, c2395p4, m3975r3, c3504h4);
                            }
                            AbstractC2418w.m3954C(m5823c4, c2395p4, C3507i.f16929c);
                            boolean contains = c3469p.contains(c1248rl.f7390a);
                            c2395p4.m3857Z(-1064830555);
                            boolean m3870g = c2395p4.m3870g(interfaceC2425y04) | c2395p4.m3874i(context) | c2395p4.m3874i(c1248rl);
                            Object m3847O2 = c2395p4.m3847O();
                            if (m3870g || m3847O2 == C2375k.f13421a) {
                                m3847O2 = new C1268sa(c1248rl, c3469p, context, interfaceC2425y04);
                                c2395p4.m3877j0(m3847O2);
                            }
                            c2395p4.m3888r(false);
                            AbstractC1987r0.m3156a(contains, (InterfaceC3279c) m3847O2, null, false, null, c2395p4, 0, 60);
                            C2395p c2395p5 = c2395p4;
                            AbstractC1850a7.m3108b(c1248rl.f7391b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p5, 0, 0, 131070);
                            c2395p4 = c2395p5;
                            c2395p4.m3888r(true);
                            c3469p = c3469p;
                            c3807o = c3807o;
                            interfaceC2425y04 = interfaceC2425y04;
                            context = context;
                        }
                        z8 = true;
                        c2395p4.m3888r(false);
                    }
                    c2395p4.m3888r(z8);
                }
                return C1694m.f10482a;
        }
    }

    public C1480z5(String str, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, InterfaceC3277a interfaceC3277a3) {
        this.f9824e = 2;
        this.f9825f = str;
        this.f9826g = interfaceC3277a;
        this.f9827h = interfaceC3277a2;
        this.f9828i = interfaceC3277a3;
    }

    public C1480z5(List list, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y02) {
        this.f9824e = 0;
        this.f9825f = list;
        this.f9826g = interfaceC2425y0;
        this.f9828i = interfaceC3279c;
        this.f9827h = interfaceC2425y02;
    }
}
