package p063i0;

import p027d1.C0467e;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.i4 */
/* loaded from: classes.dex */
public final class C1919i4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11334f;

    /* renamed from: g */
    public final /* synthetic */ float f11335g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3277a f11336h;

    /* renamed from: i */
    public final /* synthetic */ long f11337i;

    /* renamed from: j */
    public final /* synthetic */ long f11338j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f11339k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1919i4(int i7, float f7, InterfaceC3277a interfaceC3277a, long j6, long j7, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f11334f = i7;
        this.f11335g = f7;
        this.f11336h = interfaceC3277a;
        this.f11337i = j6;
        this.f11338j = j7;
        this.f11339k = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
        float m1024b = C0467e.m1024b(interfaceC1570d.mo2546c());
        int i7 = this.f11334f;
        float f7 = this.f11335g;
        if (i7 != 0 && C0467e.m1024b(interfaceC1570d.mo2546c()) <= C0467e.m1026d(interfaceC1570d.mo2546c())) {
            f7 += interfaceC1570d.mo4524v0(m1024b);
        }
        float mo4524v0 = f7 / interfaceC1570d.mo4524v0(C0467e.m1026d(interfaceC1570d.mo2546c()));
        float floatValue = ((Number) this.f11336h.mo52a()).floatValue();
        float min = Math.min(floatValue, mo4524v0) + floatValue;
        if (min <= 1.0f) {
            AbstractC1951m4.m3144d(interfaceC1570d, min, 1.0f, this.f11337i, m1024b, this.f11334f);
        }
        AbstractC1951m4.m3144d(interfaceC1570d, 0.0f, floatValue, this.f11338j, m1024b, this.f11334f);
        this.f11339k.mo23f(interfaceC1570d);
        return C1694m.f10482a;
    }
}
