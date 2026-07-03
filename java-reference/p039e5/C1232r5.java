package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p017c.C0320e;
import p024c6.AbstractC0451r;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1912h6;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1926j3;
import p063i0.AbstractC1991r4;
import p063i0.C1904g7;
import p063i0.C1996s1;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3137j0;
import p144t.C3152r;
import p145t0.AbstractC3178i;
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
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.r5 */
/* loaded from: classes.dex */
public final class C1232r5 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f7291e;

    /* renamed from: f */
    public final /* synthetic */ Object f7292f;

    /* renamed from: g */
    public final /* synthetic */ Object f7293g;

    public /* synthetic */ C1232r5(int i7, Object obj, Object obj2) {
        this.f7291e = i7;
        this.f7292f = obj;
        this.f7293g = obj2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        int intValue;
        boolean z8;
        boolean z9;
        boolean z10;
        String str;
        String str2;
        int i7 = this.f7291e;
        Object obj3 = C2375k.f13421a;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f7292f;
        Object obj5 = this.f7293g;
        int i8 = 3;
        int i9 = 2;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else if (((List) obj4).size() > 1) {
                    C1996s1 c1996s1 = C1996s1.f11741a;
                    C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                    c1996s1.m3175a(((Boolean) ((InterfaceC2425y0) obj5).getValue()).booleanValue(), null, c2395p, 0);
                }
                return c1694m;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1850a7.m3108b((String) ((InterfaceC3279c) obj4).mo23f(obj5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p2, 0, 0, 65534);
                }
                return c1694m;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) obj4;
                    Integer m973O = AbstractC0451r.m973O((String) obj5);
                    if (m973O != null && 1 <= (intValue = m973O.intValue()) && intValue < 10001) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC1991r4.m3167h(interfaceC3277a, null, z7, null, null, null, AbstractC0792d1.f3246U, c2395p3, 805306368, 506);
                }
                return c1694m;
            case 3:
                C2395p c2395p4 = (C2395p) obj;
                InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) obj5;
                C2349d1 c2349d1 = (C2349d1) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    if (c2349d1.m3741g() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c2395p4.m3857Z(-161973787);
                    boolean m3870g = c2395p4.m3870g(c2349d1);
                    Object m3847O = c2395p4.m3847O();
                    if (m3870g || m3847O == obj3) {
                        m3847O = new C1267s9(c2349d1, 1);
                        c2395p4.m3877j0(m3847O);
                    }
                    c2395p4.m3888r(false);
                    AbstractC1912h6.m3122b(z8, (InterfaceC3277a) m3847O, null, false, AbstractC3178i.m4873d(1602943688, new C0989ja(interfaceC2390n2, 0), c2395p4), 0L, 0L, c2395p4, 24576);
                    if (c2349d1.m3741g() == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    c2395p4.m3857Z(-161969051);
                    boolean m3870g2 = c2395p4.m3870g(c2349d1);
                    Object m3847O2 = c2395p4.m3847O();
                    if (m3870g2 || m3847O2 == obj3) {
                        m3847O2 = new C1267s9(c2349d1, 2);
                        c2395p4.m3877j0(m3847O2);
                    }
                    c2395p4.m3888r(false);
                    AbstractC1912h6.m3122b(z9, (InterfaceC3277a) m3847O2, null, false, AbstractC3178i.m4873d(1991575025, new C0989ja(interfaceC2390n2, 1), c2395p4), 0L, 0L, c2395p4, 24576);
                }
                return c1694m;
            case 4:
                C2395p c2395p5 = (C2395p) obj;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj5;
                C1196q0 c1196q0 = (C1196q0) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    c2395p5.m3857Z(823767210);
                    boolean m3874i = c2395p5.m3874i(c1196q0) | c2395p5.m3870g(interfaceC2425y0);
                    Object m3847O3 = c2395p5.m3847O();
                    if (m3874i || m3847O3 == obj3) {
                        m3847O3 = new C0320e(11, c1196q0, interfaceC2425y0);
                        c2395p5.m3877j0(m3847O3);
                    }
                    c2395p5.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O3, null, false, null, null, null, null, null, AbstractC0951i1.f4744x, c2395p5, 805306368, 510);
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                C2395p c2395p6 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p6.m3836D()) {
                    c2395p6.m3852U();
                } else {
                    InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj5;
                    String str3 = (String) obj4;
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p6, 0);
                    int m3975r = AbstractC2418w.m3975r(c2395p6);
                    InterfaceC2385m1 m3882m = c2395p6.m3882m();
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p6, c3807o);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p6.m3863c0();
                    if (c2395p6.f13485S) {
                        c2395p6.m3880l(c3558z);
                    } else {
                        c2395p6.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p6, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p6, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p6.f13485S || !AbstractC3367j.m5096a(c2395p6.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p6, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p6, C3507i.f16929c);
                    String str4 = (String) interfaceC2425y02.getValue();
                    c2395p6.m3857Z(1255616717);
                    Object m3847O4 = c2395p6.m3847O();
                    if (m3847O4 == obj3) {
                        m3847O4 = new C1478z3(interfaceC2425y02, 9);
                        c2395p6.m3877j0(m3847O4);
                    }
                    c2395p6.m3888r(false);
                    AbstractC1847a4.m3102a(str4, (InterfaceC3279c) m3847O4, AbstractC0155c.m346e(c3807o, 1.0f), false, false, null, AbstractC0980j1.f5006c, null, null, null, AbstractC3178i.m4873d(-1270345283, new C1294t5(str3, i8), c2395p6), null, null, null, true, 0, 0, null, null, c2395p6, 1573296, 12583296, 8253368);
                    c2395p6.m3888r(true);
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2395p c2395p7 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p7.m3836D()) {
                    c2395p7.m3852U();
                } else {
                    EnumC0964ie enumC0964ie = (EnumC0964ie) obj4;
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj5;
                    Iterator it = EnumC0964ie.f4829i.iterator();
                    while (it.hasNext()) {
                        EnumC0964ie enumC0964ie2 = (EnumC0964ie) it.next();
                        if (enumC0964ie == enumC0964ie2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c2395p7.m3857Z(231039545);
                        boolean m3870g3 = c2395p7.m3870g(interfaceC3279c) | c2395p7.m3870g(enumC0964ie2);
                        Object m3847O5 = c2395p7.m3847O();
                        if (m3870g3 || m3847O5 == obj3) {
                            m3847O5 = new C0320e(13, interfaceC3279c, enumC0964ie2);
                            c2395p7.m3877j0(m3847O5);
                        }
                        c2395p7.m3888r(false);
                        C2395p c2395p8 = c2395p7;
                        AbstractC1912h6.m3122b(z10, (InterfaceC3277a) m3847O5, null, false, AbstractC3178i.m4873d(-2058064010, new C0805de(enumC0964ie2, 1), c2395p7), 0L, 0L, c2395p8, 24576);
                        interfaceC3279c = interfaceC3279c;
                        c2395p7 = c2395p8;
                    }
                }
                return c1694m;
            case 7:
                ArrayList arrayList = (ArrayList) obj5;
                C2395p c2395p9 = (C2395p) obj;
                List list = (List) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p9.m3836D()) {
                    c2395p9.m3852U();
                } else {
                    c2395p9.m3857Z(-173142103);
                    if (list.size() == 1) {
                        C1189po c1189po = (C1189po) AbstractC1805m.m3047k0(arrayList);
                        if (c1189po == null || (str2 = c1189po.f6927b) == null) {
                            str2 = "该配置";
                        }
                        str = AbstractC0094y0.m185l("确定删除「", str2, "」吗？此操作不可恢复。");
                    } else {
                        int size = list.size();
                        c2395p9.m3857Z(-173135121);
                        Object m3847O6 = c2395p9.m3847O();
                        if (m3847O6 == obj3) {
                            m3847O6 = new C0866fc(9);
                            c2395p9.m3877j0(m3847O6);
                        }
                        c2395p9.m3888r(false);
                        str = "确定删除已选的 " + size + " 个配置吗？\n" + AbstractC1805m.m3051o0(arrayList, "、", null, null, (InterfaceC3279c) m3847O6, 30);
                    }
                    String str5 = str;
                    c2395p9.m3888r(false);
                    AbstractC1850a7.m3108b(str5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p9, 0, 0, 131070);
                }
                return c1694m;
            case 8:
                C2395p c2395p10 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p10.m3836D()) {
                    c2395p10.m3852U();
                } else {
                    AbstractC1926j3.m3126a(null, 0L, 0L, 0.0f, null, AbstractC3178i.m4873d(-18292096, new C1297t8(5, (Set) obj4, (InterfaceC2425y0) obj5), c2395p10), c2395p10, 196608);
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                C3469p c3469p = (C3469p) obj4;
                C2395p c2395p11 = (C2395p) obj;
                Context context = (Context) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p11.m3836D()) {
                    c2395p11.m3852U();
                } else {
                    InterfaceC3810r m337h = AbstractC0154b.m337h(AbstractC0155c.f660c, 16);
                    c2395p11.m3857Z(-1375395957);
                    boolean m3874i2 = c2395p11.m3874i(context);
                    Object m3847O7 = c2395p11.m3847O();
                    if (m3874i2 || m3847O7 == obj3) {
                        m3847O7 = new C0958i8(c3469p, context, i9);
                        c2395p11.m3877j0(m3847O7);
                    }
                    c2395p11.m3888r(false);
                    AbstractC1092mk.m1836p(m337h, c3469p, (InterfaceC3277a) m3847O7, c2395p11, 54);
                }
                return c1694m;
            default:
                C2395p c2395p12 = (C2395p) obj;
                String str6 = (String) obj5;
                Context context2 = (Context) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p12.m3836D()) {
                    c2395p12.m3852U();
                } else {
                    c2395p12.m3857Z(-2121594655);
                    boolean m3874i3 = c2395p12.m3874i(context2) | c2395p12.m3870g(str6);
                    Object m3847O8 = c2395p12.m3847O();
                    if (m3874i3 || m3847O8 == obj3) {
                        m3847O8 = new C0320e(23, context2, str6);
                        c2395p12.m3877j0(m3847O8);
                    }
                    c2395p12.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O8, null, false, null, null, null, AbstractC1352v1.f8089w, c2395p12, 805306368, 510);
                }
                return c1694m;
        }
    }

    public C1232r5(InterfaceC2425y0 interfaceC2425y0, String str) {
        this.f7291e = 5;
        this.f7293g = interfaceC2425y0;
        this.f7292f = str;
    }
}
