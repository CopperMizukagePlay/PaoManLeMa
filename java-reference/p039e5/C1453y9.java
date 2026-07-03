package p039e5;

import p053g5.C1694m;
import p060h5.C1813u;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1453y9 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f9305e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f9306f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f9307g;

    public /* synthetic */ C1453y9(InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f9305e = i7;
        this.f9306f = interfaceC2425y0;
        this.f9307g = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f9305e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f9307g;
        InterfaceC2425y0 interfaceC2425y02 = this.f9306f;
        String str = (String) obj;
        switch (i7) {
            case 0:
                AbstractC3367j.m5100e(str, "it");
                interfaceC2425y02.setValue(str);
                interfaceC2425y0.setValue(C1813u.f10860e);
                return c1694m;
            default:
                AbstractC3367j.m5100e(str, "it");
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                interfaceC2425y02.setValue(str);
                interfaceC2425y0.setValue(null);
                return c1694m;
        }
    }
}
