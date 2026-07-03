package p110o2;

import android.graphics.Typeface;
import p001a0.C0031h1;
import p080k2.AbstractC2305p;
import p080k2.C2294e;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p080k2.C2307r;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o2.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C2806c implements InterfaceC3283g {

    /* renamed from: e */
    public final /* synthetic */ C2807d f14831e;

    public /* synthetic */ C2806c(C2807d c2807d) {
        this.f14831e = c2807d;
    }

    @Override // p150t5.InterfaceC3283g
    /* renamed from: i */
    public final Object mo1493i(Object obj, Object obj2, Object obj3, Object obj4) {
        C2807d c2807d = this.f14831e;
        C2307r m3678b = ((C2294e) c2807d.f14836e).m3678b((AbstractC2305p) obj, (C2300k) obj2, ((C2298i) obj3).f13229a, ((C2299j) obj4).f13230a);
        if (!(m3678b instanceof C2307r)) {
            C0031h1 c0031h1 = new C0031h1(m3678b, c2807d.f14841j);
            c2807d.f14841j = c0031h1;
            Object obj5 = c0031h1.f154h;
            AbstractC3367j.m5098c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) obj5;
        }
        Object obj6 = m3678b.f13250e;
        AbstractC3367j.m5098c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj6;
    }
}
