package p039e5;

import p053g5.C1694m;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ve */
/* loaded from: classes.dex */
public final /* synthetic */ class C1365ve implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f8165e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f8166f;

    /* renamed from: g */
    public final /* synthetic */ C2349d1 f8167g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8168h;

    public /* synthetic */ C1365ve(InterfaceC3279c interfaceC3279c, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f8165e = i7;
        this.f8166f = interfaceC3279c;
        this.f8167g = c2349d1;
        this.f8168h = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f8165e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f8168h;
        C2349d1 c2349d1 = this.f8167g;
        InterfaceC3279c interfaceC3279c = this.f8166f;
        switch (i7) {
            case 0:
                AbstractC1092mk.m1649C(interfaceC3279c, c2349d1, interfaceC2425y0);
                return c1694m;
            default:
                float f7 = AbstractC1092mk.f5952h;
                c2349d1.m3742h(-1);
                interfaceC2425y0.setValue(Boolean.TRUE);
                interfaceC3279c.mo23f("");
                return c1694m;
        }
    }
}
