package p039e5;

import p017c.C0328m;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p102n1.AbstractC2710c;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3282f;
import p152u.C3315c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.na */
/* loaded from: classes.dex */
public final class C1113na implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f6222e;

    /* renamed from: f */
    public final /* synthetic */ C0328m f6223f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f6224g;

    public /* synthetic */ C1113na(C0328m c0328m, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f6222e = i7;
        this.f6223f = c0328m;
        this.f6224g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f6222e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    InterfaceC2425y0 interfaceC2425y0 = this.f6224g;
                    String str = ((C0959i9) interfaceC2425y0.getValue()).f4779a;
                    if (AbstractC0444k.m937a0(str)) {
                        str = "尚未设置";
                    }
                    AbstractC1850a7.m3108b(str, null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p, 0, 3120, 55290);
                    c2395p.m3857Z(1067171458);
                    C0328m c0328m = this.f6223f;
                    boolean m3874i = c2395p.m3874i(c0328m) | c2395p.m3870g(interfaceC2425y0);
                    Object m3847O = c2395p.m3847O();
                    if (m3874i || m3847O == C2375k.f13421a) {
                        m3847O = new C1082ma(c0328m, interfaceC2425y0, 0);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O, null, false, null, null, null, null, null, AbstractC3178i.m4873d(605005934, new C1076m4(interfaceC2425y0, 2), c2395p), c2395p, 805306368, 510);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC0945hr.m1563G("下载目录", AbstractC2710c.m4344r(), AbstractC3178i.m4873d(-100070818, new C1113na(this.f6223f, this.f6224g, 0), c2395p2), c2395p2, 24582);
                }
                return C1694m.f10482a;
        }
    }
}
