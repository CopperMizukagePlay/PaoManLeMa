package p039e5;

import p053g5.C1694m;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ee */
/* loaded from: classes.dex */
public final /* synthetic */ class C0836ee implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f3676e;

    /* renamed from: f */
    public final /* synthetic */ C2349d1 f3677f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f3678g;

    public /* synthetic */ C0836ee(InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, int i7) {
        this.f3676e = i7;
        this.f3678g = interfaceC2425y0;
        this.f3677f = c2349d1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f3676e) {
            case 0:
                this.f3677f.m3742h(0);
                this.f3678g.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f3677f.m3742h(1);
                this.f3678g.setValue(Boolean.TRUE);
                break;
            case 2:
                this.f3677f.m3742h(2);
                this.f3678g.setValue(Boolean.TRUE);
                break;
            case 3:
                this.f3678g.setValue(Boolean.FALSE);
                this.f3677f.m3742h(0);
                break;
            default:
                InterfaceC2425y0 interfaceC2425y0 = this.f3678g;
                if (!((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                    C2349d1 c2349d1 = this.f3677f;
                    c2349d1.m3742h(c2349d1.m3741g() + 1);
                    if (c2349d1.m3741g() >= 10) {
                        interfaceC2425y0.setValue(Boolean.TRUE);
                    }
                }
                return C1694m.f10482a;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C0836ee(C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f3676e = i7;
        this.f3677f = c2349d1;
        this.f3678g = interfaceC2425y0;
    }
}
