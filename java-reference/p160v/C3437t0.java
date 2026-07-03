package p160v;

import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.t0 */
/* loaded from: classes.dex */
public final class C3437t0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f16617f;

    /* renamed from: g */
    public final /* synthetic */ C3441v0 f16618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3437t0(C3441v0 c3441v0, int i7) {
        super(0);
        this.f16617f = i7;
        this.f16618g = c3441v0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f16617f) {
            case 0:
                C3441v0 c3441v0 = this.f16618g;
                return Float.valueOf(c3441v0.f16625t.mo5040a() - c3441v0.f16625t.mo5044e());
            case 1:
                return Float.valueOf(this.f16618g.f16625t.mo5041b());
            default:
                return Float.valueOf(this.f16618g.f16625t.mo5045f());
        }
    }
}
