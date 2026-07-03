package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import p001a0.C0078t0;
import p046f5.AbstractC1540e;
import p046f5.C1537b;
import p053g5.C1694m;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sa */
/* loaded from: classes.dex */
public final /* synthetic */ class C1268sa implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7536e = 1;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f7537f;

    /* renamed from: g */
    public final /* synthetic */ Object f7538g;

    /* renamed from: h */
    public final /* synthetic */ Object f7539h;

    /* renamed from: i */
    public final /* synthetic */ Object f7540i;

    public /* synthetic */ C1268sa(Context context, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, C2349d1 c2349d12) {
        this.f7538g = context;
        this.f7537f = interfaceC2425y0;
        this.f7539h = c2349d1;
        this.f7540i = c2349d12;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f7536e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7537f;
        Object obj2 = this.f7540i;
        Object obj3 = this.f7539h;
        Object obj4 = this.f7538g;
        switch (i7) {
            case 0:
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                List list = (List) interfaceC2425y0.getValue();
                c3320h.m5054m(list.size(), new C0078t0(12, new C1263s5(14), list), new C1481z6(4, list), new C3173d(-632812321, new C1330ua(list, (InterfaceC2425y0) obj4, (C3472s) obj3, (C3472s) obj2), true));
                return c1694m;
            case 1:
                Context context = (Context) obj4;
                C2349d1 c2349d1 = (C2349d1) obj3;
                C2349d1 c2349d12 = (C2349d1) obj2;
                AbstractC1540e abstractC1540e = (AbstractC1540e) obj;
                AbstractC3367j.m5100e(abstractC1540e, "color");
                interfaceC2425y0.setValue(abstractC1540e.mo2471a());
                boolean z7 = abstractC1540e instanceof C1537b;
                if (z7) {
                    C1537b c1537b = (C1537b) abstractC1540e;
                    c2349d1.m3742h(c1537b.f10108a);
                    c2349d12.m3742h(c1537b.f10109b);
                }
                SharedPreferences.Editor edit = AbstractC1092mk.m1693K3(context).edit();
                AbstractC3367j.m5099d(edit, "edit(...)");
                edit.putString("accent_color", abstractC1540e.mo2471a());
                if (z7) {
                    C1537b c1537b2 = (C1537b) abstractC1540e;
                    edit.putInt("accent_custom_light", c1537b2.f10108a);
                    edit.putInt("accent_custom_dark", c1537b2.f10109b);
                }
                edit.apply();
                return c1694m;
            case 2:
                EnumC1311tm enumC1311tm = (EnumC1311tm) obj;
                AbstractC3367j.m5100e(enumC1311tm, "it");
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1311tm);
                AbstractC1092mk.m1649C((InterfaceC3279c) obj3, (C2349d1) obj2, (InterfaceC2425y0) obj4);
                return c1694m;
            default:
                ((Boolean) obj).booleanValue();
                AbstractC1092mk.m1692K2((C3469p) obj3, (Context) obj2, interfaceC2425y0, ((C1248rl) obj4).f7390a);
                return c1694m;
        }
    }

    public /* synthetic */ C1268sa(C1248rl c1248rl, C3469p c3469p, Context context, InterfaceC2425y0 interfaceC2425y0) {
        this.f7538g = c1248rl;
        this.f7539h = c3469p;
        this.f7540i = context;
        this.f7537f = interfaceC2425y0;
    }

    public /* synthetic */ C1268sa(InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, C3472s c3472s, C3472s c3472s2) {
        this.f7537f = interfaceC2425y0;
        this.f7538g = interfaceC2425y02;
        this.f7539h = c3472s;
        this.f7540i = c3472s2;
    }

    public /* synthetic */ C1268sa(InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y02) {
        this.f7537f = interfaceC2425y0;
        this.f7539h = interfaceC3279c;
        this.f7540i = c2349d1;
        this.f7538g = interfaceC2425y02;
    }
}
