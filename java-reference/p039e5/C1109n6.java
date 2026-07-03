package p039e5;

import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p068i5.AbstractC2080d;
import p085l0.C2395p;
import p144t.C3149p0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n6 */
/* loaded from: classes.dex */
public final class C1109n6 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f6184e;

    /* renamed from: f */
    public final /* synthetic */ boolean f6185f;

    /* renamed from: g */
    public final /* synthetic */ String f6186g;

    public C1109n6(boolean z7, boolean z8, String str) {
        this.f6184e = z7;
        this.f6185f = z8;
        this.f6186g = str;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        long j6;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3149p0) obj, "$this$TextButton");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1604o0 m2592a = C1604o0.m2592a(((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11258o, 0L, AbstractC2080d.m3405r(10), null, null, 0L, 0L, null, 16777213);
            boolean z7 = this.f6184e;
            boolean z8 = this.f6185f;
            if (z7 && z8) {
                c2395p.m3857Z(455355686);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11829w;
                c2395p.m3888r(false);
            } else if (z8) {
                c2395p.m3857Z(455357800);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a;
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(455359793);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s;
                c2395p.m3888r(false);
            }
            AbstractC1850a7.m3108b(this.f6186g, null, j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, m2592a, c2395p, 0, 0, 65530);
        }
        return C1694m.f10482a;
    }
}
