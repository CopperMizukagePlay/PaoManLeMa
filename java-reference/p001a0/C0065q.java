package p001a0;

import p053g5.C1694m;
import p056h0.C1732f;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3368k;
import p160v.InterfaceC3413h0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.q */
/* loaded from: classes.dex */
public final class C0065q extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f325f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f326g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0065q(InterfaceC2425y0 interfaceC2425y0, int i7) {
        super(0);
        this.f325f = i7;
        this.f326g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f325f) {
            case 0:
                Boolean bool = (Boolean) this.f326g.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                return (C1732f) this.f326g.getValue();
            case 2:
                InterfaceC2425y0 interfaceC2425y0 = this.f326g;
                C1694m c1694m = C1694m.f10482a;
                interfaceC2425y0.setValue(c1694m);
                return c1694m;
            case 3:
                return new C3320h((InterfaceC3279c) this.f326g.getValue());
            default:
                return (InterfaceC3413h0) ((InterfaceC3277a) this.f326g.getValue()).mo52a();
        }
    }
}
