package p039e5;

import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p063i0.AbstractC1991r4;
import p085l0.C2375k;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.p5 */
/* loaded from: classes.dex */
public final class C1170p5 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f6809e = 0;

    /* renamed from: f */
    public final /* synthetic */ String f6810f;

    /* renamed from: g */
    public final /* synthetic */ boolean f6811g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC1684c f6812h;

    public C1170p5(String str, boolean z7, InterfaceC3279c interfaceC3279c) {
        this.f6810f = str;
        this.f6811g = z7;
        this.f6812h = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        switch (this.f6809e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f6812h;
                if ((intValue & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else if (this.f6810f.length() > 0 && this.f6811g) {
                    c2395p.m3857Z(-891208435);
                    boolean m3870g = c2395p.m3870g(interfaceC3279c);
                    Object m3847O = c2395p.m3847O();
                    if (m3870g || m3847O == C2375k.f13421a) {
                        m3847O = new C1139o5(interfaceC3279c, 0);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3165f((InterfaceC3277a) m3847O, null, false, null, AbstractC0792d1.f3235J, c2395p, 196608, 30);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f6812h;
                    if (AbstractC1249rm.m2285s0(this.f6810f) != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC1991r4.m3161b(interfaceC3277a, null, z7, null, null, null, null, null, AbstractC3178i.m4873d(-616304051, new C1429xg(3, this.f6811g), c2395p2), c2395p2, 805306368, 506);
                }
                return C1694m.f10482a;
        }
    }

    public C1170p5(InterfaceC3277a interfaceC3277a, String str, boolean z7) {
        this.f6812h = interfaceC3277a;
        this.f6810f = str;
        this.f6811g = z7;
    }
}
