package p144t;

import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.v */
/* loaded from: classes.dex */
public final class C3160v implements InterfaceC3159u0 {

    /* renamed from: a */
    public final InterfaceC3159u0 f15844a;

    /* renamed from: b */
    public final InterfaceC3159u0 f15845b;

    public C3160v(InterfaceC3159u0 interfaceC3159u0, InterfaceC3159u0 interfaceC3159u02) {
        this.f15844a = interfaceC3159u0;
        this.f15845b = interfaceC3159u02;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: a */
    public final int mo3478a(InterfaceC3093c interfaceC3093c) {
        int mo3478a = this.f15844a.mo3478a(interfaceC3093c) - this.f15845b.mo3478a(interfaceC3093c);
        if (mo3478a < 0) {
            return 0;
        }
        return mo3478a;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: b */
    public final int mo3479b(InterfaceC3093c interfaceC3093c) {
        int mo3479b = this.f15844a.mo3479b(interfaceC3093c) - this.f15845b.mo3479b(interfaceC3093c);
        if (mo3479b < 0) {
            return 0;
        }
        return mo3479b;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: c */
    public final int mo3480c(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        int mo3480c = this.f15844a.mo3480c(interfaceC3093c, enumC3103m) - this.f15845b.mo3480c(interfaceC3093c, enumC3103m);
        if (mo3480c < 0) {
            return 0;
        }
        return mo3480c;
    }

    @Override // p144t.InterfaceC3159u0
    /* renamed from: d */
    public final int mo3481d(InterfaceC3093c interfaceC3093c, EnumC3103m enumC3103m) {
        int mo3481d = this.f15844a.mo3481d(interfaceC3093c, enumC3103m) - this.f15845b.mo3481d(interfaceC3093c, enumC3103m);
        if (mo3481d < 0) {
            return 0;
        }
        return mo3481d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3160v)) {
            return false;
        }
        C3160v c3160v = (C3160v) obj;
        if (AbstractC3367j.m5096a(c3160v.f15844a, this.f15844a) && AbstractC3367j.m5096a(c3160v.f15845b, this.f15845b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15845b.hashCode() + (this.f15844a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f15844a + " - " + this.f15845b + ')';
    }
}
