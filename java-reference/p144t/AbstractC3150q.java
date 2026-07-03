package p144t;

import p085l0.C2375k;
import p085l0.C2395p;
import p158u5.AbstractC3367j;
import p177x0.C3795c;
import p177x0.C3800h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.q */
/* loaded from: classes.dex */
public abstract class AbstractC3150q {

    /* renamed from: a */
    public static final C3152r f15826a = new C3152r(AbstractC3136j.f15791c, C3795c.f17976q);

    /* renamed from: a */
    public static final C3152r m4857a(InterfaceC3132h interfaceC3132h, C3800h c3800h, C2395p c2395p, int i7) {
        boolean z7;
        if (AbstractC3367j.m5096a(interfaceC3132h, AbstractC3136j.f15791c) && c3800h.equals(C3795c.f17976q)) {
            c2395p.m3857Z(345884104);
            c2395p.m3888r(false);
            return f15826a;
        }
        c2395p.m3857Z(345937951);
        boolean z8 = true;
        if ((((i7 & 14) ^ 6) > 4 && c2395p.m3870g(interfaceC3132h)) || (i7 & 6) == 4) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((((i7 & 112) ^ 48) <= 32 || !c2395p.m3870g(c3800h)) && (i7 & 48) != 32) {
            z8 = false;
        }
        boolean z9 = z7 | z8;
        Object m3847O = c2395p.m3847O();
        if (z9 || m3847O == C2375k.f13421a) {
            m3847O = new C3152r(interfaceC3132h, c3800h);
            c2395p.m3877j0(m3847O);
        }
        C3152r c3152r = (C3152r) m3847O;
        c2395p.m3888r(false);
        return c3152r;
    }
}
