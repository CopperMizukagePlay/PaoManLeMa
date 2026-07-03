package p100n;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.w0 */
/* loaded from: classes.dex */
public final class C2693w0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C3379v f14463f;

    /* renamed from: g */
    public final /* synthetic */ Object f14464g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2644g f14465h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC2674q f14466i;

    /* renamed from: j */
    public final /* synthetic */ C2659l f14467j;

    /* renamed from: k */
    public final /* synthetic */ float f14468k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3279c f14469l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2693w0(C3379v c3379v, Object obj, InterfaceC2644g interfaceC2644g, AbstractC2674q abstractC2674q, C2659l c2659l, float f7, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f14463f = c3379v;
        this.f14464g = obj;
        this.f14465h = interfaceC2644g;
        this.f14466i = abstractC2674q;
        this.f14467j = c2659l;
        this.f14468k = f7;
        this.f14469l = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC2644g interfaceC2644g = this.f14465h;
        C2653j c2653j = new C2653j(this.f14464g, interfaceC2644g.mo4251e(), this.f14466i, longValue, interfaceC2644g.mo4252f(), longValue, new C2690v0(0, this.f14467j));
        AbstractC2638e.m4227m(c2653j, longValue, this.f14468k, this.f14465h, this.f14467j, this.f14469l);
        this.f14463f.f16451e = c2653j;
        return C1694m.f10482a;
    }
}
