package p063i0;

import p035e1.C0661j0;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3497e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.w1 */
/* loaded from: classes.dex */
public final class C2028w1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f12002f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f12003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2028w1(InterfaceC3279c interfaceC3279c, int i7) {
        super(0);
        this.f12002f = i7;
        this.f12003g = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f12002f) {
            case 0:
                this.f12003g.mo23f(Boolean.FALSE);
                return C1694m.f10482a;
            default:
                C0661j0 c0661j0 = AbstractC3497e1.f16828O;
                this.f12003g.mo23f(c0661j0);
                c0661j0.f2172w = c0661j0.f2166q.mo1393a(c0661j0.f2168s, c0661j0.f2170u, c0661j0.f2169t);
                return C1694m.f10482a;
        }
    }
}
