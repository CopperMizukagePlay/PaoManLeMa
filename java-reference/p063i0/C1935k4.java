package p063i0;

import p027d1.C0467e;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p085l0.InterfaceC2390n2;
import p100n.C2642f0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.k4 */
/* loaded from: classes.dex */
public final class C1935k4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11424f;

    /* renamed from: g */
    public final /* synthetic */ float f11425g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2390n2 f11426h;

    /* renamed from: i */
    public final /* synthetic */ long f11427i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2390n2 f11428j;

    /* renamed from: k */
    public final /* synthetic */ long f11429k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2390n2 f11430l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2390n2 f11431m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1935k4(int i7, float f7, C2642f0 c2642f0, long j6, C2642f0 c2642f02, long j7, C2642f0 c2642f03, C2642f0 c2642f04) {
        super(1);
        this.f11424f = i7;
        this.f11425g = f7;
        this.f11426h = c2642f0;
        this.f11427i = j6;
        this.f11428j = c2642f02;
        this.f11429k = j7;
        this.f11430l = c2642f03;
        this.f11431m = c2642f04;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float f7;
        float f8;
        float f9;
        InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
        float m1024b = C0467e.m1024b(interfaceC1570d.mo2546c());
        int i7 = this.f11424f;
        float f10 = this.f11425g;
        if (i7 != 0 && C0467e.m1024b(interfaceC1570d.mo2546c()) <= C0467e.m1026d(interfaceC1570d.mo2546c())) {
            f10 += interfaceC1570d.mo4524v0(m1024b);
        }
        float mo4524v0 = f10 / interfaceC1570d.mo4524v0(C0467e.m1026d(interfaceC1570d.mo2546c()));
        InterfaceC2390n2 interfaceC2390n2 = this.f11426h;
        float f11 = 1.0f;
        if (((Number) interfaceC2390n2.getValue()).floatValue() < 1.0f - mo4524v0) {
            if (((Number) interfaceC2390n2.getValue()).floatValue() > 0.0f) {
                f9 = ((Number) interfaceC2390n2.getValue()).floatValue() + mo4524v0;
            } else {
                f9 = 0.0f;
            }
            AbstractC1951m4.m3144d(interfaceC1570d, f9, 1.0f, this.f11427i, m1024b, this.f11424f);
        }
        float floatValue = ((Number) interfaceC2390n2.getValue()).floatValue();
        InterfaceC2390n2 interfaceC2390n22 = this.f11428j;
        if (floatValue - ((Number) interfaceC2390n22.getValue()).floatValue() > 0.0f) {
            AbstractC1951m4.m3144d(interfaceC1570d, ((Number) interfaceC2390n2.getValue()).floatValue(), ((Number) interfaceC2390n22.getValue()).floatValue(), this.f11429k, m1024b, this.f11424f);
        }
        float floatValue2 = ((Number) interfaceC2390n22.getValue()).floatValue();
        InterfaceC2390n2 interfaceC2390n23 = this.f11430l;
        if (floatValue2 > mo4524v0) {
            if (((Number) interfaceC2390n23.getValue()).floatValue() > 0.0f) {
                f7 = ((Number) interfaceC2390n23.getValue()).floatValue() + mo4524v0;
            } else {
                f7 = 0.0f;
            }
            if (((Number) interfaceC2390n22.getValue()).floatValue() < 1.0f) {
                f8 = ((Number) interfaceC2390n22.getValue()).floatValue() - mo4524v0;
            } else {
                f8 = 1.0f;
            }
            AbstractC1951m4.m3144d(interfaceC1570d, f7, f8, this.f11427i, m1024b, this.f11424f);
        }
        float floatValue3 = ((Number) interfaceC2390n23.getValue()).floatValue();
        InterfaceC2390n2 interfaceC2390n24 = this.f11431m;
        if (floatValue3 - ((Number) interfaceC2390n24.getValue()).floatValue() > 0.0f) {
            AbstractC1951m4.m3144d(interfaceC1570d, ((Number) interfaceC2390n23.getValue()).floatValue(), ((Number) interfaceC2390n24.getValue()).floatValue(), this.f11429k, m1024b, this.f11424f);
        }
        if (((Number) interfaceC2390n24.getValue()).floatValue() > mo4524v0) {
            if (((Number) interfaceC2390n24.getValue()).floatValue() < 1.0f) {
                f11 = ((Number) interfaceC2390n24.getValue()).floatValue() - mo4524v0;
            }
            AbstractC1951m4.m3144d(interfaceC1570d, 0.0f, f11, this.f11427i, m1024b, this.f11424f);
        }
        return C1694m.f10482a;
    }
}
