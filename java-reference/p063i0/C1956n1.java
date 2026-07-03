package p063i0;

import p001a0.C0053n;
import p053g5.C1694m;
import p071j0.C2150s;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2661l1;
import p107o.EnumC2788y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.n1 */
/* loaded from: classes.dex */
public final class C1956n1 {

    /* renamed from: a */
    public final C2150s f11575a;

    /* renamed from: b */
    public final C2361g1 f11576b = AbstractC2418w.m3980x(null);

    public C1956n1(EnumC1964o1 enumC1964o1) {
        this.f11575a = new C2150s(enumC1964o1, new C0053n(10, this), AbstractC1982q3.f11695b);
    }

    /* renamed from: a */
    public static Object m3146a(C1956n1 c1956n1, EnumC1964o1 enumC1964o1, AbstractC2590j abstractC2590j) {
        C2661l1 c2661l1 = AbstractC1982q3.f11695b;
        C2150s c2150s = c1956n1.f11575a;
        Object m3484a = c2150s.m3484a(enumC1964o1, EnumC2788y0.f14796e, new C1948m1(c1956n1, c2150s.f12516i.m3729g(), c2661l1, null), abstractC2590j);
        if (m3484a == EnumC2465a.f13750e) {
            return m3484a;
        }
        return C1694m.f10482a;
    }

    /* renamed from: b */
    public final Object m3147b(AbstractC2590j abstractC2590j) {
        Object m3146a = m3146a(this, EnumC1964o1.f11599e, abstractC2590j);
        if (m3146a == EnumC2465a.f13750e) {
            return m3146a;
        }
        return C1694m.f10482a;
    }
}
