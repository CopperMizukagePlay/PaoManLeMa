package p107o;

import p027d1.C0465c;
import p027d1.C0467e;
import p035e1.AbstractC0655g0;
import p035e1.C0651e0;
import p035e1.InterfaceC0667m0;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.u */
/* loaded from: classes.dex */
public final class C2779u implements InterfaceC0667m0 {

    /* renamed from: a */
    public final /* synthetic */ int f14771a;

    @Override // p035e1.InterfaceC0667m0
    /* renamed from: a */
    public final AbstractC0655g0 mo1393a(long j6, EnumC3103m enumC3103m, InterfaceC3093c interfaceC3093c) {
        switch (this.f14771a) {
            case 0:
                float mo4513Q = interfaceC3093c.mo4513Q(AbstractC2781v.f14772a);
                return new C0651e0(new C0465c(0.0f, -mo4513Q, C0467e.m1026d(j6), C0467e.m1024b(j6) + mo4513Q));
            default:
                float mo4513Q2 = interfaceC3093c.mo4513Q(AbstractC2781v.f14772a);
                return new C0651e0(new C0465c(-mo4513Q2, 0.0f, C0467e.m1026d(j6) + mo4513Q2, C0467e.m1024b(j6)));
        }
    }
}
