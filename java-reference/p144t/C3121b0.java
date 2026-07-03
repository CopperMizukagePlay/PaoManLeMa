package p144t;

import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.b0 */
/* loaded from: classes.dex */
public final class C3121b0 implements InterfaceC3135i0 {

    /* renamed from: a */
    public final InterfaceC3159u0 f15754a;

    /* renamed from: b */
    public final InterfaceC3093c f15755b;

    public C3121b0(InterfaceC3159u0 interfaceC3159u0, InterfaceC3093c interfaceC3093c) {
        this.f15754a = interfaceC3159u0;
        this.f15755b = interfaceC3093c;
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: a */
    public final float mo4824a() {
        InterfaceC3159u0 interfaceC3159u0 = this.f15754a;
        InterfaceC3093c interfaceC3093c = this.f15755b;
        return interfaceC3093c.mo4522t0(interfaceC3159u0.mo3478a(interfaceC3093c));
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: b */
    public final float mo4825b() {
        InterfaceC3159u0 interfaceC3159u0 = this.f15754a;
        InterfaceC3093c interfaceC3093c = this.f15755b;
        return interfaceC3093c.mo4522t0(interfaceC3159u0.mo3479b(interfaceC3093c));
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: c */
    public final float mo4826c(EnumC3103m enumC3103m) {
        InterfaceC3159u0 interfaceC3159u0 = this.f15754a;
        InterfaceC3093c interfaceC3093c = this.f15755b;
        return interfaceC3093c.mo4522t0(interfaceC3159u0.mo3480c(interfaceC3093c, enumC3103m));
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: d */
    public final float mo4827d(EnumC3103m enumC3103m) {
        InterfaceC3159u0 interfaceC3159u0 = this.f15754a;
        InterfaceC3093c interfaceC3093c = this.f15755b;
        return interfaceC3093c.mo4522t0(interfaceC3159u0.mo3481d(interfaceC3093c, enumC3103m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3121b0)) {
            return false;
        }
        C3121b0 c3121b0 = (C3121b0) obj;
        if (AbstractC3367j.m5096a(this.f15754a, c3121b0.f15754a) && AbstractC3367j.m5096a(this.f15755b, c3121b0.f15755b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15755b.hashCode() + (this.f15754a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f15754a + ", density=" + this.f15755b + ')';
    }
}
