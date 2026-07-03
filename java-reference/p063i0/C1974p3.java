package p063i0;

import p073j2.AbstractC2168e;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.p3 */
/* loaded from: classes.dex */
public final class C1974p3 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f11658f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f11659g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1974p3(int i7, InterfaceC3277a interfaceC3277a) {
        super(0);
        this.f11658f = i7;
        this.f11659g = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f11658f) {
            case 0:
                this.f11659g.mo52a();
                return Boolean.TRUE;
            default:
                return Float.valueOf(AbstractC2168e.m3529p(((Number) this.f11659g.mo52a()).floatValue(), 0.0f, 1.0f));
        }
    }
}
