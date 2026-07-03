package p034e0;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.p */
/* loaded from: classes.dex */
public final class C0623p {

    /* renamed from: a */
    public final C0621o f2065a;

    /* renamed from: b */
    public final C0621o f2066b;

    /* renamed from: c */
    public final boolean f2067c;

    public C0623p(C0621o c0621o, C0621o c0621o2, boolean z7) {
        this.f2065a = c0621o;
        this.f2066b = c0621o2;
        this.f2067c = z7;
    }

    /* renamed from: a */
    public static C0623p m1294a(C0623p c0623p, C0621o c0621o, C0621o c0621o2, boolean z7, int i7) {
        if ((i7 & 1) != 0) {
            c0621o = c0623p.f2065a;
        }
        if ((i7 & 2) != 0) {
            c0621o2 = c0623p.f2066b;
        }
        c0623p.getClass();
        return new C0623p(c0621o, c0621o2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0623p)) {
            return false;
        }
        C0623p c0623p = (C0623p) obj;
        if (AbstractC3367j.m5096a(this.f2065a, c0623p.f2065a) && AbstractC3367j.m5096a(this.f2066b, c0623p.f2066b) && this.f2067c == c0623p.f2067c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2067c) + ((this.f2066b.hashCode() + (this.f2065a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f2065a + ", end=" + this.f2066b + ", handlesCrossed=" + this.f2067c + ')';
    }
}
