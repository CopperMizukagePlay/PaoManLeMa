package p039e5;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.q */
/* loaded from: classes.dex */
public final class C1195q {

    /* renamed from: a */
    public final C1102n f6957a;

    /* renamed from: b */
    public final long f6958b;

    /* renamed from: c */
    public final long f6959c;

    public C1195q(C1102n c1102n, long j6, long j7) {
        AbstractC3367j.m5100e(c1102n, "donor");
        this.f6957a = c1102n;
        this.f6958b = j6;
        this.f6959c = j7;
    }

    /* renamed from: a */
    public final String m2085a() {
        return this.f6957a.f6127a + ":" + this.f6958b + ":" + this.f6959c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1195q)) {
            return false;
        }
        C1195q c1195q = (C1195q) obj;
        if (AbstractC3367j.m5096a(this.f6957a, c1195q.f6957a) && this.f6958b == c1195q.f6958b && this.f6959c == c1195q.f6959c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6959c) + AbstractC2487d.m4039c(this.f6957a.hashCode() * 31, 31, this.f6958b);
    }

    public final String toString() {
        return "TailHedge(donor=" + this.f6957a + ", start=" + this.f6958b + ", end=" + this.f6959c + ")";
    }
}
