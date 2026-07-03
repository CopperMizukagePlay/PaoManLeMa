package p039e5;

import java.util.List;
import p001a0.C0078t0;
import p053g5.C1694m;
import p092m.AbstractC2487d;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.he */
/* loaded from: classes.dex */
public final /* synthetic */ class C0932he implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f4504e;

    /* renamed from: f */
    public final /* synthetic */ EnumC0964ie f4505f;

    public /* synthetic */ C0932he(EnumC0964ie enumC0964ie, int i7) {
        this.f4504e = i7;
        this.f4505f = enumC0964ie;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f4504e) {
            case 0:
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                EnumC0964ie enumC0964ie = this.f4505f;
                List m1614a = AbstractC0993je.m1614a(enumC0964ie);
                c3320h.m5054m(m1614a.size(), new C0078t0(15, new C0932he(enumC0964ie, 1), m1614a), new C1481z6(6, m1614a), new C3173d(-632812321, new C0702a7(3, m1614a), true));
                return C1694m.f10482a;
            default:
                C1024ke c1024ke = (C1024ke) obj;
                AbstractC3367j.m5100e(c1024ke, "it");
                return AbstractC2487d.m4044h(this.f4505f.name(), "_", c1024ke.f5267a);
        }
    }
}
