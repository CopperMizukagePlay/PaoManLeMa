package p039e5;

import android.content.Context;
import p001a0.AbstractC0094y0;
import p053g5.C1694m;
import p085l0.C2364h0;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vf */
/* loaded from: classes.dex */
public final /* synthetic */ class C1366vf implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f8169e = 1;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f8170f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8171g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8172h;

    /* renamed from: i */
    public final /* synthetic */ Object f8173i;

    /* renamed from: j */
    public final /* synthetic */ Object f8174j;

    /* renamed from: k */
    public final /* synthetic */ Object f8175k;

    public /* synthetic */ C1366vf(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, C3469p c3469p, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04) {
        this.f8173i = context;
        this.f8170f = interfaceC2425y0;
        this.f8171g = interfaceC2425y02;
        this.f8174j = c3469p;
        this.f8172h = interfaceC2425y03;
        this.f8175k = interfaceC2425y04;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f8169e;
        Object obj2 = this.f8175k;
        Object obj3 = this.f8174j;
        Object obj4 = this.f8173i;
        switch (i7) {
            case 0:
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                return new C1277sj((C0883ft) obj4, this.f8170f, (C1340uk) obj3, (C1100ms) obj2, this.f8171g, this.f8172h);
            default:
                Context context = (Context) obj4;
                C3469p c3469p = (C3469p) obj3;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                float f7 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e(this.f8170f, bool, context, "speed_test_profiles", 0).putBoolean("multi_interface_test", booleanValue).apply();
                if (!booleanValue) {
                    InterfaceC2425y0 interfaceC2425y02 = this.f8171g;
                    if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                        AbstractC0094y0.m178e(interfaceC2425y02, Boolean.FALSE, context, "speed_test_profiles", 0).putBoolean("default_all_interfaces_test", false).apply();
                    }
                }
                if (booleanValue) {
                    AbstractC1092mk.m1742V0(context, c3469p, this.f8172h, false);
                    interfaceC2425y0.setValue(Boolean.TRUE);
                }
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C1366vf(C0883ft c0883ft, InterfaceC2425y0 interfaceC2425y0, C1340uk c1340uk, C1100ms c1100ms, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03) {
        this.f8173i = c0883ft;
        this.f8170f = interfaceC2425y0;
        this.f8174j = c1340uk;
        this.f8175k = c1100ms;
        this.f8171g = interfaceC2425y02;
        this.f8172h = interfaceC2425y03;
    }
}
