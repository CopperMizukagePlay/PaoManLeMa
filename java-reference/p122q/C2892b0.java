package p122q;

import p047f6.C1548c;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.b0 */
/* loaded from: classes.dex */
public final class C2892b0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f15100f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC2907g0 f15101g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2892b0(AbstractC2907g0 abstractC2907g0, int i7) {
        super(0);
        this.f15100f = i7;
        this.f15101g = abstractC2907g0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f15100f) {
            case 0:
                C1548c c1548c = this.f15101g.f15154y;
                if (c1548c != null) {
                    c1548c.mo2505v(C2930o.f15239a);
                }
                return C1694m.f10482a;
            default:
                return Boolean.valueOf(!this.f15101g.mo4579U0());
        }
    }
}
