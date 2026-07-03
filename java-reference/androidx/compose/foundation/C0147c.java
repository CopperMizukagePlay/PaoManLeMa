package androidx.compose.foundation;

import p085l0.C2375k;
import p085l0.C2395p;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2780u0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.c */
/* loaded from: classes.dex */
public final class C0147c extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3277a f608f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147c(InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2) {
        super(3);
        this.f608f = interfaceC3277a;
        this.f609g = interfaceC3277a2;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C3081j c3081j;
        InterfaceC3810r m5821a;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        c2395p.m3857Z(1969174843);
        InterfaceC2768p0 interfaceC2768p0 = (InterfaceC2768p0) c2395p.m3878k(AbstractC0150f.f613a);
        boolean z7 = interfaceC2768p0 instanceof InterfaceC2780u0;
        if (z7) {
            c2395p.m3857Z(-1726989699);
            c2395p.m3888r(false);
            c3081j = null;
        } else {
            c2395p.m3857Z(-1726881726);
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = new C3081j();
                c2395p.m3877j0(m3847O);
            }
            c3081j = (C3081j) m3847O;
            c2395p.m3888r(false);
        }
        InterfaceC3277a interfaceC3277a = this.f608f;
        InterfaceC3277a interfaceC3277a2 = this.f609g;
        if (z7) {
            m5821a = new CombinedClickableElement(c3081j, (InterfaceC2780u0) interfaceC2768p0, interfaceC3277a2, interfaceC3277a);
        } else if (interfaceC2768p0 == null) {
            m5821a = new CombinedClickableElement(c3081j, null, interfaceC3277a2, interfaceC3277a);
        } else {
            C3807o c3807o = C3807o.f17991a;
            if (c3081j != null) {
                m5821a = AbstractC0150f.m326a(c3807o, c3081j, interfaceC2768p0).mo5829e(new CombinedClickableElement(c3081j, null, interfaceC3277a2, interfaceC3277a));
            } else {
                m5821a = AbstractC3793a.m5821a(c3807o, new C0148d(interfaceC2768p0, interfaceC3277a2, interfaceC3277a));
            }
        }
        c2395p.m3888r(false);
        return m5821a;
    }
}
