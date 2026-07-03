package p069i6;

import p032d6.AbstractC0515a;
import p032d6.AbstractC0525d0;
import p065i2.AbstractC2064e;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p098m5.InterfaceC2584d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.p */
/* loaded from: classes.dex */
public class C2103p extends AbstractC0515a implements InterfaceC2584d {

    /* renamed from: h */
    public final InterfaceC2313c f12378h;

    public C2103p(InterfaceC2313c interfaceC2313c, InterfaceC2318h interfaceC2318h) {
        super(interfaceC2318h, true);
        this.f12378h = interfaceC2313c;
    }

    @Override // p032d6.C0541i1
    /* renamed from: D */
    public void mo1159D(Object obj) {
        AbstractC2088a.m3437h(AbstractC0525d0.m1143u(obj), AbstractC2064e.m3250x(this.f12378h));
    }

    @Override // p032d6.C0541i1
    /* renamed from: E */
    public void mo1171E(Object obj) {
        this.f12378h.mo663n(AbstractC0525d0.m1143u(obj));
    }

    @Override // p032d6.C0541i1
    /* renamed from: W */
    public final boolean mo1185W() {
        return true;
    }

    @Override // p098m5.InterfaceC2584d
    /* renamed from: g */
    public final InterfaceC2584d mo1215g() {
        InterfaceC2313c interfaceC2313c = this.f12378h;
        if (interfaceC2313c instanceof InterfaceC2584d) {
            return (InterfaceC2584d) interfaceC2313c;
        }
        return null;
    }
}
