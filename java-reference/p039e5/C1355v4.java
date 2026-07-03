package p039e5;

import java.util.List;
import p017c.C0317b;
import p053g5.C1694m;
import p063i0.AbstractC1978q;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.v4 */
/* loaded from: classes.dex */
public final class C1355v4 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f8107e = 1;

    /* renamed from: f */
    public final /* synthetic */ List f8108f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f8109g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8110h;

    public C1355v4(List list, InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0) {
        this.f8108f = list;
        this.f8109g = interfaceC3279c;
        this.f8110h = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f8107e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$ExposedDropdownMenu");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3173d c3173d = AbstractC0792d1.f3238M;
                    c2395p.m3857Z(-1569547508);
                    InterfaceC3279c interfaceC3279c = this.f8109g;
                    boolean m3870g = c2395p.m3870g(interfaceC3279c);
                    Object m3847O = c2395p.m3847O();
                    InterfaceC2425y0 interfaceC2425y0 = this.f8110h;
                    Object obj4 = C2375k.f13421a;
                    if (m3870g || m3847O == obj4) {
                        m3847O = new C1293t4(interfaceC3279c, interfaceC2425y0, 0);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1978q.m3151b(c3173d, (InterfaceC3277a) m3847O, null, null, false, null, null, c2395p, 6, 508);
                    List<Object> list = this.f8108f;
                    if (list.isEmpty()) {
                        c2395p.m3857Z(-1411168159);
                        C3173d c3173d2 = AbstractC0792d1.f3239N;
                        c2395p.m3857Z(-1569537049);
                        Object m3847O2 = c2395p.m3847O();
                        if (m3847O2 == obj4) {
                            m3847O2 = new C0317b(1);
                            c2395p.m3877j0(m3847O2);
                        }
                        c2395p.m3888r(false);
                        AbstractC1978q.m3151b(c3173d2, (InterfaceC3277a) m3847O2, null, null, false, null, null, c2395p, 196662, 476);
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(-1410906643);
                        for (Object obj5 : list) {
                            C3173d m4873d = AbstractC3178i.m4873d(-134586409, new C1324u4(0, obj5), c2395p);
                            c2395p.m3857Z(-749814006);
                            boolean m3870g2 = c2395p.m3870g(interfaceC3279c) | c2395p.m3874i(obj5);
                            Object m3847O3 = c2395p.m3847O();
                            if (m3870g2 || m3847O3 == obj4) {
                                m3847O3 = new C1384w2(1, obj5, interfaceC2425y0, interfaceC3279c);
                                c2395p.m3877j0(m3847O3);
                            }
                            c2395p.m3888r(false);
                            AbstractC1978q.m3151b(m4873d, (InterfaceC3277a) m3847O3, null, null, false, null, null, c2395p, 6, 508);
                        }
                        c2395p.m3888r(false);
                    }
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$ExposedDropdownMenu");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    for (Object obj6 : this.f8108f) {
                        C3173d m4873d2 = AbstractC3178i.m4873d(-798317759, new C1324u4(1, obj6), c2395p2);
                        c2395p2.m3857Z(351187490);
                        InterfaceC3279c interfaceC3279c2 = this.f8109g;
                        boolean m3870g3 = c2395p2.m3870g(interfaceC3279c2) | c2395p2.m3870g(obj6);
                        Object m3847O4 = c2395p2.m3847O();
                        if (m3870g3 || m3847O4 == C2375k.f13421a) {
                            m3847O4 = new C1384w2(2, obj6, this.f8110h, interfaceC3279c2);
                            c2395p2.m3877j0(m3847O4);
                        }
                        c2395p2.m3888r(false);
                        AbstractC1978q.m3151b(m4873d2, (InterfaceC3277a) m3847O4, null, null, false, null, null, c2395p2, 6, 508);
                    }
                }
                return C1694m.f10482a;
        }
    }

    public C1355v4(InterfaceC3279c interfaceC3279c, List list, InterfaceC2425y0 interfaceC2425y0) {
        this.f8109g = interfaceC3279c;
        this.f8108f = list;
        this.f8110h = interfaceC2425y0;
    }
}
