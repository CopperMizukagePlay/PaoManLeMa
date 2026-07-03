package p063i0;

import p028d2.AbstractC0479l;
import p035e1.C0675q0;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p140s2.C3101k;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p171w2.C3752b;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.o */
/* loaded from: classes.dex */
public final class C1962o extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11590f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f11591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1962o(InterfaceC2425y0 interfaceC2425y0, int i7) {
        super(2);
        this.f11590f = i7;
        this.f11591g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        switch (this.f11590f) {
            case 0:
                this.f11591g.setValue(new C0675q0(AbstractC2021v2.m3200c((C3101k) obj, (C3101k) obj2)));
                return C1694m.f10482a;
            case 1:
                this.f11591g.setValue(new C0675q0(AbstractC2021v2.m3200c((C3101k) obj, (C3101k) obj2)));
                return C1694m.f10482a;
            default:
                C2395p c2395p = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (c2395p.m3849R(intValue & 1, z7)) {
                    Object m3847O = c2395p.m3847O();
                    if (m3847O == C2375k.f13421a) {
                        m3847O = C3752b.f17823g;
                        c2395p.m3877j0(m3847O);
                    }
                    AbstractC2064e.m3236f(AbstractC0479l.m1037a(C3807o.f17991a, false, (InterfaceC3279c) m3847O), (InterfaceC3281e) this.f11591g.getValue(), c2395p, 0);
                } else {
                    c2395p.m3852U();
                }
                return C1694m.f10482a;
        }
    }
}
