package p039e5;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.mt */
/* loaded from: classes.dex */
public final class C1101mt {

    /* renamed from: a */
    public final int f6124a;

    /* renamed from: b */
    public final long f6125b;

    /* renamed from: c */
    public final long f6126c;

    public C1101mt(int i7, long j6, long j7) {
        this.f6124a = i7;
        this.f6125b = j6;
        this.f6126c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101mt)) {
            return false;
        }
        C1101mt c1101mt = (C1101mt) obj;
        if (this.f6124a == c1101mt.f6124a && this.f6125b == c1101mt.f6125b && this.f6126c == c1101mt.f6126c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6126c) + AbstractC2487d.m4039c(Integer.hashCode(this.f6124a) * 31, 31, this.f6125b);
    }

    public final String toString() {
        return "TodayTrafficSummary(recordCount=" + this.f6124a + ", downloadBytes=" + this.f6125b + ", uploadBytes=" + this.f6126c + ")";
    }
}
