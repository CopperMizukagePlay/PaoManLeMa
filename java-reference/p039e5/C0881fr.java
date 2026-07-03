package p039e5;

import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p085l0.C2395p;
import p144t.C3149p0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fr */
/* loaded from: classes.dex */
public final class C0881fr implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f4067e;

    /* renamed from: f */
    public final /* synthetic */ boolean f4068f;

    public C0881fr(boolean z7, boolean z8) {
        this.f4067e = z7;
        this.f4068f = z8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3149p0) obj, "$this$OutlinedButton");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            if (this.f4067e) {
                str = "下载中";
            } else if (this.f4068f) {
                str = "检查中";
            } else {
                str = "检查更新";
            }
            AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11257n, c2395p, 0, 0, 65534);
        }
        return C1694m.f10482a;
    }
}
