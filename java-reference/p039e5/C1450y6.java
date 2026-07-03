package p039e5;

import androidx.compose.animation.AbstractC0144a;
import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p017c.C0328m;
import p024c6.AbstractC0444k;
import p035e1.C0677s;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1951m4;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p063i0.C2036x1;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p092m.AbstractC2501q;
import p092m.C2493i;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p161v0.C3472s;
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
/* renamed from: e5.y6 */
/* loaded from: classes.dex */
public final class C1450y6 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f9290e;

    /* renamed from: f */
    public final /* synthetic */ boolean f9291f;

    /* renamed from: g */
    public final /* synthetic */ Object f9292g;

    /* renamed from: h */
    public final /* synthetic */ Object f9293h;

    /* renamed from: i */
    public final /* synthetic */ Object f9294i;

    public C1450y6(C1497zm c1497zm, List list, boolean z7, C2349d1 c2349d1) {
        this.f9290e = 4;
        this.f9294i = c1497zm;
        this.f9292g = list;
        this.f9291f = z7;
        this.f9293h = c2349d1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x05fb, code lost:
    
        if (p158u5.AbstractC3367j.m5096a(r1.m3847O(), java.lang.Integer.valueOf(r5)) == false) goto L144;
     */
    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean m3874i;
        int i7;
        boolean m3874i2;
        int i8;
        String str;
        C2395p c2395p;
        EnumC0876fm enumC0876fm;
        String str2;
        String str3;
        boolean z7;
        String str4;
        String str5;
        String str6;
        List list;
        String str7;
        EnumC0876fm m2225J;
        C3472s c3472s;
        String str8;
        String str9;
        C3807o c3807o;
        String str10;
        boolean z8;
        boolean z9;
        String str11;
        int i9 = this.f9290e;
        boolean z10 = this.f9291f;
        C3807o c3807o2 = C3807o.f17991a;
        Object obj4 = C2375k.f13421a;
        C1694m c1694m = C1694m.f10482a;
        Object obj5 = this.f9293h;
        Object obj6 = this.f9294i;
        Object obj7 = this.f9292g;
        int i10 = 6;
        switch (i9) {
            case 0:
                C2036x1 c2036x1 = (C2036x1) obj;
                C2395p c2395p2 = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj7;
                AbstractC3367j.m5100e(c2036x1, "$this$ExposedDropdownMenuBox");
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        m3874i = c2395p2.m3870g(c2036x1);
                    } else {
                        m3874i = c2395p2.m3874i(c2036x1);
                    }
                    if (m3874i) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    intValue |= i7;
                }
                if ((intValue & 19) == 18 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    String str12 = ((EnumC1125nm) obj6).f6348e;
                    C1604o0 c1604o0 = ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l;
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c2036x1.m3205b(), 1.0f);
                    c2395p2.m3857Z(1366168600);
                    Object m3847O = c2395p2.m3847O();
                    if (m3847O == obj4) {
                        m3847O = new C1263s5(3);
                        c2395p2.m3877j0(m3847O);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1847a4.m3102a(str12, (InterfaceC3279c) m3847O, m346e, this.f9291f, true, c1604o0, AbstractC0792d1.f3245T, null, null, AbstractC3178i.m4873d(1278508044, new C1200q4(interfaceC2425y0, i10), c2395p2), null, null, null, null, true, 0, 0, null, null, c2395p2, 806903856, 12582912, 8256896);
                    boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    c2395p2.m3857Z(1366185482);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3847O2 == obj4) {
                        m3847O2 = new C1353v2(interfaceC2425y0, 16);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    c2036x1.m3204a(booleanValue, (InterfaceC3277a) m3847O2, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(439889299, new C1419x6((InterfaceC3279c) obj5, interfaceC2425y0, 0), c2395p2), c2395p2, 48, 6 | ((intValue << 3) & 112));
                }
                return c1694m;
            case 1:
                C2036x1 c2036x12 = (C2036x1) obj;
                C2395p c2395p3 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj7;
                AbstractC3367j.m5100e(c2036x12, "$this$ExposedDropdownMenuBox");
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        m3874i2 = c2395p3.m3870g(c2036x12);
                    } else {
                        m3874i2 = c2395p3.m3874i(c2036x12);
                    }
                    if (m3874i2) {
                        i8 = 4;
                    } else {
                        i8 = 2;
                    }
                    intValue2 |= i8;
                }
                if ((intValue2 & 19) == 18 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    String str13 = ((EnumC1163ot) obj6).f6742f;
                    C1604o0 c1604o02 = ((C1904g7) c2395p3.m3878k(AbstractC1913h7.f11292a)).f11255l;
                    InterfaceC3810r m346e2 = AbstractC0155c.m346e(c2036x12.m3205b(), 1.0f);
                    c2395p3.m3857Z(1608334707);
                    Object m3847O3 = c2395p3.m3847O();
                    if (m3847O3 == obj4) {
                        m3847O3 = new C1263s5(4);
                        c2395p3.m3877j0(m3847O3);
                    }
                    c2395p3.m3888r(false);
                    AbstractC1847a4.m3102a(str13, (InterfaceC3279c) m3847O3, m346e2, this.f9291f, true, c1604o02, AbstractC0792d1.f3263f0, null, null, AbstractC3178i.m4873d(-583359304, new C1200q4(interfaceC2425y02, 7), c2395p3), null, null, null, null, true, 0, 0, null, null, c2395p3, 806903856, 12582912, 8256896);
                    boolean booleanValue2 = ((Boolean) interfaceC2425y02.getValue()).booleanValue();
                    c2395p3.m3857Z(1608351589);
                    Object m3847O4 = c2395p3.m3847O();
                    if (m3847O4 == obj4) {
                        m3847O4 = new C1353v2(interfaceC2425y02, 17);
                        c2395p3.m3877j0(m3847O4);
                    }
                    c2395p3.m3888r(false);
                    c2036x12.m3204a(booleanValue2, (InterfaceC3277a) m3847O4, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(957878399, new C1419x6((InterfaceC3279c) obj5, interfaceC2425y02, 1), c2395p3), c2395p3, 48, 6 | ((intValue2 << 3) & 112));
                }
                return c1694m;
            case 2:
                C2395p c2395p4 = (C2395p) obj2;
                ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                C3130g m4843g = AbstractC3136j.m4843g(4);
                C1393wb c1393wb = (C1393wb) obj6;
                C1486zb c1486zb = (C1486zb) obj7;
                List<C1187pm> list2 = c1486zb.f9846c;
                C0915gt c0915gt = (C0915gt) obj5;
                C3152r m4857a = AbstractC3150q.m4857a(m4843g, C3795c.f17976q, c2395p4, 6);
                int m3975r = AbstractC2418w.m3975r(c2395p4);
                InterfaceC2385m1 m3882m = c2395p4.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p4, c3807o2);
                InterfaceC3510j.f16935d.getClass();
                C3558z c3558z = C3507i.f16928b;
                c2395p4.m3863c0();
                if (c2395p4.f13485S) {
                    c2395p4.m3880l(c3558z);
                } else {
                    c2395p4.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p4, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m, c2395p4, C3507i.f16930d);
                C3504h c3504h = C3507i.f16932f;
                if (c2395p4.f13485S || !AbstractC3367j.m5096a(c2395p4.m3847O(), Integer.valueOf(m3975r))) {
                    AbstractC2487d.m4050n(m3975r, c2395p4, m3975r, c3504h);
                }
                AbstractC2418w.m3954C(m5823c, c2395p4, C3507i.f16929c);
                if (c1393wb != null && (str6 = c1393wb.f8322a) != null && z10) {
                    str = str6;
                } else {
                    str = null;
                }
                c2395p4.m3857Z(-670643390);
                if (str == null) {
                    c2395p = c2395p4;
                } else {
                    AbstractC1850a7.m3108b(str, null, ((C2003t0) c2395p4.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p4.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p4, 0, 3120, 55290);
                    c2395p = c2395p4;
                }
                c2395p.m3888r(false);
                List<C1187pm> list3 = c1486zb.f9847d;
                boolean isEmpty = list2.isEmpty();
                EnumC0876fm enumC0876fm2 = EnumC0876fm.f4043g;
                if (isEmpty) {
                    c2395p.m3857Z(685447129);
                    AbstractC1092mk.m1886z("", "内网 · 获取失败", null, null, enumC0876fm2, c2395p, 28086);
                    enumC0876fm = enumC0876fm2;
                    c2395p.m3888r(false);
                } else {
                    enumC0876fm = enumC0876fm2;
                    c2395p.m3857Z(685901465);
                    for (C1187pm c1187pm : list2) {
                        String str14 = c1187pm.f6906d;
                        String str15 = c1187pm.f6905c;
                        String str16 = c1187pm.f6904b;
                        if (AbstractC0444k.m937a0(str14)) {
                            str14 = "内网";
                        }
                        String str17 = str14 + " " + c1187pm.f6903a.f5313e + " · ";
                        if (AbstractC0444k.m937a0(str16)) {
                            str2 = str15;
                        } else {
                            str2 = str16;
                        }
                        if (AbstractC1249rm.m2224I0(str16, str15)) {
                            str3 = str15;
                        } else {
                            str3 = null;
                        }
                        AbstractC1092mk.m1886z(str17, str2, str3, c1187pm.f6907e, c1187pm.f6908f, c2395p, 0);
                    }
                    c2395p.m3888r(false);
                }
                c2395p.m3857Z(-670579826);
                if (!AbstractC0444k.m937a0(c0915gt.f4378b)) {
                    if (list3.isEmpty()) {
                        c2395p.m3857Z(686942662);
                        AbstractC1092mk.m1886z("", AbstractC2487d.m4058v("外网 · ", c0915gt.f4378b), null, null, enumC0876fm, c2395p, 28038);
                        z7 = false;
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(687444149);
                        for (C1187pm c1187pm2 : list3) {
                            EnumC1032km enumC1032km = c1187pm2.f6903a;
                            String str18 = c1187pm2.f6905c;
                            String str19 = c1187pm2.f6904b;
                            String m185l = AbstractC0094y0.m185l("外网 ", enumC1032km.f5313e, " · ");
                            if (AbstractC0444k.m937a0(str19)) {
                                str4 = str18;
                            } else {
                                str4 = str19;
                            }
                            if (AbstractC1249rm.m2224I0(str19, str18)) {
                                str5 = str18;
                            } else {
                                str5 = null;
                            }
                            AbstractC1092mk.m1886z(m185l, str4, str5, c1187pm2.f6907e, c1187pm2.f6908f, c2395p, 0);
                        }
                        z7 = false;
                        c2395p.m3888r(false);
                    }
                } else {
                    z7 = false;
                }
                c2395p.m3888r(z7);
                c2395p.m3888r(true);
                return c1694m;
            case 3:
                C2395p c2395p5 = (C2395p) obj2;
                ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                float f7 = 6;
                C3130g m4843g2 = AbstractC3136j.m4843g(f7);
                C0915gt c0915gt2 = (C0915gt) obj6;
                Map map = (Map) obj7;
                final C3472s c3472s2 = (C3472s) obj5;
                C3800h c3800h = C3795c.f17976q;
                C3152r m4857a2 = AbstractC3150q.m4857a(m4843g2, c3800h, c2395p5, 6);
                int m3975r2 = AbstractC2418w.m3975r(c2395p5);
                InterfaceC2385m1 m3882m2 = c2395p5.m3882m();
                C3807o c3807o3 = C3807o.f17991a;
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p5, c3807o3);
                InterfaceC3510j.f16935d.getClass();
                C3558z c3558z2 = C3507i.f16928b;
                c2395p5.m3863c0();
                if (c2395p5.f13485S) {
                    c2395p5.m3880l(c3558z2);
                } else {
                    c2395p5.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a2, c2395p5, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m2, c2395p5, C3507i.f16930d);
                C3504h c3504h2 = C3507i.f16932f;
                if (c2395p5.f13485S || !AbstractC3367j.m5096a(c2395p5.m3847O(), Integer.valueOf(m3975r2))) {
                    AbstractC2487d.m4050n(m3975r2, c2395p5, m3975r2, c3504h2);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p5, C3507i.f16929c);
                c2395p5.m3857Z(-1763615484);
                List list4 = c0915gt2.f4379c;
                Iterator it = list4.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        final C1486zb c1486zb2 = (C1486zb) next;
                        float f8 = AbstractC1092mk.f5952h;
                        List list5 = c1486zb2.f9846c;
                        String str20 = c1486zb2.f9845b;
                        String str21 = c1486zb2.f9844a;
                        float f9 = f7;
                        List list6 = c1486zb2.f9847d;
                        int ordinal = AbstractC1249rm.m2225J(list5).ordinal();
                        if (ordinal != 0) {
                            list = list4;
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    str7 = "内网拥塞";
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                str7 = "内网轻微拥塞";
                            }
                        } else {
                            list = list4;
                            int ordinal2 = AbstractC1249rm.m2225J(list6).ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 == 2) {
                                        str7 = "外网拥塞";
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    str7 = "外网轻微拥塞";
                                }
                            } else {
                                str7 = null;
                            }
                        }
                        String str22 = str7;
                        if (AbstractC0779ck.f3162a[AbstractC1249rm.m2225J(list5).ordinal()] == 3) {
                            m2225J = AbstractC1249rm.m2225J(list6);
                        } else {
                            m2225J = AbstractC1249rm.m2225J(list5);
                        }
                        long m1890z3 = AbstractC1092mk.m1890z3(m2225J);
                        C1393wb c1393wb2 = (C1393wb) map.get(str21);
                        boolean m5096a = AbstractC3367j.m5096a(c3472s2.get(str21), Boolean.TRUE);
                        final boolean z11 = !m5096a;
                        InterfaceC3810r m346e3 = AbstractC0155c.m346e(c3807o3, 1.0f);
                        c2395p5.m3857Z(133376371);
                        boolean m3874i3 = c2395p5.m3874i(c1486zb2) | c2395p5.m3872h(z11);
                        Map map2 = map;
                        Object m3847O5 = c2395p5.m3847O();
                        if (m3874i3 || m3847O5 == obj4) {
                            m3847O5 = new InterfaceC3277a() { // from class: e5.zj
                                @Override // p150t5.InterfaceC3277a
                                /* renamed from: a */
                                public final Object mo52a() {
                                    Boolean valueOf = Boolean.valueOf(z11);
                                    C3472s.this.put(c1486zb2.f9844a, valueOf);
                                    return C1694m.f10482a;
                                }
                            };
                            c2395p5.m3877j0(m3847O5);
                        }
                        c2395p5.m3888r(false);
                        Iterator it2 = it;
                        InterfaceC3810r m322e = AbstractC0145a.m322e(7, null, (InterfaceC3277a) m3847O5, m346e3, false);
                        C3152r m4857a3 = AbstractC3150q.m4857a(AbstractC3136j.f15791c, c3800h, c2395p5, 0);
                        int m3975r3 = AbstractC2418w.m3975r(c2395p5);
                        InterfaceC2385m1 m3882m3 = c2395p5.m3882m();
                        InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p5, m322e);
                        InterfaceC3510j.f16935d.getClass();
                        C3558z c3558z3 = C3507i.f16928b;
                        c2395p5.m3863c0();
                        C3800h c3800h2 = c3800h;
                        if (c2395p5.f13485S) {
                            c2395p5.m3880l(c3558z3);
                        } else {
                            c2395p5.m3883m0();
                        }
                        C3504h c3504h3 = C3507i.f16931e;
                        AbstractC2418w.m3954C(m4857a3, c2395p5, c3504h3);
                        C3504h c3504h4 = C3507i.f16930d;
                        AbstractC2418w.m3954C(m3882m3, c2395p5, c3504h4);
                        C3504h c3504h5 = C3507i.f16932f;
                        if (!c2395p5.f13485S) {
                            c3472s = c3472s2;
                            break;
                        } else {
                            c3472s = c3472s2;
                        }
                        AbstractC2487d.m4050n(m3975r3, c2395p5, m3975r3, c3504h5);
                        C3504h c3504h6 = C3507i.f16929c;
                        AbstractC2418w.m3954C(m5823c3, c2395p5, c3504h6);
                        InterfaceC3810r m346e4 = AbstractC0155c.m346e(c3807o3, 1.0f);
                        C3807o c3807o4 = c3807o3;
                        C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(f9), C3795c.f17974o, c2395p5, 54);
                        int m3975r4 = AbstractC2418w.m3975r(c2395p5);
                        InterfaceC2385m1 m3882m4 = c2395p5.m3882m();
                        InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p5, m346e4);
                        c2395p5.m3863c0();
                        if (c2395p5.f13485S) {
                            c2395p5.m3880l(c3558z3);
                        } else {
                            c2395p5.m3883m0();
                        }
                        AbstractC2418w.m3954C(m4854a, c2395p5, c3504h3);
                        AbstractC2418w.m3954C(m3882m4, c2395p5, c3504h4);
                        if (c2395p5.f13485S || !AbstractC3367j.m5096a(c2395p5.m3847O(), Integer.valueOf(m3975r4))) {
                            AbstractC2487d.m4050n(m3975r4, c2395p5, m3975r4, c3504h5);
                        }
                        AbstractC2418w.m3954C(m5823c4, c2395p5, c3504h6);
                        if (list.size() <= 1 && AbstractC0444k.m937a0(str20)) {
                            str20 = "链路";
                        }
                        String str23 = str20;
                        if (c1393wb2 != null) {
                            str8 = c1393wb2.f8324c;
                        } else {
                            str8 = null;
                        }
                        if (c1393wb2 != null) {
                            str9 = c1393wb2.f8323b;
                        } else {
                            str9 = null;
                        }
                        C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                        C1604o0 c1604o03 = ((C1904g7) c2395p5.m3878k(c2394o2)).f11257n;
                        C2300k c2300k = C2300k.f13235j;
                        if (1.0f > 0.0d) {
                            AbstractC1249rm.m2266j(str23, str9, str8, new LayoutWeightElement(1.0f, false), c1604o03, c2300k, c2395p5, 196608, 0);
                            c2395p5.m3857Z(-670693881);
                            if (str22 != null) {
                                AbstractC1850a7.m3108b(str22, null, m1890z3, 0L, c2300k, null, 0L, null, 0L, 0, false, 1, 0, ((C1904g7) c2395p5.m3878k(c2394o2)).f11258o, c2395p5, 196608, 3456, 53210);
                            }
                            c2395p5.m3888r(false);
                            c2395p5.m3888r(true);
                            c2395p5.m3857Z(868447577);
                            boolean z12 = this.f9291f;
                            if (m5096a) {
                                if (c1393wb2 != null) {
                                    str10 = c1393wb2.f8322a;
                                } else {
                                    str10 = null;
                                }
                                if (str10 != null && z12) {
                                    AbstractC1850a7.m3108b(c1393wb2.f8322a, null, ((C2003t0) c2395p5.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p5.m3878k(c2394o2)).f11258o, c2395p5, 0, 3120, 55290);
                                }
                            }
                            c2395p5.m3888r(false);
                            c2395p5.m3888r(true);
                            AbstractC0144a.m315b(C3154s.f15836a, z11, null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(-94846890, new C1450y6(c1393wb2, c1486zb2, c0915gt2, z12, 2), c2395p5), c2395p5, 1600518);
                            c2395p5.m3857Z(-1763401358);
                            if (list.size() > 1 && i11 < AbstractC1806n.m3066N(list)) {
                                c3807o = c3807o4;
                                AbstractC1991r4.m3164e(AbstractC0154b.m340k(c3807o4, 0.0f, 4, 0.0f, 0.0f, 13), 0.0f, C0677s.m1453b(0.35f, ((C2003t0) c2395p5.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p5, 6, 2);
                            } else {
                                c3807o = c3807o4;
                            }
                            c2395p5.m3888r(false);
                            map = map2;
                            c3807o3 = c3807o;
                            f7 = f9;
                            it = it2;
                            list4 = list;
                            c3800h = c3800h2;
                            i11 = i12;
                            c3472s2 = c3472s;
                        } else {
                            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                        }
                    } else {
                        AbstractC1806n.m3072T();
                        throw null;
                    }
                }
                c2395p5.m3888r(false);
                c2395p5.m3888r(true);
                return c1694m;
            case 4:
                C2395p c2395p6 = (C2395p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue3 & 17) == 16 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    InterfaceC3810r m337h = AbstractC0154b.m337h(c3807o2, 14);
                    C1497zm c1497zm = (C1497zm) obj6;
                    List list7 = (List) obj7;
                    C2349d1 c2349d1 = (C2349d1) obj5;
                    C3152r m4857a4 = AbstractC3150q.m4857a(AbstractC3136j.m4843g(10), C3795c.f17976q, c2395p6, 6);
                    int m3975r5 = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m5 = c2395p6.m3882m();
                    InterfaceC3810r m5823c5 = AbstractC3793a.m5823c(c2395p6, m337h);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z4 = C3507i.f16928b;
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z4);
                    } else {
                        c2395p6.m3883m0();
                    }
                    C3504h c3504h7 = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4857a4, c2395p6, c3504h7);
                    C3504h c3504h8 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m5, c2395p6, c3504h8);
                    C3504h c3504h9 = C3507i.f16932f;
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r5))) {
                        AbstractC2487d.m4050n(m3975r5, c2395p6, m3975r5, c3504h9);
                    }
                    C3504h c3504h10 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c5, c2395p6, c3504h10);
                    InterfaceC3810r m346e5 = AbstractC0155c.m346e(c3807o2, 1.0f);
                    C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p6, 54);
                    int m3975r6 = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m6 = c2395p6.m3882m();
                    InterfaceC3810r m5823c6 = AbstractC3793a.m5823c(c2395p6, m346e5);
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z4);
                    } else {
                        c2395p6.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a2, c2395p6, c3504h7);
                    AbstractC2418w.m3954C(m3882m6, c2395p6, c3504h8);
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r6))) {
                        AbstractC2487d.m4050n(m3975r6, c2395p6, m3975r6, c3504h9);
                    }
                    AbstractC2418w.m3954C(m5823c6, c2395p6, c3504h10);
                    AbstractC1850a7.m3108b("队列压力", null, 0L, 0L, C2300k.f13236k, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p6, 196614, 0, 131038);
                    c2395p6.m3857Z(810000263);
                    if (z10) {
                        AbstractC1951m4.m3141a(AbstractC0155c.m353l(c3807o2, 16), 0L, 2, 0L, 0, c2395p6, 390, 26);
                    }
                    c2395p6.m3888r(false);
                    c2395p6.m3888r(true);
                    if (c1497zm.f9929d != null) {
                        c2395p6.m3857Z(-1313413207);
                        AbstractC1850a7.m3108b(c1497zm.f9929d, null, ((C2003t0) c2395p6.m3878k(AbstractC2019v0.f11943a)).f11829w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p6.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p6, 0, 0, 65530);
                        c2395p6.m3888r(false);
                    } else if (!c1497zm.f9928c) {
                        c2395p6.m3857Z(-1313121094);
                        AbstractC1850a7.m3108b("本机队列指标不可读（/proc 或 sysfs 被系统限制）。", null, ((C2003t0) c2395p6.m3878k(AbstractC2019v0.f11943a)).f11829w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p6.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p6, 6, 0, 65530);
                        c2395p6.m3888r(false);
                    } else if (list7.isEmpty()) {
                        c2395p6.m3857Z(-1312818162);
                        if (z10) {
                            str11 = "等待采样…";
                        } else {
                            str11 = "暂无监测数据";
                        }
                        AbstractC1850a7.m3108b(str11, null, ((C2003t0) c2395p6.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p6.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p6, 0, 0, 65530);
                        c2395p6.m3888r(false);
                    } else {
                        c2395p6.m3857Z(-1312500877);
                        c2395p6.m3857Z(1066040089);
                        if (list7.size() > 1) {
                            int m3741g = c2349d1.m3741g();
                            c2395p6.m3857Z(1066047605);
                            boolean m3870g = c2395p6.m3870g(c2349d1);
                            Object m3847O6 = c2395p6.m3847O();
                            if (m3870g || m3847O6 == obj4) {
                                m3847O6 = new C1215qj(c2349d1, 1);
                                c2395p6.m3877j0(m3847O6);
                            }
                            z8 = false;
                            c2395p6.m3888r(false);
                            AbstractC1249rm.m2286t(list7, m3741g, (InterfaceC3279c) m3847O6, c2395p6, 0);
                        } else {
                            z8 = false;
                        }
                        c2395p6.m3888r(z8);
                        C0718an c0718an = (C0718an) list7.get(c2349d1.m3741g());
                        if (c0718an.f2470w != null) {
                            c2395p6.m3857Z(-1312070194);
                            AbstractC1850a7.m3108b(c0718an.f2470w, null, ((C2003t0) c2395p6.m3878k(AbstractC2019v0.f11943a)).f11829w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p6.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p6, 0, 0, 65530);
                            z9 = false;
                            c2395p6.m3888r(false);
                        } else {
                            z9 = false;
                            c2395p6.m3857Z(-1311795100);
                            AbstractC1249rm.m2296y(c0718an, c2395p6, 0);
                            c2395p6.m3888r(false);
                        }
                        c2395p6.m3888r(z9);
                    }
                    c2395p6.m3888r(true);
                }
                return c1694m;
            default:
                C2395p c2395p7 = (C2395p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj7;
                AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
                if ((intValue4 & 17) == 16 && c2395p7.m3836D()) {
                    c2395p7.m3852U();
                } else {
                    AbstractC1850a7.m3108b("迁移测速、诊断、下载器与界面设置；不包含测速配置、历史记录、下载任务和下载目录授权。", null, ((C2003t0) c2395p7.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p7.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p7, 6, 0, 65530);
                    InterfaceC3810r m346e6 = AbstractC0155c.m346e(c3807o2, 1.0f);
                    C0328m c0328m = (C0328m) obj6;
                    C0328m c0328m2 = (C0328m) obj5;
                    C3147o0 m4854a3 = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(8), C3795c.f17973n, c2395p7, 6);
                    int m3975r7 = AbstractC2418w.m3975r(c2395p7);
                    InterfaceC2385m1 m3882m7 = c2395p7.m3882m();
                    InterfaceC3810r m5823c7 = AbstractC3793a.m5823c(c2395p7, m346e6);
                    InterfaceC3510j.f16935d.getClass();
                    InterfaceC3277a interfaceC3277a = C3507i.f16928b;
                    c2395p7.m3863c0();
                    if (c2395p7.f13485S) {
                        c2395p7.m3880l(interfaceC3277a);
                    } else {
                        c2395p7.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a3, c2395p7, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m7, c2395p7, C3507i.f16930d);
                    C3504h c3504h11 = C3507i.f16932f;
                    if (c2395p7.f13485S || !AbstractC3367j.m5096a(c2395p7.m3847O(), Integer.valueOf(m3975r7))) {
                        AbstractC2487d.m4050n(m3975r7, c2395p7, m3975r7, c3504h11);
                    }
                    AbstractC2418w.m3954C(m5823c7, c2395p7, C3507i.f16929c);
                    c2395p7.m3857Z(-1448820338);
                    boolean m3874i4 = c2395p7.m3874i(c0328m);
                    Object m3847O7 = c2395p7.m3847O();
                    if (m3874i4 || m3847O7 == obj4) {
                        m3847O7 = new C1051la(c0328m, 1);
                        c2395p7.m3877j0(m3847O7);
                    }
                    InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) m3847O7;
                    c2395p7.m3888r(false);
                    C3149p0 c3149p0 = C3149p0.f15825a;
                    InterfaceC3810r m4856a = c3149p0.m4856a(c3807o2, 1.0f, true);
                    C3173d c3173d = AbstractC1352v1.f8083q;
                    boolean z13 = this.f9291f;
                    AbstractC1991r4.m3166g(interfaceC3277a2, m4856a, z13, null, null, null, null, c3173d, c2395p7, 805306368, 504);
                    c2395p7.m3857Z(-1448809790);
                    boolean m3874i5 = c2395p7.m3874i(c0328m2);
                    Object m3847O8 = c2395p7.m3847O();
                    if (m3874i5 || m3847O8 == obj4) {
                        m3847O8 = new C1051la(c0328m2, 2);
                        c2395p7.m3877j0(m3847O8);
                    }
                    c2395p7.m3888r(false);
                    AbstractC1991r4.m3166g((InterfaceC3277a) m3847O8, c3149p0.m4856a(c3807o2, 1.0f, true), z13, null, null, null, null, AbstractC1352v1.f8084r, c2395p7, 805306368, 504);
                    c2395p7.m3888r(true);
                    c2395p7.m3857Z(138318854);
                    boolean m3870g2 = c2395p7.m3870g(interfaceC2425y03);
                    Object m3847O9 = c2395p7.m3847O();
                    if (m3870g2 || m3847O9 == obj4) {
                        m3847O9 = new C1035kp(interfaceC2425y03, 15);
                        c2395p7.m3877j0(m3847O9);
                    }
                    c2395p7.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O9, AbstractC0155c.m346e(c3807o2, 1.0f), this.f9291f, null, null, null, null, null, AbstractC1352v1.f8085s, c2395p7, 805306416, 504);
                }
                return c1694m;
        }
    }

    public /* synthetic */ C1450y6(Enum r12, boolean z7, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, int i7) {
        this.f9290e = i7;
        this.f9294i = r12;
        this.f9291f = z7;
        this.f9292g = interfaceC2425y0;
        this.f9293h = interfaceC3279c;
    }

    public /* synthetic */ C1450y6(Object obj, Object obj2, Object obj3, boolean z7, int i7) {
        this.f9290e = i7;
        this.f9294i = obj;
        this.f9292g = obj2;
        this.f9293h = obj3;
        this.f9291f = z7;
    }

    public C1450y6(InterfaceC2425y0 interfaceC2425y0, boolean z7, C0328m c0328m, C0328m c0328m2) {
        this.f9290e = 5;
        this.f9292g = interfaceC2425y0;
        this.f9291f = z7;
        this.f9294i = c0328m;
        this.f9293h = c0328m2;
    }
}
