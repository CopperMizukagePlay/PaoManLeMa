package p039e5;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p063i0.C1956n1;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.c5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0764c5 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f2985e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC0516a0 f2986f;

    /* renamed from: g */
    public final /* synthetic */ C1956n1 f2987g;

    public /* synthetic */ C0764c5(InterfaceC0516a0 interfaceC0516a0, C1956n1 c1956n1, int i7) {
        this.f2985e = i7;
        this.f2986f = interfaceC0516a0;
        this.f2987g = c1956n1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f2985e) {
            case 0:
                AbstractC0525d0.m1141s(this.f2986f, null, new C0796d5(this.f2987g, null, 0), 3);
                break;
            default:
                AbstractC0525d0.m1141s(this.f2986f, null, new C0796d5(this.f2987g, null, 1), 3);
                break;
        }
        return C1694m.f10482a;
    }
}
