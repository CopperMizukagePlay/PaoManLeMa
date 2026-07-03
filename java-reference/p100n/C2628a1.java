package p100n;

import p085l0.InterfaceC2390n2;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.a1 */
/* loaded from: classes.dex */
public final class C2628a1 implements InterfaceC2390n2 {

    /* renamed from: e */
    public final C2637d1 f14243e;

    /* renamed from: f */
    public InterfaceC3279c f14244f;

    /* renamed from: g */
    public AbstractC3368k f14245g;

    /* renamed from: h */
    public final /* synthetic */ C2631b1 f14246h;

    /* JADX WARN: Multi-variable type inference failed */
    public C2628a1(C2631b1 c2631b1, C2637d1 c2637d1, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        this.f14246h = c2631b1;
        this.f14243e = c2637d1;
        this.f14244f = interfaceC3279c;
        this.f14245g = (AbstractC3368k) interfaceC3279c2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r1v5, types: [t5.c, u5.k] */
    /* renamed from: a */
    public final void m4195a(C2634c1 c2634c1) {
        Object mo23f = this.f14245g.mo23f(c2634c1.f14256b);
        boolean m4242g = this.f14246h.f14251c.m4242g();
        C2637d1 c2637d1 = this.f14243e;
        if (m4242g) {
            c2637d1.m4213f(this.f14245g.mo23f(c2634c1.f14255a), mo23f, (InterfaceC2627a0) this.f14244f.mo23f(c2634c1));
        } else {
            c2637d1.m4214g(mo23f, (InterfaceC2627a0) this.f14244f.mo23f(c2634c1));
        }
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        m4195a(this.f14246h.f14251c.m4241f());
        return this.f14243e.f14279l.getValue();
    }
}
