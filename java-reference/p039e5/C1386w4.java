package p039e5;

import android.content.Context;
import androidx.compose.animation.AbstractC0144a;
import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p008b.C0242k0;
import p017c.C0320e;
import p017c.C0321f;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.AbstractC1951m4;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p063i0.C2036x1;
import p066i3.AbstractC2067b;
import p079k1.C2266e;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p092m.AbstractC2501q;
import p092m.C2493i;
import p102n1.AbstractC2710c;
import p144t.AbstractC3122c;
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
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p161v0.C3472s;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w4 */
/* loaded from: classes.dex */
public final class C1386w4 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f8294e = 2;

    /* renamed from: f */
    public final /* synthetic */ boolean f8295f;

    /* renamed from: g */
    public final /* synthetic */ Object f8296g;

    /* renamed from: h */
    public final /* synthetic */ Object f8297h;

    /* renamed from: i */
    public final /* synthetic */ Object f8298i;

    /* renamed from: j */
    public final /* synthetic */ Object f8299j;

    public C1386w4(C0703a8 c0703a8, Context context, boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        this.f8299j = c0703a8;
        this.f8297h = context;
        this.f8295f = z7;
        this.f8298i = interfaceC3279c;
        this.f8296g = interfaceC3279c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x021e, code lost:
    
        if (p158u5.AbstractC3367j.m5096a(r7.m3847O(), java.lang.Integer.valueOf(r2)) == false) goto L42;
     */
    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        InterfaceC2425y0 interfaceC2425y0;
        boolean m3874i;
        int i7;
        String str;
        InterfaceC2425y0 interfaceC2425y02;
        boolean m3874i2;
        int i8;
        boolean m3874i3;
        int i9;
        C2266e m5143n;
        String str2;
        C3807o c3807o;
        float f7;
        String str3;
        String str4;
        String str5;
        C3800h c3800h;
        Map map;
        boolean z7;
        C1386w4 c1386w4;
        switch (this.f8294e) {
            case 0:
                C2036x1 c2036x1 = (C2036x1) obj;
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f8297h;
                AbstractC3367j.m5100e(c2036x1, "$this$ExposedDropdownMenuBox");
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        m3874i = c2395p.m3870g(c2036x1);
                    } else {
                        m3874i = c2395p.m3874i(c2036x1);
                    }
                    if (m3874i) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    intValue |= i7;
                }
                if ((intValue & 19) == 18 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l;
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c2036x1.m3205b(), 1.0f);
                    String str6 = (String) this.f8299j;
                    c2395p.m3857Z(-967461112);
                    Object m3847O = c2395p.m3847O();
                    Object obj4 = C2375k.f13421a;
                    if (m3847O == obj4) {
                        m3847O = new C0242k0(28);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    int i10 = intValue;
                    AbstractC1847a4.m3102a(str6, (InterfaceC3279c) m3847O, m346e, this.f8295f, true, c1604o0, AbstractC0792d1.f3236K, null, AbstractC0792d1.f3237L, AbstractC3178i.m4873d(1293682810, new C1200q4(interfaceC2425y03, 1), c2395p), null, null, null, null, true, 0, 0, null, null, c2395p, 907567152, 12582912, 8256640);
                    boolean booleanValue = ((Boolean) interfaceC2425y03.getValue()).booleanValue();
                    c2395p.m3857Z(-967431686);
                    Object m3847O2 = c2395p.m3847O();
                    if (m3847O2 == obj4) {
                        interfaceC2425y0 = interfaceC2425y03;
                        m3847O2 = new C1353v2(interfaceC2425y0, 5);
                        c2395p.m3877j0(m3847O2);
                    } else {
                        interfaceC2425y0 = interfaceC2425y03;
                    }
                    c2395p.m3888r(false);
                    c2036x1.m3204a(booleanValue, (InterfaceC3277a) m3847O2, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(-2087763437, new C1355v4((InterfaceC3279c) this.f8298i, (List) this.f8296g, interfaceC2425y0), c2395p), c2395p, 48, 6 | ((i10 << 3) & 112));
                }
                return C1694m.f10482a;
            case 1:
                C2036x1 c2036x12 = (C2036x1) obj;
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                List list = (List) this.f8296g;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f8297h;
                AbstractC3367j.m5100e(c2036x12, "$this$ExposedDropdownMenuBox");
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        m3874i2 = c2395p2.m3870g(c2036x12);
                    } else {
                        m3874i2 = c2395p2.m3874i(c2036x12);
                    }
                    if (m3874i2) {
                        i8 = 4;
                    } else {
                        i8 = 2;
                    }
                    intValue2 |= i8;
                }
                if ((intValue2 & 19) == 18 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C0877fn c0877fn = (C0877fn) this.f8299j;
                    if (c0877fn == null || (str = c0877fn.m1527a()) == null) {
                        str = "解析中…";
                    }
                    C1604o0 c1604o02 = ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l;
                    InterfaceC3810r m346e2 = AbstractC0155c.m346e(c2036x12.m3205b(), 1.0f);
                    c2395p2.m3857Z(22288519);
                    Object m3847O3 = c2395p2.m3847O();
                    Object obj5 = C2375k.f13421a;
                    if (m3847O3 == obj5) {
                        m3847O3 = new C0242k0(29);
                        c2395p2.m3877j0(m3847O3);
                    }
                    c2395p2.m3888r(false);
                    int i11 = intValue2;
                    AbstractC1847a4.m3102a(str, (InterfaceC3279c) m3847O3, m346e2, this.f8295f, true, c1604o02, AbstractC0792d1.f3230E, null, AbstractC0792d1.f3231F, AbstractC3178i.m4873d(-698334800, new C1232r5(0, list, interfaceC2425y04), c2395p2), null, null, null, null, true, 0, 0, null, null, c2395p2, 907567152, 12582912, 8256640);
                    if (list.size() > 1) {
                        boolean booleanValue2 = ((Boolean) interfaceC2425y04.getValue()).booleanValue();
                        c2395p2.m3857Z(22319737);
                        Object m3847O4 = c2395p2.m3847O();
                        if (m3847O4 == obj5) {
                            interfaceC2425y02 = interfaceC2425y04;
                            m3847O4 = new C1353v2(interfaceC2425y02, 13);
                            c2395p2.m3877j0(m3847O4);
                        } else {
                            interfaceC2425y02 = interfaceC2425y04;
                        }
                        c2395p2.m3888r(false);
                        c2036x12.m3204a(booleanValue2, (InterfaceC3277a) m3847O4, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(-252781618, new C1355v4(list, (InterfaceC3279c) this.f8298i, interfaceC2425y02), c2395p2), c2395p2, 48, 6 | ((i11 << 3) & 112));
                    }
                }
                return C1694m.f10482a;
            case 2:
                C2395p c2395p3 = (C2395p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue3 & 17) == 16 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    AbstractC1328u8.m2361f("系统 DNS", AbstractC3178i.m4873d(771888468, new C1048l7((C0703a8) this.f8299j, (Context) this.f8297h, this.f8295f, (InterfaceC3279c) this.f8298i, (InterfaceC3279c) this.f8296g), c2395p3), c2395p3, 54);
                }
                return C1694m.f10482a;
            case 3:
                C2036x1 c2036x13 = (C2036x1) obj;
                C2395p c2395p4 = (C2395p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) this.f8297h;
                AbstractC3367j.m5100e(c2036x13, "$this$ExposedDropdownMenuBox");
                if ((intValue4 & 6) == 0) {
                    if ((intValue4 & 8) == 0) {
                        m3874i3 = c2395p4.m3870g(c2036x13);
                    } else {
                        m3874i3 = c2395p4.m3874i(c2036x13);
                    }
                    if (m3874i3) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    intValue4 |= i9;
                }
                if ((intValue4 & 19) == 18 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    C1604o0 c1604o03 = ((C1904g7) c2395p4.m3878k(AbstractC1913h7.f11292a)).f11255l;
                    InterfaceC3810r m346e3 = AbstractC0155c.m346e(c2036x13.m3205b(), 1.0f);
                    String str7 = (String) this.f8299j;
                    c2395p4.m3857Z(1848073004);
                    Object m3847O5 = c2395p4.m3847O();
                    Object obj6 = C2375k.f13421a;
                    if (m3847O5 == obj6) {
                        m3847O5 = new C0866fc(4);
                        c2395p4.m3877j0(m3847O5);
                    }
                    c2395p4.m3888r(false);
                    int i12 = intValue4;
                    AbstractC1847a4.m3102a(str7, (InterfaceC3279c) m3847O5, m346e3, this.f8295f, true, c1604o03, null, null, null, AbstractC3178i.m4873d(-1415434734, new C1200q4(interfaceC2425y05, 13), c2395p4), null, null, null, null, true, 0, 0, null, null, c2395p4, 805330992, 12582912, 8256960);
                    boolean booleanValue3 = ((Boolean) interfaceC2425y05.getValue()).booleanValue();
                    c2395p4.m3857Z(1848089982);
                    Object m3847O6 = c2395p4.m3847O();
                    if (m3847O6 == obj6) {
                        m3847O6 = new C0705aa(interfaceC2425y05, 16);
                        c2395p4.m3877j0(m3847O6);
                    }
                    c2395p4.m3888r(false);
                    c2036x13.m3204a(booleanValue3, (InterfaceC3277a) m3847O6, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(553832043, new C1023kd((ArrayList) this.f8296g, (InterfaceC3279c) this.f8298i, interfaceC2425y05, 0), c2395p4), c2395p4, 48, 6 | ((i12 << 3) & 112));
                }
                return C1694m.f10482a;
            case 4:
                C2395p c2395p5 = (C2395p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue5 & 17) == 16 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    float f8 = 10;
                    C3807o c3807o2 = C3807o.f17991a;
                    InterfaceC3810r m338i = AbstractC0154b.m338i(c3807o2, f8, f8);
                    C3130g m4843g = AbstractC3136j.m4843g(f8);
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f8297h;
                    C2266e c2266e = (C2266e) this.f8298i;
                    String str8 = (String) this.f8299j;
                    C3173d c3173d = (C3173d) this.f8296g;
                    C3152r m4857a = AbstractC3150q.m4857a(m4843g, C3795c.f17976q, c2395p5, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p5);
                    InterfaceC2385m1 m3882m = c2395p5.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p5, m338i);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p5.m3863c0();
                    if (c2395p5.f13485S) {
                        c2395p5.m3880l(c3558z);
                    } else {
                        c2395p5.m3883m0();
                    }
                    C3504h c3504h = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4857a, c2395p5, c3504h);
                    C3504h c3504h2 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m, c2395p5, c3504h2);
                    C3504h c3504h3 = C3507i.f16932f;
                    if (c2395p5.f13485S || !AbstractC3367j.m5096a(c2395p5.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p5, m3975r, c3504h3);
                    }
                    C3504h c3504h4 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c, c2395p5, c3504h4);
                    C3801i c3801i = C3795c.f17974o;
                    InterfaceC3810r m346e4 = AbstractC0155c.m346e(c3807o2, 1.0f);
                    c2395p5.m3857Z(-2143284972);
                    boolean m3870g = c2395p5.m3870g(interfaceC3277a);
                    Object m3847O7 = c2395p5.m3847O();
                    if (m3870g || m3847O7 == C2375k.f13421a) {
                        m3847O7 = new C1271sd(0, interfaceC3277a);
                        c2395p5.m3877j0(m3847O7);
                    }
                    c2395p5.m3888r(false);
                    InterfaceC3810r m322e = AbstractC0145a.m322e(7, null, (InterfaceC3277a) m3847O7, m346e4, false);
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, c3801i, c2395p5, 48);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p5);
                    InterfaceC2385m1 m3882m2 = c2395p5.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p5, m322e);
                    c2395p5.m3863c0();
                    if (c2395p5.f13485S) {
                        c2395p5.m3880l(c3558z);
                    } else {
                        c2395p5.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p5, c3504h);
                    AbstractC2418w.m3954C(m3882m2, c2395p5, c3504h2);
                    if (c2395p5.f13485S || !AbstractC3367j.m5096a(c2395p5.m3847O(), Integer.valueOf(m3975r2))) {
                        AbstractC2487d.m4050n(m3975r2, c2395p5, m3975r2, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p5, c3504h4);
                    InterfaceC3810r m353l = AbstractC0155c.m353l(AbstractC0154b.m340k(c3807o2, 0.0f, 0.0f, 6, 0.0f, 11), 16);
                    C2394o2 c2394o2 = AbstractC2019v0.f11943a;
                    AbstractC1949m2.m3140b(c2266e, null, m353l, ((C2003t0) c2395p5.m3878k(c2394o2)).f11807a, c2395p5, 432, 0);
                    if (1.0f > 0.0d) {
                        float f9 = Float.MAX_VALUE;
                        if (1.0f <= Float.MAX_VALUE) {
                            f9 = 1.0f;
                        }
                        AbstractC1850a7.m3108b(str8, new LayoutWeightElement(f9, true), ((C2003t0) c2395p5.m3878k(c2394o2)).f11807a, 0L, C2300k.f13235j, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p5.m3878k(AbstractC1913h7.f11292a)).f11252i, c2395p5, 196608, 0, 65496);
                        boolean z8 = this.f8295f;
                        if (z8) {
                            m5143n = AbstractC1793a0.m2993u();
                        } else {
                            m5143n = AbstractC3393k.m5143n();
                        }
                        if (z8) {
                            str2 = "收起";
                        } else {
                            str2 = "展开";
                        }
                        AbstractC1949m2.m3140b(m5143n, str2, AbstractC0155c.m353l(c3807o2, 20), ((C2003t0) c2395p5.m3878k(c2394o2)).f11825s, c2395p5, 384, 0);
                        c2395p5.m3888r(true);
                        AbstractC0144a.m315b(C3154s.f15836a, z8, null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(97301646, new C1231r4(c3173d, 1), c2395p5), c2395p5, 1600518);
                        c2395p5.m3888r(true);
                    } else {
                        throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                C2395p c2395p6 = (C2395p) obj2;
                int intValue6 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue6 & 17) == 16 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    float f10 = 8;
                    C3807o c3807o3 = C3807o.f17991a;
                    InterfaceC3810r m338i2 = AbstractC0154b.m338i(c3807o3, 10, f10);
                    C3130g m4843g2 = AbstractC3136j.m4843g(6);
                    InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) this.f8297h;
                    C0915gt c0915gt = (C0915gt) this.f8299j;
                    Map map2 = (Map) this.f8298i;
                    C3472s c3472s = (C3472s) this.f8296g;
                    C3152r m4857a2 = AbstractC3150q.m4857a(m4843g2, C3795c.f17976q, c2395p6, 6);
                    int m3975r3 = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m3 = c2395p6.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p6, m338i2);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z2);
                    } else {
                        c2395p6.m3883m0();
                    }
                    C3504h c3504h5 = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4857a2, c2395p6, c3504h5);
                    C3504h c3504h6 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m3, c2395p6, c3504h6);
                    C3504h c3504h7 = C3507i.f16932f;
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r3))) {
                        AbstractC2487d.m4050n(m3975r3, c2395p6, m3975r3, c3504h7);
                    }
                    C3504h c3504h8 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c3, c2395p6, c3504h8);
                    InterfaceC3810r m346e5 = AbstractC0155c.m346e(c3807o3, 1.0f);
                    c2395p6.m3857Z(553610617);
                    boolean m3870g2 = c2395p6.m3870g(interfaceC2425y06);
                    Object m3847O8 = c2395p6.m3847O();
                    if (m3870g2 || m3847O8 == C2375k.f13421a) {
                        m3847O8 = new C0900ge(interfaceC2425y06, 24);
                        c2395p6.m3877j0(m3847O8);
                    }
                    c2395p6.m3888r(false);
                    InterfaceC3810r m322e2 = AbstractC0145a.m322e(7, null, (InterfaceC3277a) m3847O8, m346e5, false);
                    C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(f10), C3795c.f17974o, c2395p6, 54);
                    int m3975r4 = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m4 = c2395p6.m3882m();
                    InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p6, m322e2);
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z2);
                    } else {
                        c2395p6.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a2, c2395p6, c3504h5);
                    AbstractC2418w.m3954C(m3882m4, c2395p6, c3504h6);
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r4))) {
                        AbstractC2487d.m4050n(m3975r4, c2395p6, m3975r4, c3504h7);
                    }
                    AbstractC2418w.m3954C(m5823c4, c2395p6, c3504h8);
                    C2394o2 c2394o22 = AbstractC1913h7.f11292a;
                    C1604o0 c1604o04 = ((C1904g7) c2395p6.m3878k(c2394o22)).f11252i;
                    C2300k c2300k = C2300k.f13235j;
                    C3149p0 c3149p0 = C3149p0.f15825a;
                    AbstractC1850a7.m3108b("链路 Ping 监控", c3149p0.m4856a(c3807o3, 1.0f, false), 0L, 0L, c2300k, null, 0L, null, 0L, 0, false, 0, 0, c1604o04, c2395p6, 196614, 0, 65500);
                    C2395p c2395p7 = c2395p6;
                    c2395p7.m3857Z(-1875436221);
                    if (!((Boolean) interfaceC2425y06.getValue()).booleanValue()) {
                        String str9 = c0915gt.f4385i;
                        C1604o0 c1604o05 = ((C1904g7) c2395p7.m3878k(c2394o22)).f11258o;
                        c3807o = c3807o3;
                        AbstractC1850a7.m3108b(str9, c3149p0.m4856a(c3807o3, 1.0f, true), ((C2003t0) c2395p7.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, c1604o05, c2395p7, 0, 3120, 55288);
                        c2395p7 = c2395p7;
                    } else {
                        c3807o = c3807o3;
                    }
                    c2395p7.m3888r(false);
                    c2395p7.m3857Z(-1875422233);
                    if (c0915gt.f4377a) {
                        AbstractC1951m4.m3141a(AbstractC0155c.m353l(c3807o, 14), 0L, 2, 0L, 0, c2395p7, 390, 26);
                    }
                    c2395p7.m3888r(false);
                    c2395p7.m3888r(true);
                    AbstractC0144a.m315b(C3154s.f15836a, ((Boolean) interfaceC2425y06.getValue()).booleanValue(), null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(1268673214, new C1450y6(c0915gt, map2, c3472s, this.f8295f, 3), c2395p7), c2395p7, 1600518);
                    c2395p7.m3888r(true);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p8 = (C2395p) obj2;
                ((Number) obj3).intValue();
                C3800h c3800h2 = C3795c.f17976q;
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                List list2 = (List) this.f8296g;
                boolean isEmpty = list2.isEmpty();
                float f11 = 1.0f;
                C3807o c3807o4 = C3807o.f17991a;
                float f12 = 0.0f;
                if (isEmpty) {
                    c2395p8.m3857Z(226288277);
                    InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o4, 1.0f), 0.0f, 12, 1);
                    C3152r m4857a3 = AbstractC3150q.m4857a(AbstractC3136j.m4843g(4), C3795c.f17977r, c2395p8, 54);
                    int hashCode = Long.hashCode(c2395p8.f13486T);
                    InterfaceC2385m1 m3882m5 = c2395p8.m3882m();
                    InterfaceC3810r m5823c5 = AbstractC3793a.m5823c(c2395p8, m339j);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z3 = C3507i.f16928b;
                    c2395p8.m3863c0();
                    if (c2395p8.f13485S) {
                        c2395p8.m3880l(c3558z3);
                    } else {
                        c2395p8.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a3, c2395p8, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m5, c2395p8, C3507i.f16930d);
                    C3504h c3504h9 = C3507i.f16932f;
                    if (c2395p8.f13485S || !AbstractC3367j.m5096a(c2395p8.m3847O(), Integer.valueOf(hashCode))) {
                        AbstractC2487d.m4050n(hashCode, c2395p8, hashCode, c3504h9);
                    }
                    AbstractC2418w.m3954C(m5823c5, c2395p8, C3507i.f16929c);
                    C2266e m4346t = AbstractC2710c.m4346t();
                    InterfaceC3810r m353l2 = AbstractC0155c.m353l(c3807o4, 24);
                    C2394o2 c2394o23 = AbstractC2019v0.f11943a;
                    AbstractC1949m2.m3140b(m4346t, null, m353l2, ((C2003t0) c2395p8.m3878k(c2394o23)).f11784B, c2395p8, 432, 0);
                    AbstractC1850a7.m3108b("暂无可用接口", null, ((C2003t0) c2395p8.m3878k(c2394o23)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p8.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p8, 6, 0, 65530);
                    c2395p8.m3888r(true);
                    c2395p8.m3888r(false);
                } else {
                    c2395p8.m3857Z(227203676);
                    InterfaceC3810r m3275C = AbstractC2067b.m3275C(AbstractC0155c.m349h(c3807o4, 0.0f, AbstractC0945hr.f4637c, 1), AbstractC2067b.m3297v(c2395p8));
                    int i13 = 2;
                    float f13 = 2;
                    C3130g m4843g3 = AbstractC3136j.m4843g(f13);
                    C1386w4 c1386w42 = this;
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) c1386w42.f8298i;
                    List list3 = (List) c1386w42.f8299j;
                    Map map3 = (Map) c1386w42.f8297h;
                    C3152r m4857a4 = AbstractC3150q.m4857a(m4843g3, c3800h2, c2395p8, 6);
                    int hashCode2 = Long.hashCode(c2395p8.f13486T);
                    InterfaceC2385m1 m3882m6 = c2395p8.m3882m();
                    InterfaceC3810r m5823c6 = AbstractC3793a.m5823c(c2395p8, m3275C);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z4 = C3507i.f16928b;
                    c2395p8.m3863c0();
                    if (c2395p8.f13485S) {
                        c2395p8.m3880l(c3558z4);
                    } else {
                        c2395p8.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a4, c2395p8, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m6, c2395p8, C3507i.f16930d);
                    C3504h c3504h10 = C3507i.f16932f;
                    if (c2395p8.f13485S || !AbstractC3367j.m5096a(c2395p8.m3847O(), Integer.valueOf(hashCode2))) {
                        AbstractC2487d.m4050n(hashCode2, c2395p8, hashCode2, c3504h10);
                    }
                    AbstractC2418w.m3954C(m5823c6, c2395p8, C3507i.f16929c);
                    c2395p8.m3857Z(992975609);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        C1248rl c1248rl = (C1248rl) it.next();
                        C3801i c3801i2 = C3795c.f17974o;
                        InterfaceC3810r m349h = AbstractC0155c.m349h(AbstractC0155c.m346e(c3807o4, f11), AbstractC0945hr.f4636b, f12, i13);
                        c2395p8.m3857Z(-394528499);
                        boolean m3870g3 = c2395p8.m3870g(interfaceC3279c) | c2395p8.m3874i(c1248rl);
                        Object m3847O9 = c2395p8.m3847O();
                        C2413u0 c2413u0 = C2375k.f13421a;
                        if (m3870g3 || m3847O9 == c2413u0) {
                            m3847O9 = new C0320e(24, interfaceC3279c, c1248rl);
                            c2395p8.m3877j0(m3847O9);
                        }
                        c2395p8.m3888r(false);
                        boolean z9 = c1386w42.f8295f;
                        Iterator it2 = it;
                        InterfaceC3810r m339j2 = AbstractC0154b.m339j(AbstractC0145a.m322e(6, null, (InterfaceC3277a) m3847O9, m349h, z9), f12, f13, 1);
                        C3147o0 m4854a3 = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, c3801i2, c2395p8, 48);
                        C3800h c3800h3 = c3800h2;
                        int hashCode3 = Long.hashCode(c2395p8.f13486T);
                        InterfaceC2385m1 m3882m7 = c2395p8.m3882m();
                        InterfaceC3810r m5823c7 = AbstractC3793a.m5823c(c2395p8, m339j2);
                        InterfaceC3510j.f16935d.getClass();
                        C3558z c3558z5 = C3507i.f16928b;
                        c2395p8.m3863c0();
                        if (c2395p8.f13485S) {
                            c2395p8.m3880l(c3558z5);
                        } else {
                            c2395p8.m3883m0();
                        }
                        C3504h c3504h11 = C3507i.f16931e;
                        AbstractC2418w.m3954C(m4854a3, c2395p8, c3504h11);
                        C3504h c3504h12 = C3507i.f16930d;
                        AbstractC2418w.m3954C(m3882m7, c2395p8, c3504h12);
                        C3504h c3504h13 = C3507i.f16932f;
                        if (!c2395p8.f13485S) {
                            f7 = f13;
                            break;
                        } else {
                            f7 = f13;
                        }
                        AbstractC2487d.m4050n(hashCode3, c2395p8, hashCode3, c3504h13);
                        C3504h c3504h14 = C3507i.f16929c;
                        AbstractC2418w.m3954C(m5823c7, c2395p8, c3504h14);
                        String str10 = c1248rl.f7390a;
                        boolean contains = list3.contains(str10);
                        c2395p8.m3857Z(-994160756);
                        boolean m3870g4 = c2395p8.m3870g(interfaceC3279c) | c2395p8.m3874i(c1248rl);
                        Object m3847O10 = c2395p8.m3847O();
                        if (m3870g4 || m3847O10 == c2413u0) {
                            m3847O10 = new C0321f(13, interfaceC3279c, c1248rl);
                            c2395p8.m3877j0(m3847O10);
                        }
                        c2395p8.m3888r(false);
                        List list4 = list3;
                        InterfaceC3279c interfaceC3279c2 = interfaceC3279c;
                        Map map4 = map3;
                        float f14 = f7;
                        AbstractC1987r0.m3156a(contains, (InterfaceC3279c) m3847O10, null, z9, null, c2395p8, 0, 52);
                        C2266e m4346t2 = AbstractC2710c.m4346t();
                        C3807o c3807o5 = c3807o4;
                        InterfaceC3810r m353l3 = AbstractC0155c.m353l(AbstractC0154b.m340k(c3807o4, 0.0f, 0.0f, 6, 0.0f, 11), 16);
                        C2394o2 c2394o24 = AbstractC2019v0.f11943a;
                        AbstractC1949m2.m3140b(m4346t2, null, m353l3, ((C2003t0) c2395p8.m3878k(c2394o24)).f11825s, c2395p8, 432, 0);
                        if (1.0f > 0.0d) {
                            float f15 = Float.MAX_VALUE;
                            if (1.0f <= Float.MAX_VALUE) {
                                f15 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f15, true);
                            C3152r m4857a5 = AbstractC3150q.m4857a(AbstractC3136j.f15791c, c3800h3, c2395p8, 0);
                            int hashCode4 = Long.hashCode(c2395p8.f13486T);
                            InterfaceC2385m1 m3882m8 = c2395p8.m3882m();
                            InterfaceC3810r m5823c8 = AbstractC3793a.m5823c(c2395p8, layoutWeightElement);
                            c2395p8.m3863c0();
                            if (c2395p8.f13485S) {
                                c2395p8.m3880l(c3558z5);
                            } else {
                                c2395p8.m3883m0();
                            }
                            AbstractC2418w.m3954C(m4857a5, c2395p8, c3504h11);
                            AbstractC2418w.m3954C(m3882m8, c2395p8, c3504h12);
                            if (c2395p8.f13485S || !AbstractC3367j.m5096a(c2395p8.m3847O(), Integer.valueOf(hashCode4))) {
                                AbstractC2487d.m4050n(hashCode4, c2395p8, hashCode4, c3504h13);
                            }
                            AbstractC2418w.m3954C(m5823c8, c2395p8, c3504h14);
                            String str11 = c1248rl.f7391b;
                            C1393wb c1393wb = (C1393wb) map4.get(str10);
                            if (c1393wb != null) {
                                str3 = c1393wb.f8324c;
                            } else {
                                str3 = null;
                            }
                            C1393wb c1393wb2 = (C1393wb) map4.get(str10);
                            if (c1393wb2 != null) {
                                str4 = c1393wb2.f8323b;
                            } else {
                                str4 = null;
                            }
                            C2394o2 c2394o25 = AbstractC1913h7.f11292a;
                            C2395p c2395p9 = c2395p8;
                            AbstractC1249rm.m2266j(str11, str4, str3, null, ((C1904g7) c2395p8.m3878k(c2394o25)).f11255l, null, c2395p9, 0, 40);
                            c2395p8 = c2395p9;
                            C1393wb c1393wb3 = (C1393wb) map4.get(str10);
                            if (c1393wb3 != null) {
                                str5 = c1393wb3.f8322a;
                            } else {
                                str5 = null;
                            }
                            c2395p8.m3857Z(-1152595973);
                            if (str5 == null) {
                                c1386w4 = this;
                                z7 = true;
                                map = map4;
                                c3800h = c3800h3;
                            } else {
                                c3800h = c3800h3;
                                map = map4;
                                z7 = true;
                                c1386w4 = this;
                                AbstractC1850a7.m3108b(str5, null, ((C2003t0) c2395p8.m3878k(c2394o24)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p8.m3878k(c2394o25)).f11258o, c2395p8, 0, 3120, 55290);
                                c2395p8 = c2395p8;
                            }
                            c2395p8.m3888r(false);
                            c2395p8.m3888r(z7);
                            c2395p8.m3888r(z7);
                            c1386w42 = c1386w4;
                            it = it2;
                            f13 = f14;
                            interfaceC3279c = interfaceC3279c2;
                            list3 = list4;
                            i13 = 2;
                            c3807o4 = c3807o5;
                            c3800h2 = c3800h;
                            map3 = map;
                            f12 = 0.0f;
                            f11 = 1.0f;
                        } else {
                            throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
                        }
                    }
                    c2395p8.m3888r(false);
                    c2395p8.m3888r(true);
                    c2395p8.m3888r(false);
                }
                return C1694m.f10482a;
        }
    }

    public C1386w4(C0877fn c0877fn, boolean z7, List list, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c) {
        this.f8299j = c0877fn;
        this.f8295f = z7;
        this.f8296g = list;
        this.f8297h = interfaceC2425y0;
        this.f8298i = interfaceC3279c;
    }

    public C1386w4(String str, boolean z7, InterfaceC2425y0 interfaceC2425y0, ArrayList arrayList, InterfaceC3279c interfaceC3279c) {
        this.f8299j = str;
        this.f8295f = z7;
        this.f8297h = interfaceC2425y0;
        this.f8296g = arrayList;
        this.f8298i = interfaceC3279c;
    }

    public C1386w4(String str, boolean z7, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, List list) {
        this.f8299j = str;
        this.f8295f = z7;
        this.f8297h = interfaceC2425y0;
        this.f8298i = interfaceC3279c;
        this.f8296g = list;
    }

    public C1386w4(List list, boolean z7, InterfaceC3279c interfaceC3279c, List list2, Map map) {
        this.f8296g = list;
        this.f8295f = z7;
        this.f8298i = interfaceC3279c;
        this.f8299j = list2;
        this.f8297h = map;
    }

    public C1386w4(InterfaceC2425y0 interfaceC2425y0, C0915gt c0915gt, Map map, C3472s c3472s, boolean z7) {
        this.f8297h = interfaceC2425y0;
        this.f8299j = c0915gt;
        this.f8298i = map;
        this.f8296g = c3472s;
        this.f8295f = z7;
    }

    public C1386w4(InterfaceC3277a interfaceC3277a, boolean z7, C2266e c2266e, String str, C3173d c3173d) {
        this.f8297h = interfaceC3277a;
        this.f8295f = z7;
        this.f8298i = c2266e;
        this.f8299j = str;
        this.f8296g = c3173d;
    }
}
