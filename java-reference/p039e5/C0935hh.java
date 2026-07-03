package p039e5;

import p035e1.C0661j0;
import p053g5.C1694m;
import p085l0.InterfaceC2390n2;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hh */
/* loaded from: classes.dex */
public final class C0935hh implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ boolean f4575e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2390n2 f4576f;

    public C0935hh(boolean z7, InterfaceC2390n2 interfaceC2390n2) {
        this.f4575e = z7;
        this.f4576f = interfaceC2390n2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C0661j0 c0661j0 = (C0661j0) obj;
        AbstractC3367j.m5100e(c0661j0, "$this$graphicsLayer");
        if (this.f4575e) {
            float f7 = AbstractC1092mk.f5952h;
            c0661j0.m1442q(((Number) this.f4576f.getValue()).floatValue());
            c0661j0.m1435f(1.03f);
            c0661j0.m1436g(1.03f);
            c0661j0.m1437h(8.0f);
        }
        return C1694m.f10482a;
    }
}
