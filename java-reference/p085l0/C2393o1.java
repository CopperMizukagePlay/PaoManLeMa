package p085l0;

import p032d6.InterfaceC0516a0;
import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.o1 */
/* loaded from: classes.dex */
public final class C2393o1 implements InterfaceC2425y0, InterfaceC0516a0 {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2425y0 f13465e;

    /* renamed from: f */
    public final InterfaceC2318h f13466f;

    public C2393o1(InterfaceC2425y0 interfaceC2425y0, InterfaceC2318h interfaceC2318h) {
        this.f13465e = interfaceC2425y0;
        this.f13466f = interfaceC2318h;
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        return this.f13465e.getValue();
    }

    @Override // p032d6.InterfaceC0516a0
    /* renamed from: i */
    public final InterfaceC2318h mo1107i() {
        return this.f13466f;
    }

    @Override // p085l0.InterfaceC2425y0
    public final void setValue(Object obj) {
        this.f13465e.setValue(obj);
    }
}
