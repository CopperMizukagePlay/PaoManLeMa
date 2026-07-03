package p061h6;

import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p098m5.InterfaceC2584d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.t */
/* loaded from: classes.dex */
public final class C1838t implements InterfaceC2313c, InterfaceC2584d {

    /* renamed from: e */
    public final InterfaceC2313c f10905e;

    /* renamed from: f */
    public final InterfaceC2318h f10906f;

    public C1838t(InterfaceC2313c interfaceC2313c, InterfaceC2318h interfaceC2318h) {
        this.f10905e = interfaceC2313c;
        this.f10906f = interfaceC2318h;
    }

    @Override // p098m5.InterfaceC2584d
    /* renamed from: g */
    public final InterfaceC2584d mo1215g() {
        InterfaceC2313c interfaceC2313c = this.f10905e;
        if (interfaceC2313c instanceof InterfaceC2584d) {
            return (InterfaceC2584d) interfaceC2313c;
        }
        return null;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f10906f;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        this.f10905e.mo663n(obj);
    }
}
