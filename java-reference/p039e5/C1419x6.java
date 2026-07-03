package p039e5;

import java.util.Iterator;
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
/* renamed from: e5.x6 */
/* loaded from: classes.dex */
public final class C1419x6 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f8605e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f8606f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8607g;

    public /* synthetic */ C1419x6(InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f8605e = i7;
        this.f8606f = interfaceC3279c;
        this.f8607g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f8605e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$ExposedDropdownMenu");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    Iterator it = EnumC1125nm.f6347i.iterator();
                    while (it.hasNext()) {
                        Object obj4 = (EnumC1125nm) it.next();
                        C3173d m4873d = AbstractC3178i.m4873d(-517650388, new C1324u4(3, obj4), c2395p);
                        c2395p.m3857Z(1321306755);
                        InterfaceC3279c interfaceC3279c = this.f8606f;
                        boolean m3870g = c2395p.m3870g(interfaceC3279c) | c2395p.m3870g(obj4);
                        Object m3847O = c2395p.m3847O();
                        if (m3870g || m3847O == C2375k.f13421a) {
                            m3847O = new C1384w2(4, obj4, this.f8607g, interfaceC3279c);
                            c2395p.m3877j0(m3847O);
                        }
                        c2395p.m3888r(false);
                        AbstractC1978q.m3151b(m4873d, (InterfaceC3277a) m3847O, null, null, false, null, null, c2395p, 6, 508);
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
                    Iterator it2 = EnumC1163ot.f6740k.iterator();
                    while (it2.hasNext()) {
                        Object obj5 = (EnumC1163ot) it2.next();
                        C3173d m4873d2 = AbstractC3178i.m4873d(2139048501, new C1324u4(5, obj5), c2395p2);
                        c2395p2.m3857Z(290116350);
                        InterfaceC3279c interfaceC3279c2 = this.f8606f;
                        boolean m3870g2 = c2395p2.m3870g(interfaceC3279c2) | c2395p2.m3870g(obj5);
                        Object m3847O2 = c2395p2.m3847O();
                        if (m3870g2 || m3847O2 == C2375k.f13421a) {
                            m3847O2 = new C1384w2(5, obj5, this.f8607g, interfaceC3279c2);
                            c2395p2.m3877j0(m3847O2);
                        }
                        c2395p2.m3888r(false);
                        AbstractC1978q.m3151b(m4873d2, (InterfaceC3277a) m3847O2, null, null, false, null, null, c2395p2, 6, 508);
                    }
                }
                return C1694m.f10482a;
        }
    }
}
