package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p085l0.C2395p;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.m6 */
/* loaded from: classes.dex */
public final class C1078m6 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5841e;

    /* renamed from: f */
    public final /* synthetic */ String f5842f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f5843g;

    public /* synthetic */ C1078m6(int i7, String str, InterfaceC3279c interfaceC3279c) {
        this.f5841e = i7;
        this.f5842f = str;
        this.f5843g = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f5841e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1847a4.m3102a(this.f5842f, this.f5843g, AbstractC0155c.m346e(C3807o.f17991a, 1.0f), false, false, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, AbstractC0792d1.f3249X, AbstractC0792d1.f3250Y, null, null, null, null, null, null, true, 0, 0, null, null, c2395p, 14156160, 12582912, 8257304);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1847a4.m3102a(this.f5842f, this.f5843g, AbstractC0155c.m347f(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), 220), false, false, null, null, AbstractC1228r1.f7280y0, null, null, null, null, null, null, false, 0, 0, null, null, c2395p2, 12583296, 0, 8388472);
                }
                return C1694m.f10482a;
        }
    }
}
