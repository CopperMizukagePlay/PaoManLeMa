package p144t;

import p085l0.C2375k;
import p085l0.C2395p;
import p158u5.AbstractC3367j;
import p177x0.C3795c;
import p177x0.C3801i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC3145n0 {

    /* renamed from: a */
    public static final C3147o0 f15814a = new C3147o0(AbstractC3136j.f15789a, C3795c.f17973n);

    /* renamed from: a */
    public static final C3147o0 m4854a(InterfaceC3128f interfaceC3128f, C3801i c3801i, C2395p c2395p, int i7) {
        boolean z7;
        if (AbstractC3367j.m5096a(interfaceC3128f, AbstractC3136j.f15789a) && AbstractC3367j.m5096a(c3801i, C3795c.f17973n)) {
            c2395p.m3857Z(-849160037);
            c2395p.m3888r(false);
            return f15814a;
        }
        c2395p.m3857Z(-849109166);
        boolean z8 = true;
        if ((((i7 & 14) ^ 6) > 4 && c2395p.m3870g(interfaceC3128f)) || (i7 & 6) == 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((((i7 & 112) ^ 48) <= 32 || !c2395p.m3870g(c3801i)) && (i7 & 48) != 32) {
            z8 = false;
        }
        boolean z9 = z7 | z8;
        Object m3847O = c2395p.m3847O();
        if (z9 || m3847O == C2375k.f13421a) {
            m3847O = new C3147o0(interfaceC3128f, c3801i);
            c2395p.m3877j0(m3847O);
        }
        C3147o0 c3147o0 = (C3147o0) m3847O;
        c2395p.m3888r(false);
        return c3147o0;
    }
}
