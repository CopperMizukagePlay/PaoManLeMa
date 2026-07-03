package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.C1904g7;
import p079k1.C2266e;
import p085l0.C2395p;
import p144t.AbstractC3122c;
import p144t.C3149p0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.q5 */
/* loaded from: classes.dex */
public final class C1201q5 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f7025e;

    /* renamed from: f */
    public final /* synthetic */ C2266e f7026f;

    /* renamed from: g */
    public final /* synthetic */ String f7027g;

    public /* synthetic */ C1201q5(C2266e c2266e, String str, int i7) {
        this.f7025e = i7;
        this.f7026f = c2266e;
        this.f7027g = str;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f7025e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3149p0) obj, "$this$OutlinedButton");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else if (this.f7026f != null) {
                    c2395p.m3857Z(1294212363);
                    AbstractC1949m2.m3140b(this.f7026f, this.f7027g, AbstractC0155c.m353l(C3807o.f17991a, 16), 0L, c2395p, 384, 8);
                    c2395p.m3888r(false);
                } else {
                    c2395p.m3857Z(1294399541);
                    AbstractC1850a7.m3108b("", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11252i, c2395p, 0, 0, 65534);
                    c2395p.m3888r(false);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3149p0) obj, "$this$Button");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C3807o c3807o = C3807o.f17991a;
                    AbstractC1949m2.m3140b(this.f7026f, null, AbstractC0155c.m353l(c3807o, 18), 0L, c2395p2, 432, 8);
                    AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o, 6));
                    AbstractC1850a7.m3108b(this.f7027g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11256m, c2395p2, 0, 0, 65534);
                }
                return C1694m.f10482a;
        }
    }
}
