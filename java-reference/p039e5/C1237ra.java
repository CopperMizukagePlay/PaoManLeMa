package p039e5;

import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ra */
/* loaded from: classes.dex */
public final class C1237ra implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f7303e = 1;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f7304f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f7305g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7306h;

    public C1237ra(InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y02) {
        this.f7304f = interfaceC2425y0;
        this.f7305g = interfaceC3279c;
        this.f7306h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f7303e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(1396665011);
                    InterfaceC3279c interfaceC3279c = this.f7305g;
                    boolean m3870g = c2395p.m3870g(interfaceC3279c);
                    Object m3847O = c2395p.m3847O();
                    if (m3870g || m3847O == C2375k.f13421a) {
                        m3847O = new C1293t4(interfaceC3279c, this.f7304f, 1);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O, null, !((Boolean) this.f7306h.getValue()).booleanValue(), null, null, null, null, null, AbstractC0951i1.f4698V, c2395p, 805306368, 506);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    c2395p2.m3857Z(-2023842137);
                    InterfaceC2425y0 interfaceC2425y0 = this.f7304f;
                    boolean m3870g2 = c2395p2.m3870g(interfaceC2425y0);
                    InterfaceC3279c interfaceC3279c2 = this.f7305g;
                    boolean m3870g3 = m3870g2 | c2395p2.m3870g(interfaceC3279c2);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3870g3 || m3847O2 == C2375k.f13421a) {
                        m3847O2 = new C1014k4(interfaceC3279c2, interfaceC2425y0, this.f7306h, 2);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O2, null, false, null, null, null, AbstractC1352v1.f8046O, c2395p2, 805306368, 510);
                }
                return C1694m.f10482a;
        }
    }

    public C1237ra(InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f7305g = interfaceC3279c;
        this.f7304f = interfaceC2425y0;
        this.f7306h = interfaceC2425y02;
    }
}
