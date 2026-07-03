package p001a0;

import p034e0.InterfaceC0617m;
import p050g2.C1604o0;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p063i0.AbstractC1913h7;
import p063i0.C1879e0;
import p063i0.C1904g7;
import p071j0.AbstractC2151s0;
import p071j0.AbstractC2152t;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p144t.InterfaceC3135i0;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.a */
/* loaded from: classes.dex */
public final class C0001a extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f16f;

    /* renamed from: g */
    public final /* synthetic */ long f17g;

    /* renamed from: h */
    public final /* synthetic */ Object f18h;

    /* renamed from: i */
    public final /* synthetic */ Object f19i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0001a(long j6, Object obj, InterfaceC1684c interfaceC1684c, int i7) {
        super(2);
        this.f16f = i7;
        this.f17g = j6;
        this.f18h = obj;
        this.f19i = interfaceC1684c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f16f) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC0617m interfaceC0617m = (InterfaceC0617m) this.f18h;
                InterfaceC3810r interfaceC3810r = (InterfaceC3810r) this.f19i;
                AbstractC0025g.m53a(interfaceC0617m, interfaceC3810r, this.f17g, (C2395p) obj, AbstractC2418w.m3957F(1));
                return C1694m.f10482a;
            case 1:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC2152t.m3496b(this.f17g, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11256m, AbstractC3178i.m4873d(1327513942, new C1879e0(0, (InterfaceC3135i0) this.f18h, (InterfaceC3282f) this.f19i), c2395p), c2395p, 384);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC2151s0.m3492b(this.f17g, (C1604o0) this.f18h, (InterfaceC3281e) this.f19i, c2395p2, 0);
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001a(InterfaceC0617m interfaceC0617m, InterfaceC3810r interfaceC3810r, long j6, int i7) {
        super(2);
        this.f16f = 0;
        this.f18h = interfaceC0617m;
        this.f19i = interfaceC3810r;
        this.f17g = j6;
    }
}
