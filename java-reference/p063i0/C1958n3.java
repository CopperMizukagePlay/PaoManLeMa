package p063i0;

import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p100n.C2635d;
import p140s2.C3100j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p160v.C3444x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.n3 */
/* loaded from: classes.dex */
public final class C1958n3 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11578f = 0;

    /* renamed from: g */
    public final /* synthetic */ long f11579g;

    /* renamed from: h */
    public final /* synthetic */ Object f11580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1958n3(long j6, InterfaceC3277a interfaceC3277a) {
        super(1);
        this.f11579g = j6;
        this.f11580h = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f11578f;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f11580h;
        switch (i7) {
            case 0:
                InterfaceC1570d.m2535D((InterfaceC1570d) obj, this.f11579g, 0L, 0L, ((Number) ((InterfaceC3277a) obj2).mo52a()).floatValue(), 118);
                return c1694m;
            default:
                C3444x c3444x = (C3444x) obj2;
                long m4784b = C3100j.m4784b(((C3100j) ((C2635d) obj).m4206d()).f15696a, this.f11579g);
                int i8 = C3444x.f16637t;
                c3444x.m5194g(m4784b);
                c3444x.f16640c.mo52a();
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1958n3(C3444x c3444x, long j6) {
        super(1);
        this.f11580h = c3444x;
        this.f11579g = j6;
    }
}
