package p039e5;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p035e1.C0677s;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.AbstractC1978q;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2017u6;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p065i2.AbstractC2064e;
import p079k1.C2266e;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3137j0;
import p144t.C3147o0;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kd */
/* loaded from: classes.dex */
public final class C1023kd implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f5263e;

    /* renamed from: f */
    public final /* synthetic */ Object f5264f;

    /* renamed from: g */
    public final /* synthetic */ Object f5265g;

    /* renamed from: h */
    public final /* synthetic */ Object f5266h;

    public C1023kd(EnumC0964ie enumC0964ie, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c) {
        this.f5263e = 1;
        this.f5265g = enumC0964ie;
        this.f5266h = interfaceC3277a;
        this.f5264f = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f5263e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$ExposedDropdownMenu");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    ArrayList arrayList = (ArrayList) this.f5265g;
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f5264f;
                    InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f5266h;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = i7 + 1;
                        Object obj4 = (C0834ec) arrayList.get(i7);
                        C3173d m4873d = AbstractC3178i.m4873d(2144042133, new C1324u4(7, obj4), c2395p);
                        c2395p.m3857Z(-1700351519);
                        boolean m3870g = c2395p.m3870g(interfaceC3279c) | c2395p.m3874i(obj4);
                        Object m3847O = c2395p.m3847O();
                        if (m3870g || m3847O == C2375k.f13421a) {
                            m3847O = new C1384w2(11, obj4, interfaceC2425y0, interfaceC3279c);
                            c2395p.m3877j0(m3847O);
                        }
                        c2395p.m3888r(false);
                        AbstractC1978q.m3151b(m4873d, (InterfaceC3277a) m3847O, null, null, false, null, null, c2395p, 6, 508);
                        i7 = i8;
                    }
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
                    EnumC0964ie enumC0964ie = (EnumC0964ie) this.f5265g;
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f5266h;
                    InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) this.f5264f;
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
                    int m3975r = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m = c2395p2.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m346e);
                    InterfaceC3510j.f16935d.getClass();
                    InterfaceC3277a interfaceC3277a2 = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(interfaceC3277a2);
                    } else {
                        c2395p2.m3883m0();
                    }
                    C3504h c3504h = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
                    C3504h c3504h2 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
                    C3504h c3504h3 = C3507i.f16932f;
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p2, m3975r, c3504h3);
                    }
                    C3504h c3504h4 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
                    float f7 = 16;
                    InterfaceC3810r m338i = AbstractC0154b.m338i(AbstractC0155c.m346e(c3807o, 1.0f), f7, 12);
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m338i);
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(interfaceC3277a2);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
                    AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r2))) {
                        AbstractC2487d.m4050n(m3975r2, c2395p2, m3975r2, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
                    AbstractC1949m2.m3140b(AbstractC3393k.m5146q(), null, AbstractC0154b.m340k(c3807o, 0.0f, 0.0f, 8, 0.0f, 11), ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11807a, c2395p2, 432, 0);
                    String str = enumC0964ie.f4830e;
                    C1604o0 c1604o0 = ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11251h;
                    if (1.0f > 0.0d) {
                        float f8 = Float.MAX_VALUE;
                        if (1.0f <= Float.MAX_VALUE) {
                            f8 = 1.0f;
                        }
                        AbstractC1850a7.m3108b(str, new LayoutWeightElement(f8, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p2, 0, 0, 65532);
                        c2395p2.m3857Z(694859607);
                        AbstractC1991r4.m3167h(interfaceC3277a, null, false, null, null, null, AbstractC1104n1.f6150q, c2395p2, 805306368, 510);
                        c2395p2.m3888r(false);
                        c2395p2.m3888r(true);
                        AbstractC2017u6.m3188a(enumC0964ie.ordinal(), null, 0L, 0L, 0.0f, null, null, AbstractC3178i.m4873d(359104528, new C1232r5(6, enumC0964ie, interfaceC3279c2), c2395p2), c2395p2, 12582912);
                        InterfaceC3810r m349h = AbstractC0155c.m349h(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, 520, 1);
                        C3137j0 c3137j0 = new C3137j0(f7, f7, f7, f7);
                        C3130g m4843g = AbstractC3136j.m4843g(10);
                        c2395p2.m3857Z(434791108);
                        boolean m3870g2 = c2395p2.m3870g(enumC0964ie);
                        Object m3847O2 = c2395p2.m3847O();
                        if (m3870g2 || m3847O2 == C2375k.f13421a) {
                            m3847O2 = new C0932he(enumC0964ie, 0);
                            c2395p2.m3877j0(m3847O2);
                        }
                        c2395p2.m3888r(false);
                        AbstractC2064e.m3235e(24966, 234, c2395p2, null, m4843g, c3137j0, (InterfaceC3279c) m3847O2, null, null, m349h, false);
                        c2395p2.m3888r(true);
                    } else {
                        throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                }
                return C1694m.f10482a;
            case 2:
                C2395p c2395p3 = (C2395p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$DropdownMenu");
                if ((intValue3 & 17) == 16 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    List<C1189po> list = (List) this.f5265g;
                    InterfaceC3279c interfaceC3279c3 = (InterfaceC3279c) this.f5264f;
                    InterfaceC3279c interfaceC3279c4 = (InterfaceC3279c) this.f5266h;
                    for (C1189po c1189po : list) {
                        C3173d m4873d2 = AbstractC3178i.m4873d(-1451058352, new C1324u4(9, c1189po), c2395p3);
                        c2395p3.m3857Z(-1594885672);
                        boolean m3870g3 = c2395p3.m3870g(interfaceC3279c3) | c2395p3.m3870g(interfaceC3279c4) | c2395p3.m3874i(c1189po);
                        Object m3847O3 = c2395p3.m3847O();
                        if (m3870g3 || m3847O3 == C2375k.f13421a) {
                            m3847O3 = new C1384w2(13, interfaceC3279c4, c1189po, interfaceC3279c3);
                            c2395p3.m3877j0(m3847O3);
                        }
                        c2395p3.m3888r(false);
                        AbstractC1978q.m3151b(m4873d2, (InterfaceC3277a) m3847O3, null, null, false, null, null, c2395p3, 6, 508);
                    }
                }
                return C1694m.f10482a;
            case 3:
                C2395p c2395p4 = (C2395p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue4 & 17) == 16 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    InterfaceC3810r m338i2 = AbstractC0154b.m338i(C3807o.f17991a, 14, 10);
                    C3130g m4843g2 = AbstractC3136j.m4843g(8);
                    InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f5266h;
                    String str2 = (String) this.f5265g;
                    String str3 = (String) this.f5264f;
                    C3152r m4857a2 = AbstractC3150q.m4857a(m4843g2, C3795c.f17976q, c2395p4, 6);
                    int m3975r3 = AbstractC2418w.m3975r(c2395p4);
                    InterfaceC2385m1 m3882m3 = c2395p4.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p4, m338i2);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p4.m3863c0();
                    if (c2395p4.f13485S) {
                        c2395p4.m3880l(c3558z);
                    } else {
                        c2395p4.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a2, c2395p4, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m3, c2395p4, C3507i.f16930d);
                    C3504h c3504h5 = C3507i.f16932f;
                    if (c2395p4.f13485S || !AbstractC3367j.m5096a(c2395p4.m3847O(), Integer.valueOf(m3975r3))) {
                        AbstractC2487d.m4050n(m3975r3, c2395p4, m3975r3, c3504h5);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p4, C3507i.f16929c);
                    c2395p4.m3857Z(-2046289849);
                    Iterator it = ((List) interfaceC2425y02.getValue()).iterator();
                    boolean z7 = false;
                    int i9 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i10 = i9 + 1;
                        if (i9 >= 0) {
                            C1404wm c1404wm = (C1404wm) next;
                            c2395p4.m3857Z(-2046288785);
                            if (i9 > 0) {
                                AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p4.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p4, 0, 3);
                            }
                            c2395p4.m3888r(z7);
                            C2395p c2395p5 = c2395p4;
                            String str4 = str2;
                            String str5 = str3;
                            AbstractC1850a7.m3108b(c1404wm.f8498a, null, 0L, 0L, C2300k.f13235j, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p4.m3878k(AbstractC1913h7.f11292a)).f11256m, c2395p5, 196608, 0, 65502);
                            c2395p4 = c2395p5;
                            AbstractC1092mk.m1833o1(AbstractC1092mk.m1838p1(str4, c1404wm.f8499b, c1404wm.f8501d), c2395p4);
                            AbstractC1092mk.m1833o1(AbstractC1092mk.m1838p1(str5, c1404wm.f8500c, c1404wm.f8502e), c2395p4);
                            it = it;
                            str2 = str4;
                            str3 = str5;
                            i9 = i10;
                            z7 = false;
                        } else {
                            AbstractC1806n.m3072T();
                            throw null;
                        }
                    }
                    c2395p4.m3888r(z7);
                    c2395p4.m3888r(true);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p6 = (C2395p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue5 & 17) == 16 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    float f9 = 10;
                    C3807o c3807o2 = C3807o.f17991a;
                    InterfaceC3810r m338i3 = AbstractC0154b.m338i(c3807o2, f9, f9);
                    C3130g m4843g3 = AbstractC3136j.m4843g(f9);
                    C3173d c3173d = (C3173d) this.f5265g;
                    C2266e c2266e = (C2266e) this.f5264f;
                    String str6 = (String) this.f5266h;
                    C3152r m4857a3 = AbstractC3150q.m4857a(m4843g3, C3795c.f17976q, c2395p6, 6);
                    int m3975r4 = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m4 = c2395p6.m3882m();
                    InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p6, m338i3);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z2);
                    } else {
                        c2395p6.m3883m0();
                    }
                    C3504h c3504h6 = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4857a3, c2395p6, c3504h6);
                    C3504h c3504h7 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m4, c2395p6, c3504h7);
                    C3504h c3504h8 = C3507i.f16932f;
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r4))) {
                        AbstractC2487d.m4050n(m3975r4, c2395p6, m3975r4, c3504h8);
                    }
                    C3504h c3504h9 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c4, c2395p6, c3504h9);
                    C3801i c3801i = C3795c.f17974o;
                    InterfaceC3810r m346e2 = AbstractC0155c.m346e(c3807o2, 1.0f);
                    c2395p6.m3857Z(1343516482);
                    c2395p6.m3888r(false);
                    InterfaceC3810r mo5829e = m346e2.mo5829e(c3807o2);
                    C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, c3801i, c2395p6, 48);
                    int m3975r5 = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m5 = c2395p6.m3882m();
                    InterfaceC3810r m5823c5 = AbstractC3793a.m5823c(c2395p6, mo5829e);
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z2);
                    } else {
                        c2395p6.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a2, c2395p6, c3504h6);
                    AbstractC2418w.m3954C(m3882m5, c2395p6, c3504h7);
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r5))) {
                        AbstractC2487d.m4050n(m3975r5, c2395p6, m3975r5, c3504h8);
                    }
                    AbstractC2418w.m3954C(m5823c5, c2395p6, c3504h9);
                    InterfaceC3810r m353l = AbstractC0155c.m353l(AbstractC0154b.m340k(c3807o2, 0.0f, 0.0f, 6, 0.0f, 11), 16);
                    C2394o2 c2394o2 = AbstractC2019v0.f11943a;
                    AbstractC1949m2.m3140b(c2266e, null, m353l, ((C2003t0) c2395p6.m3878k(c2394o2)).f11807a, c2395p6, 432, 0);
                    if (1.0f > 0.0d) {
                        float f10 = Float.MAX_VALUE;
                        if (1.0f <= Float.MAX_VALUE) {
                            f10 = 1.0f;
                        }
                        AbstractC1850a7.m3108b(str6, new LayoutWeightElement(f10, true), ((C2003t0) c2395p6.m3878k(c2394o2)).f11807a, 0L, C2300k.f13235j, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p6.m3878k(AbstractC1913h7.f11292a)).f11252i, c2395p6, 196608, 0, 65496);
                        c2395p6.m3857Z(740208370);
                        c2395p6.m3888r(false);
                        c2395p6.m3888r(true);
                        c3173d.mo24c(C3154s.f15836a, c2395p6, 6);
                        c2395p6.m3888r(true);
                    } else {
                        throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                }
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C1023kd(Object obj, Object obj2, Object obj3, int i7) {
        this.f5263e = i7;
        this.f5265g = obj;
        this.f5264f = obj2;
        this.f5266h = obj3;
    }

    public C1023kd(InterfaceC2425y0 interfaceC2425y0, String str, String str2) {
        this.f5263e = 3;
        this.f5266h = interfaceC2425y0;
        this.f5265g = str;
        this.f5264f = str2;
    }
}
