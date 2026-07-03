package p001a0;

import androidx.compose.p007ui.draw.AbstractC0166a;
import p034e0.AbstractC0638w0;
import p034e0.C0636v0;
import p085l0.C2375k;
import p085l0.C2395p;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.f */
/* loaded from: classes.dex */
public final class C0021f extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public static final C0021f f116f = new AbstractC3368k(3);

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        InterfaceC3810r interfaceC3810r = (InterfaceC3810r) obj;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        c2395p.m3857Z(-2126899193);
        long j6 = ((C0636v0) c2395p.m3878k(AbstractC0638w0.f2110a)).f2103a;
        boolean m3868f = c2395p.m3868f(j6);
        Object m3847O = c2395p.m3847O();
        if (m3868f || m3847O == C2375k.f13421a) {
            m3847O = new C0017e(0, j6);
            c2395p.m3877j0(m3847O);
        }
        InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(AbstractC0166a.m379b(C3807o.f17991a, (InterfaceC3279c) m3847O));
        c2395p.m3888r(false);
        return mo5829e;
    }
}
