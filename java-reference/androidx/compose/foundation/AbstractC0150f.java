package androidx.compose.foundation;

import p001a0.C0028g2;
import p085l0.AbstractC2397p1;
import p085l0.C2394o2;
import p107o.C2774r0;
import p107o.InterfaceC2768p0;
import p107o.InterfaceC2780u0;
import p137s.InterfaceC3080i;
import p177x0.AbstractC3793a;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.f */
/* loaded from: classes.dex */
public abstract class AbstractC0150f {

    /* renamed from: a */
    public static final C2394o2 f613a = new AbstractC2397p1(C2774r0.f14764g);

    /* renamed from: a */
    public static final InterfaceC3810r m326a(InterfaceC3810r interfaceC3810r, InterfaceC3080i interfaceC3080i, InterfaceC2768p0 interfaceC2768p0) {
        if (interfaceC2768p0 == null) {
            return interfaceC3810r;
        }
        if (interfaceC2768p0 instanceof InterfaceC2780u0) {
            return interfaceC3810r.mo5829e(new IndicationModifierElement(interfaceC3080i, (InterfaceC2780u0) interfaceC2768p0));
        }
        return AbstractC3793a.m5821a(interfaceC3810r, new C0028g2(2, interfaceC2768p0, interfaceC3080i));
    }
}
