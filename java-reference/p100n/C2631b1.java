package p100n;

import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.b1 */
/* loaded from: classes.dex */
public final class C2631b1 {

    /* renamed from: a */
    public final C2664m1 f14249a;

    /* renamed from: b */
    public final C2361g1 f14250b = AbstractC2418w.m3980x(null);

    /* renamed from: c */
    public final /* synthetic */ C2643f1 f14251c;

    public C2631b1(C2643f1 c2643f1, C2664m1 c2664m1, String str) {
        this.f14251c = c2643f1;
        this.f14249a = c2664m1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C2628a1 m4201a(InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        C2361g1 c2361g1 = this.f14250b;
        C2628a1 c2628a1 = (C2628a1) c2361g1.getValue();
        C2643f1 c2643f1 = this.f14251c;
        if (c2628a1 == null) {
            Object mo23f = interfaceC3279c2.mo23f(c2643f1.m4238c());
            Object mo23f2 = interfaceC3279c2.mo23f(c2643f1.m4238c());
            C2664m1 c2664m1 = this.f14249a;
            AbstractC2674q abstractC2674q = (AbstractC2674q) c2664m1.f14361a.mo23f(mo23f2);
            abstractC2674q.mo4269d();
            C2637d1 c2637d1 = new C2637d1(c2643f1, mo23f, abstractC2674q, c2664m1);
            c2628a1 = new C2628a1(this, c2637d1, interfaceC3279c, interfaceC3279c2);
            c2361g1.setValue(c2628a1);
            c2643f1.f14313i.add(c2637d1);
        }
        c2628a1.f14245g = (AbstractC3368k) interfaceC3279c2;
        c2628a1.f14244f = interfaceC3279c;
        c2628a1.m4195a(c2643f1.m4241f());
        return c2628a1;
    }
}
