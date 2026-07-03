package p034e0;

import p050g2.C1598l0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p168w.C3619d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.t */
/* loaded from: classes.dex */
public final class C0631t extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f2089f = 1;

    /* renamed from: g */
    public final /* synthetic */ int f2090g;

    /* renamed from: h */
    public final /* synthetic */ Object f2091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0631t(int i7, InterfaceC3277a interfaceC3277a) {
        super(0);
        this.f2090g = i7;
        this.f2091h = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f2089f) {
            case 0:
                return Integer.valueOf(((C1598l0) ((C0619n) this.f2091h).f2038e).m2578e(this.f2090g));
            default:
                return new C3619d(this.f2090g, 0.0f, (InterfaceC3277a) this.f2091h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0631t(C0619n c0619n, int i7) {
        super(0);
        this.f2091h = c0619n;
        this.f2090g = i7;
    }
}
