package p039e5;

import java.util.List;
import p024c6.C0442i;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k4 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1014k4 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5230e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f5231f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f5232g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f5233h;

    public /* synthetic */ C1014k4(InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f5230e = i7;
        this.f5231f = interfaceC3279c;
        this.f5232g = interfaceC2425y0;
        this.f5233h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f5230e;
        String str = null;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f5233h;
        InterfaceC2425y0 interfaceC2425y02 = this.f5232g;
        InterfaceC3279c interfaceC3279c = this.f5231f;
        switch (i7) {
            case 0:
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                String str2 = (String) interfaceC2425y02.getValue();
                if (str2 == null) {
                    C0877fn c0877fn = (C0877fn) AbstractC1805m.m3047k0((List) interfaceC2425y0.getValue());
                    if (c0877fn != null) {
                        str = c0877fn.f4045a;
                    }
                } else {
                    str = str2;
                }
                if (str != null) {
                    interfaceC3279c.mo23f(str);
                }
                return c1694m;
            case 1:
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                String str3 = (String) interfaceC2425y02.getValue();
                if (str3 == null) {
                    C0877fn c0877fn2 = (C0877fn) AbstractC1805m.m3047k0((List) interfaceC2425y0.getValue());
                    if (c0877fn2 != null) {
                        str = c0877fn2.f4045a;
                    }
                } else {
                    str = str3;
                }
                if (str != null) {
                    interfaceC3279c.mo23f(str);
                }
                return c1694m;
            default:
                C0442i c0442i = AbstractC1358v7.f8121a;
                C3137j0 c3137j03 = AbstractC0945hr.f4635a;
                C1327u7 m2369b = AbstractC1358v7.m2369b((String) interfaceC2425y02.getValue());
                List list = m2369b.f7895a;
                if (!list.isEmpty()) {
                    interfaceC3279c.mo23f(list);
                } else {
                    String str4 = m2369b.f7897c;
                    if (str4 == null) {
                        str4 = "未能识别有效 Subnet";
                    }
                    interfaceC2425y0.setValue(str4);
                }
                return c1694m;
        }
    }
}
