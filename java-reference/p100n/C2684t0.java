package p100n;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.t0 */
/* loaded from: classes.dex */
public final class C2684t0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f14422f = 1;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3368k f14423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2684t0(InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f14423g = (AbstractC3368k) interfaceC3279c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [t5.c, u5.k, t5.e] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f14422f;
        ?? r12 = this.f14423g;
        switch (i7) {
            case 0:
                C2653j c2653j = (C2653j) obj;
                Object value = c2653j.f14336e.getValue();
                C2664m1 c2664m1 = AbstractC2667n1.f14365a;
                r12.mo22d(value, Float.valueOf(((C2662m) c2653j.f14337f).f14358a));
                return C1694m.f10482a;
            default:
                return r12.mo23f(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2684t0(InterfaceC3281e interfaceC3281e) {
        super(1);
        C2664m1 c2664m1 = AbstractC2667n1.f14365a;
        this.f14423g = (AbstractC3368k) interfaceC3281e;
    }
}
