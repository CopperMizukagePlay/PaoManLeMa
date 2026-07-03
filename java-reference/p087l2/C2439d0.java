package p087l2;

import p050g2.C1587g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.d0 */
/* loaded from: classes.dex */
public final class C2439d0 {

    /* renamed from: a */
    public final C1587g f13685a;

    /* renamed from: b */
    public final InterfaceC2453q f13686b;

    public C2439d0(C1587g c1587g, InterfaceC2453q interfaceC2453q) {
        this.f13685a = c1587g;
        this.f13686b = interfaceC2453q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2439d0)) {
            return false;
        }
        C2439d0 c2439d0 = (C2439d0) obj;
        if (AbstractC3367j.m5096a(this.f13685a, c2439d0.f13685a) && AbstractC3367j.m5096a(this.f13686b, c2439d0.f13686b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13686b.hashCode() + (this.f13685a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f13685a) + ", offsetMapping=" + this.f13686b + ')';
    }
}
