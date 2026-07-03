package p144t;

import p150t5.InterfaceC3279c;
import p154u1.InterfaceC3347c;
import p154u1.InterfaceC3351g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.t */
/* loaded from: classes.dex */
public final class C3156t implements InterfaceC3347c {

    /* renamed from: a */
    public final InterfaceC3279c f15839a;

    /* renamed from: b */
    public InterfaceC3159u0 f15840b;

    public C3156t(InterfaceC3279c interfaceC3279c) {
        this.f15839a = interfaceC3279c;
    }

    @Override // p154u1.InterfaceC3347c
    /* renamed from: c */
    public final void mo4819c(InterfaceC3351g interfaceC3351g) {
        InterfaceC3159u0 interfaceC3159u0 = (InterfaceC3159u0) interfaceC3351g.mo5084e(AbstractC3165x0.f15870a);
        if (!AbstractC3367j.m5096a(interfaceC3159u0, this.f15840b)) {
            this.f15840b = interfaceC3159u0;
            this.f15839a.mo23f(interfaceC3159u0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3156t) && ((C3156t) obj).f15839a == this.f15839a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15839a.hashCode();
    }
}
