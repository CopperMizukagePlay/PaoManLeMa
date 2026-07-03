package p039e5;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p079k1.C2266e;
import p085l0.C2395p;
import p102n1.AbstractC2710c;
import p144t.AbstractC3122c;
import p144t.C3149p0;
import p150t5.InterfaceC3282f;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n8 */
/* loaded from: classes.dex */
public final class C1111n8 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f6207e;

    /* renamed from: f */
    public final /* synthetic */ C0703a8 f6208f;

    public /* synthetic */ C1111n8(C0703a8 c0703a8, int i7) {
        this.f6207e = i7;
        this.f6208f = c0703a8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f6207e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b(this.f6208f.f2336c, AbstractC0154b.m339j(C3807o.f17991a, 4, 0.0f, 2), ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11257n, c2395p, 48, 0, 65528);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3149p0) obj, "$this$Button");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C2266e m4348v = AbstractC2710c.m4348v();
                    C3807o c3807o = C3807o.f17991a;
                    AbstractC1949m2.m3140b(m4348v, null, AbstractC0155c.m353l(c3807o, 18), 0L, c2395p2, 432, 8);
                    AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o, 6));
                    if (this.f6208f.f2342i) {
                        str = "Geo 查询中…";
                    } else {
                        str = "查询 Geo";
                    }
                    AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11256m, c2395p2, 0, 0, 65534);
                }
                return C1694m.f10482a;
        }
    }
}
