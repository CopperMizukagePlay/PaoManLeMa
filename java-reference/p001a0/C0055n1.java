package p001a0;

import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.n1 */
/* loaded from: classes.dex */
public final class C0055n1 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f274f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0071r1 f275g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0055n1(InterfaceC0071r1 interfaceC0071r1, int i7) {
        super(0);
        this.f274f = i7;
        this.f275g = interfaceC0071r1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f274f) {
            case 0:
                this.f275g.mo161a();
                return C1694m.f10482a;
            default:
                this.f275g.onCancel();
                return C1694m.f10482a;
        }
    }
}
