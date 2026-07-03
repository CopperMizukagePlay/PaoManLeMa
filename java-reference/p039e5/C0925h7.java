package p039e5;

import p000a.AbstractC0000a;
import p053g5.C1694m;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3282f;
import p152u.C3315c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.h7 */
/* loaded from: classes.dex */
public final class C0925h7 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f4464e;

    /* renamed from: f */
    public final /* synthetic */ C1281sn f4465f;

    public /* synthetic */ C0925h7(C1281sn c1281sn, int i7) {
        this.f4464e = i7;
        this.f4465f = c1281sn;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f4464e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1172p7.m2035L(this.f4465f, c2395p, 8);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC1172p7.m2052b("测试日志", "session_limit_log", AbstractC0000a.m12m(), true, null, AbstractC3178i.m4873d(-1497136442, new C1324u4(4, this.f4465f), c2395p2), c2395p2, 199734, 16);
                }
                return C1694m.f10482a;
        }
    }
}
