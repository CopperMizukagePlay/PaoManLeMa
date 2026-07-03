package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.y2 */
/* loaded from: classes.dex */
public final class C2045y2 {

    /* renamed from: a */
    public final long f12169a;

    /* renamed from: b */
    public final long f12170b;

    /* renamed from: c */
    public final long f12171c;

    /* renamed from: d */
    public final long f12172d;

    /* renamed from: e */
    public final long f12173e;

    /* renamed from: f */
    public final long f12174f;

    /* renamed from: g */
    public final long f12175g;

    public C2045y2(long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f12169a = j6;
        this.f12170b = j7;
        this.f12171c = j8;
        this.f12172d = j9;
        this.f12173e = j10;
        this.f12174f = j11;
        this.f12175g = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2045y2)) {
            return false;
        }
        C2045y2 c2045y2 = (C2045y2) obj;
        if (C0677s.m1454c(this.f12169a, c2045y2.f12169a) && C0677s.m1454c(this.f12172d, c2045y2.f12172d) && C0677s.m1454c(this.f12170b, c2045y2.f12170b) && C0677s.m1454c(this.f12173e, c2045y2.f12173e) && C0677s.m1454c(this.f12171c, c2045y2.f12171c) && C0677s.m1454c(this.f12174f, c2045y2.f12174f) && C0677s.m1454c(this.f12175g, c2045y2.f12175g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f12175g) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f12169a) * 31, 31, this.f12172d), 31, this.f12170b), 31, this.f12173e), 31, this.f12171c), 31, this.f12174f);
    }
}
