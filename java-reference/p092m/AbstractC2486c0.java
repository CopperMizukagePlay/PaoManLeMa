package p092m;

import android.view.ViewConfiguration;
import p001a0.C0019e1;
import p085l0.C2375k;
import p085l0.C2395p;
import p100n.C2692w;
import p140s2.InterfaceC3093c;
import p170w1.AbstractC3674f1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC2486c0 {

    /* renamed from: a */
    public static final float f13786a = ViewConfiguration.getScrollFriction();

    /* renamed from: a */
    public static final C2692w m4036a(C2395p c2395p) {
        InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
        boolean m3864d = c2395p.m3864d(interfaceC3093c.mo559b());
        Object m3847O = c2395p.m3847O();
        if (m3864d || m3847O == C2375k.f13421a) {
            m3847O = new C2692w(new C0019e1(interfaceC3093c));
            c2395p.m3877j0(m3847O);
        }
        return (C2692w) m3847O;
    }
}
