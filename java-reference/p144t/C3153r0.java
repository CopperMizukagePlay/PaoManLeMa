package p144t;

import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.r0 */
/* loaded from: classes.dex */
public final class C3153r0 implements InterfaceC3159u0 {

    /* renamed from: a */
    public final InterfaceC3159u0 f15834a;

    /* renamed from: b */
    public final InterfaceC3159u0 f15835b;

    public C3153r0(InterfaceC3159u0 interfaceC3159u0, InterfaceC3159u0 interfaceC3159u02) {
        this.f15834a = interfaceC3159u0;
        this.f15835b = interfaceC3159u02;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: a */
    public final int mo3478a(InterfaceC3093c interfaceC3093c) {
        return Math.max(this.f15834a.mo3478a(interfaceC3093c), this.f15835b.mo3478a(interfaceC3093c));
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: b */
    public final int mo3479b(InterfaceC3093c interfaceC3093c) {
        return Math.max(this.f15834a.mo3479b(interfaceC3093c), this.f15835b.mo3479b(interfaceC3093c));
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: c */
    public final int mo3480c(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        return Math.max(this.f15834a.mo3480c(interfaceC3093c, enumC3103m), this.f15835b.mo3480c(interfaceC3093c, enumC3103m));
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: d */
    public final int mo3481d(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        return Math.max(this.f15834a.mo3481d(interfaceC3093c, enumC3103m), this.f15835b.mo3481d(interfaceC3093c, enumC3103m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3153r0)) {
            return false;
        }
        C3153r0 c3153r0 = (C3153r0) obj;
        if (AbstractC3367j.m5096a(c3153r0.f15834a, this.f15834a) && AbstractC3367j.m5096a(c3153r0.f15835b, this.f15835b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15835b.hashCode() * 31) + this.f15834a.hashCode();
    }

    public final String toString() {
        return "(" + this.f15834a + " ∪ " + this.f15835b + ')';
    }
}
