package p039e5;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p024c6.AbstractC0444k;
import p035e1.C0671o0;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.C1813u;
import p060h5.C1815w;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p068i5.AbstractC2080d;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3283g;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p161v0.C3472s;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p190z.AbstractC3861e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ka */
/* loaded from: classes.dex */
public final class C1020ka extends AbstractC3368k implements InterfaceC3283g {

    /* renamed from: f */
    public final /* synthetic */ int f5252f;

    /* renamed from: g */
    public final /* synthetic */ List f5253g;

    /* renamed from: h */
    public final /* synthetic */ Object f5254h;

    /* renamed from: i */
    public final /* synthetic */ Object f5255i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1020ka(List list, Object obj, Object obj2, int i7) {
        super(4);
        this.f5252f = i7;
        this.f5253g = list;
        this.f5254h = obj;
        this.f5255i = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
    
        if (p158u5.AbstractC3367j.m5096a(r8.m3847O(), java.lang.Integer.valueOf(r10)) == false) goto L46;
     */
    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        int i9;
        int i10;
        float f7;
        long j6;
        C3801i c3801i;
        String str;
        boolean z7;
        long j7;
        int i11;
        int i12;
        switch (this.f5252f) {
            case 0:
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
                    C0800d9 c0800d9 = (C0800d9) ((ArrayList) this.f5253g).get(intValue);
                    c2395p.m3857Z(-259034070);
                    List list = (List) ((Map) ((InterfaceC2390n2) this.f5255i).getValue()).get(c0800d9.f3340a);
                    if (list == null) {
                        list = C1813u.f10860e;
                    }
                    AbstractC1249rm.m2254d(c0800d9, list, (C1196q0) this.f5254h, c2395p, 520);
                    c2395p.m3888r(false);
                }
                return C1694m.f10482a;
            default:
                Object obj5 = (C3315c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C2395p c2395p2 = (C2395p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                C0910go c0910go = (C0910go) this.f5255i;
                C3472s c3472s = (C3472s) this.f5254h;
                if ((intValue4 & 6) == 0) {
                    if (c2395p2.m3870g(obj5)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = i12 | intValue4;
                } else {
                    i10 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (c2395p2.m3866e(intValue3)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 147) == 146 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C1467yn c1467yn = (C1467yn) this.f5253g.get(intValue3);
                    c2395p2.m3857Z(-836679188);
                    Set set = (Set) c3472s.get(c0910go.f4322a);
                    if (set == null) {
                        set = C1815w.f10862e;
                    }
                    String str2 = c1467yn.f9464a;
                    Double d7 = c1467yn.f9466c;
                    boolean z8 = c1467yn.f9468e;
                    boolean contains = set.contains(str2);
                    C3807o c3807o = C3807o.f17991a;
                    float f8 = 8;
                    InterfaceC3810r m5799c = AbstractC3784a.m5799c(AbstractC0155c.m346e(c3807o, 1.0f), AbstractC3861e.m5873a(f8));
                    c2395p2.m3857Z(-1828099634);
                    boolean m3870g = c2395p2.m3870g(c3472s) | c2395p2.m3874i(c0910go) | c2395p2.m3874i(c1467yn);
                    Object m3847O = c2395p2.m3847O();
                    Object obj6 = C2375k.f13421a;
                    if (m3870g || m3847O == obj6) {
                        m3847O = new C1058lh(c0910go, c1467yn, c3472s, 1);
                        c2395p2.m3877j0(m3847O);
                    }
                    c2395p2.m3888r(false);
                    InterfaceC3810r m322e = AbstractC0145a.m322e(7, null, (InterfaceC3277a) m3847O, m5799c, false);
                    float f9 = 1;
                    if (contains) {
                        c2395p2.m3857Z(-836290728);
                        f7 = f8;
                        j6 = ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11807a;
                        c2395p2.m3888r(false);
                    } else {
                        f7 = f8;
                        c2395p2.m3857Z(-836164527);
                        j6 = ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11784B;
                        c2395p2.m3888r(false);
                    }
                    InterfaceC3810r m338i = AbstractC0154b.m338i(m322e.mo5829e(new BorderModifierNodeElement(f9, new C0671o0(j6), AbstractC3861e.m5873a(f7))), 6, f7);
                    C3801i c3801i2 = C3795c.f17974o;
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, c3801i2, c2395p2, 48);
                    int hashCode = Long.hashCode(c2395p2.f13486T);
                    InterfaceC2385m1 m3882m = c2395p2.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m338i);
                    InterfaceC3510j.f16935d.getClass();
                    InterfaceC3277a interfaceC3277a = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(interfaceC3277a);
                    } else {
                        c2395p2.m3883m0();
                    }
                    C3504h c3504h = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
                    C3504h c3504h2 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
                    C3504h c3504h3 = C3507i.f16932f;
                    if (!c2395p2.f13485S) {
                        c3801i = c3801i2;
                        break;
                    } else {
                        c3801i = c3801i2;
                    }
                    AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
                    C3504h c3504h4 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
                    c2395p2.m3857Z(1868422989);
                    boolean m3870g2 = c2395p2.m3870g(c3472s) | c2395p2.m3874i(c0910go) | c2395p2.m3874i(c1467yn);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3870g2 || m3847O2 == obj6) {
                        m3847O2 = new C0737ba(c0910go, c1467yn, c3472s);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    C3801i c3801i3 = c3801i;
                    AbstractC1987r0.m3156a(contains, (InterfaceC3279c) m3847O2, null, false, null, c2395p2, 0, 60);
                    C3149p0 c3149p0 = C3149p0.f15825a;
                    InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 1.0f, true);
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(2), C3795c.f17976q, c2395p2, 6);
                    int hashCode2 = Long.hashCode(c2395p2.f13486T);
                    InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m4856a);
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(interfaceC3277a);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
                    AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                        AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
                    C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, c3801i3, c2395p2, 54);
                    int hashCode3 = Long.hashCode(c2395p2.f13486T);
                    InterfaceC2385m1 m3882m3 = c2395p2.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p2, m346e);
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(interfaceC3277a);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a2, c2395p2, c3504h);
                    AbstractC2418w.m3954C(m3882m3, c2395p2, c3504h2);
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode3))) {
                        AbstractC2487d.m4050n(hashCode3, c2395p2, hashCode3, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p2, c3504h4);
                    float f10 = f7;
                    AbstractC1850a7.m3108b(c1467yn.f9464a, c3149p0.m4856a(c3807o, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, AbstractC1991r4.m3172m(c2395p2).f11254k, c2395p2, 0, 3120, 55292);
                    if (z8) {
                        str = "测量中";
                    } else if (d7 != null) {
                        str = String.format("%.1f ms", Arrays.copyOf(new Object[]{d7}, 1));
                    } else {
                        str = "超时";
                    }
                    InterfaceC3810r m340k = AbstractC0154b.m340k(c3807o, f10, 0.0f, 0.0f, 0.0f, 14);
                    C1604o0 c1604o0 = AbstractC1991r4.m3172m(c2395p2).f11258o;
                    if (z8) {
                        c2395p2.m3857Z(1962742142);
                        j7 = AbstractC1991r4.m3170k(c2395p2).f11825s;
                        z7 = false;
                        c2395p2.m3888r(false);
                    } else {
                        z7 = false;
                        if (d7 != null) {
                            c2395p2.m3857Z(1962746037);
                            j7 = AbstractC1991r4.m3170k(c2395p2).f11807a;
                            c2395p2.m3888r(false);
                        } else {
                            c2395p2.m3857Z(1962748915);
                            j7 = AbstractC1991r4.m3170k(c2395p2).f11829w;
                            c2395p2.m3888r(false);
                        }
                    }
                    boolean z9 = z7;
                    AbstractC1850a7.m3108b(str, m340k, j7, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, c1604o0, c2395p2, 48, 3072, 57336);
                    C2395p c2395p3 = c2395p2;
                    c2395p3.m3888r(true);
                    StringBuilder sb = new StringBuilder();
                    if (!AbstractC0444k.m937a0(c1467yn.m2429c())) {
                        sb.append(c1467yn.m2429c());
                    }
                    if (!AbstractC0444k.m937a0(c1467yn.m2428b())) {
                        if (sb.length() > 0) {
                            sb.append(" · ");
                        }
                        sb.append("DNS " + c1467yn.m2428b());
                    }
                    String sb2 = sb.toString();
                    c2395p3.m3857Z(-1061989110);
                    if (!AbstractC0444k.m937a0(sb2)) {
                        AbstractC1850a7.m3108b(sb2, null, AbstractC1991r4.m3170k(c2395p3).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC1991r4.m3172m(c2395p3).f11258o, c2395p3, 0, 3120, 55290);
                        c2395p3 = c2395p3;
                    }
                    c2395p3.m3888r(z9);
                    if (!AbstractC0444k.m937a0(c1467yn.f9467d)) {
                        c2395p3.m3857Z(1438679003);
                        C2395p c2395p4 = c2395p3;
                        AbstractC1850a7.m3108b(c1467yn.f9467d, null, AbstractC1991r4.m3170k(c2395p3).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, C1604o0.m2592a(AbstractC1991r4.m3172m(c2395p3).f11258o, 0L, AbstractC2080d.m3405r(10), null, null, 0L, 0L, null, 16777213), c2395p4, 0, 3120, 55290);
                        c2395p3 = c2395p4;
                        c2395p3.m3888r(z9);
                    } else if (c1467yn.f9469f) {
                        c2395p3.m3857Z(1439239948);
                        C2395p c2395p5 = c2395p3;
                        AbstractC1850a7.m3108b("Geo 查询中…", null, AbstractC1991r4.m3170k(c2395p3).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, C1604o0.m2592a(AbstractC1991r4.m3172m(c2395p3).f11258o, 0L, AbstractC2080d.m3405r(10), null, null, 0L, 0L, null, 16777213), c2395p5, 6, 3072, 57338);
                        c2395p3 = c2395p5;
                        c2395p3.m3888r(z9);
                    } else {
                        c2395p3.m3857Z(1439677203);
                        c2395p3.m3888r(z9);
                    }
                    c2395p3.m3888r(true);
                    c2395p3.m3888r(true);
                    c2395p3.m3888r(z9);
                }
                return C1694m.f10482a;
        }
    }
}
