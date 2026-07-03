package p087l2;

import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.v */
/* loaded from: classes.dex */
public final class C2458v implements InterfaceC2443g {

    /* renamed from: a */
    public final int f13721a;

    /* renamed from: b */
    public final int f13722b;

    public C2458v(int i7, int i8) {
        this.f13721a = i7;
        this.f13722b = i8;
    }

    @Override // p087l2.InterfaceC2443g
    /* renamed from: a */
    public final void mo786a(C2444h c2444h) {
        int m3530q = AbstractC2168e.m3530q(this.f13721a, 0, c2444h.f13692a.m3262b());
        int m3530q2 = AbstractC2168e.m3530q(this.f13722b, 0, c2444h.f13692a.m3262b());
        if (m3530q < m3530q2) {
            c2444h.m4017f(m3530q, m3530q2);
        } else {
            c2444h.m4017f(m3530q2, m3530q);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2458v)) {
            return false;
        }
        C2458v c2458v = (C2458v) obj;
        if (this.f13721a == c2458v.f13721a && this.f13722b == c2458v.f13722b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13721a * 31) + this.f13722b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f13721a);
        sb.append(", end=");
        return AbstractC2487d.m4045i(sb, this.f13722b, ')');
    }
}
