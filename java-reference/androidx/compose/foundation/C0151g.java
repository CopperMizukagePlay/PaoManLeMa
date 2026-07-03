package androidx.compose.foundation;

import p067i4.AbstractC2072e;
import p085l0.C2395p;
import p107o.C2769p1;
import p122q.EnumC2931o0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.g */
/* loaded from: classes.dex */
public final class C0151g extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ C2769p1 f614f;

    /* renamed from: g */
    public final /* synthetic */ boolean f615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151g(C2769p1 c2769p1, boolean z7) {
        super(3);
        this.f614f = c2769p1;
        this.f615g = z7;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        EnumC2931o0 enumC2931o0;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        c2395p.m3857Z(1478351300);
        C2769p1 c2769p1 = this.f614f;
        boolean z7 = this.f615g;
        ScrollSemanticsElement scrollSemanticsElement = new ScrollSemanticsElement(c2769p1, z7);
        if (z7) {
            enumC2931o0 = EnumC2931o0.f15240e;
        } else {
            enumC2931o0 = EnumC2931o0.f15241f;
        }
        InterfaceC3810r mo5829e = AbstractC2072e.m3343u(scrollSemanticsElement, c2769p1, enumC2931o0, true, null, c2769p1.f14747c, null, c2395p, 64).mo5829e(new ScrollingLayoutElement(c2769p1, z7));
        c2395p.m3888r(false);
        return mo5829e;
    }
}
