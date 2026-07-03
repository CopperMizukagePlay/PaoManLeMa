package p039e5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0031h1;
import p050g2.C1588g0;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p073j2.C2165b;
import p080k2.AbstractC2305p;
import p080k2.C2294e;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p080k2.C2307r;
import p085l0.InterfaceC2425y0;
import p110o2.C2806c;
import p110o2.C2807d;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.vi */
/* loaded from: classes.dex */
public final /* synthetic */ class C1369vi implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f8182e;

    /* renamed from: f */
    public final /* synthetic */ Object f8183f;

    /* renamed from: g */
    public final /* synthetic */ Object f8184g;

    public /* synthetic */ C1369vi(int i7, Object obj, Object obj2) {
        this.f8182e = i7;
        this.f8183f = obj;
        this.f8184g = obj2;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7;
        int i8;
        Typeface typeface;
        int i9 = this.f8182e;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f8184g;
        Object obj5 = this.f8183f;
        switch (i9) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj5;
                Context context = (Context) obj4;
                int intValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                String str2 = (String) obj3;
                AbstractC3367j.m5100e(str, "label");
                AbstractC3367j.m5100e(str2, "cidr");
                if (intValue >= 0) {
                    float f7 = AbstractC1092mk.f5952h;
                    if (intValue < ((List) interfaceC2425y0.getValue()).size()) {
                        ArrayList m3036D0 = AbstractC1805m.m3036D0((List) interfaceC2425y0.getValue());
                        m3036D0.set(intValue, new C0878fo(str, str2));
                        interfaceC2425y0.setValue(m3036D0);
                        AbstractC1092mk.m1682I2(context, interfaceC2425y0);
                    }
                }
                return c1694m;
            default:
                Spannable spannable = (Spannable) obj5;
                C2806c c2806c = (C2806c) obj4;
                C1588g0 c1588g0 = (C1588g0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC2305p abstractC2305p = c1588g0.f10247f;
                C2300k c2300k = c1588g0.f10244c;
                if (c2300k == null) {
                    c2300k = C2300k.f13233h;
                }
                C2298i c2298i = c1588g0.f10245d;
                if (c2298i != null) {
                    i7 = c2298i.f13229a;
                } else {
                    i7 = 0;
                }
                C2299j c2299j = c1588g0.f10246e;
                if (c2299j != null) {
                    i8 = c2299j.f13230a;
                } else {
                    i8 = 65535;
                }
                C2807d c2807d = c2806c.f14831e;
                C2307r m3678b = ((C2294e) c2807d.f14836e).m3678b(abstractC2305p, c2300k, i7, i8);
                if (!(m3678b instanceof C2307r)) {
                    C0031h1 c0031h1 = new C0031h1(m3678b, c2807d.f14841j);
                    c2807d.f14841j = c0031h1;
                    Object obj6 = c0031h1.f154h;
                    AbstractC3367j.m5098c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj6;
                } else {
                    Object obj7 = m3678b.f13250e;
                    AbstractC3367j.m5098c(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new C2165b(1, typeface), intValue2, intValue3, 33);
                return c1694m;
        }
    }
}
