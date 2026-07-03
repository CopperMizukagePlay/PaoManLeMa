package p039e5;

import java.util.Iterator;
import java.util.List;
import p017c.C0321f;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
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
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qg */
/* loaded from: classes.dex */
public final class C1212qg implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f7099e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f7100f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f7101g;

    /* renamed from: h */
    public final /* synthetic */ Object f7102h;

    /* renamed from: i */
    public final /* synthetic */ Object f7103i;

    /* renamed from: j */
    public final /* synthetic */ Object f7104j;

    public C1212qg(EnumC0770cb enumC0770cb, InterfaceC3279c interfaceC3279c, List list, List list2, InterfaceC3279c interfaceC3279c2) {
        this.f7102h = enumC0770cb;
        this.f7100f = interfaceC3279c;
        this.f7103i = list;
        this.f7104j = list2;
        this.f7101g = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        EnumC1331ub enumC1331ub;
        EnumC1300tb enumC1300tb;
        C2395p c2395p;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C1212qg c1212qg = this;
        switch (c1212qg.f7099e) {
            case 0:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C3130g m4843g = AbstractC3136j.m4843g(8);
                    EnumC0770cb enumC0770cb = (EnumC0770cb) c1212qg.f7102h;
                    List list = (List) c1212qg.f7103i;
                    List list2 = (List) c1212qg.f7104j;
                    C3152r m4857a = AbstractC3150q.m4857a(m4843g, C3795c.f17976q, c2395p2, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m = c2395p2.m3882m();
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, c3807o);
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
                    boolean z15 = true;
                    boolean z16 = false;
                    if (enumC0770cb == EnumC0770cb.f3018e) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c2395p2.m3857Z(677649565);
                    InterfaceC3279c interfaceC3279c = c1212qg.f7100f;
                    boolean m3870g = c2395p2.m3870g(interfaceC3279c);
                    Object m3847O = c2395p2.m3847O();
                    Object obj3 = C2375k.f13421a;
                    if (m3870g || m3847O == obj3) {
                        m3847O = new C1139o5(interfaceC3279c, 6);
                        c2395p2.m3877j0(m3847O);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1092mk.m1776d("当前选中配置", z7, (InterfaceC3277a) m3847O, c2395p2, 6);
                    if (enumC0770cb == EnumC0770cb.f3019f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c2395p2.m3857Z(677652760);
                    boolean m3870g2 = c2395p2.m3870g(interfaceC3279c);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3870g2 || m3847O2 == obj3) {
                        m3847O2 = new C1139o5(interfaceC3279c, 7);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1092mk.m1776d("全部配置", z8, (InterfaceC3277a) m3847O2, c2395p2, 6);
                    EnumC0770cb enumC0770cb2 = EnumC0770cb.f3020g;
                    if (enumC0770cb == enumC0770cb2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    c2395p2.m3857Z(677655932);
                    boolean m3870g3 = c2395p2.m3870g(interfaceC3279c);
                    Object m3847O3 = c2395p2.m3847O();
                    if (m3870g3 || m3847O3 == obj3) {
                        m3847O3 = new C1139o5(interfaceC3279c, 8);
                        c2395p2.m3877j0(m3847O3);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1092mk.m1776d("部分配置", z9, (InterfaceC3277a) m3847O3, c2395p2, 6);
                    c2395p2.m3857Z(677657991);
                    if (enumC0770cb == enumC0770cb2) {
                        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                            C1189po c1189po = (C1189po) it.next();
                            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
                            int m3975r2 = AbstractC2418w.m3975r(c2395p2);
                            InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, c3807o);
                            InterfaceC3510j.f16935d.getClass();
                            C3558z c3558z2 = C3507i.f16928b;
                            c2395p2.m3863c0();
                            if (c2395p2.f13485S) {
                                c2395p2.m3880l(c3558z2);
                            } else {
                                c2395p2.m3883m0();
                            }
                            AbstractC2418w.m3954C(m4854a, c2395p2, C3507i.f16931e);
                            AbstractC2418w.m3954C(m3882m2, c2395p2, C3507i.f16930d);
                            C3504h c3504h2 = C3507i.f16932f;
                            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r2))) {
                                AbstractC2487d.m4050n(m3975r2, c2395p2, m3975r2, c3504h2);
                            }
                            AbstractC2418w.m3954C(m5823c2, c2395p2, C3507i.f16929c);
                            boolean contains = list2.contains(Integer.valueOf(c1189po.f6926a));
                            c2395p2.m3857Z(1520005461);
                            InterfaceC3279c interfaceC3279c2 = c1212qg.f7101g;
                            boolean m3870g4 = c2395p2.m3870g(interfaceC3279c2) | c2395p2.m3874i(c1189po);
                            Object m3847O4 = c2395p2.m3847O();
                            if (m3870g4 || m3847O4 == obj3) {
                                m3847O4 = new C0321f(8, interfaceC3279c2, c1189po);
                                c2395p2.m3877j0(m3847O4);
                            }
                            c2395p2.m3888r(z16);
                            AbstractC1987r0.m3156a(contains, (InterfaceC3279c) m3847O4, null, false, null, c2395p2, 0, 60);
                            C2395p c2395p3 = c2395p2;
                            boolean z17 = z15;
                            AbstractC1850a7.m3108b(c1189po.f6927b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p3, 0, 0, 131070);
                            c2395p2 = c2395p3;
                            c2395p2.m3888r(z17);
                            z15 = z17;
                            z16 = z16;
                            c3807o = c3807o;
                            obj3 = obj3;
                            list2 = list2;
                            c1212qg = this;
                        }
                    }
                    c2395p2.m3888r(z16);
                    c2395p2.m3888r(z15);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    C3130g m4843g2 = AbstractC3136j.m4843g(8);
                    String str = (String) c1212qg.f7102h;
                    EnumC1331ub enumC1331ub2 = (EnumC1331ub) c1212qg.f7103i;
                    EnumC1300tb enumC1300tb2 = (EnumC1300tb) c1212qg.f7104j;
                    C3152r m4857a2 = AbstractC3150q.m4857a(m4843g2, C3795c.f17976q, c2395p4, 6);
                    int m3975r3 = AbstractC2418w.m3975r(c2395p4);
                    InterfaceC2385m1 m3882m3 = c2395p4.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p4, C3807o.f17991a);
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
                    if (c2395p4.f13485S || !AbstractC3367j.m5096a(c2395p4.m3847O(), Integer.valueOf(m3975r3))) {
                        AbstractC2487d.m4050n(m3975r3, c2395p4, m3975r3, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p4, C3507i.f16929c);
                    if (str != null) {
                        c2395p4.m3857Z(-292322323);
                        String concat = "待导入：".concat(str);
                        long j6 = ((C2003t0) c2395p4.m3878k(AbstractC2019v0.f11943a)).f11807a;
                        enumC1300tb = enumC1300tb2;
                        enumC1331ub = enumC1331ub2;
                        z10 = false;
                        AbstractC1850a7.m3108b(concat, null, j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 0, 0, 131066);
                        c2395p = c2395p4;
                        c2395p.m3888r(false);
                    } else {
                        z10 = false;
                        enumC1331ub = enumC1331ub2;
                        enumC1300tb = enumC1300tb2;
                        c2395p4.m3857Z(-292210227);
                        AbstractC1850a7.m3108b("可选择 .conf 文件，或粘贴 .conf 文本内容。", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 6, 0, 131070);
                        c2395p = c2395p4;
                        c2395p.m3888r(false);
                    }
                    C2300k c2300k = C2300k.f13234i;
                    C2395p c2395p5 = c2395p;
                    AbstractC1850a7.m3108b("导入方式", null, 0L, 0L, c2300k, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p5, 196614, 0, 131038);
                    if (enumC1331ub == EnumC1331ub.f7916e) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    c2395p5.m3857Z(1514600972);
                    InterfaceC3279c interfaceC3279c3 = this.f7100f;
                    boolean m3870g5 = c2395p5.m3870g(interfaceC3279c3);
                    Object m3847O5 = c2395p5.m3847O();
                    C2413u0 c2413u0 = C2375k.f13421a;
                    if (m3870g5 || m3847O5 == c2413u0) {
                        m3847O5 = new C1139o5(interfaceC3279c3, 9);
                        c2395p5.m3877j0(m3847O5);
                    }
                    c2395p5.m3888r(z10);
                    AbstractC1092mk.m1776d("追加导入", z11, (InterfaceC3277a) m3847O5, c2395p5, 6);
                    if (enumC1331ub == EnumC1331ub.f7917f) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    c2395p5.m3857Z(1514604301);
                    boolean m3870g6 = c2395p5.m3870g(interfaceC3279c3);
                    Object m3847O6 = c2395p5.m3847O();
                    if (m3870g6 || m3847O6 == c2413u0) {
                        m3847O6 = new C1139o5(interfaceC3279c3, 10);
                        c2395p5.m3877j0(m3847O6);
                    }
                    c2395p5.m3888r(z10);
                    AbstractC1092mk.m1776d("覆盖全部配置", z12, (InterfaceC3277a) m3847O6, c2395p5, 6);
                    AbstractC1850a7.m3108b("同名配置", null, 0L, 0L, c2300k, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p5, 196614, 0, 131038);
                    EnumC1300tb enumC1300tb3 = enumC1300tb;
                    if (enumC1300tb3 == EnumC1300tb.f7779e) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c2395p5.m3857Z(1514610370);
                    InterfaceC3279c interfaceC3279c4 = this.f7101g;
                    boolean m3870g7 = c2395p5.m3870g(interfaceC3279c4);
                    Object m3847O7 = c2395p5.m3847O();
                    if (m3870g7 || m3847O7 == c2413u0) {
                        m3847O7 = new C1139o5(interfaceC3279c4, 11);
                        c2395p5.m3877j0(m3847O7);
                    }
                    c2395p5.m3888r(false);
                    AbstractC1092mk.m1776d("保留两者（自动重命名）", z13, (InterfaceC3277a) m3847O7, c2395p5, 6);
                    if (enumC1300tb3 == EnumC1300tb.f7780f) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c2395p5.m3857Z(1514615971);
                    boolean m3870g8 = c2395p5.m3870g(interfaceC3279c4);
                    Object m3847O8 = c2395p5.m3847O();
                    if (m3870g8 || m3847O8 == c2413u0) {
                        m3847O8 = new C1139o5(interfaceC3279c4, 12);
                        c2395p5.m3877j0(m3847O8);
                    }
                    c2395p5.m3888r(false);
                    AbstractC1092mk.m1776d("覆盖原配置", z14, (InterfaceC3277a) m3847O8, c2395p5, 6);
                    c2395p5.m3888r(true);
                }
                return C1694m.f10482a;
        }
    }

    public C1212qg(String str, EnumC1331ub enumC1331ub, InterfaceC3279c interfaceC3279c, EnumC1300tb enumC1300tb, InterfaceC3279c interfaceC3279c2) {
        this.f7102h = str;
        this.f7103i = enumC1331ub;
        this.f7100f = interfaceC3279c;
        this.f7104j = enumC1300tb;
        this.f7101g = interfaceC3279c2;
    }
}
