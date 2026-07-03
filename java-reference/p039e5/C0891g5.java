package p039e5;

import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.g5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0891g5 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f4170e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f4171f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f4172g;

    public /* synthetic */ C0891g5(InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f4170e = i7;
        this.f4171f = interfaceC2425y0;
        this.f4172g = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f4170e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f4172g;
        InterfaceC2425y0 interfaceC2425y02 = this.f4171f;
        switch (i7) {
            case 0:
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                return AbstractC1172p7.m2044U(interfaceC2425y0, (String) interfaceC2425y02.getValue());
            case 1:
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                return AbstractC1172p7.m2044U(interfaceC2425y0, (String) interfaceC2425y02.getValue());
            case 2:
                AbstractC1249rm.m2219G(interfaceC2425y02, false);
                interfaceC2425y0.setValue(Boolean.TRUE);
                return c1694m;
            case 3:
                AbstractC1249rm.m2219G(interfaceC2425y02, false);
                AbstractC1249rm.m2256e(interfaceC2425y0, true);
                return c1694m;
            case 4:
                C3137j0 c3137j03 = AbstractC1302td.f7786a;
                interfaceC2425y02.setValue(Boolean.TRUE);
                interfaceC2425y0.setValue(Boolean.FALSE);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                interfaceC2425y02.setValue(Boolean.FALSE);
                interfaceC2425y0.setValue(Boolean.TRUE);
                return c1694m;
            default:
                if (!AbstractC1092mk.m1837p0(interfaceC2425y02)) {
                    AbstractC1092mk.m1847r0(interfaceC2425y0, false);
                }
                return c1694m;
        }
    }
}
