package p092m;

import p001a0.C0005b;
import p035e1.C0677s;
import p042f1.AbstractC1516c;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2390n2;
import p100n.AbstractC2641f;
import p100n.AbstractC2667n1;
import p100n.C2664m1;
import p100n.InterfaceC2627a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC2484b0 {
    /* renamed from: a */
    public static final InterfaceC2390n2 m4035a(long j6, InterfaceC2627a0 interfaceC2627a0, C2395p c2395p, int i7) {
        boolean m3870g = c2395p.m3870g(C0677s.m1457f(j6));
        Object m3847O = c2395p.m3847O();
        if (m3870g || m3847O == C2375k.f13421a) {
            AbstractC1516c m1457f = C0677s.m1457f(j6);
            C2491g c2491g = C2491g.f13800h;
            C0005b c0005b = new C0005b(16, m1457f);
            C2664m1 c2664m1 = AbstractC2667n1.f14365a;
            C2664m1 c2664m12 = new C2664m1(c2491g, c0005b);
            c2395p.m3877j0(c2664m12);
            m3847O = c2664m12;
        }
        return AbstractC2641f.m4235b(new C0677s(j6), (C2664m1) m3847O, interfaceC2627a0, null, "ColorAnimation", c2395p, (i7 << 3) & 896, 8);
    }
}
