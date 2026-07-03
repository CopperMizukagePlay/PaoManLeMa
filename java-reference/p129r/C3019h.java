package p129r;

import p053g5.C1694m;
import p085l0.C2361g1;
import p100n.C2653j;
import p122q.InterfaceC2958x0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r.h */
/* loaded from: classes.dex */
public final class C3019h extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f15565f;

    /* renamed from: g */
    public final /* synthetic */ float f15566g;

    /* renamed from: h */
    public final /* synthetic */ C3376s f15567h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2958x0 f15568i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f15569j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3019h(float f7, C3376s c3376s, InterfaceC2958x0 interfaceC2958x0, InterfaceC3279c interfaceC3279c, int i7) {
        super(1);
        this.f15565f = i7;
        this.f15566g = f7;
        this.f15567h = c3376s;
        this.f15568i = interfaceC2958x0;
        this.f15569j = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f15565f) {
            case 0:
                C2653j c2653j = (C2653j) obj;
                C2361g1 c2361g1 = c2653j.f14336e;
                float abs = Math.abs(((Number) c2361g1.getValue()).floatValue());
                float f7 = this.f15566g;
                float abs2 = Math.abs(f7);
                InterfaceC3279c interfaceC3279c = this.f15569j;
                InterfaceC2958x0 interfaceC2958x0 = this.f15568i;
                C3376s c3376s = this.f15567h;
                if (abs >= abs2) {
                    float m4715c = AbstractC3021j.m4715c(((Number) c2361g1.getValue()).floatValue(), f7);
                    float f8 = m4715c - c3376s.f16448e;
                    float mo4566a = interfaceC2958x0.mo4566a(f8);
                    interfaceC3279c.mo23f(Float.valueOf(mo4566a));
                    if (Math.abs(f8 - mo4566a) > 0.5f) {
                        c2653j.m4260a();
                    }
                    c2653j.m4260a();
                    c3376s.f16448e = m4715c;
                } else {
                    float floatValue = ((Number) c2361g1.getValue()).floatValue() - c3376s.f16448e;
                    float mo4566a2 = interfaceC2958x0.mo4566a(floatValue);
                    interfaceC3279c.mo23f(Float.valueOf(mo4566a2));
                    if (Math.abs(floatValue - mo4566a2) > 0.5f) {
                        c2653j.m4260a();
                    }
                    c3376s.f16448e = ((Number) c2361g1.getValue()).floatValue();
                }
                return C1694m.f10482a;
            default:
                C2653j c2653j2 = (C2653j) obj;
                float m4715c2 = AbstractC3021j.m4715c(((Number) c2653j2.f14336e.getValue()).floatValue(), this.f15566g);
                C3376s c3376s2 = this.f15567h;
                float f9 = m4715c2 - c3376s2.f16448e;
                float mo4566a3 = this.f15568i.mo4566a(f9);
                this.f15569j.mo23f(Float.valueOf(mo4566a3));
                if (Math.abs(f9 - mo4566a3) > 0.5f || m4715c2 != ((Number) c2653j2.f14336e.getValue()).floatValue()) {
                    c2653j2.m4260a();
                }
                c3376s2.f16448e += mo4566a3;
                return C1694m.f10482a;
        }
    }
}
