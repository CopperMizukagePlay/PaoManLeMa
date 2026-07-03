package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.y */
/* loaded from: classes.dex */
public final class C2042y {

    /* renamed from: a */
    public final long f12158a;

    /* renamed from: b */
    public final long f12159b;

    /* renamed from: c */
    public final long f12160c;

    /* renamed from: d */
    public final long f12161d;

    public C2042y(long j6, long j7, long j8, long j9) {
        this.f12158a = j6;
        this.f12159b = j7;
        this.f12160c = j8;
        this.f12161d = j9;
    }

    /* renamed from: a */
    public final C2042y m3207a(long j6, long j7, long j8, long j9) {
        long j10;
        long j11;
        long j12;
        if (j6 == 16) {
            j6 = this.f12158a;
        }
        long j13 = j6;
        if (j7 != 16) {
            j10 = j7;
        } else {
            j10 = this.f12159b;
        }
        if (j8 != 16) {
            j11 = j8;
        } else {
            j11 = this.f12160c;
        }
        if (j9 != 16) {
            j12 = j9;
        } else {
            j12 = this.f12161d;
        }
        return new C2042y(j13, j10, j11, j12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2042y)) {
            return false;
        }
        C2042y c2042y = (C2042y) obj;
        if (C0677s.m1454c(this.f12158a, c2042y.f12158a) && C0677s.m1454c(this.f12159b, c2042y.f12159b) && C0677s.m1454c(this.f12160c, c2042y.f12160c) && C0677s.m1454c(this.f12161d, c2042y.f12161d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f12161d) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f12158a) * 31, 31, this.f12159b), 31, this.f12160c);
    }
}
