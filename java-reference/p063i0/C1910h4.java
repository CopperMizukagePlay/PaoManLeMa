package p063i0;

import p027d1.C0467e;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.h4 */
/* loaded from: classes.dex */
public final class C1910h4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ long f11283f;

    /* renamed from: g */
    public final /* synthetic */ int f11284g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910h4(int i7, long j6) {
        super(1);
        this.f11283f = j6;
        this.f11284g = i7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
        float min = Math.min(interfaceC1570d.mo4526y(AbstractC1874d4.f11069d), C0467e.m1024b(interfaceC1570d.mo2546c()));
        float m1024b = (C0467e.m1024b(interfaceC1570d.mo2546c()) - min) / 2;
        long j6 = this.f11283f;
        if (this.f11284g == 1) {
            float f7 = min / 2.0f;
            InterfaceC1570d.m2540R(interfaceC1570d, j6, f7, AbstractC3784a.m5797a((C0467e.m1026d(interfaceC1570d.mo2546c()) - f7) - m1024b, C0467e.m1024b(interfaceC1570d.mo2546c()) / 2.0f), null, 120);
        } else {
            InterfaceC1570d.m2535D(interfaceC1570d, j6, AbstractC3784a.m5797a((C0467e.m1026d(interfaceC1570d.mo2546c()) - min) - m1024b, (C0467e.m1024b(interfaceC1570d.mo2546c()) - min) / 2.0f), AbstractC1793a0.m2975c(min, min), 0.0f, 120);
        }
        return C1694m.f10482a;
    }
}
