package p063i0;

import p035e1.C0661j0;
import p035e1.C0675q0;
import p053g5.C1694m;
import p085l0.C2361g1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p100n.C2637d1;
import p100n.C2657k0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.s2 */
/* loaded from: classes.dex */
public final class C1997s2 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ boolean f11742f;

    /* renamed from: g */
    public final /* synthetic */ C2657k0 f11743g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f11744h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2390n2 f11745i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2390n2 f11746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1997s2(boolean z7, C2657k0 c2657k0, InterfaceC2425y0 interfaceC2425y0, C2637d1 c2637d1, C2637d1 c2637d12) {
        super(1);
        this.f11742f = z7;
        this.f11743g = c2657k0;
        this.f11744h = interfaceC2425y0;
        this.f11745i = c2637d1;
        this.f11746j = c2637d12;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float f7;
        C0661j0 c0661j0 = (C0661j0) obj;
        C2361g1 c2361g1 = this.f11743g.f14346c;
        float f8 = 0.8f;
        InterfaceC2390n2 interfaceC2390n2 = this.f11745i;
        float f9 = 1.0f;
        boolean z7 = this.f11742f;
        if (!z7) {
            f7 = ((Number) interfaceC2390n2.getValue()).floatValue();
        } else if (((Boolean) c2361g1.getValue()).booleanValue()) {
            f7 = 1.0f;
        } else {
            f7 = 0.8f;
        }
        c0661j0.m1435f(f7);
        if (!z7) {
            f8 = ((Number) interfaceC2390n2.getValue()).floatValue();
        } else if (((Boolean) c2361g1.getValue()).booleanValue()) {
            f8 = 1.0f;
        }
        c0661j0.m1436g(f8);
        if (!z7) {
            f9 = ((Number) this.f11746j.getValue()).floatValue();
        } else if (!((Boolean) c2361g1.getValue()).booleanValue()) {
            f9 = 0.0f;
        }
        c0661j0.m1432a(f9);
        c0661j0.m1440o(((C0675q0) this.f11744h.getValue()).f2202a);
        return C1694m.f10482a;
    }
}
