package p039e5;

import java.util.Set;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.t4 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1293t4 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7750e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f7751f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f7752g;

    public /* synthetic */ C1293t4(InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f7750e = i7;
        this.f7751f = interfaceC3279c;
        this.f7752g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f7750e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7752g;
        InterfaceC3279c interfaceC3279c = this.f7751f;
        switch (i7) {
            case 0:
                interfaceC3279c.mo23f("");
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(Boolean.FALSE);
                return c1694m;
            case 1:
                interfaceC3279c.mo23f(AbstractC1805m.m3035C0((Set) interfaceC2425y0.getValue()));
                return c1694m;
            case 2:
                interfaceC3279c.mo23f((String) interfaceC2425y0.getValue());
                return c1694m;
            case 3:
                interfaceC3279c.mo23f(AbstractC0444k.m956t0((String) interfaceC2425y0.getValue()).toString());
                return c1694m;
            default:
                C3137j0 c3137j02 = AbstractC0945hr.f4635a;
                interfaceC2425y0.setValue(Boolean.FALSE);
                interfaceC3279c.mo23f(Boolean.TRUE);
                return c1694m;
        }
    }
}
