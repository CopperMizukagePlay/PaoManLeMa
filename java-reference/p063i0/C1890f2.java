package p063i0;

import p039e5.AbstractC0951i1;
import p050g2.C1604o0;
import p053g5.C1694m;
import p071j0.AbstractC2152t;
import p078k0.AbstractC2237g;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.f2 */
/* loaded from: classes.dex */
public final class C1890f2 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ long f11177f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890f2(long j6) {
        super(2);
        C3173d c3173d = AbstractC0951i1.f4703a;
        this.f11177f = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1604o0 m3125a = AbstractC1913h7.m3125a(AbstractC2237g.f12955a, c2395p);
            C3173d c3173d = AbstractC0951i1.f4703a;
            AbstractC2152t.m3496b(this.f11177f, m3125a, AbstractC3178i.m4873d(-1771489750, new C2035x0(2, 13), c2395p), c2395p, 384);
        }
        return C1694m.f10482a;
    }
}
