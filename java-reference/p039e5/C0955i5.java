package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.ArrayList;
import java.util.ListIterator;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1807o;
import p068i5.C2077a;
import p073j2.AbstractC2168e;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.i5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0955i5 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f4762e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f4763f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f4764g;

    /* renamed from: h */
    public final /* synthetic */ Object f4765h;

    /* renamed from: i */
    public final /* synthetic */ Object f4766i;

    /* renamed from: j */
    public final /* synthetic */ Object f4767j;

    /* renamed from: k */
    public final /* synthetic */ Object f4768k;

    /* renamed from: l */
    public final /* synthetic */ Object f4769l;

    /* renamed from: m */
    public final /* synthetic */ Object f4770m;

    /* renamed from: n */
    public final /* synthetic */ Object f4771n;

    /* renamed from: o */
    public final /* synthetic */ Object f4772o;

    public /* synthetic */ C0955i5(C1473yt c1473yt, String str, EnumC1163ot enumC1163ot, String str2, String str3, String str4, String str5, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f4765h = c1473yt;
        this.f4766i = str;
        this.f4771n = enumC1163ot;
        this.f4767j = str2;
        this.f4768k = str3;
        this.f4769l = str4;
        this.f4770m = str5;
        this.f4772o = context;
        this.f4763f = interfaceC2425y0;
        this.f4764g = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7;
        int i8;
        String str;
        int i9 = this.f4762e;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f4772o;
        Object obj3 = this.f4771n;
        Object obj4 = this.f4770m;
        Object obj5 = this.f4769l;
        InterfaceC2425y0 interfaceC2425y0 = this.f4764g;
        InterfaceC2425y0 interfaceC2425y02 = this.f4763f;
        Object obj6 = this.f4768k;
        Object obj7 = this.f4767j;
        Object obj8 = this.f4766i;
        Object obj9 = this.f4765h;
        switch (i9) {
            case 0:
                C1473yt c1473yt = (C1473yt) obj9;
                String str2 = (String) obj8;
                EnumC1163ot enumC1163ot = (EnumC1163ot) obj3;
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                Context context = (Context) obj2;
                String str6 = (String) obj;
                AbstractC3367j.m5100e(str6, "resolvedAddress");
                Integer m973O = AbstractC0451r.m973O((String) obj7);
                if (m973O != null) {
                    i7 = AbstractC2168e.m3530q(m973O.intValue(), 1, 64);
                } else {
                    i7 = 30;
                }
                Integer m973O2 = AbstractC0451r.m973O(str3);
                if (m973O2 != null) {
                    i8 = AbstractC2168e.m3530q(m973O2.intValue(), 1, 65535);
                } else {
                    i8 = 443;
                }
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                Network m2044U = AbstractC1172p7.m2044U(interfaceC2425y0, (String) interfaceC2425y02.getValue());
                Context applicationContext = context.getApplicationContext();
                AbstractC3367j.m5100e(str2, "target");
                AbstractC3367j.m5100e(enumC1163ot, "protocol");
                AbstractC3367j.m5100e(str4, "publicApiHost");
                AbstractC3367j.m5100e(str5, "apiV4Token");
                c1473yt.m2435f();
                String m2015c = AbstractC1155ol.m2015c(str2);
                if (!AbstractC1155ol.m2014b(m2015c)) {
                    C1701c0 c1701c0 = c1473yt.f9795d;
                    c1701c0.m2752j(null, C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, 0, null, null, "目标地址无效", 1791));
                } else {
                    c1473yt.f9793b.set(true);
                    if (AbstractC0444k.m937a0(str4)) {
                        str = "api.nxtrace.org";
                    } else {
                        str = str4;
                    }
                    EnumC1465yl enumC1465yl = EnumC1465yl.f9455e;
                    c1473yt.f9794c = AbstractC0525d0.m1141s(c1473yt.f9792a, null, new C1349ut(c1473yt, m2015c, enumC1163ot, new C1496zl(m2015c, enumC1163ot, AbstractC2168e.m3530q(i7, 1, 64), 3000, AbstractC2168e.m3530q(i8, 1, 65535), "LeoMoeAPI", Math.min(AbstractC2168e.m3530q(i7, 1, 64), 18)), enumC1465yl, "", str4, str6, m2044U, new C1403wl(enumC1465yl, str, "", "", str5), new C1194pt(5), applicationContext, null), 3);
                }
                return c1694m;
            default:
                C3469p c3469p = (C3469p) obj9;
                C3469p c3469p2 = (C3469p) obj8;
                C3469p c3469p3 = (C3469p) obj7;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj5;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) obj4;
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) obj3;
                InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) obj2;
                C1189po c1189po = (C1189po) obj;
                AbstractC3367j.m5100e(c1189po, "profile");
                float f7 = AbstractC1092mk.f5952h;
                ((C2349d1) obj6).m3742h(0);
                AbstractC1092mk.m1660E0(interfaceC2425y02, false);
                AbstractC1092mk.m1670G0(interfaceC2425y0, true);
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c3469p));
                ListIterator listIterator = c3469p.listIterator();
                while (true) {
                    C2077a c2077a = (C2077a) listIterator;
                    if (c2077a.hasNext()) {
                        arrayList.add(((C1189po) c2077a.next()).f6927b);
                    } else {
                        interfaceC2425y03.setValue(AbstractC1092mk.m1728R3(c1189po.f6927b + " (副本)", arrayList));
                        interfaceC2425y04.setValue("");
                        interfaceC2425y05.setValue("");
                        AbstractC1092mk.m1658D3(c3469p2, c1189po.f6928c);
                        AbstractC1092mk.m1658D3(c3469p3, c1189po.f6929d);
                        AbstractC1092mk.m1725R0(interfaceC2425y06, true);
                        return c1694m;
                    }
                }
        }
    }

    public /* synthetic */ C0955i5(C3469p c3469p, C3469p c3469p2, C3469p c3469p3, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06) {
        this.f4765h = c3469p;
        this.f4766i = c3469p2;
        this.f4767j = c3469p3;
        this.f4768k = c2349d1;
        this.f4763f = interfaceC2425y0;
        this.f4764g = interfaceC2425y02;
        this.f4769l = interfaceC2425y03;
        this.f4770m = interfaceC2425y04;
        this.f4771n = interfaceC2425y05;
        this.f4772o = interfaceC2425y06;
    }
}
