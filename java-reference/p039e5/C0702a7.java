package p039e5;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.List;
import p001a0.AbstractC0094y0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p068i5.AbstractC2080d;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p159u6.AbstractC3393k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a7 */
/* loaded from: classes.dex */
public final class C0702a7 extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ int f2332f;

    /* renamed from: g */
    public final /* synthetic */ List f2333g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0702a7(int i7, List list) {
        super(4);
        this.f2332f = i7;
        this.f2333g = list;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        C1694m c1694m;
        C2266e c2266e;
        String str;
        long j6;
        long j7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.f2332f;
        C1694m c1694m2 = C1694m.f10482a;
        List list = this.f2333g;
        int i14 = 16;
        int i15 = 2;
        switch (i13) {
            case 0:
                C3315c c3315c = (C3315c) obj;
                int intValue = ((Number) obj2).intValue();
                C2395p c2395p = (C2395p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (c2395p.m3870g(c3315c)) {
                        i8 = 4;
                    } else {
                        i8 = 2;
                    }
                    i7 = i8 | intValue2;
                } else {
                    i7 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (c2395p.m3866e(intValue)) {
                        i14 = 32;
                    }
                    i7 |= i14;
                }
                if ((i7 & 147) == 146 && c2395p.m3836D()) {
                    c2395p.m3852U();
                    return c1694m2;
                }
                C1094mm c1094mm = (C1094mm) list.get(intValue);
                c2395p.m3857Z(1315986361);
                C3807o c3807o = C3807o.f17991a;
                float f7 = 4;
                InterfaceC3810r m338i = AbstractC0154b.m338i(AbstractC0155c.m346e(c3807o, 1.0f), 2, f7);
                C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p, 54);
                int hashCode = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m = c2395p.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m338i);
                InterfaceC3510j.f16935d.getClass();
                C3558z c3558z = C3507i.f16928b;
                c2395p.m3863c0();
                if (c2395p.f13485S) {
                    c2395p.m3880l(c3558z);
                } else {
                    c2395p.m3883m0();
                }
                AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                C3504h c3504h = C3507i.f16932f;
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                    AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                }
                AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                boolean z7 = c1094mm.f5962b;
                if (z7) {
                    c2266e = AbstractC3784a.f17927h;
                    if (c2266e != null) {
                        c1694m = c1694m2;
                    } else {
                        C2264d c2264d = new C2264d("Filled.CheckCircle", false);
                        int i16 = AbstractC2263c0.f13117a;
                        c1694m = c1694m2;
                        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
                        C0811dk m179f = AbstractC0094y0.m179f(12.0f, 2.0f);
                        m179f.m1506g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        m179f.m1514o(4.48f, 10.0f, 10.0f, 10.0f);
                        m179f.m1514o(10.0f, -4.48f, 10.0f, -10.0f);
                        m179f.m1513n(17.52f, 2.0f, 12.0f, 2.0f);
                        m179f.m1505f();
                        m179f.m1512m(10.0f, 17.0f);
                        m179f.m1511l(-5.0f, -5.0f);
                        m179f.m1511l(1.41f, -1.41f);
                        m179f.m1510k(10.0f, 14.17f);
                        m179f.m1511l(7.59f, -7.59f);
                        m179f.m1510k(19.0f, 8.0f);
                        m179f.m1511l(-9.0f, 9.0f);
                        m179f.m1505f();
                        C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
                        c2266e = c2264d.m3673b();
                        AbstractC3784a.f17927h = c2266e;
                    }
                } else {
                    c1694m = c1694m2;
                    C2266e c2266e2 = AbstractC3393k.f16479f;
                    if (c2266e2 == null) {
                        C2264d c2264d2 = new C2264d("Filled.Cancel", false);
                        int i17 = AbstractC2263c0.f13117a;
                        C0671o0 c0671o02 = new C0671o0(C0677s.f2204b);
                        C0811dk m179f2 = AbstractC0094y0.m179f(12.0f, 2.0f);
                        m179f2.m1506g(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
                        m179f2.m1514o(4.47f, 10.0f, 10.0f, 10.0f);
                        m179f2.m1514o(10.0f, -4.47f, 10.0f, -10.0f);
                        m179f2.m1513n(17.53f, 2.0f, 12.0f, 2.0f);
                        m179f2.m1505f();
                        m179f2.m1512m(17.0f, 15.59f);
                        m179f2.m1510k(15.59f, 17.0f);
                        m179f2.m1510k(12.0f, 13.41f);
                        m179f2.m1510k(8.41f, 17.0f);
                        m179f2.m1510k(7.0f, 15.59f);
                        m179f2.m1510k(10.59f, 12.0f);
                        m179f2.m1510k(7.0f, 8.41f);
                        m179f2.m1510k(8.41f, 7.0f);
                        m179f2.m1510k(12.0f, 10.59f);
                        m179f2.m1510k(15.59f, 7.0f);
                        m179f2.m1510k(17.0f, 8.41f);
                        m179f2.m1510k(13.41f, 12.0f);
                        m179f2.m1510k(17.0f, 15.59f);
                        m179f2.m1505f();
                        C2264d.m3672a(c2264d2, m179f2.f3514f, c0671o02);
                        c2266e2 = c2264d2.m3673b();
                        AbstractC3393k.f16479f = c2266e2;
                    }
                    c2266e = c2266e2;
                }
                C2266e c2266e3 = c2266e;
                if (z7) {
                    str = "成功";
                } else {
                    str = "失败";
                }
                InterfaceC3810r m353l = AbstractC0155c.m353l(AbstractC0154b.m340k(c3807o, 0.0f, 0.0f, f7, 0.0f, 11), 12);
                if (z7) {
                    c2395p.m3857Z(-788004081);
                    j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a;
                    c2395p.m3888r(false);
                } else {
                    c2395p.m3857Z(-787917839);
                    j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11829w;
                    c2395p.m3888r(false);
                }
                AbstractC1949m2.m3140b(c2266e3, str, m353l, j6, c2395p, 384, 0);
                String m4256b = AbstractC2647h.m4256b("#", c1094mm.f5961a);
                InterfaceC3810r m357p = AbstractC0155c.m357p(c3807o, 36);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11258o;
                C2394o2 c2394o22 = AbstractC2019v0.f11943a;
                AbstractC1850a7.m3108b(m4256b, m357p, ((C2003t0) c2395p.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 48, 0, 65528);
                String str2 = c1094mm.f5964d;
                if (1.0f > 0.0d) {
                    float f8 = Float.MAX_VALUE;
                    if (1.0f <= Float.MAX_VALUE) {
                        f8 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f8, true);
                    C1604o0 m2592a = C1604o0.m2592a(((C1904g7) c2395p.m3878k(c2394o2)).f11258o, 0L, AbstractC2080d.m3405r(11), null, null, 0L, 0L, null, 16777213);
                    if (z7) {
                        c2395p.m3857Z(-787292755);
                        j7 = ((C2003t0) c2395p.m3878k(c2394o22)).f11823q;
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(-787204591);
                        j7 = ((C2003t0) c2395p.m3878k(c2394o22)).f11829w;
                        c2395p.m3888r(false);
                    }
                    AbstractC1850a7.m3108b(str2, layoutWeightElement, j7, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, m2592a, c2395p, 0, 3120, 55288);
                    c2395p.m3888r(true);
                    AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.35f, ((C2003t0) c2395p.m3878k(c2394o22)).f11784B), c2395p, 0, 3);
                    c2395p.m3888r(false);
                    return c1694m;
                }
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            case 1:
                C3315c c3315c2 = (C3315c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C2395p c2395p2 = (C2395p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (c2395p2.m3870g(c3315c2)) {
                        i15 = 4;
                    }
                    i9 = intValue4 | i15;
                } else {
                    i9 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (c2395p2.m3866e(intValue3)) {
                        i14 = 32;
                    }
                    i9 |= i14;
                }
                if ((i9 & 147) == 146 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C1132nt c1132nt = (C1132nt) list.get(intValue3);
                    c2395p2.m3857Z(-49851206);
                    AbstractC1172p7.m2038O(c1132nt, c2395p2, 8);
                    AbstractC1991r4.m3164e(AbstractC0154b.m340k(C3807o.f17991a, 36, 0.0f, 0.0f, 0.0f, 14), 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p2, 6, 2);
                    c2395p2.m3888r(false);
                }
                return c1694m2;
            case 2:
                C3315c c3315c3 = (C3315c) obj;
                int intValue5 = ((Number) obj2).intValue();
                C2395p c2395p3 = (C2395p) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (c2395p3.m3870g(c3315c3)) {
                        i15 = 4;
                    }
                    i10 = intValue6 | i15;
                } else {
                    i10 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (c2395p3.m3866e(intValue5)) {
                        i14 = 32;
                    }
                    i10 |= i14;
                }
                if ((i10 & 147) == 146 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    C1024ke c1024ke = (C1024ke) list.get(intValue5);
                    c2395p3.m3857Z(-513197156);
                    AbstractC1249rm.m2282r(c1024ke, c2395p3, 0);
                    c2395p3.m3888r(false);
                }
                return c1694m2;
            case 3:
                C3315c c3315c4 = (C3315c) obj;
                int intValue7 = ((Number) obj2).intValue();
                C2395p c2395p4 = (C2395p) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (c2395p4.m3870g(c3315c4)) {
                        i15 = 4;
                    }
                    i11 = intValue8 | i15;
                } else {
                    i11 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (c2395p4.m3866e(intValue7)) {
                        i14 = 32;
                    }
                    i11 |= i14;
                }
                if ((i11 & 147) == 146 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    C1024ke c1024ke2 = (C1024ke) list.get(intValue7);
                    c2395p4.m3857Z(457498812);
                    AbstractC1249rm.m2282r(c1024ke2, c2395p4, 0);
                    c2395p4.m3888r(false);
                }
                return c1694m2;
            default:
                C3315c c3315c5 = (C3315c) obj;
                int intValue9 = ((Number) obj2).intValue();
                C2395p c2395p5 = (C2395p) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (c2395p5.m3870g(c3315c5)) {
                        i15 = 4;
                    }
                    i12 = intValue10 | i15;
                } else {
                    i12 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (c2395p5.m3866e(intValue9)) {
                        i14 = 32;
                    }
                    i12 |= i14;
                }
                if ((i12 & 147) == 146 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    C1065lo c1065lo = (C1065lo) list.get(intValue9);
                    c2395p5.m3857Z(-1991614136);
                    AbstractC1092mk.m1831o(c1065lo, c2395p5, 0);
                    c2395p5.m3888r(false);
                }
                return c1694m2;
        }
    }
}
