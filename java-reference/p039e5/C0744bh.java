package p039e5;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.List;
import java.util.Map;
import p035e1.C0677s;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3147o0;
import p144t.C3152r;
import p144t.C3154s;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
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
/* renamed from: e5.bh */
/* loaded from: classes.dex */
public final class C0744bh implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ List f2654e;

    /* renamed from: f */
    public final /* synthetic */ Map f2655f;

    /* renamed from: g */
    public final /* synthetic */ boolean f2656g;

    /* renamed from: h */
    public final /* synthetic */ EnumC1436xn f2657h;

    /* renamed from: i */
    public final /* synthetic */ double f2658i;

    /* renamed from: j */
    public final /* synthetic */ boolean f2659j;

    /* renamed from: k */
    public final /* synthetic */ double f2660k;

    public C0744bh(List list, Map map, boolean z7, EnumC1436xn enumC1436xn, double d7, boolean z8, double d8) {
        this.f2654e = list;
        this.f2655f = map;
        this.f2656g = z7;
        this.f2657h = enumC1436xn;
        this.f2658i = d7;
        this.f2659j = z8;
        this.f2660k = d8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        List list;
        String str;
        String str2;
        String str3;
        C3558z c3558z;
        int i7;
        C3504h c3504h;
        C3504h c3504h2;
        boolean z7;
        String str4;
        EnumC1436xn enumC1436xn;
        C0744bh c0744bh = this;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        C3800h c3800h = C3795c.f17976q;
        AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m337h = AbstractC0154b.m337h(c3807o, 14);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(8), c3800h, c2395p, 6);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m337h);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z2 = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z2);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4857a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3800h c3800h2 = c3800h;
            AbstractC1850a7.m3108b("接口贡献速率", null, 0L, 0L, C2300k.f13236k, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 196614, 0, 131038);
            C2395p c2395p2 = c2395p;
            c2395p2.m3857Z(-1500823423);
            List list2 = c0744bh.f2654e;
            if (list2.isEmpty()) {
                list = list2;
                AbstractC1850a7.m3108b("等待接口接入", null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p2, 6, 0, 65530);
                c2395p2 = c2395p2;
            } else {
                list = list2;
            }
            boolean z8 = false;
            c2395p2.m3888r(false);
            c2395p2.m3857Z(-1500812797);
            int i8 = 0;
            for (Object obj4 : list) {
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    C0707ac c0707ac = (C0707ac) obj4;
                    String str5 = c0707ac.f2361a;
                    double d7 = c0707ac.f2365e;
                    double d8 = c0707ac.f2364d;
                    C1393wb c1393wb = (C1393wb) c0744bh.f2655f.get(str5);
                    float f7 = 1.0f;
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
                    int i10 = i8;
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17973n, c2395p2, 54);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m346e);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z3 = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(c3558z3);
                    } else {
                        c2395p2.m3883m0();
                    }
                    C3504h c3504h4 = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4854a, c2395p2, c3504h4);
                    C3504h c3504h5 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h5);
                    C3504h c3504h6 = C3507i.f16932f;
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r2))) {
                        AbstractC2487d.m4050n(m3975r2, c2395p2, m3975r2, c3504h6);
                    }
                    C3504h c3504h7 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h7);
                    if (1.0f > 0.0d) {
                        if (1.0f > Float.MAX_VALUE) {
                            f7 = Float.MAX_VALUE;
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f7, true);
                        C3800h c3800h3 = c3800h2;
                        C3152r m4857a2 = AbstractC3150q.m4857a(AbstractC3136j.f15791c, c3800h3, c2395p2, 0);
                        int m3975r3 = AbstractC2418w.m3975r(c2395p2);
                        InterfaceC2385m1 m3882m3 = c2395p2.m3882m();
                        InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p2, layoutWeightElement);
                        c2395p2.m3863c0();
                        if (c2395p2.f13485S) {
                            c2395p2.m3880l(c3558z3);
                        } else {
                            c2395p2.m3883m0();
                        }
                        AbstractC2418w.m3954C(m4857a2, c2395p2, c3504h4);
                        AbstractC2418w.m3954C(m3882m3, c2395p2, c3504h5);
                        if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r3))) {
                            AbstractC2487d.m4050n(m3975r3, c2395p2, m3975r3, c3504h6);
                        }
                        AbstractC2418w.m3954C(m5823c3, c2395p2, c3504h7);
                        String str6 = c0707ac.f2362b;
                        if (c1393wb != null) {
                            str = c1393wb.f8324c;
                        } else {
                            str = null;
                        }
                        if (c1393wb != null) {
                            str2 = c1393wb.f8323b;
                        } else {
                            str2 = null;
                        }
                        C2395p c2395p3 = c2395p2;
                        AbstractC1249rm.m2266j(str6, str2, str, null, null, null, c2395p3, 0, 56);
                        c2395p2 = c2395p3;
                        if (c1393wb != null) {
                            str3 = c1393wb.f8322a;
                        } else {
                            str3 = null;
                        }
                        c2395p2.m3857Z(804810036);
                        if (str3 == null) {
                            i7 = i10;
                            c3504h = c3504h7;
                            c3504h2 = c3504h6;
                            c3558z = c3558z3;
                            c3800h2 = c3800h3;
                            z7 = false;
                        } else {
                            c3800h2 = c3800h3;
                            c3558z = c3558z3;
                            i7 = i10;
                            c3504h = c3504h7;
                            c3504h2 = c3504h6;
                            z7 = false;
                            AbstractC1850a7.m3108b(str3, null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p2, 0, 3120, 55290);
                            c2395p2 = c2395p2;
                        }
                        c2395p2.m3888r(z7);
                        c2395p2.m3888r(true);
                        C3152r m4857a3 = AbstractC3150q.m4857a(AbstractC3136j.m4843g(2), C3795c.f17978s, c2395p2, 54);
                        int m3975r4 = AbstractC2418w.m3975r(c2395p2);
                        InterfaceC2385m1 m3882m4 = c2395p2.m3882m();
                        InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p2, c3807o);
                        c2395p2.m3863c0();
                        if (c2395p2.f13485S) {
                            c2395p2.m3880l(c3558z);
                        } else {
                            c2395p2.m3883m0();
                        }
                        AbstractC2418w.m3954C(m4857a3, c2395p2, c3504h4);
                        AbstractC2418w.m3954C(m3882m4, c2395p2, c3504h5);
                        if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r4))) {
                            AbstractC2487d.m4050n(m3975r4, c2395p2, m3975r4, c3504h2);
                        }
                        AbstractC2418w.m3954C(m5823c4, c2395p2, c3504h);
                        c2395p2.m3857Z(804831156);
                        boolean z9 = this.f2656g;
                        EnumC1436xn enumC1436xn2 = this.f2657h;
                        if (!z9) {
                            str4 = " ";
                            enumC1436xn = enumC1436xn2;
                        } else {
                            C2395p c2395p4 = c2395p2;
                            enumC1436xn = enumC1436xn2;
                            str4 = " ";
                            AbstractC1850a7.m3108b("D " + AbstractC1092mk.m1805i3(d8, enumC1436xn2) + " " + AbstractC1092mk.m1707N2(d8, this.f2658i), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p4, 0, 0, 65534);
                            c2395p2 = c2395p4;
                        }
                        c2395p2.m3888r(z7);
                        c2395p2.m3857Z(804842636);
                        if (this.f2659j) {
                            C2395p c2395p5 = c2395p2;
                            AbstractC1850a7.m3108b("U " + AbstractC1092mk.m1805i3(d7, enumC1436xn) + str4 + AbstractC1092mk.m1707N2(d7, this.f2660k), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p5, 0, 0, 65534);
                            c2395p2 = c2395p5;
                        }
                        c2395p2.m3888r(z7);
                        c2395p2.m3888r(true);
                        c2395p2.m3888r(true);
                        c2395p2.m3857Z(-1500747277);
                        if (i7 < AbstractC1806n.m3066N(list)) {
                            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.35f, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p2, 0, 3);
                        }
                        c2395p2.m3888r(z7);
                        z8 = z7;
                        i8 = i9;
                        c0744bh = this;
                    } else {
                        throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                } else {
                    AbstractC1806n.m3072T();
                    throw null;
                }
            }
            c2395p2.m3888r(z8);
            c2395p2.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
