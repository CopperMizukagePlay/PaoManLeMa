package p039e5;

import android.content.Context;
import java.util.List;
import p001a0.C0078t0;
import p008b.C0242k0;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1447y3 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f9260e = 1;

    /* renamed from: f */
    public final /* synthetic */ Context f9261f;

    /* renamed from: g */
    public final /* synthetic */ List f9262g;

    /* renamed from: h */
    public final /* synthetic */ String f9263h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f9264i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3277a f9265j;

    /* renamed from: k */
    public final /* synthetic */ String f9266k;

    /* renamed from: l */
    public final /* synthetic */ String f9267l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f9268m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3279c f9269n;

    /* renamed from: o */
    public final /* synthetic */ Object f9270o;

    /* renamed from: p */
    public final /* synthetic */ Object f9271p;

    /* renamed from: q */
    public final /* synthetic */ Object f9272q;

    /* renamed from: r */
    public final /* synthetic */ Object f9273r;

    /* renamed from: s */
    public final /* synthetic */ Object f9274s;

    /* renamed from: t */
    public final /* synthetic */ Object f9275t;

    /* renamed from: u */
    public final /* synthetic */ Object f9276u;

    /* renamed from: v */
    public final /* synthetic */ Object f9277v;

    /* renamed from: w */
    public final /* synthetic */ Object f9278w;

    /* renamed from: x */
    public final /* synthetic */ Object f9279x;

    /* renamed from: y */
    public final /* synthetic */ Object f9280y;

    public /* synthetic */ C1447y3(C1451y7 c1451y7, C0703a8 c0703a8, InterfaceC2425y0 interfaceC2425y0, Context context, List list, String str, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, C3469p c3469p, C3469p c3469p2, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, String str2, String str3, InterfaceC3279c interfaceC3279c2, InterfaceC3279c interfaceC3279c3) {
        this.f9270o = c1451y7;
        this.f9271p = c0703a8;
        this.f9272q = interfaceC2425y0;
        this.f9261f = context;
        this.f9262g = list;
        this.f9263h = str;
        this.f9264i = interfaceC3279c;
        this.f9265j = interfaceC3277a;
        this.f9273r = interfaceC2425y02;
        this.f9274s = interfaceC2425y03;
        this.f9275t = interfaceC2425y04;
        this.f9276u = interfaceC2425y05;
        this.f9277v = c3469p;
        this.f9278w = c3469p2;
        this.f9279x = interfaceC2425y06;
        this.f9280y = interfaceC2425y07;
        this.f9266k = str2;
        this.f9267l = str3;
        this.f9268m = interfaceC3279c2;
        this.f9269n = interfaceC3279c3;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String str;
        boolean z7;
        C0703a8 c0703a8;
        Context context;
        boolean z8;
        switch (this.f9260e) {
            case 0:
                C1504zt c1504zt = (C1504zt) this.f9270o;
                EnumC1163ot enumC1163ot = (EnumC1163ot) this.f9279x;
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f9274s;
                String str2 = (String) this.f9271p;
                InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) this.f9275t;
                String str3 = (String) this.f9272q;
                InterfaceC3279c interfaceC3279c3 = (InterfaceC3279c) this.f9276u;
                String str4 = (String) this.f9273r;
                InterfaceC3279c interfaceC3279c4 = (InterfaceC3279c) this.f9277v;
                InterfaceC3279c interfaceC3279c5 = (InterfaceC3279c) this.f9278w;
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f9280y;
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                C3320h.m5052l(c3320h, "settings", new C3173d(164755286, new C1110n7(c1504zt, this.f9263h, this.f9264i, enumC1163ot, this.f9268m, this.f9266k, this.f9269n, this.f9267l, interfaceC3279c, str2, interfaceC3279c2, str3, interfaceC3279c3, this.f9262g, str4, interfaceC3279c4, this.f9265j, interfaceC3279c5, interfaceC3277a, this.f9261f), true), 2);
                if (c1504zt.f9984g.isEmpty()) {
                    C3320h.m5052l(c3320h, "empty", AbstractC0792d1.f3253a0, 2);
                } else {
                    C3320h.m5052l(c3320h, "header", AbstractC0792d1.f3255b0, 2);
                    List list = c1504zt.f9984g;
                    c3320h.m5054m(list.size(), new C0078t0(8, new C0242k0(27), list), new C1481z6(1, list), new C3173d(-632812321, new C0702a7(1, list), true));
                }
                return C1694m.f10482a;
            default:
                C1451y7 c1451y7 = (C1451y7) this.f9270o;
                C0703a8 c0703a82 = (C0703a8) this.f9271p;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f9272q;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f9273r;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f9274s;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f9275t;
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) this.f9276u;
                C3469p c3469p = (C3469p) this.f9277v;
                C3469p c3469p2 = (C3469p) this.f9278w;
                InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) this.f9279x;
                InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) this.f9280y;
                C3320h c3320h2 = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h2, "$this$LazyColumn");
                Context context2 = this.f9261f;
                C3320h.m5052l(c3320h2, null, new C3173d(1082383923, new C0926h8(c0703a82, interfaceC2425y0, context2, this.f9262g, this.f9263h, this.f9264i, this.f9265j, c1451y7, interfaceC2425y02, interfaceC2425y03, interfaceC2425y04, interfaceC2425y05, c3469p, c3469p2, 1), true), 3);
                C3320h.m5052l(c3320h2, null, new C3173d(1213614876, new C1080m8(context2, interfaceC2425y06, c0703a82, interfaceC2425y02, interfaceC2425y03, c3469p, interfaceC2425y04, c3469p2, interfaceC2425y05, interfaceC2425y07, 1), true), 3);
                C3320h.m5052l(c3320h2, null, new C3173d(-443493381, new C1111n8(c0703a82, 0), true), 3);
                AbstractC3367j.m5100e(c0703a82, "snapshot");
                List list2 = c0703a82.f2339f;
                boolean z9 = c0703a82.f2334a;
                if (!C1451y7.m2424b(c0703a82).isEmpty() && !z9) {
                    z7 = true;
                    c0703a8 = c0703a82;
                    str = null;
                    C3320h.m5052l(c3320h2, null, new C3173d(-1179836296, new C1325u5(c0703a8, c1451y7, this.f9266k, this.f9267l, 2), true), 3);
                } else {
                    str = null;
                    z7 = true;
                    c0703a8 = c0703a82;
                }
                boolean z10 = !z9;
                C0877fn c0877fn = c0703a8.f2340g;
                InterfaceC3279c interfaceC3279c6 = this.f9268m;
                InterfaceC3279c interfaceC3279c7 = this.f9269n;
                if (c0877fn != null) {
                    z8 = z10;
                    C1204q8 c1204q8 = new C1204q8(context2, c0877fn, c0703a8, z8, interfaceC3279c6, interfaceC3279c7);
                    context = context2;
                    C3320h.m5052l(c3320h2, str, new C3173d(-1403730042, c1204q8, z7), 3);
                } else {
                    context = context2;
                    z8 = z10;
                }
                if (!c0703a8.f2338e.isEmpty()) {
                    boolean z11 = z8;
                    C1386w4 c1386w4 = new C1386w4(c0703a8, context, z11, interfaceC3279c6, interfaceC3279c7);
                    interfaceC3279c6 = interfaceC3279c6;
                    z8 = z11;
                    C3320h.m5052l(c3320h2, str, new C3173d(473436193, c1386w4, z7), 3);
                }
                if (!list2.isEmpty()) {
                    c3320h2.m5054m(list2.size(), new C0078t0(9, new C1263s5(8), list2), new C1481z6(2, list2), new C3173d(-632812321, new C1266s8(list2, context, c0703a8, z8, interfaceC3279c6, interfaceC3279c7), z7));
                }
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C1447y3(C1504zt c1504zt, String str, InterfaceC3279c interfaceC3279c, EnumC1163ot enumC1163ot, InterfaceC3279c interfaceC3279c2, String str2, InterfaceC3279c interfaceC3279c3, String str3, InterfaceC3279c interfaceC3279c4, String str4, InterfaceC3279c interfaceC3279c5, String str5, InterfaceC3279c interfaceC3279c6, List list, String str6, InterfaceC3279c interfaceC3279c7, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c8, InterfaceC3277a interfaceC3277a2, Context context) {
        this.f9270o = c1504zt;
        this.f9263h = str;
        this.f9264i = interfaceC3279c;
        this.f9279x = enumC1163ot;
        this.f9268m = interfaceC3279c2;
        this.f9266k = str2;
        this.f9269n = interfaceC3279c3;
        this.f9267l = str3;
        this.f9274s = interfaceC3279c4;
        this.f9271p = str4;
        this.f9275t = interfaceC3279c5;
        this.f9272q = str5;
        this.f9276u = interfaceC3279c6;
        this.f9262g = list;
        this.f9273r = str6;
        this.f9277v = interfaceC3279c7;
        this.f9265j = interfaceC3277a;
        this.f9278w = interfaceC3279c8;
        this.f9280y = interfaceC3277a2;
        this.f9261f = context;
    }
}
