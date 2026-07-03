package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.List;
import java.util.Set;
import p024c6.AbstractC0444k;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.C1815w;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3120b;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p161v0.C3472s;
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
/* renamed from: e5.ca */
/* loaded from: classes.dex */
public final class C0769ca extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ List f3013f;

    /* renamed from: g */
    public final /* synthetic */ C3472s f3014g;

    /* renamed from: h */
    public final /* synthetic */ String f3015h;

    /* renamed from: i */
    public final /* synthetic */ C3472s f3016i;

    /* renamed from: j */
    public final /* synthetic */ C3472s f3017j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769ca(List list, C3472s c3472s, String str, C3472s c3472s2, C3472s c3472s3) {
        super(4);
        this.f3013f = list;
        this.f3014g = c3472s;
        this.f3015h = str;
        this.f3016i = c3472s2;
        this.f3017j = c3472s3;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        C3504h c3504h;
        String str;
        int i8;
        int i9;
        C3315c c3315c = (C3315c) obj;
        int intValue = ((Number) obj2).intValue();
        C2395p c2395p = (C2395p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (c2395p.m3870g(c3315c)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i7 = i9 | intValue2;
        } else {
            i7 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (c2395p.m3866e(intValue)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i7 |= i8;
        }
        if ((i7 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C0877fn c0877fn = (C0877fn) this.f3013f.get(intValue);
            c2395p.m3857Z(-699125985);
            C3801i c3801i = C3795c.f17974o;
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            C3120b c3120b = AbstractC3136j.f15789a;
            C3147o0 m4854a = AbstractC3145n0.m4854a(c3120b, c3801i, c2395p, 48);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            C3504h c3504h2 = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p, c3504h2);
            C3504h c3504h3 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p, c3504h3);
            C3504h c3504h4 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h4);
            }
            C3504h c3504h5 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p, c3504h5);
            C3472s c3472s = this.f3014g;
            String str2 = this.f3015h;
            Set set = (Set) c3472s.get(str2);
            if (set == null) {
                set = C1815w.f10862e;
            }
            String str3 = c0877fn.f4045a;
            boolean contains = set.contains(str3);
            c2395p.m3857Z(1638356141);
            boolean m3870g = c2395p.m3870g(str2) | c2395p.m3870g(c0877fn);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                m3847O = new C0737ba(c3472s, str2, c0877fn, 0);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            AbstractC1987r0.m3156a(contains, (InterfaceC3279c) m3847O, null, false, null, c2395p, 0, 60);
            C3149p0 c3149p0 = C3149p0.f15825a;
            InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 1.0f, true);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p, 0);
            int hashCode2 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m4856a);
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4857a, c2395p, c3504h2);
            AbstractC2418w.m3954C(m3882m2, c2395p, c3504h3);
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode2))) {
                c3504h = c3504h4;
                AbstractC2487d.m4050n(hashCode2, c2395p, hashCode2, c3504h);
            } else {
                c3504h = c3504h4;
            }
            AbstractC2418w.m3954C(m5823c2, c2395p, c3504h5);
            InterfaceC3810r m346e2 = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a2 = AbstractC3145n0.m4854a(c3120b, c3801i, c2395p, 48);
            int hashCode3 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m3 = c2395p.m3882m();
            InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p, m346e2);
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a2, c2395p, c3504h2);
            AbstractC2418w.m3954C(m3882m3, c2395p, c3504h3);
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode3))) {
                AbstractC2487d.m4050n(hashCode3, c2395p, hashCode3, c3504h);
            }
            AbstractC2418w.m3954C(m5823c3, c2395p, c3504h5);
            AbstractC1850a7.m3108b(c0877fn.f4045a, c3149p0.m4856a(c3807o, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, c2395p, 0, 3120, 120828);
            Long l7 = (Long) this.f3017j.get(str3);
            if (l7 == null) {
                str = "测速中";
            } else if (l7.longValue() == Long.MAX_VALUE) {
                str = "连接超时";
            } else {
                str = l7 + " ms";
            }
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11255l;
            C2394o2 c2394o22 = AbstractC2019v0.f11943a;
            AbstractC1850a7.m3108b(str, null, ((C2003t0) c2395p.m3878k(c2394o22)).f11807a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 0, 0, 65530);
            c2395p.m3888r(true);
            String str4 = (String) this.f3016i.get(str3);
            if (str4 == null) {
                str4 = "";
            }
            if (AbstractC0444k.m937a0(str4)) {
                str4 = "Geo 查询中或暂无结果";
            }
            AbstractC1850a7.m3108b(str4, null, ((C2003t0) c2395p.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, c2395p, 0, 3120, 55290);
            c2395p.m3888r(true);
            c2395p.m3888r(true);
            c2395p.m3888r(false);
        }
        return C1694m.f10482a;
    }
}
