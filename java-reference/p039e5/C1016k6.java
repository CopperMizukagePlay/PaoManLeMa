package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.AbstractC1949m2;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p079k1.C2266e;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p159u6.AbstractC3393k;
import p174w5.AbstractC3784a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k6 */
/* loaded from: classes.dex */
public final class C1016k6 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5238e;

    /* renamed from: f */
    public final /* synthetic */ boolean f5239f;

    public /* synthetic */ C1016k6(int i7, boolean z7) {
        this.f5238e = i7;
        this.f5239f = z7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        String str;
        long j6;
        C2266e m5143n;
        String str2;
        C2266e m5143n2;
        String str3;
        switch (this.f5238e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C2266e m5804i = AbstractC3784a.m5804i();
                    boolean z7 = this.f5239f;
                    if (z7) {
                        str = "关闭持续 Ping";
                    } else {
                        str = "开启持续 Ping";
                    }
                    String str4 = str;
                    InterfaceC3810r m353l = AbstractC0155c.m353l(C3807o.f17991a, 18);
                    if (z7) {
                        c2395p.m3857Z(1269772483);
                        j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a;
                        c2395p.m3888r(false);
                    } else {
                        c2395p.m3857Z(1269874938);
                        j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s;
                        c2395p.m3888r(false);
                    }
                    AbstractC1949m2.m3140b(m5804i, str4, m353l, j6, c2395p, 384, 0);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    boolean z8 = this.f5239f;
                    if (z8) {
                        m5143n = AbstractC1793a0.m2993u();
                    } else {
                        m5143n = AbstractC3393k.m5143n();
                    }
                    C2266e c2266e = m5143n;
                    if (z8) {
                        str2 = "收起列表";
                    } else {
                        str2 = "展开列表";
                    }
                    AbstractC1949m2.m3140b(c2266e, str2, AbstractC0155c.m353l(C3807o.f17991a, 20), 0L, c2395p2, 384, 8);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    boolean z9 = this.f5239f;
                    if (z9) {
                        m5143n2 = AbstractC1793a0.m2993u();
                    } else {
                        m5143n2 = AbstractC3393k.m5143n();
                    }
                    C2266e c2266e2 = m5143n2;
                    if (z9) {
                        str3 = "收起设置";
                    } else {
                        str3 = "展开设置";
                    }
                    AbstractC1949m2.m3140b(c2266e2, str3, AbstractC0155c.m353l(C3807o.f17991a, 20), ((C2003t0) c2395p3.m3878k(AbstractC2019v0.f11943a)).f11825s, c2395p3, 384, 0);
                }
                return C1694m.f10482a;
        }
    }
}
