package p177x0;

import p001a0.AbstractC0094y0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.l */
/* loaded from: classes.dex */
public final class C3804l implements InterfaceC3810r {

    /* renamed from: a */
    public final InterfaceC3810r f17987a;

    /* renamed from: b */
    public final InterfaceC3810r f17988b;

    public C3804l(InterfaceC3810r interfaceC3810r, InterfaceC3810r interfaceC3810r2) {
        this.f17987a = interfaceC3810r;
        this.f17988b = interfaceC3810r2;
    }

    @Override // p177x0.InterfaceC3810r
    /* renamed from: a */
    public final boolean mo5827a(InterfaceC3279c interfaceC3279c) {
        if (this.f17987a.mo5827a(interfaceC3279c) && this.f17988b.mo5827a(interfaceC3279c)) {
            return true;
        }
        return false;
    }

    @Override // p177x0.InterfaceC3810r
    /* renamed from: b */
    public final Object mo5828b(Object obj, InterfaceC3281e interfaceC3281e) {
        return this.f17988b.mo5828b(this.f17987a.mo5828b(obj, interfaceC3281e), interfaceC3281e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3804l) {
            C3804l c3804l = (C3804l) obj;
            if (AbstractC3367j.m5096a(this.f17987a, c3804l.f17987a) && AbstractC3367j.m5096a(this.f17988b, c3804l.f17988b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17988b.hashCode() * 31) + this.f17987a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("["), (String) mo5828b("", C3803k.f17986f), ']');
    }
}
