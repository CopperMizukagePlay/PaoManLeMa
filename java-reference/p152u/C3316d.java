package p152u;

import p028d2.C0469b;
import p053g5.C1694m;
import p063i0.C1848a5;
import p067i4.AbstractC2072e;
import p085l0.C2349d1;
import p090l5.EnumC2465a;
import p122q.EnumC2931o0;
import p146t1.InterfaceC3220m0;
import p160v.InterfaceC3435s0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.d */
/* loaded from: classes.dex */
public final class C3316d implements InterfaceC3435s0 {

    /* renamed from: a */
    public final /* synthetic */ C3330r f16280a;

    public C3316d(C3330r c3330r) {
        this.f16280a = c3330r;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: a */
    public final int mo5040a() {
        long m3326b;
        C3330r c3330r = this.f16280a;
        if (c3330r.m5067g().f16325n == EnumC2931o0.f15240e) {
            InterfaceC3220m0 interfaceC3220m0 = c3330r.m5067g().f16328q;
            m3326b = AbstractC2072e.m3326b(interfaceC3220m0.mo4886e(), interfaceC3220m0.mo4884c()) & 4294967295L;
        } else {
            InterfaceC3220m0 interfaceC3220m02 = c3330r.m5067g().f16328q;
            m3326b = AbstractC2072e.m3326b(interfaceC3220m02.mo4886e(), interfaceC3220m02.mo4884c()) >> 32;
        }
        return (int) m3326b;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: b */
    public final float mo5041b() {
        C3330r c3330r = this.f16280a;
        return (((C2349d1) c3330r.f16363d.f10651b).m3741g() * 500) + ((C2349d1) c3330r.f16363d.f10652c).m3741g();
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: c */
    public final Object mo5042c(int i7, C1848a5 c1848a5) {
        Object m5065i = C3330r.m5065i(this.f16280a, i7, c1848a5);
        if (m5065i == EnumC2465a.f13750e) {
            return m5065i;
        }
        return C1694m.f10482a;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: d */
    public final C0469b mo5043d() {
        return new C0469b(-1, 1);
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: e */
    public final int mo5044e() {
        C3330r c3330r = this.f16280a;
        return (-c3330r.m5067g().f16322k) + c3330r.m5067g().f16326o;
    }

    @Override // p160v.InterfaceC3435s0
    /* renamed from: f */
    public final float mo5045f() {
        C3330r c3330r = this.f16280a;
        int m3741g = ((C2349d1) c3330r.f16363d.f10651b).m3741g();
        int m3741g2 = ((C2349d1) c3330r.f16363d.f10652c).m3741g();
        if (c3330r.mo115d()) {
            return (m3741g * 500) + m3741g2 + 100;
        }
        return (m3741g * 500) + m3741g2;
    }
}
