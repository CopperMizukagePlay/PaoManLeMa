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
/* renamed from: a0.b1 */
/* loaded from: classes.dex */
public final class C0007b1 implements InterfaceC3242x {

    /* renamed from: a */
    public final C0048l2 f57a;

    /* renamed from: b */
    public final int f58b;

    /* renamed from: c */
    public final C2439d0 f59c;

    /* renamed from: d */
    public final InterfaceC3277a f60d;

    public C0007b1(C0048l2 c0048l2, int i7, C2439d0 c2439d0, InterfaceC3277a interfaceC3277a) {
        this.f57a = c0048l2;
        this.f58b = i7;
        this.f59c = c2439d0;
        this.f60d = interfaceC3277a;
    }

    @Override // p146t1.InterfaceC3242x
    /* renamed from: d */
    public final InterfaceC3220m0 mo25d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        long j7;
        if (interfaceC3214k0.mo4917c0(C3091a.m4759g(j6)) < C3091a.m4760h(j6)) {
            j7 = j6;
        } else {
            j7 = j6;
            j6 = C3091a.m4753a(j7, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
        int min = Math.min(mo4918e.f16053e, C3091a.m4760h(j7));
        return interfaceC3223n0.mo4941K(min, mo4918e.f16054f, C1814v.f10861e, new C0003a1(interfaceC3223n0, this, mo4918e, min, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0007b1)) {
            return false;
        }
        C0007b1 c0007b1 = (C0007b1) obj;
        if (AbstractC3367j.m5096a(this.f57a, c0007b1.f57a) && this.f58b == c0007b1.f58b && AbstractC3367j.m5096a(this.f59c, c0007b1.f59c) && AbstractC3367j.m5096a(this.f60d, c0007b1.f60d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f60d.hashCode() + ((this.f59c.hashCode() + AbstractC2647h.m4255a(this.f58b, this.f57a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f57a + ", cursorOffset=" + this.f58b + ", transformedText=" + this.f59c + ", textLayoutResultProvider=" + this.f60d + ')';
    }
}
