package p063i0;

import p035e1.C0677s;
import p050g2.C1604o0;
import p053g5.C1694m;
import p071j0.AbstractC2152t;
import p078k0.AbstractC2248q;
import p085l0.C2395p;
import p092m.AbstractC2484b0;
import p100n.AbstractC2638e;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.d3 */
/* loaded from: classes.dex */
public final class C1873d3 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C2045y2 f11062f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11063g;

    /* renamed from: h */
    public final /* synthetic */ boolean f11064h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3281e f11065i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1873d3(C2045y2 c2045y2, boolean z7, boolean z8, InterfaceC3281e interfaceC3281e) {
        super(2);
        this.f11062f = c2045y2;
        this.f11063g = z7;
        this.f11064h = z8;
        this.f11065i = interfaceC3281e;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        long j6;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1604o0 m3125a = AbstractC1913h7.m3125a(AbstractC2248q.f13012g, c2395p);
            boolean z7 = this.f11064h;
            C2045y2 c2045y2 = this.f11062f;
            if (!z7) {
                j6 = c2045y2.f12175g;
            } else if (this.f11063g) {
                j6 = c2045y2.f12170b;
            } else {
                j6 = c2045y2.f12173e;
            }
            AbstractC2152t.m3496b(((C0677s) AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(100, 6, null), c2395p, 48).getValue()).f2211a, m3125a, this.f11065i, c2395p, 0);
        }
        return C1694m.f10482a;
    }
}
