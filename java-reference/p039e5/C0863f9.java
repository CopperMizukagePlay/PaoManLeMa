package p039e5;

import p035e1.C0661j0;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.f9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0863f9 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3956e;

    /* renamed from: f */
    public final /* synthetic */ boolean f3957f;

    public /* synthetic */ C0863f9(int i7, boolean z7) {
        this.f3956e = i7;
        this.f3957f = z7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        float f7;
        switch (this.f3956e) {
            case 0:
                C0959i9 c0959i9 = (C0959i9) obj;
                AbstractC3367j.m5100e(c0959i9, "it");
                if (this.f3957f && c0959i9.f4780b) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return C0959i9.m1601a(c0959i9, null, false, null, 0, 0, null, 0, 0, null, false, z7, 0, 3071);
            case 1:
                C0959i9 c0959i92 = (C0959i9) obj;
                AbstractC3367j.m5100e(c0959i92, "it");
                return C0959i9.m1601a(c0959i92, null, false, null, 0, 0, null, 0, 0, null, this.f3957f, false, 0, 3583);
            default:
                C0661j0 c0661j0 = (C0661j0) obj;
                AbstractC3367j.m5100e(c0661j0, "$this$graphicsLayer");
                if (this.f3957f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c0661j0.m1432a(f7);
                return C1694m.f10482a;
        }
    }
}
