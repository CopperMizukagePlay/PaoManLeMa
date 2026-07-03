package p144t;

import java.util.WeakHashMap;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.y0 */
/* loaded from: classes.dex */
public final class C3167y0 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ int f15872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3167y0(int i7, int i8) {
        super(i7);
        this.f15872f = i8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7 = this.f15872f;
        C2413u0 c2413u0 = C2375k.f13421a;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p.m3857Z(359872873);
                WeakHashMap weakHashMap = C3161v0.f15846u;
                C3161v0 m4822e = C3120b.m4822e(c2395p);
                boolean m3870g = c2395p.m3870g(m4822e);
                Object m3847O = c2395p.m3847O();
                if (m3870g || m3847O == c2413u0) {
                    m3847O = new C3118a0(m4822e.f15851e);
                    c2395p.m3877j0(m3847O);
                }
                C3118a0 c3118a0 = (C3118a0) m3847O;
                c2395p.m3888r(false);
                return c3118a0;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p2.m3857Z(359872873);
                WeakHashMap weakHashMap2 = C3161v0.f15846u;
                C3161v0 m4822e2 = C3120b.m4822e(c2395p2);
                boolean m3870g2 = c2395p2.m3870g(m4822e2);
                Object m3847O2 = c2395p2.m3847O();
                if (m3870g2 || m3847O2 == c2413u0) {
                    m3847O2 = new C3118a0(m4822e2.f15852f);
                    c2395p2.m3877j0(m3847O2);
                }
                C3118a0 c3118a02 = (C3118a0) m3847O2;
                c2395p2.m3888r(false);
                return c3118a02;
        }
    }
}
