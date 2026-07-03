package p001a0;

import p060h5.C1814v;
import p087l2.C2439d0;
import p100n.AbstractC2647h;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3242x;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.t2 */
/* loaded from: classes.dex */
public final class C0080t2 implements InterfaceC3242x {

    /* renamed from: a */
    public final C0048l2 f387a;

    /* renamed from: b */
    public final int f388b;

    /* renamed from: c */
    public final C2439d0 f389c;

    /* renamed from: d */
    public final InterfaceC3277a f390d;

    public C0080t2(C0048l2 c0048l2, int i7, C2439d0 c2439d0, InterfaceC3277a interfaceC3277a) {
        this.f387a = c0048l2;
        this.f388b = i7;
        this.f389c = c2439d0;
        this.f390d = interfaceC3277a;
    }

    @Override // p146t1.InterfaceC3242x
    /* renamed from: d */
    public final InterfaceC3220m0 mo25d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(C3091a.m4753a(j6, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(mo4918e.f16054f, C3091a.m4759g(j6));
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, min, C1814v.f10861e, new C0003a1(interfaceC3223n0, this, mo4918e, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080t2)) {
            return false;
        }
        C0080t2 c0080t2 = (C0080t2) obj;
        if (AbstractC3367j.m5096a(this.f387a, c0080t2.f387a) && this.f388b == c0080t2.f388b && AbstractC3367j.m5096a(this.f389c, c0080t2.f389c) && AbstractC3367j.m5096a(this.f390d, c0080t2.f390d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f390d.hashCode() + ((this.f389c.hashCode() + AbstractC2647h.m4255a(this.f388b, this.f387a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f387a + ", cursorOffset=" + this.f388b + ", transformedText=" + this.f389c + ", textLayoutResultProvider=" + this.f390d + ')';
    }
}
