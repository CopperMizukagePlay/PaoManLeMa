package p039e5;

import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p085l0.C2395p;
import p100n.AbstractC2647h;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k8 */
/* loaded from: classes.dex */
public final class C1018k8 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5247e;

    /* renamed from: f */
    public final /* synthetic */ int f5248f;

    public /* synthetic */ C1018k8(int i7, int i8) {
        this.f5247e = i8;
        this.f5248f = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f5247e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b(AbstractC2647h.m4256b("DNS ", this.f5248f + 1), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 0, 0, 65534);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1850a7.m3108b(AbstractC2647h.m4256b("DNS 服务器 ", this.f5248f + 1), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p2, 0, 0, 131070);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    AbstractC1850a7.m3108b(AbstractC2647h.m4256b("地域 ", this.f5248f + 1), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p3, 0, 0, 131070);
                }
                return C1694m.f10482a;
        }
    }
}
