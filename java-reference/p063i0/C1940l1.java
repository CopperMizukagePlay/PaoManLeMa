package p063i0;

import p053g5.C1694m;
import p071j0.C2146q;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.l1 */
/* loaded from: classes.dex */
public final class C1940l1 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11466f;

    /* renamed from: g */
    public final /* synthetic */ C2146q f11467g;

    /* renamed from: h */
    public final /* synthetic */ C3376s f11468h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1940l1(C2146q c2146q, C3376s c3376s, int i7) {
        super(2);
        this.f11466f = i7;
        this.f11467g = c2146q;
        this.f11468h = c3376s;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11466f) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                this.f11467g.m3483a(floatValue, ((Number) obj2).floatValue());
                this.f11468h.f16448e = floatValue;
                return C1694m.f10482a;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                this.f11467g.m3483a(floatValue2, ((Number) obj2).floatValue());
                this.f11468h.f16448e = floatValue2;
                return C1694m.f10482a;
        }
    }
}
