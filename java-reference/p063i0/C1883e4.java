package p063i0;

import p049g1.C1574h;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p085l0.InterfaceC2390n2;
import p100n.C2642f0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e4 */
/* loaded from: classes.dex */
public final class C1883e4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ long f11141f;

    /* renamed from: g */
    public final /* synthetic */ C1574h f11142g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2390n2 f11143h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2390n2 f11144i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2390n2 f11145j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2390n2 f11146k;

    /* renamed from: l */
    public final /* synthetic */ float f11147l;

    /* renamed from: m */
    public final /* synthetic */ long f11148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883e4(long j6, C1574h c1574h, C2642f0 c2642f0, C2642f0 c2642f02, C2642f0 c2642f03, C2642f0 c2642f04, float f7, long j7) {
        super(1);
        this.f11141f = j6;
        this.f11142g = c1574h;
        this.f11143h = c2642f0;
        this.f11144i = c2642f02;
        this.f11145j = c2642f03;
        this.f11146k = c2642f04;
        this.f11147l = f7;
        this.f11148m = j7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float f7;
        InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
        long j6 = this.f11141f;
        C1574h c1574h = this.f11142g;
        AbstractC1951m4.m3145e(interfaceC1570d, 0.0f, 360.0f, j6, c1574h);
        float floatValue = (((Number) this.f11143h.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.f11144i.getValue()).floatValue();
        InterfaceC2390n2 interfaceC2390n2 = this.f11145j;
        float abs = Math.abs(floatValue2 - ((Number) interfaceC2390n2.getValue()).floatValue());
        float floatValue3 = ((Number) interfaceC2390n2.getValue()).floatValue() + ((Number) this.f11146k.getValue()).floatValue() + (floatValue - 90.0f);
        if (c1574h.f10190c == 0) {
            f7 = 0.0f;
        } else {
            f7 = ((this.f11147l / (AbstractC1951m4.f11530e / 2)) * 57.29578f) / 2.0f;
        }
        AbstractC1951m4.m3145e(interfaceC1570d, floatValue3 + f7, Math.max(abs, 0.1f), this.f11148m, c1574h);
        return C1694m.f10482a;
    }
}
