package p039e5;

import android.content.Context;
import p001a0.AbstractC0094y0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p068i5.AbstractC2080d;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x4 */
/* loaded from: classes.dex */
public final class C1417x4 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f8600i;

    /* renamed from: j */
    public final /* synthetic */ Context f8601j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f8602k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1417x4(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f8600i = i7;
        this.f8601j = context;
        this.f8602k = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f8600i) {
            case 0:
                C1417x4 c1417x4 = (C1417x4) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c1417x4.mo29m(c1694m);
                return c1694m;
            default:
                C1417x4 c1417x42 = (C1417x4) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c1417x42.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f8600i) {
            case 0:
                return new C1417x4(this.f8601j, this.f8602k, interfaceC2313c, 0);
            default:
                return new C1417x4(this.f8601j, this.f8602k, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f8600i;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f8602k;
        Context context = this.f8601j;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                AbstractC1172p7.m2043T(context, interfaceC2425y0);
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                float f7 = AbstractC1092mk.f5952h;
                if (((Boolean) interfaceC2425y0.getValue()).booleanValue() && AbstractC2080d.m3395h(context.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    AbstractC0094y0.m178e(interfaceC2425y0, Boolean.FALSE, context, "speed_test_profiles", 0).putBoolean("wifi_ssid_display_enabled", false).apply();
                }
                return c1694m;
        }
    }
}
