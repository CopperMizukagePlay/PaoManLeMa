package p039e5;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.o9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1143o9 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f6505e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3810r f6506f;

    public /* synthetic */ C1143o9(InterfaceC3810r interfaceC3810r, int i7, int i8) {
        this.f6505e = i8;
        this.f6506f = interfaceC3810r;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f6505e;
        C2395p c2395p = (C2395p) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                AbstractC1249rm.m2260g(this.f6506f, c2395p, AbstractC2418w.m3957F(7));
                break;
            case 1:
                AbstractC1249rm.m2258f(this.f6506f, c2395p, AbstractC2418w.m3957F(7));
                break;
            default:
                AbstractC1092mk.m1781e(this.f6506f, c2395p, AbstractC2418w.m3957F(7));
                break;
        }
        return C1694m.f10482a;
    }
}
