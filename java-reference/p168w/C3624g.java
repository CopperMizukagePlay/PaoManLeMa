package p168w;

import p028d2.C0469b;
import p053g5.C1694m;
import p063i0.C1848a5;
import p085l0.C2345c1;
import p090l5.EnumC2465a;
import p107o.EnumC2788y0;
import p122q.EnumC2931o0;
import p160v.InterfaceC3435s0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.g */
/* loaded from: classes.dex */
public final class C3624g implements InterfaceC3435s0 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3642y f17300a;

    /* renamed from: b */
    public final /* synthetic */ boolean f17301b;

    public C3624g(AbstractC3642y abstractC3642y, boolean z7) {
        this.f17300a = abstractC3642y;
        this.f17301b = z7;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: a */
    public final int mo5040a() {
        long m5603f;
        AbstractC3642y abstractC3642y = this.f17300a;
        if (abstractC3642y.m5609j().f17361e == EnumC2931o0.f15240e) {
            m5603f = abstractC3642y.m5609j().m5603f() & 4294967295L;
        } else {
            m5603f = abstractC3642y.m5609j().m5603f() >> 32;
        }
        return (int) m5603f;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: b */
    public final float mo5041b() {
        AbstractC3642y abstractC3642y = this.f17300a;
        return (float) (AbstractC3784a.m5795E(((C2345c1) abstractC3642y.f17396c.f15486d).m3729g() * abstractC3642y.m5611m()) + (abstractC3642y.m5608i() * abstractC3642y.m5611m()));
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: c */
    public final Object mo5042c(int i7, C1848a5 c1848a5) {
        AbstractC3642y abstractC3642y = this.f17300a;
        abstractC3642y.getClass();
        Object mo112a = abstractC3642y.mo112a(EnumC2788y0.f14796e, new C1848a5(abstractC3642y, i7, null, 2), c1848a5);
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (mo112a != enumC2465a) {
            mo112a = c1694m;
        }
        if (mo112a == enumC2465a) {
            return mo112a;
        }
        return c1694m;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: d */
    public final C0469b mo5043d() {
        boolean z7 = this.f17301b;
        AbstractC3642y abstractC3642y = this.f17300a;
        if (z7) {
            return new C0469b(abstractC3642y.mo5600k(), 1);
        }
        return new C0469b(1, abstractC3642y.mo5600k());
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: e */
    public final int mo5044e() {
        AbstractC3642y abstractC3642y = this.f17300a;
        return (-abstractC3642y.m5609j().f17362f) + abstractC3642y.m5609j().f17360d;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: f */
    public final float mo5045f() {
        AbstractC3642y abstractC3642y = this.f17300a;
        return (float) AbstractC3618c0.m5598a(abstractC3642y.m5609j(), abstractC3642y.mo5600k());
    }
}
