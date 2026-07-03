package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fn */
/* loaded from: classes.dex */
public final class C0877fn {

    /* renamed from: a */
    public final String f4045a;

    /* renamed from: b */
    public final String f4046b;

    public C0877fn(String str, String str2) {
        AbstractC3367j.m5100e(str, "address");
        this.f4045a = str;
        this.f4046b = str2;
    }

    /* renamed from: a */
    public final String m1527a() {
        return AbstractC1249rm.m2269k0(this.f4045a) + " (" + this.f4046b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0877fn)) {
            return false;
        }
        C0877fn c0877fn = (C0877fn) obj;
        if (AbstractC3367j.m5096a(this.f4045a, c0877fn.f4045a) && AbstractC3367j.m5096a(this.f4046b, c0877fn.f4046b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4046b.hashCode() + (this.f4045a.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedTargetOption(address=" + this.f4045a + ", family=" + this.f4046b + ")";
    }
}
