package p039e5;

import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1264s6 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7523e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f7524f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f7525g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7526h;

    public /* synthetic */ C1264s6(InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, int i7) {
        this.f7523e = i7;
        this.f7524f = interfaceC2425y0;
        this.f7525g = interfaceC2425y02;
        this.f7526h = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f7523e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7526h;
        InterfaceC2425y0 interfaceC2425y02 = this.f7525g;
        InterfaceC2425y0 interfaceC2425y03 = this.f7524f;
        switch (i7) {
            case 0:
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y02.setValue((String) interfaceC2425y03.getValue());
                interfaceC2425y0.setValue(Boolean.TRUE);
                return c1694m;
            case 1:
                AbstractC1092mk.m1867v0(interfaceC2425y03, false);
                interfaceC2425y02.setValue(null);
                interfaceC2425y0.setValue("");
                return c1694m;
            case 2:
                interfaceC2425y03.setValue(Boolean.FALSE);
                interfaceC2425y02.setValue("");
                interfaceC2425y0.setValue(Boolean.TRUE);
                return c1694m;
            case 3:
                AbstractC1092mk.m1725R0(interfaceC2425y03, false);
                AbstractC1092mk.m1660E0(interfaceC2425y02, false);
                AbstractC1092mk.m1670G0(interfaceC2425y0, false);
                return c1694m;
            default:
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y03.setValue(null);
                interfaceC2425y02.setValue("");
                AbstractC1092mk.m1867v0(interfaceC2425y0, true);
                return c1694m;
        }
    }
}
