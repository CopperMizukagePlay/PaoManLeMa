package p039e5;

import android.content.Context;
import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.C0153a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p007ui.viewinterop.AbstractC0174a;
import java.util.Iterator;
import java.util.List;
import p017c.C0320e;
import p032d6.InterfaceC0516a0;
import p035e1.AbstractC0659i0;
import p035e1.C0657h0;
import p035e1.C0677s;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1908h2;
import p063i0.AbstractC1991r4;
import p063i0.C1956n1;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3144n;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3472s;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p168w.AbstractC3642y;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p190z.AbstractC3861e;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.f8 */
/* loaded from: classes.dex */
public final class C0862f8 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f3952e;

    /* renamed from: f */
    public final /* synthetic */ Object f3953f;

    /* renamed from: g */
    public final /* synthetic */ Object f3954g;

    /* renamed from: h */
    public final /* synthetic */ Object f3955h;

    public /* synthetic */ C0862f8(Object obj, Object obj2, Object obj3, int i7) {
        this.f3952e = i7;
        this.f3954g = obj;
        this.f3953f = obj2;
        this.f3955h = obj3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        List list;
        boolean z7;
        Object obj3;
        int i7 = this.f3952e;
        C3807o c3807o = C3807o.f17991a;
        int i8 = 9;
        int i9 = 1;
        C2413u0 c2413u0 = C2375k.f13421a;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f3954g;
        Object obj5 = this.f3953f;
        Object obj6 = this.f3955h;
        int i10 = 0;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                Context context = (Context) obj6;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3860d c3860d = AbstractC1328u8.f7898a;
                    if (((String) interfaceC2425y0.getValue()).length() > 0 && !((C0703a8) obj4).f2334a) {
                        c2395p.m3857Z(2065933692);
                        boolean m3870g = c2395p.m3870g(interfaceC2425y0) | c2395p.m3874i(context);
                        Object m3847O = c2395p.m3847O();
                        Object obj7 = m3847O;
                        if (m3870g || m3847O == c2413u0) {
                            C1045l4 c1045l4 = new C1045l4(context, interfaceC2425y0, 4);
                            c2395p.m3877j0(c1045l4);
                            obj7 = c1045l4;
                        }
                        c2395p.m3888r(false);
                        AbstractC1991r4.m3165f((InterfaceC3277a) obj7, null, false, null, AbstractC0823e1.f3592d, c2395p, 196608, 30);
                    }
                }
                return c1694m;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else if (((C2349d1) obj4).m3741g() == 1 && ((list = (List) ((InterfaceC2390n2) obj6).getValue()) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C0800d9) it.next()).f3351l == EnumC0768c9.f3010j) {
                                c2395p2.m3857Z(1702809276);
                                boolean m3870g2 = c2395p2.m3870g(interfaceC2425y02);
                                Object m3847O2 = c2395p2.m3847O();
                                Object obj8 = m3847O2;
                                if (m3870g2 || m3847O2 == c2413u0) {
                                    C0705aa c0705aa = new C0705aa(interfaceC2425y02, 6);
                                    c2395p2.m3877j0(c0705aa);
                                    obj8 = c0705aa;
                                }
                                c2395p2.m3888r(false);
                                C3173d c3173d = AbstractC0951i1.f4703a;
                                AbstractC1908h2.m3120a((InterfaceC3277a) obj8, null, null, 0L, 0L, null, c2395p2, 12582912);
                            }
                        }
                    }
                }
                return c1694m;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj6;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) obj5;
                C1196q0 c1196q0 = (C1196q0) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    c2395p3.m3857Z(1702920139);
                    boolean m3874i = c2395p3.m3874i(c1196q0) | c2395p3.m3870g(interfaceC2425y04) | c2395p3.m3870g(interfaceC2425y03);
                    Object m3847O3 = c2395p3.m3847O();
                    Object obj9 = m3847O3;
                    if (m3874i || m3847O3 == c2413u0) {
                        C1384w2 c1384w2 = new C1384w2((Object) c1196q0, interfaceC2425y04, interfaceC2425y03, i8);
                        c2395p3.m3877j0(c1384w2);
                        obj9 = c1384w2;
                    }
                    c2395p3.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) obj9, null, false, null, null, null, null, null, AbstractC0951i1.f4721j, c2395p3, 805306368, 510);
                }
                return c1694m;
            case 3:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    FillElement fillElement = AbstractC0155c.f660c;
                    long j6 = C0677s.f2204b;
                    C0657h0 c0657h0 = AbstractC0659i0.f2147a;
                    InterfaceC3810r m319b = AbstractC0145a.m319b(fillElement, j6, c0657h0);
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj4;
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) obj6;
                    InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) obj5;
                    InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
                    int m3975r = AbstractC2418w.m3975r(c2395p4);
                    InterfaceC2385m1 m3882m = c2395p4.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p4, m319b);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p4.m3863c0();
                    if (c2395p4.f13485S) {
                        c2395p4.m3880l(c3558z);
                    } else {
                        c2395p4.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4853e, c2395p4, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p4, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p4.f13485S || !AbstractC3367j.m5096a(c2395p4.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p4, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p4, C3507i.f16929c);
                    c2395p4.m3857Z(-1394040316);
                    boolean m3870g3 = c2395p4.m3870g(interfaceC3279c);
                    Object m3847O4 = c2395p4.m3847O();
                    if (!m3870g3 && m3847O4 != c2413u0) {
                        z7 = false;
                        obj3 = m3847O4;
                    } else {
                        z7 = false;
                        C1209qd c1209qd = new C1209qd(interfaceC3279c, interfaceC2425y05, (int) (false ? 1 : 0));
                        c2395p4.m3877j0(c1209qd);
                        obj3 = c1209qd;
                    }
                    c2395p4.m3888r(z7);
                    AbstractC0174a.m404b((InterfaceC3279c) obj3, fillElement, null, c2395p4, 48);
                    AbstractC1991r4.m3165f(interfaceC3277a, AbstractC0145a.m319b(AbstractC3784a.m5799c(AbstractC0155c.m353l(AbstractC0154b.m337h(C0153a.f657a.m329a(C3795c.f17966g), 12), 44), AbstractC3861e.m5873a(22)), C0677s.m1453b(0.4f, j6), c0657h0), false, null, AbstractC1042l1.f5366j, c2395p4, 196608, 28);
                    c2395p4.m3888r(true);
                }
                return c1694m;
            case 4:
                C2395p c2395p5 = (C2395p) obj;
                EnumC1311tm enumC1311tm = (EnumC1311tm) obj6;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    AbstractC1847a4.m3102a((String) obj4, (InterfaceC3279c) obj5, AbstractC0155c.m346e(c3807o, 1.0f), false, false, null, AbstractC3178i.m4873d(1304227390, new C1461yh(enumC1311tm, i10), c2395p5), null, null, null, AbstractC3178i.m4873d(-1415783343, new C1461yh(enumC1311tm, i9), c2395p5), null, null, null, false, 5, 3, null, null, c2395p5, 1573248, 918552960, 7466936);
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                C2395p c2395p6 = (C2395p) obj;
                C3472s c3472s = (C3472s) obj6;
                List list2 = (List) obj5;
                InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    c2395p6.m3857Z(1084964504);
                    boolean m3870g4 = c2395p6.m3870g(interfaceC3279c2) | c2395p6.m3874i(list2) | c2395p6.m3870g(c3472s);
                    Object m3847O5 = c2395p6.m3847O();
                    Object obj10 = m3847O5;
                    if (m3870g4 || m3847O5 == c2413u0) {
                        C1384w2 c1384w22 = new C1384w2(14, list2, c3472s, interfaceC3279c2);
                        c2395p6.m3877j0(c1384w22);
                        obj10 = c1384w22;
                    }
                    c2395p6.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) obj10, null, false, null, null, null, null, null, AbstractC1228r1.f7242f0, c2395p6, 805306368, 510);
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2395p c2395p7 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p7.m3836D()) {
                    c2395p7.m3852U();
                } else {
                    List list3 = (List) obj4;
                    C3472s c3472s2 = (C3472s) obj5;
                    InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) obj6;
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(6), C3795c.f17973n, c2395p7, 6);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p7);
                    InterfaceC2385m1 m3882m2 = c2395p7.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p7, c3807o);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p7.m3863c0();
                    if (c2395p7.f13485S) {
                        c2395p7.m3880l(c3558z2);
                    } else {
                        c2395p7.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p7, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m2, c2395p7, C3507i.f16930d);
                    C3504h c3504h2 = C3507i.f16932f;
                    if (c2395p7.f13485S || !AbstractC3367j.m5096a(c2395p7.m3847O(), Integer.valueOf(m3975r2))) {
                        AbstractC2487d.m4050n(m3975r2, c2395p7, m3975r2, c3504h2);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p7, C3507i.f16929c);
                    c2395p7.m3857Z(-1726482202);
                    boolean m3874i2 = c2395p7.m3874i(list3) | c2395p7.m3870g(c3472s2);
                    Object m3847O6 = c2395p7.m3847O();
                    if (m3874i2 || m3847O6 == c2413u0) {
                        m3847O6 = new C0320e(17, list3, c3472s2);
                        c2395p7.m3877j0(m3847O6);
                    }
                    c2395p7.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O6, null, false, null, null, null, AbstractC1228r1.f7244g0, c2395p7, 805306368, 510);
                    AbstractC1991r4.m3167h(interfaceC3277a2, null, false, null, null, null, AbstractC1228r1.f7246h0, c2395p7, 805306368, 510);
                    c2395p7.m3888r(true);
                }
                return c1694m;
            default:
                C2395p c2395p8 = (C2395p) obj;
                C1956n1 c1956n1 = (C1956n1) obj6;
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj5;
                AbstractC3642y abstractC3642y = (AbstractC3642y) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p8.m3836D()) {
                    c2395p8.m3852U();
                } else {
                    int m5608i = abstractC3642y.m5608i();
                    c2395p8.m3857Z(2002595598);
                    boolean m3874i3 = c2395p8.m3874i(interfaceC0516a0) | c2395p8.m3870g(c1956n1) | c2395p8.m3870g(abstractC3642y);
                    Object m3847O7 = c2395p8.m3847O();
                    Object obj11 = m3847O7;
                    if (m3874i3 || m3847O7 == c2413u0) {
                        C1009k c1009k = new C1009k(interfaceC0516a0, c1956n1, abstractC3642y, i8);
                        c2395p8.m3877j0(c1009k);
                        obj11 = c1009k;
                    }
                    c2395p8.m3888r(false);
                    AbstractC0945hr.m1561E(m5608i, (InterfaceC3279c) obj11, c2395p8, 0);
                }
                return c1694m;
        }
    }

    public C0862f8(InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y02) {
        this.f3952e = 1;
        this.f3953f = interfaceC2425y0;
        this.f3954g = c2349d1;
        this.f3955h = interfaceC2425y02;
    }

    public C0862f8(InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, InterfaceC2425y0 interfaceC2425y0) {
        this.f3952e = 3;
        this.f3954g = interfaceC3279c;
        this.f3955h = interfaceC3277a;
        this.f3953f = interfaceC2425y0;
    }
}
