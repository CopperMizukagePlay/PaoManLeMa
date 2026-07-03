package p144t;

import p140s2.EnumC3103m;
import p158u5.AbstractC3367j;
import p177x0.C3800h;
import p177x0.InterfaceC3796d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.u */
/* loaded from: classes.dex */
public final class C3158u {

    /* renamed from: a */
    public final InterfaceC3796d f15843a;

    public C3158u(C3800h c3800h) {
        this.f15843a = c3800h;
    }

    /* renamed from: a */
    public final int m4862a(int i7, EnumC3103m enumC3103m) {
        return this.f15843a.mo5824a(0, i7, enumC3103m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3158u) && AbstractC3367j.m5096a(this.f15843a, ((C3158u) obj).f15843a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15843a.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f15843a + ')';
    }
}
