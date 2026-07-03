package p039e5;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cu */
/* loaded from: classes.dex */
public final class C0789cu {

    /* renamed from: a */
    public final long f3216a;

    /* renamed from: b */
    public final long f3217b;

    /* renamed from: c */
    public final long f3218c;

    public C0789cu(long j6, long j7, long j8, int i7) {
        j6 = (i7 & 1) != 0 ? 0L : j6;
        j7 = (i7 & 2) != 0 ? 0L : j7;
        j8 = (i7 & 4) != 0 ? 0L : j8;
        this.f3216a = j6;
        this.f3217b = j7;
        this.f3218c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0789cu)) {
            return false;
        }
        C0789cu c0789cu = (C0789cu) obj;
        if (this.f3216a == c0789cu.f3216a && this.f3217b == c0789cu.f3217b && this.f3218c == c0789cu.f3218c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3218c) + AbstractC2487d.m4039c(Long.hashCode(this.f3216a) * 31, 31, this.f3217b);
    }

    public final String toString() {
        return "TrafficStopConfig(downloadBytes=" + this.f3216a + ", uploadBytes=" + this.f3217b + ", totalBytes=" + this.f3218c + ")";
    }
}
