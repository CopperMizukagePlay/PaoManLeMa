package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.C1904g7;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wq */
/* loaded from: classes.dex */
public final class C1408wq implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8516e;

    /* renamed from: f */
    public final /* synthetic */ EnumC1251ro f8517f;

    public /* synthetic */ C1408wq(EnumC1251ro enumC1251ro, int i7) {
        this.f8516e = i7;
        this.f8517f = enumC1251ro;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8516e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b(this.f8517f.f7402e, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11251h, c2395p, 0, 3120, 55294);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1949m2.m3140b(this.f8517f.f7403f, null, AbstractC0155c.m353l(C3807o.f17991a, 20), 0L, c2395p2, 432, 8);
                }
                return C1694m.f10482a;
        }
    }
}
