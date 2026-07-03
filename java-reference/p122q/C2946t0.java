package p122q;

import p053g5.C1694m;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.t0 */
/* loaded from: classes.dex */
public final class C2946t0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f15282f;

    /* renamed from: g */
    public final /* synthetic */ C3376s f15283g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2958x0 f15284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2946t0(C3376s c3376s, InterfaceC2958x0 interfaceC2958x0, int i7) {
        super(2);
        this.f15282f = i7;
        this.f15283g = c3376s;
        this.f15284h = interfaceC2958x0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f15282f) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                C3376s c3376s = this.f15283g;
                float f7 = c3376s.f16448e;
                c3376s.f16448e = this.f15284h.mo4566a(floatValue - f7) + f7;
                return C1694m.f10482a;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                C3376s c3376s2 = this.f15283g;
                c3376s2.f16448e += this.f15284h.mo4566a(floatValue2 - c3376s2.f16448e);
                return C1694m.f10482a;
        }
    }
}
