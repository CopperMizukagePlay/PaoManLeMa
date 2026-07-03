package p039e5;

import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wa */
/* loaded from: classes.dex */
public final class C1392wa implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8319e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f8320f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8321g;

    public C1392wa(InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c) {
        this.f8319e = 2;
        this.f8321g = interfaceC2425y0;
        this.f8320f = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8319e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(1429298324);
                    InterfaceC3279c interfaceC3279c = this.f8320f;
                    boolean m3870g = c2395p.m3870g(interfaceC3279c);
                    InterfaceC2425y0 interfaceC2425y0 = this.f8321g;
                    boolean m3870g2 = m3870g | c2395p.m3870g(interfaceC2425y0);
                    Object m3847O = c2395p.m3847O();
                    if (m3870g2 || m3847O == C2375k.f13421a) {
                        m3847O = new C1293t4(interfaceC3279c, interfaceC2425y0, 2);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O, null, false, null, null, null, AbstractC0951i1.f4702Z, c2395p, 805306368, 510);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    c2395p2.m3857Z(-631635205);
                    InterfaceC3279c interfaceC3279c2 = this.f8320f;
                    boolean m3870g3 = c2395p2.m3870g(interfaceC3279c2);
                    Object m3847O2 = c2395p2.m3847O();
                    InterfaceC2425y0 interfaceC2425y02 = this.f8321g;
                    if (m3870g3 || m3847O2 == C2375k.f13421a) {
                        m3847O2 = new C1293t4(interfaceC3279c2, interfaceC2425y02, 3);
                        c2395p2.m3877j0(m3847O2);
                    }
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O2;
                    boolean z7 = false;
                    c2395p2.m3888r(false);
                    if (AbstractC0444k.m956t0((String) interfaceC2425y02.getValue()).toString().length() > 0) {
                        z7 = true;
                    }
                    AbstractC1991r4.m3161b(interfaceC3277a, null, z7, null, null, null, null, null, AbstractC0980j1.f5004a, c2395p2, 805306368, 506);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    c2395p3.m3857Z(-824096269);
                    InterfaceC2425y0 interfaceC2425y03 = this.f8321g;
                    boolean m3870g4 = c2395p3.m3870g(interfaceC2425y03);
                    InterfaceC3279c interfaceC3279c3 = this.f8320f;
                    boolean m3870g5 = m3870g4 | c2395p3.m3870g(interfaceC3279c3);
                    Object m3847O3 = c2395p3.m3847O();
                    if (m3870g5 || m3847O3 == C2375k.f13421a) {
                        m3847O3 = new C1293t4(interfaceC3279c3, interfaceC2425y03, 4);
                        c2395p3.m3877j0(m3847O3);
                    }
                    c2395p3.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O3, null, false, null, null, null, AbstractC1352v1.f8057Z, c2395p3, 805306368, 510);
                }
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C1392wa(InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f8319e = i7;
        this.f8320f = interfaceC3279c;
        this.f8321g = interfaceC2425y0;
    }
}
